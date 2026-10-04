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

public enum 9d {
   public static final 9d 2;
   public static final 9d 8;
   public static final 9d 0;
   public static final 9d 5;
   public static final 9d 1;
   public static final 9d 7;
   private final int 9;
   private final int 4;
   private final int 3;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private _d/* $FF was: 9d*/(int var3, int var4, int var5) {
      this.9 = var3;
      this.4 = var4;
      this.3 = var5;
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private static 9d[] _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(9d.class, 754);
      a = s.a(-5248388909399810695L, -2771528796065422752L, MethodHandles.lookup().lookupClass()).a(35141666406345L);
      long var20 = a ^ 127342723153362L;
      e = new Object[20];
      f = new String[20];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[6];
      int var17 = 0;
      String var16 = "\u0007ú\u0095\u0084¹¸<4\u0090ÍökÕM=\u008c\b\u001e\tQ\u0098\u001eàË\u0013\bµx\u008b\u007fd\u008fM$\u0010§\u0097&)!t\rþ\b\u001eêÔ¡¨fÞ";
      int var18 = "\u0007ú\u0095\u0084¹¸<4\u0090ÍökÕM=\u008c\b\u001e\tQ\u0098\u001eàË\u0013\bµx\u008b\u007fd\u008fM$\u0010§\u0097&)!t\rþ\b\u001eêÔ¡¨fÞ".length();
      char var15 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var36;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "Þ>\u0013ñüÅ\u0010F_UcÞ{¶*èB¦÷\u008b\u0016¼^\u0099å\u009fø³{/!¨Ú#'D1ÙÆ\u0099F?'Âõ]a÷qlr8Y\u0087SõÂ¼î\u0085-Zþ3E¶z\"F\f«d";
                     int var5 = "Þ>\u0013ñüÅ\u0010F_UcÞ{¶*èB¦÷\u008b\u0016¼^\u0099å\u009fø³{/!¨Ú#'D1ÙÆ\u0099F?'Âõ]a÷qlr8Y\u0087SõÂ¼î\u0085-Zþ3E¶z\"F\f«d".length();
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
                                    b = var6;
                                    c = new Integer[11];
                                    2 = new 9d(var11[1], 0, 0, true.e<invokedynamic>(8505, 7276374200876849198L ^ var20), 0);
                                    8 = new 9d(var11[0], 1, true.e<invokedynamic>(8545, 7106723125500237938L ^ var20), true.e<invokedynamic>(26703, 284837408917229910L ^ var20), 0);
                                    0 = new 9d(var11[5], 2, true.e<invokedynamic>(7630, 3953163355769922779L ^ var20), true.e<invokedynamic>(23118, 4925764758172083032L ^ var20), true.e<invokedynamic>(6414, 7445183591824220190L ^ var20));
                                    5 = new 9d(var11[3], 3, 0, true.e<invokedynamic>(26703, 284837408917229910L ^ var20), true.e<invokedynamic>(7630, 3953163355769922779L ^ var20));
                                    1 = new 9d(var11[2], 4, true.e<invokedynamic>(13328, 8988770269333277963L ^ var20), true.e<invokedynamic>(16876, 2798599863175854328L ^ var20), true.e<invokedynamic>(16876, 2798599863175854328L ^ var20));
                                    7 = new 9d(var11[4], 5, true.e<invokedynamic>(14926, 608800325935907670L ^ var20), true.e<invokedynamic>(25527, 5478362101747849893L ^ var20), true.e<invokedynamic>(25527, 5478362101747849893L ^ var20));
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0005¶¡\u0011\\«À\"<ÈÇ=\u0097w7\u0001";
                                 var5 = "\u0005¶¡\u0011\\«À\"<ÈÇ=\u0097w7\u0001".length();
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

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var36;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label54;
                  }

                  var16 = "U~ \"/ù\u0005{\u0010*;®\rty\u00adÐT¢3 \u009acX´";
                  var18 = "U~ \"/ù\u0005{\u0010*;®\rty\u00adÐT¢3 \u009acX´".length();
                  var15 = '\b';
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
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

   private static native int a(int var0, long var1);

   private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f[var4] != null) {
         return var4;
      } else {
         Object var5 = e[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 41;
               case 1 -> var10000 = 20;
               case 2 -> var10000 = 43;
               case 3 -> var10000 = 11;
               case 4 -> var10000 = 55;
               case 5 -> var10000 = 9;
               case 6 -> var10000 = 44;
               case 7 -> var10000 = 45;
               case 8 -> var10000 = 28;
               case 9 -> var10000 = 53;
               case 10 -> var10000 = 54;
               case 11 -> var10000 = 60;
               case 12 -> var10000 = 47;
               case 13 -> var10000 = 46;
               case 14 -> var10000 = 37;
               case 15 -> var10000 = 33;
               case 16 -> var10000 = 39;
               case 17 -> var10000 = 34;
               case 18 -> var10000 = 56;
               case 19 -> var10000 = 58;
               case 20 -> var10000 = 0;
               case 21 -> var10000 = 14;
               case 22 -> var10000 = 40;
               case 23 -> var10000 = 61;
               case 24 -> var10000 = 26;
               case 25 -> var10000 = 29;
               case 26 -> var10000 = 38;
               case 27 -> var10000 = 23;
               case 28 -> var10000 = 52;
               case 29 -> var10000 = 32;
               case 30 -> var10000 = 48;
               case 31 -> var10000 = 6;
               case 32 -> var10000 = 4;
               case 33 -> var10000 = 12;
               case 34 -> var10000 = 1;
               case 35 -> var10000 = 16;
               case 36 -> var10000 = 30;
               case 37 -> var10000 = 35;
               case 38 -> var10000 = 49;
               case 39 -> var10000 = 8;
               case 40 -> var10000 = 10;
               case 41 -> var10000 = 13;
               case 42 -> var10000 = 2;
               case 43 -> var10000 = 3;
               case 44 -> var10000 = 21;
               case 45 -> var10000 = 27;
               case 46 -> var10000 = 15;
               case 47 -> var10000 = 51;
               case 48 -> var10000 = 7;
               case 49 -> var10000 = 62;
               case 50 -> var10000 = 42;
               case 51 -> var10000 = 5;
               case 52 -> var10000 = 57;
               case 53 -> var10000 = 19;
               case 54 -> var10000 = 59;
               case 55 -> var10000 = 36;
               case 56 -> var10000 = 24;
               case 57 -> var10000 = 17;
               case 58 -> var10000 = 50;
               case 59 -> var10000 = 18;
               case 60 -> var10000 = 31;
               case 61 -> var10000 = 22;
               case 62 -> var10000 = 63;
               default -> var10000 = 25;
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

            f[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static native void a();

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static native Field a(Class var0, String var1, Class var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static Field c(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
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

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 181 && var8 != 'P' && var8 != 244 && var8 != 253) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 217) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 230) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 181) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'P') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 244) {
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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
