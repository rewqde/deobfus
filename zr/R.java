package zr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class R {
   // $FF: synthetic field
   private static transient String fobgzKaKPf;

   public static int start(int var0, byte[] var1, Consumer<String> var2) throws IOException {
      List var3 = parse(var1);
      ArrayList var4 = new ArrayList();

      for(Frame var6 : var3) {
         if (var6.bytes.length == 84 || var6.bytes.length == 52) {
            var4.add(var6.bytes);
         }
      }

      ServerSocket var9 = new ServerSocket();
      var9.setReuseAddress(true);
      var9.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), var0));
      int var10 = var9.getLocalPort();
      int var7 = var3.isEmpty() ? 0 : ((Frame)var3.get(var3.size() - 1)).threshold;
      var2.accept("replay server: 127.0.0.1:" + var10 + " (frames=" + var3.size() + " hb=" + var4.size() + " maxThreshold=" + var7 + ")");
      Thread var8 = new Thread(() -> {
         while(true) {
            try {
               Socket var4x = var9.accept();
               Thread var5 = new Thread(() -> {
                  try {
                     handle(var4x, var3, var4, var2);
                  } catch (Exception var5) {
                     var2.accept("replay conn closed: " + String.valueOf(var5));
                  }

               }, "corz-replay-conn");
               var5.setDaemon(true);
               var5.start();
            } catch (Exception var6) {
               var2.accept("replay accept error: " + String.valueOf(var6));
               return;
            }
         }
      }, "corz-replay");
      var8.setDaemon(true);
      var8.start();
      return var10;
   }

   private static void handle(Socket var0, List<Frame> var1, List<byte[]> var2, Consumer<String> var3) throws IOException {
      var0.setTcpNoDelay(true);
      var3.accept("replay: client connected");
      InputStream var4 = var0.getInputStream();
      OutputStream var5 = var0.getOutputStream();
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      while(true) {
         byte[] var10 = readFrame(var4);
         if (var10 == null) {
            var3.accept("replay: client disconnected after " + var6 + " frames, sent " + var9);
            return;
         }

         ++var6;
         if (var6 <= 2) {
            StringBuilder var11 = new StringBuilder();
            int var12 = Math.min(var10.length, 200);

            for(int var13 = 0; var13 < var12; ++var13) {
               var11.append(String.format("%02x", var10[var13] & 255));
            }

            var3.accept("replay: <- client TX#" + var6 + " len=" + var10.length + " " + String.valueOf(var11));
         }

         int var14;
         for(var14 = 0; var7 < var1.size() && ((Frame)var1.get(var7)).threshold <= var6; ++var14) {
            var5.write(((Frame)var1.get(var7)).bytes);
            ++var7;
            ++var9;
         }

         if (var14 > 0) {
            var5.flush();
            if (var6 <= 3 || var14 > 1) {
               var3.accept("replay: -> " + var14 + " frame(s) at client TX#" + var6 + " (total " + var9 + "/" + var1.size() + ")");
            }
         }

         if (var7 >= var1.size() && !var2.isEmpty()) {
            var5.write((byte[])var2.get(var8 % var2.size()));
            var5.flush();
            ++var8;
         }
      }
   }

   private static byte[] readFrame(InputStream var0) throws IOException {
      byte[] var1 = readN(var0, 4);
      if (var1 == null) {
         return null;
      } else {
         int var2 = (var1[0] & 255) << 24 | (var1[1] & 255) << 16 | (var1[2] & 255) << 8 | var1[3] & 255;
         if (var2 >= 0 && var2 <= 16777216) {
            byte[] var3 = readN(var0, var2);
            if (var3 == null) {
               return null;
            } else {
               byte[] var4 = new byte[4 + var2];
               System.arraycopy(var1, 0, var4, 0, 4);
               System.arraycopy(var3, 0, var4, 4, var2);
               return var4;
            }
         } else {
            throw new IOException("bad frame len " + var2);
         }
      }
   }

   private static byte[] readN(InputStream var0, int var1) throws IOException {
      byte[] var2 = new byte[var1];

      int var4;
      for(int var3 = 0; var3 < var1; var3 += var4) {
         var4 = var0.read(var2, var3, var1 - var3);
         if (var4 < 0) {
            return null;
         }
      }

      return var2;
   }

   private static List<Frame> parse(byte[] var0) {
      ArrayList var1 = new ArrayList();
      ByteBuffer var2 = ByteBuffer.wrap(var0);
      int var3 = var2.getInt();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2.getInt();
         int var6 = var2.getInt();
         byte[] var7 = new byte[var6];
         var2.get(var7);
         var1.add(new Frame(var5, var7));
      }

      return var1;
   }

   private static final class Frame {
      final int threshold;
      final byte[] bytes;
      // $FF: synthetic field
      private static transient String noShcmUxer;

      Frame(int var1, byte[] var2) {
         this.threshold = var1;
         this.bytes = var2;
      }
   }
}
