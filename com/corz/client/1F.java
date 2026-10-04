package com.corz.client;

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
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_746;

public class 1f extends 9a {
   private final 4A 9;
   private final 44 2;
   private final 4H 3;
   private final 4H 7;
   private final 4H 0;
   private final 4A 1;
   private class_1657 5;
   private static final long b;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final Object[] l;
   private static final String[] m;
   // $FF: synthetic field
   private static transient String dWQmWVjNnd;

   public _f/* $FF was: 1f*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public double _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected native void _U/* $FF was: 1U*/();

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private List _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_1657 _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private List _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private float[] _/* $FF was: 9*/(Object[] var1) {
      long var3 = (Long)var1[1];
      class_243 var2 = (class_243)var1[0];
      var3 = b ^ var3;
      class_746 var10000 = "c".ü<invokedynamic>((long)"c", var3).¢<invokedynamic>("c".ü<invokedynamic>((long)"c", var3), (long)"c", var3);
      class_243 var5 = var10000.Ö<invokedynamic>(var10000, (long)"c", var3);
      double var6 = var2.¢<invokedynamic>(var2, (long)"c", var3) - var5.¢<invokedynamic>(var5, (long)"c", var3);
      double var8 = var2.¢<invokedynamic>(var2, (long)"c", var3) - var5.¢<invokedynamic>(var5, (long)"c", var3);
      double var10 = var2.¢<invokedynamic>(var2, (long)"c", var3) - var5.¢<invokedynamic>(var5, (long)"c", var3);
      double var12 = (var6 * var6 + var10 * var10).Í<invokedynamic>(var6 * var6 + var10 * var10, (long)"c", var3);
      double var17 = var10.Í<invokedynamic>(var10, var6, (long)"c", var3);
      float var14 = (float)var17.Í<invokedynamic>(var17, (long)"c", var3) - "c";
      var17 = var8.Í<invokedynamic>(var8, var12, (long)"c", var3);
      float var15 = (float)(-var17.Í<invokedynamic>(var17, (long)"c", var3));
      return new float[]{var14, var15};
   }

