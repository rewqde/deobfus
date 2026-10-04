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

public record 7Ob(long 7, long 1, long 9F, 6M 5, double 4, double 9, double 9M, 73i 9W, double 9H, double 6, long 9m, 2P 8) {
   public static final double 2 = 0.3;
   public static final double 9B = 0.07;
   public static final int 9Z;
   public static final int 0;
   private static final double 3 = 1.0E-9;
   private static final long a;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String GHiCgepGrI;

   public _Ob/* $FF was: 7Ob*/(long var1, long var3, long var5, 6M var7, double var8, double var10, double var12, 73i var14, double var15, double var17, long var19, 2P var21) {
      this.7 = var1;
      this.1 = var3;
      this.9F = var5;
      this.5 = var7;
      this.4 = var8;
      this.9 = var10;
      this.9M = var12;
      this.9W = var14;
      this.9H = var15;
      this.6 = var17;
      this.9m = var19;
      this.8 = var21;
   }

   public static 7Ob _/* $FF was: 5*/(long param0, long param2, long param4, 6M param6, double param7, double param9, double param11, 73i param13, double param14, long param16) {
      // $FF: Couldn't be decompiled
   }

   public static 7Ob _/* $FF was: 1*/(long param0, long param2, long param4, 6M param6, double param7, double param9, double param11, 73i param13, double param14, long param16, 2P param18) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 0*/(long param0, double param2, 2P param4) {
      // $FF: Couldn't be decompiled
   }

