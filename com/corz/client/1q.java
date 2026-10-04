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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import org.joml.Matrix4f;

public class 1Q extends 9a {
   private static final float 0h = 1.5F;
   private static final float 9 = 0.006F;
   private static final float 0N = 0.1F;
   private static final float 0r = 0.19F;
   private static final float 0H = 0.45F;
   private final 4H 0m;
   private final 4S 0Z;
   private final 4S 2;
   private final 4i 0O;
   private final 4A 0P;
   private class_265 0d;
   private double 3;
   private double 0b;
   private double 0t;
   private double 04;
   private double 6;
   private double 02;
   private double 0l;
   private double 0L;
   private double 0T;
   private double 0K;
   private double 0s;
   private double 0C;
   private boolean 1;
   private boolean 5;
   private float 0;
   private class_2338 7;
   private long 0J;
   private float 8;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final Object[] o;
   private static final String[] p;
   // $FF: synthetic field
   private static transient String XOuOQkaMzO;

   public _Q/* $FF was: 1Q*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _/* $FF was: 0*/();

   public void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _t/* $FF was: 6t*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _2/* $FF was: 62*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 2*/(Object[] var0) {
      long var1 = (Long)var0[1];
      float var3 = (Float)var0[0];
      var1 = b ^ var1;
      String var4 = "c";
      int var5 = var4 + "c";
      return "c" + var5 * (float)((double)(var3 - "c")).P<invokedynamic>((double)(var3 - "c"), (double)"c", (long)"c", var1) + var4 * (float)((double)(var3 - "c")).P<invokedynamic>((double)(var3 - "c"), (double)"c", (long)"c", var1);
   }

