package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7fU {
   double 7C;
   double 3;
   double 6;
   double 5;
   double 7M;
   double 7R;
   double 4;
   double 7;
   double 7d;
   double 2;
   double 7G;
   double 7s;
   final int 0;
   final long 7x;
   long 7S;
   final List 8;
   final int 9;
   final Random 1;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String SIBWHVxgsR;

   _fU/* $FF was: 7fU*/(double var1, int var3, double var4, double var6, short var8, double var9, double var11, int var13, double var14, int var16, int var17) {
      long var18 = ((long)var3 << 32 | (long)var8 << 48 >>> 32 | (long)var13 << 48 >>> 48) ^ a;
      super();
      this.7x = "c".Ã<invokedynamic>((long)"c", var18);
      this.ø<invokedynamic>(this, "c".Ã<invokedynamic>((long)"c", var18), (long)"c", var18);
      this.8 = new ArrayList();
      this.1 = new Random();
      this.ø<invokedynamic>(this, var1, (long)"c", var18);
      this.ø<invokedynamic>(this, var1, (long)"c", var18);
      this.ø<invokedynamic>(this, var4, (long)"c", var18);
      this.ø<invokedynamic>(this, var4, (long)"c", var18);
      this.ø<invokedynamic>(this, var6, (long)"c", var18);
      this.ø<invokedynamic>(this, var6, (long)"c", var18);
      this.ø<invokedynamic>(this, var9, (long)"c", var18);
      this.ø<invokedynamic>(this, var9, (long)"c", var18);
      this.ø<invokedynamic>(this, var11, (long)"c", var18);
      this.ø<invokedynamic>(this, var11, (long)"c", var18);
      this.ø<invokedynamic>(this, var14, (long)"c", var18);
      this.ø<invokedynamic>(this, var14, (long)"c", var18);
      this.0 = var16;
      this.9 = var17;
   }

   void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   boolean _/* $FF was: 1*/(Object[] var1) {
      // $FF: Couldn't be decompiled
   }

   double _/* $FF was: 7*/(Object[] var1) {
      float var2 = (Float)var1[1];
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      return ((double)var2).Ã<invokedynamic>((double)var2, this.D<invokedynamic>(this, (long)"c", var3), this.D<invokedynamic>(this, (long)"c", var3), (long)"c", var3);
   }

   double _/* $FF was: 5*/(Object[] var1) {
      float var2 = (Float)var1[1];
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      return ((double)var2).Ã<invokedynamic>((double)var2, this.D<invokedynamic>(this, (long)"c", var3), this.D<invokedynamic>(this, (long)"c", var3), (long)"c", var3);
   }

   double _/* $FF was: 6*/(Object[] var1) {
      long var3 = (Long)var1[0];
      float var2 = (Float)var1[1];
      var3 = a ^ var3;
      return ((double)var2).Ã<invokedynamic>((double)var2, this.D<invokedynamic>(this, (long)"c", var3), this.D<invokedynamic>(this, (long)"c", var3), (long)"c", var3);
   }

   float _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      double var10002 = (double)("c".Ã<invokedynamic>((long)"c", var2) - this.D<invokedynamic>(this, (long)"c", var2));
      double var4 = "c" + "c" * (var10002 / "c").Ã<invokedynamic>(var10002 / "c", (long)"c", var2);
      return (float)var4;
   }

   float _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7fU.class, 3);
      a = s.a(960703898210109620L, -743811919246048904L, MethodHandles.lookup().lookupClass()).a(127785049186869L);
      f = new Object[49];
      g = new String[49];
      a();
      d = new HashMap(13);
      long var5 = a ^ 135035992611783L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[2];
      int var10 = 0;
      String var11 = "\u0016ÐËNÙ\u008eçðq\n¡Çã\u001dç\u001c";
      int var12 = "\u0016ÐËNÙ\u008eçðq\n¡Çã\u001dç\u001c".length();
      int var9 = 0;

      do {
         int var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         var10001 = var10++;
         long var15 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
         byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
         long var10004 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
         boolean var23 = true;
         var13[var10001] = var10004;
      } while(var9 < var12);

      b = var13;
      c = new Integer[2];
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -9035677309070528870L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var22 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      boolean var20 = true;
      e = var22;
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

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (g[var4] != null) {
         return var4;
      } else {
         Object var5 = f[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 3;
               case 1 -> var10000 = 44;
               case 2 -> var10000 = 60;
               case 3 -> var10000 = 28;
               case 4 -> var10000 = 17;
               case 5 -> var10000 = 26;
               case 6 -> var10000 = 7;
               case 7 -> var10000 = 15;
               case 8 -> var10000 = 27;
               case 9 -> var10000 = 31;
               case 10 -> var10000 = 47;
               case 11 -> var10000 = 9;
               case 12 -> var10000 = 1;
               case 13 -> var10000 = 55;
               case 14 -> var10000 = 23;
               case 15 -> var10000 = 58;
               case 16 -> var10000 = 53;
               case 17 -> var10000 = 46;
               case 18 -> var10000 = 20;
               case 19 -> var10000 = 49;
               case 20 -> var10000 = 56;
               case 21 -> var10000 = 62;
               case 22 -> var10000 = 25;
               case 23 -> var10000 = 8;
               case 24 -> var10000 = 0;
               case 25 -> var10000 = 40;
               case 26 -> var10000 = 36;
               case 27 -> var10000 = 21;
               case 28 -> var10000 = 16;
               case 29 -> var10000 = 2;
               case 30 -> var10000 = 51;
               case 31 -> var10000 = 11;
               case 32 -> var10000 = 35;
               case 33 -> var10000 = 18;
               case 34 -> var10000 = 14;
               case 35 -> var10000 = 59;
               case 36 -> var10000 = 10;
               case 37 -> var10000 = 63;
               case 38 -> var10000 = 52;
               case 39 -> var10000 = 61;
               case 40 -> var10000 = 30;
               case 41 -> var10000 = 33;
               case 42 -> var10000 = 37;
               case 43 -> var10000 = 39;
               case 44 -> var10000 = 45;
               case 45 -> var10000 = 24;
               case 46 -> var10000 = 6;
               case 47 -> var10000 = 19;
               case 48 -> var10000 = 4;
               case 49 -> var10000 = 38;
               case 50 -> var10000 = 34;
               case 51 -> var10000 = 41;
               case 52 -> var10000 = 22;
               case 53 -> var10000 = 50;
               case 54 -> var10000 = 13;
               case 55 -> var10000 = 29;
               case 56 -> var10000 = 5;
               case 57 -> var10000 = 48;
               case 58 -> var10000 = 42;
               case 59 -> var10000 = 43;
               case 60 -> var10000 = 57;
               case 61 -> var10000 = 12;
               case 62 -> var10000 = 54;
               default -> var10000 = 32;
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

            g[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = f;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Double.TYPE;
      g[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Long.TYPE;
      g[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Integer.TYPE;
      g[12] = "c";
      var10000[13] = "c";
      var10000[14] = Void.TYPE;
      g[14] = "c";
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
      var10000[47] = "c";
      var10000[48] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = f[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(g[var4]);
            f[var4] = var5;
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
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     f[var4] = var13;
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
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var26;
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
                     f[var4] = var19;
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
         if (var8 != 'D' && var8 != 248 && var8 != 162 && var8 != 'a') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 202) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 195) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'D') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 248) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 162) {
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
