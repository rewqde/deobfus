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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2680;

public class 2H extends 9a {
   private final 44 1;
   private final 4H 83;
   private final 4H 7;
   private final 4H 81;
   private final 4H 88;
   private final 4H 9;
   private final 4H 8v;
   private final 44 8y;
   private final 44 6;
   private final 44 5;
   private final 4H 8G;
   private final 44 8R;
   private final 4H 8h;
   private final 44 87;
   private final 4H 0;
   private final 4i 8j;
   private static final double 8i = (double)6.0F;
   private static final double 8E = (double)2.0F;
   private static final int 8C;
   private static final int 2;
   private final Map 8;
   private final Map 8t;
   private final Set 8I;
   private volatile List 3;
   private volatile List 8m;
   private int 80;
   private static final long 8n;
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
   private static transient String vlikGxLBis;

   public _H/* $FF was: 2H*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   private int _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _U/* $FF was: 1U*/() {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private 02 _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _7/* $FF was: 87*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private List _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7c5 _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 8*/(long var0, 7c5 var2) {
      var0 = b ^ var0;
      return var2.z<invokedynamic>(var2, (long)"c", var0);
   }

   private static boolean _/* $FF was: 3*/(boolean param0, long param1, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, class_2680 param8) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 2*/(long param0, class_1923 param2, int param3, Long param4) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 8*/(class_1923 param0, int param1, long param2, Long param4) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 2*/(long var0, class_1923 var2, class_1923 var3) {
      var0 = b ^ var0;
      int var10000 = (var3.z<invokedynamic>(var3, (long)"c", var0) - var2.z<invokedynamic>(var2, (long)"c", var0)).$<invokedynamic>(var3.z<invokedynamic>(var3, (long)"c", var0) - var2.z<invokedynamic>(var2, (long)"c", var0), (long)"c", var0);
      int var10001 = var3.z<invokedynamic>(var3, (long)"c", var0) - var2.z<invokedynamic>(var2, (long)"c", var0);
      return var10000 + var10001.$<invokedynamic>(var10001, (long)"c", var0);
   }

   static {
      a.b99571f71427e3b19.a.init(2H.class, 191);
      b = com.corz.client.s.a(4281445315687779488L, -3544930981517350188L, MethodHandles.lookup().lookupClass()).a(211381140957109L);
      t = new Object[261];
      u = new String[261];
      b();
      h = new HashMap(13);
      long var22 = b ^ 101893306420455L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[11];
      int var29 = 0;
      String var28 = "°UU\u0091\u001e's]\u0016´\u0001\u0095<Dú>@p\u008e\u0081ÏÌ\u0010\u0017þ¹¶\u0092\u000f9\u0087y\u0010\u001a\u0002\u0011Ë\u001f6[ºßn]£Ë5\u0092é\u0010\u0000R@ÜNZ\u008d\u009a®Õ£¦dxtä Ýãnú\u007f|èÓ\u000b!\u001cå\nm\u0093\u0014VbjZ\u0002\u009e\u0094ïGå\u0015ö*\u001f t\u0010;\u0089DçVòêýÚêfA\u0091\u001d÷»\u0010]BQ\u007fXfÿÜ¥²t\u001e\u0014`¦\u0002\u0010D\u009d\u009eLC{\u008cÞ,\u0010)\fåöô! \u008aº\u0089Ó\u008dxÎD\u009fG`#\u0088\u0092\u009a¸\u0015j\u0004ºóæAÛÉæ=È\u0088\u0087ù\u009a\u0010\f\u00ad\u0005\u008b\u0019],µ×\u0099\u009f\u0017F\u009f\u0018\u001b";
      int var30 = "°UU\u0091\u001e's]\u0016´\u0001\u0095<Dú>@p\u008e\u0081ÏÌ\u0010\u0017þ¹¶\u0092\u000f9\u0087y\u0010\u001a\u0002\u0011Ë\u001f6[ºßn]£Ë5\u0092é\u0010\u0000R@ÜNZ\u008d\u009a®Õ£¦dxtä Ýãnú\u007f|èÓ\u000b!\u001cå\nm\u0093\u0014VbjZ\u0002\u009e\u0094ïGå\u0015ö*\u001f t\u0010;\u0089DçVòêýÚêfA\u0091\u001d÷»\u0010]BQ\u007fXfÿÜ¥²t\u001e\u0014`¦\u0002\u0010D\u009d\u009eLC{\u008cÞ,\u0010)\fåöô! \u008aº\u0089Ó\u008dxÎD\u009fG`#\u0088\u0092\u009a¸\u0015j\u0004ºóæAÛÉæ=È\u0088\u0087ù\u009a\u0010\f\u00ad\u0005\u008b\u0019],µ×\u0099\u009f\u0017F\u009f\u0018\u001b".length();
      char var27 = ' ';
      int var35 = -1;

      label72:
      while(true) {
         ++var35;
         String var36 = var28.substring(var35, var35 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = b(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     f = var31;
                     g = new String[11];
                     n = new HashMap(13);
                     Cipher var11;
                     Cipher var38 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[50];
                     int var14 = 0;
                     String var15 = "ë±!\u0002\u0001Ì<\u0005\u0006e¾\"\u0095\u0004µ\u0099ÿþ×±rä]Úp\u009e\u008d·\r\u0084\u001d\u0095\u008dZL\u0013¡BhM£~ü,~ã\u0091\u0002\u0018ï@ÿ\u00996\u0084Àm«¶ª\u000f?_ÙÞ\u0091\u000ft\u009f±ë=8\u0005Ï`\u0090å¶ü\u001e]õ#ô\u0001ÇÞUèþÅ¬æ\u0015.t¬Ôè\u0091\u0002Öíûº'¬6Q{»ôZ\u00161²Ë\u001diÇ§øûýÜx\u0081\u0098ÿe±WB\rçmi%\u0014J¹ð\b\u0091KoD£Ups\u001c\n\u0092\u0000\u001e»s\u0011Wão\fh\u0001\u00851Ál\u008eF<?\u001eÝ\tå\u0003ï©$\u0097BÜ:~>\u0010\u009d\u009cÏ\u0000QÞ\u0018\\Oeü^½Î\u008cZ77(\u0087ÙÊ\u008fi\u0091©\u001a\u0019QOùÖ»º0²éf&2\n\\Úá\u009dB!Xu÷\u0099K1þ\u0090´ßÎgx¼Üy\u0095ó\u009e\u009e¥d\nI'È3L\u0099\u0007\u001aÔï\u0080\u001aü>è+ªyp»Ýþ\u0084*»¢Ð\u009aYyO2Ê·?\u000eÕå\u0088`rX\u0004\u009câ'wW\u008a0÷¢¨Öå'BºÀ\u0080\u0080\u0000\u000fx\u0085¾IùÏS\u008a{\u0093\u0000\u001fq¿íÉeÁ\u009cÅ¬\u0094\\=º\u0097¶á9¶Çµ9ÌÒrÝpÔì\u0091\u008b4\u0007*³\u0005ùýyÿ\u001bÎõ\u009b\u0000m+\u0099¦L\u001b";
                     int var16 = "ë±!\u0002\u0001Ì<\u0005\u0006e¾\"\u0095\u0004µ\u0099ÿþ×±rä]Úp\u009e\u008d·\r\u0084\u001d\u0095\u008dZL\u0013¡BhM£~ü,~ã\u0091\u0002\u0018ï@ÿ\u00996\u0084Àm«¶ª\u000f?_ÙÞ\u0091\u000ft\u009f±ë=8\u0005Ï`\u0090å¶ü\u001e]õ#ô\u0001ÇÞUèþÅ¬æ\u0015.t¬Ôè\u0091\u0002Öíûº'¬6Q{»ôZ\u00161²Ë\u001diÇ§øûýÜx\u0081\u0098ÿe±WB\rçmi%\u0014J¹ð\b\u0091KoD£Ups\u001c\n\u0092\u0000\u001e»s\u0011Wão\fh\u0001\u00851Ál\u008eF<?\u001eÝ\tå\u0003ï©$\u0097BÜ:~>\u0010\u009d\u009cÏ\u0000QÞ\u0018\\Oeü^½Î\u008cZ77(\u0087ÙÊ\u008fi\u0091©\u001a\u0019QOùÖ»º0²éf&2\n\\Úá\u009dB!Xu÷\u0099K1þ\u0090´ßÎgx¼Üy\u0095ó\u009e\u009e¥d\nI'È3L\u0099\u0007\u001aÔï\u0080\u001aü>è+ªyp»Ýþ\u0084*»¢Ð\u009aYyO2Ê·?\u000eÕå\u0088`rX\u0004\u009câ'wW\u008a0÷¢¨Öå'BºÀ\u0080\u0080\u0000\u000fx\u0085¾IùÏS\u008a{\u0093\u0000\u001fq¿íÉeÁ\u009cÅ¬\u0094\\=º\u0097¶á9¶Çµ9ÌÒrÝpÔì\u0091\u008b4\u0007*³\u0005ùýyÿ\u001bÎõ\u009b\u0000m+\u0099¦L\u001b".length();
                     int var13 = 0;

                     label54:
                     while(true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while(true) {
                           long var19 = var53;
                           byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                           long var62 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    l = var17;
                                    m = new Integer[50];
                                    8C = true.d<invokedynamic>(1080, var22 ^ 2901405472825713233L);
                                    2 = true.d<invokedynamic>(26254, var22 ^ 5815159215416459496L);
                                    q = new HashMap(13);
                                    Cipher var0;
                                    Cipher var40 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                                    byte[] var60 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var60[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var40.init(2, var55.generateSecret(new DESKeySpec(var60)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "O£+\u0015\u0013Ó-öâ& à\u001dü\u0005mÌé\u00adÇÿ$\u009d\u00ad";
                                    int var5 = "O£+\u0015\u0013Ó-öâ& à\u001dü\u0005mÌé\u00adÇÿ$\u009d\u00ad".length();
                                    int var2 = 0;

                                    do {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                       var10001 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                       byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                       var62 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                       boolean var61 = true;
                                       var6[var10001] = var62;
                                    } while(var2 < var5);

                                    o = var6;
                                    p = new Long[3];
                                    8n = true.p<invokedynamic>(12102, var22 ^ 4120886092406903305L);
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "©-LÁHÜå^=\u008b\u008fÎ}¾ø\u008c";
                                 var16 = "©-LÁHÜå^=\u008b\u008fÎ}¾ø\u008c".length();
                                 var13 = 0;
                           }

                           var10001 = var13;
                           var13 += 8;
                           var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = ")5¹êÉ\u0085{\u0018ÌLÞf5*\u0000ì\u0010\u0099è\u009a\u008fß¶2?\\K¼\u0001G{\u0092j";
                  var30 = ")5¹êÉ\u0085{\u0018ÌLÞf5*\u0000ì\u0010\u0099è\u009a\u008fß¶2?\\K¼\u0001G{\u0092j".length();
                  var27 = 16;
                  var35 = -1;
            }

            ++var35;
            var36 = var28.substring(var35, var35 + var27);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

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

   private static CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

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
               case 0 -> var10000 = 63;
               case 1 -> var10000 = 2;
               case 2 -> var10000 = 59;
               case 3 -> var10000 = 10;
               case 4 -> var10000 = 21;
               case 5 -> var10000 = 52;
               case 6 -> var10000 = 38;
               case 7 -> var10000 = 7;
               case 8 -> var10000 = 22;
               case 9 -> var10000 = 18;
               case 10 -> var10000 = 36;
               case 11 -> var10000 = 49;
               case 12 -> var10000 = 34;
               case 13 -> var10000 = 4;
               case 14 -> var10000 = 51;
               case 15 -> var10000 = 12;
               case 16 -> var10000 = 43;
               case 17 -> var10000 = 29;
               case 18 -> var10000 = 13;
               case 19 -> var10000 = 62;
               case 20 -> var10000 = 15;
               case 21 -> var10000 = 1;
               case 22 -> var10000 = 6;
               case 23 -> var10000 = 60;
               case 24 -> var10000 = 19;
               case 25 -> var10000 = 31;
               case 26 -> var10000 = 35;
               case 27 -> var10000 = 55;
               case 28 -> var10000 = 53;
               case 29 -> var10000 = 40;
               case 30 -> var10000 = 5;
               case 31 -> var10000 = 37;
               case 32 -> var10000 = 24;
               case 33 -> var10000 = 11;
               case 34 -> var10000 = 48;
               case 35 -> var10000 = 54;
               case 36 -> var10000 = 42;
               case 37 -> var10000 = 8;
               case 38 -> var10000 = 20;
               case 39 -> var10000 = 14;
               case 40 -> var10000 = 46;
               case 41 -> var10000 = 17;
               case 42 -> var10000 = 27;
               case 43 -> var10000 = 25;
               case 44 -> var10000 = 41;
               case 45 -> var10000 = 56;
               case 46 -> var10000 = 0;
               case 47 -> var10000 = 26;
               case 48 -> var10000 = 3;
               case 49 -> var10000 = 23;
               case 50 -> var10000 = 47;
               case 51 -> var10000 = 16;
               case 52 -> var10000 = 33;
               case 53 -> var10000 = 61;
               case 54 -> var10000 = 9;
               case 55 -> var10000 = 30;
               case 56 -> var10000 = 45;
               case 57 -> var10000 = 50;
               case 58 -> var10000 = 39;
               case 59 -> var10000 = 58;
               case 60 -> var10000 = 28;
               case 61 -> var10000 = 44;
               case 62 -> var10000 = 57;
               default -> var10000 = 32;
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
      var10000[2] = Boolean.TYPE;
      u[2] = "c";
      var10000[3] = "c";
      var10000[4] = Long.TYPE;
      u[4] = "c";
      var10000[5] = "c";
      var10000[6] = Double.TYPE;
      u[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Integer.TYPE;
      u[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = Void.TYPE;
      u[19] = "c";
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
      var10000[87] = Byte.TYPE;
      u[87] = "c";
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
      var10000[173] = "c";
      var10000[174] = "c";
      var10000[175] = "c";
      var10000[176] = "c";
      var10000[177] = "c";
      var10000[178] = "c";
      var10000[179] = "c";
      var10000[180] = "c";
      var10000[181] = "c";
      var10000[182] = "c";
      var10000[183] = "c";
      var10000[184] = "c";
      var10000[185] = "c";
      var10000[186] = "c";
      var10000[187] = "c";
      var10000[188] = "c";
      var10000[189] = "c";
      var10000[190] = "c";
      var10000[191] = "c";
      var10000[192] = "c";
      var10000[193] = "c";
      var10000[194] = "c";
      var10000[195] = "c";
      var10000[196] = "c";
      var10000[197] = "c";
      var10000[198] = "c";
      var10000[199] = "c";
      var10000[200] = "c";
      var10000[201] = "c";
      var10000[202] = "c";
      var10000[203] = "c";
      var10000[204] = "c";
      var10000[205] = "c";
      var10000[206] = "c";
      var10000[207] = "c";
      var10000[208] = "c";
      var10000[209] = "c";
      var10000[210] = "c";
      var10000[211] = "c";
      var10000[212] = "c";
      var10000[213] = "c";
      var10000[214] = "c";
      var10000[215] = "c";
      var10000[216] = "c";
      var10000[217] = "c";
      var10000[218] = "c";
      var10000[219] = "c";
      var10000[220] = "c";
      var10000[221] = "c";
      var10000[222] = "c";
      var10000[223] = "c";
      var10000[224] = "c";
      var10000[225] = "c";
      var10000[226] = "c";
      var10000[227] = "c";
      var10000[228] = "c";
      var10000[229] = "c";
      var10000[230] = "c";
      var10000[231] = "c";
      var10000[232] = "c";
      var10000[233] = "c";
      var10000[234] = "c";
      var10000[235] = "c";
      var10000[236] = "c";
      var10000[237] = "c";
      var10000[238] = "c";
      var10000[239] = "c";
      var10000[240] = "c";
      var10000[241] = "c";
      var10000[242] = "c";
      var10000[243] = "c";
      var10000[244] = "c";
      var10000[245] = "c";
      var10000[246] = "c";
      var10000[247] = "c";
      var10000[248] = "c";
      var10000[249] = "c";
      var10000[250] = "c";
      var10000[251] = "c";
      var10000[252] = "c";
      var10000[253] = "c";
      var10000[254] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
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
      Object var5 = t[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = u[var4];
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
               t[var4] = var26;
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
                     t[var4] = var19;
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
         if (var8 != 'z' && var8 != 223 && var8 != 'O' && var8 != 240) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 220) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == '$') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'z') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 223) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'O') {
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

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

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
