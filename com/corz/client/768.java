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
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_310;

public class 768 {
   private final class_310 6;
   private final Object 32;
   private 7YQ 3d;
   private int 3E;
   private class_1792 2;
   private int 3I;
   private int 8;
   private final 7YD 3T;
   private class_1799 3g;
   private class_1799 3z;
   private int 1;
   public int 4;
   public int 3X;
   public int 3l;
   private class_1792 9;
   private boolean 0;
   private boolean 3R;
   private boolean 5;
   private int 3Q;
   private 76x 7;
   private static final int 3U;
   private static final int 3o;
   private static final int 3;
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
   private static transient String THqKoOfnle;

   public _68/* $FF was: 768*/(byte param1, long param2, class_310 param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ç<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ç<invokedynamic>(this, (long)"c", var2);
   }

   public class_1792 _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ç<invokedynamic>(this, (long)"c", var2);
   }

   public 76x _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ç<invokedynamic>(this, (long)"c", var2);
   }

   public 9e _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 9e _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 6p _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 6p _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(768.class, 361);
      a = s.a(-4818826982558817217L, -7649179701485652769L, MethodHandles.lookup().lookupClass()).a(255780488379713L);
      h = new Object[154];
      i = new String[154];
      a();
      d = new HashMap(13);
      long var11 = a ^ 30247544125221L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[18];
      int var16 = 0;
      String var17 = "Onîy\u0090²ÚBî}\u0002T7\u0003m»eÄÞ\u008a¤ÌÄn\fj\u0000NTé\u0013^hü¯\tÉvU¿\u0012M©(÷¨`w\u001bDM\u0085\u008f'\u000fË,\u0091i\u0000ÞoÚ¢+j\u0017Áßé&Ö\u007f\u008fJë\u009c\u0086Ó\u0095Alf7²Qìi¥Oõ@\u0012»Û)\u0011êTÎ«'¬~Å\u0010ïo\u001bó0;Ðñ}a\u0012\u000e¬\u000b\u008f\u001cè /wÈ\u0001";
      int var18 = "Onîy\u0090²ÚBî}\u0002T7\u0003m»eÄÞ\u008a¤ÌÄn\fj\u0000NTé\u0013^hü¯\tÉvU¿\u0012M©(÷¨`w\u001bDM\u0085\u008f'\u000fË,\u0091i\u0000ÞoÚ¢+j\u0017Áßé&Ö\u007f\u008fJë\u009c\u0086Ó\u0095Alf7²Qìi¥Oõ@\u0012»Û)\u0011êTÎ«'¬~Å\u0010ïo\u001bó0;Ðñ}a\u0012\u000e¬\u000b\u008f\u001cè /wÈ\u0001".length();
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
                     c = new Integer[18];
                     3U = true.m<invokedynamic>(16421, var11 ^ 1826311242786451041L);
                     3o = true.m<invokedynamic>(16290, var11 ^ 3598578222592741860L);
                     3 = true.m<invokedynamic>(30777, var11 ^ 9150101419855976060L);
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
                     String var4 = "\u0082(\u008a-ÔM\u001dì²\u000b¸úT\u0012D¤";
                     int var5 = "\u0082(\u008a-ÔM\u001dì²\u000b¸úT\u0012D¤".length();
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

                  var17 = "³\u0018qè\u007frö\u001aîµ$Q\u0085\b\u000f\u0088";
                  var18 = "³\u0018qè\u007frö\u001aîµ$Q\u0085\b\u000f\u0088".length();
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

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = h;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      i[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      i[6] = "c";
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
      var10000[18] = Void.TYPE;
      i[18] = "c";
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
      var10000[39] = Long.TYPE;
      i[39] = "c";
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
      var10000[95] = "c";
      var10000[96] = "c";
      var10000[97] = "c";
      var10000[98] = "c";
      var10000[99] = "c";
      var10000[100] = "c";
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
      var10000[105] = "c";
      var10000[106] = "c";
      var10000[107] = "c";
      var10000[108] = "c";
      var10000[109] = "c";
      var10000[110] = "c";
      var10000[111] = "c";
      var10000[112] = "c";
      var10000[113] = "c";
      var10000[114] = "c";
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
      var10000[136] = "c";
      var10000[137] = "c";
      var10000[138] = "c";
      var10000[139] = "c";
      var10000[140] = "c";
      var10000[141] = "c";
      var10000[142] = "c";
      var10000[143] = "c";
      var10000[144] = "c";
      var10000[145] = "c";
      var10000[146] = "c";
      var10000[147] = "c";
      var10000[148] = "c";
      var10000[149] = "c";
      var10000[150] = "c";
      var10000[151] = "c";
      var10000[152] = "c";
      var10000[153] = "c";
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
