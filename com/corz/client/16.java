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

public class 16 extends 9a {
   private final 4i 3;
   private final 47 6;
   private final 44 5;
   private final 4H 1;
   private final 44 7;
   private final 4H 9;
   private static final int 2;
   private int 0;
   private int 8;
   private long 3k;
   private boolean 3D;
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
   private static transient String QnvgtkLDeH;

   public _6/* $FF was: 16*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _U/* $FF was: 1U*/();

   public native void _/* $FF was: 0*/();

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      this.e<invokedynamic>(this, "c".z<invokedynamic>((long)"c", var2), (long)"c", var2);
   }

   private int _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(16.class, 742);
      b = com.corz.client.s.a(-8822831217050945879L, 8382772663903453188L, MethodHandles.lookup().lookupClass()).a(6038247733041L);
      p = new Object[122];
      q = new String[122];
      b();
      h = new HashMap(13);
      long var16 = b ^ 47993185542124L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[7];
      int var23 = 0;
      String var22 = "¥a\u009e\u00ad\\\u0080\u00812 ×O¯ÁÀ\u0096\b\u0018¿\\\u0081\u0084¢åÆ'\u0010Íóî·Jïz\"øSA\u009eì?\u0017\u0018ªÃÌ\u008d\u0011\u008d\u009eü\u0006i\u0089®Ê\u0092q¿\u0003½¯\"E'S\u0086\u0018AüÄ=Ü6\u0007ö®æ©*ë\u00adøî.n\u009e\u0093lÌÀÓ\u0010\u0087@èð~è\u0017ÎÆ÷\u0086\u0090ÐY®N";
      int var24 = "¥a\u009e\u00ad\\\u0080\u00812 ×O¯ÁÀ\u0096\b\u0018¿\\\u0081\u0084¢åÆ'\u0010Íóî·Jïz\"øSA\u009eì?\u0017\u0018ªÃÌ\u008d\u0011\u008d\u009eü\u0006i\u0089®Ê\u0092q¿\u0003½¯\"E'S\u0086\u0018AüÄ=Ü6\u0007ö®æ©*ë\u00adøî.n\u009e\u0093lÌÀÓ\u0010\u0087@èð~è\u0017ÎÆ÷\u0086\u0090ÐY®N".length();
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
                     g = new String[7];
                     n = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[17];
                     int var8 = 0;
                     String var9 = "\u0015\u001b\u009fá(èRò\u0086X /º\u0085^v\u0004öÜ\u0015éA9þT\u0003\u0004þV\nm\u000f\u008e\u0017Uà\u0087:x¯îûµ8½U\u0095ó[¼\u0091èÀ\u001b\\Äýw\u001cÈ\fuU±H\u0017Hñª¡_:Ýl\rKO Ö \u0006¨äNW\u00adÕ££\u008bçósË\u0094ñ\u00802û\u008a\u000210\u008fIë\u0089e\u008bÀÕ\u008a\u0013\u009e%VµQðI";
                     int var10 = "\u0015\u001b\u009fá(èRò\u0086X /º\u0085^v\u0004öÜ\u0015éA9þT\u0003\u0004þV\nm\u000f\u008e\u0017Uà\u0087:x¯îûµ8½U\u0095ó[¼\u0091èÀ\u001b\\Äýw\u001cÈ\fuU±H\u0017Hñª¡_:Ýl\rKO Ö \u0006¨äNW\u00adÕ££\u008bçósË\u0094ñ\u00802û\u008a\u000210\u008fIë\u0089e\u008bÀÕ\u008a\u0013\u009e%VµQðI".length();
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
                                    m = new Integer[17];
                                    2 = true.g<invokedynamic>(30155, var16 ^ 7475615426073301837L);
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = 7198642625376013752L;
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

                                 var9 = "ÚÊ%\u0081îbòÇT}\u0004\u0095BÛ]$";
                                 var10 = "ÚÊ%\u0081îbòÇT}\u0004\u0095BÛ]$".length();
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

                  var22 = "õå8\u008ax«×½pÎ¤¤IÂèj±1Ý\u0086ê\u0095Ã[kùÐã\b\u0089,JÊ¦®¿\u009diÈ\u0006 ~þ\u0017%\u009a4Ô\u0010<DD« ä©5\u009d\u001aW¦\u0014Ý\u001e|üõÛ=êÛÖ\u0017";
                  var24 = "õå8\u008ax«×½pÎ¤¤IÂèj±1Ý\u0086ê\u0095Ã[kùÐã\b\u0089,JÊ¦®¿\u009diÈ\u0006 ~þ\u0017%\u009a4Ô\u0010<DD« ä©5\u009d\u001aW¦\u0014Ý\u001e|üõÛ=êÛÖ\u0017".length();
                  var21 = '(';
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

   private static String b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 46;
               case 1 -> var10000 = 36;
               case 2 -> var10000 = 52;
               case 3 -> var10000 = 61;
               case 4 -> var10000 = 25;
               case 5 -> var10000 = 15;
               case 6 -> var10000 = 8;
               case 7 -> var10000 = 35;
               case 8 -> var10000 = 26;
               case 9 -> var10000 = 59;
               case 10 -> var10000 = 32;
               case 11 -> var10000 = 24;
               case 12 -> var10000 = 54;
               case 13 -> var10000 = 14;
               case 14 -> var10000 = 1;
               case 15 -> var10000 = 31;
               case 16 -> var10000 = 55;
               case 17 -> var10000 = 44;
               case 18 -> var10000 = 45;
               case 19 -> var10000 = 43;
               case 20 -> var10000 = 40;
               case 21 -> var10000 = 29;
               case 22 -> var10000 = 5;
               case 23 -> var10000 = 47;
               case 24 -> var10000 = 13;
               case 25 -> var10000 = 11;
               case 26 -> var10000 = 38;
               case 27 -> var10000 = 22;
               case 28 -> var10000 = 63;
               case 29 -> var10000 = 12;
               case 30 -> var10000 = 19;
               case 31 -> var10000 = 56;
               case 32 -> var10000 = 6;
               case 33 -> var10000 = 34;
               case 34 -> var10000 = 18;
               case 35 -> var10000 = 23;
               case 36 -> var10000 = 49;
               case 37 -> var10000 = 57;
               case 38 -> var10000 = 10;
               case 39 -> var10000 = 21;
               case 40 -> var10000 = 28;
               case 41 -> var10000 = 3;
               case 42 -> var10000 = 48;
               case 43 -> var10000 = 2;
               case 44 -> var10000 = 27;
               case 45 -> var10000 = 37;
               case 46 -> var10000 = 58;
               case 47 -> var10000 = 17;
               case 48 -> var10000 = 30;
               case 49 -> var10000 = 9;
               case 50 -> var10000 = 60;
               case 51 -> var10000 = 16;
               case 52 -> var10000 = 7;
               case 53 -> var10000 = 0;
               case 54 -> var10000 = 53;
               case 55 -> var10000 = 20;
               case 56 -> var10000 = 33;
               case 57 -> var10000 = 41;
               case 58 -> var10000 = 51;
               case 59 -> var10000 = 4;
               case 60 -> var10000 = 50;
               case 61 -> var10000 = 39;
               case 62 -> var10000 = 42;
               default -> var10000 = 62;
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

   private static native void b();

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

   private static native Field c(Class var0, String var1, Class var2);

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

   private static native Method h(long var0, long var2);

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
