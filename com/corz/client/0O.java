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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 0o {
   private final Map 6 = new HashMap();
   private final Map 3 = new HashMap();
   private final Map 0 = new HashMap();
   private static final long a;
   private static final long[] b;
   private static final Long[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String WlFRwukYBx;

   public static long _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public Set _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      Map var10000 = this.ò<invokedynamic>(this, (long)"c", var4);
      Integer var7 = (Integer)var10000.ð<invokedynamic>(var10000, (Long)var1[0].Ü<invokedynamic>((Long)var1[0], (long)"c", var4), true.Ü<invokedynamic>(1, (long)"c", var4), Integer::sum, (long)"c", var4);
      return var7.ð<invokedynamic>(var7, (long)"c", var4);
   }

   public int _/* $FF was: 1*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      Map var10000 = this.ò<invokedynamic>(this, (long)"c", var4);
      Integer var7 = (Integer)var10000.ð<invokedynamic>(var10000, (Long)var1[0].Ü<invokedynamic>((Long)var1[0], (long)"c", var4), false.Ü<invokedynamic>(0, (long)"c", var4), (long)"c", var4);
      return var7.ð<invokedynamic>(var7, (long)"c", var4);
   }

   public void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.ò<invokedynamic>(this, (long)"c", var2);
      return var10000.ð<invokedynamic>(var10000, (long)"c", var2);
   }

   public int _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.ò<invokedynamic>(this, (long)"c", var2);
      return var10000.ð<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ò<invokedynamic>(this, (long)"c", var2).ð<invokedynamic>(this.ò<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      this.ò<invokedynamic>(this, (long)"c", var2).ð<invokedynamic>(this.ò<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      this.ò<invokedynamic>(this, (long)"c", var2).ð<invokedynamic>(this.ò<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(0o.class, 660);
      a = s.a(-8224352522112196625L, -4556015945177711485L, MethodHandles.lookup().lookupClass()).a(47600775395315L);
      e = new Object[52];
      f = new String[52];
      a();
      d = new HashMap(13);
      long var0 = a ^ 105027823750283L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "38æÕ\u000býú\u0094\u0016\u0085¹bÇx´v³\u0002ib5\r\u0001ª";
      int var7 = "38æÕ\u000býú\u0094\u0016\u0085¹bÇx´v³\u0002ib5\r\u0001ª".length();
      int var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
         long var10004 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
         boolean var14 = true;
         var8[var10001] = var10004;
      } while(var4 < var7);

      b = var8;
      c = new Long[3];
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static long a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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
               case 0 -> var10000 = 26;
               case 1 -> var10000 = 60;
               case 2 -> var10000 = 16;
               case 3 -> var10000 = 9;
               case 4 -> var10000 = 62;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 36;
               case 7 -> var10000 = 0;
               case 8 -> var10000 = 28;
               case 9 -> var10000 = 50;
               case 10 -> var10000 = 45;
               case 11 -> var10000 = 35;
               case 12 -> var10000 = 47;
               case 13 -> var10000 = 19;
               case 14 -> var10000 = 31;
               case 15 -> var10000 = 52;
               case 16 -> var10000 = 10;
               case 17 -> var10000 = 2;
               case 18 -> var10000 = 55;
               case 19 -> var10000 = 23;
               case 20 -> var10000 = 11;
               case 21 -> var10000 = 33;
               case 22 -> var10000 = 21;
               case 23 -> var10000 = 32;
               case 24 -> var10000 = 24;
               case 25 -> var10000 = 43;
               case 26 -> var10000 = 29;
               case 27 -> var10000 = 41;
               case 28 -> var10000 = 48;
               case 29 -> var10000 = 7;
               case 30 -> var10000 = 13;
               case 31 -> var10000 = 53;
               case 32 -> var10000 = 51;
               case 33 -> var10000 = 42;
               case 34 -> var10000 = 20;
               case 35 -> var10000 = 17;
               case 36 -> var10000 = 15;
               case 37 -> var10000 = 37;
               case 38 -> var10000 = 27;
               case 39 -> var10000 = 34;
               case 40 -> var10000 = 6;
               case 41 -> var10000 = 39;
               case 42 -> var10000 = 57;
               case 43 -> var10000 = 12;
               case 44 -> var10000 = 1;
               case 45 -> var10000 = 49;
               case 46 -> var10000 = 44;
               case 47 -> var10000 = 59;
               case 48 -> var10000 = 22;
               case 49 -> var10000 = 63;
               case 50 -> var10000 = 3;
               case 51 -> var10000 = 46;
               case 52 -> var10000 = 18;
               case 53 -> var10000 = 54;
               case 54 -> var10000 = 38;
               case 55 -> var10000 = 40;
               case 56 -> var10000 = 61;
               case 57 -> var10000 = 25;
               case 58 -> var10000 = 30;
               case 59 -> var10000 = 4;
               case 60 -> var10000 = 58;
               case 61 -> var10000 = 5;
               case 62 -> var10000 = 56;
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
         if (var8 != 242 && var8 != 'W' && var8 != 221 && var8 != 'S') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 240) {
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
            if (var8 == 242) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'W') {
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
