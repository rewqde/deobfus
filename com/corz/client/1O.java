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

public class 1o extends 9a {
   private final 4H 3K;
   private final 4i 3;
   private final 44 1;
   private final 44 5;
   private final 44 8;
   private final 4H 32;
   private final 4H 3O;
   private final 4H 0;
   private final 4H 39;
   private final 4H 6;
   private static final int 3R;
   private static final int 9;
   private static final int 7;
   private static final int 3c;
   private static final int 3N;
   private final List 30;
   private final Map 2;
   private long 3Y;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long o;
   private static final Object[] p;
   private static final String[] q;
   // $FF: synthetic field
   private static transient String lAGBIbKOVm;

   public _o/* $FF was: 1o*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   private static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 8*/(762 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 9*/(long var0, 6n var2, 6n var3) {
      var0 = b ^ var0;
      double var10000 = var3.S<invokedynamic>(var3, (long)"c", var0);
      return var10000.t<invokedynamic>(var10000, var2.S<invokedynamic>(var2, (long)"c", var0), (long)"c", var0);
   }

   static {
      a.b99571f71427e3b19.a.init(1o.class, 623);
      b = com.corz.client.s.a(1030351792618629450L, -7694178280804033098L, MethodHandles.lookup().lookupClass()).a(265341548637041L);
      p = new Object[258];
      q = new String[258];
      b();
      h = new HashMap(13);
      long var16 = b ^ 57845598153585L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[6];
      int var23 = 0;
      String var22 = "[\u0019è\u0003q\u001f\u001b\rã\u0090\u0089¡\u009c\u0006Â\u000b}¢h\"ÿ\u001d±v åk\u0012\u0098Úà¯\u0012#D)O8DL¿ê\u009bK\u008cûl¿)±O\nb/\u001chJ\u0010ëA\u0080w¾-Õ\u001c\u009e1BÂ\u008aV[S\u0018[\u0087\u0001÷iÎ¬¢Ý×íå\u0001\u0000¤·\u0081?zæ<\u0000?ß";
      int var24 = "[\u0019è\u0003q\u001f\u001b\rã\u0090\u0089¡\u009c\u0006Â\u000b}¢h\"ÿ\u001d±v åk\u0012\u0098Úà¯\u0012#D)O8DL¿ê\u009bK\u008cûl¿)±O\nb/\u001chJ\u0010ëA\u0080w¾-Õ\u001c\u009e1BÂ\u008aV[S\u0018[\u0087\u0001÷iÎ¬¢Ý×íå\u0001\u0000¤·\u0081?zæ<\u0000?ß".length();
      char var21 = 24;
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var22.substring(var29, var29 + var21);
         int var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = b(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     f = var25;
                     g = new String[6];
                     n = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[40];
                     int var8 = 0;
                     String var9 = "\u0006ê·\u0015¿rQçqÛ:~Ö\u001a\u001a©Ó1Ýhõ\"Ùeõ\u009f\u008b\u0014B¦¨\u008c{a N\u0086¹Ú\u0005ap\u0016\u0084d=\u00923. \u001bD\u0091@sa\u0015;*\u009cß\u007f\u0098Päÿ\u008eWË\u001b\u0003©\u008f\u0085õ\u009a\u0001ÄÐ\\ÙZÙ\\\u001b%*I4\b\u000b\u0002Yí\u0086\u0013£¾Ñ\u0089HÀ\u0017Ïu\u0088y\u0001zÞ±\u009e\u0083\u00893\u000b_¢äb\u00151°\u0016\u001fkÉ<¶\u0083K$%NA#\u008cJ-ZÑN\u009f9Úê\n\u008fª\u008a÷ê\u0012\"\u0005Ù×\u009e¦\u0003Ë\u008eZ\u0080\u0018ö]~S\\A\u009eÀ\u0016ÞJ#\u0080\u0015y¿\u0011v«\u001dÞßV\u008fÓ\u0018½\u0015\u000bf\u0005\"æ×\u009aY¿hê|\u0012\u0094\u0085\u0094Ñ\u0092ý`±®OB×¿5õ\u0096jÍ\u009cö§\u0092h\u0004õþ5I\u0081z\nÔ~±\u007f{\u0089¯'÷©óæ\u008bÕÎ5\u00814\u009dmü\u0088ÑsÌ\u008b×ù9H=\u009dÏÔ\u0019\u0016+*ÏS$x'Áã¸\u008cÇ\rñàõÂr .f¡T\u000fM\u000b\u0015\r\u0011\u001eë";
                     int var10 = "\u0006ê·\u0015¿rQçqÛ:~Ö\u001a\u001a©Ó1Ýhõ\"Ùeõ\u009f\u008b\u0014B¦¨\u008c{a N\u0086¹Ú\u0005ap\u0016\u0084d=\u00923. \u001bD\u0091@sa\u0015;*\u009cß\u007f\u0098Päÿ\u008eWË\u001b\u0003©\u008f\u0085õ\u009a\u0001ÄÐ\\ÙZÙ\\\u001b%*I4\b\u000b\u0002Yí\u0086\u0013£¾Ñ\u0089HÀ\u0017Ïu\u0088y\u0001zÞ±\u009e\u0083\u00893\u000b_¢äb\u00151°\u0016\u001fkÉ<¶\u0083K$%NA#\u008cJ-ZÑN\u009f9Úê\n\u008fª\u008a÷ê\u0012\"\u0005Ù×\u009e¦\u0003Ë\u008eZ\u0080\u0018ö]~S\\A\u009eÀ\u0016ÞJ#\u0080\u0015y¿\u0011v«\u001dÞßV\u008fÓ\u0018½\u0015\u000bf\u0005\"æ×\u009aY¿hê|\u0012\u0094\u0085\u0094Ñ\u0092ý`±®OB×¿5õ\u0096jÍ\u009cö§\u0092h\u0004õþ5I\u0081z\nÔ~±\u007f{\u0089¯'÷©óæ\u008bÕÎ5\u00814\u009dmü\u0088ÑsÌ\u008b×ù9H=\u009dÏÔ\u0019\u0016+*ÏS$x'Áã¸\u008cÇ\rñàõÂr .f¡T\u000fM\u000b\u0015\r\u0011\u001eë".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var52 = -1;

                        while(true) {
                           long var13 = var46;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var55 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    l = var11;
                                    m = new Integer[40];
                                    3c = true.r<invokedynamic>(24550, var16 ^ 3739468469145221286L);
                                    3N = true.r<invokedynamic>(13109, var16 ^ 854130195555341420L);
                                    9 = true.r<invokedynamic>(25620, var16 ^ 2600125876738098003L);
                                    7 = true.r<invokedynamic>(28559, var16 ^ 590740473862588617L);
                                    3R = true.r<invokedynamic>(15523, var16 ^ 8356991687298964418L);
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = 418202749557089036L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var49 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    o = var49;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "\u0081\u0087^¶\u008e²)ÿT\u0018öp\r\u00994\u0091";
                                 var10 = "\u0081\u0087^¶\u008e²)ÿT\u0018öp\r\u00994\u0091".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "¬¬\u0011Ûâ\u001d\u0007ÛzñÌ<Lòý¼Ç\u0013Ò\u0014\u0014r?\u007f\u00101\\uã/Zlö/\u0095û\u009a9í:À";
                  var24 = "¬¬\u0011Ûâ\u001d\u0007ÛzñÌ<Lòý¼Ç\u0013Ò\u0014\u0014r?\u007f\u00101\\uã/Zlö/\u0095û\u009a9í:À".length();
                  var21 = 24;
                  var29 = -1;
            }

            ++var29;
            var30 = var22.substring(var29, var29 + var21);
            var10001 = 0;
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 7;
               case 1 -> var10000 = 23;
               case 2 -> var10000 = 15;
               case 3 -> var10000 = 19;
               case 4 -> var10000 = 56;
               case 5 -> var10000 = 43;
               case 6 -> var10000 = 14;
               case 7 -> var10000 = 18;
               case 8 -> var10000 = 47;
               case 9 -> var10000 = 33;
               case 10 -> var10000 = 62;
               case 11 -> var10000 = 16;
               case 12 -> var10000 = 4;
               case 13 -> var10000 = 25;
               case 14 -> var10000 = 10;
               case 15 -> var10000 = 17;
               case 16 -> var10000 = 3;
               case 17 -> var10000 = 6;
               case 18 -> var10000 = 29;
               case 19 -> var10000 = 53;
               case 20 -> var10000 = 1;
               case 21 -> var10000 = 36;
               case 22 -> var10000 = 50;
               case 23 -> var10000 = 34;
               case 24 -> var10000 = 60;
               case 25 -> var10000 = 61;
               case 26 -> var10000 = 2;
               case 27 -> var10000 = 13;
               case 28 -> var10000 = 28;
               case 29 -> var10000 = 12;
               case 30 -> var10000 = 46;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 58;
               case 33 -> var10000 = 8;
               case 34 -> var10000 = 0;
               case 35 -> var10000 = 41;
               case 36 -> var10000 = 55;
               case 37 -> var10000 = 26;
               case 38 -> var10000 = 31;
               case 39 -> var10000 = 40;
               case 40 -> var10000 = 9;
               case 41 -> var10000 = 20;
               case 42 -> var10000 = 54;
               case 43 -> var10000 = 52;
               case 44 -> var10000 = 32;
               case 45 -> var10000 = 63;
               case 46 -> var10000 = 11;
               case 47 -> var10000 = 30;
               case 48 -> var10000 = 49;
               case 49 -> var10000 = 57;
               case 50 -> var10000 = 24;
               case 51 -> var10000 = 21;
               case 52 -> var10000 = 35;
               case 53 -> var10000 = 22;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 48;
               case 56 -> var10000 = 59;
               case 57 -> var10000 = 38;
               case 58 -> var10000 = 44;
               case 59 -> var10000 = 27;
               case 60 -> var10000 = 45;
               case 61 -> var10000 = 51;
               case 62 -> var10000 = 39;
               default -> var10000 = 37;
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

   private static native void b();

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = p[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(q[var4]);
            p[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static native Field c(Class var0, String var1, Class var2);

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

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'S' && var8 != 245 && var8 != 'u' && var8 != 201) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 162) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 't') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'S') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 245) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'u') {
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