   private int _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 7*/(long var0, class_2338 var2) {
      var0 = b ^ var0;
      7Mj[] var3 = "c".Í<invokedynamic>((long)"c", var0);

      boolean var10000;
      label32: {
         try {
            var10000 = "c".ü<invokedynamic>((long)"c", var0).¢<invokedynamic>("c".ü<invokedynamic>((long)"c", var0), (long)"c", var0).Ö<invokedynamic>("c".ü<invokedynamic>((long)"c", var0).¢<invokedynamic>("c".ü<invokedynamic>((long)"c", var0), (long)"c", var0), var2, (long)"c", var0).Ö<invokedynamic>("c".ü<invokedynamic>((long)"c", var0).¢<invokedynamic>("c".ü<invokedynamic>((long)"c", var0), (long)"c", var0).Ö<invokedynamic>("c".ü<invokedynamic>((long)"c", var0).¢<invokedynamic>("c".ü<invokedynamic>((long)"c", var0), (long)"c", var0), var2, (long)"c", var0), (long)"c", var0);
            if (var3 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var4) {
            throw var4.Í<invokedynamic>(var4, (long)"c", var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      a.b99571f71427e3b19.a.init(1f.class, 612);
      b = com.corz.client.s.a(2414740725324778393L, 8582817648606505492L, MethodHandles.lookup().lookupClass()).a(57988162781398L);
      l = new Object[165];
      m = new String[165];
      b();
      h = new HashMap(13);
      long var0 = b ^ 36917416758718L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[17];
      int var5 = 0;
      String var6 = "úÖB^Oâ \u0099ÓEB\f\u0099S\u0017h\u000fÕ\u008aZIª\u008d\u0002-\u001cé\u0017y\bô²\b\u0019å¸È\u0007j\u0081nB\u0004re\u0016\u0018ØÇ\u0007\u009bGgsÅ½\u008füM\u008bÏ\u0004\u0012½ò×øÀ\u008bòx\u009e.\u0016-\u0016¢\u0019\u008e\u000f\u008c¥Í,\u0080õ\u0011Ù`¯À~ó\u001bâÊ\u008fù\u0001\u001d\u0087öÀÝáû1²xq;ÞÝ\u0017\u008e\u001a\u009dGýÞ";
      int var7 = "úÖB^Oâ \u0099ÓEB\f\u0099S\u0017h\u000fÕ\u008aZIª\u008d\u0002-\u001cé\u0017y\bô²\b\u0019å¸È\u0007j\u0081nB\u0004re\u0016\u0018ØÇ\u0007\u009bGgsÅ½\u008füM\u008bÏ\u0004\u0012½ò×øÀ\u008bòx\u009e.\u0016-\u0016¢\u0019\u008e\u000f\u008c¥Í,\u0080õ\u0011Ù`¯À~ó\u001bâÊ\u008fù\u0001\u001d\u0087öÀÝáû1²xq;ÞÝ\u0017\u008e\u001a\u009dGýÞ".length();
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
                     g = new Integer[17];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "%ÄÖ3Q/t*Átá°\u00ad®\u0087s";
                  var7 = "%ÄÖ3Q/t*Átá°\u00ad®\u0087s".length();
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

   private static int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

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
               case 0 -> var10000 = 41;
               case 1 -> var10000 = 31;
               case 2 -> var10000 = 49;
               case 3 -> var10000 = 61;
               case 4 -> var10000 = 15;
               case 5 -> var10000 = 46;
               case 6 -> var10000 = 26;
               case 7 -> var10000 = 53;
               case 8 -> var10000 = 19;
               case 9 -> var10000 = 57;
               case 10 -> var10000 = 56;
               case 11 -> var10000 = 60;
               case 12 -> var10000 = 7;
               case 13 -> var10000 = 8;
               case 14 -> var10000 = 38;
               case 15 -> var10000 = 11;
               case 16 -> var10000 = 6;
               case 17 -> var10000 = 17;
               case 18 -> var10000 = 37;
               case 19 -> var10000 = 28;
               case 20 -> var10000 = 1;
               case 21 -> var10000 = 0;
               case 22 -> var10000 = 29;
               case 23 -> var10000 = 45;
               case 24 -> var10000 = 22;
               case 25 -> var10000 = 39;
               case 26 -> var10000 = 48;
               case 27 -> var10000 = 44;
               case 28 -> var10000 = 54;
               case 29 -> var10000 = 35;
               case 30 -> var10000 = 62;
               case 31 -> var10000 = 34;
               case 32 -> var10000 = 36;
               case 33 -> var10000 = 50;
               case 34 -> var10000 = 14;
               case 35 -> var10000 = 30;
               case 36 -> var10000 = 10;
               case 37 -> var10000 = 51;
               case 38 -> var10000 = 25;
               case 39 -> var10000 = 27;
               case 40 -> var10000 = 5;
               case 41 -> var10000 = 24;
               case 42 -> var10000 = 42;
               case 43 -> var10000 = 63;
               case 44 -> var10000 = 32;
               case 45 -> var10000 = 2;
               case 46 -> var10000 = 55;
               case 47 -> var10000 = 4;
               case 48 -> var10000 = 43;
               case 49 -> var10000 = 13;
               case 50 -> var10000 = 40;
               case 51 -> var10000 = 21;
               case 52 -> var10000 = 16;
               case 53 -> var10000 = 52;
               case 54 -> var10000 = 33;
               case 55 -> var10000 = 59;
               case 56 -> var10000 = 3;
               case 57 -> var10000 = 9;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 23;
               case 60 -> var10000 = 47;
               case 61 -> var10000 = 18;
               case 62 -> var10000 = 12;
               default -> var10000 = 20;
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
      var10000[1] = Double.TYPE;
      m[1] = "c";
      var10000[2] = "c";
      var10000[3] = Boolean.TYPE;
      m[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Float.TYPE;
      m[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Integer.TYPE;
      m[16] = "c";
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
      var10000[28] = Void.TYPE;
      m[28] = "c";
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
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
      var10000[105] = "c";
      var10000[106] = "c";
      var10000[107] = "c";
      var10000[108] = "c";
      var10000[109] = "c";
      var10000[110] = "c";
      var10000[111] = "c";
      var10000[112] = "c";
      var10000[113] = "c";
      var10000[114] = "c";
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
      var10000[136] = "c";
      var10000[137] = "c";
      var10000[138] = "c";
      var10000[139] = "c";
      var10000[140] = "c";
      var10000[141] = "c";
      var10000[142] = "c";
      var10000[143] = "c";
      var10000[144] = "c";
      var10000[145] = "c";
      var10000[146] = "c";
      var10000[147] = "c";
      var10000[148] = "c";
      var10000[149] = "c";
      var10000[150] = "c";
      var10000[151] = "c";
      var10000[152] = "c";
      var10000[153] = "c";
      var10000[154] = "c";
      var10000[155] = "c";
      var10000[156] = "c";
      var10000[157] = "c";
      var10000[158] = "c";
      var10000[159] = "c";
      var10000[160] = "c";
      var10000[161] = "c";
      var10000[162] = "c";
      var10000[163] = "c";
      var10000[164] = "c";
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = l[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(m[var4]);
            l[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

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

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

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

   private static native MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

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
