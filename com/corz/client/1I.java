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
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;

public class 1i extends 9a {
   public final 4U 2;
   public final 4H 7;
   public final 4A 8;
   public final 4H 4N;
   private final Queue 4n;
   private final 7OD 3;
   private volatile class_243 9;
   private double 0;
   private boolean 6;
   private volatile boolean 5;
   private volatile boolean 1;
   private static final long b;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final Object[] l;
   private static final String[] m;
   // $FF: synthetic field
   private static transient String LjQUhWIAjY;

   public _i/* $FF was: 1i*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 7*/(7Ya param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 4*/(7tL param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(1i.class, 722);
      b = com.corz.client.s.a(8566610833429441725L, 1811702139255952285L, MethodHandles.lookup().lookupClass()).a(178845445568918L);
      l = new Object[107];
      m = new String[107];
      b();
      h = new HashMap(13);
      long var0 = b ^ 78579334977233L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[10];
      int var5 = 0;
      String var6 = "ÿ\u0007ebëËß\\mïJñÏ\u0011\u0096ä\u008f\u0086<®\u0010|w<a\u0005+\u0002¡\u008d6\u0015n¸]?øº(\u001f\u0096g¯\u008e¾ð\u0003\tpå©²\u0014)ÄN»ªO\u0085°Å³â";
      int var7 = "ÿ\u0007ebëËß\\mïJñÏ\u0011\u0096ä\u008f\u0086<®\u0010|w<a\u0005+\u0002¡\u008d6\u0015n¸]?øº(\u001f\u0096g¯\u008e¾ð\u0003\tpå©²\u0014)ÄN»ªO\u0085°Å³â".length();
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
                     f = var8;
                     g = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u0018ÊÑ\u0082\u009cY\u0092çè*Ï\u0089,lþÏ";
                  var7 = "\u0018ÊÑ\u0082\u009cY\u0092çè*Ï\u0089,lþÏ".length();
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

   private static int b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (m[var4] != null) {
         return var4;
      } else {
         Object var5 = l[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 46;
               case 1 -> var10000 = 25;
               case 2 -> var10000 = 12;
               case 3 -> var10000 = 44;
               case 4 -> var10000 = 32;
               case 5 -> var10000 = 6;
               case 6 -> var10000 = 39;
               case 7 -> var10000 = 37;
               case 8 -> var10000 = 10;
               case 9 -> var10000 = 22;
               case 10 -> var10000 = 43;
               case 11 -> var10000 = 2;
               case 12 -> var10000 = 17;
               case 13 -> var10000 = 0;
               case 14 -> var10000 = 41;
               case 15 -> var10000 = 16;
               case 16 -> var10000 = 13;
               case 17 -> var10000 = 1;
               case 18 -> var10000 = 58;
               case 19 -> var10000 = 33;
               case 20 -> var10000 = 48;
               case 21 -> var10000 = 34;
               case 22 -> var10000 = 53;
               case 23 -> var10000 = 63;
               case 24 -> var10000 = 18;
               case 25 -> var10000 = 30;
               case 26 -> var10000 = 57;
               case 27 -> var10000 = 47;
               case 28 -> var10000 = 50;
               case 29 -> var10000 = 11;
               case 30 -> var10000 = 8;
               case 31 -> var10000 = 54;
               case 32 -> var10000 = 42;
               case 33 -> var10000 = 61;
               case 34 -> var10000 = 14;
               case 35 -> var10000 = 21;
               case 36 -> var10000 = 19;
               case 37 -> var10000 = 24;
               case 38 -> var10000 = 40;
               case 39 -> var10000 = 59;
               case 40 -> var10000 = 20;
               case 41 -> var10000 = 5;
               case 42 -> var10000 = 15;
               case 43 -> var10000 = 51;
               case 44 -> var10000 = 52;
               case 45 -> var10000 = 23;
               case 46 -> var10000 = 9;
               case 47 -> var10000 = 62;
               case 48 -> var10000 = 35;
               case 49 -> var10000 = 29;
               case 50 -> var10000 = 3;
               case 51 -> var10000 = 27;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 45;
               case 54 -> var10000 = 36;
               case 55 -> var10000 = 28;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 7;
               case 58 -> var10000 = 60;
               case 59 -> var10000 = 38;
               case 60 -> var10000 = 31;
               case 61 -> var10000 = 56;
               case 62 -> var10000 = 49;
               default -> var10000 = 55;
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

            m[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static native void b();

   private static native Class f(long var0, long var2);

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static Field d(Class var0, String var1, Class var2) {
      Field var3 = c(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = d(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = m[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = f(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = c(var12, var10, var11);
            if (var13 != null) {
               l[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     l[var4] = var13;
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
               var12 = f((long)"c", 0L);
            }
         }
      }
   }

   private static Method c(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   private static Method d(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = c(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = d(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   private static native Method h(long var0, long var2);

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'l' && var8 != 220 && var8 != 217 && var8 != 186) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 232) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'Q') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'l') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 220) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 217) {
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

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);
}
