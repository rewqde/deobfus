package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class 8X {
   private static final class_310 0;
   private static boolean 0O;
   private static int 8;
   private static float 5;
   private static float 2;
   private static boolean 9;
   private static boolean 6;
   private static boolean 0p;
   private static Object 0U;
   private static float 04;
   private static float 1;
   private static boolean 0r;
   private static boolean 0T;
   private static boolean 7;
   private static boolean 0I;
   private static float 00;
   private static float 4;
   private static boolean 0t;
   private static int 3;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String dnDnWgtzZv;

   private _X/* $FF was: 8X*/() {
   }

   public static void _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 2*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".G<invokedynamic>((long)"c", var1);
   }

   public static boolean _/* $FF was: 3*/(Object[] var0) {
      int var3 = (Integer)var0[1];
      int var2 = (Integer)var0[2];
      int var1 = (Integer)var0[0];
      long var4 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;
      return "c".G<invokedynamic>((long)"c", var4);
   }

   public static boolean _/* $FF was: 7*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".G<invokedynamic>((long)"c", var1);
   }

   public static boolean _/* $FF was: 4*/(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[2];
      int var3 = (Integer)var0[1];
      long var4 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      return "c".G<invokedynamic>((long)"c", var4);
   }

   public static Object _/* $FF was: 7*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".G<invokedynamic>((long)"c", var1);
   }

   public static float _/* $FF was: 1*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".G<invokedynamic>((long)"c", var1);
   }

   public static float _/* $FF was: 0*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".G<invokedynamic>((long)"c", var1);
   }

   public static native void _/* $FF was: 5*/(Object[] var0);

   public static native void _/* $FF was: 3*/(Object[] var0);

   public static float[] _/* $FF was: 5*/(Object[] var0) {
      class_243 var1 = (class_243)var0[1];
      class_243 var4 = (class_243)var0[0];
      long var2 = (Long)var0[2];
      var2 = a ^ var2;
      int var10000 = "c".B<invokedynamic>((long)"c", var2);
      double var6 = var1.ú<invokedynamic>(var1, (long)"c", var2) - var4.ú<invokedynamic>(var4, (long)"c", var2);
      double var8 = var1.ú<invokedynamic>(var1, (long)"c", var2) - var4.ú<invokedynamic>(var4, (long)"c", var2);
      double var10 = var1.ú<invokedynamic>(var1, (long)"c", var2) - var4.ú<invokedynamic>(var4, (long)"c", var2);
      double var12 = (var6 * var6 + var10 * var10).B<invokedynamic>(var6 * var6 + var10 * var10, (long)"c", var2);
      double var10001 = (-var6).B<invokedynamic>(-var6, var10, (long)"c", var2);
      float var14 = (float)var10001.B<invokedynamic>(var10001, (long)"c", var2);
      int var5 = var10000;
      double var19 = (-var8).B<invokedynamic>(-var8, var12, (long)"c", var2);
      float var15 = (float)var19.B<invokedynamic>(var19, (long)"c", var2);

      try {
         float[] var20 = new float[]{var14.B<invokedynamic>(var14, (long)"c", var2), var15.B<invokedynamic>(var15, (float)"c", (float)"c", (long)"c", var2)};
         if ("c".B<invokedynamic>((long)"c", var2) != null) {
            ++var5;
            var5.B<invokedynamic>(var5, (long)"c", var2);
         }

         return var20;
      } catch (MatchException var16) {
         throw var16.B<invokedynamic>(var16, (long)"c", var2);
      }
   }

   public static class_243 _/* $FF was: 3*/(Object[] var0) {
      long var1 = (Long)var0[0];
      float var3 = (Float)var0[2];
      float var4 = (Float)var0[1];
      var1 = a ^ var1;
      float var5 = -var4 * "c" - "c";
      float var6 = -var3 * "c";
      float var7 = ((double)var5).B<invokedynamic>((double)var5, (long)"c", var1);
      float var8 = ((double)var5).B<invokedynamic>((double)var5, (long)"c", var1);
      float var9 = -((double)var6).B<invokedynamic>((double)var6, (long)"c", var1);
      float var10 = ((double)var6).B<invokedynamic>((double)var6, (long)"c", var1);
      return new class_243((double)(var8 * var9), (double)var10, (double)(var7 * var9));
   }

   public static class_243 _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(8X.class, 728);
      a = s.a(-3310865232093982854L, -5468357347611869744L, MethodHandles.lookup().lookupClass()).a(224092835002589L);
      long var11 = a ^ 8066954905346L;
      e = new Object[68];
      f = new String[68];
      a();
      d = new HashMap(13);
      0.B<invokedynamic>(0, 4171452057145437837L, var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u009fAìÏ\u000blAÑjàgè\u0093×ª\u0003\u0003\u0092u«úyÞÚò\u008e9Y\u0003\u0007\u0002¤";
      int var5 = "\u009fAìÏ\u000blAÑjàgè\u0093×ª\u0003\u0003\u0092u«úyÞÚò\u008e9Y\u0003\u0007\u0002¤".length();
      int var2 = 0;

      label23:
      while(true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var14 = var6;
         var10001 = var3++;
         long var17 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var19 = -1;

         while(true) {
            long var8 = var17;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var21 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var2 >= var5) {
                     b = var6;
                     c = new Integer[6];
                     0 = 4172878282635389120L.B<invokedynamic>(4172878282635389120L, var11);
                     true.g<invokedynamic>(17236, 6438717427331124888L ^ var11).ò<invokedynamic>(true.g<invokedynamic>(17236, 6438717427331124888L ^ var11), 4172711216006823530L, var11);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var2 < var5) {
                     continue label23;
                  }

                  var4 = "Æ±\u0000N\u0088¢\u009d}ÎF´·ÓÛA\u000b";
                  var5 = "Æ±\u0000N\u0088¢\u009d}ÎF´·ÓÛA\u000b".length();
                  var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var14 = var6;
            var10001 = var3++;
            var17 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var19 = 0;
         }
      }
   }

   public static void _/* $FF was: 6*/(int var0) {
      3 = var0;
   }

   public static int _/* $FF was: 6*/() {
      return 3;
   }

   public static int _/* $FF was: 2*/() {
      int var0 = 6();
      return var0 == 0 ? 56 : 0;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f[var4] != null) {
         return var4;
      } else {
         Object var5 = e[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 41;
               case 1 -> var10000 = 17;
               case 2 -> var10000 = 50;
               case 3 -> var10000 = 4;
               case 4 -> var10000 = 27;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 43;
               case 7 -> var10000 = 49;
               case 8 -> var10000 = 20;
               case 9 -> var10000 = 42;
               case 10 -> var10000 = 6;
               case 11 -> var10000 = 22;
               case 12 -> var10000 = 18;
               case 13 -> var10000 = 36;
               case 14 -> var10000 = 26;
               case 15 -> var10000 = 59;
               case 16 -> var10000 = 45;
               case 17 -> var10000 = 52;
               case 18 -> var10000 = 5;
               case 19 -> var10000 = 14;
               case 20 -> var10000 = 23;
               case 21 -> var10000 = 29;
               case 22 -> var10000 = 13;
               case 23 -> var10000 = 25;
               case 24 -> var10000 = 54;
               case 25 -> var10000 = 37;
               case 26 -> var10000 = 58;
               case 27 -> var10000 = 40;
               case 28 -> var10000 = 12;
               case 29 -> var10000 = 31;
               case 30 -> var10000 = 11;
               case 31 -> var10000 = 57;
               case 32 -> var10000 = 60;
               case 33 -> var10000 = 63;
               case 34 -> var10000 = 35;
               case 35 -> var10000 = 55;
               case 36 -> var10000 = 7;
               case 37 -> var10000 = 32;
               case 38 -> var10000 = 61;
               case 39 -> var10000 = 16;
               case 40 -> var10000 = 10;
               case 41 -> var10000 = 3;
               case 42 -> var10000 = 34;
               case 43 -> var10000 = 56;
               case 44 -> var10000 = 44;
               case 45 -> var10000 = 30;
               case 46 -> var10000 = 28;
               case 47 -> var10000 = 47;
               case 48 -> var10000 = 51;
               case 49 -> var10000 = 1;
               case 50 -> var10000 = 9;
               case 51 -> var10000 = 19;
               case 52 -> var10000 = 48;
               case 53 -> var10000 = 46;
               case 54 -> var10000 = 53;
               case 55 -> var10000 = 24;
               case 56 -> var10000 = 62;
               case 57 -> var10000 = 21;
               case 58 -> var10000 = 0;
               case 59 -> var10000 = 39;
               case 60 -> var10000 = 33;
               case 61 -> var10000 = 15;
               case 62 -> var10000 = 38;
               default -> var10000 = 2;
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

            f[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      f[1] = "c";
      var10000[2] = Void.TYPE;
      f[2] = "c";
      var10000[3] = "c";
      var10000[4] = Double.TYPE;
      f[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Float.TYPE;
      f[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Boolean.TYPE;
      f[12] = "c";
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
      var10000[33] = "c";
      var10000[34] = "c";
      var10000[35] = "c";
      var10000[36] = "c";
      var10000[37] = "c";
      var10000[38] = "c";
      var10000[39] = "c";
      var10000[40] = "c";
      var10000[41] = "c";
      var10000[42] = "c";
      var10000[43] = "c";
      var10000[44] = "c";
      var10000[45] = "c";
      var10000[46] = "c";
      var10000[47] = "c";
      var10000[48] = "c";
      var10000[49] = "c";
      var10000[50] = "c";
      var10000[51] = "c";
      var10000[52] = "c";
      var10000[53] = "c";
      var10000[54] = "c";
      var10000[55] = "c";
      var10000[56] = "c";
      var10000[57] = "c";
      var10000[58] = "c";
      var10000[59] = "c";
      var10000[60] = "c";
      var10000[61] = "c";
      var10000[62] = "c";
      var10000[63] = "c";
      var10000[64] = "c";
      var10000[65] = "c";
      var10000[66] = "c";
      var10000[67] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
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

   private static Field c(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
         int var7 = var6.indexOf(8);
         Class var8 = b(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = b(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = a(var12, var10, var11);
            if (var13 != null) {
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
                     return var13;
                  }
               }
            }

            if (var12.getName().equals("c")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("c").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new RuntimeException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = b((long)"c", 0L);
            }
         }
      }
   }

   private static Method a(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label33:
      for(Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for(int var10 = 0; var10 < var3; ++var10) {
                  if (var9[var10] != var4[var10]) {
                     continue label33;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var26;
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
                     e[var4] = var19;
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

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 250 && var8 != 'S' && var8 != 'G' && var8 != 242) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'U') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'B') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 250) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'S') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'G') {
               var9 = var0.findStaticGetter(var12, var20, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var20, var14);
            }
         }

         return MethodHandles.dropArguments(var9, var3.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName()).append("c").append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : "c")).append("c").append(var15.toString());
         throw new RuntimeException(var13.toString());
      }
   }

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = a(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
