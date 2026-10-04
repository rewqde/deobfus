package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public record 83(boolean 6, boolean 2) {
   private static final long a;
   private static final Object[] b;
   private static final String[] c;
   // $FF: synthetic field
   private static transient String JQxlFBmyTo;

   public _3/* $FF was: 83*/(boolean var1, boolean var2) {
      this.6 = var1;
      this.2 = var2;
   }

   public boolean _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(83.class, 824);
      a = s.a(3836492109518279490L, 5003564488320498177L, MethodHandles.lookup().lookupClass()).a(117910159004516L);
      b = new Object[5];
      c = new String[5];
      a();
   }

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
               case 0 -> var10000 = 44;
               case 1 -> var10000 = 17;
               case 2 -> var10000 = 40;
               case 3 -> var10000 = 39;
               case 4 -> var10000 = 59;
               case 5 -> var10000 = 30;
               case 6 -> var10000 = 49;
               case 7 -> var10000 = 63;
               case 8 -> var10000 = 27;
               case 9 -> var10000 = 12;
               case 10 -> var10000 = 61;
               case 11 -> var10000 = 16;
               case 12 -> var10000 = 31;
               case 13 -> var10000 = 33;
               case 14 -> var10000 = 9;
               case 15 -> var10000 = 43;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 35;
               case 18 -> var10000 = 41;
               case 19 -> var10000 = 37;
               case 20 -> var10000 = 32;
               case 21 -> var10000 = 26;
               case 22 -> var10000 = 23;
               case 23 -> var10000 = 3;
               case 24 -> var10000 = 10;
               case 25 -> var10000 = 56;
               case 26 -> var10000 = 21;
               case 27 -> var10000 = 29;
               case 28 -> var10000 = 24;
               case 29 -> var10000 = 1;
               case 30 -> var10000 = 19;
               case 31 -> var10000 = 11;
               case 32 -> var10000 = 47;
               case 33 -> var10000 = 50;
               case 34 -> var10000 = 51;
               case 35 -> var10000 = 7;
               case 36 -> var10000 = 8;
               case 37 -> var10000 = 2;
               case 38 -> var10000 = 55;
               case 39 -> var10000 = 4;
               case 40 -> var10000 = 18;
               case 41 -> var10000 = 62;
               case 42 -> var10000 = 38;
               case 43 -> var10000 = 57;
               case 44 -> var10000 = 20;
               case 45 -> var10000 = 22;
               case 46 -> var10000 = 13;
               case 47 -> var10000 = 36;
               case 48 -> var10000 = 14;
               case 49 -> var10000 = 28;
               case 50 -> var10000 = 48;
               case 51 -> var10000 = 5;
               case 52 -> var10000 = 54;
               case 53 -> var10000 = 52;
               case 54 -> var10000 = 15;
               case 55 -> var10000 = 6;
               case 56 -> var10000 = 25;
               case 57 -> var10000 = 53;
               case 58 -> var10000 = 0;
               case 59 -> var10000 = 60;
               case 60 -> var10000 = 34;
               case 61 -> var10000 = 45;
               case 62 -> var10000 = 46;
               default -> var10000 = 58;
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
      var10000[1] = Boolean.TYPE;
      c[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
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
      Object var5 = b[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = c[var4];
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
               b[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     b[var4] = var13;
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
