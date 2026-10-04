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
import net.minecraft.class_1703;

public class 1G extends 9a {
   private final 4i 5;
   private final 44 2;
   private final 4H 8;
   private 7cn 7;
   private String 9;
   private long 6;
   private int 0;
   private long 1;
   private boolean 3;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long[] o;
   private static final Long[] p;
   private static final Map q;
   private static final Object[] t;
   private static final String[] u;
   // $FF: synthetic field
   private static transient String DcKaUNZWaE;

   public _G/* $FF was: 1G*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _U/* $FF was: 1U*/();

   public native void _/* $FF was: 0*/();

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _Z/* $FF was: 0Z*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _h/* $FF was: 0h*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _B/* $FF was: 0B*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _7/* $FF was: 07*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_1703 _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _M/* $FF was: 8M*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _e/* $FF was: 8e*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _l/* $FF was: 8l*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(1G.class, 203);
      b = com.corz.client.s.a(-7465779770621648693L, -540022146213298635L, MethodHandles.lookup().lookupClass()).a(77422039420264L);
      t = new Object[173];
      u = new String[173];
      b();
      h = new HashMap(13);
      long var22 = b ^ 105066761731294L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[12];
      int var29 = 0;
      String var28 = "A\u0001êF\u0086K\\\u0010\u009bßºªÊ9\u007f×\u0010H\u001aO¢â\u0002\u0089v(Np{H\u000eÄå\u0010R¡¬\u0095rÁ=O\u0088[\u0092ª|Ëû'@ê%\f\u001aN\u008f;«\u0094gþ¡\u0003Ò\u0080tð®s\u0091Ð\u008cÆÕ2ïã£ÄàÂ]\u0014û\u001b\u009bÎ°o\u0093L×\u0087næ`A³\u008fÂs\nÅ\u0003\u009fyýÊHÓ\u0098Ä.\t\u0010Z\u008dõ`V¬þ®rU\u0088Ð\u0016\u0003\u009c\u0088\u0010#a\u0099\u0081/r¶ø\u0082çR%Dj\u000eÖ\u0010\u008a\b]À\u001a#y,\u0007B\u0091ò$Ïã¬\u0010D\"í\u008b*bòõvn«Æ¦}¢g\u0010qÃ\u0011ãÚc\bâÅM:?Ô\u0001\u0093r\u0010X\u0085àÐv¾b¹9u\u000b*ø\u001e«\u009f";
      int var30 = "A\u0001êF\u0086K\\\u0010\u009bßºªÊ9\u007f×\u0010H\u001aO¢â\u0002\u0089v(Np{H\u000eÄå\u0010R¡¬\u0095rÁ=O\u0088[\u0092ª|Ëû'@ê%\f\u001aN\u008f;«\u0094gþ¡\u0003Ò\u0080tð®s\u0091Ð\u008cÆÕ2ïã£ÄàÂ]\u0014û\u001b\u009bÎ°o\u0093L×\u0087næ`A³\u008fÂs\nÅ\u0003\u009fyýÊHÓ\u0098Ä.\t\u0010Z\u008dõ`V¬þ®rU\u0088Ð\u0016\u0003\u009c\u0088\u0010#a\u0099\u0081/r¶ø\u0082çR%Dj\u000eÖ\u0010\u008a\b]À\u001a#y,\u0007B\u0091ò$Ïã¬\u0010D\"í\u008b*bòõvn«Æ¦}¢g\u0010qÃ\u0011ãÚc\bâÅM:?Ô\u0001\u0093r\u0010X\u0085àÐv¾b¹9u\u000b*ø\u001e«\u009f".length();
      char var27 = 16;
      int var36 = -1;

      label81:
      while(true) {
         ++var36;
         String var37 = var28.substring(var36, var36 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = b(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     f = var31;
                     g = new String[12];
                     n = new HashMap(13);
                     Cipher var11;
                     Cipher var39 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var39.init(2, var55.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[11];
                     int var14 = 0;
                     String var15 = "ÔM\u0095áR¯úZ2¨\u00101á\u0088«fÄÅtè4/\u009ewpö\u008csyí\f\\ë \u0007¬ÑÓ/gN¦Ù[G\u0089¶m\u007f\u008b\u008a\bO+ÐE\\ª³5ø\u0000,¦÷\u0088âÝ\u0090ü%º";
                     int var16 = "ÔM\u0095áR¯úZ2¨\u00101á\u0088«fÄÅtè4/\u009ewpö\u008csyí\f\\ë \u0007¬ÑÓ/gN¦Ù[G\u0089¶m\u007f\u008b\u008a\bO+ÐE\\ª³5ø\u0000,¦÷\u0088âÝ\u0090ü%º".length();
                     int var13 = 0;

                     label63:
                     while(true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var56 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte var63 = -1;

                        while(true) {
                           long var19 = var56;
                           byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                           long var68 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                           switch (var63) {
                              case 0:
                                 var40[var10001] = var68;
                                 if (var13 >= var16) {
                                    l = var17;
                                    m = new Integer[11];
                                    q = new HashMap(13);
                                    Cipher var0;
                                    Cipher var41 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var58 = SecretKeyFactory.getInstance("DES");
                                    byte[] var65 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var65[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var41.init(2, var58.generateSecret(new DESKeySpec(var65)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "\u000fÀ§[\u009a6yt¯\u0094ÆAJæès";
                                    int var5 = "\u000fÀ§[\u009a6yt¯\u0094ÆAJæès".length();
                                    int var2 = 0;

                                    label47:
                                    while(true) {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                       long[] var42 = var6;
                                       var10001 = var3++;
                                       long var59 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                       byte var66 = -1;

                                       while(true) {
                                          long var8 = var59;
                                          byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                          var68 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                          switch (var66) {
                                             case 0:
                                                var42[var10001] = var68;
                                                if (var2 >= var5) {
                                                   o = var6;
                                                   p = new Long[4];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var10001] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "¡\u0081¼É\u0011\u008eÔ[\u0097rÓº\u0090ñ\u0006\u0097";
                                                var5 = "¡\u0081¼É\u0011\u008eÔ[\u0097rÓº\u0090ñ\u0006\u0097".length();
                                                var2 = 0;
                                          }

                                          var10001 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                          var42 = var6;
                                          var10001 = var3++;
                                          var59 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                          var66 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var68;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "5sì7Æ,]æ»×ò\u0002³\u0014L\u008c";
                                 var16 = "5sì7Æ,]æ»×ò\u0002³\u0014L\u008c".length();
                                 var13 = 0;
                           }

                           var10001 = var13;
                           var13 += 8;
                           var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var56 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                           var63 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var36);
                  break;
               default:
                  var31[var29++] = var53;
                  if ((var36 += var27) < var30) {
                     var27 = var28.charAt(var36);
                     continue label81;
                  }

                  var28 = "BàÎr|<KY= \u000eZ B\u0092\u0007\u0010#é¾ú0\u0080ýðü\u0086]ºÊ¸®â";
                  var30 = "BàÎr|<KY= \u000eZ B\u0092\u0007\u0010#é¾ú0\u0080ýðü\u0086]ºÊ¸®â".length();
                  var27 = 16;
                  var36 = -1;
            }

            ++var36;
            var37 = var28.substring(var36, var36 + var27);
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

   private static native String b(int var0, long var1);

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static long e(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long e(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (u[var4] != null) {
         return var4;
      } else {
         Object var5 = t[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 37;
               case 1 -> var10000 = 54;
               case 2 -> var10000 = 23;
               case 3 -> var10000 = 4;
               case 4 -> var10000 = 13;
               case 5 -> var10000 = 7;
               case 6 -> var10000 = 43;
               case 7 -> var10000 = 30;
               case 8 -> var10000 = 58;
               case 9 -> var10000 = 17;
               case 10 -> var10000 = 50;
               case 11 -> var10000 = 36;
               case 12 -> var10000 = 1;
               case 13 -> var10000 = 35;
               case 14 -> var10000 = 3;
               case 15 -> var10000 = 41;
               case 16 -> var10000 = 47;
               case 17 -> var10000 = 28;
               case 18 -> var10000 = 32;
               case 19 -> var10000 = 57;
               case 20 -> var10000 = 21;
               case 21 -> var10000 = 48;
               case 22 -> var10000 = 33;
               case 23 -> var10000 = 44;
               case 24 -> var10000 = 40;
               case 25 -> var10000 = 22;
               case 26 -> var10000 = 62;
               case 27 -> var10000 = 26;
               case 28 -> var10000 = 6;
               case 29 -> var10000 = 18;
               case 30 -> var10000 = 16;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 46;
               case 33 -> var10000 = 14;
               case 34 -> var10000 = 55;
               case 35 -> var10000 = 53;
               case 36 -> var10000 = 20;
               case 37 -> var10000 = 49;
               case 38 -> var10000 = 10;
               case 39 -> var10000 = 42;
               case 40 -> var10000 = 0;
               case 41 -> var10000 = 63;
               case 42 -> var10000 = 15;
               case 43 -> var10000 = 52;
               case 44 -> var10000 = 8;
               case 45 -> var10000 = 24;
               case 46 -> var10000 = 39;
               case 47 -> var10000 = 27;
               case 48 -> var10000 = 51;
               case 49 -> var10000 = 59;
               case 50 -> var10000 = 60;
               case 51 -> var10000 = 45;
               case 52 -> var10000 = 2;
               case 53 -> var10000 = 61;
               case 54 -> var10000 = 38;
               case 55 -> var10000 = 31;
               case 56 -> var10000 = 25;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 34;
               case 59 -> var10000 = 56;
               case 60 -> var10000 = 29;
               case 61 -> var10000 = 12;
               case 62 -> var10000 = 19;
               default -> var10000 = 9;
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

            u[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = t;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Void.TYPE;
      u[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Boolean.TYPE;
      u[11] = "c";
      var10000[12] = Integer.TYPE;
      u[12] = "c";
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
      var10000[31] = Long.TYPE;
      u[31] = "c";
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
      var10000[168] = "c";
      var10000[169] = "c";
      var10000[170] = "c";
      var10000[171] = "c";
      var10000[172] = "c";
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = t[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(u[var4]);
            t[var4] = var5;
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
      Object var5 = t[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = u[var4];
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
               t[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     t[var4] = var13;
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

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

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
         if (var8 != 219 && var8 != 'G' && var8 != 'u' && var8 != 212) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 248) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 249) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 219) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'G') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'u') {
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

   private static CallSite g(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
