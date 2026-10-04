package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public class 7fD {
   public final class_2338 5;
   public final class_2680 8r;
   public final class_1792 8y;
   public 8s 8e;
   public class_2338 8J;
   public class_2338 7;
   public class_2350 9;
   public Float 4;
   public Float 8d;
   public Integer 8x;
   public Boolean 3;
   public boolean 1;
   public boolean 8;
   public final List 2;
   public int 0;
   public class_2680 84;
   public final List 8j;
   public final List 8l;
   public int 6;
   public boolean 8K;
   public 7tw 8w;
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
   private static transient String nbGfwMSQZQ;

   public _fD/* $FF was: 7fD*/(class_2338 var1, class_2680 var2, class_1792 var3, long var4) {
      var4 = a ^ var4;
      super();
      this.ù<invokedynamic>(this, "c".þ<invokedynamic>((long)"c", var4), (long)"c", var4);
      this.2 = new ArrayList();
      this.8j = new ArrayList();
      this.8l = new ArrayList();
      this.ù<invokedynamic>(this, "c".þ<invokedynamic>((long)"c", var4), (long)"c", var4);
      this.5 = var1;
      this.8r = var2;
      this.ù<invokedynamic>(this, var2, (long)"c", var4);
      this.8y = var3;
   }

   public 7fD _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (8s)var1[0], (long)"c", var2);
      return this;
   }

   public 7fD _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (class_2338)var1[1], (long)"c", var2);
      return this;
   }

   public 7fD _v/* $FF was: 5v*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (class_2338)var1[0], (long)"c", var2);
      this.ù<invokedynamic>(this, (class_2350)var1[2], (long)"c", var2);
      return this;
   }

   public 7fD _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (Float)var1[0], (long)"c", var2);
      return this;
   }

   public 7fD _v/* $FF was: 0v*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (Float)var1[1], (long)"c", var2);
      return this;
   }

   public 7fD _s/* $FF was: 4s*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7fD _M/* $FF was: 7M*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      this.ù<invokedynamic>(this, (Boolean)var1[0], (long)"c", var3);
      return this;
   }

   public 7fD _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (Boolean)var1[0], (long)"c", var2);
      return this;
   }

   public 7fD _s/* $FF was: 1s*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7fD _/* $FF was: 4*/(Object[] var1) {
      int var2 = (Integer)var1[3];
      int var5 = (Integer)var1[2];
      int var4 = (Integer)var1[1];
      long var6 = ((long)var4 << 48 | (long)var5 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;
      this.ù<invokedynamic>(this, (Integer)var1[0], (long)"c", var6);
      return this;
   }

   public 7fD _z/* $FF was: 0z*/(Object[] var1) {
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      this.ù<invokedynamic>(this, (class_2680)var1[1], (long)"c", var3);
      return this;
   }

   public 7fD _/* $FF was: 1*/(Object[] var1) {
      int var4 = (Integer)var1[1];
      int var2 = (Integer)var1[3];
      int var3 = (Integer)var1[2];
      long var6 = ((long)var4 << 48 | (long)var3 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      this.U<invokedynamic>(this, (long)"c", var6).Õ<invokedynamic>(this.U<invokedynamic>(this, (long)"c", var6), var1[0], (long)"c", var6);
      return this;
   }

   public 7fD _/* $FF was: 0*/(Object[] var1) {
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      this.U<invokedynamic>(this, (long)"c", var3).Õ<invokedynamic>(this.U<invokedynamic>(this, (long)"c", var3), var1[1], (long)"c", var3);
      return this;
   }

   public 7fD _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, false.¢<invokedynamic>(0, (Integer)var1[0], (long)"c", var2), (long)"c", var2);
      return this;
   }

   public 7fD _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.ù<invokedynamic>(this, (Boolean)var1[0], (long)"c", var2);
      return this;
   }

   public 7fD _/* $FF was: 7*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      this.ù<invokedynamic>(this, (7tw)var1[0], (long)"c", var3);
      return this;
   }

   public boolean _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      boolean var10000;
      try {
         if (this.U<invokedynamic>(this, (long)"c", var2) == "c".þ<invokedynamic>((long)"c", var2)) {
            var10000 = true;
            return var10000;
         }
      } catch (MatchException var4) {
         throw var4.¢<invokedynamic>(var4, (long)"c", var2);
      }

      var10000 = false;
      return var10000;
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7fD.class, 127);
      a = s.a(-620131208389952401L, -7146989038762709701L, MethodHandles.lookup().lookupClass()).a(138251762068262L);
      h = new Object[54];
      i = new String[54];
      a();
      d = new HashMap(13);
      long var11 = a ^ 113754052247594L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[12];
      int var18 = 0;
      String var17 = "\u0005°9£\u0011ù¿¨râÓÎ.GFv\u0010aò\u0014R>ïw÷\u009b\u0087±\u00079\r\u0089´ \u0017;\u000eMN¬Ð7ç7R\u008cñîñ£\u0014\u0095\u007f_\\\t¤\u0014´#ö9\u0017ò[\u0099 \u0019x\u0098V4\u0085V~Âø°\u0018T&\u0095k3mL~O¨\u0006\u00197\u008fý\u001eÄOy\u0010 ãO`Z\u0091Ö\u008b\u00141G\u008e`&Ed\u0088\u000e¢z\u0081± Pÿ\u0014æPþ;\u0014\u008c8 -L\u007f\u0080\u008f\u0081p\u009f\u0096Â\"7§\r7«üÌâñé\tµ\u000eÑ¶jòÛ\u008d©»\u0010µ||\u001aMåv¦Ü3uc\u000e\"o\u0013\u0010é\u0011jÞ\u0018B0=O$\u0094\u0005Þ\u0082.¾\u0010$nÑØ\u0005'¾u\u0000\u008aö^°ß\bµ\u0010¼k\u0080ôªñ/\u0005S±ó2[£µ2";
      int var19 = "\u0005°9£\u0011ù¿¨râÓÎ.GFv\u0010aò\u0014R>ïw÷\u009b\u0087±\u00079\r\u0089´ \u0017;\u000eMN¬Ð7ç7R\u008cñîñ£\u0014\u0095\u007f_\\\t¤\u0014´#ö9\u0017ò[\u0099 \u0019x\u0098V4\u0085V~Âø°\u0018T&\u0095k3mL~O¨\u0006\u00197\u008fý\u001eÄOy\u0010 ãO`Z\u0091Ö\u008b\u00141G\u008e`&Ed\u0088\u000e¢z\u0081± Pÿ\u0014æPþ;\u0014\u008c8 -L\u007f\u0080\u008f\u0081p\u009f\u0096Â\"7§\r7«üÌâñé\tµ\u000eÑ¶jòÛ\u008d©»\u0010µ||\u001aMåv¦Ü3uc\u000e\"o\u0013\u0010é\u0011jÞ\u0018B0=O$\u0094\u0005Þ\u0082.¾\u0010$nÑØ\u0005'¾u\u0000\u008aö^°ß\bµ\u0010¼k\u0080ôªñ/\u0005S±ó2[£µ2".length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while(true) {
         ++var23;
         String var24 = var17.substring(var23, var23 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[12];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var26 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var35 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var26.init(2, var35.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u008cW\u0002Ö~ëÂ¶Ç/æ;Öh¾\u009f";
                     int var5 = "\u008cW\u0002Ö~ëÂ¶Ç/æ;Öh¾\u009f".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var38 = true;
                        var6[var10001] = var10004;
                     } while(var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "ª9¢ÀõÀñ²\u007fW\u0092ëÿ\u00126B\u0010ý\u0099j\u001b7\u0007º25HÎ\u001a-É\n7";
                  var19 = "ª9¢ÀõÀñ²\u007fW\u0092ëÿ\u00126B\u0010ý\u0099j\u001b7\u0007º25HÎ\u001a-É\n7".length();
                  var16 = 16;
                  var23 = -1;
            }

            ++var23;
            var24 = var17.substring(var23, var23 + var16);
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

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 35;
               case 1 -> var10000 = 57;
               case 2 -> var10000 = 51;
               case 3 -> var10000 = 39;
               case 4 -> var10000 = 50;
               case 5 -> var10000 = 62;
               case 6 -> var10000 = 27;
               case 7 -> var10000 = 47;
               case 8 -> var10000 = 54;
               case 9 -> var10000 = 56;
               case 10 -> var10000 = 7;
               case 11 -> var10000 = 24;
               case 12 -> var10000 = 45;
               case 13 -> var10000 = 3;
               case 14 -> var10000 = 4;
               case 15 -> var10000 = 53;
               case 16 -> var10000 = 9;
               case 17 -> var10000 = 23;
               case 18 -> var10000 = 18;
               case 19 -> var10000 = 63;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 32;
               case 22 -> var10000 = 0;
               case 23 -> var10000 = 59;
               case 24 -> var10000 = 12;
               case 25 -> var10000 = 2;
               case 26 -> var10000 = 48;
               case 27 -> var10000 = 19;
               case 28 -> var10000 = 61;
               case 29 -> var10000 = 8;
               case 30 -> var10000 = 52;
               case 31 -> var10000 = 40;
               case 32 -> var10000 = 22;
               case 33 -> var10000 = 14;
               case 34 -> var10000 = 16;
               case 35 -> var10000 = 28;
               case 36 -> var10000 = 17;
               case 37 -> var10000 = 1;
               case 38 -> var10000 = 41;
               case 39 -> var10000 = 43;
               case 40 -> var10000 = 20;
               case 41 -> var10000 = 49;
               case 42 -> var10000 = 44;
               case 43 -> var10000 = 13;
               case 44 -> var10000 = 11;
               case 45 -> var10000 = 55;
               case 46 -> var10000 = 36;
               case 47 -> var10000 = 30;
               case 48 -> var10000 = 37;
               case 49 -> var10000 = 25;
               case 50 -> var10000 = 5;
               case 51 -> var10000 = 10;
               case 52 -> var10000 = 60;
               case 53 -> var10000 = 34;
               case 54 -> var10000 = 15;
               case 55 -> var10000 = 33;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 6;
               case 58 -> var10000 = 29;
               case 59 -> var10000 = 21;
               case 60 -> var10000 = 42;
               case 61 -> var10000 = 46;
               case 62 -> var10000 = 31;
               default -> var10000 = 38;
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
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Boolean.TYPE;
      i[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Integer.TYPE;
      i[9] = "c";
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
      var10000[40] = "c";
      var10000[41] = "c";
      var10000[42] = "c";
      var10000[43] = "c";
      var10000[44] = "c";
      var10000[45] = "c";
      var10000[46] = "c";
      var10000[47] = "c";
      var10000[48] = "c";
      var10000[49] = "c";
      var10000[50] = "c";
      var10000[51] = "c";
      var10000[52] = "c";
      var10000[53] = "c";
   }

   private static native Class b(long var0, long var2);

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

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

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
         if (var8 != 'U' && var8 != 249 && var8 != 254 && var8 != 186) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 213) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 162) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'U') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 249) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 254) {
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

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

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
