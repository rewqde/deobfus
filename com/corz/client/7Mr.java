package com.corz.client;

import java.awt.Color;
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

public enum 7MR {
   public static final 7MR 0;
   public static final 7MR 7;
   public static final 7MR 3;
   public static final 7MR 5;
   private static final 7MR[] 8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;

   public String _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public Color _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   private static 7MR[] _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7MR.class, 487);
      a = s.a(-2670488927044333891L, -716661305006542972L, MethodHandles.lookup().lookupClass()).a(226575922479701L);
      long var20 = a ^ 47615726442321L;
      h = new Object[18];
      i = new String[18];
      a();
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "Ö¬\u000e\u000bd®{Â1\u000bl\tÞ Ê\u0092\u00100v\u009cÚmj+Zð\u0015A\u0098»ºð¦\u0010¿¯RÞ/½R´\r\u0004Ì\u0092\u000fKiã\u0010\"¦\u0005><\u009cmâ÷9ÈÔÿá,\u0089\u0010öFFN\u001bQå-9\u00919ýU¸pÐ";
      int var17 = "Ö¬\u000e\u000bd®{Â1\u000bl\tÞ Ê\u0092\u00100v\u009cÚmj+Zð\u0015A\u0098»ºð¦\u0010¿¯RÞ/½R´\r\u0004Ì\u0092\u000fKiã\u0010\"¦\u0005><\u009cmâ÷9ÈÔÿá,\u0089\u0010öFFN\u001bQå-9\u00919ýU¸pÐ".length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var15.substring(var24, var24 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "\f\u0085Ù\u0002îñ8¯TJ\u0014-_Y\rëN ÕAPÙÄhEì´6§w\u009aÝË,Q<Ëá]Ú";
                     int var5 = "\f\u0085Ù\u0002îñ8¯TJ\u0014-_Y\rëN ÕAPÙÄhEì´6§w\u009aÝË,Q<Ëá]Ú".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while(true) {
                           long var8 = var39;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[7];
                                    0 = new 7MR(true.s<invokedynamic>(13115, 5330980738219603201L ^ var20), 0);
                                    7 = new 7MR(true.s<invokedynamic>(4241, 9163473093318334127L ^ var20), 1);
                                    3 = new 7MR(true.s<invokedynamic>(2594, 2093765516660558874L ^ var20), 2);
                                    5 = new 7MR(true.s<invokedynamic>(4260, 6444678450334488216L ^ var20), 3);
                                    8 = 2540294530629434938L.Y<invokedynamic>(2540294530629434938L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u008bø\u0091* T}Ö\u0095:Q]\u0016Õ\u0088N";
                                 var5 = "\u008bø\u0091* T}Ö\u0095:Q]\u0016Õ\u0088N".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "Ùÿà\u0000\u0091ûß;ÒËoM\u007f\n^-\u00101Q»Ë\u00adÓia2Éí@®\u0001\u007f¯";
                  var17 = "Ùÿà\u0000\u0091ûß;ÒËoM\u007f\n^-\u00101Q»Ë\u00adÓia2Éí@®\u0001\u007f¯".length();
                  var14 = 16;
                  var24 = -1;
            }

            ++var24;
            var25 = var15.substring(var24, var24 + var14);
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

   private static native String a(int var0, long var1);

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

   private static native int b(int var0, long var1);

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
               case 1 -> var10000 = 18;
               case 2 -> var10000 = 38;
               case 3 -> var10000 = 1;
               case 4 -> var10000 = 47;
               case 5 -> var10000 = 13;
               case 6 -> var10000 = 37;
               case 7 -> var10000 = 55;
               case 8 -> var10000 = 50;
               case 9 -> var10000 = 43;
               case 10 -> var10000 = 5;
               case 11 -> var10000 = 46;
               case 12 -> var10000 = 52;
               case 13 -> var10000 = 20;
               case 14 -> var10000 = 54;
               case 15 -> var10000 = 59;
               case 16 -> var10000 = 15;
               case 17 -> var10000 = 32;
               case 18 -> var10000 = 35;
               case 19 -> var10000 = 58;
               case 20 -> var10000 = 33;
               case 21 -> var10000 = 53;
               case 22 -> var10000 = 48;
               case 23 -> var10000 = 30;
               case 24 -> var10000 = 39;
               case 25 -> var10000 = 28;
               case 26 -> var10000 = 61;
               case 27 -> var10000 = 8;
               case 28 -> var10000 = 62;
               case 29 -> var10000 = 17;
               case 30 -> var10000 = 34;
               case 31 -> var10000 = 4;
               case 32 -> var10000 = 2;
               case 33 -> var10000 = 6;
               case 34 -> var10000 = 19;
               case 35 -> var10000 = 49;
               case 36 -> var10000 = 29;
               case 37 -> var10000 = 63;
               case 38 -> var10000 = 0;
               case 39 -> var10000 = 9;
               case 40 -> var10000 = 23;
               case 41 -> var10000 = 21;
               case 42 -> var10000 = 51;
               case 43 -> var10000 = 12;
               case 44 -> var10000 = 40;
               case 45 -> var10000 = 7;
               case 46 -> var10000 = 22;
               case 47 -> var10000 = 14;
               case 48 -> var10000 = 41;
               case 49 -> var10000 = 24;
               case 50 -> var10000 = 25;
               case 51 -> var10000 = 27;
               case 52 -> var10000 = 31;
               case 53 -> var10000 = 44;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 10;
               case 56 -> var10000 = 42;
               case 57 -> var10000 = 26;
               case 58 -> var10000 = 3;
               case 59 -> var10000 = 16;
               case 60 -> var10000 = 56;
               case 61 -> var10000 = 45;
               case 62 -> var10000 = 57;
               default -> var10000 = 36;
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
      var10000[3] = Integer.TYPE;
      i[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
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

   private static native Field b(Class var0, String var1, Class var2);

   private static native Field c(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

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

   private static native Method d(long var0, long var2);

   private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = a(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);
}
