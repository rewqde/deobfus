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

public class 2q {
   public static final 7o[] 4;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String xxURYXeehI;

   private _q/* $FF was: 2q*/() {
   }

   public static void _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int[] _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(2q.class, 717);
      a = s.a(-5811550114199427284L, -2338023731908711939L, MethodHandles.lookup().lookupClass()).a(236604198577256L);
      long var20 = a ^ 30045435376747L;
      e = new Object[36];
      f = new String[36];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[16];
      int var17 = 0;
      String var16 = "GáD¸î\u007f´\u0017\bzß\\;<ÞüJ\u0010+ÛÙ2ñO\\ßU\u009e\u0099ÿ+M\u0010Ç\u0010\u0081ËÂZPKðL\u0001Ìþ\\Õ\u0013\u0085:\u0010\u0085\u0000HáêÉ\u008bý¿Xýq\u008d/-?\b6Èñ\u0091-\u009c5\u008e\u0010K\u0003ZÖËL\u0017ï»È_4ù#\u0080\u0014\u0010®óEÓúÆá*!§æ=\u009f×X\u000e\b$\u0001L°\u009bþ\u000e\u0004\bk\u0004Oéª\u0015kß\bB\u0003\u0016\u0080âLÈ®\b\u0002µÏm×\u0087©g\b)8ýnø[Â\u0018\u0010Ã\u008díu¨\u00ad¢ü\u008e.é¬±Ð^Ñ";
      int var18 = "GáD¸î\u007f´\u0017\bzß\\;<ÞüJ\u0010+ÛÙ2ñO\\ßU\u009e\u0099ÿ+M\u0010Ç\u0010\u0081ËÂZPKðL\u0001Ìþ\\Õ\u0013\u0085:\u0010\u0085\u0000HáêÉ\u008bý¿Xýq\u008d/-?\b6Èñ\u0091-\u009c5\u008e\u0010K\u0003ZÖËL\u0017ï»È_4ù#\u0080\u0014\u0010®óEÓúÆá*!§æ=\u009f×X\u000e\b$\u0001L°\u009bþ\u000e\u0004\bk\u0004Oéª\u0015kß\bB\u0003\u0016\u0080âLÈ®\b\u0002µÏm×\u0087©g\b)8ýnø[Â\u0018\u0010Ã\u008díu¨\u00ad¢ü\u008e.é¬±Ð^Ñ".length();
      char var15 = '\b';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var37;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var39 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var39.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[82];
                     int var3 = 0;
                     String var4 = "ªÁ\ro\t%\u0086hè«{8f©:\u0010Á\u009bÌÝÃj%ý\u0099\u009c¥\u000f\u000f4\u001a\u0019R\u000f\rï8\u0019Ö?ìqÅ\u009f\u0092× /Ï\u009aû>\u000fØõx\u001b\u0088¸BAVû&#C\u0091 ýïÕ;Û²¼Íæ\u0015t¸0(ú;·ÿæøî\u0097×Z\u0019\u0015©\u0018bVçæMWÀ¾µ¯\u0017î²\u0005|Æ§ÀÍÂÅOÿ¹4ø\b=Pk<\u0082>[\u0081¨\u001cCñNM\u0080z\u0012çM\u0093/Áz\u0012ï¸Í\u000bå\u0001rn,U«Z\u001d¯'\nÜiAPI\u00adc(Ej\u0094sa\u0081y<·à\u0016\u0098µÔ\u000bÀ\u00969\u0091\u0097bÉÖ\u00ade\u008ev\u001f¡M°ðD¯\u0001` Ç³=\u008f£\u009bæ¦íë\u008c{\u008fÒ\u0012BÊJHB±ïÄå©ìQäýÒ^<c\u009a¾·Å½µ\u0017\u0090ù\u001b4º\u0084°\u0090-\u00adU$W+\u009f\u00ad\u0084:\u0012tÇ\u0092ý!»\u0013iÉ\fû1\u0090ðK\u008däw\u0084ãø\u0016Ì\u0080nè,îU\u0080Ö,%\\\u0081üôF'øå3\u0012\nÝ£KÝz>²]Kî' \n\u001aVûèQbkÀ\u009aU\rbEåX¡ÊPuMÝñøo/,QËa\u0000|èvQ»!¥V¸\u0006H\u0002_b\u001fþóçRÐ\u007fê\u009b\u0019JVmöï\u0097\n\u008cã¤\u001bê\r\u0081Ó]ÏDÆKé\u0010WJ\u0094\u0092\u001bß´û\u0097eëÅ%g³\\ìKF#Ñ\u0080´B\u0087ðQY/ßLüo\u001e,®á2\u0016Ð\u0002Ð}ÈCÉ\u001e\u0007\u0006\u0082Ú¡Ä_\u0013<úl*cà\u001cæþ\u0011EyË(\u008cé{¨\u009a´÷\ri\u0080Å\u0007ê\\\u0013AJék\u0097sùËc\u008aiö\u0084\u00885Úûù\u0082ï_Øë(Ç5n\n½\u0080±à\n\u0094\u001b¢g\u0003z\u0088ñÀÉ©8S\u000b\u008eZd¨¥¦\u0093U\u0090¥]\u0012¯¼\u0017s¼àNJAN\u0093÷O¬\u0001\u0091À^>C\u009a7ô\u0003!±¥x\u0085D~)\u001a÷¿³Oû\u001f$\u0085|hàQv\u0018é\u007f\u0092Wè\u009dx5òm\u0086Iÿ¢\u009f\u0095\u0001´á¶nÐñn³KË,\u0010üÈ¿à\u001aºl\u0013Ö5ûL\u009a\u001f\u0010Nü¾o\u008ej";
                     int var5 = "ªÁ\ro\t%\u0086hè«{8f©:\u0010Á\u009bÌÝÃj%ý\u0099\u009c¥\u000f\u000f4\u001a\u0019R\u000f\rï8\u0019Ö?ìqÅ\u009f\u0092× /Ï\u009aû>\u000fØõx\u001b\u0088¸BAVû&#C\u0091 ýïÕ;Û²¼Íæ\u0015t¸0(ú;·ÿæøî\u0097×Z\u0019\u0015©\u0018bVçæMWÀ¾µ¯\u0017î²\u0005|Æ§ÀÍÂÅOÿ¹4ø\b=Pk<\u0082>[\u0081¨\u001cCñNM\u0080z\u0012çM\u0093/Áz\u0012ï¸Í\u000bå\u0001rn,U«Z\u001d¯'\nÜiAPI\u00adc(Ej\u0094sa\u0081y<·à\u0016\u0098µÔ\u000bÀ\u00969\u0091\u0097bÉÖ\u00ade\u008ev\u001f¡M°ðD¯\u0001` Ç³=\u008f£\u009bæ¦íë\u008c{\u008fÒ\u0012BÊJHB±ïÄå©ìQäýÒ^<c\u009a¾·Å½µ\u0017\u0090ù\u001b4º\u0084°\u0090-\u00adU$W+\u009f\u00ad\u0084:\u0012tÇ\u0092ý!»\u0013iÉ\fû1\u0090ðK\u008däw\u0084ãø\u0016Ì\u0080nè,îU\u0080Ö,%\\\u0081üôF'øå3\u0012\nÝ£KÝz>²]Kî' \n\u001aVûèQbkÀ\u009aU\rbEåX¡ÊPuMÝñøo/,QËa\u0000|èvQ»!¥V¸\u0006H\u0002_b\u001fþóçRÐ\u007fê\u009b\u0019JVmöï\u0097\n\u008cã¤\u001bê\r\u0081Ó]ÏDÆKé\u0010WJ\u0094\u0092\u001bß´û\u0097eëÅ%g³\\ìKF#Ñ\u0080´B\u0087ðQY/ßLüo\u001e,®á2\u0016Ð\u0002Ð}ÈCÉ\u001e\u0007\u0006\u0082Ú¡Ä_\u0013<úl*cà\u001cæþ\u0011EyË(\u008cé{¨\u009a´÷\ri\u0080Å\u0007ê\\\u0013AJék\u0097sùËc\u008aiö\u0084\u00885Úûù\u0082ï_Øë(Ç5n\n½\u0080±à\n\u0094\u001b¢g\u0003z\u0088ñÀÉ©8S\u000b\u008eZd¨¥¦\u0093U\u0090¥]\u0012¯¼\u0017s¼àNJAN\u0093÷O¬\u0001\u0091À^>C\u009a7ô\u0003!±¥x\u0085D~)\u001a÷¿³Oû\u001f$\u0085|hàQv\u0018é\u007f\u0092Wè\u009dx5òm\u0086Iÿ¢\u009f\u0095\u0001´á¶nÐñn³KË,\u0010üÈ¿à\u001aºl\u0013Ö5ûL\u009a\u001f\u0010Nü¾o\u008ej".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while(true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    b = var6;
                                    c = new Integer[82];
                                    7o[] var29 = new 7o[true.m<invokedynamic>(16034, 8823495560261440172L ^ var20)];
                                    var29[0] = new 7o(var11[4], new int[]{true.m<invokedynamic>(23480, 7602074831592126408L ^ var20), true.m<invokedynamic>(22527, 3940664132150983660L ^ var20), true.m<invokedynamic>(12888, 6217486967957102201L ^ var20), true.m<invokedynamic>(25432, 5399196070483152724L ^ var20)});
                                    var29[1] = new 7o(var11[6], new int[]{true.m<invokedynamic>(10258, 4159797169465099284L ^ var20), true.m<invokedynamic>(29770, 5659709804915316793L ^ var20), true.m<invokedynamic>(13726, 885761960300190182L ^ var20), true.m<invokedynamic>(24334, 7143890115497227039L ^ var20)});
                                    var29[2] = new 7o(var11[1], new int[]{true.m<invokedynamic>(10556, 4934455024221259075L ^ var20), true.m<invokedynamic>(27544, 250237763173959578L ^ var20), true.m<invokedynamic>(15479, 7963269363889246217L ^ var20), true.m<invokedynamic>(12659, 9133534661324348748L ^ var20)});
                                    var29[3] = new 7o(var11[9], new int[]{true.m<invokedynamic>(5568, 6628219442676644338L ^ var20), true.m<invokedynamic>(14688, 1811038249514898766L ^ var20), true.m<invokedynamic>(14280, 3576259987802659821L ^ var20), true.m<invokedynamic>(26919, 7697028913150543160L ^ var20)});
                                    var29[4] = new 7o(var11[0], new int[]{true.m<invokedynamic>(22635, 8759242136098075728L ^ var20), true.m<invokedynamic>(27394, 4317684778563585910L ^ var20), true.m<invokedynamic>(29469, 5873368534155386644L ^ var20), true.m<invokedynamic>(28275, 7224589999911846430L ^ var20)});
                                    var29[5] = new 7o(var11[14], new int[]{true.m<invokedynamic>(20480, 2637715906619505712L ^ var20), true.m<invokedynamic>(8493, 5815869943054339342L ^ var20), true.m<invokedynamic>(30933, 8366882709501138172L ^ var20), true.m<invokedynamic>(2266, 1204208303086970052L ^ var20)});
                                    var29[true.m<invokedynamic>(6624, 7475985494824662525L ^ var20)] = new 7o(var11[10], new int[]{true.m<invokedynamic>(32652, 5457635688493831044L ^ var20), true.m<invokedynamic>(24734, 4791621967123893474L ^ var20), true.m<invokedynamic>(28238, 8576663435547361894L ^ var20), true.m<invokedynamic>(3992, 4393354601220285345L ^ var20)});
                                    var29[true.m<invokedynamic>(2614, 808513268286793223L ^ var20)] = new 7o(var11[2], new int[]{true.m<invokedynamic>(20606, 88889116128803908L ^ var20), true.m<invokedynamic>(23441, 7337566515010107270L ^ var20), true.m<invokedynamic>(2459, 1999260221644219873L ^ var20), true.m<invokedynamic>(25719, 2876855792298117208L ^ var20)});
                                    var29[true.m<invokedynamic>(1707, 185623243703200477L ^ var20)] = new 7o(var11[13], new int[]{true.m<invokedynamic>(24393, 2812368243577025385L ^ var20), true.m<invokedynamic>(9161, 2940324065930153957L ^ var20), true.m<invokedynamic>(14918, 767701510018635361L ^ var20), true.m<invokedynamic>(21405, 7386673944160305035L ^ var20)});
                                    var29[true.m<invokedynamic>(24748, 4661678517048528047L ^ var20)] = new 7o(var11[11], new int[]{true.m<invokedynamic>(25983, 403366493617539439L ^ var20), true.m<invokedynamic>(20222, 5322106624655680249L ^ var20), true.m<invokedynamic>(22416, 2252258259191462829L ^ var20), true.m<invokedynamic>(2831, 2732691993253783317L ^ var20)});
                                    var29[true.m<invokedynamic>(8150, 3065394964458025970L ^ var20)] = new 7o(var11[3], new int[]{true.m<invokedynamic>(18763, 3922950566576612732L ^ var20), true.m<invokedynamic>(29581, 496612717877518259L ^ var20), true.m<invokedynamic>(31418, 7244848660235277999L ^ var20), true.m<invokedynamic>(19980, 3767990938835640953L ^ var20)});
                                    var29[true.m<invokedynamic>(27745, 6849221366891626509L ^ var20)] = new 7o(var11[15], new int[]{true.m<invokedynamic>(17512, 8420960254395476048L ^ var20), true.m<invokedynamic>(27305, 4664581223315064536L ^ var20), true.m<invokedynamic>(13478, 8661530107197266098L ^ var20), true.m<invokedynamic>(18913, 3514892606641792490L ^ var20)});
                                    var29[true.m<invokedynamic>(23418, 2377601371983640333L ^ var20)] = new 7o(var11[7], new int[]{true.m<invokedynamic>(15683, 5858881285595074920L ^ var20), true.m<invokedynamic>(20878, 5075705081682034063L ^ var20), true.m<invokedynamic>(7176, 2572604068335792174L ^ var20), true.m<invokedynamic>(3856, 1563063932931285762L ^ var20)});
                                    var29[true.m<invokedynamic>(21438, 7519378178473295764L ^ var20)] = new 7o(var11[8], new int[]{true.m<invokedynamic>(3391, 9060461871260115235L ^ var20), true.m<invokedynamic>(9805, 1205851168410405489L ^ var20), true.m<invokedynamic>(2764, 4298799347718334142L ^ var20), true.m<invokedynamic>(28995, 762773925629975875L ^ var20)});
                                    var29[true.m<invokedynamic>(18041, 6257700150301518427L ^ var20)] = new 7o(var11[12], new int[]{true.m<invokedynamic>(12251, 6572922238546576288L ^ var20), true.m<invokedynamic>(10663, 7148066447944844717L ^ var20), true.m<invokedynamic>(2686, 3520202047574058609L ^ var20), true.m<invokedynamic>(30275, 3742566479027722822L ^ var20)});
                                    var29[true.m<invokedynamic>(29808, 1727017231064520820L ^ var20)] = new 7o(var11[5], new int[]{true.m<invokedynamic>(10480, 2284005828049732749L ^ var20), true.m<invokedynamic>(11179, 8289769598700521426L ^ var20), true.m<invokedynamic>(10349, 2807794433907164278L ^ var20), true.m<invokedynamic>(11621, 2298197453536690557L ^ var20)});
                                    4 = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0090¼ekÉÌ\\JÃ\u0087\u0014àO0.\u0002";
                                 var5 = "\u0090¼ekÉÌ\\JÃ\u0087\u0014àO0.\u0002".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var37;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label54;
                  }

