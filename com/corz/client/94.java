package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 94 {
   public static final 94 2;
   public static final 94 7;
   public static final 94 3;
   public static final 94 1;
   public static final 94 0;
   public static final 94 6;
   public static final 94 5;
   public static final 94 9;
   private static final 94[] 4;
   private static final long a = s.a(-6090798487126426477L, 1292813407189453176L, MethodHandles.lookup().lookupClass()).a(160445993464335L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private static 94[] _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 133173620149793L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "\u008d¸ÔU\u0015rÝ¢¶Ûh\u0081Å\u0018ù\n\bý\u0093\u001bK\u008f\u001fE9\u0010\u0080\"\u0013Nñµ£µ\n¯-z1\u0081eî\u0018\u009f\rVk¥v\u0088ùrÖÜ=3ÉÍÁÚ£bµ\u0096P¶\u0017\u0010|¬\u0017\u0014\u0085\u0019\u0099õx\u0082\u009a\nUÄM·\u0010\u0003×ðtMV!\u0010ÁÄ«ç¿ë[¹";
      int var18 = "\u008d¸ÔU\u0015rÝ¢¶Ûh\u0081Å\u0018ù\n\bý\u0093\u001bK\u008f\u001fE9\u0010\u0080\"\u0013Nñµ£µ\n¯-z1\u0081eî\u0018\u009f\rVk¥v\u0088ùrÖÜ=3ÉÍÁÚ£bµ\u0096P¶\u0017\u0010|¬\u0017\u0014\u0085\u0019\u0099õx\u0082\u009a\nUÄM·\u0010\u0003×ðtMV!\u0010ÁÄ«ç¿ë[¹".length();
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
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u0098-õ.Ìqð\u008b¦uø¹ÁØ_ô¶»x\u0091¦à\u001c<";
                     int var5 = "\u0098-õ.Ìqð\u008b¦uø¹ÁØ_ô¶»x\u0091¦à\u001c<".length();
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
                                    c = new Integer[5];
                                    2 = new 94(var11[1], 0);
                                    7 = new 94(var11[0], 1);
                                    3 = new 94(var11[4], 2);
                                    1 = new 94(var11[6], 3);
                                    0 = new 94(var11[3], 4);
                                    6 = new 94(var11[5], 5);
                                    5 = new 94(var11[2], true.x<invokedynamic>(11951, 513094483643588057L ^ var20));
                                    9 = new 94(var11[7], true.x<invokedynamic>(31715, 4359636524558944407L ^ var20));
                                    4 = 8();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "{©\u008fà.d0\u0096WÿÙ\u0086\u000b\u001eÑÜ";
                                 var5 = "{©\u008fà.d0\u0096WÿÙ\u0086\u000b\u001eÑÜ".length();
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

                  var16 = "È>)M\u0080\u0018\u001eÉ@äa«,ºXÑ²ÛÓu\u0016ø[\u008d\u0010[Àåaçã\u001b?\u0013Òò\u000fL×\u0092¾";
                  var18 = "È>)M\u0080\u0018\u001eÉ@äa«,ºXÑ²ÛÓu\u0016ø[\u008d\u0010[Àåaçã\u001b?\u0013Òò\u000fL×\u0092¾".length();
                  var15 = 24;
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
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
}
