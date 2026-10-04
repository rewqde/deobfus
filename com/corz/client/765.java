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

public enum 765 {
   public static final 765 4e;
   public static final 765 4c;
   public static final 765 4U;
   public static final 765 1;
   public static final 765 7;
   public static final 765 0;
   public static final 765 4p;
   public static final 765 9;
   public static final 765 4G;
   public static final 765 4f;
   public static final 765 4S;
   public static final 765 3;
   public static final 765 4h;
   public static final 765 48;
   public static final 765 8;
   public static final 765 4j;
   public static final 765 4;
   public static final 765 4s;
   public static final 765 5;
   public static final 765 4E;
   public static final 765 6;
   private static final 765[] 2;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 765[] _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(765.class, 665);
      a = s.a(-169980513621122813L, 8148235843651556374L, MethodHandles.lookup().lookupClass()).a(167668544277214L);
      long var20 = a ^ 106451219872754L;
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
      String[] var11 = new String[21];
      int var17 = 0;
      String var16 = "\u0017Ä\t>ö\u0017ìÝ]\tÑë¡\u0099\u0092Û\u0010 \u0093-\u0091è\u0087ç\u0095_â\u009e\u0097¦¦(Þ\b\u0016Â¡w0®Â¹\u0018YÑ§\u008e»\u008aW)\u008f6ùIÛ¥\u009dz2)\u009agRÿË\u008c\u0010\u0084Þ\u00977/«\\\u0093\u009dpÇéa\tJ\u0082\u0018x\u0001ùRñÙuÁÝòs0\u0007}zä\u009d£\u00ad\u0099|Øo\u0012\u0018\u0089\u0002Ù;%\u0002á\u00998¼Xß%ZßÏ\u0089bË\u0019â`\u008cü\u0010+Dýåÿ\u008d\u0098¸!Õ\u0092\u0001#O\u0002\u0084\u0010J\u001d\u0014\u001aÇÓ\r\u0086è×\u001f\u000bt¸mø\u0010|ªMé\u000f\u0083T´ó×Íøo±Ú7\u0010Ç\u0097£[t¿Ö]\u0088.J÷h\u000fTç\u0010¯öÓ¦½\u001bfó{4ò~i<øÏ\u0010BòÃºÌ7À·×!¯oN\u0001¤O\u0018µÿ_ÁEF\u009cÑ\u009d;QÏ\u009bý¢Ç¨Æù\u0011¥\"¾±\bA´v7\u000eÃ#\u0087\u0010Å×ó\u009dõPX_\u007fVÞ\u001dGmî\t\u0018ªfÛ,\u0017\u009f+$3kùT\t÷ï´\u0082\u0006¡d\u008b\u008fxï\u0018\u0091MËâêò\u008d\u0097³sÞ\u001eq¤ûNúÙÚ\u0007\u000b\u0093*¦\u0018YÑ§\u008e»\u008aW)Sa¯þ\u00ad2(\u0090\u008a\u0005\u0018\u009eA\u0018\u001a|";
      int var18 = "\u0017Ä\t>ö\u0017ìÝ]\tÑë¡\u0099\u0092Û\u0010 \u0093-\u0091è\u0087ç\u0095_â\u009e\u0097¦¦(Þ\b\u0016Â¡w0®Â¹\u0018YÑ§\u008e»\u008aW)\u008f6ùIÛ¥\u009dz2)\u009agRÿË\u008c\u0010\u0084Þ\u00977/«\\\u0093\u009dpÇéa\tJ\u0082\u0018x\u0001ùRñÙuÁÝòs0\u0007}zä\u009d£\u00ad\u0099|Øo\u0012\u0018\u0089\u0002Ù;%\u0002á\u00998¼Xß%ZßÏ\u0089bË\u0019â`\u008cü\u0010+Dýåÿ\u008d\u0098¸!Õ\u0092\u0001#O\u0002\u0084\u0010J\u001d\u0014\u001aÇÓ\r\u0086è×\u001f\u000bt¸mø\u0010|ªMé\u000f\u0083T´ó×Íøo±Ú7\u0010Ç\u0097£[t¿Ö]\u0088.J÷h\u000fTç\u0010¯öÓ¦½\u001bfó{4ò~i<øÏ\u0010BòÃºÌ7À·×!¯oN\u0001¤O\u0018µÿ_ÁEF\u009cÑ\u009d;QÏ\u009bý¢Ç¨Æù\u0011¥\"¾±\bA´v7\u000eÃ#\u0087\u0010Å×ó\u009dõPX_\u007fVÞ\u001dGmî\t\u0018ªfÛ,\u0017\u009f+$3kùT\t÷ï´\u0082\u0006¡d\u008b\u008fxï\u0018\u0091MËâêò\u008d\u0097³sÞ\u001eq¤ûNúÙÚ\u0007\u000b\u0093*¦\u0018YÑ§\u008e»\u008aW)Sa¯þ\u00ad2(\u0090\u008a\u0005\u0018\u009eA\u0018\u001a|".length();
      char var15 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var36;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[31];
                     int var3 = 0;
                     String var4 = "\u0089ª¡ó^®3\u0092\u008aÄ\n\u0096×õ¸Ä--È#õ\u0099 ]¦ÃÔSy~H\u008b½w\u0081+\u0013É÷6\u001eé\u00ad\u0002ìq\u0082 ¥Ik\u000b\u008e·\u009dP\u0098v\u0082\n«<Â\u0017©Õ®°N\u00868Á½\u009ap\u009bT\u009bÏCÅQsb\u0012\u0004*CëÀ^îÔ;\u0005\u009b\u0093*\u008f×W¹Ô8Hlt\u0096ö\u0006]^r>Ü \u0007[<\u009b¤õ\u0082.\u0093}\u0092J¨M<»¹\u0018B¦>\u009d2Ì\u001fóá\u0004\u0092È\u0018Ê\u009biE1xÑ\u001bW@Ý\b¶%\u0097\u0010·Äuir\u0083-\nÊÓÉ¦$ \\'\n\u0005\u0017@\b%\tµ_\u0095{0\b®ÐéÅ®\u0010x\u001c:ø_Jý|\u0015\u0017³\u001b\tÃT\u009a\u000f¦ãÛì»\u0087Âà76\u00ad\u00ad9\u0018ì\u008d\u000f";
                     int var5 = "\u0089ª¡ó^®3\u0092\u008aÄ\n\u0096×õ¸Ä--È#õ\u0099 ]¦ÃÔSy~H\u008b½w\u0081+\u0013É÷6\u001eé\u00ad\u0002ìq\u0082 ¥Ik\u000b\u008e·\u009dP\u0098v\u0082\n«<Â\u0017©Õ®°N\u00868Á½\u009ap\u009bT\u009bÏCÅQsb\u0012\u0004*CëÀ^îÔ;\u0005\u009b\u0093*\u008f×W¹Ô8Hlt\u0096ö\u0006]^r>Ü \u0007[<\u009b¤õ\u0082.\u0093}\u0092J¨M<»¹\u0018B¦>\u009d2Ì\u001fóá\u0004\u0092È\u0018Ê\u009biE1xÑ\u001bW@Ý\b¶%\u0097\u0010·Äuir\u0083-\nÊÓÉ¦$ \\'\n\u0005\u0017@\b%\tµ_\u0095{0\b®ÐéÅ®\u0010x\u001c:ø_Jý|\u0015\u0017³\u001b\tÃT\u009a\u000f¦ãÛì»\u0087Âà76\u00ad\u00ad9\u0018ì\u008d\u000f".length();
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
                                    b = var6;
                                    c = new Integer[31];
                                    4e = new 765(var11[19], 0);
                                    4c = new 765(var11[11], 1);
                                    4U = new 765(var11[10], 2);
                                    1 = new 765(var11[20], 3);
                                    7 = new 765(var11[6], 4);
                                    0 = new 765(var11[16], 5);
                                    4p = new 765(var11[3], true.r<invokedynamic>(26736, 2901010484588814539L ^ var20));
                                    9 = new 765(var11[17], true.r<invokedynamic>(16817, 191135818698656001L ^ var20));
                                    4G = new 765(var11[18], true.r<invokedynamic>(1545, 499372318770810552L ^ var20));
                                    4f = new 765(var11[1], true.r<invokedynamic>(15635, 6895029412193924538L ^ var20));
                                    4S = new 765(var11[15], true.r<invokedynamic>(1426, 5076026958762200376L ^ var20));
                                    3 = new 765(var11[5], true.r<invokedynamic>(5973, 1024030958272405482L ^ var20));
                                    4h = new 765(var11[9], true.r<invokedynamic>(22424, 8891089641039863584L ^ var20));
                                    48 = new 765(var11[0], true.r<invokedynamic>(28540, 7201495559054763995L ^ var20));
                                    8 = new 765(var11[4], true.r<invokedynamic>(21803, 9223101882458021273L ^ var20));
                                    4j = new 765(var11[13], true.r<invokedynamic>(20805, 5148467926920010211L ^ var20));
                                    4 = new 765(var11[12], true.r<invokedynamic>(30813, 7831140247290949867L ^ var20));
                                    4s = new 765(var11[8], true.r<invokedynamic>(27660, 8087527202960811199L ^ var20));
                                    5 = new 765(var11[2], true.r<invokedynamic>(23402, 8150400137644807134L ^ var20));
                                    4E = new 765(var11[7], true.r<invokedynamic>(5340, 8092516641490787425L ^ var20));
                                    6 = new 765(var11[14], true.r<invokedynamic>(26116, 1444672367999856317L ^ var20));
                                    2 = -1768711435915723501L.X<invokedynamic>(-1768711435915723501L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "i\u000fÙ°ð\u008c^Ô\u0019¨ù\u008b\u0013´aµ";
                                 var5 = "i\u000fÙ°ð\u008c^Ô\u0019¨ù\u008b\u0013´aµ".length();
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

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var36;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label54;
                  }

