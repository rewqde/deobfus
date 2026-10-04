package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum 6_ {
   public static final 6_ 8;
   public static final 6_ 6;
   public static final 6_ 5;
   public static final 6_ 4;
   public static final 6_ 3;
   public static final 6_ 1;
   private static final 6_[] 7;
   private static final long a;
   private static final long b;
   private static final Object[] c;
   private static final String[] d;

   private static 6_[] _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(6_.class, 740);
      a = s.a(-5553692935506881756L, -4465049712329935756L, MethodHandles.lookup().lookupClass()).a(35235400129670L);
      long var14 = a ^ 122864906833690L;
      c = new Object[16];
      d = new String[16];
      a();
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "ó*F?Ú\u0010ÁnÊ£g\u00ad\u0012HùN\u0018\u0013À6{\u001dþ\u0006ÿÓÏ_ç\u0001\u009d\u008cV\u001f«Úù\u0017ªæ\"\u0010LÂEGä=³ªÜ\nÌû\u0081ÛWv\u0010ªoÈ\u0086\u009cg\u007f^$üÈ\u001a\u0090OÂ·";
      int var12 = "ó*F?Ú\u0010ÁnÊ£g\u00ad\u0012HùN\u0018\u0013À6{\u001dþ\u0006ÿÓÏ_ç\u0001\u009d\u008cV\u001f«Úù\u0017ªæ\"\u0010LÂEGä=³ªÜ\nÌû\u0081ÛWv\u0010ªoÈ\u0086\u009cg\u007f^$üÈ\u001a\u0090OÂ·".length();
      char var9 = 16;
      int var17 = -1;

      label37:
      while(true) {
         ++var17;
         String var18 = var10.substring(var17, var17 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var5[var11++] = var26;
                  if ((var17 += var9) >= var12) {
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var28 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var28.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -2178444908521998724L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var29 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     b = var29;
                     8 = new 6_(var5[3], 0);
                     6 = new 6_(var5[4], 1);
                     5 = new 6_(var5[0], 2);
                     4 = new 6_(var5[1], 3);
                     3 = new 6_(var5[2], 4);
                     1 = new 6_(var5[5], 5);
                     7 = -3367783821490391079L.¤<invokedynamic>(-3367783821490391079L, var14);
                     return;
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var5[var11++] = var26;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label37;
                  }

                  var10 = "JÝÞ\u009e\u001av\tD\bB-ËC¯î¬\u0005";
                  var12 = "JÝÞ\u009e\u001av\tD\bB-ËC¯î¬\u0005".length();
                  var9 = '\b';
                  var17 = -1;
            }

            ++var17;
            var18 = var10.substring(var17, var17 + var9);
            var10001 = 0;
         }
      }
   }

   private static native String a(byte[] var0);

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (d[var4] != null) {
         return var4;
      } else {
         Object var5 = c[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 39;
               case 1 -> var10000 = 63;
               case 2 -> var10000 = 26;
               case 3 -> var10000 = 47;
               case 4 -> var10000 = 8;
               case 5 -> var10000 = 15;
               case 6 -> var10000 = 22;
               case 7 -> var10000 = 17;
               case 8 -> var10000 = 37;
               case 9 -> var10000 = 60;
               case 10 -> var10000 = 35;
               case 11 -> var10000 = 3;
               case 12 -> var10000 = 61;
               case 13 -> var10000 = 7;
               case 14 -> var10000 = 49;
               case 15 -> var10000 = 24;
               case 16 -> var10000 = 12;
               case 17 -> var10000 = 44;
               case 18 -> var10000 = 56;
               case 19 -> var10000 = 4;
               case 20 -> var10000 = 59;
               case 21 -> var10000 = 21;
               case 22 -> var10000 = 48;
               case 23 -> var10000 = 54;
               case 24 -> var10000 = 41;
               case 25 -> var10000 = 13;
               case 26 -> var10000 = 29;
               case 27 -> var10000 = 33;
               case 28 -> var10000 = 9;
               case 29 -> var10000 = 42;
               case 30 -> var10000 = 43;
               case 31 -> var10000 = 36;
               case 32 -> var10000 = 31;
               case 33 -> var10000 = 58;
               case 34 -> var10000 = 57;
               case 35 -> var10000 = 32;
               case 36 -> var10000 = 34;
               case 37 -> var10000 = 1;
               case 38 -> var10000 = 14;
               case 39 -> var10000 = 30;
               case 40 -> var10000 = 10;
               case 41 -> var10000 = 62;
               case 42 -> var10000 = 51;
               case 43 -> var10000 = 20;
               case 44 -> var10000 = 38;
               case 45 -> var10000 = 52;
               case 46 -> var10000 = 53;
               case 47 -> var10000 = 50;
               case 48 -> var10000 = 23;
               case 49 -> var10000 = 5;
               case 50 -> var10000 = 40;
               case 51 -> var10000 = 25;
               case 52 -> var10000 = 46;
               case 53 -> var10000 = 16;
               case 54 -> var10000 = 6;
               case 55 -> var10000 = 0;
               case 56 -> var10000 = 11;
               case 57 -> var10000 = 28;
               case 58 -> var10000 = 19;
               case 59 -> var10000 = 45;
               case 60 -> var10000 = 27;
               case 61 -> var10000 = 18;
               case 62 -> var10000 = 2;
               default -> var10000 = 55;
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

            d[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static native void a();

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = c[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(d[var4]);
            c[var4] = var5;
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
         if (var8 != 'd' && var8 != 224 && var8 != 'w' && var8 != 't') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 229) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 164) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'd') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 224) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'w') {
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
