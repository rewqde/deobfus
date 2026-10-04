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

public class 7ML {
   public static final int 6;
   public static final int 4;
   private final int 5;
   private int 9g;
   private int 3;
   private int 0;
   private int 9;
   private int 1;
   private boolean 8;
   private boolean 7;
   private 7m 2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String DqRNEpeyao;

   public _ML/* $FF was: 7ML*/(int var1) {
      this.5 = var1;
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public 5o _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 5o _/* $FF was: 4*/(Object[] var1) {
      7m var2 = (7m)var1[0];
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      this.â<invokedynamic>(this, var2, (long)"c", var4);
      return new 5o(var2, (String)var1[2]);
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public 7m _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7ML.class, 587);
      a = s.a(1447972024544979731L, -4942660346532741816L, MethodHandles.lookup().lookupClass()).a(205223781109932L);
      h = new Object[40];
      i = new String[40];
      a();
      d = new HashMap(13);
      long var11 = a ^ 70585619769274L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[11];
      int var18 = 0;
      String var17 = "s\u0082K\bKï1z\u0090+$dÌ\u0016\u001e«e&c1c1\\\u0089\u009b\u0090\u0086\u008dýEDÍæñÊj\u00adsÙE|\u0094rÁoM0Þ½\u0019v\u001e.\u009f¾;Cî`\u0091È\nÎ\u000e\u008bDhgµ\u0087\u0090í¨¥F¯º\u0082üþq\u001aS\u0007Q\t¡?\u0083\u0091\u001e¼BÈ*áyÍ&\u0015Sµ\u001bÀÈWVF·U;29\u008fß\u00ad$\u0001*\u001e\u008cö¯ç\u0086qð×5\u0083üòÜ!5§®U\u009b\u001b\u008e[:r\u0090 \u0015¸°\u0007uÏN\u0081-x°m2yZû4\u0015j\u0093Hö=\u008f-êa£÷\nW¹\u001c¨WÀ\u009d\bR\u0091¿ôßõìBEÇÑ©\u0002¦5ãÐET8\u0089õ\u0083\u0080\u0011Ó!ÿÛ\bdnó\u009fÉ7\u0018\f\u001b\u001exÀ\u001b0&Þ\u008dÈ\u001aYá\b\u0085ZèXá\u0010¦\u00ad.\u0093§r\u009esÜßß<ºi'=HÕ`\u009døM\u0092!jûuâcd\u0085>(à¾¢\u000b@8Cf\u0096&\u0089m=ñ%e\u00adé.M\u0010ÞF79\u0016ÇW\u009d>+Ëõsü)34\u001cu:3Ï#\u008dcþ-\u0088ÓtG@¤ÿ¸P«\u0001¨m@\u0019\u0087ýÖq\fëj$ C\u001f¼Uï\u0017±\u008f(bÏ}ÑÉ4×Bü; wÔçqbÂIÉ«èë4ô=¹©¼T¤\u008a¢\u0099\u001cíÙ\u0091íÆèý\f\u0019\u0017¦*\u008bT/<&pÑ.\u001feHô\u009frÉÂF7í¯à\u0093IÍz\u007fñì¼\u0016X¤\u0096Pß.\u0001Øs´C{J¡\r\r\u009dùîá¾í±ljÑç\u0081=\u0010\tþY\u0083Ì4'¾\u0001ÞhFçmÃd\u001dÝ¼\u000b<\nPX\u0081Ê÷\nÁmý§\u0081x)¼\u0096èÁûËö [Çq0\u009f\u0010Ä\"\nÑJ¨Ø\u00adå¡7º²\u008d ËÏøj\u0090[Ù\u001b®¯µ\u0002&³ý¸x%ï0¿}Ð!âê×\u0099\u0088!k\u008b\u008a¿u\\¹X´3J\u0095-B¸Ü\u0095\u0089XÔ\tã+@g pÅD\u008fåö¼ÍÚ\u001a\u0086O\"½hjÜxåDcÔQ`ß\u0085ÉªÒ\u001a\u0099îZÞàff\u009a\u0087\u0086¦ðSò1è\u00949ªOKL?\u0018º¹ÓÏÂÌP7\t\u0092Od6\u008d\u0099\" \u001ej\u0018\u001e\u00018ÅÄN[`¨\u0007¸Ç\u007f4\u0017r\u0081ÐÇ\u0085\u0089y`ª¥\u008ab\u001fÌí\u008b¤UW\u0094X;\f©tGù´\u0016â-/¦´\u0013P\u009cËac\u0090Û\u0096aÞ\u009e²Ì\u00040\"ëÌ»\u0088\u001b\u0001\u009bB\bF9%ö&\u008b9\u008f²Òa\u0001°\u0090Hz\u0007E\u0006\n>5OÊ0ùq¶?";
      int var19 = "s\u0082K\bKï1z\u0090+$dÌ\u0016\u001e«e&c1c1\\\u0089\u009b\u0090\u0086\u008dýEDÍæñÊj\u00adsÙE|\u0094rÁoM0Þ½\u0019v\u001e.\u009f¾;Cî`\u0091È\nÎ\u000e\u008bDhgµ\u0087\u0090í¨¥F¯º\u0082üþq\u001aS\u0007Q\t¡?\u0083\u0091\u001e¼BÈ*áyÍ&\u0015Sµ\u001bÀÈWVF·U;29\u008fß\u00ad$\u0001*\u001e\u008cö¯ç\u0086qð×5\u0083üòÜ!5§®U\u009b\u001b\u008e[:r\u0090 \u0015¸°\u0007uÏN\u0081-x°m2yZû4\u0015j\u0093Hö=\u008f-êa£÷\nW¹\u001c¨WÀ\u009d\bR\u0091¿ôßõìBEÇÑ©\u0002¦5ãÐET8\u0089õ\u0083\u0080\u0011Ó!ÿÛ\bdnó\u009fÉ7\u0018\f\u001b\u001exÀ\u001b0&Þ\u008dÈ\u001aYá\b\u0085ZèXá\u0010¦\u00ad.\u0093§r\u009esÜßß<ºi'=HÕ`\u009døM\u0092!jûuâcd\u0085>(à¾¢\u000b@8Cf\u0096&\u0089m=ñ%e\u00adé.M\u0010ÞF79\u0016ÇW\u009d>+Ëõsü)34\u001cu:3Ï#\u008dcþ-\u0088ÓtG@¤ÿ¸P«\u0001¨m@\u0019\u0087ýÖq\fëj$ C\u001f¼Uï\u0017±\u008f(bÏ}ÑÉ4×Bü; wÔçqbÂIÉ«èë4ô=¹©¼T¤\u008a¢\u0099\u001cíÙ\u0091íÆèý\f\u0019\u0017¦*\u008bT/<&pÑ.\u001feHô\u009frÉÂF7í¯à\u0093IÍz\u007fñì¼\u0016X¤\u0096Pß.\u0001Øs´C{J¡\r\r\u009dùîá¾í±ljÑç\u0081=\u0010\tþY\u0083Ì4'¾\u0001ÞhFçmÃd\u001dÝ¼\u000b<\nPX\u0081Ê÷\nÁmý§\u0081x)¼\u0096èÁûËö [Çq0\u009f\u0010Ä\"\nÑJ¨Ø\u00adå¡7º²\u008d ËÏøj\u0090[Ù\u001b®¯µ\u0002&³ý¸x%ï0¿}Ð!âê×\u0099\u0088!k\u008b\u008a¿u\\¹X´3J\u0095-B¸Ü\u0095\u0089XÔ\tã+@g pÅD\u008fåö¼ÍÚ\u001a\u0086O\"½hjÜxåDcÔQ`ß\u0085ÉªÒ\u001a\u0099îZÞàff\u009a\u0087\u0086¦ðSò1è\u00949ªOKL?\u0018º¹ÓÏÂÌP7\t\u0092Od6\u008d\u0099\" \u001ej\u0018\u001e\u00018ÅÄN[`¨\u0007¸Ç\u007f4\u0017r\u0081ÐÇ\u0085\u0089y`ª¥\u008ab\u001fÌí\u008b¤UW\u0094X;\f©tGù´\u0016â-/¦´\u0013P\u009cËac\u0090Û\u0096aÞ\u009e²Ì\u00040\"ëÌ»\u0088\u001b\u0001\u009bB\bF9%ö&\u008b9\u008f²Òa\u0001°\u0090Hz\u0007E\u0006\n>5OÊ0ùq¶?".length();
      char var16 = 'H';
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
                     c = new String[11];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "\u008e1öLST\u009aFÝP¼*¼Ø\u007f.\u000fóµ§Á9Âe½å¢\u001eUw«ëk)ãí\u008bl\u008b\u009f!úíEj\u0019ro§ñÉ\u0084#}V\u0085";
                     int var5 = "\u008e1öLST\u009aFÝP¼*¼Ø\u007f.\u000fóµ§Á9Âe½å¢\u001eUw«ëk)ãí\u008bl\u008b\u009f!úíEj\u0019ro§ñÉ\u0084#}V\u0085".length();
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
                                    f = new Integer[9];
                                    4 = true.i<invokedynamic>(6267, var11 ^ 5222068427625345488L);
                                    6 = true.i<invokedynamic>(32203, var11 ^ 3295106725114696804L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "À¥Ñ\u0085çGæ\\\u0016NMb\u0018¥I8";
                                 var5 = "À¥Ñ\u0085çGæ\\\u0016NMb\u0018¥I8".length();
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

                  var17 = "à2x¨u\u000f\u0002\u0011îG|C`¨#ÐCìZÂ\u009b(¸\u0096¹}\u0006\u009f»\u0010\u0098Ç\u008aÕ\u0007ªv½tc\u001d×\u0086q\u0015\u0085\r\u00153O©õ\u0084²¥ã,¯h·n¤\u0087\u001fJÍØ&m\u0088\u009aÏ\u0080nñ¢ä\u009e\u0081\u0089j\u0086áÝð&K©\u0010Ý{\tXz\u0097\u001d\u000f\u009bMÊ\u009bÆR\u0006j";
                  var19 = "à2x¨u\u000f\u0002\u0011îG|C`¨#ÐCìZÂ\u009b(¸\u0096¹}\u0006\u009f»\u0010\u0098Ç\u008aÕ\u0007ªv½tc\u001d×\u0086q\u0015\u0085\r\u00153O©õ\u0084²¥ã,¯h·n¤\u0087\u001fJÍØ&m\u0088\u009aÏ\u0080nñ¢ä\u009e\u0081\u0089j\u0086áÝð&K©\u0010Ý{\tXz\u0097\u001d\u000f\u009bMÊ\u009bÆR\u0006j".length();
                  var16 = 'X';
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
               case 0 -> var10000 = 37;
               case 1 -> var10000 = 55;
               case 2 -> var10000 = 16;
               case 3 -> var10000 = 13;
               case 4 -> var10000 = 46;
               case 5 -> var10000 = 26;
               case 6 -> var10000 = 62;
               case 7 -> var10000 = 54;
               case 8 -> var10000 = 61;
               case 9 -> var10000 = 33;
               case 10 -> var10000 = 14;
               case 11 -> var10000 = 52;
               case 12 -> var10000 = 31;
               case 13 -> var10000 = 17;
               case 14 -> var10000 = 1;
               case 15 -> var10000 = 63;
               case 16 -> var10000 = 24;
               case 17 -> var10000 = 45;
               case 18 -> var10000 = 12;
               case 19 -> var10000 = 19;
               case 20 -> var10000 = 50;
               case 21 -> var10000 = 32;
               case 22 -> var10000 = 2;
               case 23 -> var10000 = 6;
               case 24 -> var10000 = 8;
               case 25 -> var10000 = 23;
               case 26 -> var10000 = 9;
               case 27 -> var10000 = 58;
               case 28 -> var10000 = 28;
               case 29 -> var10000 = 22;
               case 30 -> var10000 = 51;
               case 31 -> var10000 = 53;
               case 32 -> var10000 = 38;
               case 33 -> var10000 = 40;
               case 34 -> var10000 = 35;
               case 35 -> var10000 = 18;
               case 36 -> var10000 = 27;
               case 37 -> var10000 = 60;
               case 38 -> var10000 = 57;
               case 39 -> var10000 = 11;
               case 40 -> var10000 = 30;
               case 41 -> var10000 = 21;
               case 42 -> var10000 = 25;
               case 43 -> var10000 = 39;
               case 44 -> var10000 = 34;
               case 45 -> var10000 = 3;
               case 46 -> var10000 = 48;
               case 47 -> var10000 = 41;
               case 48 -> var10000 = 49;
               case 49 -> var10000 = 20;
               case 50 -> var10000 = 10;
               case 51 -> var10000 = 0;
               case 52 -> var10000 = 36;
               case 53 -> var10000 = 7;
               case 54 -> var10000 = 59;
               case 55 -> var10000 = 15;
               case 56 -> var10000 = 4;
               case 57 -> var10000 = 42;
               case 58 -> var10000 = 43;
               case 59 -> var10000 = 5;
               case 60 -> var10000 = 56;
               case 61 -> var10000 = 44;
               case 62 -> var10000 = 47;
               default -> var10000 = 29;
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
      var10000[2] = Integer.TYPE;
      i[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
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

   private static native Field a(Class var0, String var1, Class var2);

   private static native Field b(Class var0, String var1, Class var2);

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

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 196 && var8 != 226 && var8 != 233 && var8 != 'Y') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'u') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 229) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 196) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 226) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 233) {
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
