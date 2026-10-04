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

public record 85(7Tq 0, long 8, 8T 1, long 2, Long 6, int 5, 7My 9) {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String sGbqAZHVJb;

   public _5/* $FF was: 85*/(7Tq param1, long param2, 8T param4, long param5, Long param7, int param8, 7My param9) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public 76t _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public 7Tq _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public 8T _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public Long _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public 7My _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(85.class, 528);
      a = s.a(3584143628409930880L, 6999922205959354440L, MethodHandles.lookup().lookupClass()).a(37313707840048L);
      e = new Object[43];
      f = new String[43];
      a();
      d = new HashMap(13);
      long var0 = a ^ 32322761973464L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0085E\u001f5â=)\u0085°kLÄ°\u0096¹\u000eÖH7Äz\u0017\u009b0³âfÏ \u001bØÇ~åøº7Bùt(M´\u0099OÁ(i\u0082\t~Ç2\rÿ\u0006Sl\u009eÓ±O³\rÁ3t\u0010,#§\u0080Ä\u000fÒ\u0007|^\f¾5(°\u001d?\u008b\u0006;o\u0017Û°#þ\u009b\u0090\u0010¤îh\u0097e9sR\u0012\u0003÷J-N\u001cÝÿðù\u0093³Ô$'\u00ad\u0018ÄØ\u00970°[o>\u0018uw<\u0015_\u0097 \u0099ñ'\u009cbºÒã\u0018ÎÛ\u000fd\u0086éî´\"%ê\u0012Ù@\u0000fÿuÉGjæ¸\u0099";
      int var8 = "\u0085E\u001f5â=)\u0085°kLÄ°\u0096¹\u000eÖH7Äz\u0017\u009b0³âfÏ \u001bØÇ~åøº7Bùt(M´\u0099OÁ(i\u0082\t~Ç2\rÿ\u0006Sl\u009eÓ±O³\rÁ3t\u0010,#§\u0080Ä\u000fÒ\u0007|^\f¾5(°\u001d?\u008b\u0006;o\u0017Û°#þ\u009b\u0090\u0010¤îh\u0097e9sR\u0012\u0003÷J-N\u001cÝÿðù\u0093³Ô$'\u00ad\u0018ÄØ\u00970°[o>\u0018uw<\u0015_\u0097 \u0099ñ'\u009cbºÒã\u0018ÎÛ\u000fd\u0086éî´\"%ê\u0012Ù@\u0000fÿuÉGjæ¸\u0099".length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while(true) {
         ++var12;
         String var13 = var6.substring(var12, var12 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "°\u009bÈ\u009a&\u0000ú²\u0014\u0006\u0000ÓÓùÃ`(\u0094\u0005ÂÖdGc\u0010ËYüÌÕÇ\u0006å1w\u0090\u0093\u009cV÷ÄÝò\u0018±$µú,\u001aß\u001a1Ëú'Ã";
                  var8 = "°\u009bÈ\u009a&\u0000ú²\u0014\u0006\u0000ÓÓùÃ`(\u0094\u0005ÂÖdGc\u0010ËYüÌÕÇ\u0006å1w\u0090\u0093\u009cV÷ÄÝò\u0018±$µú,\u001aß\u001a1Ëú'Ã".length();
                  var5 = 16;
                  var12 = -1;
            }

            ++var12;
            var13 = var6.substring(var12, var12 + var5);
            var10001 = 0;
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

   private static String a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 0 -> var10000 = 6;
               case 1 -> var10000 = 7;
               case 2 -> var10000 = 57;
               case 3 -> var10000 = 39;
               case 4 -> var10000 = 14;
               case 5 -> var10000 = 8;
               case 6 -> var10000 = 59;
               case 7 -> var10000 = 15;
               case 8 -> var10000 = 25;
               case 9 -> var10000 = 20;
               case 10 -> var10000 = 28;
               case 11 -> var10000 = 23;
               case 12 -> var10000 = 22;
               case 13 -> var10000 = 52;
               case 14 -> var10000 = 48;
               case 15 -> var10000 = 26;
               case 16 -> var10000 = 13;
               case 17 -> var10000 = 49;
               case 18 -> var10000 = 1;
               case 19 -> var10000 = 43;
               case 20 -> var10000 = 40;
               case 21 -> var10000 = 36;
               case 22 -> var10000 = 58;
               case 23 -> var10000 = 12;
               case 24 -> var10000 = 29;
               case 25 -> var10000 = 63;
               case 26 -> var10000 = 44;
               case 27 -> var10000 = 17;
               case 28 -> var10000 = 27;
               case 29 -> var10000 = 21;
               case 30 -> var10000 = 35;
               case 31 -> var10000 = 32;
               case 32 -> var10000 = 41;
               case 33 -> var10000 = 60;
               case 34 -> var10000 = 19;
               case 35 -> var10000 = 30;
               case 36 -> var10000 = 4;
               case 37 -> var10000 = 11;
               case 38 -> var10000 = 62;
               case 39 -> var10000 = 24;
               case 40 -> var10000 = 47;
               case 41 -> var10000 = 2;
               case 42 -> var10000 = 56;
               case 43 -> var10000 = 61;
               case 44 -> var10000 = 51;
               case 45 -> var10000 = 42;
               case 46 -> var10000 = 55;
               case 47 -> var10000 = 54;
               case 48 -> var10000 = 50;
               case 49 -> var10000 = 16;
               case 50 -> var10000 = 45;
               case 51 -> var10000 = 38;
               case 52 -> var10000 = 46;
               case 53 -> var10000 = 18;
               case 54 -> var10000 = 53;
               case 55 -> var10000 = 10;
               case 56 -> var10000 = 37;
               case 57 -> var10000 = 9;
               case 58 -> var10000 = 33;
               case 59 -> var10000 = 34;
               case 60 -> var10000 = 5;
               case 61 -> var10000 = 31;
               case 62 -> var10000 = 3;
               default -> var10000 = 0;
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

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Integer.TYPE;
      f[7] = "c";
      var10000[8] = "c";
      var10000[9] = Long.TYPE;
      f[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Boolean.TYPE;
      f[13] = "c";
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

   private static Field c(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
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
         if (var8 != 'D' && var8 != 249 && var8 != 'q' && var8 != 'Y') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 207) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'Z') {
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
            } else if (var8 == 249) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'q') {
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
