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

public enum 7fj {
   public static final 7fj 5;
   public static final 7fj 3;
   public static final 7fj 8;
   public static final 7fj 4;
   public static final 7fj 6;
   public static final 7fj 7;
   public static final 7fj 1;
   public static final 7fj 2;
   public static final 7fj 9;
   private static final 7fj[] 0;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 7fj[] _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7fj.class, 506);
      a = s.a(2596526116882368017L, -8542058822545300039L, MethodHandles.lookup().lookupClass()).a(109609881178933L);
      long var20 = a ^ 2819449750236L;
      e = new Object[19];
      f = new String[19];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[9];
      int var17 = 0;
      String var16 = "Y\u0082F½´\u0091Q²\u008cf¡1¾s\u008e¼\u0010bÑL%}dpwlÛ\u009f\u000f\u009aÜ\u0011µ\u0010\u0012K\u008b¨È-J[\u009cXÀîò;\u0083ñ\u0010¼²²O>\u0091b\u001eä\u001a\u0085+\u00868\u0007Þ\u0010÷d<¿ü\u009dZXÒ*{.9[åú\u0010\n\u0089^\u0082Þòó?h\u001bà4Æ¶\u009an\u00106\u0016\u0011%Ðîuq\u008eu\"\u008c\u0085õ\u0016P";
      int var18 = "Y\u0082F½´\u0091Q²\u008cf¡1¾s\u008e¼\u0010bÑL%}dpwlÛ\u009f\u000f\u009aÜ\u0011µ\u0010\u0012K\u008b¨È-J[\u009cXÀîò;\u0083ñ\u0010¼²²O>\u0091b\u001eä\u001a\u0085+\u00868\u0007Þ\u0010÷d<¿ü\u009dZXÒ*{.9[åú\u0010\n\u0089^\u0082Þòó?h\u001bà4Æ¶\u009an\u00106\u0016\u0011%Ðîuq\u008eu\"\u008c\u0085õ\u0016P".length();
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
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "¥Ô¡e;ÚêÎ¯\u007fi%\\¡·\u0086à¦è;\u001f ¤KH\u001a0\u0011: Ëìãçñ¬<ÑÌò";
                     int var5 = "¥Ô¡e;ÚêÎ¯\u007fi%\\¡·\u0086à¦è;\u001f ¤KH\u001a0\u0011: Ëìãçñ¬<ÑÌò".length();
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
                                    c = new Integer[7];
                                    5 = new 7fj(var11[7], 0);
                                    3 = new 7fj(var11[4], 1);
                                    8 = new 7fj(var11[2], 2);
                                    4 = new 7fj(var11[0], 3);
                                    6 = new 7fj(var11[6], 4);
                                    7 = new 7fj(var11[5], 5);
                                    1 = new 7fj(var11[3], true.f<invokedynamic>(20457, 5804389306391535254L ^ var20));
                                    2 = new 7fj(var11[1], true.f<invokedynamic>(464, 1192857903846215851L ^ var20));
                                    9 = new 7fj(var11[8], true.f<invokedynamic>(4412, 33047418717192256L ^ var20));
                                    0 = 2369585867438997103L.Å<invokedynamic>(2369585867438997103L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0010Þë;´\u0084W\fG\u0003F\u0015ô%É\u009f";
                                 var5 = "\u0010Þë;´\u0084W\fG\u0003F\u0015ô%É\u009f".length();
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

                  var16 = "¤÷O}¡ ÉZ%¥\u0099\u0013\u0089Öõö÷\u0092\u0016ð:ô\u0094ç\bDÓ`1yk¡&";
                  var18 = "¤÷O}¡ ÉZ%¥\u0099\u0013\u0089Öõö÷\u0092\u0016ð:ô\u0094ç\bDÓ`1yk¡&".length();
                  var15 = 24;
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
               case 0 -> var10000 = 25;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 26;
               case 3 -> var10000 = 9;
               case 4 -> var10000 = 40;
               case 5 -> var10000 = 62;
               case 6 -> var10000 = 11;
               case 7 -> var10000 = 32;
               case 8 -> var10000 = 39;
               case 9 -> var10000 = 20;
               case 10 -> var10000 = 44;
               case 11 -> var10000 = 41;
               case 12 -> var10000 = 34;
               case 13 -> var10000 = 31;
               case 14 -> var10000 = 33;
               case 15 -> var10000 = 30;
               case 16 -> var10000 = 49;
               case 17 -> var10000 = 22;
               case 18 -> var10000 = 16;
               case 19 -> var10000 = 19;
               case 20 -> var10000 = 50;
               case 21 -> var10000 = 53;
               case 22 -> var10000 = 7;
               case 23 -> var10000 = 61;
               case 24 -> var10000 = 52;
               case 25 -> var10000 = 21;
               case 26 -> var10000 = 51;
               case 27 -> var10000 = 47;
               case 28 -> var10000 = 55;
               case 29 -> var10000 = 6;
               case 30 -> var10000 = 63;
               case 31 -> var10000 = 3;
               case 32 -> var10000 = 2;
               case 33 -> var10000 = 43;
               case 34 -> var10000 = 15;
               case 35 -> var10000 = 17;
               case 36 -> var10000 = 38;
               case 37 -> var10000 = 5;
               case 38 -> var10000 = 46;
               case 39 -> var10000 = 60;
               case 40 -> var10000 = 4;
               case 41 -> var10000 = 23;
               case 42 -> var10000 = 59;
               case 43 -> var10000 = 27;
               case 44 -> var10000 = 1;
               case 45 -> var10000 = 48;
               case 46 -> var10000 = 14;
               case 47 -> var10000 = 35;
               case 48 -> var10000 = 0;
               case 49 -> var10000 = 54;
               case 50 -> var10000 = 10;
               case 51 -> var10000 = 12;
               case 52 -> var10000 = 36;
               case 53 -> var10000 = 18;
               case 54 -> var10000 = 24;
               case 55 -> var10000 = 29;
               case 56 -> var10000 = 57;
               case 57 -> var10000 = 28;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 13;
               case 60 -> var10000 = 42;
               case 61 -> var10000 = 56;
               case 62 -> var10000 = 8;
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

   private static native Field c(long var0, long var2);

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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'z' && var8 != 'M' && var8 != 221 && var8 != 201) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 229) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 197) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'z') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'M') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 221) {
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
