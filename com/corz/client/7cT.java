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
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public record 7ct(76D 9, long 1, long 5, long 8, int 3, long 4, long 6, long 7, long[] 2, String 0) {
   private static final long a;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;
   private static final Object[] i;
   private static final String[] j;
   // $FF: synthetic field
   private static transient String WWihHSPhnf;

   public _ct/* $FF was: 7ct*/(76D param1, long param2, long param4, long param6, int param8, long param9, long param11, long param13, long[] param15, String param16) {
      // $FF: Couldn't be decompiled
   }

   public long[] _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 9*/(long[] param0, LongUnaryOperator param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(LongUnaryOperator param1) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 5*/(long param0, long param2) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 2*/(long param0, long param2, int param4) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public 76D _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7ct.class, 199);
      a = s.a(-3501237330710282541L, -3134464959471087939L, MethodHandles.lookup().lookupClass()).a(14105285940518L);
      i = new Object[38];
      j = new String[38];
      a();
      long var22 = a ^ 22793908658335L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var26 = var24.doFinal("\n\u0087àgtÊ\u0019ÁÀ¡ßZq\u0082\\¨6xý3$ß\u0015\u0092Ç:Hª¤¦K-".getBytes("ISO-8859-1"));
      String var36 = a(var26).intern();
      int var10001 = -1;
      b = var36;
      e = new HashMap(13);
      Cipher var11;
      var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var37 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
      }

      var10000.init(2, var37.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var17 = new long[2];
      int var14 = 0;
      String var15 = "Ä~»\u0086ä\u001f:Á]ÇÖ\u0094ã qd";
      int var16 = "Ä~»\u0086ä\u001f:Á]ÇÖ\u0094ã qd".length();
      int var13 = 0;

      do {
         var10001 = var13;
         var13 += 8;
         byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
         var10001 = var14++;
         long var19 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
         byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
         long var10004 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
         boolean var42 = true;
         var17[var10001] = var10004;
      } while(var13 < var16);

      c = var17;
      d = new Integer[2];
      h = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var37 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
      }

      var10000.init(2, var37.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "7»÷\u009få\u0082Í\u0082n2\u0080ÃÝp\u0091Å«\u008d\u0006\u001b\u0090\u00166æÁkî!k=@ ¹\u008bMJ\u0084.¼\u0014\u000fð\u009f\u0019\u000b«ß÷";
      int var5 = "7»÷\u009få\u0082Í\u0082n2\u0080ÃÝp\u0091Å«\u008d\u0006\u001b\u0090\u00166æÁkî!k=@ ¹\u008bMJ\u0084.¼\u0014\u000fð\u009f\u0019\u000b«ß÷".length();
      int var2 = 0;

      label37:
      while(true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var30 = var6;
         var10001 = var3++;
         long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var44 = -1;

         while(true) {
            long var8 = var39;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var47 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var44) {
               case 0:
                  var30[var10001] = var47;
                  if (var2 >= var5) {
                     f = var6;
                     g = new Long[8];
                     return;
                  }
                  break;
               default:
                  var30[var10001] = var47;
                  if (var2 < var5) {
                     continue label37;
                  }

                  var4 = "|pS]W¸\u0084\u0096\u001e\u0082ýÂu\u0019\u0001\u0082";
                  var5 = "|pS]W¸\u0084\u0096\u001e\u0082ýÂu\u0019\u0001\u0082".length();
                  var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var30 = var6;
            var10001 = var3++;
            var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var44 = 0;
         }
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

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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

   private static long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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
      if (j[var4] != null) {
         return var4;
      } else {
         Object var5 = i[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 38;
               case 1 -> var10000 = 9;
               case 2 -> var10000 = 46;
               case 3 -> var10000 = 35;
               case 4 -> var10000 = 11;
               case 5 -> var10000 = 47;
               case 6 -> var10000 = 40;
               case 7 -> var10000 = 41;
               case 8 -> var10000 = 0;
               case 9 -> var10000 = 29;
               case 10 -> var10000 = 8;
               case 11 -> var10000 = 63;
               case 12 -> var10000 = 24;
               case 13 -> var10000 = 5;
               case 14 -> var10000 = 21;
               case 15 -> var10000 = 2;
               case 16 -> var10000 = 27;
               case 17 -> var10000 = 49;
               case 18 -> var10000 = 10;
               case 19 -> var10000 = 61;
               case 20 -> var10000 = 43;
               case 21 -> var10000 = 25;
               case 22 -> var10000 = 15;
               case 23 -> var10000 = 26;
               case 24 -> var10000 = 19;
               case 25 -> var10000 = 28;
               case 26 -> var10000 = 55;
               case 27 -> var10000 = 39;
               case 28 -> var10000 = 53;
               case 29 -> var10000 = 18;
               case 30 -> var10000 = 32;
               case 31 -> var10000 = 57;
               case 32 -> var10000 = 37;
               case 33 -> var10000 = 50;
               case 34 -> var10000 = 6;
               case 35 -> var10000 = 3;
               case 36 -> var10000 = 34;
               case 37 -> var10000 = 31;
               case 38 -> var10000 = 30;
               case 39 -> var10000 = 44;
               case 40 -> var10000 = 56;
               case 41 -> var10000 = 45;
               case 42 -> var10000 = 58;
               case 43 -> var10000 = 14;
               case 44 -> var10000 = 4;
               case 45 -> var10000 = 16;
               case 46 -> var10000 = 51;
               case 47 -> var10000 = 20;
               case 48 -> var10000 = 1;
               case 49 -> var10000 = 60;
               case 50 -> var10000 = 36;
               case 51 -> var10000 = 48;
               case 52 -> var10000 = 7;
               case 53 -> var10000 = 59;
               case 54 -> var10000 = 23;
               case 55 -> var10000 = 54;
               case 56 -> var10000 = 17;
               case 57 -> var10000 = 33;
               case 58 -> var10000 = 62;
               case 59 -> var10000 = 42;
               case 60 -> var10000 = 52;
               case 61 -> var10000 = 12;
               case 62 -> var10000 = 22;
               default -> var10000 = 13;
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

            j[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = i;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Long.TYPE;
      j[3] = "c";
      var10000[4] = "c";
      var10000[5] = Integer.TYPE;
      j[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Boolean.TYPE;
      j[13] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = i[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(j[var4]);
            i[var4] = var5;
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
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     i[var4] = var13;
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

   private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);
}
