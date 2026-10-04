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

public class 7Fz {
   private static final int 3;
   private static final int 0;
   private static final int 1;
   private final 4k 4;
   private final 7TF 8;
   private final 7TT 9;
   private int 5;
   private int 6;
   private int 2;
   private int 7;
   private static final long a = s.a(-9094938250160305642L, 6202012542421691232L, MethodHandles.lookup().lookupClass()).a(53799861372804L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;
   private static final Object[] k = new Object[99];
   private static final String[] l = new String[99];
   // $FF: synthetic field
   private static transient String nkloVwytqe;

   public _Fz/* $FF was: 7Fz*/(4k param1, int param2, long param3, int param5, int param6, int param7, 7TF param8) {
      // $FF: Couldn't be decompiled
   }

   private String _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private String _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int[] _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.R<invokedynamic>(this, (long)"c", var2);
   }

   public void _/* $FF was: 0*/(Object[] var1) {
      long var5 = (Long)var1[0];
      var5 = a ^ var5;
      this.X<invokedynamic>(this, (Integer)var1[1], (long)"c", var5);
      this.X<invokedynamic>(this, (Integer)var1[2], (long)"c", var5);
      this.X<invokedynamic>(this, (Integer)var1[3], (long)"c", var5);
      this.X<invokedynamic>(this, (Integer)var1[4], (long)"c", var5);
   }

   private int _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var22 = a ^ 72808660243979L;
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
      String var28 = "aÈ0#\u009b$7\u00ad\u0002¹øPi|\u001ag\u0018ß\fÍ2h¾C<þg³\u00adÊI= ¦býÐ´Ï\u00adåÐ\u0099\u0007å\u008b\u0080Þ\u0007\u0085\u0007¥-\u0087»NLKEbÀ*\u0085È³";
      int var30 = "aÈ0#\u009b$7\u00ad\u0002¹øPi|\u001ag\u0018ß\fÍ2h¾C<þg³\u00adÊI= ¦býÐ´Ï\u00adåÐ\u0099\u0007å\u008b\u0080Þ\u0007\u0085\u0007¥-\u0087»NLKEbÀ*\u0085È³".length();
      char var27 = ' ';
      int var26 = -1;