                  var16 = "7ý²ß\u008bÿ6C\u0088B\u000bh¹õô¤\u0010¥\u0004àGå\u009a(\u0014¡x^¾\u0080^\u009dY";
                  var18 = "7ý²ß\u008bÿ6C\u0088B\u000bh¹õô¤\u0010¥\u0004àGå\u009a(\u0014¡x^¾\u0080^\u009dY".length();
                  var15 = 16;
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   private static native String a(byte[] var0);

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 0 -> var10000 = 1;
               case 1 -> var10000 = 43;
               case 2 -> var10000 = 48;
               case 3 -> var10000 = 6;
               case 4 -> var10000 = 18;
               case 5 -> var10000 = 37;
               case 6 -> var10000 = 25;
               case 7 -> var10000 = 35;
               case 8 -> var10000 = 49;
               case 9 -> var10000 = 36;
               case 10 -> var10000 = 60;
               case 11 -> var10000 = 31;
               case 12 -> var10000 = 34;
               case 13 -> var10000 = 58;
               case 14 -> var10000 = 22;
               case 15 -> var10000 = 23;
               case 16 -> var10000 = 15;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 10;
               case 19 -> var10000 = 50;
               case 20 -> var10000 = 33;
               case 21 -> var10000 = 16;
               case 22 -> var10000 = 32;
               case 23 -> var10000 = 7;
               case 24 -> var10000 = 0;
               case 25 -> var10000 = 63;
               case 26 -> var10000 = 24;
               case 27 -> var10000 = 26;
               case 28 -> var10000 = 19;
               case 29 -> var10000 = 21;
               case 30 -> var10000 = 52;
               case 31 -> var10000 = 41;
               case 32 -> var10000 = 47;
               case 33 -> var10000 = 46;
               case 34 -> var10000 = 44;
               case 35 -> var10000 = 53;
               case 36 -> var10000 = 62;
               case 37 -> var10000 = 27;
               case 38 -> var10000 = 55;
               case 39 -> var10000 = 9;
               case 40 -> var10000 = 5;
               case 41 -> var10000 = 8;
               case 42 -> var10000 = 20;
               case 43 -> var10000 = 40;
               case 44 -> var10000 = 3;
               case 45 -> var10000 = 4;
               case 46 -> var10000 = 2;
               case 47 -> var10000 = 59;
               case 48 -> var10000 = 14;
               case 49 -> var10000 = 29;
               case 50 -> var10000 = 57;
               case 51 -> var10000 = 11;
               case 52 -> var10000 = 13;
               case 53 -> var10000 = 17;
               case 54 -> var10000 = 28;
               case 55 -> var10000 = 45;
               case 56 -> var10000 = 39;
               case 57 -> var10000 = 54;
               case 58 -> var10000 = 12;
               case 59 -> var10000 = 56;
               case 60 -> var10000 = 38;
               case 61 -> var10000 = 30;
               case 62 -> var10000 = 42;
               default -> var10000 = 51;
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

   private static native Field b(Class var0, String var1, Class var2);

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
         if (var8 != 224 && var8 != 200 && var8 != 'P' && var8 != 219) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'Q') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'X') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 200) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'P') {
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
