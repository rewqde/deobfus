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

public class 73U {
   private static final int 3;
   private static final int 8;
   private static final int 9;
   private static final int 0;
   private static final long a = s.a(-3541778225711674402L, 6892059769070423501L, MethodHandles.lookup().lookupClass()).a(225291164773775L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h = new Object[25];
   private static final String[] i = new String[25];
   // $FF: synthetic field
   private static transient String IiDyWwJKAW;

   private _3U/* $FF was: 73U*/() {
   }

   public static String _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var11 = a ^ 42120995618193L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[24];
      int var18 = 0;
      String var17 = "×\rÁØP·ú.\u0080©\rÞRh;3@ÆIÛ\u0000Óae\u007f8\u0091\u0015I}Á\u001b>ÂÎ^\"3Ï-?¨¤a°\u008ey±^\u001fOíÃ\u009döéfD\u000f@x!¬q\u0011w\u009a0\u0094ä_¶\u008dHøúiô2¯\u0011(\u0007òé§K\u0005tÜpÙ\u0011\u008c·ØÍvýt\u0007ÔÒ~ÍVxr^Ö16MòÂ¦\rû%|\u001e\u000b\u0018õ\\:\u0080\u0007ÿ[\u008f}¸2èe\u0010PÇv.\u0012B\u008cR\u0004è\u0010\u00adæÐç¯\u0011+9Ì1\u0089à\u0019xÂ\u000e\u0018\u009c\u000b\u0002\u0098\nn~±»BmÃ\u001aÄ\u0010´Ð\u009cz«Ï¿Es \u0018\u009f0ux&\u0088ääõ\u0005òº\u009ax\u0012uQä\u0001\u0091sÊåàf\u001aé\u0083´dú@\u000e\u001bAæÍ\u0096´¦R;[¡\u0090ÔCy÷\u001e~ÿ¥Åv\u000fZu\fC\u00875Ê\n\u0002E\u0094w)\u008dí\u001aû\u0090\u0085Ë\u008cþ\u00887Ðe\u001a;ÑÄçPÀ2\u0007ÔE×\u008bÇ@\u001e£A¾\u008f\u0081¯ù#\u008e\u000fB)©Î@\u001d%|e\u009d\u0084\u0007ù«\u00895ù\u0014à7\u009bÌ\u0000\u009b\u008cæ½\u0005êNñ~HlÀ=`ë¦\u0012¿VÈ\u0097*gJð \u0017}\u00172@\u0096)\u0092Ó_¼ÑR\u0092Ù\u0085Í\u0000#$\u0006â\b.<í\u0098\u0083¦Q\u009b\u00adÊ*Z\u0003Þ;Ö)®+%0²&\u0083DÏ»×úÒ\u0003Ç\u0095GQÏ_9º\u0002\u0001\u0019«Ô÷aHÛ¿8|kÞ\u001cVpÓþ?ð\u000f\u008b¸½C\u0019\u001fo.\u0000®\u0092\bl¸d@\u0095Ëxe/K÷«\u008b,(N\u008bRÛ,\u000bÀéøuFnbã!ö3æ\tQ\u000e{\u0082Û\u0082ßs\u008c*Y\u0082\u00109t5}ö\u0014¬f¿<\u000fN\u0096ØQÄ »\u009bÖ¾D`Ï\u0097ÏÂWÃ\u0005\u0088ªY\u00170.\u001f\u009cãc\u0080\u008ejl\u0090´U#\u00188ýX{\u0088lð¼Û3âgøñ\u0007Ú0\fYÈÜ\u0087\u0099¨%É\u0094\\\u007fÇ\u008dÌR\nb1z\\\b\u0092Ó&f¸QzáÇG§\u0094ÛçhÏ\u0019Ñ\u0018\u008eQ¡u\u0091\u0085\u009c\u0010)p\u0098\u008b\u0017Åw\u00030\u009bÈ~ù_\u0081üP>Ò¢Ì\u009cû?·Ä,õs\u008f_}Ï6õ±·°+\u001b¾\u0093þe°Ó\u008a\u008c\u0090t}EQC\u0086©vÄ\u001d«Ë\u0013\u0013ñý%£t\u009fi\u008d(\u0004mNÃ\u007fb$Dû\u009a\u0095¹Ó\u0096'm\u0016\"vP\u009bÅ\u000eÇ\u0016PD«\u0001;ä,Õ¹\u008b\u0098\u001c@JpD»0«{°u\u0014\u0091ü¿{å\u0005\u008fFwOÉ±fÏ\u0007ÌÕ1!RØ\u0093Ã\"ßÊ¡6\u0094Å¡\u0087\u0007\u008a<Rõ&£Á!÷{WbRÃV×jO¸zíx(\"ä\u0010\u008c{¤: !\u0006Ì\u0011!K@xÇçÄ8ø~R_¼ø7w\fJÉv\u0095oí¡µ¹¤\u0011¸F°z\u0080\u0095N\u008d\u0097z\u0090ù>/\u0003Îþ\u008cð\u0004\u0098\u0007QÍ\u0089õØg\u001d\u009dÆ\"×ª.|@X´Õ\u009e&Ë¨\f\u00942¸²-Ðö\u008e×\u001f\u0080Þ1·r$×WQ¦ÙIé/k\u008fòx=µ\"O\n3CØý\nÆã?¦8C×AÎ\u001b~û½þ\u0012\u008f`\u0080\u0010X\u0003\u0080&Fs5@!ðzgfýÇ\u0098\u0010É¸Ð6R\u0094\u001bzÔVº\u0019È\u008e´}";
      int var19 = "×\rÁØP·ú.\u0080©\rÞRh;3@ÆIÛ\u0000Óae\u007f8\u0091\u0015I}Á\u001b>ÂÎ^\"3Ï-?¨¤a°\u008ey±^\u001fOíÃ\u009döéfD\u000f@x!¬q\u0011w\u009a0\u0094ä_¶\u008dHøúiô2¯\u0011(\u0007òé§K\u0005tÜpÙ\u0011\u008c·ØÍvýt\u0007ÔÒ~ÍVxr^Ö16MòÂ¦\rû%|\u001e\u000b\u0018õ\\:\u0080\u0007ÿ[\u008f}¸2èe\u0010PÇv.\u0012B\u008cR\u0004è\u0010\u00adæÐç¯\u0011+9Ì1\u0089à\u0019xÂ\u000e\u0018\u009c\u000b\u0002\u0098\nn~±»BmÃ\u001aÄ\u0010´Ð\u009cz«Ï¿Es \u0018\u009f0ux&\u0088ääõ\u0005òº\u009ax\u0012uQä\u0001\u0091sÊåàf\u001aé\u0083´dú@\u000e\u001bAæÍ\u0096´¦R;[¡\u0090ÔCy÷\u001e~ÿ¥Åv\u000fZu\fC\u00875Ê\n\u0002E\u0094w)\u008dí\u001aû\u0090\u0085Ë\u008cþ\u00887Ðe\u001a;ÑÄçPÀ2\u0007ÔE×\u008bÇ@\u001e£A¾\u008f\u0081¯ù#\u008e\u000fB)©Î@\u001d%|e\u009d\u0084\u0007ù«\u00895ù\u0014à7\u009bÌ\u0000\u009b\u008cæ½\u0005êNñ~HlÀ=`ë¦\u0012¿VÈ\u0097*gJð \u0017}\u00172@\u0096)\u0092Ó_¼ÑR\u0092Ù\u0085Í\u0000#$\u0006â\b.<í\u0098\u0083¦Q\u009b\u00adÊ*Z\u0003Þ;Ö)®+%0²&\u0083DÏ»×úÒ\u0003Ç\u0095GQÏ_9º\u0002\u0001\u0019«Ô÷aHÛ¿8|kÞ\u001cVpÓþ?ð\u000f\u008b¸½C\u0019\u001fo.\u0000®\u0092\bl¸d@\u0095Ëxe/K÷«\u008b,(N\u008bRÛ,\u000bÀéøuFnbã!ö3æ\tQ\u000e{\u0082Û\u0082ßs\u008c*Y\u0082\u00109t5}ö\u0014¬f¿<\u000fN\u0096ØQÄ »\u009bÖ¾D`Ï\u0097ÏÂWÃ\u0005\u0088ªY\u00170.\u001f\u009cãc\u0080\u008ejl\u0090´U#\u00188ýX{\u0088lð¼Û3âgøñ\u0007Ú0\fYÈÜ\u0087\u0099¨%É\u0094\\\u007fÇ\u008dÌR\nb1z\\\b\u0092Ó&f¸QzáÇG§\u0094ÛçhÏ\u0019Ñ\u0018\u008eQ¡u\u0091\u0085\u009c\u0010)p\u0098\u008b\u0017Åw\u00030\u009bÈ~ù_\u0081üP>Ò¢Ì\u009cû?·Ä,õs\u008f_}Ï6õ±·°+\u001b¾\u0093þe°Ó\u008a\u008c\u0090t}EQC\u0086©vÄ\u001d«Ë\u0013\u0013ñý%£t\u009fi\u008d(\u0004mNÃ\u007fb$Dû\u009a\u0095¹Ó\u0096'm\u0016\"vP\u009bÅ\u000eÇ\u0016PD«\u0001;ä,Õ¹\u008b\u0098\u001c@JpD»0«{°u\u0014\u0091ü¿{å\u0005\u008fFwOÉ±fÏ\u0007ÌÕ1!RØ\u0093Ã\"ßÊ¡6\u0094Å¡\u0087\u0007\u008a<Rõ&£Á!÷{WbRÃV×jO¸zíx(\"ä\u0010\u008c{¤: !\u0006Ì\u0011!K@xÇçÄ8ø~R_¼ø7w\fJÉv\u0095oí¡µ¹¤\u0011¸F°z\u0080\u0095N\u008d\u0097z\u0090ù>/\u0003Îþ\u008cð\u0004\u0098\u0007QÍ\u0089õØg\u001d\u009dÆ\"×ª.|@X´Õ\u009e&Ë¨\f\u00942¸²-Ðö\u008e×\u001f\u0080Þ1·r$×WQ¦ÙIé/k\u008fòx=µ\"O\n3CØý\nÆã?¦8C×AÎ\u001b~û½þ\u0012\u008f`\u0080\u0010X\u0003\u0080&Fs5@!ðzgfýÇ\u0098\u0010É¸Ð6R\u0094\u001bzÔVº\u0019È\u008e´}".length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var17.substring(var24, var24 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[24];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "|DÒþÓ2æ!ä\u0083\u008c7C\u008d¤7\u0099t\u0092T\u0084\u0098H½µ\u0011¾é\u0000^Ã~³\fdzº\u008eõ(Þ>KÖf;ÕÆ";
                     int var5 = "|DÒþÓ2æ!ä\u0083\u008c7C\u008d¤7\u0099t\u0092T\u0084\u0098H½µ\u0011¾é\u0000^Ã~³\fdzº\u008eõ(Þ>KÖf;ÕÆ".length();
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
                                    e = var6;
                                    f = new Integer[8];
                                    9 = true.z<invokedynamic>(3842, var11 ^ 4518245363042316622L);
                                    0 = true.z<invokedynamic>(2428, var11 ^ 5216665477117900593L);
                                    8 = true.z<invokedynamic>(4034, var11 ^ 5894150149793870216L);
                                    3 = true.z<invokedynamic>(2632, var11 ^ 2519140574827639811L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "n¯@»Ãé.\u0015oÍ\u0016\u001c¸ÞI\u000e";
                                 var5 = "n¯@»Ãé.\u0015oÍ\u0016\u001c¸ÞI\u000e".length();
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

                  var17 = "QX%\b8\u0016VË9\u0084'\u0087Fº°îù-ØÝÉ×Óµá¦)uWeº/Hg\u008d7$Ã`U\u0016ùB\u008dãL<â\u008e\u0089\u008dý`q\u0010`\u009a¿âN\u000f<sú:\u0000Æé\u008fñlØú\u0004ò\u008en\u008c,P\u0082\u0099ÎÄÚò6áêë\u0085¸\u0000î\u0019\u0091\u0013®Hg©NúJ\u0000";
                  var19 = "QX%\b8\u0016VË9\u0084'\u0087Fº°îù-ØÝÉ×Óµá¦)uWeº/Hg\u008d7$Ã`U\u0016ùB\u008dãL<â\u008e\u0089\u008dý`q\u0010`\u009a¿âN\u000f<sú:\u0000Æé\u008fñlØú\u0004ò\u008en\u008c,P\u0082\u0099ÎÄÚò6áêë\u0085¸\u0000î\u0019\u0091\u0013®Hg©NúJ\u0000".length();
                  var16 = ' ';
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

   private static String a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (i[var4] != null) {
         return var4;
      } else {
         Object var5 = h[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 20;
               case 1 -> var10000 = 62;
               case 2 -> var10000 = 52;
               case 3 -> var10000 = 22;
               case 4 -> var10000 = 2;
               case 5 -> var10000 = 47;
               case 6 -> var10000 = 12;
               case 7 -> var10000 = 60;
               case 8 -> var10000 = 25;
               case 9 -> var10000 = 5;
               case 10 -> var10000 = 35;
               case 11 -> var10000 = 39;
               case 12 -> var10000 = 58;
               case 13 -> var10000 = 37;
               case 14 -> var10000 = 53;
               case 15 -> var10000 = 55;
               case 16 -> var10000 = 46;
               case 17 -> var10000 = 15;
               case 18 -> var10000 = 33;
               case 19 -> var10000 = 28;
               case 20 -> var10000 = 16;
               case 21 -> var10000 = 38;
               case 22 -> var10000 = 9;
               case 23 -> var10000 = 8;
               case 24 -> var10000 = 54;
               case 25 -> var10000 = 0;
               case 26 -> var10000 = 32;
               case 27 -> var10000 = 17;
               case 28 -> var10000 = 61;
               case 29 -> var10000 = 57;
               case 30 -> var10000 = 45;
               case 31 -> var10000 = 44;
               case 32 -> var10000 = 29;
               case 33 -> var10000 = 50;
               case 34 -> var10000 = 6;
               case 35 -> var10000 = 63;
               case 36 -> var10000 = 24;
               case 37 -> var10000 = 1;
               case 38 -> var10000 = 41;
               case 39 -> var10000 = 3;
               case 40 -> var10000 = 40;
               case 41 -> var10000 = 7;
               case 42 -> var10000 = 10;
               case 43 -> var10000 = 13;
               case 44 -> var10000 = 14;
               case 45 -> var10000 = 21;
               case 46 -> var10000 = 51;
               case 47 -> var10000 = 36;
               case 48 -> var10000 = 34;
               case 49 -> var10000 = 48;
               case 50 -> var10000 = 56;
               case 51 -> var10000 = 27;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 31;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 11;
               case 56 -> var10000 = 59;
               case 57 -> var10000 = 43;
               case 58 -> var10000 = 26;
               case 59 -> var10000 = 23;
               case 60 -> var10000 = 30;
               case 61 -> var10000 = 19;
               case 62 -> var10000 = 18;
               default -> var10000 = 49;
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

            i[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = h;
      var10000[0] = "c";
      var10000[1] = Boolean.TYPE;
      i[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Integer.TYPE;
      i[6] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = h[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(i[var4]);
            h[var4] = var5;
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
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     h[var4] = var13;
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

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var26;
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
                     h[var4] = var19;
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
         if (var8 != 'Y' && var8 != 213 && var8 != 'G' && var8 != 197) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'k') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'B') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'Y') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 213) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'G') {
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

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
