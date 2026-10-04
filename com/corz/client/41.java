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
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class 41 {
   private static final class_310 2;
   private static final float 0 = 32.0F;
   private static final int 8;
   private static final int 1;
   private static final int 3;
   private final 7OE 5e;
   private class_2338 9;
   private double 5;
   private List 5s;
   private int 5N;
   private long 6;
   private class_243 4;
   private int 7;
   private long 5p;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String zZLLeXegam;

   public _1/* $FF was: 41*/(int param1, int param2, 7OE param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public class_2338 _/* $FF was: 8*/(Object[] var1) {
      int var3 = (Integer)var1[2];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[0];
      long var5 = ((long)var4 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      return this.Y<invokedynamic>(this, (long)"c", var5);
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7OX _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_2338 _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private List _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      boolean var10000;
      try {
         if (this.Y<invokedynamic>(this, (long)"c", var2) != null) {
            var10000 = true;
            return var10000;
         }
      } catch (MatchException var4) {
         throw var4.Ê<invokedynamic>(var4, (long)"c", var2);
      }

      var10000 = false;
      return var10000;
   }

   private boolean _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private float _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      class_243 var4 = (class_243)var1[1];
      var2 = a ^ var2;
      double var10000 = var4.Y<invokedynamic>(var4, (long)"c", var2);
      class_746 var10001 = "c".þ<invokedynamic>((long)"c", var2).Y<invokedynamic>("c".þ<invokedynamic>((long)"c", var2), (long)"c", var2);
      double var5 = var10000 - var10001.u<invokedynamic>(var10001, (long)"c", var2);
      var10000 = var4.Y<invokedynamic>(var4, (long)"c", var2);
      var10001 = "c".þ<invokedynamic>((long)"c", var2).Y<invokedynamic>("c".þ<invokedynamic>((long)"c", var2), (long)"c", var2);
      double var7 = var10000 - var10001.u<invokedynamic>(var10001, (long)"c", var2);
      var10000 = (-var5).Ê<invokedynamic>(-var5, var7, (long)"c", var2);
      return (float)var10000.Ê<invokedynamic>(var10000, (long)"c", var2);
   }

   private float _/* $FF was: 4*/(Object[] var1) {
      class_243 var2 = (class_243)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      class_746 var10000 = "c".þ<invokedynamic>((long)"c", var3).Y<invokedynamic>("c".þ<invokedynamic>((long)"c", var3), (long)"c", var3);
      class_243 var5 = var10000.u<invokedynamic>(var10000, (long)"c", var3);
      double var6 = var2.Y<invokedynamic>(var2, (long)"c", var3) - var5.Y<invokedynamic>(var5, (long)"c", var3);
      double var8 = var2.Y<invokedynamic>(var2, (long)"c", var3) - var5.Y<invokedynamic>(var5, (long)"c", var3);
      double var10 = var2.Y<invokedynamic>(var2, (long)"c", var3) - var5.Y<invokedynamic>(var5, (long)"c", var3);
      double var12 = (var6 * var6 + var10 * var10).Ê<invokedynamic>(var6 * var6 + var10 * var10, (long)"c", var3);
      double var15 = (-var8).Ê<invokedynamic>(-var8, var12, (long)"c", var3);
      return (float)var15.Ê<invokedynamic>(var15, (long)"c", var3);
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(41.class, 177);
      a = s.a(6175965011511103353L, 7691420295159200206L, MethodHandles.lookup().lookupClass()).a(103862480714635L);
      long var22 = a ^ 114494124463933L;
      h = new Object[118];
      i = new String[118];
      a();
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var17 = new long[9];
      int var14 = 0;
      String var15 = "R¦Ø(ô¥1\u0001â\u001bò\u008e9Ï\u000e\u001a\u0086¡\u009b|tò!äp®ÖÍ\u0095µnEÓ/COúuU>M\u0007§×RMQ=jå®^\u0080ì\u0003\u008f";
      int var16 = "R¦Ø(ô¥1\u0001â\u001bò\u008e9Ï\u000e\u001a\u0086¡\u009b|tò!äp®ÖÍ\u0095µnEÓ/COúuU>M\u0007§×RMQ=jå®^\u0080ì\u0003\u008f".length();
      int var13 = 0;

      label41:
      while(true) {
         int var10001 = var13;
         var13 += 8;
         byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
         long[] var25 = var17;
         var10001 = var14++;
         long var31 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
         byte var34 = -1;

         while(true) {
            long var19 = var31;
            byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
            long var38 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
            switch (var34) {
               case 0:
                  var25[var10001] = var38;
                  if (var13 >= var16) {
                     b = var17;
                     c = new Integer[9];
                     8 = true.i<invokedynamic>(20611, var22 ^ 843462874614660664L);
                     1 = true.i<invokedynamic>(9, var22 ^ 4320739556346670774L);
                     3 = true.i<invokedynamic>(26453, var22 ^ 5498981599704566251L);
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var26 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var33 = SecretKeyFactory.getInstance("DES");
                     byte[] var36 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var36[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                     }

                     var26.init(2, var33.generateSecret(new DESKeySpec(var36)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0089äö±(s\u008c$\u008a)B\u001a\u009e\u0092p\u0092HÍfì1\u008d\u0010\u0093";
                     int var5 = "\u0089äö±(s\u008c$\u008a)B\u001a\u009e\u0092p\u0092HÍfì1\u008d\u0010\u0093".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var37 = true;
                        var6[var10001] = var38;
                     } while(var2 < var5);

                     e = var6;
                     f = new Long[3];
                     2 = -7232155009204898769L.Ê<invokedynamic>(-7232155009204898769L, var22);
                     return;
                  }
                  break;
               default:
                  var25[var10001] = var38;
                  if (var13 < var16) {
                     continue label41;
                  }

                  var15 = "z,r\u008c\u007f\u0086¾\u0097\u008bõM)\u009b©'÷";
                  var16 = "z,r\u008c\u007f\u0086¾\u0097\u008bõM)\u009b©'÷".length();
                  var13 = 0;
            }

            var10001 = var13;
            var13 += 8;
            var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
            var25 = var17;
            var10001 = var14++;
            var31 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
            var34 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int a(int var0, long var1);

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

   private static native long b(int var0, long var1);

   private static long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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
               case 0 -> var10000 = 11;
               case 1 -> var10000 = 54;
               case 2 -> var10000 = 25;
               case 3 -> var10000 = 41;
               case 4 -> var10000 = 9;
               case 5 -> var10000 = 2;
               case 6 -> var10000 = 23;
               case 7 -> var10000 = 33;
               case 8 -> var10000 = 15;
               case 9 -> var10000 = 26;
               case 10 -> var10000 = 31;
               case 11 -> var10000 = 21;
               case 12 -> var10000 = 19;
               case 13 -> var10000 = 27;
               case 14 -> var10000 = 13;
               case 15 -> var10000 = 45;
               case 16 -> var10000 = 50;
               case 17 -> var10000 = 37;
               case 18 -> var10000 = 0;
               case 19 -> var10000 = 56;
               case 20 -> var10000 = 47;
               case 21 -> var10000 = 46;
               case 22 -> var10000 = 14;
               case 23 -> var10000 = 30;
               case 24 -> var10000 = 5;
               case 25 -> var10000 = 55;
               case 26 -> var10000 = 36;
               case 27 -> var10000 = 57;
               case 28 -> var10000 = 35;
               case 29 -> var10000 = 58;
               case 30 -> var10000 = 29;
               case 31 -> var10000 = 3;
               case 32 -> var10000 = 18;
               case 33 -> var10000 = 59;
               case 34 -> var10000 = 8;
               case 35 -> var10000 = 40;
               case 36 -> var10000 = 60;
               case 37 -> var10000 = 34;
               case 38 -> var10000 = 38;
               case 39 -> var10000 = 49;
               case 40 -> var10000 = 62;
               case 41 -> var10000 = 43;
               case 42 -> var10000 = 20;
               case 43 -> var10000 = 48;
               case 44 -> var10000 = 17;
               case 45 -> var10000 = 10;
               case 46 -> var10000 = 28;
               case 47 -> var10000 = 24;
               case 48 -> var10000 = 7;
               case 49 -> var10000 = 6;
               case 50 -> var10000 = 61;
               case 51 -> var10000 = 39;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 16;
               case 54 -> var10000 = 32;
               case 55 -> var10000 = 53;
               case 56 -> var10000 = 51;
               case 57 -> var10000 = 12;
               case 58 -> var10000 = 52;
               case 59 -> var10000 = 42;
               case 60 -> var10000 = 22;
               case 61 -> var10000 = 1;
               case 62 -> var10000 = 63;
               default -> var10000 = 44;
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
      var10000[2] = Void.TYPE;
      i[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Boolean.TYPE;
      i[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = Float.TYPE;
      i[10] = "c";
      var10000[11] = Integer.TYPE;
      i[11] = "c";
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
      var10000[24] = Double.TYPE;
      i[24] = "c";
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
      var10000[37] = Long.TYPE;
      i[37] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = h[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(i[var4]);
            h[var4] = var5;
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
         if (var8 != 'Y' && var8 != 193 && var8 != 254 && var8 != 227) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'u') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 202) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'Y') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 193) {
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
