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

public enum 7M7 {
   public static final 7M7 32;
   public static final 7M7 0;
   public static final 7M7 3;
   public static final 7M7 4;
   public static final 7M7 6;
   public static final 7M7 3j;
   public static final 7M7 2;
   public static final 7M7 9;
   public static final 7M7 1;
   public static final 7M7 5;
   public static final 7M7 3B;
   public static final 7M7 7;
   public static final 7M7 8;
   private static final 7M7[] 3U;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 7M7[] _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7M7.class, 420);
      a = s.a(1121736363049451365L, -7972495873331234392L, MethodHandles.lookup().lookupClass()).a(117868634548740L);
      long var20 = a ^ 133923085551501L;
      e = new Object[23];
      f = new String[23];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[13];
      int var17 = 0;
      String var16 = "±9\u0087¯ÅÏK?\u0010·\u0087Y\u001b\u000e\u0015Ã|4±\u0000\u0002I³U4\b(uÁ¯ÐScÁ\b¦wNT\tY}\u009e\u0010\u008d\u000b ÑÔ\u008ba;(\u0080|\u001a\u00adJ\u009fu\u00102\u008aD±\u00130\u001fgªÈ¼iû2¸e\bâ 'ÛÐA}È\u0010t?±0ÎüÜ4]\u0019÷t[\u0003\u0084\u0098\b,\u0016|ëÒ Üc\u0010ËXB0³\u009d\"Õ\u0011\u0016i\u00969o)S\b\u000fsbù\u000eiA=";
      int var18 = "±9\u0087¯ÅÏK?\u0010·\u0087Y\u001b\u000e\u0015Ã|4±\u0000\u0002I³U4\b(uÁ¯ÐScÁ\b¦wNT\tY}\u009e\u0010\u008d\u000b ÑÔ\u008ba;(\u0080|\u001a\u00adJ\u009fu\u00102\u008aD±\u00130\u001fgªÈ¼iû2¸e\bâ 'ÛÐA}È\u0010t?±0ÎüÜ4]\u0019÷t[\u0003\u0084\u0098\b,\u0016|ëÒ Üc\u0010ËXB0³\u009d\"Õ\u0011\u0016i\u00969o)S\b\u000fsbù\u000eiA=".length();
      char var15 = '\b';
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
                     long[] var6 = new long[15];
                     int var3 = 0;
                     String var4 = "4Vöa\u008d0²öýuÂQßè\u0089qJ\u0099H\u000bôûZD\r^\u001e2@\u0091[Z@4£\u0087\u00adÝ\u009d7æÌ{S\u008eýå>G8á\u0093u7}\u000f¡POå\n4x2±?íKÅ\u0087\u0015Ûÿ!ê\u0011DÀFR\u009dUý¢ðýñ\u000f\u0087}ªa0=]÷¯i\\\u0090¥/I\u0099";
                     int var5 = "4Vöa\u008d0²öýuÂQßè\u0089qJ\u0099H\u000bôûZD\r^\u001e2@\u0091[Z@4£\u0087\u00adÝ\u009d7æÌ{S\u008eýå>G8á\u0093u7}\u000f¡POå\n4x2±?íKÅ\u0087\u0015Ûÿ!ê\u0011DÀFR\u009dUý¢ðýñ\u000f\u0087}ªa0=]÷¯i\\\u0090¥/I\u0099".length();
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
                                    c = new Integer[15];
                                    32 = new 7M7(var11[0], 0);
                                    0 = new 7M7(var11[10], 1);
                                    3 = new 7M7(var11[6], 2);
                                    4 = new 7M7(var11[12], 3);
                                    6 = new 7M7(var11[1], 4);
                                    3j = new 7M7(var11[3], 5);
                                    2 = new 7M7(var11[9], true.p<invokedynamic>(5209, 5541427475310042081L ^ var20));
                                    9 = new 7M7(var11[4], true.p<invokedynamic>(3473, 6729540574675878434L ^ var20));
                                    1 = new 7M7(var11[5], true.p<invokedynamic>(31877, 7287709312725103409L ^ var20));
                                    5 = new 7M7(var11[2], true.p<invokedynamic>(8559, 5629807191200329427L ^ var20));
                                    3B = new 7M7(var11[7], true.p<invokedynamic>(20671, 3374753855813033738L ^ var20));
                                    7 = new 7M7(var11[11], true.p<invokedynamic>(27954, 1178530341281735304L ^ var20));
                                    8 = new 7M7(var11[8], true.p<invokedynamic>(16871, 4718443018419932752L ^ var20));
                                    3U = 2577985960465157211L.É<invokedynamic>(2577985960465157211L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u00adºeÍ\u0002q9\u0082*Ó\u0013Zd§\u001fÌ";
                                 var5 = "\u00adºeÍ\u0002q9\u0082*Ó\u0013Zd§\u001fÌ".length();
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

                  var16 = "\u0012GOc&ì¬¾\u0010 #\u0005\u00ad@\u001do\u0016¶\u0099èßØEÄw";
                  var18 = "\u0012GOc&ì¬¾\u0010 #\u0005\u00ad@\u001do\u0016¶\u0099èßØEÄw".length();
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
               case 0 -> var10000 = 54;
               case 1 -> var10000 = 61;
               case 2 -> var10000 = 38;
               case 3 -> var10000 = 18;
               case 4 -> var10000 = 30;
               case 5 -> var10000 = 23;
               case 6 -> var10000 = 16;
               case 7 -> var10000 = 1;
               case 8 -> var10000 = 20;
               case 9 -> var10000 = 51;
               case 10 -> var10000 = 33;
               case 11 -> var10000 = 45;
               case 12 -> var10000 = 48;
               case 13 -> var10000 = 52;
               case 14 -> var10000 = 2;
               case 15 -> var10000 = 63;
               case 16 -> var10000 = 34;
               case 17 -> var10000 = 53;
               case 18 -> var10000 = 21;
               case 19 -> var10000 = 19;
               case 20 -> var10000 = 29;
               case 21 -> var10000 = 11;
               case 22 -> var10000 = 44;
               case 23 -> var10000 = 17;
               case 24 -> var10000 = 27;
               case 25 -> var10000 = 50;
               case 26 -> var10000 = 43;
               case 27 -> var10000 = 60;
               case 28 -> var10000 = 12;
               case 29 -> var10000 = 28;
               case 30 -> var10000 = 35;
               case 31 -> var10000 = 4;
               case 32 -> var10000 = 25;
               case 33 -> var10000 = 42;
               case 34 -> var10000 = 10;
               case 35 -> var10000 = 59;
               case 36 -> var10000 = 49;
               case 37 -> var10000 = 37;
               case 38 -> var10000 = 7;
               case 39 -> var10000 = 58;
               case 40 -> var10000 = 6;
               case 41 -> var10000 = 5;
               case 42 -> var10000 = 9;
               case 43 -> var10000 = 13;
               case 44 -> var10000 = 22;
               case 45 -> var10000 = 40;
               case 46 -> var10000 = 39;
               case 47 -> var10000 = 31;
               case 48 -> var10000 = 57;
               case 49 -> var10000 = 8;
               case 50 -> var10000 = 55;
               case 51 -> var10000 = 32;
               case 52 -> var10000 = 26;
               case 53 -> var10000 = 41;
               case 54 -> var10000 = 47;
               case 55 -> var10000 = 62;
               case 56 -> var10000 = 56;
               case 57 -> var10000 = 36;
               case 58 -> var10000 = 24;
               case 59 -> var10000 = 15;
               case 60 -> var10000 = 14;
               case 61 -> var10000 = 46;
               case 62 -> var10000 = 0;
               default -> var10000 = 3;
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

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
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
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
   }

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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var26;
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
                     e[var4] = var19;
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
