package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 1a extends 9a {
   private static final float 6 = 0.25F;
   private static final float 2y = 0.4F;
   private static final float 2 = 0.45F;
   private static final float 9 = 10.0F;
   private static final int 7;
   private static final int 2B;
   private final 4A 3;
   private final 4S 2J;
   private final 4A 2D;
   private final 4H 1;
   private final 4H 2F;
   private final 4H 0;
   private final 44 2k;
   private final Deque 8;
   private boolean 5;
   private int 2n;
   private static final long b;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long l;
   private static final Object[] m;
   private static final String[] n;
   // $FF: synthetic field
   private static transient String CdqgxvpsaG;

   public _a/* $FF was: 1a*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _9/* $FF was: 19*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _a/* $FF was: 5a*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 5*/(Object[] var0) {
      float var3 = (Float)var0[0];
      float var2 = (Float)var0[1];
      float var1 = (Float)var0[2];
      return var2 + (var1 - var2) * var3;
   }

   private static float _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(1a.class, 531);
      b = com.corz.client.s.a(4393506819253023139L, 3021344560891231929L, MethodHandles.lookup().lookupClass()).a(225557530301401L);
      m = new Object[140];
      n = new String[140];
      b();
      h = new HashMap(13);
      long var5 = b ^ 102461160315599L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[29];
      int var10 = 0;
      String var11 = "(Æ5Î¸\u001cõZ\u0002\u007f¹¸B\u007f\u001a\u0085rçéi3\u009e\u0006ü\u0014\u0089s\u008a]\u0010\u009d§\\3:\u008d\u0085\u008fhTýAUfwÍ\u009eL(Ð'\u0002\u0003oH¥\u0001\u0084j\u0006[I%<W\u00169È\u0013\u0007{\u0082]>ÿôÎ7µG§ºY\u009bÊ\u0017Lq5\n'ñkJ\u0017\u0013àÕ\u0017Þ9Vÿ\u008b|)Y#EÈ@µx\u0007\u0095\u0088\u0004\u0085óH:Ã\u0080ça\u0002¶#ªã$\u0085«\u00835¹Ðë\u009bu¹Û\"\u0001<\u009dÙf Å^\u0000#ðål\u00031¥Á¯éÒÔu\":S\u007fQ\u0094c5Õ\u000e©ÐÆ\u000f1mÝ\u0019utA\u0080\n{ß\u00ad\u007fyBé![K\u0017-:\u0089Ôº®\u0097\u0080ý\u0011ÿw»:±ï\u0001";
      int var12 = "(Æ5Î¸\u001cõZ\u0002\u007f¹¸B\u007f\u001a\u0085rçéi3\u009e\u0006ü\u0014\u0089s\u008a]\u0010\u009d§\\3:\u008d\u0085\u008fhTýAUfwÍ\u009eL(Ð'\u0002\u0003oH¥\u0001\u0084j\u0006[I%<W\u00169È\u0013\u0007{\u0082]>ÿôÎ7µG§ºY\u009bÊ\u0017Lq5\n'ñkJ\u0017\u0013àÕ\u0017Þ9Vÿ\u008b|)Y#EÈ@µx\u0007\u0095\u0088\u0004\u0085óH:Ã\u0080ça\u0002¶#ªã$\u0085«\u00835¹Ðë\u009bu¹Û\"\u0001<\u009dÙf Å^\u0000#ðål\u00031¥Á¯éÒÔu\":S\u007fQ\u0094c5Õ\u000e©ÐÆ\u000f1mÝ\u0019utA\u0080\n{ß\u00ad\u007fyBé![K\u0017-:\u0089Ôº®\u0097\u0080ý\u0011ÿw»:±ï\u0001".length();
      int var9 = 0;

      label33:
      while(true) {
         int var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         long[] var19 = var13;
         var10001 = var10++;
         long var24 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
         byte var28 = -1;

         while(true) {
            long var15 = var24;
            byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
            long var31 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
            switch (var28) {
               case 0:
                  var19[var10001] = var31;
                  if (var9 >= var12) {
                     f = var13;
                     g = new Integer[29];
                     2B = true.z<invokedynamic>(15767, var5 ^ 6831082556842629522L);
                     7 = true.z<invokedynamic>(7839, var5 ^ 3605724197476858510L);
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var26 = SecretKeyFactory.getInstance("DES");
                     byte[] var30 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var30[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var26.generateSecret(new DESKeySpec(var30)), new IvParameterSpec(new byte[8]));
                     long var2 = -9161802629252770434L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     l = var27;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var9 < var12) {
                     continue label33;
                  }

                  var11 = "\u0000÷t©¶À\u0019-¨±\u008f\u0096èÀ«z";
                  var12 = "\u0000÷t©¶À\u0019-¨±\u008f\u0096èÀ«z".length();
                  var9 = 0;
            }

            var10001 = var9;
            var9 += 8;
            var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
            var19 = var13;
            var10001 = var10++;
            var24 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
            var28 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int b(int var0, long var1);

   private static int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (n[var4] != null) {
         return var4;
      } else {
         Object var5 = m[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 27;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 13;
               case 3 -> var10000 = 23;
               case 4 -> var10000 = 3;
               case 5 -> var10000 = 63;
               case 6 -> var10000 = 6;
               case 7 -> var10000 = 44;
               case 8 -> var10000 = 7;
               case 9 -> var10000 = 9;
               case 10 -> var10000 = 20;
               case 11 -> var10000 = 41;
               case 12 -> var10000 = 14;
               case 13 -> var10000 = 51;
               case 14 -> var10000 = 32;
               case 15 -> var10000 = 33;
               case 16 -> var10000 = 21;
               case 17 -> var10000 = 18;
               case 18 -> var10000 = 43;
               case 19 -> var10000 = 25;
               case 20 -> var10000 = 54;
               case 21 -> var10000 = 55;
               case 22 -> var10000 = 11;
               case 23 -> var10000 = 24;
               case 24 -> var10000 = 40;
               case 25 -> var10000 = 53;
               case 26 -> var10000 = 34;
               case 27 -> var10000 = 4;
               case 28 -> var10000 = 26;
               case 29 -> var10000 = 60;
               case 30 -> var10000 = 28;
               case 31 -> var10000 = 19;
               case 32 -> var10000 = 62;
               case 33 -> var10000 = 16;
               case 34 -> var10000 = 59;
               case 35 -> var10000 = 1;
               case 36 -> var10000 = 35;
               case 37 -> var10000 = 5;
               case 38 -> var10000 = 42;
               case 39 -> var10000 = 30;
               case 40 -> var10000 = 57;
               case 41 -> var10000 = 39;
               case 42 -> var10000 = 12;
               case 43 -> var10000 = 61;
               case 44 -> var10000 = 2;
               case 45 -> var10000 = 38;
               case 46 -> var10000 = 36;
               case 47 -> var10000 = 31;
               case 48 -> var10000 = 46;
               case 49 -> var10000 = 15;
               case 50 -> var10000 = 37;
               case 51 -> var10000 = 17;
               case 52 -> var10000 = 58;
               case 53 -> var10000 = 8;
               case 54 -> var10000 = 29;
               case 55 -> var10000 = 22;
               case 56 -> var10000 = 10;
               case 57 -> var10000 = 47;
               case 58 -> var10000 = 0;
               case 59 -> var10000 = 49;
               case 60 -> var10000 = 52;
               case 61 -> var10000 = 56;
               case 62 -> var10000 = 50;
               default -> var10000 = 48;
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

            n[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = m;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Float.TYPE;
      n[2] = "c";
      var10000[3] = "c";
      var10000[4] = Double.TYPE;
      n[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = Void.TYPE;
      n[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Integer.TYPE;
      n[13] = "c";
      var10000[14] = Boolean.TYPE;
      n[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = Long.TYPE;
      n[24] = "c";
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
   }

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
      Object var5 = m[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = n[var4];
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
               m[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     m[var4] = var13;
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
      Object var5 = m[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = n[var4];
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
               m[var4] = var26;
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
                     m[var4] = var19;
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
