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

public enum 7M_ {
   public static final 7M_ 7;
   public static final 7M_ 5d;
   public static final 7M_ 4;
   public static final 7M_ 9;
   public static final 7M_ 2;
   public static final 7M_ 8;
   public static final 7M_ 6;
   public static final 7M_ 3;
   public static final 7M_ 0;
   public static final 7M_ 5;
   private static final 7M_[] 1;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 7M_[] _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7M_.class, 744);
      a = s.a(2518039909235819435L, -341001919677699312L, MethodHandles.lookup().lookupClass()).a(54684417487690L);
      long var20 = a ^ 9384527531504L;
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
      String var16 = "\u008dF>ktíÑJ\u0010\u0006â3\u0083Ð%\u0003jM\u000eÛb'U|ª\u0010\fâ\u0084Ã\u0005S«K\b\u0016÷=\"Á\u0013\u0087\u0010\u0018Nè\t\u008eH\u0098\u008e1Öc(è\u0016Óä\u0010A3@Æà©zØ¼>\u0093\u0003\u0089\u0082A\u008a\b\u0018\f\u009aO\u000b\u0016\u0081:\u0018Ü\u0092y?f$ç\u0004Õe\u009ff5ùq\u009d\u0004~\u0015)bUàÖ\u0010\u0089\n\u00adãx®\u00adêo\u001eq=^\u009fàå";
      int var18 = "\u008dF>ktíÑJ\u0010\u0006â3\u0083Ð%\u0003jM\u000eÛb'U|ª\u0010\fâ\u0084Ã\u0005S«K\b\u0016÷=\"Á\u0013\u0087\u0010\u0018Nè\t\u008eH\u0098\u008e1Öc(è\u0016Óä\u0010A3@Æà©zØ¼>\u0093\u0003\u0089\u0082A\u008a\b\u0018\f\u009aO\u000b\u0016\u0081:\u0018Ü\u0092y?f$ç\u0004Õe\u009ff5ùq\u009d\u0004~\u0015)bUàÖ\u0010\u0089\n\u00adãx®\u00adêo\u001eq=^\u009fàå".length();
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
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "Á\u001a\u0001\u0095\u0097~ÌûVÒò\u000f\u0011Ïñ\u0012\b\u009d\u009fIÁT?J\u008d}ëy\u009e\u0015{\fSë\u008fËËjá¦<\u001e\n¨\u008fÂë%¼Æ\u0017mÎ2ÖC";
                     int var5 = "Á\u001a\u0001\u0095\u0097~ÌûVÒò\u000f\u0011Ïñ\u0012\b\u009d\u009fIÁT?J\u008d}ëy\u009e\u0015{\fSë\u008fËËjá¦<\u001e\n¨\u008fÂë%¼Æ\u0017mÎ2ÖC".length();
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
                                    7 = new 7M_(var11[5], 0);
                                    5d = new 7M_(var11[9], 1);
                                    4 = new 7M_(var11[1], 2);
                                    9 = new 7M_(var11[0], 3);
                                    2 = new 7M_(var11[2], 4);
                                    8 = new 7M_(var11[6], 5);
                                    6 = new 7M_(var11[7], true.z<invokedynamic>(31667, 8414659441505661339L ^ var20));
                                    3 = new 7M_(var11[3], true.z<invokedynamic>(21137, 930026525996898495L ^ var20));
                                    0 = new 7M_(var11[4], true.z<invokedynamic>(17106, 8570933273966725374L ^ var20));
                                    5 = new 7M_(var11[8], true.z<invokedynamic>(17443, 4409428626593893898L ^ var20));
                                    1 = 214470517725200367L.r<invokedynamic>(214470517725200367L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Ëö\u001aýõ\u0003\nEµâ¶\u0083¨m\u0010_";
                                 var5 = "Ëö\u001aýõ\u0003\nEµâ¶\u0083¨m\u0010_".length();
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

                  var16 = "1r\u0006Üuûr¨\u0010\u001c·©¹.\u0010Eµ\u009bè\u0011\u0015\u0096á\u0086P";
                  var18 = "1r\u0006Üuûr¨\u0010\u001c·©¹.\u0010Eµ\u009bè\u0011\u0015\u0096á\u0086P".length();
                  var15 = '\b';
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
               case 0 -> var10000 = 47;
               case 1 -> var10000 = 34;
               case 2 -> var10000 = 17;
               case 3 -> var10000 = 6;
               case 4 -> var10000 = 23;
               case 5 -> var10000 = 55;
               case 6 -> var10000 = 11;
               case 7 -> var10000 = 31;
               case 8 -> var10000 = 53;
               case 9 -> var10000 = 59;
               case 10 -> var10000 = 51;
               case 11 -> var10000 = 29;
               case 12 -> var10000 = 21;
               case 13 -> var10000 = 22;
               case 14 -> var10000 = 40;
               case 15 -> var10000 = 45;
               case 16 -> var10000 = 36;
               case 17 -> var10000 = 24;
               case 18 -> var10000 = 1;
               case 19 -> var10000 = 46;
               case 20 -> var10000 = 41;
               case 21 -> var10000 = 9;
               case 22 -> var10000 = 62;
               case 23 -> var10000 = 57;
               case 24 -> var10000 = 25;
               case 25 -> var10000 = 16;
               case 26 -> var10000 = 50;
               case 27 -> var10000 = 61;
               case 28 -> var10000 = 2;
               case 29 -> var10000 = 58;
               case 30 -> var10000 = 3;
               case 31 -> var10000 = 20;
               case 32 -> var10000 = 0;
               case 33 -> var10000 = 54;
               case 34 -> var10000 = 37;
               case 35 -> var10000 = 44;
               case 36 -> var10000 = 42;
               case 37 -> var10000 = 13;
               case 38 -> var10000 = 5;
               case 39 -> var10000 = 48;
               case 40 -> var10000 = 19;
               case 41 -> var10000 = 39;
               case 42 -> var10000 = 27;
               case 43 -> var10000 = 10;
               case 44 -> var10000 = 49;
               case 45 -> var10000 = 63;
               case 46 -> var10000 = 28;
               case 47 -> var10000 = 26;
               case 48 -> var10000 = 18;
               case 49 -> var10000 = 35;
               case 50 -> var10000 = 52;
               case 51 -> var10000 = 32;
               case 52 -> var10000 = 30;
               case 53 -> var10000 = 15;
               case 54 -> var10000 = 56;
               case 55 -> var10000 = 8;
               case 56 -> var10000 = 60;
               case 57 -> var10000 = 12;
               case 58 -> var10000 = 7;
               case 59 -> var10000 = 4;
               case 60 -> var10000 = 14;
               case 61 -> var10000 = 43;
               case 62 -> var10000 = 33;
               default -> var10000 = 38;
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
