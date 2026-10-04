package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public class 7F {
   static final int[] 1;
   static final int[] 0;
   static final int[] 6;
   private static final Object[] a;
   private static final String[] b;
   // $FF: synthetic field
   private static transient String SvJvXsJfDW;

   static {
      long var11 = s.a(1217420967053038057L, -7646649528398192505L, MethodHandles.lookup().lookupClass()).a(62364153552519L) ^ 92872223213086L;
      a = new Object[47];
      b = new String[47];
      a();
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[12];
      int var4 = 0;
      String var5 = "<\u0093Öç\u0014±KX\u0002¿äÌb\u009f\u0085ënhàÒÂ\u00adHè\u0010¾dB¨XL,¤K\n\u009f{Ç¹Eð\u001bô+÷/8\t\u0094Ì\u0098\u0005^wyFtuÉP9£{H¥Zê\ni\"G±¼ök0]w[ö";
      int var6 = "<\u0093Öç\u0014±KX\u0002¿äÌb\u009f\u0085ënhàÒÂ\u00adHè\u0010¾dB¨XL,¤K\n\u009f{Ç¹Eð\u001bô+÷/8\t\u0094Ì\u0098\u0005^wyFtuÉP9£{H¥Zê\ni\"G±¼ök0]w[ö".length();
      int var3 = 0;

      label187:
      while(true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var41 = var0;
         var10001 = var4++;
         long var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var46 = -1;

         while(true) {
            long var8 = var44;
            byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var48 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var46) {
               case 0:
                  var41[var10001] = var48;
                  if (var3 >= var6) {
                     6 = new int[-4650113761011123754L.M<invokedynamic>(-4650113761011123754L, var11).length];

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649610445270938185L.G<invokedynamic>(-4649610445270938185L, var11).Â<invokedynamic>(-4649610445270938185L.G<invokedynamic>(-4649610445270938185L, var11), -4650248391850899587L, var11)] = 1;
                     } catch (NoSuchFieldError var39) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4648374169508002348L.G<invokedynamic>(-4648374169508002348L, var11).Â<invokedynamic>(-4648374169508002348L.G<invokedynamic>(-4648374169508002348L, var11), -4650248391850899587L, var11)] = 2;
                     } catch (NoSuchFieldError var38) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4651010136622262765L.G<invokedynamic>(-4651010136622262765L, var11).Â<invokedynamic>(-4651010136622262765L.G<invokedynamic>(-4651010136622262765L, var11), -4650248391850899587L, var11)] = 3;
                     } catch (NoSuchFieldError var37) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4648970081144113134L.G<invokedynamic>(-4648970081144113134L, var11).Â<invokedynamic>(-4648970081144113134L.G<invokedynamic>(-4648970081144113134L, var11), -4650248391850899587L, var11)] = 4;
                     } catch (NoSuchFieldError var36) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649985022253198924L.G<invokedynamic>(-4649985022253198924L, var11).Â<invokedynamic>(-4649985022253198924L.G<invokedynamic>(-4649985022253198924L, var11), -4650248391850899587L, var11)] = 5;
                     } catch (NoSuchFieldError var35) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650485069500291503L.G<invokedynamic>(-4650485069500291503L, var11).Â<invokedynamic>(-4650485069500291503L.G<invokedynamic>(-4650485069500291503L, var11), -4650248391850899587L, var11)] = (int)var0[2];
                     } catch (NoSuchFieldError var34) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649035270468431354L.G<invokedynamic>(-4649035270468431354L, var11).Â<invokedynamic>(-4649035270468431354L.G<invokedynamic>(-4649035270468431354L, var11), -4650248391850899587L, var11)] = (int)var0[11];
                     } catch (NoSuchFieldError var33) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650863744254959879L.G<invokedynamic>(-4650863744254959879L, var11).Â<invokedynamic>(-4650863744254959879L.G<invokedynamic>(-4650863744254959879L, var11), -4650248391850899587L, var11)] = (int)var0[6];
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649118676786313906L.G<invokedynamic>(-4649118676786313906L, var11).Â<invokedynamic>(-4649118676786313906L.G<invokedynamic>(-4649118676786313906L, var11), -4650248391850899587L, var11)] = (int)var0[4];
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650094679748224350L.G<invokedynamic>(-4650094679748224350L, var11).Â<invokedynamic>(-4650094679748224350L.G<invokedynamic>(-4650094679748224350L, var11), -4650248391850899587L, var11)] = (int)var0[5];
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650658652416813966L.G<invokedynamic>(-4650658652416813966L, var11).Â<invokedynamic>(-4650658652416813966L.G<invokedynamic>(-4650658652416813966L, var11), -4650248391850899587L, var11)] = (int)var0[10];
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650787865999241869L.G<invokedynamic>(-4650787865999241869L, var11).Â<invokedynamic>(-4650787865999241869L.G<invokedynamic>(-4650787865999241869L, var11), -4650248391850899587L, var11)] = (int)var0[7];
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649618150414585249L.G<invokedynamic>(-4649618150414585249L, var11).Â<invokedynamic>(-4649618150414585249L.G<invokedynamic>(-4649618150414585249L, var11), -4650248391850899587L, var11)] = (int)var0[0];
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4648528738209257034L.G<invokedynamic>(-4648528738209257034L, var11).Â<invokedynamic>(-4648528738209257034L.G<invokedynamic>(-4648528738209257034L, var11), -4650248391850899587L, var11)] = (int)var0[9];
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4649467825152652041L.G<invokedynamic>(-4649467825152652041L, var11).Â<invokedynamic>(-4649467825152652041L.G<invokedynamic>(-4649467825152652041L, var11), -4650248391850899587L, var11)] = (int)var0[3];
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4650683433186307636L.G<invokedynamic>(-4650683433186307636L, var11).Â<invokedynamic>(-4650683433186307636L.G<invokedynamic>(-4650683433186307636L, var11), -4650248391850899587L, var11)] = (int)var0[1];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        -4649345222914180439L.G<invokedynamic>(-4649345222914180439L, var11)[-4648422845783196958L.G<invokedynamic>(-4648422845783196958L, var11).Â<invokedynamic>(-4648422845783196958L.G<invokedynamic>(-4648422845783196958L, var11), -4650248391850899587L, var11)] = (int)var0[8];
                     } catch (NoSuchFieldError var23) {
                     }

                     0 = new int[-4648858107650907649L.M<invokedynamic>(-4648858107650907649L, var11).length];

                     try {
                        -4650198915915663531L.G<invokedynamic>(-4650198915915663531L, var11)[-4649958937641016625L.G<invokedynamic>(-4649958937641016625L, var11).Â<invokedynamic>(-4649958937641016625L.G<invokedynamic>(-4649958937641016625L, var11), -4649868591525342073L, var11)] = 1;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        -4650198915915663531L.G<invokedynamic>(-4650198915915663531L, var11)[-4649205334764860729L.G<invokedynamic>(-4649205334764860729L, var11).Â<invokedynamic>(-4649205334764860729L.G<invokedynamic>(-4649205334764860729L, var11), -4649868591525342073L, var11)] = 2;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        -4650198915915663531L.G<invokedynamic>(-4650198915915663531L, var11)[-4649138239650293618L.G<invokedynamic>(-4649138239650293618L, var11).Â<invokedynamic>(-4649138239650293618L.G<invokedynamic>(-4649138239650293618L, var11), -4649868591525342073L, var11)] = 3;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        -4650198915915663531L.G<invokedynamic>(-4650198915915663531L, var11)[-4649688096559143605L.G<invokedynamic>(-4649688096559143605L, var11).Â<invokedynamic>(-4649688096559143605L.G<invokedynamic>(-4649688096559143605L, var11), -4649868591525342073L, var11)] = 4;
                     } catch (NoSuchFieldError var19) {
                     }

                     1 = new int[-4650889077295299880L.M<invokedynamic>(-4650889077295299880L, var11).length];

                     try {
                        -4649784903949122738L.G<invokedynamic>(-4649784903949122738L, var11)[-4649492895790386355L.G<invokedynamic>(-4649492895790386355L, var11).Â<invokedynamic>(-4649492895790386355L.G<invokedynamic>(-4649492895790386355L, var11), -4648313773615397389L, var11)] = 1;
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        -4649784903949122738L.G<invokedynamic>(-4649784903949122738L, var11)[-4650322718217390460L.G<invokedynamic>(-4650322718217390460L, var11).Â<invokedynamic>(-4650322718217390460L.G<invokedynamic>(-4650322718217390460L, var11), -4648313773615397389L, var11)] = 2;
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        -4649784903949122738L.G<invokedynamic>(-4649784903949122738L, var11)[-4651028949222910436L.G<invokedynamic>(-4651028949222910436L, var11).Â<invokedynamic>(-4651028949222910436L.G<invokedynamic>(-4651028949222910436L, var11), -4648313773615397389L, var11)] = 3;
                     } catch (NoSuchFieldError var16) {
                     }

                     try {
                        -4649784903949122738L.G<invokedynamic>(-4649784903949122738L, var11)[-4650431422047845448L.G<invokedynamic>(-4650431422047845448L, var11).Â<invokedynamic>(-4650431422047845448L.G<invokedynamic>(-4650431422047845448L, var11), -4648313773615397389L, var11)] = 4;
                     } catch (NoSuchFieldError var15) {
                     }

                     try {
                        -4649784903949122738L.G<invokedynamic>(-4649784903949122738L, var11)[-4649269005259801885L.G<invokedynamic>(-4649269005259801885L, var11).Â<invokedynamic>(-4649269005259801885L.G<invokedynamic>(-4649269005259801885L, var11), -4648313773615397389L, var11)] = 5;
                     } catch (NoSuchFieldError var14) {
                     }

                     return;
                  }
                  break;
               default:
                  var41[var10001] = var48;
                  if (var3 < var6) {
                     continue label187;
                  }

                  var5 = "Þ\u0088ë%\u008f÷(O2\u009e-ê\u0087\u000eÑ\u0087";
                  var6 = "Þ\u0088ë%\u008f÷(O2\u009e-ê\u0087\u000eÑ\u0087".length();
                  var3 = 0;
            }

            var10001 = var3;
            var3 += 8;
            var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
            var41 = var0;
            var10001 = var4++;
            var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var46 = 0;
         }
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (b[var4] != null) {
         return var4;
      } else {
         Object var5 = a[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 48;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 2;
               case 3 -> var10000 = 10;
               case 4 -> var10000 = 16;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 32;
               case 7 -> var10000 = 54;
               case 8 -> var10000 = 61;
               case 9 -> var10000 = 20;
               case 10 -> var10000 = 14;
               case 11 -> var10000 = 36;
               case 12 -> var10000 = 62;
               case 13 -> var10000 = 57;
               case 14 -> var10000 = 6;
               case 15 -> var10000 = 13;
               case 16 -> var10000 = 26;
               case 17 -> var10000 = 23;
               case 18 -> var10000 = 52;
               case 19 -> var10000 = 56;
               case 20 -> var10000 = 27;
               case 21 -> var10000 = 40;
               case 22 -> var10000 = 5;
               case 23 -> var10000 = 33;
               case 24 -> var10000 = 17;
               case 25 -> var10000 = 39;
               case 26 -> var10000 = 0;
               case 27 -> var10000 = 9;
               case 28 -> var10000 = 44;
               case 29 -> var10000 = 42;
               case 30 -> var10000 = 12;
               case 31 -> var10000 = 53;
               case 32 -> var10000 = 59;
               case 33 -> var10000 = 60;
               case 34 -> var10000 = 4;
               case 35 -> var10000 = 50;
               case 36 -> var10000 = 58;
               case 37 -> var10000 = 30;
               case 38 -> var10000 = 25;
               case 39 -> var10000 = 46;
               case 40 -> var10000 = 51;
               case 41 -> var10000 = 47;
               case 42 -> var10000 = 63;
               case 43 -> var10000 = 18;
               case 44 -> var10000 = 37;
               case 45 -> var10000 = 38;
               case 46 -> var10000 = 31;
               case 47 -> var10000 = 3;
               case 48 -> var10000 = 24;
               case 49 -> var10000 = 34;
               case 50 -> var10000 = 41;
               case 51 -> var10000 = 21;
               case 52 -> var10000 = 15;
               case 53 -> var10000 = 29;
               case 54 -> var10000 = 43;
               case 55 -> var10000 = 22;
               case 56 -> var10000 = 19;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 49;
               case 59 -> var10000 = 35;
               case 60 -> var10000 = 55;
               case 61 -> var10000 = 28;
               case 62 -> var10000 = 7;
               default -> var10000 = 1;
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

            b[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = a;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Integer.TYPE;
      b[2] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = a[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(b[var4]);
            a[var4] = var5;
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
      Object var5 = a[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = b[var4];
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
               a[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     a[var4] = var13;
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
      Object var5 = a[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = b[var4];
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
               a[var4] = var26;
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
                     a[var4] = var19;
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
         if (var8 != 245 && var8 != 240 && var8 != 'G' && var8 != 'A') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 194) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'M') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 245) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 240) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'G') {
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

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
