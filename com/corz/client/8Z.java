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

public class 8z {
   public static final double 2 = 0.6;
   public static final int 1;
   private static final int 6;
   private final Map 8 = new HashMap();
   public long 4;
   public long 0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String XNIRoKdtMK;

   public 8G _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 9K _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7T _/* $FF was: 4*/(Object[] var1) {
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      Map var10000 = this.ã<invokedynamic>(this, (long)"c", var3);
      return (7T)var10000.Ì<invokedynamic>(var10000, var1[1], (long)"c", var3);
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.ã<invokedynamic>(this, (long)"c", var2);
      return var10000.Ì<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ã<invokedynamic>(this, (long)"c", var2).Ì<invokedynamic>(this.ã<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   public String _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(8z.class, 443);
      a = s.a(-5452607769349596156L, -6588251761491284075L, MethodHandles.lookup().lookupClass()).a(84209809423640L);
      h = new Object[43];
      i = new String[43];
      a();
      d = new HashMap(13);
      long var11 = a ^ 24966475712167L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = " dî6ÓB\u009aàçß\u0087ßÞ\u007fº\u0012]¶^×\u0098¾âb?lÔ=¦\n+\u0001\u0012Ãàòë¿q\u001eÓ÷\\*ÐÀpë¢a%\u0015\u0003qvÒ(êM¶\u0080öÐ´v\u0084R\u0014\u001cÝÅM\u0012\u0090á; \u001e×\u001dkgY\u009aÇ\u0095\u0011wdþË8\u0010\u001aô+\u0015(\u0006ýÁ\u001c\u0003½É\u001fprÆªýÐTö>!QHñ \u0097>Ýè²\u009a£Eu~-@ð]i_\u0088ä";
      int var19 = " dî6ÓB\u009aàçß\u0087ßÞ\u007fº\u0012]¶^×\u0098¾âb?lÔ=¦\n+\u0001\u0012Ãàòë¿q\u001eÓ÷\\*ÐÀpë¢a%\u0015\u0003qvÒ(êM¶\u0080öÐ´v\u0084R\u0014\u001cÝÅM\u0012\u0090á; \u001e×\u001dkgY\u009aÇ\u0095\u0011wdþË8\u0010\u001aô+\u0015(\u0006ýÁ\u001c\u0003½É\u001fprÆªýÐTö>!QHñ \u0097>Ýè²\u009a£Eu~-@ð]i_\u0088ä".length();
      char var16 = '8';
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[3];
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var32 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var32.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[6];
            int var3 = 0;
            String var4 = "òr\u001eó\n\u001bM\u0080g\u001b¹&Ì:Û\u0015\u0083Úö¼Äå\u007fþD\u000fï9\u0084\u000båá";
            int var5 = "òr\u001eó\n\u001bM\u0080g\u001b¹&Ì:Û\u0015\u0083Úö¼Äå\u007fþD\u000fï9\u0084\u000båá".length();
            int var2 = 0;

            label32:
            while(true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var36 = -1;

               while(true) {
                  long var8 = var33;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           e = var6;
                           f = new Integer[6];
                           6 = true.w<invokedynamic>(20804, var11 ^ 1871364372841725254L);
                           1 = true.w<invokedynamic>(20689, var11 ^ 1451993014980279510L);
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "\u0010{ÿæ\u0015p-(+\u009da8µcûÌ";
                        var5 = "\u0010{ÿæ\u0015p-(+\u009da8µcûÌ".length();
                        var2 = 0;
                  }

                  var10001 = var2;
                  var2 += 8;
                  var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
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

   private static String a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

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
               case 0 -> var10000 = 48;
               case 1 -> var10000 = 57;
               case 2 -> var10000 = 10;
               case 3 -> var10000 = 5;
               case 4 -> var10000 = 23;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 51;
               case 7 -> var10000 = 46;
               case 8 -> var10000 = 38;
               case 9 -> var10000 = 61;
               case 10 -> var10000 = 42;
               case 11 -> var10000 = 36;
               case 12 -> var10000 = 37;
               case 13 -> var10000 = 9;
               case 14 -> var10000 = 3;
               case 15 -> var10000 = 27;
               case 16 -> var10000 = 50;
               case 17 -> var10000 = 52;
               case 18 -> var10000 = 18;
               case 19 -> var10000 = 16;
               case 20 -> var10000 = 59;
               case 21 -> var10000 = 14;
               case 22 -> var10000 = 12;
               case 23 -> var10000 = 43;
               case 24 -> var10000 = 45;
               case 25 -> var10000 = 58;
               case 26 -> var10000 = 26;
               case 27 -> var10000 = 55;
               case 28 -> var10000 = 62;
               case 29 -> var10000 = 17;
               case 30 -> var10000 = 40;
               case 31 -> var10000 = 29;
               case 32 -> var10000 = 11;
               case 33 -> var10000 = 44;
               case 34 -> var10000 = 1;
               case 35 -> var10000 = 20;
               case 36 -> var10000 = 39;
               case 37 -> var10000 = 35;
               case 38 -> var10000 = 19;
               case 39 -> var10000 = 7;
               case 40 -> var10000 = 15;
               case 41 -> var10000 = 32;
               case 42 -> var10000 = 0;
               case 43 -> var10000 = 13;
               case 44 -> var10000 = 49;
               case 45 -> var10000 = 63;
               case 46 -> var10000 = 54;
               case 47 -> var10000 = 30;
               case 48 -> var10000 = 31;
               case 49 -> var10000 = 25;
               case 50 -> var10000 = 6;
               case 51 -> var10000 = 24;
               case 52 -> var10000 = 28;
               case 53 -> var10000 = 4;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 53;
               case 56 -> var10000 = 21;
               case 57 -> var10000 = 34;
               case 58 -> var10000 = 41;
               case 59 -> var10000 = 56;
               case 60 -> var10000 = 2;
               case 61 -> var10000 = 33;
               case 62 -> var10000 = 22;
               default -> var10000 = 47;
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
      var10000[6] = Boolean.TYPE;
      i[6] = "c";
      var10000[7] = Long.TYPE;
      i[7] = "c";
      var10000[8] = Integer.TYPE;
      i[8] = "c";
      var10000[9] = Double.TYPE;
      i[9] = "c";
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
   }

   private static native Class b(long var0, long var2);

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
         if (var8 != 227 && var8 != 235 && var8 != 163 && var8 != 254) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 204) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 214) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 227) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 235) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 163) {
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