      while(true) {
         ++var26;
         byte[] var32 = var24.doFinal(var28.substring(var26, var26 + var27).getBytes("ISO-8859-1"));
         String var44 = a(var32).intern();
         int var10001 = -1;
         var31[var29++] = var44;
         if ((var26 += var27) >= var30) {
            b = var31;
            c = new String[2];
            g = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var46 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var12 = 1; var12 < 8; ++var12) {
               var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
            }

            var10000.init(2, var46.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[19];
            int var14 = 0;
            String var15 = "«EÀUüAs¬\u000e\u0019\u009dSã\u009b)X\u000bb\u0087IÃãHÙ\u0084´\u009dß~I+¼t\u0014Ë^`\"Ë!=joLC`Ü&âë_MW\u0081|\u0016ùY\\nrÂSó\u0088»±L\u0088\u008a\u001f=¯»J|4¨â4«¦vD\u0000;D ê\u0083Hm\u001d«$\u0015v\u000b\u008d\u001dQ8¹æG\u000f8ö`y² = º4\u0011È³]\u0006ý¥'¹\u000e)Ø¡]\u0005©Èi÷\u0001";
            int var16 = "«EÀUüAs¬\u000e\u0019\u009dSã\u009b)X\u000bb\u0087IÃãHÙ\u0084´\u009dß~I+¼t\u0014Ë^`\"Ë!=joLC`Ü&âë_MW\u0081|\u0016ùY\\nrÂSó\u0088»±L\u0088\u008a\u001f=¯»J|4¨â4«¦vD\u0000;D ê\u0083Hm\u001d«$\u0015v\u000b\u008d\u001dQ8¹æG\u000f8ö`y² = º4\u0011È³]\u0006ý¥'¹\u000e)Ø¡]\u0005©Èi÷\u0001".length();
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
                           e = var17;
                           f = new Integer[19];
                           3 = true.b<invokedynamic>(11265, var22 ^ 4405414547282315837L);
                           0 = true.b<invokedynamic>(5920, var22 ^ 3426813939052048646L);
                           1 = true.b<invokedynamic>(10317, var22 ^ 3955667009550372462L);
                           j = new HashMap(13);
                           Cipher var0;
                           Cipher var37 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           SecretKeyFactory var49 = SecretKeyFactory.getInstance("DES");
                           byte[] var53 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                           for(int var1 = 1; var1 < 8; ++var1) {
                              var53[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                           }

                           var37.init(2, var49.generateSecret(new DESKeySpec(var53)), new IvParameterSpec(new byte[8]));
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4 = "·ËqÊ\u009f\u009e\u0018\u000e9u;8¢Ù\u0019\u0011";
                           int var5 = "·ËqÊ\u009f\u009e\u0018\u000e9u;8¢Ù\u0019\u0011".length();
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

                           h = var6;
                           i = new Long[2];
                           return;
                        }
                        break;
                     default:
                        var36[var10001] = var55;
                        if (var13 < var16) {
                           continue label50;
                        }

                        var15 = "W÷«¯Ñï÷ó¶\u0001\u000fi<D)Í";
                        var16 = "W÷«¯Ñï÷ó¶\u0001\u000fi<D)Í".length();
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

   private static int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
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

   private static long c(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (l[var4] != null) {
         return var4;
      } else {
         Object var5 = k[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 9;
               case 1 -> var10000 = 55;
               case 2 -> var10000 = 51;
               case 3 -> var10000 = 45;
               case 4 -> var10000 = 17;
               case 5 -> var10000 = 48;
               case 6 -> var10000 = 62;
               case 7 -> var10000 = 61;
               case 8 -> var10000 = 1;
               case 9 -> var10000 = 6;
               case 10 -> var10000 = 42;
               case 11 -> var10000 = 46;
               case 12 -> var10000 = 41;
               case 13 -> var10000 = 16;
               case 14 -> var10000 = 28;
               case 15 -> var10000 = 53;
               case 16 -> var10000 = 57;
               case 17 -> var10000 = 38;
               case 18 -> var10000 = 39;
               case 19 -> var10000 = 4;
               case 20 -> var10000 = 12;
               case 21 -> var10000 = 15;
               case 22 -> var10000 = 47;
               case 23 -> var10000 = 60;
               case 24 -> var10000 = 63;
               case 25 -> var10000 = 24;
               case 26 -> var10000 = 11;
               case 27 -> var10000 = 20;
               case 28 -> var10000 = 5;
               case 29 -> var10000 = 26;
               case 30 -> var10000 = 49;
               case 31 -> var10000 = 44;
               case 32 -> var10000 = 36;
               case 33 -> var10000 = 43;
               case 34 -> var10000 = 54;
               case 35 -> var10000 = 29;
               case 36 -> var10000 = 50;
               case 37 -> var10000 = 35;
               case 38 -> var10000 = 22;
               case 39 -> var10000 = 21;
               case 40 -> var10000 = 32;
               case 41 -> var10000 = 33;
               case 42 -> var10000 = 14;
               case 43 -> var10000 = 23;
               case 44 -> var10000 = 0;
               case 45 -> var10000 = 8;
               case 46 -> var10000 = 30;
               case 47 -> var10000 = 59;
               case 48 -> var10000 = 13;
               case 49 -> var10000 = 3;
               case 50 -> var10000 = 31;
               case 51 -> var10000 = 37;
               case 52 -> var10000 = 27;
               case 53 -> var10000 = 19;
               case 54 -> var10000 = 25;
               case 55 -> var10000 = 7;
               case 56 -> var10000 = 52;
               case 57 -> var10000 = 40;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 34;
               case 60 -> var10000 = 2;
               case 61 -> var10000 = 18;
               case 62 -> var10000 = 56;
               default -> var10000 = 10;
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

            l[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = k;
      var10000[0] = "c";
      var10000[1] = Double.TYPE;
      l[1] = "c";
      var10000[2] = "c";
      var10000[3] = Integer.TYPE;
      l[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Float.TYPE;
      l[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = Void.TYPE;
      l[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = Boolean.TYPE;
      l[22] = "c";
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
      var10000[50] = Long.TYPE;
      l[50] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = k[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(l[var4]);
            k[var4] = var5;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     k[var4] = var13;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var26;
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
                     k[var4] = var19;
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
         if (var8 != 'R' && var8 != 'X' && var8 != 213 && var8 != 'l') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 223) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'p') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'R') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'X') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 213) {
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

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
