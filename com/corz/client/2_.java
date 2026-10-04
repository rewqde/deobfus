package com.corz.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 2_ extends 9a {
   private final 44 0;
   private final 4H 3;
   private final 4H 6T;
   private final 4H 6k;
   private final 4H 1;
   private final 4H 6;
   private final 4H 6U;
   private final 4H 9;
   private final 4H 6D;
   private final 4H 8;
   private static final int 7;
   private static final Color 2;
   private final List 6Y;
   private int 5;
   private static final long b;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final Object[] l;
   private static final String[] m;
   // $FF: synthetic field
   private static transient String rVMLxNIUAy;

   public __/* $FF was: 2_*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private Color _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(2_.class, 566);
      b = com.corz.client.s.a(5267769457411088560L, -389412464296085093L, MethodHandles.lookup().lookupClass()).a(97174809938169L);
      long var11 = b ^ 50983633068418L;
      l = new Object[101];
      m = new String[101];
      b();
      h = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[38];
      int var3 = 0;
      String var4 = "g`P\u0084IêêæAàïÏù¼è\u008c´\u00101÷³\u0082\u00848\u00ad3\u009e¯\u0092â¥Ï«5ª\u008bumH¦Dû\t²Ä\u0000N\u0002\u009d¿\u0086dSÿpûô\bÓø/£\"\u0097§»ï\u0013Ýxr\u0001_\u0095\u0016\fÏS\u0095É\u001dp7øÚC\r.õ\u009c\u0092\u0011!¤\u0087â{S®ß\u0014øêý \u001dnõ<\u001f}Á«\u0016°¬V\u0086'\u0001\u0000%\u0094Ppõ\u0084 1a~»ßSe\n`Ó¯¯ÞÓ|\u0000\u0007kÉB\u008f\"}Í\u0082\u000e¹M\u0011s\u008e\u0088Ð¢\\k\u0001±\u0001y6tJ´\u0098|\u008aÇN)\u0086QÎáæP]âJ *Tï-Õº.EÑrÆ0^wã\u000f#e0\u0098²´eì³¼X+úZ§\u000bD\u0096\u0085LwÐ5%]3×\u0001U\u0080Çð\u0017\b¹¦\u0018V\u008c\u0004¨ùÿCö³ø\u009b\u0003´ôÙ{Èñ»@.5ìÿw\u0081Ýbb1\u0085\u0092ù\u0099¼\u0089'T\n\u001f\u0014t\u008d0}Èr";
      int var5 = "g`P\u0084IêêæAàïÏù¼è\u008c´\u00101÷³\u0082\u00848\u00ad3\u009e¯\u0092â¥Ï«5ª\u008bumH¦Dû\t²Ä\u0000N\u0002\u009d¿\u0086dSÿpûô\bÓø/£\"\u0097§»ï\u0013Ýxr\u0001_\u0095\u0016\fÏS\u0095É\u001dp7øÚC\r.õ\u009c\u0092\u0011!¤\u0087â{S®ß\u0014øêý \u001dnõ<\u001f}Á«\u0016°¬V\u0086'\u0001\u0000%\u0094Ppõ\u0084 1a~»ßSe\n`Ó¯¯ÞÓ|\u0000\u0007kÉB\u008f\"}Í\u0082\u000e¹M\u0011s\u008e\u0088Ð¢\\k\u0001±\u0001y6tJ´\u0098|\u008aÇN)\u0086QÎáæP]âJ *Tï-Õº.EÑrÆ0^wã\u000f#e0\u0098²´eì³¼X+úZ§\u000bD\u0096\u0085LwÐ5%]3×\u0001U\u0080Çð\u0017\b¹¦\u0018V\u008c\u0004¨ùÿCö³ø\u009b\u0003´ôÙ{Èñ»@.5ìÿw\u0081Ýbb1\u0085\u0092ù\u0099¼\u0089'T\n\u001f\u0014t\u008d0}Èr".length();
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
                     f = var6;
                     g = new Integer[38];
                     7 = true.l<invokedynamic>(27680, var11 ^ 4112651449044197351L);
                     2 = new Color(true.l<invokedynamic>(30621, 2252291605901886579L ^ var11), true.l<invokedynamic>(30621, 2252291605901886579L ^ var11), true.l<invokedynamic>(30621, 2252291605901886579L ^ var11), 0);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var2 < var5) {
                     continue label23;
                  }

                  var4 = "¯t\u0088Qá6Õ\u001b.ö1\u0086¶ê\u0085±";
                  var5 = "¯t\u0088Qá6Õ\u001b.ö1\u0086¶ê\u0085±".length();
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

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int b(int var0, long var1);

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
               case 0 -> var10000 = 39;
               case 1 -> var10000 = 62;
               case 2 -> var10000 = 7;
               case 3 -> var10000 = 12;
               case 4 -> var10000 = 23;
               case 5 -> var10000 = 4;
               case 6 -> var10000 = 43;
               case 7 -> var10000 = 1;
               case 8 -> var10000 = 44;
               case 9 -> var10000 = 24;
               case 10 -> var10000 = 53;
               case 11 -> var10000 = 57;
               case 12 -> var10000 = 15;
               case 13 -> var10000 = 28;
               case 14 -> var10000 = 19;
               case 15 -> var10000 = 36;
               case 16 -> var10000 = 32;
               case 17 -> var10000 = 58;
               case 18 -> var10000 = 5;
               case 19 -> var10000 = 56;
               case 20 -> var10000 = 48;
               case 21 -> var10000 = 35;
               case 22 -> var10000 = 11;
               case 23 -> var10000 = 50;
               case 24 -> var10000 = 63;
               case 25 -> var10000 = 13;
               case 26 -> var10000 = 14;
               case 27 -> var10000 = 10;
               case 28 -> var10000 = 54;
               case 29 -> var10000 = 0;
               case 30 -> var10000 = 34;
               case 31 -> var10000 = 3;
               case 32 -> var10000 = 8;
               case 33 -> var10000 = 52;
               case 34 -> var10000 = 30;
               case 35 -> var10000 = 27;
               case 36 -> var10000 = 61;
               case 37 -> var10000 = 51;
               case 38 -> var10000 = 25;
               case 39 -> var10000 = 40;
               case 40 -> var10000 = 2;
               case 41 -> var10000 = 37;
               case 42 -> var10000 = 59;
               case 43 -> var10000 = 9;
               case 44 -> var10000 = 55;
               case 45 -> var10000 = 49;
               case 46 -> var10000 = 47;
               case 47 -> var10000 = 38;
               case 48 -> var10000 = 26;
               case 49 -> var10000 = 33;
               case 50 -> var10000 = 6;
               case 51 -> var10000 = 46;
               case 52 -> var10000 = 21;
               case 53 -> var10000 = 31;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 16;
               case 56 -> var10000 = 41;
               case 57 -> var10000 = 20;
               case 58 -> var10000 = 22;
               case 59 -> var10000 = 18;
               case 60 -> var10000 = 29;
               case 61 -> var10000 = 45;
               case 62 -> var10000 = 17;
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

            m[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = l;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Void.TYPE;
      m[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Boolean.TYPE;
      m[12] = "c";
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
      var10000[25] = Integer.TYPE;
      m[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = "c";
      var10000[29] = Double.TYPE;
      m[29] = "c";
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
      var10000[68] = "c";
      var10000[69] = "c";
      var10000[70] = "c";
      var10000[71] = "c";
      var10000[72] = "c";
      var10000[73] = "c";
      var10000[74] = "c";
      var10000[75] = "c";
      var10000[76] = "c";
      var10000[77] = "c";
      var10000[78] = "c";
      var10000[79] = "c";
      var10000[80] = "c";
      var10000[81] = "c";
      var10000[82] = "c";
      var10000[83] = "c";
      var10000[84] = "c";
      var10000[85] = "c";
      var10000[86] = "c";
      var10000[87] = "c";
      var10000[88] = "c";
      var10000[89] = "c";
      var10000[90] = "c";
      var10000[91] = "c";
      var10000[92] = "c";
      var10000[93] = "c";
      var10000[94] = "c";
      var10000[95] = "c";
      var10000[96] = "c";
      var10000[97] = "c";
      var10000[98] = "c";
      var10000[99] = "c";
      var10000[100] = "c";
   }

   private static native Class f(long var0, long var2);

   private static native Field c(Class var0, String var1, Class var2);

   private static native Field d(Class var0, String var1, Class var2);

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

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = m[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = f(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = c(var23, var10, var15, var13, var14);
            if (var26 != null) {
               l[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("c")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = f((long)"c", 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = d(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     l[var4] = var19;
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
               var23 = f((long)"c", 0L);
            }
         }
      }
   }

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 231 && var8 != 223 && var8 != 'k' && var8 != 'V') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'H') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'u') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 231) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 223) {
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

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
