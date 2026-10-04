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

public enum 8T {
   public static final 8T 5;
   public static final 8T 9;
   public static final 8T 7;
   public static final 8T 0;
   public static final 8T 3;
   public static final 8T 2;
   public static final 8T 1;
   public static final 8T 4;
   public static final 8T 6;
   public static final 8T 7a;
   private static final 8T[] 8;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 8T[] _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(8T.class, 316);
      a = s.a(602667788782502246L, 7966055011258847114L, MethodHandles.lookup().lookupClass()).a(268462249133374L);
      long var20 = a ^ 127677432312664L;
      e = new Object[20];
      f = new String[20];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[10];
      int var17 = 0;
      String var16 = ",\u0086J\rÿ_ÄàÞ \u0010õFù#Ê\bÏ\u0018@¬:»ª\u0080\u0010\u0004Uøù×è\u0013ExÉ\u008eE¿\u0085Óa\u0010 \u009a}|YìímÇ»O9õÇå\u001f\u0018Lø\u001eG\u009cÙÚ2õ'qËµx\u0096$\u001a<ÆÑ\u0001Ñ\u0016Ý\u0010¡Úk@\u00adVi¡Ò\u0081·æ\f\u001f\u008bh\u0010\u0084\u0000»näìázÌuÛ\u0099!{²\u0086 \u000e\u009fs\u0081Kj¢{g\u0080ý\u0016\u008b\u0010B\u0004}¡\u0087Q÷\n\u0019\t=Y\t¿ÔÍ\u000e5";
      int var18 = ",\u0086J\rÿ_ÄàÞ \u0010õFù#Ê\bÏ\u0018@¬:»ª\u0080\u0010\u0004Uøù×è\u0013ExÉ\u008eE¿\u0085Óa\u0010 \u009a}|YìímÇ»O9õÇå\u001f\u0018Lø\u001eG\u009cÙÚ2õ'qËµx\u0096$\u001a<ÆÑ\u0001Ñ\u0016Ý\u0010¡Úk@\u00adVi¡Ò\u0081·æ\f\u001f\u008bh\u0010\u0084\u0000»näìázÌuÛ\u0099!{²\u0086 \u000e\u009fs\u0081Kj¢{g\u0080ý\u0016\u008b\u0010B\u0004}¡\u0087Q÷\n\u0019\t=Y\t¿ÔÍ\u000e5".length();
      char var15 = 16;
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
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "\u0098ÛK¤ëÓ¦ká\u0000_\u0001E3P«AÃâH0õ(±®sÖ[ó\u0006\u009aÏx¯\u0098\u0015å(ü,QÖ\u0092)E\u0011\u0091=\u0013\u0096Þ7àu\u0089Í";
                     int var5 = "\u0098ÛK¤ëÓ¦ká\u0000_\u0001E3P«AÃâH0õ(±®sÖ[ó\u0006\u009aÏx¯\u0098\u0015å(ü,QÖ\u0092)E\u0011\u0091=\u0013\u0096Þ7àu\u0089Í".length();
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
                                    c = new Integer[9];
                                    5 = new 8T(var11[7], 0);
                                    9 = new 8T(var11[3], 1);
                                    7 = new 8T(var11[2], 2);
                                    0 = new 8T(var11[0], 3);
                                    3 = new 8T(var11[4], 4);
                                    2 = new 8T(var11[9], 5);
                                    1 = new 8T(var11[5], true.l<invokedynamic>(1245, 2823595306926442283L ^ var20));
                                    4 = new 8T(var11[8], true.l<invokedynamic>(9132, 6378198962565292120L ^ var20));
                                    6 = new 8T(var11[1], true.l<invokedynamic>(25631, 6938642956087322594L ^ var20));
                                    7a = new 8T(var11[6], true.l<invokedynamic>(18596, 832440864107547479L ^ var20));
                                    8 = -7372938510075960299L.g<invokedynamic>(-7372938510075960299L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = ":\r\u0002`í\u0019\u0081\u0094¥¾¢P,ÒhÊ";
                                 var5 = ":\r\u0002`í\u0019\u0081\u0094¥¾¢P,ÒhÊ".length();
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

                  var16 = "÷×\u009eV\u0089Äa\u000e «e\u0004Hìíwäo\u0089rè-\u0097\u001b\u0010]\u008a:\u0018Ù¨\u008dâ\u001aÑÈ\u0081ü\u0011\u0084\r";
                  var18 = "÷×\u009eV\u0089Äa\u000e «e\u0004Hìíwäo\u0089rè-\u0097\u001b\u0010]\u008a:\u0018Ù¨\u008dâ\u001aÑÈ\u0081ü\u0011\u0084\r".length();
                  var15 = 24;
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   private static native String a(byte[] var0);

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

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 35;
               case 1 -> var10000 = 13;
               case 2 -> var10000 = 21;
               case 3 -> var10000 = 10;
               case 4 -> var10000 = 47;
               case 5 -> var10000 = 2;
               case 6 -> var10000 = 41;
               case 7 -> var10000 = 18;
               case 8 -> var10000 = 43;
               case 9 -> var10000 = 30;
               case 10 -> var10000 = 56;
               case 11 -> var10000 = 61;
               case 12 -> var10000 = 25;
               case 13 -> var10000 = 55;
               case 14 -> var10000 = 51;
               case 15 -> var10000 = 14;
               case 16 -> var10000 = 38;
               case 17 -> var10000 = 7;
               case 18 -> var10000 = 54;
               case 19 -> var10000 = 57;
               case 20 -> var10000 = 45;
               case 21 -> var10000 = 6;
               case 22 -> var10000 = 19;
               case 23 -> var10000 = 42;
               case 24 -> var10000 = 62;
               case 25 -> var10000 = 16;
               case 26 -> var10000 = 31;
               case 27 -> var10000 = 33;
               case 28 -> var10000 = 17;
               case 29 -> var10000 = 4;
               case 30 -> var10000 = 24;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 53;
               case 33 -> var10000 = 60;
               case 34 -> var10000 = 44;
               case 35 -> var10000 = 12;
               case 36 -> var10000 = 58;
               case 37 -> var10000 = 50;
               case 38 -> var10000 = 23;
               case 39 -> var10000 = 20;
               case 40 -> var10000 = 63;
               case 41 -> var10000 = 26;
               case 42 -> var10000 = 11;
               case 43 -> var10000 = 3;
               case 44 -> var10000 = 34;
               case 45 -> var10000 = 36;
               case 46 -> var10000 = 37;
               case 47 -> var10000 = 28;
               case 48 -> var10000 = 1;
               case 49 -> var10000 = 52;
               case 50 -> var10000 = 59;
               case 51 -> var10000 = 46;
               case 52 -> var10000 = 29;
               case 53 -> var10000 = 49;
               case 54 -> var10000 = 8;
               case 55 -> var10000 = 32;
               case 56 -> var10000 = 48;
               case 57 -> var10000 = 27;
               case 58 -> var10000 = 0;
               case 59 -> var10000 = 9;
               case 60 -> var10000 = 39;
               case 61 -> var10000 = 22;
               case 62 -> var10000 = 40;
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

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
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
      var10000[18] = "c";
      var10000[19] = "c";
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

   private static native Field b(Class var0, String var1, Class var2);

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
