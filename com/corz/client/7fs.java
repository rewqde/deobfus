package com.corz.client;

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

public class 7FS {
   public final boolean 4;
   public final List 8;
   private static final long a;
   private static final String b;
   private static final Object[] c;
   private static final String[] d;
   // $FF: synthetic field
   private static transient String AcTgxAzWdV;

   _FS/* $FF was: 7FS*/(boolean var1, List var2) {
      this.4 = var1;
      this.8 = var2;
   }

   public String _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = b;
      return var10000.P<invokedynamic>(var10000, this.S<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(7FS.class, 440);
      a = s.a(-7392155974071213424L, -8385391255327252883L, MethodHandles.lookup().lookupClass()).a(133367838487589L);
      c = new Object[8];
      d = new String[8];
      a();
      long var0 = a ^ 24709054249173L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("1©\u001dñdInh".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
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
               case 0 -> var10000 = 24;
               case 1 -> var10000 = 61;
               case 2 -> var10000 = 32;
               case 3 -> var10000 = 3;
               case 4 -> var10000 = 14;
               case 5 -> var10000 = 20;
               case 6 -> var10000 = 52;
               case 7 -> var10000 = 59;
               case 8 -> var10000 = 54;
               case 9 -> var10000 = 47;
               case 10 -> var10000 = 5;
               case 11 -> var10000 = 27;
               case 12 -> var10000 = 19;
               case 13 -> var10000 = 48;
               case 14 -> var10000 = 33;
               case 15 -> var10000 = 41;
               case 16 -> var10000 = 45;
               case 17 -> var10000 = 0;
               case 18 -> var10000 = 6;
               case 19 -> var10000 = 8;
               case 20 -> var10000 = 12;
               case 21 -> var10000 = 56;
               case 22 -> var10000 = 35;
               case 23 -> var10000 = 63;
               case 24 -> var10000 = 16;
               case 25 -> var10000 = 11;
               case 26 -> var10000 = 13;
               case 27 -> var10000 = 18;
               case 28 -> var10000 = 51;
               case 29 -> var10000 = 28;
               case 30 -> var10000 = 60;
               case 31 -> var10000 = 42;
               case 32 -> var10000 = 25;
               case 33 -> var10000 = 43;
               case 34 -> var10000 = 17;
               case 35 -> var10000 = 2;
               case 36 -> var10000 = 50;
               case 37 -> var10000 = 53;
               case 38 -> var10000 = 23;
               case 39 -> var10000 = 49;
               case 40 -> var10000 = 44;
               case 41 -> var10000 = 22;
               case 42 -> var10000 = 38;
               case 43 -> var10000 = 21;
               case 44 -> var10000 = 34;
               case 45 -> var10000 = 37;
               case 46 -> var10000 = 26;
               case 47 -> var10000 = 39;
               case 48 -> var10000 = 36;
               case 49 -> var10000 = 62;
               case 50 -> var10000 = 55;
               case 51 -> var10000 = 7;
               case 52 -> var10000 = 15;
               case 53 -> var10000 = 1;
               case 54 -> var10000 = 10;
               case 55 -> var10000 = 31;
               case 56 -> var10000 = 30;
               case 57 -> var10000 = 4;
               case 58 -> var10000 = 9;
               case 59 -> var10000 = 57;
               case 60 -> var10000 = 40;
               case 61 -> var10000 = 58;
               case 62 -> var10000 = 29;
               default -> var10000 = 46;
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
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
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

   private static Field c(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = c[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = d[var4];
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
               c[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     c[var4] = var13;
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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'S' && var8 != 200 && var8 != 'k' && var8 != 230) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'D') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'P') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'S') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 200) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'k') {
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
