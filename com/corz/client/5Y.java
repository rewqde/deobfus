package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public record 5y(double 2, int 9p, int 9m, boolean 4, boolean 7, boolean 9B, int 8, Set<Long> 9, long 3, boolean 6, boolean 0, Set<Long> 5, Set<Long> 1) {
   private static final long a;
   private static final long b;
   private static final long c;
   private static final Object[] d;
   private static final String[] e;
   // $FF: synthetic field
   private static transient String DBqkIBVQTK;

   public _y/* $FF was: 5y*/(double var1, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8, Set var9, long var10, boolean var12, boolean var13) {
      this(var1, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13, Set.of(), Set.of());
   }

   public _y/* $FF was: 5y*/(double var1, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8) {
      this(var1, var3, var4, var5, var6, var7, var8, Set.of(), 0L, true, true);
   }

   public _y/* $FF was: 5y*/(double var1, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8, Set var9, long var10, boolean var12, boolean var13, Set var14, Set var15) {
      this.2 = var1;
      this.9p = var3;
      this.9m = var4;
      this.4 = var5;
      this.7 = var6;
      this.9B = var7;
      this.8 = var8;
      this.9 = var9;
      this.3 = var10;
      this.6 = var12;
      this.0 = var13;
      this.5 = var14;
      this.1 = var15;
   }

   public 5y _/* $FF was: 8*/(Set param1) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 2*/(5w param0, 5w param1) {
      // $FF: Couldn't be decompiled
   }

   boolean _/* $FF was: 4*/(5w param1, 5w param2) {
      // $FF: Couldn't be decompiled
   }

   public 5y _/* $FF was: 6*/(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public static 5y _/* $FF was: 7*/(double param0) {
      // $FF: Couldn't be decompiled
   }

   public 5y _/* $FF was: 2*/(Set param1) {
      // $FF: Couldn't be decompiled
   }

   public 5y _/* $FF was: 4*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public 5y _/* $FF was: 8*/(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   5y _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   5y _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public 5y _/* $FF was: 5*/(Set param1) {
      // $FF: Couldn't be decompiled
   }

   boolean _/* $FF was: 1*/(5w param1) {
      // $FF: Couldn't be decompiled
   }

   5y _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public Set _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public Set _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public Set _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(5y.class, 598);
      a = s.a(-610054324436270521L, -2247917905970203793L, MethodHandles.lookup().lookupClass()).a(82034510273619L);
      d = new Object[35];
      e = new String[35];
      a();
      long var5 = a ^ 12625845601907L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var9 = -6334286668481195907L;
      byte[] var11 = var7.doFinal(new byte[]{(byte)((int)(var9 >>> 56)), (byte)((int)(var9 >>> 48)), (byte)((int)(var9 >>> 40)), (byte)((int)(var9 >>> 32)), (byte)((int)(var9 >>> 24)), (byte)((int)(var9 >>> 16)), (byte)((int)(var9 >>> 8)), (byte)((int)var9)});
      long var14 = ((long)var11[0] & 255L) << 56 | ((long)var11[1] & 255L) << 48 | ((long)var11[2] & 255L) << 40 | ((long)var11[3] & 255L) << 32 | ((long)var11[4] & 255L) << 24 | ((long)var11[5] & 255L) << 16 | ((long)var11[6] & 255L) << 8 | (long)var11[7] & 255L;
      boolean var10001 = true;
      b = var14;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var15 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var15.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 6020406666549333970L;
      byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
      long var16 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
      var10001 = true;
      c = var16;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (e[var4] != null) {
         return var4;
      } else {
         Object var5 = d[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 53;
               case 1 -> var10000 = 17;
               case 2 -> var10000 = 51;
               case 3 -> var10000 = 38;
               case 4 -> var10000 = 6;
               case 5 -> var10000 = 37;
               case 6 -> var10000 = 28;
               case 7 -> var10000 = 25;
               case 8 -> var10000 = 40;
               case 9 -> var10000 = 22;
               case 10 -> var10000 = 9;
               case 11 -> var10000 = 23;
               case 12 -> var10000 = 59;
               case 13 -> var10000 = 48;
               case 14 -> var10000 = 56;
               case 15 -> var10000 = 14;
               case 16 -> var10000 = 7;
               case 17 -> var10000 = 57;
               case 18 -> var10000 = 61;
               case 19 -> var10000 = 55;
               case 20 -> var10000 = 27;
               case 21 -> var10000 = 30;
               case 22 -> var10000 = 12;
               case 23 -> var10000 = 39;
               case 24 -> var10000 = 33;
               case 25 -> var10000 = 8;
               case 26 -> var10000 = 42;
               case 27 -> var10000 = 46;
               case 28 -> var10000 = 63;
               case 29 -> var10000 = 24;
               case 30 -> var10000 = 58;
               case 31 -> var10000 = 50;
               case 32 -> var10000 = 0;
               case 33 -> var10000 = 29;
               case 34 -> var10000 = 52;
               case 35 -> var10000 = 35;
               case 36 -> var10000 = 3;
               case 37 -> var10000 = 45;
               case 38 -> var10000 = 19;
               case 39 -> var10000 = 20;
               case 40 -> var10000 = 41;
               case 41 -> var10000 = 49;
               case 42 -> var10000 = 26;
               case 43 -> var10000 = 10;
               case 44 -> var10000 = 2;
               case 45 -> var10000 = 21;
               case 46 -> var10000 = 15;
               case 47 -> var10000 = 32;
               case 48 -> var10000 = 44;
               case 49 -> var10000 = 11;
               case 50 -> var10000 = 16;
               case 51 -> var10000 = 62;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 43;
               case 54 -> var10000 = 34;
               case 55 -> var10000 = 54;
               case 56 -> var10000 = 60;
               case 57 -> var10000 = 5;
               case 58 -> var10000 = 47;
               case 59 -> var10000 = 31;
               case 60 -> var10000 = 13;
               case 61 -> var10000 = 18;
               case 62 -> var10000 = 1;
               default -> var10000 = 36;
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

            e[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = d;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      e[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Boolean.TYPE;
      e[4] = "c";
      var10000[5] = Integer.TYPE;
      e[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Double.TYPE;
      e[8] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = d[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(e[var4]);
            d[var4] = var5;
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
      Object var5 = d[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = e[var4];
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
               d[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     d[var4] = var13;
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
