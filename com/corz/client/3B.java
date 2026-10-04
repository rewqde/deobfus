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

public class 3b {
   public static final int 6;
   public static final int 9P;
   public static final double 4 = 0.8;
   public static final int 3;
   public static final int 8;
   public static final double 7 = 0.85;
   public static final double 0 = 0.6;
   public static final double 9y = 0.6;
   public static final int 94;
   public static final int 9;
   public static final int 9Z;
   public static final double 5 = 0.7;
   public static final double 2 = 0.6;
   public static final int 1;
   public static final int 9k;
   public static final int 92;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String jPndVFRSGG;

   private _b/* $FF was: 3b*/() {
   }

   public static List _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(3b.class, 762);
      a = s.a(3437452311736064438L, -4982687061337188446L, MethodHandles.lookup().lookupClass()).a(30491605795495L);
      e = new Object[59];
      f = new String[59];
      a();
      d = new HashMap(13);
      long var0 = a ^ 24284939141402L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[29];
      int var5 = 0;
      String var6 = "î\u0097%ãÔ´ÊÒfË\u0090¡L\u001d\toS(\\}\u009a¿#DÿÃôdDè#ø9\u00952q\bkNk\u000f¦A\u0018\u009cF³Lï\u0082ª+:íâ\u0012~&TPñO\u0098ã\u0000Á\u0000%÷q\u0011  \u009e9F\u008a\u0015\tz{\u0096vóVìqC\u0017\u0014ð\u0098\u001a®Ü\u0085Có5\u0017ÞÚ\u0086¨\u000eýôÇ°í!î\u008aÜ\u0005ß\u008e\u0006&Ç\u0093\u0084·±\u008f\u0002¶Ö\u0087\u0014»\u0081DýÁ\u0004W\feQ\u009aÊ\u0092ò\u0019?ån\u001e\u0093qv6&ÃÖìöÿ\u0014\u001aëä\u0018\u0015s\u0099ÏBÍ\u0097B\u0089£åøoâ\u009aëàé\f\u001e\u009b\u001a\u008d\u0006\f\u000b\u001e¿ô\u0087é>v#ÂÁáqô/ý/=!ûwË®vv\u0011\u000f";
      int var7 = "î\u0097%ãÔ´ÊÒfË\u0090¡L\u001d\toS(\\}\u009a¿#DÿÃôdDè#ø9\u00952q\bkNk\u000f¦A\u0018\u009cF³Lï\u0082ª+:íâ\u0012~&TPñO\u0098ã\u0000Á\u0000%÷q\u0011  \u009e9F\u008a\u0015\tz{\u0096vóVìqC\u0017\u0014ð\u0098\u001a®Ü\u0085Có5\u0017ÞÚ\u0086¨\u000eýôÇ°í!î\u008aÜ\u0005ß\u008e\u0006&Ç\u0093\u0084·±\u008f\u0002¶Ö\u0087\u0014»\u0081DýÁ\u0004W\feQ\u009aÊ\u0092ò\u0019?ån\u001e\u0093qv6&ÃÖìöÿ\u0014\u001aëä\u0018\u0015s\u0099ÏBÍ\u0097B\u0089£åøoâ\u009aëàé\f\u001e\u009b\u001a\u008d\u0006\f\u000b\u001e¿ô\u0087é>v#ÂÁáqô/ý/=!ûwË®vv\u0011\u000f".length();
      int var4 = 0;

      label23:
      while(true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var19 = -1;

         while(true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var21 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[29];
                     3 = true.n<invokedynamic>(19485, var0 ^ 5191977892739207103L);
                     92 = true.n<invokedynamic>(27559, var0 ^ 6180536205916727312L);
                     9 = true.n<invokedynamic>(18844, var0 ^ 5616400282105694755L);
                     94 = true.n<invokedynamic>(20231, var0 ^ 8751298140674903203L);
                     9P = true.n<invokedynamic>(13862, var0 ^ 654221541423920512L);
                     6 = true.n<invokedynamic>(19558, var0 ^ 6702654210011844550L);
                     8 = true.n<invokedynamic>(18744, var0 ^ 3889793322853583504L);
                     1 = true.n<invokedynamic>(3641, var0 ^ 1021472665438719383L);
                     9Z = true.n<invokedynamic>(3641, var0 ^ 1021472665438719383L);
                     9k = true.n<invokedynamic>(7647, var0 ^ 7458108491375713914L);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "@Jç¤32\"©²M\u0097\u0084û\u0080}G";
                  var7 = "@Jç¤32\"©²M\u0097\u0084û\u0080}G".length();
                  var4 = 0;
            }

            var10001 = var4;
            var4 += 8;
            var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var19 = 0;
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

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      f[6] = "c";
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
      var10000[17] = Void.TYPE;
      f[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = Integer.TYPE;
      f[24] = "c";
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

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'L' && var8 != '$' && var8 != 'x' && var8 != 'D') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 251) {
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
            if (var8 == 'L') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == '$') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'x') {
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
