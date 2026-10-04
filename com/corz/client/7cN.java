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

public enum 7cn {
   public static final 7cn 6;
   public static final 7cn 4;
   public static final 7cn 5;
   public static final 7cn 0Y;
   public static final 7cn 0E;
   public static final 7cn 3;
   public static final 7cn 0;
   public static final 7cn 9;
   public static final 7cn 0c;
   public static final 7cn 2;
   public static final 7cn 7;
   public static final 7cn 0m;
   public static final 7cn 0q;
   public static final 7cn 8;
   private static final 7cn[] 1;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 7cn[] _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7cn.class, 832);
      a = s.a(-2906891391320119315L, -2694989729685690371L, MethodHandles.lookup().lookupClass()).a(153335777785744L);
      long var20 = a ^ 10486267542621L;
      e = new Object[24];
      f = new String[24];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[14];
      int var17 = 0;
      String var16 = "ó\u008b\u0090À\u0090\u001c£\u000e\u0010\u0083H»/Á\u0011Ã\u0098|A¿M\u0099ö\u0097\u0087\u0010ü\u009dó'.\u0019op¼Q¸eA\u001fÞH\b¶ÞGë%:\u0010\u008d\bWë\u000bxÏ¥U\u001f\bq\u0018§ià¼W\u001f\bpßlÛYgé\u0097\b¡e\u0013xæ\u0002.C\bé\u0093¸T\fÝ~¦\b\"\u0098µ\u001aqYvF\bþ£ã\f¡)4á\u0010×xóùmI\u001f\u0014\u0097 µã5iÜä";
      int var18 = "ó\u008b\u0090À\u0090\u001c£\u000e\u0010\u0083H»/Á\u0011Ã\u0098|A¿M\u0099ö\u0097\u0087\u0010ü\u009dó'.\u0019op¼Q¸eA\u001fÞH\b¶ÞGë%:\u0010\u008d\bWë\u000bxÏ¥U\u001f\bq\u0018§ià¼W\u001f\bpßlÛYgé\u0097\b¡e\u0013xæ\u0002.C\bé\u0093¸T\fÝ~¦\b\"\u0098µ\u001aqYvF\bþ£ã\f¡)4á\u0010×xóùmI\u001f\u0014\u0097 µã5iÜä".length();
      char var15 = '\b';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var36;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[17];
                     int var3 = 0;
                     String var4 = "\u000b·Ø\u0007¨%\n\u0097¼::¡ùí0ÄR,\fOÔ\u0098_\u009c\u000f\nð\u0010.K\bY1ß\u008b^OK\u0082UPlÀÕ\u00016\rÔ¶\u0012h\u0011U\u008b\u0095Î\u0015\t\u0000*\u0093ã^\u0080¼\u007f\u0092ñK\u0098SÎ\u0095e¥ðày\u0016Ð4øÄ×\u0012\u0081\u009f®'íÆX\u0010\u008aîlQ\u008d\u000f\bÆÒ\u00837)i\u001fY¿Mø\u0012¸;£])Üx\"";
                     int var5 = "\u000b·Ø\u0007¨%\n\u0097¼::¡ùí0ÄR,\fOÔ\u0098_\u009c\u000f\nð\u0010.K\bY1ß\u008b^OK\u0082UPlÀÕ\u00016\rÔ¶\u0012h\u0011U\u008b\u0095Î\u0015\t\u0000*\u0093ã^\u0080¼\u007f\u0092ñK\u0098SÎ\u0095e¥ðày\u0016Ð4øÄ×\u0012\u0081\u009f®'íÆX\u0010\u008aîlQ\u008d\u000f\bÆÒ\u00837)i\u001fY¿Mø\u0012¸;£])Üx\"".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while(true) {
                           long var8 = var39;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var45 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    b = var6;
                                    c = new Integer[17];
                                    6 = new 7cn(var11[6], 0);
                                    4 = new 7cn(var11[4], 1);
                                    5 = new 7cn(var11[1], 2);
                                    0Y = new 7cn(var11[0], 3);
                                    0E = new 7cn(var11[2], 4);
                                    3 = new 7cn(var11[7], 5);
                                    0 = new 7cn(var11[11], true.s<invokedynamic>(24184, 692318007069915701L ^ var20));
                                    9 = new 7cn(var11[13], true.s<invokedynamic>(13975, 802528341996720853L ^ var20));
                                    0c = new 7cn(var11[8], true.s<invokedynamic>(404, 1524096741868889554L ^ var20));
                                    2 = new 7cn(var11[3], true.s<invokedynamic>(30529, 8756920598251410178L ^ var20));
                                    7 = new 7cn(var11[12], true.s<invokedynamic>(20166, 8702489556629629570L ^ var20));
                                    0m = new 7cn(var11[10], true.s<invokedynamic>(16067, 165598233994943115L ^ var20));
                                    0q = new 7cn(var11[5], true.s<invokedynamic>(3917, 7940250393686043399L ^ var20));
                                    8 = new 7cn(var11[9], true.s<invokedynamic>(27964, 5519808959052581237L ^ var20));
                                    1 = 1646656640283919755L.ñ<invokedynamic>(1646656640283919755L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "åX-4° \b\n\u000b¹\u0083GÂ\u007f\u0018[";
                                 var5 = "åX-4° \b\n\u000b¹\u0083GÂ\u007f\u0018[".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var36;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label54;
                  }

                  var16 = "\u0014¹\u0004ÀNKØç\b\u008f)ò\u007fMº÷±";
                  var18 = "\u0014¹\u0004ÀNKØç\b\u008f)ò\u007fMº÷±".length();
                  var15 = '\b';
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
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
               case 0 -> var10000 = 30;
               case 1 -> var10000 = 32;
               case 2 -> var10000 = 55;
               case 3 -> var10000 = 25;
               case 4 -> var10000 = 2;
               case 5 -> var10000 = 33;
               case 6 -> var10000 = 42;
               case 7 -> var10000 = 13;
               case 8 -> var10000 = 48;
               case 9 -> var10000 = 61;
               case 10 -> var10000 = 10;
               case 11 -> var10000 = 35;
               case 12 -> var10000 = 16;
               case 13 -> var10000 = 63;
               case 14 -> var10000 = 11;
               case 15 -> var10000 = 26;
               case 16 -> var10000 = 24;
               case 17 -> var10000 = 17;
               case 18 -> var10000 = 4;
               case 19 -> var10000 = 46;
               case 20 -> var10000 = 47;
               case 21 -> var10000 = 12;
               case 22 -> var10000 = 51;
               case 23 -> var10000 = 59;
               case 24 -> var10000 = 31;
               case 25 -> var10000 = 8;
               case 26 -> var10000 = 6;
               case 27 -> var10000 = 5;
               case 28 -> var10000 = 40;
               case 29 -> var10000 = 50;
               case 30 -> var10000 = 22;
               case 31 -> var10000 = 28;
               case 32 -> var10000 = 52;
               case 33 -> var10000 = 49;
               case 34 -> var10000 = 27;
               case 35 -> var10000 = 53;
               case 36 -> var10000 = 19;
               case 37 -> var10000 = 7;
               case 38 -> var10000 = 23;
               case 39 -> var10000 = 34;
               case 40 -> var10000 = 45;
               case 41 -> var10000 = 18;
               case 42 -> var10000 = 60;
               case 43 -> var10000 = 62;
               case 44 -> var10000 = 54;
               case 45 -> var10000 = 38;
               case 46 -> var10000 = 29;
               case 47 -> var10000 = 56;
               case 48 -> var10000 = 41;
               case 49 -> var10000 = 39;
               case 50 -> var10000 = 0;
               case 51 -> var10000 = 9;
               case 52 -> var10000 = 20;
               case 53 -> var10000 = 44;
               case 54 -> var10000 = 43;
               case 55 -> var10000 = 3;
               case 56 -> var10000 = 14;
               case 57 -> var10000 = 1;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 37;
               case 60 -> var10000 = 21;
               case 61 -> var10000 = 57;
               case 62 -> var10000 = 36;
               default -> var10000 = 15;
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

   private static native Field a(Class var0, String var1, Class var2);

   private static native Field b(Class var0, String var1, Class var2);

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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
