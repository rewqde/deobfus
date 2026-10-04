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

public class 0D {
   private static final int 2;
   private static final int 0;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String XnpaIlnyRR;

   private _D/* $FF was: 0D*/() {
   }

   private static float _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(0D.class, 258);
      a = s.a(-3657979357525383626L, 9121040814424440600L, MethodHandles.lookup().lookupClass()).a(234510609639893L);
      e = new Object[36];
      f = new String[36];
      a();
      d = new HashMap(13);
      long var0 = a ^ 140200168598064L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[9];
      int var5 = 0;
      String var6 = "B»\u009bUÜólz.Ùb\u0082ôÓPÙâÒ¥®c\u009eqçLL6J\u0012Ú\u0087\u0083 ½Ýlü-z\u0015m\u001fä\u009b\u0018è3?\u0005+êw\u001e\u008að\u0094";
      int var7 = "B»\u009bUÜólz.Ùb\u0082ôÓPÙâÒ¥®c\u009eqçLL6J\u0012Ú\u0087\u0083 ½Ýlü-z\u0015m\u001fä\u009b\u0018è3?\u0005+êw\u001e\u008að\u0094".length();
      int var4 = 0;

      label23:
      while(true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var19 = -1;

         while(true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var21 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[9];
                     2 = true.a<invokedynamic>(24630, var0 ^ 8554874482886606444L);
                     0 = true.a<invokedynamic>(13379, var0 ^ 7194181693559581213L);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "èôòËcØ77ýNÿ\u009a\u0011\u0006]ä";
                  var7 = "èôòËcØ77ýNÿ\u009a\u0011\u0006]ä".length();
                  var4 = 0;
            }

            var10001 = var4;
            var4 += 8;
            var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
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

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

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
               case 0 -> var10000 = 30;
               case 1 -> var10000 = 3;
               case 2 -> var10000 = 17;
               case 3 -> var10000 = 47;
               case 4 -> var10000 = 33;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 45;
               case 7 -> var10000 = 0;
               case 8 -> var10000 = 25;
               case 9 -> var10000 = 39;
               case 10 -> var10000 = 59;
               case 11 -> var10000 = 35;
               case 12 -> var10000 = 54;
               case 13 -> var10000 = 40;
               case 14 -> var10000 = 9;
               case 15 -> var10000 = 18;
               case 16 -> var10000 = 49;
               case 17 -> var10000 = 4;
               case 18 -> var10000 = 11;
               case 19 -> var10000 = 36;
               case 20 -> var10000 = 13;
               case 21 -> var10000 = 10;
               case 22 -> var10000 = 53;
               case 23 -> var10000 = 61;
               case 24 -> var10000 = 62;
               case 25 -> var10000 = 48;
               case 26 -> var10000 = 46;
               case 27 -> var10000 = 12;
               case 28 -> var10000 = 34;
               case 29 -> var10000 = 32;
               case 30 -> var10000 = 16;
               case 31 -> var10000 = 58;
               case 32 -> var10000 = 55;
               case 33 -> var10000 = 19;
               case 34 -> var10000 = 2;
               case 35 -> var10000 = 24;
               case 36 -> var10000 = 44;
               case 37 -> var10000 = 23;
               case 38 -> var10000 = 5;
               case 39 -> var10000 = 60;
               case 40 -> var10000 = 27;
               case 41 -> var10000 = 28;
               case 42 -> var10000 = 57;
               case 43 -> var10000 = 14;
               case 44 -> var10000 = 1;
               case 45 -> var10000 = 41;
               case 46 -> var10000 = 29;
               case 47 -> var10000 = 37;
               case 48 -> var10000 = 7;
               case 49 -> var10000 = 6;
               case 50 -> var10000 = 51;
               case 51 -> var10000 = 21;
               case 52 -> var10000 = 42;
               case 53 -> var10000 = 15;
               case 54 -> var10000 = 52;
               case 55 -> var10000 = 20;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 22;
               case 58 -> var10000 = 50;
               case 59 -> var10000 = 31;
               case 60 -> var10000 = 38;
               case 61 -> var10000 = 56;
               case 62 -> var10000 = 63;
               default -> var10000 = 43;
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
      var10000[1] = "c";
      var10000[2] = Void.TYPE;
      f[2] = "c";
      var10000[3] = "c";
      var10000[4] = Integer.TYPE;
      f[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Boolean.TYPE;
      f[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Float.TYPE;
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

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
