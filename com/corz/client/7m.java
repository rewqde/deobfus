package com.corz.client;

import java.io.InputStream;
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
import net.minecraft.class_1011;
import net.minecraft.class_2960;

public class 7M extends 73 {
   private static final float 1Z = 1.0F;
   private static final String 1X;
   private static final class_2960 2;
   private static final Map 9;
   private static final Map 1C;
   private static float 7;
   private static float 1;
   private static class_1011 6;
   private static boolean 3;
   private static boolean 1u;
   private static boolean 0;
   private float 4;
   private float 1D;
   private float 5;
   private final boolean 8;
   private static final long b = com.corz.client.s.a(2622999332422519248L, -8833478044990273591L, MethodHandles.lookup().lookupClass()).a(118504364557396L);
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long o;
   private static final Object[] r;
   private static final String[] s;
   // $FF: synthetic field
   private static transient String iKRwGLvCQX;

   public _M/* $FF was: 7M*/(long param1, float param3) {
      // $FF: Couldn't be decompiled
   }

   private static InputStream _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static synchronized void _/* $FF was: 2*/(Object[] param0) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static long _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _k/* $FF was: 4k*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _e/* $FF was: 8e*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public float _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public float _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 3*/(long param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var25 = b ^ 81956840814860L;
      r = new Object[159];
      s = new String[159];
      b();
      h = new HashMap(13);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[18];
      int var21 = 0;
      String var20 = "#\u009b\u0088ø\u008f\u0094\u001fâcÛ¸ç}\u009e¥&\u008eØeÎË~\u001føf¢XM¼öoR\u0010\u0090Om/\u0081gÉj525æýN^\u0005\u0090\t\u009fÊ¨®ÒE_h(»Hû\u0091\u008c\u0089è\u000fÈÎñ±÷+ì(Ù+ä\u008c\u0085ÛÇ\u0098\u001f£ÊlZ@}\u0092½×¬«¼ß¶¸°Hº\u000fäqhoë:hõk ¥Y\u0015ù©À.Æ²{x\u0019³\u0001\u00892 \u009eÃ\u0019_A\u0014iéTåÇ\f5\u009c5\u0000Èæ«\u000eíèÙ\u0017I\u001ez\b)\u0091\u0011\u001fwùy/éO\u0006 \u009a\u0017\u001d:¯¬Ð\u0090ùÃïû\u0018\u0095\u009fZ©1ºÕeuo8\u0082Ä«.u\u008b\u0017èYJ\u00adH\u0003@¾¸\u0002\u0089ë!\u008bÉH\"\u000b\u0014\u008c\f\u0002\"\u009b%ß.>hûØ^²ÂÂóTî\u009fÙDË\u0091x\u0018~ÿ3Q\u0010Ï\u0001¬\u0007Ñ÷5\u0088¶«ñºækJs\u0010wH_'' 8\u0003\u0013£É|á\u0007\u001cÖ\u0010\u0092ÈùÅö\r*\u0015©øDQm\u0010\u0018h0\u008eYã¥\u0097Û\u0007~X:3\u001f¥ÙJ;\u008c5¤\u0017\u0013_üÈ%!ÜÉÒïV\u008d\u001a\u0012\u000eÁ·B#,\u008a\u00017yB)âv@\u0000\u0018é\u0015b\u009cªÜ\u001cPû\u00892°\u001c\u0000\u0086TCgÌ\u0000ÔJZLÏ\u0094Ú@¾×g\u00028\u0094K]\u009aoMrÈ·H°Y\u0018ª [WpC\u000f7¡ë\"-JÅ&\u001f8o\u009c£Ìwÿ[b½JÇ\u0096Å\u0086=ATûÔ\u008a5\u001eé\u0090o.\u008fÑ|)ª¥Írª\b\u0098\u008bL±I®%\u00013t¶\u0087¿~û\u0081\u0098ÝK\u007f(\u0099\u001b.2½ª\u0016y]áµ;\u0014?\u00832qB\u0015\"¥´2^0\u000b*)äª<\u00adbSjÏ\u009ek\u0019\u0084\u0088\u0013\u009f\u0017\u0095\u0017\u0011ýÝ\u00adÒe³g\u0098\u001fU'\böÚê}.Çß\u0084\u0017\u0088òÒ;¤=°\u0011L\u0089Ó\u001c\u0001N\u001eôéî\b§ð\u000eßÛ-\u0010Tõw¥\u001e¿\u00ad\u0081NàÞ\u0085\u008e\u0082\"Is×YÚB>å[@fè<UÐ\u0000\r\u001büÑ\u0015T¬&¡\u0014\u0019ç%\u009d¹\u0006MJ¢dP\u0019¿\u0089¹h\nË»s\u001b4á\u0097\"nØ?\u0084ªS¬\u0086ùr\u0099\u008eÖ\u0099èÅ±\u0010\u0093:\u0016\u008d\u00801¨Âg\u0011\fI\u0013©\u009a\u008c@2\u0084á}¼\u008aY=à¨þ\u0085\nÚÁ~\u009f¢ 2PJ\u0096·}$#Ñ\u001cq\u0019O#£Ù8?ý«\u0003\u001eØ\u00119\u0080\u0018&\u008e;F«ÚªÌmüpR\u009a/©\u000f$a\u0090ó\"ÏÕ\u0011\u0091aj\u0095\u000b\u0018©ô)Â§y³¤ÁC\u0007Ø\u0001ÁqcÛÿ\u0082\u0097\u001b8;î»u6\u0006E\u0091Ý\"\u001fÃIAØ·\u0097 W\u009eó\u009b\u001e¤\u008d1¨\b\fä\u0089®\u001a\u0011\u0098\u001a\u0093\u009fãñÙ§\u0017ªJk\\¥0\u0099\nS®\u008bB\u0019e®¦_Z\u0016\u0085\u008aÕ\u001fdÜ\u001bÅoë\u0013·\u0011#\u0015Êôý(¦´Ä\"¨;\u0003\u001cR°@®³ÔÀa(\u001b\u0082\u0082îÆ\u009d+¤~(£»c@\u009eÍ+õN\u0016><\u0095\u000fX\u0082²\u0013ÀC\u0080\u008c.õV.è¹Þ\u0007\u0001CÝ\u009e\u0005~\u008f¡áIHÝ\u001ap\u001e^ìÊ\u0091?³?¬q\u0092Ò èÊk\u000fé(ñÂõ\u008eZ";
      int var22 = "#\u009b\u0088ø\u008f\u0094\u001fâcÛ¸ç}\u009e¥&\u008eØeÎË~\u001føf¢XM¼öoR\u0010\u0090Om/\u0081gÉj525æýN^\u0005\u0090\t\u009fÊ¨®ÒE_h(»Hû\u0091\u008c\u0089è\u000fÈÎñ±÷+ì(Ù+ä\u008c\u0085ÛÇ\u0098\u001f£ÊlZ@}\u0092½×¬«¼ß¶¸°Hº\u000fäqhoë:hõk ¥Y\u0015ù©À.Æ²{x\u0019³\u0001\u00892 \u009eÃ\u0019_A\u0014iéTåÇ\f5\u009c5\u0000Èæ«\u000eíèÙ\u0017I\u001ez\b)\u0091\u0011\u001fwùy/éO\u0006 \u009a\u0017\u001d:¯¬Ð\u0090ùÃïû\u0018\u0095\u009fZ©1ºÕeuo8\u0082Ä«.u\u008b\u0017èYJ\u00adH\u0003@¾¸\u0002\u0089ë!\u008bÉH\"\u000b\u0014\u008c\f\u0002\"\u009b%ß.>hûØ^²ÂÂóTî\u009fÙDË\u0091x\u0018~ÿ3Q\u0010Ï\u0001¬\u0007Ñ÷5\u0088¶«ñºækJs\u0010wH_'' 8\u0003\u0013£É|á\u0007\u001cÖ\u0010\u0092ÈùÅö\r*\u0015©øDQm\u0010\u0018h0\u008eYã¥\u0097Û\u0007~X:3\u001f¥ÙJ;\u008c5¤\u0017\u0013_üÈ%!ÜÉÒïV\u008d\u001a\u0012\u000eÁ·B#,\u008a\u00017yB)âv@\u0000\u0018é\u0015b\u009cªÜ\u001cPû\u00892°\u001c\u0000\u0086TCgÌ\u0000ÔJZLÏ\u0094Ú@¾×g\u00028\u0094K]\u009aoMrÈ·H°Y\u0018ª [WpC\u000f7¡ë\"-JÅ&\u001f8o\u009c£Ìwÿ[b½JÇ\u0096Å\u0086=ATûÔ\u008a5\u001eé\u0090o.\u008fÑ|)ª¥Írª\b\u0098\u008bL±I®%\u00013t¶\u0087¿~û\u0081\u0098ÝK\u007f(\u0099\u001b.2½ª\u0016y]áµ;\u0014?\u00832qB\u0015\"¥´2^0\u000b*)äª<\u00adbSjÏ\u009ek\u0019\u0084\u0088\u0013\u009f\u0017\u0095\u0017\u0011ýÝ\u00adÒe³g\u0098\u001fU'\böÚê}.Çß\u0084\u0017\u0088òÒ;¤=°\u0011L\u0089Ó\u001c\u0001N\u001eôéî\b§ð\u000eßÛ-\u0010Tõw¥\u001e¿\u00ad\u0081NàÞ\u0085\u008e\u0082\"Is×YÚB>å[@fè<UÐ\u0000\r\u001büÑ\u0015T¬&¡\u0014\u0019ç%\u009d¹\u0006MJ¢dP\u0019¿\u0089¹h\nË»s\u001b4á\u0097\"nØ?\u0084ªS¬\u0086ùr\u0099\u008eÖ\u0099èÅ±\u0010\u0093:\u0016\u008d\u00801¨Âg\u0011\fI\u0013©\u009a\u008c@2\u0084á}¼\u008aY=à¨þ\u0085\nÚÁ~\u009f¢ 2PJ\u0096·}$#Ñ\u001cq\u0019O#£Ù8?ý«\u0003\u001eØ\u00119\u0080\u0018&\u008e;F«ÚªÌmüpR\u009a/©\u000f$a\u0090ó\"ÏÕ\u0011\u0091aj\u0095\u000b\u0018©ô)Â§y³¤ÁC\u0007Ø\u0001ÁqcÛÿ\u0082\u0097\u001b8;î»u6\u0006E\u0091Ý\"\u001fÃIAØ·\u0097 W\u009eó\u009b\u001e¤\u008d1¨\b\fä\u0089®\u001a\u0011\u0098\u001a\u0093\u009fãñÙ§\u0017ªJk\\¥0\u0099\nS®\u008bB\u0019e®¦_Z\u0016\u0085\u008aÕ\u001fdÜ\u001bÅoë\u0013·\u0011#\u0015Êôý(¦´Ä\"¨;\u0003\u001cR°@®³ÔÀa(\u001b\u0082\u0082îÆ\u009d+¤~(£»c@\u009eÍ+õN\u0016><\u0095\u000fX\u0082²\u0013ÀC\u0080\u008c.õV.è¹Þ\u0007\u0001CÝ\u009e\u0005~\u008f¡áIHÝ\u001ap\u001e^ìÊ\u0091?³?¬q\u0092Ò èÊk\u000fé(ñÂõ\u008eZ".length();
      char var19 = ' ';
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var20.substring(var29, var29 + var19);
         int var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
            String var45 = b(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var45;
                  if ((var29 += var19) >= var22) {
                     f = var23;
                     g = new String[18];
                     1X = true.o<invokedynamic>(22115, 3004859451302461441L ^ var25);
                     n = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var47 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var47.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[8];
                     int var8 = 0;
                     String var9 = "Âí\u0089ù´zAzÚ\u0004æ\u009chÅ¹¡Çy\u001dIºr4d\r*¼þ\u0019T®<\u0093ñ\u0090\nÇ6t\u0011jãÔ·\bÃ¥\u001a";
                     int var10 = "Âí\u0089ù´zAzÚ\u0004æ\u009chÅ¹¡Çy\u001dIºr4d\r*¼þ\u0019T®<\u0093ñ\u0090\nÇ6t\u0011jãÔ·\bÃ¥\u001a".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var48 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var54 = -1;

                        while(true) {
                           long var13 = var48;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var57 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var54) {
                              case 0:
                                 var33[var10001] = var57;
                                 if (var7 >= var10) {
                                    l = var11;
                                    m = new Integer[8];
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var50 = SecretKeyFactory.getInstance("DES");
                                    byte[] var56 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var56[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var50.generateSecret(new DESKeySpec(var56)), new IvParameterSpec(new byte[8]));
                                    long var2 = 4709323231678892802L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var51 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    o = var51;
                                    String var35 = 24075.o<invokedynamic>(24075, 4130576717825820775L ^ var25);
                                    2 = var35.K<invokedynamic>(var35, true.o<invokedynamic>(7235, 7289196711859817000L ^ var25), 2699925023257182922L, var25);
                                    9 = new HashMap();
                                    long var41 = 2872929257647856842L ^ var25;
                                    1C = new HashMap();
                                    true.b<invokedynamic>(4423, var41).b<invokedynamic>((boolean)true.b<invokedynamic>(4423, var41), 2685184957432001541L, var25);
                                    true.b<invokedynamic>(17211, 6701539869187116721L ^ var25).b<invokedynamic>((boolean)true.b<invokedynamic>(17211, 6701539869187116721L ^ var25), 2700128579891358383L, var25);
                                    true.b<invokedynamic>(17211, 6701539869187116721L ^ var25).b<invokedynamic>((boolean)true.b<invokedynamic>(17211, 6701539869187116721L ^ var25), 2700016949890452799L, var25);
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var57;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "á\u0094ú×Ó\u0090jCoV®Ý¾\u007fÕ}";
                                 var10 = "á\u0094ú×Ó\u0090jCoV®Ý¾\u007fÕ}".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var48 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var54 = 0;
                        }
                     }
                  }

                  var19 = var20.charAt(var29);
                  break;
               default:
                  var23[var21++] = var45;
                  if ((var29 += var19) < var22) {
                     var19 = var20.charAt(var29);
                     continue label64;
                  }

                  var20 = "«¯\u008fL\u00166dbV×\u008bê±5\u0012Ë\u0002\u000bÎ±\u0003^\u0016Â\u007fBÁ:º½Áç\u0010ÕPw~U\u009e'ä'åé\rª\u0081ç\u0096Nê\b\u0001³\u009c\u0006\u0014ýÒ¨\u009bo\u008d§\u0010ÚjûENÝ \u0094ú\u0085z0#V¦5";
                  var22 = "«¯\u008fL\u00166dbV×\u008bê±5\u0012Ë\u0002\u000bÎ±\u0003^\u0016Â\u007fBÁ:º½Áç\u0010ÕPw~U\u009e'ä'åé\rª\u0081ç\u0096Nê\b\u0001³\u009c\u0006\u0014ýÒ¨\u009bo\u008d§\u0010ÚjûENÝ \u0094ú\u0085z0#V¦5".length();
                  var19 = '@';
                  var29 = -1;
            }

            ++var29;
            var30 = var20.substring(var29, var29 + var19);
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

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (s[var4] != null) {
         return var4;
      } else {
         Object var5 = r[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 63;
               case 1 -> var10000 = 59;
               case 2 -> var10000 = 41;
               case 3 -> var10000 = 56;
               case 4 -> var10000 = 58;
               case 5 -> var10000 = 42;
               case 6 -> var10000 = 54;
               case 7 -> var10000 = 11;
               case 8 -> var10000 = 45;
               case 9 -> var10000 = 40;
               case 10 -> var10000 = 50;
               case 11 -> var10000 = 60;
               case 12 -> var10000 = 37;
               case 13 -> var10000 = 5;
               case 14 -> var10000 = 16;
               case 15 -> var10000 = 14;
               case 16 -> var10000 = 29;
               case 17 -> var10000 = 46;
               case 18 -> var10000 = 10;
               case 19 -> var10000 = 12;
               case 20 -> var10000 = 22;
               case 21 -> var10000 = 20;
               case 22 -> var10000 = 3;
               case 23 -> var10000 = 7;
               case 24 -> var10000 = 36;
               case 25 -> var10000 = 19;
               case 26 -> var10000 = 17;
               case 27 -> var10000 = 38;
               case 28 -> var10000 = 30;
               case 29 -> var10000 = 34;
               case 30 -> var10000 = 23;
               case 31 -> var10000 = 0;
               case 32 -> var10000 = 25;
               case 33 -> var10000 = 15;
               case 34 -> var10000 = 32;
               case 35 -> var10000 = 39;
               case 36 -> var10000 = 31;
               case 37 -> var10000 = 44;
               case 38 -> var10000 = 57;
               case 39 -> var10000 = 4;
               case 40 -> var10000 = 43;
               case 41 -> var10000 = 62;
               case 42 -> var10000 = 13;
               case 43 -> var10000 = 18;
               case 44 -> var10000 = 6;
               case 45 -> var10000 = 51;
               case 46 -> var10000 = 9;
               case 47 -> var10000 = 48;
               case 48 -> var10000 = 49;
               case 49 -> var10000 = 53;
               case 50 -> var10000 = 35;
               case 51 -> var10000 = 27;
               case 52 -> var10000 = 28;
               case 53 -> var10000 = 61;
               case 54 -> var10000 = 52;
               case 55 -> var10000 = 8;
               case 56 -> var10000 = 47;
               case 57 -> var10000 = 1;
               case 58 -> var10000 = 2;
               case 59 -> var10000 = 24;
               case 60 -> var10000 = 26;
               case 61 -> var10000 = 55;
               case 62 -> var10000 = 33;
               default -> var10000 = 21;
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

            s[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = r;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Void.TYPE;
      s[2] = "c";
      var10000[3] = "c";
      var10000[4] = Float.TYPE;
      s[4] = "c";
      var10000[5] = "c";
      var10000[6] = Integer.TYPE;
      s[6] = "c";
      var10000[7] = "c";
      var10000[8] = Long.TYPE;
      s[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = Boolean.TYPE;
      s[17] = "c";
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
      var10000[30] = Character.TYPE;
      s[30] = "c";
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
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = r[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(s[var4]);
            r[var4] = var5;
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
      Object var5 = r[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = s[var4];
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
               r[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     r[var4] = var13;
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
      Object var5 = r[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = s[var4];
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
               r[var4] = var26;
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
                     r[var4] = var19;
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
         if (var8 != 254 && var8 != 'u' && var8 != 164 && var8 != 'b') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 238) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'K') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 254) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'u') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 164) {
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

   private static CallSite f(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
