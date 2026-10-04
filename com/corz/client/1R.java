package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 1r extends 9a {
   private final 4S 2i;
   private final 4S 9;
   private final 4H 2y;
   private final 4A 2m;
   private final 4A 2V;
   private final 4A 2f;
   private final 4A 5;
   private final 4A 0;
   private final 4A 2;
   private final 4A 2h;
   private final 4i 28;
   private final 4H 2l;
   private final 4H 2p;
   private final 4A 1;
   private final long 2W;
   private long 2v;
   private float 3;
   private int 2X;
   private boolean 25;
   private final 7FT 2t;
   private long 7;
   private final List 2J;
   private int 2u;
   private boolean 2Q;
   private static final int 6;
   private static final int 2F;
   private static final float 8 = 0.6F;
   private static final float 26 = 0.32F;
   private static final float[][] 2k;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long[] o;
   private static final Long[] p;
   private static final Map q;
   private static final Object[] t;
   private static final String[] u;
   // $FF: synthetic field
   private static transient String aCcqwtiHie;

   public _r/* $FF was: 1r*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected native void _U/* $FF was: 1U*/();

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected native void _/* $FF was: 0*/();

   public void _/* $FF was: 8*/(762 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _J/* $FF was: 7J*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _r/* $FF was: 8r*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _9/* $FF was: 99*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 9*/(long var1, int var3, char var4, short var5) {
      long var6 = ((long)var3 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      this.B<invokedynamic>(this, var1, (long)"c", var6);
   }

   private void _/* $FF was: 7*/(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(1r.class, 452);
      b = com.corz.client.s.a(8001020783100521154L, -276569670789246859L, MethodHandles.lookup().lookupClass()).a(137730746113408L);
      t = new Object[214];
      u = new String[214];
      b();
      h = new HashMap(13);
      long var22 = b ^ 25384743362876L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[2];
      int var29 = 0;
      String var28 = "-B\u008c)\u0017u\u009e_\u001d©hÈã\u009b¾\u0014b>!D\u0003\u008e®g\u0096Í\u00905[L\u0099ÕA\u0099m\u001b9\u0085\u009e\u009b\u000f\u009bX\u0086\u0007m\u00adLòhê\u0096c\u0098lù\u0003l\f\u0084Ç¼&sæ5\u0083\u0016ÿó\u0094ººh\u0012· !ù\u000b:è\u000e\u001fðL«²,á`\u0094\u0084dÞwð(×0À\u001dH\u009dÕWp6\u009aèJ\u0006\u0010\u0019\u001aÖf\u0003tô'\u001a\\Y\u0012VµG¼=\u0002ÌlC\u00101\u0016\u0000=É.:g>LG3ú\u0096 ¾úËHn\u001a¯O\u0095sóçÉ¹ÂX\t¡\u0010\u00ad\u00047\u0091\u0094\u001dN\u00ad¦\u0085ÙjCï\u0097ê";
      int var30 = "-B\u008c)\u0017u\u009e_\u001d©hÈã\u009b¾\u0014b>!D\u0003\u008e®g\u0096Í\u00905[L\u0099ÕA\u0099m\u001b9\u0085\u009e\u009b\u000f\u009bX\u0086\u0007m\u00adLòhê\u0096c\u0098lù\u0003l\f\u0084Ç¼&sæ5\u0083\u0016ÿó\u0094ººh\u0012· !ù\u000b:è\u000e\u001fðL«²,á`\u0094\u0084dÞwð(×0À\u001dH\u009dÕWp6\u009aèJ\u0006\u0010\u0019\u001aÖf\u0003tô'\u001a\\Y\u0012VµG¼=\u0002ÌlC\u00101\u0016\u0000=É.:g>LG3ú\u0096 ¾úËHn\u001a¯O\u0095sóçÉ¹ÂX\t¡\u0010\u00ad\u00047\u0091\u0094\u001dN\u00ad¦\u0085ÙjCï\u0097ê".length();
      char var27 = 168;
      int var26 = -1;

      while(true) {
         ++var26;
         byte[] var32 = var24.doFinal(var28.substring(var26, var26 + var27).getBytes("ISO-8859-1"));
         String var44 = b(var32).intern();
         int var10001 = -1;
         var31[var29++] = var44;
         if ((var26 += var27) >= var30) {
            f = var31;
            g = new String[2];
            n = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var46 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var12 = 1; var12 < 8; ++var12) {
               var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
            }

            var10000.init(2, var46.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[46];
            int var14 = 0;
            String var15 = "|sö¦\\¨IÅëÐ\u0011\u0086ªûô$\u0000\u009bW,8§'\u0014\u0003g\u0086â\u00ad\u007fl'\tÌHßÄ¸\u0006\u0081@;¡ÄVÌ/\u008e5m¼{0jpå\u0097eÓ?ó®H\u008bGwZ{0þò´\u0012Ûzv\u0091/\u009b\u009c7å)·Ë09/=UöB\u0018Ä©{\u007fâèIîW'çú\u0094«V\u008cSå\u0093\u008a!×\u0096\r\u00052\u000e[\u00ad+\u009eY\u008d\u0087ü·\u0096\u0002^\u001e\u0005¦\u0013\u0010BsáxÒ!hæ£á®º.E]\u001c`\u009f)\u00876eoE`\u0000FaA\u0001\u000bÏ©\u0018\u008aÎ¥|q#)þê*\u001bHüË£':dÑ8ù\u0090\"ÐW\u009e,?q\u009f.q_¬\u000f\u0003*Üã÷9r\u0019g\u000f¤¨Èfê<\tws=\u001bð¡h\u009fhñôbàß\u0091x\nV¼@CWY\u0017I\u007fa\u007fÎ\nÓwÈ\u0001¨ë\u009c±\u001eWëËÚ5=Í±M²%\u0017\u0014·jw·\u0086\u0019\u0013ÖQNÞVº!kðInþy#Óa¢u{\u0012K}De\u0089[Åa\u0002A\u0081é\u007f\rô«fàòéköì\u0088\u0095ú\u0092¡+Á\u0016\u0080îþ÷¯ßÁºC\u0083ß\u0089¥\u0003S¦'ð\u007f";
            int var16 = "|sö¦\\¨IÅëÐ\u0011\u0086ªûô$\u0000\u009bW,8§'\u0014\u0003g\u0086â\u00ad\u007fl'\tÌHßÄ¸\u0006\u0081@;¡ÄVÌ/\u008e5m¼{0jpå\u0097eÓ?ó®H\u008bGwZ{0þò´\u0012Ûzv\u0091/\u009b\u009c7å)·Ë09/=UöB\u0018Ä©{\u007fâèIîW'çú\u0094«V\u008cSå\u0093\u008a!×\u0096\r\u00052\u000e[\u00ad+\u009eY\u008d\u0087ü·\u0096\u0002^\u001e\u0005¦\u0013\u0010BsáxÒ!hæ£á®º.E]\u001c`\u009f)\u00876eoE`\u0000FaA\u0001\u000bÏ©\u0018\u008aÎ¥|q#)þê*\u001bHüË£':dÑ8ù\u0090\"ÐW\u009e,?q\u009f.q_¬\u000f\u0003*Üã÷9r\u0019g\u000f¤¨Èfê<\tws=\u001bð¡h\u009fhñôbàß\u0091x\nV¼@CWY\u0017I\u007fa\u007fÎ\nÓwÈ\u0001¨ë\u009c±\u001eWëËÚ5=Í±M²%\u0017\u0014·jw·\u0086\u0019\u0013ÖQNÞVº!kðInþy#Óa¢u{\u0012K}De\u0089[Åa\u0002A\u0081é\u007f\rô«fàòéköì\u0088\u0095ú\u0092¡+Á\u0016\u0080îþ÷¯ßÁºC\u0083ß\u0089¥\u0003S¦'ð\u007f".length();
            int var13 = 0;

            label50:
            while(true) {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               long[] var36 = var17;
               var10001 = var14++;
               long var47 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
               byte var51 = -1;

               while(true) {
                  long var19 = var47;
                  byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                  long var55 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                  switch (var51) {
                     case 0:
                        var36[var10001] = var55;
                        if (var13 >= var16) {
                           l = var17;
                           m = new Integer[46];
                           2F = true.v<invokedynamic>(18289, var22 ^ 9144319164626446338L);
                           6 = true.v<invokedynamic>(19471, var22 ^ 368512020092920653L);
                           q = new HashMap(13);
                           Cipher var0;
                           Cipher var37 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           SecretKeyFactory var49 = SecretKeyFactory.getInstance("DES");
                           byte[] var53 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                           for(int var1 = 1; var1 < 8; ++var1) {
                              var53[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                           }

                           var37.init(2, var49.generateSecret(new DESKeySpec(var53)), new IvParameterSpec(new byte[8]));
                           long[] var6 = new long[3];
                           int var3 = 0;
                           String var4 = "\u0015\u0091Ìð\u0015YÓ¤P$Üò%r)B\u000f¾\u0015p/>\u000b;";
                           int var5 = "\u0015\u0091Ìð\u0015YÓ¤P$Üò%r)B\u000f¾\u0015p/>\u000b;".length();
                           int var2 = 0;

                           do {
                              var10001 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                              var10001 = var3++;
                              long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                              byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                              var55 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                              boolean var54 = true;
                              var6[var10001] = var55;
                           } while(var2 < var5);

                           o = var6;
                           p = new Long[3];
                           2k = new float[][]{{0.7071F, 0.7071F}, {0.7071F, -0.7071F}};
                           return;
                        }
                        break;
                     default:
                        var36[var10001] = var55;
                        if (var13 < var16) {
                           continue label50;
                        }

                        var15 = "\u000bÌ|ü4jØ²\raÿö\u0091¡\u0095Z";
                        var16 = "\u000bÌ|ü4jØ²\raÿö\u0091¡\u0095Z".length();
                        var13 = 0;
                  }

                  var10001 = var13;
                  var13 += 8;
                  var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                  var36 = var17;
                  var10001 = var14++;
                  var47 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                  var51 = 0;
               }
            }
         }

         var27 = var28.charAt(var26);
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native String b(byte[] var0);

   private static String b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & "c") ^ 33;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("c"), SecretKeyFactory.getInstance("c"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("c", var14);
         }

         int var15 = (var10[4] & "c") << 24 | (var10[5] & "c") << 16 | (var10[6] & "c") << 8 | var10[7] & "c";
         m[var3] = var15;
      }

      return m[var3];
   }

   private static native int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static long e(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long e(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (u[var4] != null) {
         return var4;
      } else {
         Object var5 = t[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 22;
               case 1 -> var10000 = 40;
               case 2 -> var10000 = 18;
               case 3 -> var10000 = 44;
               case 4 -> var10000 = 0;
               case 5 -> var10000 = 34;
               case 6 -> var10000 = 60;
               case 7 -> var10000 = 9;
               case 8 -> var10000 = 25;
               case 9 -> var10000 = 50;
               case 10 -> var10000 = 13;
               case 11 -> var10000 = 36;
               case 12 -> var10000 = 58;
               case 13 -> var10000 = 23;
               case 14 -> var10000 = 5;
               case 15 -> var10000 = 14;
               case 16 -> var10000 = 46;
               case 17 -> var10000 = 24;
               case 18 -> var10000 = 16;
               case 19 -> var10000 = 10;
               case 20 -> var10000 = 55;
               case 21 -> var10000 = 52;
               case 22 -> var10000 = 37;
               case 23 -> var10000 = 33;
               case 24 -> var10000 = 30;
               case 25 -> var10000 = 8;
               case 26 -> var10000 = 1;
               case 27 -> var10000 = 42;
               case 28 -> var10000 = 63;
               case 29 -> var10000 = 51;
               case 30 -> var10000 = 26;
               case 31 -> var10000 = 54;
               case 32 -> var10000 = 61;
               case 33 -> var10000 = 47;
               case 34 -> var10000 = 4;
               case 35 -> var10000 = 7;
               case 36 -> var10000 = 3;
               case 37 -> var10000 = 41;
               case 38 -> var10000 = 39;
               case 39 -> var10000 = 56;
               case 40 -> var10000 = 32;
               case 41 -> var10000 = 31;
               case 42 -> var10000 = 48;
               case 43 -> var10000 = 62;
               case 44 -> var10000 = 17;
               case 45 -> var10000 = 2;
               case 46 -> var10000 = 59;
               case 47 -> var10000 = 43;
               case 48 -> var10000 = 35;
               case 49 -> var10000 = 11;
               case 50 -> var10000 = 29;
               case 51 -> var10000 = 15;
               case 52 -> var10000 = 53;
               case 53 -> var10000 = 45;
               case 54 -> var10000 = 21;
               case 55 -> var10000 = 49;
               case 56 -> var10000 = 6;
               case 57 -> var10000 = 27;
               case 58 -> var10000 = 12;
               case 59 -> var10000 = 20;
               case 60 -> var10000 = 19;
               case 61 -> var10000 = 28;
               case 62 -> var10000 = 57;
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

            u[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = t;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Void.TYPE;
      u[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Float.TYPE;
      u[7] = "c";
      var10000[8] = "c";
      var10000[9] = Integer.TYPE;
      u[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = Double.TYPE;
      u[17] = "c";
      var10000[18] = "c";
      var10000[19] = Long.TYPE;
      u[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = Boolean.TYPE;
      u[26] = "c";
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
      var10000[54] = "c";
      var10000[55] = "c";
      var10000[56] = "c";
      var10000[57] = "c";
      var10000[58] = "c";
      var10000[59] = "c";
      var10000[60] = "c";
      var10000[61] = "c";
      var10000[62] = "c";
      var10000[63] = "c";
      var10000[64] = "c";
      var10000[65] = "c";
      var10000[66] = "c";
      var10000[67] = "c";
      var10000[68] = "c";
      var10000[69] = "c";
      var10000[70] = "c";
      var10000[71] = "c";
      var10000[72] = "c";
      var10000[73] = "c";
      var10000[74] = "c";
      var10000[75] = "c";
      var10000[76] = "c";
      var10000[77] = "c";
      var10000[78] = "c";
      var10000[79] = "c";
      var10000[80] = "c";
      var10000[81] = "c";
      var10000[82] = "c";
      var10000[83] = "c";
      var10000[84] = "c";
      var10000[85] = "c";
      var10000[86] = "c";
      var10000[87] = "c";
      var10000[88] = "c";
      var10000[89] = "c";
      var10000[90] = "c";
      var10000[91] = "c";
      var10000[92] = "c";
      var10000[93] = "c";
      var10000[94] = "c";
      var10000[95] = "c";
      var10000[96] = "c";
      var10000[97] = "c";
      var10000[98] = "c";
      var10000[99] = "c";
      var10000[100] = "c";
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
      var10000[105] = "c";
      var10000[106] = "c";
      var10000[107] = "c";
      var10000[108] = "c";
      var10000[109] = "c";
      var10000[110] = "c";
      var10000[111] = "c";
      var10000[112] = "c";
      var10000[113] = "c";
      var10000[114] = "c";
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
      var10000[136] = "c";
      var10000[137] = "c";
      var10000[138] = "c";
      var10000[139] = "c";
      var10000[140] = "c";
      var10000[141] = "c";
      var10000[142] = "c";
      var10000[143] = "c";
      var10000[144] = "c";
      var10000[145] = "c";
      var10000[146] = "c";
      var10000[147] = "c";
      var10000[148] = "c";
      var10000[149] = "c";
      var10000[150] = "c";
      var10000[151] = "c";
      var10000[152] = "c";
      var10000[153] = "c";
      var10000[154] = "c";
      var10000[155] = "c";
      var10000[156] = "c";
      var10000[157] = "c";
      var10000[158] = "c";
      var10000[159] = "c";
      var10000[160] = "c";
      var10000[161] = "c";
      var10000[162] = "c";
      var10000[163] = "c";
      var10000[164] = "c";
      var10000[165] = "c";
      var10000[166] = "c";
      var10000[167] = "c";
      var10000[168] = "c";
      var10000[169] = "c";
      var10000[170] = "c";
      var10000[171] = "c";
      var10000[172] = "c";
      var10000[173] = "c";
      var10000[174] = "c";
      var10000[175] = "c";
      var10000[176] = "c";
      var10000[177] = "c";
      var10000[178] = "c";
      var10000[179] = "c";
      var10000[180] = "c";
      var10000[181] = "c";
      var10000[182] = "c";
      var10000[183] = "c";
      var10000[184] = "c";
      var10000[185] = "c";
      var10000[186] = "c";
      var10000[187] = "c";
      var10000[188] = "c";
      var10000[189] = "c";
      var10000[190] = "c";
      var10000[191] = "c";
      var10000[192] = "c";
      var10000[193] = "c";
      var10000[194] = "c";
      var10000[195] = "c";
      var10000[196] = "c";
      var10000[197] = "c";
      var10000[198] = "c";
      var10000[199] = "c";
      var10000[200] = "c";
      var10000[201] = "c";
      var10000[202] = "c";
      var10000[203] = "c";
      var10000[204] = "c";
      var10000[205] = "c";
      var10000[206] = "c";
      var10000[207] = "c";
      var10000[208] = "c";
      var10000[209] = "c";
      var10000[210] = "c";
      var10000[211] = "c";
      var10000[212] = "c";
      var10000[213] = "c";
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = t[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(u[var4]);
            t[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static Field d(Class var0, String var1, Class var2) {
      Field var3 = c(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = d(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = t[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = u[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = f(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = c(var12, var10, var11);
            if (var13 != null) {
               t[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     t[var4] = var13;
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
               var12 = f((long)"c", 0L);
            }
         }
      }
   }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method d(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = c(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = d(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   private static native Method h(long var0, long var2);

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'R' && var8 != 'B' && var8 != 199 && var8 != 163) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'f') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 233) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'R') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'B') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 199) {
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

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite g(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
