package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 7Yt {
   public static final 7Yt 9;
   public static final 7Yt 4;
   public static final 7Yt 8;
   private static final 7Yt[] 2;

   private static 7Yt[] _/* $FF was: 0*/() {
      return new 7Yt[]{9, 4, 8};
   }

   static {
      long var9 = s.a(-7175176100746627619L, -1703264482561947390L, MethodHandles.lookup().lookupClass()).a(237646911467139L) ^ 125356668189812L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "%\u0096Í\u009bÚ\u0018\u0016ô\bÉ\u0011 Ôï\u000eós\bñþD pî\u007fa";
      int var7 = "%\u0096Í\u009bÚ\u0018\u0016ô\bÉ\u0011 Ôï\u000eós\bñþD pî\u007fa".length();
      char var4 = '\b';
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            9 = new 7Yt(var0[1], 0);
            4 = new 7Yt(var0[0], 1);
            8 = new 7Yt(var0[2], 2);
            2 = 0();
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = "c" & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            ++var4;
            var5 = var0[var4];
            var6 = (char)(var6 | (char)(var5 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << 12);
            ++var4;
            var5 = var0[var4];
            var12 = (char)(var12 | (char)(var5 & 63) << 6);
            ++var4;
            var5 = var0[var4];
            var12 = (char)(var12 | (char)(var5 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
