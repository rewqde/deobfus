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

public class 0q {
   public static final double 0 = (double)1.0F;
   public static final double 5 = (double)3.0F;
   public static final double 9 = (double)2.0F;
   public static final double 7 = (double)6.0F;
   public static final double 1 = (double)4.0F;
   public static final double 8 = (double)8.0F;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String mnXNKkoFDK;

   private _q/* $FF was: 0q*/() {
   }

   public static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 7cO _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(0q.class, 548);
      a = s.a(-883579509144586986L, 3606678914751241349L, MethodHandles.lookup().lookupClass()).a(231320405661856L);
      e = new Object[24];
      f = new String[24];
      a();
      d = new HashMap(13);
      long var0 = a ^ 79116660144648L;
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
      String var6 = "&±àf^W¨\u009d'\u0098$)d¡TÌÛ\u0017\u0094\u000f\u008db²3\u0010VÞtò\u0011Ú3ÔDµx\u00ad<Wk} \u000f%Ä1Ê\u001dæ'\u001f0\u0087\\·7ò>\u009b¶°Ò\u009aã.®\u0006#èÚ8¦DD\u0010Ìyûæ\u000eÂß²\nÏ²¨\u0003\u001fCl\u0010kLÚÿ\u0019í±8\u0006ÜÄôC\u0005ÔÊ";
      int var8 = "&±àf^W¨\u009d'\u0098$)d¡TÌÛ\u0017\u0094\u000f\u008db²3\u0010VÞtò\u0011Ú3ÔDµx\u00ad<Wk} \u000f%Ä1Ê\u001dæ'\u001f0\u0087\\·7ò>\u009b¶°Ò\u009aã.®\u0006#èÚ8¦DD\u0010Ìyûæ\u000eÂß²\nÏ²¨\u0003\u001fCl\u0010kLÚÿ\u0019í±8\u0006ÜÄôC\u0005ÔÊ".length();
      char var5 = 24;
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

                  var6 = "UZÒîvk\u0096WÂ\u00111¸È\u008aól\u0010:§{\u0097\u0005% âR!ÛeÎÓü{";
                  var8 = "UZÒîvk\u0096WÂ\u00111¸È\u008aól\u0010:§{\u0097\u0005% âR!ÛeÎÓü{".length();
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

   private static native String a(int var0, long var1);

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
               case 0 -> var10000 = 31;
               case 1 -> var10000 = 45;
               case 2 -> var10000 = 22;
               case 3 -> var10000 = 54;
               case 4 -> var10000 = 37;
               case 5 -> var10000 = 24;
               case 6 -> var10000 = 55;
               case 7 -> var10000 = 49;
               case 8 -> var10000 = 32;
               case 9 -> var10000 = 8;
               case 10 -> var10000 = 47;
               case 11 -> var10000 = 44;
               case 12 -> var10000 = 53;
               case 13 -> var10000 = 3;
               case 14 -> var10000 = 21;
               case 15 -> var10000 = 17;
               case 16 -> var10000 = 62;
               case 17 -> var10000 = 34;
               case 18 -> var10000 = 28;
               case 19 -> var10000 = 38;
               case 20 -> var10000 = 14;
               case 21 -> var10000 = 48;
               case 22 -> var10000 = 26;
               case 23 -> var10000 = 33;
               case 24 -> var10000 = 40;
               case 25 -> var10000 = 51;
               case 26 -> var10000 = 5;
               case 27 -> var10000 = 36;
               case 28 -> var10000 = 57;
               case 29 -> var10000 = 6;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 52;
               case 32 -> var10000 = 56;
               case 33 -> var10000 = 63;
               case 34 -> var10000 = 1;
               case 35 -> var10000 = 39;
               case 36 -> var10000 = 27;
               case 37 -> var10000 = 15;
               case 38 -> var10000 = 43;
               case 39 -> var10000 = 25;
               case 40 -> var10000 = 41;
               case 41 -> var10000 = 46;
               case 42 -> var10000 = 50;
               case 43 -> var10000 = 0;
               case 44 -> var10000 = 9;
               case 45 -> var10000 = 12;
               case 46 -> var10000 = 20;
               case 47 -> var10000 = 10;
               case 48 -> var10000 = 42;
               case 49 -> var10000 = 59;
               case 50 -> var10000 = 2;
               case 51 -> var10000 = 23;
               case 52 -> var10000 = 16;
               case 53 -> var10000 = 61;
               case 54 -> var10000 = 29;
               case 55 -> var10000 = 13;
               case 56 -> var10000 = 30;
               case 57 -> var10000 = 19;
               case 58 -> var10000 = 18;
               case 59 -> var10000 = 58;
               case 60 -> var10000 = 7;
               case 61 -> var10000 = 35;
               case 62 -> var10000 = 11;
               default -> var10000 = 60;
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

   private static native Class b(long var0, long var2);

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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != "c" && var8 != 'L' && var8 != 204 && var8 != 'r') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 201) {
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
            if (var8 == "c") {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'L') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 204) {
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