                  var16 = "z\u001e\u00885\u008e2\u008aèc\\·Ps\u0084ñ\u0087\b\nõ%\u001fn\u008a9\u0019";
                  var18 = "z\u001e\u00885\u008e2\u008aèc\\·Ps\u0084ñ\u0087\b\nõ%\u001fn\u008a9\u0019".length();
                  var15 = 16;
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f[var4] != null) {
         return var4;
      } else {
         Object var5 = e[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 12;
               case 1 -> var10000 = 24;
               case 2 -> var10000 = 27;
               case 3 -> var10000 = 48;
               case 4 -> var10000 = 9;
               case 5 -> var10000 = 52;
               case 6 -> var10000 = 38;
               case 7 -> var10000 = 1;
               case 8 -> var10000 = 32;
               case 9 -> var10000 = 36;
               case 10 -> var10000 = 25;
               case 11 -> var10000 = 16;
               case 12 -> var10000 = 15;
               case 13 -> var10000 = 35;
               case 14 -> var10000 = 6;
               case 15 -> var10000 = 13;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 63;
               case 18 -> var10000 = 43;
               case 19 -> var10000 = 53;
               case 20 -> var10000 = 55;
               case 21 -> var10000 = 47;
               case 22 -> var10000 = 34;
               case 23 -> var10000 = 57;
               case 24 -> var10000 = 19;
               case 25 -> var10000 = 29;
               case 26 -> var10000 = 8;
               case 27 -> var10000 = 45;
               case 28 -> var10000 = 0;
               case 29 -> var10000 = 7;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 10;
               case 32 -> var10000 = 54;
               case 33 -> var10000 = 30;
               case 34 -> var10000 = 39;
               case 35 -> var10000 = 26;
               case 36 -> var10000 = 61;
               case 37 -> var10000 = 62;
               case 38 -> var10000 = 31;
               case 39 -> var10000 = 56;
               case 40 -> var10000 = 60;
               case 41 -> var10000 = 20;
               case 42 -> var10000 = 17;
               case 43 -> var10000 = 23;
               case 44 -> var10000 = 22;
               case 45 -> var10000 = 33;
               case 46 -> var10000 = 40;
               case 47 -> var10000 = 28;
               case 48 -> var10000 = 41;
               case 49 -> var10000 = 58;
               case 50 -> var10000 = 14;
               case 51 -> var10000 = 21;
               case 52 -> var10000 = 51;
               case 53 -> var10000 = 46;
               case 54 -> var10000 = 50;
               case 55 -> var10000 = 5;
               case 56 -> var10000 = 2;
               case 57 -> var10000 = 49;
               case 58 -> var10000 = 37;
               case 59 -> var10000 = 3;
               case 60 -> var10000 = 11;
               case 61 -> var10000 = 44;
               case 62 -> var10000 = 18;
               default -> var10000 = 59;
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

            f[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Integer.TYPE;
      f[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Boolean.TYPE;
      f[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Void.TYPE;
      f[15] = "c";
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
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field a(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
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

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f[var4];
         int var7 = var6.indexOf(8);
         Class var8 = b(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = b(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = a(var23, var10, var15, var13, var14);
            if (var26 != null) {
               e[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("c")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = b((long)"c", 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = b(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     e[var4] = var19;
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
               var23 = b((long)"c", 0L);
            }
         }
      }
   }

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'B' && var8 != 'U' && var8 != 'E' && var8 != 235) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 229) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'v') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'B') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'U') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'E') {
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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
