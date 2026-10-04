package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 8K {
   private static final Set 1;
   private static final Set 6;
   private static final Map 0;
   private static final Map 7;
   private static final Set 4;
   private static final long a = s.a(5016044598383916067L, 3177612723584491263L, MethodHandles.lookup().lookupClass()).a(232935723306558L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String iMVzgnozfl;

   private _K/* $FF was: 8K*/() {
   }

   private static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 16744485755936L;
      e = new Object[31];
      f = new String[31];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[3];
      int var17 = 0;
      String var16 = "g&õ\u0010X÷'M\u0002\u001fw\u009f¤\u000eì\n\u00838×\u001e7Ø3Ê8ß®½D»ÔþÄ\u009a#ê^ûÒCïÝ\u0013[â5 ï-\u0016hÒOz$´,\u009b\u008b\u00179¶,}c,¯F_+ä\u007fÆæv\u001eÏ\u0094\u0004\u0014;\u0018g&õ\u0010X÷'M\u0002\u001fw\u009f¤\u000eì\n\u00838×\u001e7Ø3Ê";
      int var18 = "g&õ\u0010X÷'M\u0002\u001fw\u009f¤\u000eì\n\u00838×\u001e7Ø3Ê8ß®½D»ÔþÄ\u009a#ê^ûÒCïÝ\u0013[â5 ï-\u0016hÒOz$´,\u009b\u008b\u00179¶,}c,¯F_+ä\u007fÆæv\u001eÏ\u0094\u0004\u0014;\u0018g&õ\u0010X÷'M\u0002\u001fw\u009f¤\u000eì\n\u00838×\u001e7Ø3Ê".length();
      char var15 = 24;
      int var14 = -1;

      while(true) {
         ++var14;
         byte[] var19 = var12.doFinal(var16.substring(var14, var14 + var15).getBytes("ISO-8859-1"));
         String var34 = a(var19).intern();
         int var10001 = -1;
         var11[var17++] = var34;
         if ((var14 += var15) >= var18) {
            d = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var36 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
            }

            var10000.init(2, var36.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[33];
            int var3 = 0;
            String var4 = "\u008b/@º\u001cuÙ²ì7ô_¤èÔãØ&3[ò?¸ZÉ¾.\u0087T\u000bÓ|\u0083\tl6ÎO\u0006í\u000bñ\u008bN\u0016\u001fÎ\u0081!g\u009b\bwÃ\u000fÛ§p\u009bÓ\u0018@£ªâ\u001d\nI\u0005Æ8&±qÂ¢Ãíý\bÎ\u0014½¨\u000b-ªÈA_½ª¤uV¨Üòî\u001fþ9\u009a:9õ¯/\u009f8\u009e¹ñòû½·Ä\u008e\u0007©\u001f7\u00ady\u0018Ð\u0097\u0097ÃÓ\u0000üÞUÀ¨´T²t7\u0091ôû\u0016#\u0081á\tõZ\u000bÁ\u0088¤+c¯ÑG\u0011ÁVìCPÝ\u0099Tiô\u0005ÈRE\u0096Q|\u0015Cµ¢_%Ü\\':Ìý\u0088®÷ü!Æ\u0001\u001fO£k¹\\Ã\n®\u0017~\u0090;\u0019\u008c\u0017\u0000Î\u0012þE×Üt\u0095D¥NË;iè7«\u008dõjyð K¼\u0096Ëúèåôv¸";
            int var5 = "\u008b/@º\u001cuÙ²ì7ô_¤èÔãØ&3[ò?¸ZÉ¾.\u0087T\u000bÓ|\u0083\tl6ÎO\u0006í\u000bñ\u008bN\u0016\u001fÎ\u0081!g\u009b\bwÃ\u000fÛ§p\u009bÓ\u0018@£ªâ\u001d\nI\u0005Æ8&±qÂ¢Ãíý\bÎ\u0014½¨\u000b-ªÈA_½ª¤uV¨Üòî\u001fþ9\u009a:9õ¯/\u009f8\u009e¹ñòû½·Ä\u008e\u0007©\u001f7\u00ady\u0018Ð\u0097\u0097ÃÓ\u0000üÞUÀ¨´T²t7\u0091ôû\u0016#\u0081á\tõZ\u000bÁ\u0088¤+c¯ÑG\u0011ÁVìCPÝ\u0099Tiô\u0005ÈRE\u0096Q|\u0015Cµ¢_%Ü\\':Ìý\u0088®÷ü!Æ\u0001\u001fO£k¹\\Ã\n®\u0017~\u0090;\u0019\u008c\u0017\u0000Î\u0012þE×Üt\u0095D¥NË;iè7«\u008dõjyð K¼\u0096Ëúèåôv¸".length();
            int var2 = 0;

            label32:
            while(true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               int var50 = -1;

               while(true) {
                  long var8 = var37;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var68 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch (var50) {
                     case 0:
                        var25[var10001] = var68;
                        if (var2 >= var5) {
                           b = var6;
                           c = new Integer[33];
                           Class var26 = new Integer[true.t<invokedynamic>(28237, 6659458467505117985L ^ var20)];
                           var50 = 12765.t<invokedynamic>(12765, 1415464009952412852L ^ var20);
                           ((Object[])var26)[0] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var50 = 12310.t<invokedynamic>(12310, 472433577634645363L ^ var20);
                           ((Object[])var26)[1] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var50 = 26459.t<invokedynamic>(26459, 5728720208657683004L ^ var20);
                           ((Object[])var26)[2] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var50 = 7481.t<invokedynamic>(7481, 8549009406182385750L ^ var20);
                           ((Object[])var26)[3] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var50 = 10418.t<invokedynamic>(10418, 6379429918090190284L ^ var20);
                           ((Object[])var26)[4] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var50 = 1870.t<invokedynamic>(1870, 7086129957528629802L ^ var20);
                           ((Object[])var26)[5] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           int var39 = 29580.t<invokedynamic>(29580, 6614510219596400365L ^ var20);
                           var50 = 27805.t<invokedynamic>(27805, 1464080116370872801L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 26865.t<invokedynamic>(26865, 1680349204088724889L ^ var20);
                           var50 = 12952.t<invokedynamic>(12952, 6294207126388852713L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 31527.t<invokedynamic>(31527, 7900722228956925523L ^ var20);
                           var50 = 79.t<invokedynamic>(79, 2147996774039287101L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 5914.t<invokedynamic>(5914, 4938841341741195881L ^ var20);
                           var50 = 9576.t<invokedynamic>(9576, 1073396742300880906L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 19857.t<invokedynamic>(19857, 3885469343055427817L ^ var20);
                           var50 = 13561.t<invokedynamic>(13561, 3843204718861926788L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 19069.t<invokedynamic>(19069, 4545582199433871117L ^ var20);
                           var50 = 14336.t<invokedynamic>(14336, 8963845349525671274L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 2298.t<invokedynamic>(2298, 8162209584487726487L ^ var20);
                           var50 = 29073.t<invokedynamic>(29073, 6001857824592889062L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 27405.t<invokedynamic>(27405, 6090633619759570548L ^ var20);
                           var50 = 4206.t<invokedynamic>(4206, 7831907598430004480L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 9360.t<invokedynamic>(9360, 92531285593149930L ^ var20);
                           var50 = 17334.t<invokedynamic>(17334, 6504570683809052374L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           var39 = 27313.t<invokedynamic>(27313, 6324715420601196494L ^ var20);
                           var50 = 28592.t<invokedynamic>(28592, 2601238500177091275L ^ var20);
                           ((Object[])var26)[var39] = var50.N<invokedynamic>(var50, 4126246669328052020L, var20);
                           1 = var26.N<invokedynamic>(var26, 4126017973906570807L, var20);
                           var26 = true.t<invokedynamic>(6560, 8170948967238036675L ^ var20).N<invokedynamic>(true.t<invokedynamic>(6560, 8170948967238036675L ^ var20), 4126246669328052020L, var20);
                           6 = var26.N<invokedynamic>(var26, true.t<invokedynamic>(22444, 8386836976123814618L ^ var20).N<invokedynamic>(true.t<invokedynamic>(22444, 8386836976123814618L ^ var20), 4126246669328052020L, var20), 4125347061939452895L, var20);
                           var26 = true.t<invokedynamic>(21542, 6441773755978228051L ^ var20).N<invokedynamic>(true.t<invokedynamic>(21542, 6441773755978228051L ^ var20), 4126246669328052020L, var20);
                           0 = var26.N<invokedynamic>(var26, var11[1], 4125897516767944308L, var20);
                           var26 = true.t<invokedynamic>(24815, 4402498383132857732L ^ var20).N<invokedynamic>(true.t<invokedynamic>(24815, 4402498383132857732L ^ var20), 4126246669328052020L, var20);
                           7 = var26.N<invokedynamic>(var26, var11[0], true.t<invokedynamic>(1101, 3971717656174817539L ^ var20).N<invokedynamic>(true.t<invokedynamic>(1101, 3971717656174817539L ^ var20), 4126246669328052020L, var20), var11[2], 4125971396066647653L, var20);
                           4 = new HashSet();
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var68;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "çu\u0006\u009f\u0080k÷¼\u0010\u0090@áÚg\u0018`";
                        var5 = "çu\u0006\u009f\u0080k÷¼\u0010\u0090@áÚg\u0018`".length();
                        var2 = 0;
                  }

                  var10001 = var2;
                  var2 += 8;
                  var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var50 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
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
               case 0 -> var10000 = 36;
               case 1 -> var10000 = 44;
               case 2 -> var10000 = 18;
               case 3 -> var10000 = 3;
               case 4 -> var10000 = 1;
               case 5 -> var10000 = 45;
               case 6 -> var10000 = 14;
               case 7 -> var10000 = 5;
               case 8 -> var10000 = 48;
               case 9 -> var10000 = 29;
               case 10 -> var10000 = 47;
               case 11 -> var10000 = 12;
               case 12 -> var10000 = 31;
               case 13 -> var10000 = 8;
               case 14 -> var10000 = 15;
               case 15 -> var10000 = 0;
               case 16 -> var10000 = 32;
               case 17 -> var10000 = 2;
               case 18 -> var10000 = 25;
               case 19 -> var10000 = 41;
               case 20 -> var10000 = 57;
               case 21 -> var10000 = 50;
               case 22 -> var10000 = 28;
               case 23 -> var10000 = 9;
               case 24 -> var10000 = 17;
               case 25 -> var10000 = 10;
               case 26 -> var10000 = 55;
               case 27 -> var10000 = 37;
               case 28 -> var10000 = 20;
               case 29 -> var10000 = 51;
               case 30 -> var10000 = 43;
               case 31 -> var10000 = 21;
               case 32 -> var10000 = 35;
               case 33 -> var10000 = 24;
               case 34 -> var10000 = 30;
               case 35 -> var10000 = 56;
               case 36 -> var10000 = 40;
               case 37 -> var10000 = 33;
               case 38 -> var10000 = 46;
               case 39 -> var10000 = 63;
               case 40 -> var10000 = 61;
               case 41 -> var10000 = 4;
               case 42 -> var10000 = 6;
               case 43 -> var10000 = 11;
               case 44 -> var10000 = 16;
               case 45 -> var10000 = 22;
               case 46 -> var10000 = 38;
               case 47 -> var10000 = 62;
               case 48 -> var10000 = 34;
               case 49 -> var10000 = 53;
               case 50 -> var10000 = 49;
               case 51 -> var10000 = 19;
               case 52 -> var10000 = 52;
               case 53 -> var10000 = 27;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 60;
               case 56 -> var10000 = 13;
               case 57 -> var10000 = 59;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 39;
               case 60 -> var10000 = 54;
               case 61 -> var10000 = 23;
               case 62 -> var10000 = 26;
               default -> var10000 = 7;
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
      var10000[1] = Integer.TYPE;
      f[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Boolean.TYPE;
      f[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Byte.TYPE;
      f[11] = "c";
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
         if (var8 != 234 && var8 != 206 && var8 != 165 && var8 != 'e') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'E') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'N') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 234) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 206) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 165) {
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
