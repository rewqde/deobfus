package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 7Mk {
   public static final 7Mk 2;
   public static final 7Mk 6;
   public static final 7Mk 5;
   public static final 7Mk 1;
   public static final 7Mk 4;
   private static final 7Mk[] 7;
   private static final long a;
   private static final Object[] b;
   private static final String[] c;

   private static 7Mk[] _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7Mk.class, 533);
      a = s.a(-7695385571881429114L, 4798746021638535557L, MethodHandles.lookup().lookupClass()).a(33738079918747L);
      long var9 = a ^ 99654928992484L;
      b = new Object[15];
      c = new String[15];
      a();
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "ßæ\u000f¯8 ^\u008dGså\u0001\u0012)\n\u0013\u000b\u000fTÝÇT1å\u0018\u0001\u009a8\u0099o\u0098o\u0085Ù\u0080FR¦¹Õà\t»D9C\"ª\u0003\u0018\u0003$ðµ ¬©g\u008b\u0097\u008d¸z@\u0002\u0000Õ\"\u008e<\u0099R÷¢";
      int var7 = "ßæ\u000f¯8 ^\u008dGså\u0001\u0012)\n\u0013\u000b\u000fTÝÇT1å\u0018\u0001\u009a8\u0099o\u0098o\u0085Ù\u0080FR¦¹Õà\t»D9C\"ª\u0003\u0018\u0003$ðµ ¬©g\u008b\u0097\u008d¸z@\u0002\u0000Õ\"\u008e<\u0099R÷¢".length();
      char var4 = 24;
      int var12 = -1;

      label28:
      while(true) {
         ++var12;
         String var13 = var5.substring(var12, var12 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     2 = new 7Mk(var0[0], 0);
                     6 = new 7Mk(var0[4], 1);
                     5 = new 7Mk(var0[3], 2);
                     1 = new 7Mk(var0[2], 3);
                     4 = new 7Mk(var0[1], 4);
                     7 = 4331101461570070644L.Q<invokedynamic>(4331101461570070644L, var9);
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "ì\u0007\u000f\u0088³\u008eÜç\u009a6äá.ÌÛp\u0018Þé^á§\u0086ÓY)ð\u00adì¼Nj\u009ff\u008f´@APÊÔ";
                  var7 = "ì\u0007\u000f\u0088³\u008eÜç\u009a6äá.ÌÛp\u0018Þé^á§\u0086ÓY)ð\u00adì¼Nj\u009ff\u008f´@APÊÔ".length();
                  var4 = 16;
                  var12 = -1;
            }

            ++var12;
            var13 = var5.substring(var12, var12 + var4);
            var10001 = 0;
         }
      }
   }

   private static native String a(byte[] var0);

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (c[var4] != null) {
         return var4;
      } else {
         Object var5 = b[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 21;
               case 1 -> var10000 = 47;
               case 2 -> var10000 = 43;
               case 3 -> var10000 = 51;
               case 4 -> var10000 = 29;
               case 5 -> var10000 = 20;
               case 6 -> var10000 = 42;
               case 7 -> var10000 = 46;
               case 8 -> var10000 = 59;
               case 9 -> var10000 = 33;
               case 10 -> var10000 = 7;
               case 11 -> var10000 = 49;
               case 12 -> var10000 = 0;
               case 13 -> var10000 = 40;
               case 14 -> var10000 = 52;
               case 15 -> var10000 = 9;
               case 16 -> var10000 = 28;
               case 17 -> var10000 = 31;
               case 18 -> var10000 = 10;
               case 19 -> var10000 = 34;
               case 20 -> var10000 = 48;
               case 21 -> var10000 = 25;
               case 22 -> var10000 = 22;
               case 23 -> var10000 = 62;
               case 24 -> var10000 = 32;
               case 25 -> var10000 = 41;
               case 26 -> var10000 = 11;
               case 27 -> var10000 = 57;
               case 28 -> var10000 = 45;
               case 29 -> var10000 = 12;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 15;
               case 32 -> var10000 = 38;
               case 33 -> var10000 = 3;
               case 34 -> var10000 = 50;
               case 35 -> var10000 = 23;
               case 36 -> var10000 = 19;
               case 37 -> var10000 = 8;
               case 38 -> var10000 = 61;
               case 39 -> var10000 = 63;
               case 40 -> var10000 = 35;
               case 41 -> var10000 = 24;
               case 42 -> var10000 = 44;
               case 43 -> var10000 = 14;
               case 44 -> var10000 = 30;
               case 45 -> var10000 = 6;
               case 46 -> var10000 = 26;
               case 47 -> var10000 = 36;
               case 48 -> var10000 = 2;
               case 49 -> var10000 = 13;
               case 50 -> var10000 = 58;
               case 51 -> var10000 = 53;
               case 52 -> var10000 = 5;
               case 53 -> var10000 = 1;
               case 54 -> var10000 = 18;
               case 55 -> var10000 = 37;
               case 56 -> var10000 = 17;
               case 57 -> var10000 = 55;
               case 58 -> var10000 = 27;
               case 59 -> var10000 = 60;
               case 60 -> var10000 = 16;
               case 61 -> var10000 = 54;
               case 62 -> var10000 = 56;
               default -> var10000 = 39;
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

            c[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = b;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = b[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(c[var4]);
            b[var4] = var5;
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

   private static native Method d(long var0, long var2);

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