   private static float _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 1*/(double param1, double param3, double param5, double param7, double param9, double param11, Matrix4f param13, int param14, float param15, long param16, int param18, double param19, double param21, double param23, double param25, double param27, double param29) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(1Q.class, 336);
      b = com.corz.client.s.a(-3325494946280959012L, 5836716119090950914L, MethodHandles.lookup().lookupClass()).a(109232311567650L);
      o = new Object[168];
      p = new String[168];
      b();
      h = new HashMap(13);
      long var11 = b ^ 18361694804435L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "\u0088ü,#ÃÖá\u0084ßþæ½G÷£\u008b\u0010½·\b`ì\u009e9JüÜ¬uBbvg\u0010e÷^á5¼\u001dm\u00ad.%[[\u0082ôÉ\u0010hu÷q\u0007\u0089ð£¡îCùûaç\u001d";
      int var19 = "\u0088ü,#ÃÖá\u0084ßþæ½G÷£\u008b\u0010½·\b`ì\u009e9JüÜ¬uBbvg\u0010e÷^á5¼\u001dm\u00ad.%[[\u0082ôÉ\u0010hu÷q\u0007\u0089ð£¡îCùûaç\u001d".length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var17.substring(var24, var24 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     f = var20;
                     g = new String[6];
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[21];
                     int var3 = 0;
                     String var4 = "\u0092ÅÓUfO\u001c\u001e\f¹?+#iÌ(=³ÖL\u0092ð·ê\u0016\u0093oZöÇÝÉo\u0094·+BP$â¥Á|\u0098\u0094\u00adÆN×Qî+L\u0003/níHlDÛS\u000e2?\u001eêG½\u009d±\u001a\tEº\u00ad\u008aÓýµ+2;k\u0005Ä\u0097}Æ\u00ad\u00ad)Ñ\u0093\u009a\u0001¨\u0006ü\u0000\u0081\u007fÖïsN\u000bÚæ³}®\u0099é3\\IæiåÇ³\u001aÐôC*\u009cjF\u0086\u0093(îíõnSný^áõ¯ûï\u009cº\bÑqA";
                     int var5 = "\u0092ÅÓUfO\u001c\u001e\f¹?+#iÌ(=³ÖL\u0092ð·ê\u0016\u0093oZöÇÝÉo\u0094·+BP$â¥Á|\u0098\u0094\u00adÆN×Qî+L\u0003/níHlDÛS\u000e2?\u001eêG½\u009d±\u001a\tEº\u00ad\u008aÓýµ+2;k\u0005Ä\u0097}Æ\u00ad\u00ad)Ñ\u0093\u009a\u0001¨\u0006ü\u0000\u0081\u007fÖïsN\u000bÚæ³}®\u0099é3\\IæiåÇ³\u001aÐôC*\u009cjF\u0086\u0093(îíõnSný^áõ¯ûï\u009cº\bÑqA".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while(true) {
                           long var8 = var39;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    l = var6;
                                    m = new Integer[21];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Åtü#4®<\u0002\u001f]äl÷8¨!";
                                 var5 = "Åtü#4®<\u0002\u001f]äl÷8¨!".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "$\u0018\u0087\u009cÔ\u009f(\u0019a4Ì\u0091Ã\u0081Z\u001f\u0010\u0007Å\u000f\u00113'û\u0095í[Êñ'Ã0\u0089";
                  var19 = "$\u0018\u0087\u009cÔ\u009f(\u0019a4Ì\u0091Ã\u0081Z\u001f\u0010\u0007Å\u000f\u00113'û\u0095í[Êñ'Ã0\u0089".length();
                  var16 = 16;
                  var24 = -1;
            }

            ++var24;
            var25 = var17.substring(var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static native int d(int var0, long var1);

   private static native int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (p[var4] != null) {
         return var4;
      } else {
         Object var5 = o[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 23;
               case 1 -> var10000 = 38;
               case 2 -> var10000 = 31;
               case 3 -> var10000 = 8;
               case 4 -> var10000 = 27;
               case 5 -> var10000 = 3;
               case 6 -> var10000 = 53;
               case 7 -> var10000 = 20;
               case 8 -> var10000 = 45;
               case 9 -> var10000 = 62;
               case 10 -> var10000 = 41;
               case 11 -> var10000 = 29;
               case 12 -> var10000 = 0;
               case 13 -> var10000 = 47;
               case 14 -> var10000 = 43;
               case 15 -> var10000 = 49;
               case 16 -> var10000 = 21;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 16;
               case 19 -> var10000 = 52;
               case 20 -> var10000 = 30;
               case 21 -> var10000 = 10;
               case 22 -> var10000 = 25;
               case 23 -> var10000 = 1;
               case 24 -> var10000 = 12;
               case 25 -> var10000 = 51;
               case 26 -> var10000 = 28;
               case 27 -> var10000 = 32;
               case 28 -> var10000 = 11;
               case 29 -> var10000 = 13;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 9;
               case 32 -> var10000 = 59;
               case 33 -> var10000 = 18;
               case 34 -> var10000 = 55;
               case 35 -> var10000 = 46;
               case 36 -> var10000 = 54;
               case 37 -> var10000 = 5;
               case 38 -> var10000 = 58;
               case 39 -> var10000 = 63;
               case 40 -> var10000 = 2;
               case 41 -> var10000 = 44;
               case 42 -> var10000 = 15;
               case 43 -> var10000 = 33;
               case 44 -> var10000 = 7;
               case 45 -> var10000 = 57;
               case 46 -> var10000 = 40;
               case 47 -> var10000 = 35;
               case 48 -> var10000 = 42;
               case 49 -> var10000 = 26;
               case 50 -> var10000 = 37;
               case 51 -> var10000 = 56;
               case 52 -> var10000 = 36;
               case 53 -> var10000 = 17;
               case 54 -> var10000 = 39;
               case 55 -> var10000 = 48;
               case 56 -> var10000 = 24;
               case 57 -> var10000 = 19;
               case 58 -> var10000 = 60;
               case 59 -> var10000 = 14;
               case 60 -> var10000 = 50;
               case 61 -> var10000 = 22;
               case 62 -> var10000 = 34;
               default -> var10000 = 6;
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

            p[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = o;
      var10000[0] = "c";
      var10000[1] = Boolean.TYPE;
      p[1] = "c";
      var10000[2] = Float.TYPE;
      p[2] = "c";
      var10000[3] = "c";
      var10000[4] = Long.TYPE;
      p[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Double.TYPE;
      p[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Integer.TYPE;
      p[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Void.TYPE;
      p[16] = "c";
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
      var10000[165] = "c";
      var10000[166] = "c";
      var10000[167] = "c";
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = o[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(p[var4]);
            o[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static native Field c(Class var0, String var1, Class var2);

   private static native Field d(Class var0, String var1, Class var2);

   private static native Field g(long var0, long var2);

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
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = p[var4];
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
               o[var4] = var26;
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
                     o[var4] = var19;
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

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
