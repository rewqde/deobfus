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
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_7417;

public class 11 extends 9a {
   private final 4b 4;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final Object[] o;
   private static final String[] p;
   // $FF: synthetic field
   private static transient String wgPMFMkdmH;

   public _1/* $FF was: 11*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public String _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static 11 _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 0*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = b ^ var1;
      7Mj[] var3 = "c".O<invokedynamic>((long)"c", var1);

      class_310 var10000;
      label88: {
         class_310 var4;
         try {
            label111: {
               var4 = "c".O<invokedynamic>((long)"c", var1);

               label83: {
                  try {
                     var10000 = var4;
                     if (var3 == null) {
                        break label83;
                     }

                     if (var4 == null) {
                        return null;
                     }
                  } catch (Exception var12) {
                     throw var12.O<invokedynamic>(var12, (long)"c", var1);
                  }

                  var10000 = var4;
               }

               try {
                  if (var3 == null) {
                     break label88;
                  }

                  if (var10000.N<invokedynamic>(var10000, (long)"c", var1) != null) {
                     break label111;
                  }
               } catch (Exception var11) {
                  throw var11.O<invokedynamic>(var11, (long)"c", var1);
               }

               return null;
            }
         } catch (Exception var13) {
            boolean var10001 = false;
            return null;
         }

         try {
            var10000 = var4;
         } catch (Exception var10) {
            boolean var19 = false;
            return null;
         }
      }

      try {
         var10000 = var10000.N<invokedynamic>(var10000, (long)"c", var1);
         String var5 = var10000.N<invokedynamic>(var10000, (long)"c", var1);

         label113: {
            label59: {
               label58: {
                  try {
                     var16 = var5;
                     if (var1 <= 1L || var3 == null) {
                        break label58;
                     }

                     if (var5 == null) {
                        break label59;
                     }
                  } catch (Exception var8) {
                     throw var8.O<invokedynamic>(var8, (long)"c", var1);
                  }

                  var16 = var5;
               }

               try {
                  if (!var16.N<invokedynamic>(var16, (long)"c", var1)) {
                     break label113;
                  }
               } catch (Exception var7) {
                  var17 = var7;
                  boolean var21 = false;
                  throw var17.O<invokedynamic>(var17, (long)"c", var1);
               }
            }

            try {
               var18 = null;
               return var18;
            } catch (Exception var6) {
               var17 = var6;
               boolean var22 = false;
               throw var17.O<invokedynamic>(var17, (long)"c", var1);
            }
         }

         var18 = var5;
         return var18;
      } catch (Exception var9) {
         boolean var20 = false;
         return null;
      }
   }

   public static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static class_2561 _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static class_2561 _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static class_7417 _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(11.class, 561);
      b = com.corz.client.s.a(6719367491249759926L, -6162738846967710536L, MethodHandles.lookup().lookupClass()).a(187591739110049L);
      o = new Object[80];
      p = new String[80];
      b();
      h = new HashMap(13);
      long var11 = b ^ 112759103917503L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "\u0014¶\u001bü¤ÜÐÂ\u0000{Õû¥D\"\u0088\u0010!#\u0003ê\u0013hAA¿+ù\u007f4(ÂÀ";
      int var19 = "\u0014¶\u001bü¤ÜÐÂ\u0000{Õû¥D\"\u0088\u0010!#\u0003ê\u0013hAA¿+ù\u007f4(ÂÀ".length();
      char var16 = 16;
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = b(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            f = var20;
            g = new String[2];
            n = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var29 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var29.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "aÎ\u0088Úvñê»Üÿ\u0089\u0007\u0090@\t}";
            int var5 = "aÎ\u0088Úvñê»Üÿ\u0089\u0007\u0090@\t}".length();
            int var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
               long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
               boolean var31 = true;
               var6[var10001] = var10004;
            } while(var2 < var5);

            l = var6;
            m = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
      }
   }

   private static Exception a(Exception var0) {
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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

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
      if (p[var4] != null) {
         return var4;
      } else {
         Object var5 = o[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 6;
               case 1 -> var10000 = 17;
               case 2 -> var10000 = 23;
               case 3 -> var10000 = 49;
               case 4 -> var10000 = 63;
               case 5 -> var10000 = 2;
               case 6 -> var10000 = 28;
               case 7 -> var10000 = 57;
               case 8 -> var10000 = 0;
               case 9 -> var10000 = 1;
               case 10 -> var10000 = 44;
               case 11 -> var10000 = 37;
               case 12 -> var10000 = 4;
               case 13 -> var10000 = 27;
               case 14 -> var10000 = 8;
               case 15 -> var10000 = 7;
               case 16 -> var10000 = 39;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 15;
               case 19 -> var10000 = 43;
               case 20 -> var10000 = 11;
               case 21 -> var10000 = 59;
               case 22 -> var10000 = 48;
               case 23 -> var10000 = 9;
               case 24 -> var10000 = 31;
               case 25 -> var10000 = 58;
               case 26 -> var10000 = 46;
               case 27 -> var10000 = 62;
               case 28 -> var10000 = 13;
               case 29 -> var10000 = 47;
               case 30 -> var10000 = 32;
               case 31 -> var10000 = 54;
               case 32 -> var10000 = 26;
               case 33 -> var10000 = 21;
               case 34 -> var10000 = 34;
               case 35 -> var10000 = 45;
               case 36 -> var10000 = 33;
               case 37 -> var10000 = 10;
               case 38 -> var10000 = 55;
               case 39 -> var10000 = 42;
               case 40 -> var10000 = 24;
               case 41 -> var10000 = 5;
               case 42 -> var10000 = 40;
               case 43 -> var10000 = 50;
               case 44 -> var10000 = 16;
               case 45 -> var10000 = 38;
               case 46 -> var10000 = 52;
               case 47 -> var10000 = 36;
               case 48 -> var10000 = 30;
               case 49 -> var10000 = 53;
               case 50 -> var10000 = 3;
               case 51 -> var10000 = 56;
               case 52 -> var10000 = 51;
               case 53 -> var10000 = 25;
               case 54 -> var10000 = 35;
               case 55 -> var10000 = 29;
               case 56 -> var10000 = 18;
               case 57 -> var10000 = 22;
               case 58 -> var10000 = 60;
               case 59 -> var10000 = 12;
               case 60 -> var10000 = 20;
               case 61 -> var10000 = 19;
               case 62 -> var10000 = 41;
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

            p[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = o;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Boolean.TYPE;
      p[9] = "c";
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
      var10000[22] = Integer.TYPE;
      p[22] = "c";
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
      var10000[38] = Void.TYPE;
      p[38] = "c";
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
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = o[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(p[var4]);
            o[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

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
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = p[var4];
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
               o[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     o[var4] = var13;
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
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = p[var4];
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
               o[var4] = var26;
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
                     o[var4] = var19;
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
