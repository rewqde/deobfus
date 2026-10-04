package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// $FF: synthetic class
public class 7Fe {
   static final int[] 4;
   private static final Object[] a;
   private static final String[] b;
   // $FF: synthetic field
   private static transient String uTiqvhwxAa;

   static {
      a.b99571f71427e3b19.a.init(7Fe.class, 173);
      long var0 = s.a(6124954540114004477L, 4161586649924152124L, MethodHandles.lookup().lookupClass()).a(217285232110703L) ^ 105585567446990L;
      a = new Object[11];
      b = new String[11];
      a();
      4 = new int[-2367109272463904618L.ª<invokedynamic>(-2367109272463904618L, var0).length];

      try {
         -2367202985535856912L.ý<invokedynamic>(-2367202985535856912L, var0)[-2367306840284512905L.ý<invokedynamic>(-2367306840284512905L, var0).Ê<invokedynamic>(-2367306840284512905L.ý<invokedynamic>(-2367306840284512905L, var0), -2367274127716425394L, var0)] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         -2367202985535856912L.ý<invokedynamic>(-2367202985535856912L, var0)[-2366987071106496133L.ý<invokedynamic>(-2366987071106496133L, var0).Ê<invokedynamic>(-2366987071106496133L.ý<invokedynamic>(-2366987071106496133L, var0), -2367274127716425394L, var0)] = 2;
      } catch (NoSuchFieldError var3) {
      }

   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (b[var4] != null) {
         return var4;
      } else {
         Object var5 = a[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 0;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 23;
               case 3 -> var10000 = 34;
               case 4 -> var10000 = 58;
               case 5 -> var10000 = 2;
               case 6 -> var10000 = 29;
               case 7 -> var10000 = 9;
               case 8 -> var10000 = 5;
               case 9 -> var10000 = 35;
               case 10 -> var10000 = 37;
               case 11 -> var10000 = 57;
               case 12 -> var10000 = 24;
               case 13 -> var10000 = 21;
               case 14 -> var10000 = 46;
               case 15 -> var10000 = 14;
               case 16 -> var10000 = 43;
               case 17 -> var10000 = 48;
               case 18 -> var10000 = 19;
               case 19 -> var10000 = 60;
               case 20 -> var10000 = 27;
               case 21 -> var10000 = 10;
               case 22 -> var10000 = 47;
               case 23 -> var10000 = 42;
               case 24 -> var10000 = 3;
               case 25 -> var10000 = 49;
               case 26 -> var10000 = 22;
               case 27 -> var10000 = 63;
               case 28 -> var10000 = 50;
               case 29 -> var10000 = 26;
               case 30 -> var10000 = 25;
               case 31 -> var10000 = 18;
               case 32 -> var10000 = 11;
               case 33 -> var10000 = 6;
               case 34 -> var10000 = 52;
               case 35 -> var10000 = 32;
               case 36 -> var10000 = 1;
               case 37 -> var10000 = 59;
               case 38 -> var10000 = 7;
               case 39 -> var10000 = 51;
               case 40 -> var10000 = 54;
               case 41 -> var10000 = 16;
               case 42 -> var10000 = 12;
               case 43 -> var10000 = 55;
               case 44 -> var10000 = 53;
               case 45 -> var10000 = 40;
               case 46 -> var10000 = 61;
               case 47 -> var10000 = 33;
               case 48 -> var10000 = 44;
               case 49 -> var10000 = 13;
               case 50 -> var10000 = 38;
               case 51 -> var10000 = 39;
               case 52 -> var10000 = 62;
               case 53 -> var10000 = 31;
               case 54 -> var10000 = 20;
               case 55 -> var10000 = 56;
               case 56 -> var10000 = 4;
               case 57 -> var10000 = 17;
               case 58 -> var10000 = 15;
               case 59 -> var10000 = 8;
               case 60 -> var10000 = 36;
               case 61 -> var10000 = 41;
               case 62 -> var10000 = 28;
               default -> var10000 = 30;
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

            b[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = a;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Integer.TYPE;
      b[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
   }

   private static native Class b(long var0, long var2);

   private static native Field a(Class var0, String var1, Class var2);

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
      Object var5 = a[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = b[var4];
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
               a[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     a[var4] = var13;
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
