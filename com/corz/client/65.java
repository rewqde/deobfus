package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 65 {
   public static final 65 3;
   public static final 65 4;
   public static final 65 9;
   public static final 65 0;
   public static final 65 5;
   private static final 65[] 1;

   private static 65[] _/* $FF was: 0*/() {
      return new 65[]{3, 4, 9, 0, 5};
   }

   static {
      long var9 = s.a(-2980822061547644185L, -605701006558719381L, MethodHandles.lookup().lookupClass()).a(75947014428709L) ^ 50032042474885L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "ï î¯\u0081ÀùÊ\u0003\u008d\u0006\u0012«k\u0095\u0090\u0010Ö«³kã´ö¥jö\u0087úT´$\u000f\b]\u0084BÔdÓ4&";
      int var7 = "ï î¯\u0081ÀùÊ\u0003\u008d\u0006\u0012«k\u0095\u0090\u0010Ö«³kã´ö¥jö\u0087úT´$\u000f\b]\u0084BÔdÓ4&".length();
      char var4 = 16;
      int var12 = -1;

      label28:
      while(true) {
         ++var12;
         String var13 = var5.substring(var12, var12 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     3 = new 65(var0[1], 0);
                     4 = new 65(var0[2], 1);
                     9 = new 65(var0[4], 2);
                     0 = new 65(var0[0], 3);
                     5 = new 65(var0[3], 4);
                     1 = 0();
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "ä\u00193\u008b8YtÀ\b\u008a¬±\u0014\u0090\u0015Q6";
                  var7 = "ä\u00193\u008b8YtÀ\b\u008a¬±\u0014\u0090\u0015Q6".length();
                  var4 = '\b';
                  var12 = -1;
            }

            ++var12;
            var13 = var5.substring(var12, var12 + var4);
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