   public static double _/* $FF was: 8*/(double param0, double param2, double param4, 73i param6) {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 4*/(double param1, double param3, double param5) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(double param1, double param3, double param5) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 6*/(double param1, double param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(double param1, double param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(double param1, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 5*/(double param0, double param2, double param4, int param6, int param7, int param8, double param9) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 8*/(double param1, double param3, double param5, String param7) {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public 6M _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public 73i _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public 2P _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7Ob.class, 752);
      a = s.a(7555017732704720984L, -6521788369812840639L, MethodHandles.lookup().lookupClass()).a(227150771057168L);
      f = new Object[58];
      g = new String[58];
      a();
      long var11 = a ^ 2292663996639L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("/\u0092\u0006\u009düåÁØ#æ\u009fPE,\u0015±[v\u0002%¢1Auíö\\\u008f\u0082)D\"?[w,\u001cð¾`ªp\\DLâåg\u00adÓøv:vióÿ\u0082¹åÙYZ\u008a\u008e\u0019 Û± è(Ì4ø»7ÕâmÿL[ß\"6\u001c\u001dw\u001cÃÝ\u008bNóøá;5\u0001\u001c2}õ*\u007f8nIûÚ¦5u\u0016#Þ@'\u0098½\n\u0093ï\u0007\u0089_\u009fb:¶4qT7oJÁ/Õ\u008c/[Úó\u009a°¦t\u000bi1á\u008fo>oV¶Íè\u0092\u000f\u009c\u008a\u001fÇ\u0099FUo·ô\u0096GS¬éw\f\u0013\u0089zP\fØsÓç¤\u0004\\".getBytes("ISO-8859-1"));
      String var22 = a(var15).intern();
      int var10001 = -1;
      b = var22;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var23 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var23.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[14];
      int var3 = 0;
      String var4 = "\u0084¶9Éã\u0011¿\u001bâgÒpß\u0014\\#ÇE\u00149uH\u0088\u001c\"p\u001fÝê¦0ìÄØª8\u0004GZèæRÎË\u0002N>±3C¢\u008cpyï/*¼\u0006ÚLz[¤i1ôbÙ\u0092q6\u0005¸G¢.\u0085\u0018¯\u000f§\u0088+0ã\u0088\u0093Ç¨\u001bú¬\u00adª¼";
      int var5 = "\u0084¶9Éã\u0011¿\u001bâgÒpß\u0014\\#ÇE\u00149uH\u0088\u001c\"p\u001fÝê¦0ìÄØª8\u0004GZèæRÎË\u0002N>±3C¢\u008cpyï/*¼\u0006ÚLz[¤i1ôbÙ\u0092q6\u0005¸G¢.\u0085\u0018¯\u000f§\u0088+0ã\u0088\u0093Ç¨\u001bú¬\u00adª¼".length();
      int var2 = 0;

      label29:
      while(true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var27 = -1;

         while(true) {
            long var8 = var24;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var29 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[14];
                     9Z = true.c<invokedynamic>(14667, var11 ^ 1147329596996885030L);
                     0 = true.c<invokedynamic>(32568, var11 ^ 421079426869648468L);
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "ôÖ\\\u009fßAª9v×<bþÏ_¨";
                  var5 = "ôÖ\\\u009fßAª9v×<bþÏ_¨".length();
                  var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var27 = 0;
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
               case 0 -> var10000 = 59;
               case 1 -> var10000 = 22;
               case 2 -> var10000 = 30;
               case 3 -> var10000 = 15;
               case 4 -> var10000 = 57;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 58;
               case 7 -> var10000 = 63;
               case 8 -> var10000 = 47;
               case 9 -> var10000 = 48;
               case 10 -> var10000 = 7;
               case 11 -> var10000 = 26;
               case 12 -> var10000 = 61;
               case 13 -> var10000 = 0;
               case 14 -> var10000 = 31;
               case 15 -> var10000 = 40;
               case 16 -> var10000 = 54;
               case 17 -> var10000 = 51;
               case 18 -> var10000 = 27;
               case 19 -> var10000 = 53;
               case 20 -> var10000 = 13;
               case 21 -> var10000 = 41;
               case 22 -> var10000 = 12;
               case 23 -> var10000 = 28;
               case 24 -> var10000 = 33;
               case 25 -> var10000 = 42;
               case 26 -> var10000 = 29;
               case 27 -> var10000 = 35;
               case 28 -> var10000 = 39;
               case 29 -> var10000 = 50;
               case 30 -> var10000 = 45;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 1;
               case 33 -> var10000 = 32;
               case 34 -> var10000 = 46;
               case 35 -> var10000 = 20;
               case 36 -> var10000 = 37;
               case 37 -> var10000 = 25;
               case 38 -> var10000 = 52;
               case 39 -> var10000 = 55;
               case 40 -> var10000 = 14;
               case 41 -> var10000 = 34;
               case 42 -> var10000 = 49;
               case 43 -> var10000 = 18;
               case 44 -> var10000 = 16;
               case 45 -> var10000 = 23;
               case 46 -> var10000 = 17;
               case 47 -> var10000 = 44;
               case 48 -> var10000 = 56;
               case 49 -> var10000 = 43;
               case 50 -> var10000 = 38;
               case 51 -> var10000 = 3;
               case 52 -> var10000 = 10;
               case 53 -> var10000 = 4;
               case 54 -> var10000 = 6;
               case 55 -> var10000 = 60;
               case 56 -> var10000 = 2;
               case 57 -> var10000 = 24;
               case 58 -> var10000 = 19;
               case 59 -> var10000 = 36;
               case 60 -> var10000 = 11;
               case 61 -> var10000 = 62;
               case 62 -> var10000 = 21;
               default -> var10000 = 9;
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
      var10000[2] = Long.TYPE;
      g[2] = "c";
      var10000[3] = Double.TYPE;
      g[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Boolean.TYPE;
      g[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Integer.TYPE;
      g[16] = "c";
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
      var10000[49] = "c";
      var10000[50] = "c";
      var10000[51] = "c";
      var10000[52] = "c";
      var10000[53] = "c";
      var10000[54] = "c";
      var10000[55] = "c";
      var10000[56] = "c";
      var10000[57] = "c";
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

   private static Field a(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static native Field b(Class var0, String var1, Class var2);

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
         if (var8 != 'i' && var8 != 'l' && var8 != 'G' && var8 != 193) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 't') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'I') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'i') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'l') {
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
