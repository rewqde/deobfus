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

// $FF: synthetic class
public class 7M9 {
   static final int[] 5;
   static final int[] 7;
   static final int[] 4;
   private static final Object[] a;
   private static final String[] b;
   // $FF: synthetic field
   private static transient String FOkpaLpLdx;

   static {
      a.b99571f71427e3b19.a.init(7M9.class, 692);
      long var11 = s.a(3775513392330541044L, -1742553337397014670L, MethodHandles.lookup().lookupClass()).a(104807056137198L) ^ 40553336615042L;
      a = new Object[36];
      b = new String[36];
      a();
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "#WÉ\u008a\u009fVAtR<\u0011F\u0015Éxw";
      int var6 = "#WÉ\u008a\u009fVAtR<\u0011F\u0015Éxw".length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var30 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      4 = new int[-1649467582359841652L.q<invokedynamic>(-1649467582359841652L, var11).length];

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1651562296870571672L.s<invokedynamic>(-1651562296870571672L, var11).Ä<invokedynamic>(-1651562296870571672L.s<invokedynamic>(-1651562296870571672L, var11), -1648426820262415596L, var11)] = 1;
      } catch (NoSuchFieldError var28) {
      }

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1649748376839790761L.s<invokedynamic>(-1649748376839790761L, var11).Ä<invokedynamic>(-1649748376839790761L.s<invokedynamic>(-1649748376839790761L, var11), -1648426820262415596L, var11)] = 2;
      } catch (NoSuchFieldError var27) {
      }

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1648366496911485584L.s<invokedynamic>(-1648366496911485584L, var11).Ä<invokedynamic>(-1648366496911485584L.s<invokedynamic>(-1648366496911485584L, var11), -1648426820262415596L, var11)] = 3;
      } catch (NoSuchFieldError var26) {
      }

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1648522106892626237L.s<invokedynamic>(-1648522106892626237L, var11).Ä<invokedynamic>(-1648522106892626237L.s<invokedynamic>(-1648522106892626237L, var11), -1648426820262415596L, var11)] = 4;
      } catch (NoSuchFieldError var25) {
      }

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1650312415363135707L.s<invokedynamic>(-1650312415363135707L, var11).Ä<invokedynamic>(-1650312415363135707L.s<invokedynamic>(-1650312415363135707L, var11), -1648426820262415596L, var11)] = 5;
      } catch (NoSuchFieldError var24) {
      }

      try {
         -1651648868027183008L.s<invokedynamic>(-1651648868027183008L, var11)[-1650195582279286584L.s<invokedynamic>(-1650195582279286584L, var11).Ä<invokedynamic>(-1650195582279286584L.s<invokedynamic>(-1650195582279286584L, var11), -1648426820262415596L, var11)] = (int)var0[0];
      } catch (NoSuchFieldError var23) {
      }

      7 = new int[-1650403843947896212L.q<invokedynamic>(-1650403843947896212L, var11).length];

      try {
         -1649560073475025930L.s<invokedynamic>(-1649560073475025930L, var11)[-1649803744287337084L.s<invokedynamic>(-1649803744287337084L, var11).Ä<invokedynamic>(-1649803744287337084L.s<invokedynamic>(-1649803744287337084L, var11), -1648546961416245665L, var11)] = 1;
      } catch (NoSuchFieldError var22) {
      }

      try {
         -1649560073475025930L.s<invokedynamic>(-1649560073475025930L, var11)[-1650531897068379298L.s<invokedynamic>(-1650531897068379298L, var11).Ä<invokedynamic>(-1650531897068379298L.s<invokedynamic>(-1650531897068379298L, var11), -1648546961416245665L, var11)] = 2;
      } catch (NoSuchFieldError var21) {
      }

      try {
         -1649560073475025930L.s<invokedynamic>(-1649560073475025930L, var11)[-1649886403768017654L.s<invokedynamic>(-1649886403768017654L, var11).Ä<invokedynamic>(-1649886403768017654L.s<invokedynamic>(-1649886403768017654L, var11), -1648546961416245665L, var11)] = 3;
      } catch (NoSuchFieldError var20) {
      }

      5 = new int[-1650135128786402118L.q<invokedynamic>(-1650135128786402118L, var11).length];

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1650011450005133533L.s<invokedynamic>(-1650011450005133533L, var11).Ä<invokedynamic>(-1650011450005133533L.s<invokedynamic>(-1650011450005133533L, var11), -1649971988381449460L, var11)] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1650286070761310836L.s<invokedynamic>(-1650286070761310836L, var11).Ä<invokedynamic>(-1650286070761310836L.s<invokedynamic>(-1650286070761310836L, var11), -1649971988381449460L, var11)] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1651527851692382925L.s<invokedynamic>(-1651527851692382925L, var11).Ä<invokedynamic>(-1651527851692382925L.s<invokedynamic>(-1651527851692382925L, var11), -1649971988381449460L, var11)] = 3;
      } catch (NoSuchFieldError var17) {
      }

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1649694793632063127L.s<invokedynamic>(-1649694793632063127L, var11).Ä<invokedynamic>(-1649694793632063127L.s<invokedynamic>(-1649694793632063127L, var11), -1649971988381449460L, var11)] = 4;
      } catch (NoSuchFieldError var16) {
      }

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1649643171332359767L.s<invokedynamic>(-1649643171332359767L, var11).Ä<invokedynamic>(-1649643171332359767L.s<invokedynamic>(-1649643171332359767L, var11), -1649971988381449460L, var11)] = 5;
      } catch (NoSuchFieldError var15) {
      }

      try {
         -1651461229439600785L.s<invokedynamic>(-1651461229439600785L, var11)[-1650450537102112101L.s<invokedynamic>(-1650450537102112101L, var11).Ä<invokedynamic>(-1650450537102112101L.s<invokedynamic>(-1650450537102112101L, var11), -1649971988381449460L, var11)] = (int)var0[1];
      } catch (NoSuchFieldError var14) {
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
               case 0 -> var10000 = 12;
               case 1 -> var10000 = 24;
               case 2 -> var10000 = 0;
               case 3 -> var10000 = 8;
               case 4 -> var10000 = 41;
               case 5 -> var10000 = 34;
               case 6 -> var10000 = 47;
               case 7 -> var10000 = 53;
               case 8 -> var10000 = 56;
               case 9 -> var10000 = 4;
               case 10 -> var10000 = 15;
               case 11 -> var10000 = 54;
               case 12 -> var10000 = 49;
               case 13 -> var10000 = 40;
               case 14 -> var10000 = 62;
               case 15 -> var10000 = 22;
               case 16 -> var10000 = 46;
               case 17 -> var10000 = 16;
               case 18 -> var10000 = 38;
               case 19 -> var10000 = 43;
               case 20 -> var10000 = 20;
               case 21 -> var10000 = 2;
               case 22 -> var10000 = 32;
               case 23 -> var10000 = 58;
               case 24 -> var10000 = 5;
               case 25 -> var10000 = 27;
               case 26 -> var10000 = 31;
               case 27 -> var10000 = 61;
               case 28 -> var10000 = 39;
               case 29 -> var10000 = 23;
               case 30 -> var10000 = 36;
               case 31 -> var10000 = 50;
               case 32 -> var10000 = 60;
               case 33 -> var10000 = 33;
               case 34 -> var10000 = 44;
               case 35 -> var10000 = 19;
               case 36 -> var10000 = 30;
               case 37 -> var10000 = 3;
               case 38 -> var10000 = 42;
               case 39 -> var10000 = 7;
               case 40 -> var10000 = 25;
               case 41 -> var10000 = 45;
               case 42 -> var10000 = 37;
               case 43 -> var10000 = 9;
               case 44 -> var10000 = 26;
               case 45 -> var10000 = 28;
               case 46 -> var10000 = 21;
               case 47 -> var10000 = 29;
               case 48 -> var10000 = 48;
               case 49 -> var10000 = 35;
               case 50 -> var10000 = 51;
               case 51 -> var10000 = 18;
               case 52 -> var10000 = 1;
               case 53 -> var10000 = 63;
               case 54 -> var10000 = 52;
               case 55 -> var10000 = 59;
               case 56 -> var10000 = 55;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 17;
               case 59 -> var10000 = 14;
               case 60 -> var10000 = 6;
               case 61 -> var10000 = 57;
               case 62 -> var10000 = 10;
               default -> var10000 = 13;
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
      var10000[1] = Integer.TYPE;
      b[1] = "c";
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
      Object var6 = a[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(b[var4]);
            a[var4] = var5;
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

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'p' && var8 != 209 && var8 != 's' && var8 != 't') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 196) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'q') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'p') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 209) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 's') {
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
