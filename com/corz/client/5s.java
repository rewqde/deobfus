package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 5S {
   public static final 5S 6;
   public static final 5S 0;
   public static final 5S 3;
   private static final 5S[] 9;

   private static 5S[] _/* $FF was: 9*/() {
      return new 5S[]{6, 0, 3};
   }

   static {
      a.b99571f71427e3b19.a.init(5S.class, 509);
      long var9 = s.a(-5019969048073668566L, -5624916922169623593L, MethodHandles.lookup().lookupClass()).a(275688901975014L) ^ 75305496484903L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "sÄ«yÛ\u009ej\u001dbWÓÊ»?\u0000p\bÙ»ÐÝ\u001d+tª\b«½wõÜ\u001aà\u008a";
      int var7 = "sÄ«yÛ\u009ej\u001dbWÓÊ»?\u0000p\bÙ»ÐÝ\u001d+tª\b«½wõÜ\u001aà\u008a".length();
      char var4 = 16;
      int var3 = -1;

      while(true) {
         ++var3;
         byte[] var8 = var1.doFinal(var5.substring(var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         boolean var10001 = true;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            6 = new 5S(var0[0], 0);
            0 = new 5S(var0[2], 1);
            3 = new 5S(var0[1], 2);
            9 = 9();
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static native String a(byte[] var0);
}
