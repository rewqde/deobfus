package com.corz.client;

import com.corz.client.schematic.SideRunPlanner;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public record 7V(7YJ 4, List<SideRunPlanner.Member> 8, int 6, int 9, int 7, int 0, long 3, long 5) {
   private static final long a;
   private static final long b;
   private static final Object[] c;
   private static final String[] d;
   // $FF: synthetic field
   private static transient String IGuaWuqIHO;

   public _V/* $FF was: 7V*/(7YJ var1, List var2, int var3, int var4, int var5, int var6, long var7, long var9) {
      this.4 = var1;
      this.8 = var2;
      this.6 = var3;
      this.9 = var4;
      this.7 = var5;
      this.0 = var6;
      this.3 = var7;
      this.5 = var9;
   }

   public int _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public 7YJ _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7V.class, 578);
      a = s.a(1713929153696107675L, 5521859318982602052L, MethodHandles.lookup().lookupClass()).a(98737176753486L);
      c = new Object[33];
      d = new String[33];
      a();
      long var0 = a ^ 132353807027379L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 6442577050271400533L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var7 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      b = var7;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (d[var4] != null) {
         return var4;
      } else {
         Object var5 = c[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 50;
               case 1 -> var10000 = 43;
               case 2 -> var10000 = 21;
               case 3 -> var10000 = 6;
               case 4 -> var10000 = 41;
               case 5 -> var10000 = 36;
               case 6 -> var10000 = 13;
               case 7 -> var10000 = 60;
               case 8 -> var10000 = 7;
               case 9 -> var10000 = 27;
               case 10 -> var10000 = 4;
               case 11 -> var10000 = 49;
               case 12 -> var10000 = 44;
               case 13 -> var10000 = 31;
               case 14 -> var10000 = 12;
               case 15 -> var10000 = 33;
               case 16 -> var10000 = 57;
               case 17 -> var10000 = 32;
               case 18 -> var10000 = 17;
               case 19 -> var10000 = 16;
               case 20 -> var10000 = 53;
               case 21 -> var10000 = 25;
               case 22 -> var10000 = 48;
               case 23 -> var10000 = 18;
               case 24 -> var10000 = 52;
               case 25 -> var10000 = 54;
               case 26 -> var10000 = 39;
               case 27 -> var10000 = 34;
               case 28 -> var10000 = 5;
               case 29 -> var10000 = 11;
               case 30 -> var10000 = 30;
               case 31 -> var10000 = 38;
               case 32 -> var10000 = 8;
               case 33 -> var10000 = 0;
               case 34 -> var10000 = 10;
               case 35 -> var10000 = 14;
               case 36 -> var10000 = 20;
               case 37 -> var10000 = 61;
               case 38 -> var10000 = 63;
               case 39 -> var10000 = 29;
               case 40 -> var10000 = 46;
               case 41 -> var10000 = 15;
               case 42 -> var10000 = 62;
               case 43 -> var10000 = 40;
               case 44 -> var10000 = 3;
               case 45 -> var10000 = 24;
               case 46 -> var10000 = 28;
               case 47 -> var10000 = 2;
               case 48 -> var10000 = 22;
               case 49 -> var10000 = 37;
               case 50 -> var10000 = 56;
               case 51 -> var10000 = 58;
               case 52 -> var10000 = 45;
               case 53 -> var10000 = 23;
               case 54 -> var10000 = 59;
               case 55 -> var10000 = 51;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 1;
               case 58 -> var10000 = 9;
               case 59 -> var10000 = 47;
               case 60 -> var10000 = 19;
               case 61 -> var10000 = 55;
               case 62 -> var10000 = 35;
               default -> var10000 = 42;
            }

            var6 = var10000;
            int[] var7 = new int[6];

            for(int var8 = 0; var8 < 6; ++var8) {
               int var9 = 7 * (5 - var8);
               int var10 = (int)(var0 >>> var9 & 127L);
               var10 -= var6;
               if (var10 < 0) {
                  var10 += 128;
               }

               var7[var8] = var10;
            }

            char[] var13 = ((String)var5).toCharArray();

            for(int var14 = 0; var14 < var13.length; ++var14) {
               int var16 = var7[var14 % var7.length];
               if (var16 == 0) {
                  break;
               }

               var13[var14] = (char)(var13[var14] ^ var16);
            }

            d[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = c;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      d[1] = "c";
      var10000[2] = "c";
      var10000[3] = Long.TYPE;
      d[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      d[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = "c";
      var10000[29] = "c";
      var10000[30] = "c";
      var10000[31] = "c";
      var10000[32] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = c[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(d[var4]);
            c[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field a(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static Field b(Class var0, String var1, Class var2) {
      Field var3 = a(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = b(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   private static native Field c(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method b(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = a(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = b(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = c[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = d[var4];
         int var7 = var6.indexOf(8);
         Class var8 = b(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         int var11 = -1;
         int var12 = var9;

         do {
            ++var11;
            ++var12;
         } while((var12 = var6.indexOf(8, var12)) > -1);

         int var13;
         Class[] var14 = new Class[var13 = var11 - 1];
         Class var15 = null;
         var12 = var9 + 1;

         for(int var16 = 0; var16 < var11; ++var16) {
            int var17 = var6.indexOf(8, var12);
            var15 = b(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = a(var23, var10, var15, var13, var14);
            if (var26 != null) {
               c[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("c")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = b((long)"c", 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = b(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     c[var4] = var19;
                     return var19;
                  }
               }
            }

            if (var23.getName().equals("c")) {
               StringBuffer var28 = new StringBuffer();
               var28.append("c").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
               int var29 = 0;

               while(var29 < var13) {
                  var28.append(var14[var29].getName());
                  ++var29;
                  if (var29 < var13) {
                     var28.append("c");
                  }
               }

               var28.append(')');
               throw new RuntimeException(var28.toString());
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = b((long)"c", 0L);
            }
         }
      }
   }

   private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = a(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
