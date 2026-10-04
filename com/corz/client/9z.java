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
import net.minecraft.class_243;
import net.minecraft.class_742;

public class 9Z extends 9a {
   private final 4A 9;
   private final 4A 7j;
   private final 4i 7f;
   private final 44 78;
   private final 4A 1;
   private final 4A 7n;
   private final 4A 76;
   private final 4H 7O;
   private final 4H 2;
   private final 44 7x;
   private final 4i 6;
   private class_742 5;
   private class_243 7D;
   private long 0;
   private float 8;
   private float 7;
   private long 3;
   private float 7a;
   private float 7e;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final long[] o;
   private static final Long[] p;
   private static final Map q;
   private static final Object[] t;
   private static final String[] u;
   // $FF: synthetic field
   private static transient String TYGVJiRImx;

   public _Z/* $FF was: 9Z*/(long param1, short param3) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 8*/(762 param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_742 _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private native double _/* $FF was: 3*/(Object[] var1);

   private class_243 _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private native void _/* $FF was: 6*/(Object[] var1);

   private native float _/* $FF was: 2*/(Object[] var1);

   private native float _/* $FF was: 7*/(Object[] var1);

   private void _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      this.Ò<invokedynamic>(this, (class_742)null, (long)"c", var2);
      this.Ò<invokedynamic>(this, (class_243)null, (long)"c", var2);
      this.Ò<invokedynamic>(this, (float)"c", (long)"c", var2);
      this.Ò<invokedynamic>(this, (float)"c", (long)"c", var2);
      this.Ò<invokedynamic>(this, (float)"c", (long)"c", var2);
      this.Ò<invokedynamic>(this, (float)"c", (long)"c", var2);
      this.Ò<invokedynamic>(this, "c".Ô<invokedynamic>((long)"c", var2), (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(9Z.class, 581);
      b = com.corz.client.s.a(-4348978848759994028L, -3456411627455290835L, MethodHandles.lookup().lookupClass()).a(90450749757234L);
      t = new Object[155];
      u = new String[155];
      b();
      h = new HashMap(13);
      long var22 = b ^ 41800201370156L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[9];
      int var29 = 0;
      String var28 = "û'\u001dkn\u007f=\u0087!©ØKT\u0096\u0091(\u0010ºs\u007f\u007f\u009a\u0016Ý\u008dª¯ÚauC\u0099|\u0018bù8\u0086#Ù\u0086\u0092½±ä\u0010o·÷Í\u0085Â2r'UfÓ\u0010· JäRæÁ¥¨\u0082\u001a¬(ª´A\u0010¡\tÔ\u000f=?3ûà\r¼á\u0007Fê²\u0010´\u0097.¨\u000b¢\u000b0÷õU\rÅIO(\u0010l(%ù`&hxÌ|±m%ÅØ\u0004";
      int var30 = "û'\u001dkn\u007f=\u0087!©ØKT\u0096\u0091(\u0010ºs\u007f\u007f\u009a\u0016Ý\u008dª¯ÚauC\u0099|\u0018bù8\u0086#Ù\u0086\u0092½±ä\u0010o·÷Í\u0085Â2r'UfÓ\u0010· JäRæÁ¥¨\u0082\u001a¬(ª´A\u0010¡\tÔ\u000f=?3ûà\r¼á\u0007Fê²\u0010´\u0097.¨\u000b¢\u000b0÷õU\rÅIO(\u0010l(%ù`&hxÌ|±m%ÅØ\u0004".length();
      char var27 = 16;
      int var35 = -1;

      label72:
      while(true) {
         ++var35;
         String var36 = var28.substring(var35, var35 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = b(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     f = var31;
                     g = new String[9];
                     n = new HashMap(13);
                     Cipher var11;
                     Cipher var38 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[21];
                     int var14 = 0;
                     String var15 = "G\u007f(\u001cK\u007f:C8\u0004~zZ\u00179ÜIl¿³æÎñ×\u008b\t´\t/8ÜÆ\nþ¼\u009fÕ~\u0084þË\u0014ç\u00040\nô:ui×Á@\u0001\u0019\u0090\u001c\u0019\u0012ìAlS±îâ\u009e&®CTÂV\u0082\u0088øog8¨mþ=»\u001d\u0014\u009d\u000f³X·\u0096o¯_NQ\u0092\n-(|ß\u0010Ú\u008cât÷\u001bèôfp £÷£ÕÌ\u008ew]\u0093s]î%i\u001cK+Rq7G,û<ªdP7ßþøç\u0015|Iø÷";
                     int var16 = "G\u007f(\u001cK\u007f:C8\u0004~zZ\u00179ÜIl¿³æÎñ×\u008b\t´\t/8ÜÆ\nþ¼\u009fÕ~\u0084þË\u0014ç\u00040\nô:ui×Á@\u0001\u0019\u0090\u001c\u0019\u0012ìAlS±îâ\u009e&®CTÂV\u0082\u0088øog8¨mþ=»\u001d\u0014\u009d\u000f³X·\u0096o¯_NQ\u0092\n-(|ß\u0010Ú\u008cât÷\u001bèôfp £÷£ÕÌ\u008ew]\u0093s]î%i\u001cK+Rq7G,û<ªdP7ßþøç\u0015|Iø÷".length();
                     int var13 = 0;

                     label54:
                     while(true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while(true) {
                           long var19 = var53;
                           byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                           long var62 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    l = var17;
                                    m = new Integer[21];
                                    q = new HashMap(13);
                                    Cipher var0;
                                    Cipher var40 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                                    byte[] var60 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var60[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var40.init(2, var55.generateSecret(new DESKeySpec(var60)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "\u0098.©\u0080Ù\u00011êZt(\u0006Ë\u0098ÓÅ";
                                    int var5 = "\u0098.©\u0080Ù\u00011êZt(\u0006Ë\u0098ÓÅ".length();
                                    int var2 = 0;

                                    do {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                       var10001 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                       byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                       var62 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                       boolean var61 = true;
                                       var6[var10001] = var62;
                                    } while(var2 < var5);

                                    o = var6;
                                    p = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "µ¸C\u009b%¦\u009cs¥¨b\u009fÒB\u001c`";
                                 var16 = "µ¸C\u009b%¦\u009cs¥¨b\u009fÒB\u001c`".length();
                                 var13 = 0;
                           }

                           var10001 = var13;
                           var13 += 8;
                           var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = "ÈÒn0«6\u0016ç¾ôýx\u0086%ø)\u0010úY\u000f\u008b@\u0089Ïj{\n\u0014Ä«ÛË\u0012";
                  var30 = "ÈÒn0«6\u0016ç¾ôýx\u0086%ø)\u0010úY\u000f\u008b@\u0089Ïj{\n\u0014Ä«ÛË\u0012".length();
                  var27 = 16;
                  var35 = -1;
            }

            ++var35;
            var36 = var28.substring(var35, var35 + var27);
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

   private static long e(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native long e(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static native int e(long var0, long var2);

   private static native void b();

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = t[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(u[var4]);
            t[var4] = var5;
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

   private static native Field g(long var0, long var2);

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

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
      Object var5 = t[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = u[var4];
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
               t[var4] = var26;
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
                     t[var4] = var19;
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

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 228 && var8 != 210 && var8 != 'N' && var8 != 224) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 236) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 212) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 228) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 210) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'N') {
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

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static CallSite g(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
