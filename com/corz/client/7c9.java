package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2768;
import net.minecraft.class_2350.class_2351;

// $FF: synthetic class
public class 7c9 {
   static final int[] 6;
   static final int[] 3t;
   static final int[] 3F;
   static final int[] 7;
   static final int[] 3W;
   static final int[] 3x;
   static final int[] 8;
   static final int[] 1;
   static final int[] 3;
   static final int[] 9;
   static final int[] 3m;
   static final int[] 4;
   static final int[] 0;
   static final int[] 2;
   static final int[] 3G;
   static final int[] 5;
   // $FF: synthetic field
   private static transient String PMcaLlSppk;

   static {
      long var11 = s.a(-5044616896597130093L, -974592433772385751L, MethodHandles.lookup().lookupClass()).a(231218185581465L) ^ 40031407406989L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[7];
      int var4 = 0;
      String var5 = "7\u009d\u0084\u008fþ)\nJX±\u001e°Ðtý5\u0080\u000f¨\u0010$*ýÍFw\u0017\u0000\u001dÎgH)\u0094JtV@Ñ$";
      int var6 = "7\u009d\u0084\u008fþ)\nJX±\u001e°Ðtý5\u0080\u000f¨\u0010$*ýÍFw\u0017\u0000\u001dÎgH)\u0094JtV@Ñ$".length();
      int var3 = 0;

      label501:
      while(true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var89 = var0;
         var10001 = var4++;
         long var92 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var94 = -1;

         while(true) {
            long var8 = var92;
            byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var96 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var94) {
               case 0:
                  var89[var10001] = var96;
                  if (var3 >= var6) {
                     5 = new int[7tB.values().length];

                     try {
                        5[7tB.1.ordinal()] = 1;
                     } catch (NoSuchFieldError var87) {
                     }

                     try {
                        5[7tB.6.ordinal()] = 2;
                     } catch (NoSuchFieldError var86) {
                     }

                     try {
                        5[7tB.9.ordinal()] = 3;
                     } catch (NoSuchFieldError var85) {
                     }

                     try {
                        5[7tB.7.ordinal()] = 4;
                     } catch (NoSuchFieldError var84) {
                     }

                     3G = new int[3V.values().length];

                     try {
                        3G[3V.1.ordinal()] = 1;
                     } catch (NoSuchFieldError var83) {
                     }

                     try {
                        3G[3V.2.ordinal()] = 2;
                     } catch (NoSuchFieldError var82) {
                     }

                     try {
                        3G[3V.6.ordinal()] = 3;
                     } catch (NoSuchFieldError var81) {
                     }

                     2 = new int[com.corz.client.3x.values().length];

                     try {
                        2[com.corz.client.3x.6.ordinal()] = 1;
                     } catch (NoSuchFieldError var80) {
                     }

                     try {
                        2[com.corz.client.3x.4.ordinal()] = 2;
                     } catch (NoSuchFieldError var79) {
                     }

                     try {
                        2[com.corz.client.3x.8.ordinal()] = 3;
                     } catch (NoSuchFieldError var78) {
                     }

                     0 = new int[76h.values().length];

                     try {
                        0[76h.9.ordinal()] = 1;
                     } catch (NoSuchFieldError var77) {
                     }

                     try {
                        0[76h.2.ordinal()] = 2;
                     } catch (NoSuchFieldError var76) {
                     }

                     try {
                        0[76h.8.ordinal()] = 3;
                     } catch (NoSuchFieldError var75) {
                     }

                     try {
                        0[76h.6.ordinal()] = 4;
                     } catch (NoSuchFieldError var74) {
                     }

                     try {
                        0[76h.5.ordinal()] = 5;
                     } catch (NoSuchFieldError var73) {
                     }

                     4 = new int[3d.values().length];

                     try {
                        4[3d.5.ordinal()] = 1;
                     } catch (NoSuchFieldError var72) {
                     }

                     try {
                        4[3d.1.ordinal()] = 2;
                     } catch (NoSuchFieldError var71) {
                     }

                     try {
                        4[3d.6.ordinal()] = 3;
                     } catch (NoSuchFieldError var70) {
                     }

                     try {
                        4[3d.0.ordinal()] = 4;
                     } catch (NoSuchFieldError var69) {
                     }

                     try {
                        4[3d.9.ordinal()] = 5;
                     } catch (NoSuchFieldError var68) {
                     }

                     try {
                        4[3d.7.ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var67) {
                     }

                     try {
                        4[3d.4.ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var66) {
                     }

                     3m = new int[class_2768.values().length];

                     try {
                        3m[class_2768.field_12665.ordinal()] = 1;
                     } catch (NoSuchFieldError var65) {
                     }

                     try {
                        3m[class_2768.field_12670.ordinal()] = 2;
                     } catch (NoSuchFieldError var64) {
                     }

                     try {
                        3m[class_2768.field_12668.ordinal()] = 3;
                     } catch (NoSuchFieldError var63) {
                     }

                     try {
                        3m[class_2768.field_12674.ordinal()] = 4;
                     } catch (NoSuchFieldError var62) {
                     }

                     try {
                        3m[class_2768.field_12667.ordinal()] = 5;
                     } catch (NoSuchFieldError var61) {
                     }

                     try {
                        3m[class_2768.field_12666.ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var60) {
                     }

                     try {
                        3m[class_2768.field_12664.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var59) {
                     }

                     try {
                        3m[class_2768.field_12671.ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var58) {
                     }

                     try {
                        3m[class_2768.field_12672.ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var57) {
                     }

                     try {
                        3m[class_2768.field_12663.ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var56) {
                     }

                     9 = new int[9e.values().length];

                     try {
                        9[9e.3.ordinal()] = 1;
                     } catch (NoSuchFieldError var55) {
                     }

                     try {
                        9[9e.2.ordinal()] = 2;
                     } catch (NoSuchFieldError var54) {
                     }

                     try {
                        9[9e.5.ordinal()] = 3;
                     } catch (NoSuchFieldError var53) {
                     }

                     try {
                        9[9e.1.ordinal()] = 4;
                     } catch (NoSuchFieldError var52) {
                     }

                     3 = new int[9X.values().length];

                     try {
                        3[9X.7.ordinal()] = 1;
                     } catch (NoSuchFieldError var51) {
                     }

                     try {
                        3[9X.0.ordinal()] = 2;
                     } catch (NoSuchFieldError var50) {
                     }

                     try {
                        3[9X.6.ordinal()] = 3;
                     } catch (NoSuchFieldError var49) {
                     }

                     try {
                        3[9X.3.ordinal()] = 4;
                     } catch (NoSuchFieldError var48) {
                     }

                     try {
                        3[9X.5.ordinal()] = 5;
                     } catch (NoSuchFieldError var47) {
                     }

                     1 = new int[2y.values().length];

                     try {
                        1[2y.3.ordinal()] = 1;
                     } catch (NoSuchFieldError var46) {
                     }

                     try {
                        1[2y.2.ordinal()] = 2;
                     } catch (NoSuchFieldError var45) {
                     }

                     try {
                        1[2y.1.ordinal()] = 3;
                     } catch (NoSuchFieldError var44) {
                     }

                     try {
                        1[2y.5.ordinal()] = 4;
                     } catch (NoSuchFieldError var43) {
                     }

                     8 = new int[class_2351.values().length];

                     try {
                        8[class_2351.field_11048.ordinal()] = 1;
                     } catch (NoSuchFieldError var42) {
                     }

                     try {
                        8[class_2351.field_11052.ordinal()] = 2;
                     } catch (NoSuchFieldError var41) {
                     }

                     try {
                        8[class_2351.field_11051.ordinal()] = 3;
                     } catch (NoSuchFieldError var40) {
                     }

                     3x = new int[3p.values().length];

                     try {
                        3x[3p.4.ordinal()] = 1;
                     } catch (NoSuchFieldError var39) {
                     }

                     try {
                        3x[3p.0.ordinal()] = 2;
                     } catch (NoSuchFieldError var38) {
                     }

                     try {
                        3x[3p.9.ordinal()] = 3;
                     } catch (NoSuchFieldError var37) {
                     }

                     3W = new int[7O5.values().length];

                     try {
                        3W[7O5.0.ordinal()] = 1;
                     } catch (NoSuchFieldError var36) {
                     }

                     try {
                        3W[7O5.8.ordinal()] = 2;
                     } catch (NoSuchFieldError var35) {
                     }

                     try {
                        3W[7O5.1.ordinal()] = 3;
                     } catch (NoSuchFieldError var34) {
                     }

                     try {
                        3W[7O5.7.ordinal()] = 4;
                     } catch (NoSuchFieldError var33) {
                     }

                     7 = new int[7m.values().length];

                     try {
                        7[7m.3.ordinal()] = 1;
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        7[7m.2.ordinal()] = 2;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        7[7m.5.ordinal()] = 3;
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        7[7m.6.ordinal()] = 4;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        7[7m.0.ordinal()] = 5;
                     } catch (NoSuchFieldError var28) {
                     }

                     3F = new int[7ce.values().length];

                     try {
                        3F[7ce.5.ordinal()] = 1;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        3F[7ce.4.ordinal()] = 2;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        3F[7ce.8.ordinal()] = 3;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        3F[7ce.7.ordinal()] = 4;
                     } catch (NoSuchFieldError var24) {
                     }

                     3t = new int[7F4.values().length];

                     try {
                        3t[7F4.9.ordinal()] = 1;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        3t[7F4.0.ordinal()] = 2;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        3t[7F4.4.ordinal()] = 3;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        3t[7F4.2.ordinal()] = 4;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        3t[7F4.7.ordinal()] = 5;
                     } catch (NoSuchFieldError var19) {
                     }

                     6 = new int[8e.values().length];

                     try {
                        6[8e.1.ordinal()] = 1;
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        6[8e.3.ordinal()] = 2;
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        6[8e.5.ordinal()] = 3;
                     } catch (NoSuchFieldError var16) {
                     }

                     try {
                        6[8e.2.ordinal()] = 4;
                     } catch (NoSuchFieldError var15) {
                     }

                     try {
                        6[8e.8.ordinal()] = 5;
                     } catch (NoSuchFieldError var14) {
                     }

                     return;
                  }
                  break;
               default:
                  var89[var10001] = var96;
                  if (var3 < var6) {
                     continue label501;
                  }

                  var5 = ".\u0012f\u0095Ôrï³)G\u0019\u008d¸¯,\u0095";
                  var6 = ".\u0012f\u0095Ôrï³)G\u0019\u008d¸¯,\u0095".length();
                  var3 = 0;
            }

            var10001 = var3;
            var3 += 8;
            var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
            var89 = var0;
            var10001 = var4++;
            var92 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var94 = 0;
         }
      }
   }
}
