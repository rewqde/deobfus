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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 0s {
   public static final int 2;
   public static final int 5;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String fMCmZRiVJC;

   private _s/* $FF was: 0s*/() {
   }

   static int _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static int _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 76P _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 76P _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 9*/(766 var0, long var1, 73V var3) {
      var1 = a ^ var1;
      Map var10000 = var0.Q<invokedynamic>(var0, (long)"c", var1);
      Integer var5 = (Integer)var10000.B<invokedynamic>(var10000, var3.B<invokedynamic>(var3, (long)"c", var1).Ü<invokedynamic>(var3.B<invokedynamic>(var3, (long)"c", var1), (long)"c", var1), false.Ü<invokedynamic>(0, (long)"c", var1), (long)"c", var1);
      return -var5.B<invokedynamic>(var5, (long)"c", var1);
   }

   private static int _/* $FF was: 4*/(long param0, long param2, 73V param4) {
      // $FF: Couldn't be decompiled
   }

   private static Boolean _/* $FF was: 6*/(long var0, int var2, 73V var3) {
      long var4 = (var0 << 32 | (long)var2 << 32 >>> 32) ^ a;
      boolean var6 = "c".Ü<invokedynamic>((long)"c", var4);

      boolean var10000;
      label32: {
         try {
            var10000 = var3.B<invokedynamic>(var3, (long)"c", var4);
            if (var6) {
               return var10000.Ü<invokedynamic>(var10000, (long)"c", var4);
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var7) {
            throw var7.Ü<invokedynamic>(var7, (long)"c", var4);
         }

         var10000 = false;
         return var10000.Ü<invokedynamic>(var10000, (long)"c", var4);
      }

      var10000 = true;
      return var10000.Ü<invokedynamic>(var10000, (long)"c", var4);
   }

   private static Boolean _/* $FF was: 1*/(Set var0, long var1, 73V var3) {
      var1 = a ^ var1;
      boolean var4 = "c".Ü<invokedynamic>((long)"c", var1);

      boolean var10000;
      label32: {
         try {
            var10000 = var0.B<invokedynamic>(var0, var3.B<invokedynamic>(var3, (long)"c", var1).Ü<invokedynamic>(var3.B<invokedynamic>(var3, (long)"c", var1), (long)"c", var1), (long)"c", var1);
            if (!var4) {
               return var10000.Ü<invokedynamic>(var10000, (long)"c", var1);
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var5) {
            throw var5.Ü<invokedynamic>(var5, (long)"c", var1);
         }

         var10000 = false;
         return var10000.Ü<invokedynamic>(var10000, (long)"c", var1);
      }

      var10000 = true;
      return var10000.Ü<invokedynamic>(var10000, (long)"c", var1);
   }

   static {
      a.b99571f71427e3b19.a.init(0s.class, 281);
      a = s.a(-6283373103589703105L, -1957781442449740906L, MethodHandles.lookup().lookupClass()).a(144573012810201L);
      h = new Object[95];
      i = new String[95];
      a();
      d = new HashMap(13);
      long var11 = a ^ 139345595690295L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[9];
      int var16 = 0;
      String var17 = "W¢ÿ\u0011X»÷Ð¾úY\u0095i²>´?ìU¨dYo¤Ù9Z0ù ZÆ,B£ý7\u001fÓ\u0088\u0017l\tÛ\u009cp\u0011ä]\u0097ôï\u0002ÎÖú";
      int var18 = "W¢ÿ\u0011X»÷Ð¾úY\u0095i²>´?ìU¨dYo¤Ù9Z0ù ZÆ,B£ý7\u001fÓ\u0088\u0017l\tÛ\u009cp\u0011ä]\u0097ôï\u0002ÎÖú".length();
      int var15 = 0;

      label41:
      while(true) {
         int var10001 = var15;
         var15 += 8;
         byte[] var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var25 = var19;
         var10001 = var16++;
         long var31 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
         byte var34 = -1;

         while(true) {
            long var21 = var31;
            byte[] var23 = var13.doFinal(new byte[]{(byte)((int)(var21 >>> 56)), (byte)((int)(var21 >>> 48)), (byte)((int)(var21 >>> 40)), (byte)((int)(var21 >>> 32)), (byte)((int)(var21 >>> 24)), (byte)((int)(var21 >>> 16)), (byte)((int)(var21 >>> 8)), (byte)((int)var21)});
            long var38 = ((long)var23[0] & 255L) << 56 | ((long)var23[1] & 255L) << 48 | ((long)var23[2] & 255L) << 40 | ((long)var23[3] & 255L) << 32 | ((long)var23[4] & 255L) << 24 | ((long)var23[5] & 255L) << 16 | ((long)var23[6] & 255L) << 8 | (long)var23[7] & 255L;
            switch (var34) {
               case 0:
                  var25[var10001] = var38;
                  if (var15 >= var18) {
                     b = var19;
                     c = new Integer[9];
                     5 = true.c<invokedynamic>(19704, var11 ^ 2048554931685258656L);
                     2 = true.c<invokedynamic>(23629, var11 ^ 9121035745305421075L);
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var26 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var33 = SecretKeyFactory.getInstance("DES");
                     byte[] var36 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var36[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var26.init(2, var33.generateSecret(new DESKeySpec(var36)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "Ë¦4I~ºÆ4pLP\u009a5#-e";
                     int var5 = "Ë¦4I~ºÆ4pLP\u009a5#-e".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var37 = true;
                        var6[var10001] = var38;
                     } while(var2 < var5);

                     e = var6;
                     f = new Long[2];
                     return;
                  }
                  break;
               default:
                  var25[var10001] = var38;
                  if (var15 < var18) {
                     continue label41;
                  }

                  var17 = "\u0080bk7/ðõ\u001b\f&<\nªú{À";
                  var18 = "\u0080bk7/ðõ\u001b\f&<\nªú{À".length();
                  var15 = 0;
            }

            var10001 = var15;
            var15 += 8;
            var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
            var25 = var19;
            var10001 = var16++;
            var31 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
            var34 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int a(int var0, long var1);

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

   private static native long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = h;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      i[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Integer.TYPE;
      i[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = Boolean.TYPE;
      i[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Double.TYPE;
      i[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = Void.TYPE;
      i[22] = "c";
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
      var10000[81] = "c";
      var10000[82] = "c";
      var10000[83] = "c";
      var10000[84] = "c";
      var10000[85] = "c";
      var10000[86] = "c";
      var10000[87] = "c";
      var10000[88] = "c";
      var10000[89] = "c";
      var10000[90] = "c";
      var10000[91] = "c";
      var10000[92] = "c";
      var10000[93] = "c";
      var10000[94] = "c";
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

   private static native Field a(Class var0, String var1, Class var2);

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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'Q' && var8 != 'H' && var8 != 195 && var8 != 'e') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'B') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 220) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'Q') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'H') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 195) {
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
