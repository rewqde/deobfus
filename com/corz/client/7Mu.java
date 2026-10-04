package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 7MU {
   public static final 7MU 9;
   public static final 7MU 4;
   public static final 7MU 5;
   public static final 7MU 6;
   public static final 7MU 8;
   public static final 7MU 2;
   final boolean 3;
   final boolean 1;
   private static final 7MU[] 7;
   private static final long a = s.a(-1413867787337783686L, -7789968730263726206L, MethodHandles.lookup().lookupClass()).a(109558421386207L);
   private static final long b;

   private _MU/* $FF was: 7MU*/(boolean var3, boolean var4) {
      this.3 = var3;
      this.1 = var4;
   }

   private static 7MU[] _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var14 = a ^ 71758130227817L;
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "0È¼KeÜÞ\u0096m¶\u0080+îÞÕû\u00183P\u0095mj6\u009eCgTñ\u0086\u0082\u0011©+\rý\u0000=\u0012®\u008e\u0001\u00183P\u0095mj6\u009eC|0)á-§'tÂó\u0014¥åÑ£\u009a\u00183\u0014\u0012\u008a;\u008a\r\u0083Y\u009e?´Ö?\u001bl1xé¦\u0097\u0091J»";
      int var12 = "0È¼KeÜÞ\u0096m¶\u0080+îÞÕû\u00183P\u0095mj6\u009eCgTñ\u0086\u0082\u0011©+\rý\u0000=\u0012®\u008e\u0001\u00183P\u0095mj6\u009eC|0)á-§'tÂó\u0014¥åÑ£\u009a\u00183\u0014\u0012\u008a;\u008a\r\u0083Y\u009e?´Ö?\u001bl1xé¦\u0097\u0091J»".length();
      char var9 = 16;
      int var17 = -1;

      label37:
      while(true) {
         ++var17;
         String var18 = var10.substring(var17, var17 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var5[var11++] = var26;
                  if ((var17 += var9) >= var12) {
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var28 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var28.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 5170347315387383136L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var29 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     b = var29;
                     9 = new 7MU(var5[0], 0, true, false);
                     4 = new 7MU(var5[5], 1, false, false);
                     5 = new 7MU(var5[4], 2, false, false);
                     6 = new 7MU(var5[2], 3, false, true);
                     8 = new 7MU(var5[1], 4, false, true);
                     2 = new 7MU(var5[3], 5, false, false);
                     7 = 0();
                     return;
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var5[var11++] = var26;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label37;
                  }

                  var10 = "´ÅÞ*Î\u0083hdu¸©P\u0088MÌH\u0010ðè}óQ\fc.\u0019|\u008c[\u009d2\u001b6";
                  var12 = "´ÅÞ*Î\u0083hdu¸©P\u0088MÌH\u0010ðè}óQ\fc.\u0019|\u008c[\u009d2\u001b6".length();
                  var9 = 16;
                  var17 = -1;
            }

            ++var17;
            var18 = var10.substring(var17, var17 + var9);
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
}
