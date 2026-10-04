package com.corz.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface 5 {
   int 0;

   static {
      long var2 = s.a(7974140469918893266L, -8040961134570202286L, MethodHandles.lookup().lookupClass()).a(120726681747280L) ^ 121298227308201L;
      Cipher var4;
      Cipher var10000 = var4 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var2 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var5 = 1; var5 < 8; ++var5) {
         var10003[var5] = (byte)((int)(var2 << var5 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var6 = 9191867056470966263L;
      byte[] var8 = var4.doFinal(new byte[]{(byte)((int)(var6 >>> 56)), (byte)((int)(var6 >>> 48)), (byte)((int)(var6 >>> 40)), (byte)((int)(var6 >>> 32)), (byte)((int)(var6 >>> 24)), (byte)((int)(var6 >>> 16)), (byte)((int)(var6 >>> 8)), (byte)((int)var6)});
      long var9 = ((long)var8[0] & 255L) << 56 | ((long)var8[1] & 255L) << 48 | ((long)var8[2] & 255L) << 40 | ((long)var8[3] & 255L) << 32 | ((long)var8[4] & 255L) << 24 | ((long)var8[5] & 255L) << 16 | ((long)var8[6] & 255L) << 8 | (long)var8[7] & 255L;
      boolean var10001 = true;
      long var0 = var9;
      0 = (int)var0;
   }
}
