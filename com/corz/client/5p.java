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

public class 5P {
   private static final int 6T;
   private static final int 6Z;
   private static final int 69;
   private static final long 2;
   private static final int 6o;
   private static final float 6i = 0.85F;
   private static final float 0 = 0.7F;
   private static final float 9 = 0.88F;
   private static final long 8;
   private static final float 7 = 10.0F;
   private final String 5;
   private final String 6;
   private final boolean 1;
   private long 4;
   private boolean 6E;
   private long 3;
   private static final long 6D;
   private float 6R;
   private long 6G;
   private static final float 6m = 0.085F;
   private static final long a = s.a(4637859711675596931L, -1168445496939505901L, MethodHandles.lookup().lookupClass()).a(263077315236648L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;
   private static final Object[] h = new Object[81];
   private static final String[] i = new String[81];
   // $FF: synthetic field
   private static transient String JDkFNPFdZw;

   public _P/* $FF was: 5P*/(String param1, String param2, long param3, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.m<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public float _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var11 = a ^ 132277910347005L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[22];
      int var16 = 0;
      String var17 = "\u000b¾O,}Iòæu~\u0089[\u001f\u007fá8gøói¢9\u001dæ\u001bçì¦i)¸\u009dÄm\u0093öl²\"\u008e±gü\\ï;5$b\"H.+\u000e¶Ôw\u009bnÃ¯:\nÄÇ~Q¾7\u009c\u0086+\u001e«\u0010p\u000bâ{êB[Ì@§^U\u009b\u008e\u008dSv\u008eá^³j\u009a\u008fV\u00046¿\u001cî\u0096Á¯\u000eQ¥ÆÉKGZ£\tß\u0090Õ|\u0085âÍÚ±\u0014ZRpÚb\u0092ç\u008aá\u00ad9mU\u0004<\u0006è\u0014íáð\u008d5Ë\u001e\u0099 §]û¡å";
      int var18 = "\u000b¾O,}Iòæu~\u0089[\u001f\u007fá8gøói¢9\u001dæ\u001bçì¦i)¸\u009dÄm\u0093öl²\"\u008e±gü\\ï;5$b\"H.+\u000e¶Ôw\u009bnÃ¯:\nÄÇ~Q¾7\u009c\u0086+\u001e«\u0010p\u000bâ{êB[Ì@§^U\u009b\u008e\u008dSv\u008eá^³j\u009a\u008fV\u00046¿\u001cî\u0096Á¯\u000eQ¥ÆÉKGZ£\tß\u0090Õ|\u0085âÍÚ±\u0014ZRpÚb\u0092ç\u008aá\u00ad9mU\u0004<\u0006è\u0014íáð\u008d5Ë\u001e\u0099 §]û¡å".length();
      int var15 = 0;

      label50:
      while(true) {
         int var10001 = var15;
         var15 += 8;
         byte[] var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var26 = var19;
         var10001 = var16++;
         long var34 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
         byte var39 = -1;

         while(true) {
            long var21 = var34;
            byte[] var23 = var13.doFinal(new byte[]{(byte)((int)(var21 >>> 56)), (byte)((int)(var21 >>> 48)), (byte)((int)(var21 >>> 40)), (byte)((int)(var21 >>> 32)), (byte)((int)(var21 >>> 24)), (byte)((int)(var21 >>> 16)), (byte)((int)(var21 >>> 8)), (byte)((int)var21)});
            long var44 = ((long)var23[0] & 255L) << 56 | ((long)var23[1] & 255L) << 48 | ((long)var23[2] & 255L) << 40 | ((long)var23[3] & 255L) << 32 | ((long)var23[4] & 255L) << 24 | ((long)var23[5] & 255L) << 16 | ((long)var23[6] & 255L) << 8 | (long)var23[7] & 255L;
            switch (var39) {
               case 0:
                  var26[var10001] = var44;
                  if (var15 >= var18) {
                     b = var19;
                     c = new Integer[22];
                     6T = true.l<invokedynamic>(4914, var11 ^ 5927348099374934860L);
                     6Z = true.l<invokedynamic>(3626, var11 ^ 3872997750031939138L);
                     6o = true.l<invokedynamic>(4914, var11 ^ 5927348099374934860L);
                     69 = true.l<invokedynamic>(11043, var11 ^ 8740555009024480074L);
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var36 = SecretKeyFactory.getInstance("DES");
                     byte[] var41 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var41[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var36.generateSecret(new DESKeySpec(var41)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "ª,bêÊô\u001c\u0080à«ã|¥måÿ\u0082\u001f\u0089\u001ae9\u001b.:Ê¹\u00adÜ²ýùè\u001f\f½3D\u0082«";
                     int var5 = "ª,bêÊô\u001c\u0080à«ã|¥måÿ\u0082\u001f\u0089\u001ae9\u001b.:Ê¹\u00adÜ²ýùè\u001f\f½3D\u0082«".length();
                     int var2 = 0;

                     label34:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var42 = -1;

                        while(true) {
                           long var8 = var37;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var42) {
                              case 0:
                                 var28[var10001] = var44;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Long[7];
                                    2 = true.p<invokedynamic>(1891, var11 ^ 7443967688559272875L);
                                    6D = true.p<invokedynamic>(6133, var11 ^ 816375332847727423L);
                                    8 = true.p<invokedynamic>(24869, var11 ^ 8944966371490514409L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var44;
                                 if (var2 < var5) {
                                    continue label34;
                                 }

                                 var4 = "\u0090t¶ \u008f\u001eG\u0094\u0011\u0083Ò÷Û\u0007¤Á";
                                 var5 = "\u0090t¶ \u008f\u001eG\u0094\u0011\u0083Ò÷Û\u0007¤Á".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var42 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var26[var10001] = var44;
                  if (var15 < var18) {
                     continue label50;
                  }

                  var17 = "?7é\u0013TÙWOè\u0010\u001d.\u0082\u0098|¢";
                  var18 = "?7é\u0013TÙWOè\u0010\u001d.\u0082\u0098|¢".length();
                  var15 = 0;
            }

            var10001 = var15;
            var15 += 8;
            var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
            var26 = var19;
            var10001 = var16++;
            var34 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
            var39 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
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

   private static long b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

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
               case 0 -> var10000 = 42;
               case 1 -> var10000 = 38;
               case 2 -> var10000 = 62;
               case 3 -> var10000 = 26;
               case 4 -> var10000 = 19;
               case 5 -> var10000 = 32;
               case 6 -> var10000 = 47;
               case 7 -> var10000 = 59;
               case 8 -> var10000 = 53;
               case 9 -> var10000 = 33;
               case 10 -> var10000 = 36;
               case 11 -> var10000 = 31;
               case 12 -> var10000 = 43;
               case 13 -> var10000 = 60;
               case 14 -> var10000 = 10;
               case 15 -> var10000 = 30;
               case 16 -> var10000 = 0;
               case 17 -> var10000 = 21;
               case 18 -> var10000 = 40;
               case 19 -> var10000 = 2;
               case 20 -> var10000 = 11;
               case 21 -> var10000 = 45;
               case 22 -> var10000 = 57;
               case 23 -> var10000 = 41;
               case 24 -> var10000 = 28;
               case 25 -> var10000 = 3;
               case 26 -> var10000 = 18;
               case 27 -> var10000 = 56;
               case 28 -> var10000 = 15;
               case 29 -> var10000 = 54;
               case 30 -> var10000 = 5;
               case 31 -> var10000 = 63;
               case 32 -> var10000 = 4;
               case 33 -> var10000 = 35;
               case 34 -> var10000 = 37;
               case 35 -> var10000 = 6;
               case 36 -> var10000 = 39;
               case 37 -> var10000 = 44;
               case 38 -> var10000 = 7;
               case 39 -> var10000 = 22;
               case 40 -> var10000 = 46;
               case 41 -> var10000 = 14;
               case 42 -> var10000 = 48;
               case 43 -> var10000 = 13;
               case 44 -> var10000 = 16;
               case 45 -> var10000 = 29;
               case 46 -> var10000 = 34;
               case 47 -> var10000 = 24;
               case 48 -> var10000 = 27;
               case 49 -> var10000 = 55;
               case 50 -> var10000 = 17;
               case 51 -> var10000 = 9;
               case 52 -> var10000 = 23;
               case 53 -> var10000 = 51;
               case 54 -> var10000 = 49;
               case 55 -> var10000 = 25;
               case 56 -> var10000 = 61;
               case 57 -> var10000 = 20;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 1;
               case 60 -> var10000 = 12;
               case 61 -> var10000 = 50;
               case 62 -> var10000 = 8;
               default -> var10000 = 52;
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
      var10000[2] = Boolean.TYPE;
      i[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Long.TYPE;
      i[7] = "c";
      var10000[8] = "c";
      var10000[9] = Double.TYPE;
      i[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Integer.TYPE;
      i[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Void.TYPE;
      i[15] = "c";
      var10000[16] = Float.TYPE;
      i[16] = "c";
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
         if (var8 != 'm' && var8 != 199 && var8 != 'p' && var8 != 193) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 250) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'O') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'm') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 199) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'p') {
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
