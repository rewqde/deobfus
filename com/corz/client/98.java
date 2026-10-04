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
import net.minecraft.class_1657;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;

public class 98 extends 9a {
   private final 44 7;
   private final 44 5i;
   private final 44 0;
   private final 44 5T;
   private final 4A 57;
   private final 4H 8;
   private final 4H 6;
   private final 4H 56;
   private final 4H 52;
   public boolean 2;
   private int 5M;
   private int 3;
   private float 5z;
   private float 5w;
   private boolean 59;
   private long 9;
   private class_2338 5O;
   private long 55;
   private static final long 5d;
   private static final double 1 = (double)10.0F;
   private final Map 5;
   private static final long b;
   private static final String f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map l;
   private static final long[] m;
   private static final Long[] n;
   private static final Map o;
   private static final Object[] p;
   private static final String[] q;
   // $FF: synthetic field
   private static transient String rtbeSZrSbH;

   public _8/* $FF was: 98*/(long param1, byte param3) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _U/* $FF was: 1U*/();

   public native void _/* $FF was: 0*/();

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _J/* $FF was: 1J*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _B/* $FF was: 3B*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _d/* $FF was: 3d*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _V/* $FF was: 0V*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(7Yn param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _Z/* $FF was: 5Z*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _7/* $FF was: 07*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      class_2680 var10000 = "c".z<invokedynamic>((long)"c", var2).T<invokedynamic>("c".z<invokedynamic>((long)"c", var2), (long)"c", var2).k<invokedynamic>("c".z<invokedynamic>((long)"c", var2).T<invokedynamic>("c".z<invokedynamic>((long)"c", var2), (long)"c", var2), (class_2338)var1[1], (long)"c", var2);
      return var10000.k<invokedynamic>(var10000, (class_2248)var1[2], (long)"c", var2);
   }

   private class_1657 _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 8*/(long var0, long var2, long var4, Long var6) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(98.class, 569);
      b = com.corz.client.s.a(6959287662782309620L, 4082742968003302554L, MethodHandles.lookup().lookupClass()).a(263140383249925L);
      p = new Object[197];
      q = new String[197];
      b();
      long var22 = b ^ 138978722715747L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var26 = var24.doFinal("eRÐÅÁV\u0004Ì".getBytes("ISO-8859-1"));
      String var39 = b(var26).intern();
      int var10001 = -1;
      f = var39;
      l = new HashMap(13);
      Cipher var11;
      var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var40 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
      }

      var10000.init(2, var40.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var17 = new long[23];
      int var14 = 0;
      String var15 = "aäp@Ã*ß¥ºSiµ\u0088¢ûÒô\u0010ëZÇ)[\u0087\u0088KÂØào<ukð\u009d\bó4Kßb\u0095=\u009dÅH\u009b|ÓV¸\u008ca\u0091ã@¯½\u0018\u0014¹&«ßBPÅ÷\n\u0014íSÒÊGe\u001dÿ=\u0015\u008e\u0018\u008fÓ<I&ä\u009e\u0090ªIH\u0081ï½\u0085\u0018#K\u008dë\u0099³\u0091çæ(\u000fä\u0082\u008aâ¸}±ô\u0080Ø\u0098\u009d,w\u0097o¤yMA3hO\u0099x\u009d\u0097c)>@ºW\u008eþ3£;êÝ\u001dH¤{E\u000f:P[IÀ\u009a\u0086n\u009bKrï3";
      int var16 = "aäp@Ã*ß¥ºSiµ\u0088¢ûÒô\u0010ëZÇ)[\u0087\u0088KÂØào<ukð\u009d\bó4Kßb\u0095=\u009dÅH\u009b|ÓV¸\u008ca\u0091ã@¯½\u0018\u0014¹&«ßBPÅ÷\n\u0014íSÒÊGe\u001dÿ=\u0015\u008e\u0018\u008fÓ<I&ä\u009e\u0090ªIH\u0081ï½\u0085\u0018#K\u008dë\u0099³\u0091çæ(\u000fä\u0082\u008aâ¸}±ô\u0080Ø\u0098\u009d,w\u0097o¤yMA3hO\u0099x\u009d\u0097c)>@ºW\u008eþ3£;êÝ\u001dH¤{E\u000f:P[IÀ\u009a\u0086n\u009bKrï3".length();
      int var13 = 0;

      label56:
      while(true) {
         var10001 = var13;
         var13 += 8;
         byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
         long[] var30 = var17;
         var10001 = var14++;
         long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
         byte var47 = -1;

         while(true) {
            long var19 = var41;
            byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
            long var52 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
            switch (var47) {
               case 0:
                  var30[var10001] = var52;
                  if (var13 >= var16) {
                     g = var17;
                     h = new Integer[23];
                     o = new HashMap(13);
                     Cipher var0;
                     Cipher var31 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var43 = SecretKeyFactory.getInstance("DES");
                     byte[] var49 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var49[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                     }

                     var31.init(2, var43.generateSecret(new DESKeySpec(var49)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "BYX_ã\u0005ALód\u0000Ð4î\u009a\u0087";
                     int var5 = "BYX_ã\u0005ALód\u0000Ð4î\u009a\u0087".length();
                     int var2 = 0;

                     label40:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var32 = var6;
                        var10001 = var3++;
                        long var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var50 = -1;

                        while(true) {
                           long var8 = var44;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           var52 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var50) {
                              case 0:
                                 var32[var10001] = var52;
                                 if (var2 >= var5) {
                                    m = var6;
                                    n = new Long[4];
                                    5d = true.s<invokedynamic>(12036, var22 ^ 3637451025239878495L);
                                    return;
                                 }
                                 break;
                              default:
                                 var32[var10001] = var52;
                                 if (var2 < var5) {
                                    continue label40;
                                 }

                                 var4 = "Ü?Âím®\u009d±\u001a»¼\u0001Â7q»";
                                 var5 = "Ü?Âím®\u009d±\u001a»¼\u0001Â7q»".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var32 = var6;
                           var10001 = var3++;
                           var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var50 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var30[var10001] = var52;
                  if (var13 < var16) {
                     continue label56;
                  }

                  var15 = "ªã¡ãÐÜ}ndn\u0086²\u007f|ëâ";
                  var16 = "ªã¡ãÐÜ}ndn\u0086²\u007f|ëâ".length();
                  var13 = 0;
            }

            var10001 = var13;
            var13 += 8;
            var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
            var30 = var17;
            var10001 = var14++;
            var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
            var47 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static long d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native long d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (q[var4] != null) {
         return var4;
      } else {
         Object var5 = p[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 18;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 58;
               case 3 -> var10000 = 0;
               case 4 -> var10000 = 3;
               case 5 -> var10000 = 4;
               case 6 -> var10000 = 41;
               case 7 -> var10000 = 12;
               case 8 -> var10000 = 38;
               case 9 -> var10000 = 57;
               case 10 -> var10000 = 55;
               case 11 -> var10000 = 26;
               case 12 -> var10000 = 43;
               case 13 -> var10000 = 24;
               case 14 -> var10000 = 47;
               case 15 -> var10000 = 5;
               case 16 -> var10000 = 2;
               case 17 -> var10000 = 31;
               case 18 -> var10000 = 46;
               case 19 -> var10000 = 28;
               case 20 -> var10000 = 44;
               case 21 -> var10000 = 16;
               case 22 -> var10000 = 33;
               case 23 -> var10000 = 15;
               case 24 -> var10000 = 50;
               case 25 -> var10000 = 32;
               case 26 -> var10000 = 25;
               case 27 -> var10000 = 17;
               case 28 -> var10000 = 61;
               case 29 -> var10000 = 62;
               case 30 -> var10000 = 54;
               case 31 -> var10000 = 10;
               case 32 -> var10000 = 11;
               case 33 -> var10000 = 39;
               case 34 -> var10000 = 27;
               case 35 -> var10000 = 22;
               case 36 -> var10000 = 52;
               case 37 -> var10000 = 63;
               case 38 -> var10000 = 6;
               case 39 -> var10000 = 48;
               case 40 -> var10000 = 9;
               case 41 -> var10000 = 34;
               case 42 -> var10000 = 19;
               case 43 -> var10000 = 56;
               case 44 -> var10000 = 21;
               case 45 -> var10000 = 7;
               case 46 -> var10000 = 35;
               case 47 -> var10000 = 29;
               case 48 -> var10000 = 42;
               case 49 -> var10000 = 36;
               case 50 -> var10000 = 37;
               case 51 -> var10000 = 51;
               case 52 -> var10000 = 20;
               case 53 -> var10000 = 1;
               case 54 -> var10000 = 8;
               case 55 -> var10000 = 60;
               case 56 -> var10000 = 49;
               case 57 -> var10000 = 40;
               case 58 -> var10000 = 23;
               case 59 -> var10000 = 53;
               case 60 -> var10000 = 30;
               case 61 -> var10000 = 13;
               case 62 -> var10000 = 59;
               default -> var10000 = 14;
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

            q[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = p;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      q[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Void.TYPE;
      q[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Long.TYPE;
      q[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = Integer.TYPE;
      q[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = "c";
      var10000[29] = "c";
      var10000[30] = "c";
      var10000[31] = "c";
      var10000[32] = "c";
      var10000[33] = Float.TYPE;
      q[33] = "c";
      var10000[34] = "c";
      var10000[35] = "c";
      var10000[36] = "c";
      var10000[37] = "c";
      var10000[38] = "c";
      var10000[39] = Byte.TYPE;
      q[39] = "c";
      var10000[40] = "c";
      var10000[41] = "c";
      var10000[42] = "c";
      var10000[43] = "c";
      var10000[44] = "c";
      var10000[45] = "c";
      var10000[46] = "c";
      var10000[47] = "c";
      var10000[48] = "c";
      var10000[49] = Double.TYPE;
      q[49] = "c";
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
   }

   private static native Class f(long var0, long var2);

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static native Field d(Class var0, String var1, Class var2);

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = p[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = q[var4];
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
               p[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     p[var4] = var13;
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

   private static Method c(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = p[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = q[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = f(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = c(var23, var10, var15, var13, var14);
            if (var26 != null) {
               p[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("c")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = f((long)"c", 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = d(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     p[var4] = var19;
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
               var23 = f((long)"c", 0L);
            }
         }
      }
   }

   private static native MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
