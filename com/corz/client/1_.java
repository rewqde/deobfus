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
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_634;
import net.minecraft.class_746;

public class 1_ extends 9a {
   public final 4i 8;
   private class_2824 6;
   private int 0;
   private boolean 5;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long o;
   private static final Object[] p;
   private static final String[] q;
   // $FF: synthetic field
   private static transient String PRgGNWjtzV;

   public __/* $FF was: 1_*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 7*/(7Ya param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] var1) {
      long var3 = (Long)var1[1];
      float var2 = (Float)var1[0];
      var3 = b ^ var3;
      class_634 var10000 = "c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3), (long)"c", var3);
      double var10003 = "c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3).x<invokedynamic>("c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3), (long)"c", var3);
      double var10004 = "c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3).x<invokedynamic>("c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3), (long)"c", var3) + (double)var2;
      double var10005 = "c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3).x<invokedynamic>("c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3), (long)"c", var3);
      class_746 var10007 = "c".d<invokedynamic>((long)"c", var3).Ý<invokedynamic>("c".d<invokedynamic>((long)"c", var3), (long)"c", var3);
      var10000.x<invokedynamic>(var10000, new class_2828.class_2829(var10003, var10004, var10005, false, var10007.Ý<invokedynamic>(var10007, (long)"c", var3)), (long)"c", var3);
   }

   static {
      a.b99571f71427e3b19.a.init(1_.class, 135);
      b = com.corz.client.s.a(3591624562731602505L, -3110756839198753184L, MethodHandles.lookup().lookupClass()).a(211167460249200L);
      p = new Object[82];
      q = new String[82];
      b();
      h = new HashMap(13);
      long var16 = b ^ 98020255241440L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[5];
      int var23 = 0;
      String var22 = "\u008a?}\u0094\u001c Èîô[£\nÓ¡8\u0088\u0010\u0085ï\u000f1«òËáC\u0002Hô\u0018\u001a$o\u0010Jjñu>TcJ\u00ad\\õ>Ï½2æ";
      int var24 = "\u008a?}\u0094\u001c Èîô[£\nÓ¡8\u0088\u0010\u0085ï\u000f1«òËáC\u0002Hô\u0018\u001a$o\u0010Jjñu>TcJ\u00ad\\õ>Ï½2æ".length();
      char var21 = 16;
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var22.substring(var29, var29 + var21);
         int var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = b(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     f = var25;
                     g = new String[5];
                     n = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[5];
                     int var8 = 0;
                     String var9 = "·ÿ\u001c+¡k¥ÈÒqn\u001cèý¡,@°U·0\\\u0087\n";
                     int var10 = "·ÿ\u001c+¡k¥ÈÒqn\u001cèý¡,@°U·0\\\u0087\n".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var52 = -1;

                        while(true) {
                           long var13 = var46;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var55 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    l = var11;
                                    m = new Integer[5];
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = 3244195662675298691L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var49 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    o = var49;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "\u0082\u0015¥\u0090\u0080´Ù¦\u0089×òµ4=S\u008d";
                                 var10 = "\u0082\u0015¥\u0090\u0080´Ù¦\u0089×òµ4=S\u008d".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "ÉW\u0097þ²;jä\u001e4ûÍ&jV\u0003\u0010ùê\u0097*\u0089\u0091\u0086T\u001e]³,é±R#";
                  var24 = "ÉW\u0097þ²;jä\u001e4ûÍ&jV\u0003\u0010ùê\u0097*\u0089\u0091\u0086T\u001e]³,é±R#".length();
                  var21 = 16;
                  var29 = -1;
            }

            ++var29;
            var30 = var22.substring(var29, var29 + var21);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static native String b(int var0, long var1);

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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

   private static int d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (q[var4] != null) {
         return var4;
      } else {
         Object var5 = p[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 36;
               case 1 -> var10000 = 7;
               case 2 -> var10000 = 42;
               case 3 -> var10000 = 26;
               case 4 -> var10000 = 55;
               case 5 -> var10000 = 31;
               case 6 -> var10000 = 59;
               case 7 -> var10000 = 51;
               case 8 -> var10000 = 23;
               case 9 -> var10000 = 41;
               case 10 -> var10000 = 60;
               case 11 -> var10000 = 3;
               case 12 -> var10000 = 39;
               case 13 -> var10000 = 38;
               case 14 -> var10000 = 40;
               case 15 -> var10000 = 24;
               case 16 -> var10000 = 34;
               case 17 -> var10000 = 5;
               case 18 -> var10000 = 14;
               case 19 -> var10000 = 18;
               case 20 -> var10000 = 56;
               case 21 -> var10000 = 10;
               case 22 -> var10000 = 33;
               case 23 -> var10000 = 1;
               case 24 -> var10000 = 45;
               case 25 -> var10000 = 11;
               case 26 -> var10000 = 54;
               case 27 -> var10000 = 28;
               case 28 -> var10000 = 2;
               case 29 -> var10000 = 43;
               case 30 -> var10000 = 58;
               case 31 -> var10000 = 53;
               case 32 -> var10000 = 27;
               case 33 -> var10000 = 4;
               case 34 -> var10000 = 13;
               case 35 -> var10000 = 25;
               case 36 -> var10000 = 50;
               case 37 -> var10000 = 62;
               case 38 -> var10000 = 22;
               case 39 -> var10000 = 17;
               case 40 -> var10000 = 6;
               case 41 -> var10000 = 20;
               case 42 -> var10000 = 12;
               case 43 -> var10000 = 63;
               case 44 -> var10000 = 47;
               case 45 -> var10000 = 19;
               case 46 -> var10000 = 21;
               case 47 -> var10000 = 30;
               case 48 -> var10000 = 8;
               case 49 -> var10000 = 35;
               case 50 -> var10000 = 32;
               case 51 -> var10000 = 61;
               case 52 -> var10000 = 52;
               case 53 -> var10000 = 46;
               case 54 -> var10000 = 9;
               case 55 -> var10000 = 16;
               case 56 -> var10000 = 48;
               case 57 -> var10000 = 29;
               case 58 -> var10000 = 44;
               case 59 -> var10000 = 49;
               case 60 -> var10000 = 15;
               case 61 -> var10000 = 37;
               case 62 -> var10000 = 57;
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

            q[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = p;
      var10000[0] = "c";
      var10000[1] = Double.TYPE;
      q[1] = "c";
      var10000[2] = "c";
      var10000[3] = Boolean.TYPE;
      q[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Void.TYPE;
      q[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Integer.TYPE;
      q[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = Byte.TYPE;
      q[17] = "c";
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
      var10000[31] = Long.TYPE;
      q[31] = "c";
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
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = p[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(q[var4]);
            p[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static Field c(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static Field d(Class var0, String var1, Class var2) {
      Field var3 = c(var0, var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         Class[] var4 = var0.getInterfaces();
         if (var4 != null) {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               var3 = d(var4[var5], var1, var2);
               if (var3 != null) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = p[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = q[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = f(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = c(var12, var10, var11);
            if (var13 != null) {
               p[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     p[var4] = var13;
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
               var12 = f((long)"c", 0L);
            }
         }
      }
   }

   private static Method c(Class var0, String var1, Class var2, int var3, Class[] var4) {
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

   private static Method d(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = c(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      } else {
         Class[] var6 = var0.getInterfaces();
         if (var6 != null) {
            for(int var7 = 0; var7 < var6.length; ++var7) {
               var5 = d(var6[var7], var1, var2, var3, var4);
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = p[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = q[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
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
            var15 = f(Long.parseLong(var6.substring(var12, var17), 36), 0L);
            if (var16 < var13) {
               var14[var16] = var15;
            }

            var12 = var17 + 1;
         }

         Class var23 = var8;

         while(true) {
            Method var26 = c(var23, var10, var15, var13, var14);
            if (var26 != null) {
               p[var4] = var26;
               return var26;
            }

            if (var23.getName().equals("c")) {
               break;
            }

            if ((var23 = var23.getSuperclass()) == null) {
               var23 = f((long)"c", 0L);
               break;
            }
         }

         var23 = var8;

         while(true) {
            Class[] var27;
            if ((var27 = var23.getInterfaces()) != null) {
               for(int var18 = 0; var18 < var27.length; ++var18) {
                  Method var19 = d(var27[var18], var10, var15, var13, var14);
                  if (var19 != null) {
                     p[var4] = var19;
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
               var23 = f((long)"c", 0L);
            }
         }
      }
   }

   private static native MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
