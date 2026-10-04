package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7Mh {
   private static final long a;
   private static final long b;
   private static final long[] c;
   private static final Long[] d;
   private static final Map e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String LsCFAImalW;

   private _Mh/* $FF was: 7Mh*/() {
   }

   public static long _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static long[] _/* $FF was: 8*/(Object[] var0) {
      long var10 = (Long)var0[10];
      int var7 = (Integer)var0[8];
      int var3 = (Integer)var0[7];
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[2];
      8U var12 = (8U)var0[9];
      int var8 = (Integer)var0[1];
      int var9 = (Integer)var0[6];
      var10 = a ^ var10;
      LinkedHashSet var14 = new LinkedHashSet();
      int var10000 = "c".K<invokedynamic>((long)"c", var10);
      int var15 = -1;
      boolean var13 = (boolean)var10000;

      label123:
      while(true) {
         var10000 = var15;

         label120: {
            label119: {
               Long var35;
               String var40;
               long var41;
               label118: {
                  int var10004;
                  label117: {
                     label116:
                     while(true) {
                        if (var10000 <= 1) {
                           var10000 = -1;
                           if (!var13) {
                              break label123;
                           }

                           int var16 = -1;

                           while(var16 <= 1) {
                              var10000 = -1;
                              if (!var13) {
                                 continue label116;
                              }

                              int var17 = -1;

                              label108: {
                                 while(true) {
                                    if (var17 > 1) {
                                       break label108;
                                    }

                                    try {
                                       var30 = var14;
                                       if (1L >= var10) {
                                          break label120;
                                       }

                                       var10001 = var12;
                                       var10002 = var1 + var15;
                                       var10003 = var8 + var16;
                                       var10004 = var2;
                                       if (!var13) {
                                          break label117;
                                       }

                                       long var34 = var12.Õ<invokedynamic>(var12, var10002, var10003, var2 + var17, (long)"c", var10);
                                       var14.Õ<invokedynamic>(var14, var34.K<invokedynamic>(var34, (long)"c", var10), (long)"c", var10);
                                       ++var17;
                                       if (!var13) {
                                          break;
                                       }
                                    } catch (MatchException var23) {
                                       throw var23.K<invokedynamic>(var23, (long)"c", var10);
                                    }
                                 }

                                 if (1L >= var10) {
                                    break label119;
                                 }
                              }

                              ++var16;
                              if (!var13) {
                                 break;
                              }
                           }

                           if (1L >= var10) {
                              break;
                           }

                           ++var15;
                           if (var13) {
                              continue label123;
                           }
                        }

                        var30 = var14;
                        var35 = var12.Õ<invokedynamic>(var12, (Integer)var0[3], (Integer)var0[4], (Integer)var0[5], (long)"c", var10).K<invokedynamic>(var12.Õ<invokedynamic>(var12, (Integer)var0[3], (Integer)var0[4], (Integer)var0[5], (long)"c", var10), (long)"c", var10);
                        var40 = "c";
                        var41 = var10;
                        if (0L > var10) {
                           break label118;
                        }

                        var14.Õ<invokedynamic>(var14, var35, (long)"c", var10);
                        var14.Õ<invokedynamic>(var14, var12.Õ<invokedynamic>(var12, var9, var3 - 1, var7, (long)"c", var10).K<invokedynamic>(var12.Õ<invokedynamic>(var12, var9, var3 - 1, var7, (long)"c", var10), (long)"c", var10), (long)"c", var10);
                        var14.Õ<invokedynamic>(var14, var12.Õ<invokedynamic>(var12, var9, var3, var7, (long)"c", var10).K<invokedynamic>(var12.Õ<invokedynamic>(var12, var9, var3, var7, (long)"c", var10), (long)"c", var10), (long)"c", var10);
                        break;
                     }

                     var30 = var14;
                     var10001 = var12;
                     var10002 = var9;
                     var10003 = var3 + 1;
                     var10004 = var7;
                  }

                  var35 = var10001.Õ<invokedynamic>(var10001, var10002, var10003, var10004, (long)"c", var10).K<invokedynamic>(var10001.Õ<invokedynamic>(var10001, var10002, var10003, var10004, (long)"c", var10), (long)"c", var10);
                  var40 = "c";
                  var41 = var10;
               }

               var30.Õ<invokedynamic>(var30, var35, (long)var40, var41);
            }

            var30 = var14;
         }

         var10000 = var30.Õ<invokedynamic>(var30, (long)"c", var10);
         break;
      }

      long[] var25 = new long[var10000];
      int var26 = 0;
      Iterator var27 = var14.Õ<invokedynamic>(var14, (long)"c", var10);

      label73:
      while(var27.Õ<invokedynamic>(var27, (long)"c", var10)) {
         Long var31 = (Long)var27.Õ<invokedynamic>(var27, (long)"c", var10);
         long var18 = var31.Õ<invokedynamic>(var31, (long)"c", var10);
         MatchException var32;
         if (0L >= var10) {
            try {
               if (var13) {
                  continue;
               }
            } catch (MatchException var22) {
               var32 = var22;
               boolean var36 = false;
               throw var32.K<invokedynamic>(var32, (long)"c", var10);
            }

            if (var10 >= 1L) {
               break;
            }
         }

         while(true) {
            try {
               var33 = var25;
               if (!var13) {
                  return var33;
               }

               var25[var26++] = var18;
            } catch (MatchException var20) {
               var32 = var20;
               boolean var37 = false;
               break;
            }

            try {
               if (var13) {
                  continue label73;
               }
            } catch (MatchException var21) {
               var32 = var21;
               boolean var39 = false;
               break;
            }

            if (var10 >= 1L) {
               break label73;
            }
         }

         throw var32.K<invokedynamic>(var32, (long)"c", var10);
      }

      var33 = var25;
      return var33;
   }

   static {
      a.b99571f71427e3b19.a.init(7Mh.class, 310);
      a = s.a(-1577351855788564587L, 3525479568242858554L, MethodHandles.lookup().lookupClass()).a(218746209190122L);
      f = new Object[22];
      g = new String[22];
      a();
      long var11 = a ^ 129212731326575L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var15 = -3624335943380117857L;
      byte[] var17 = var13.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
      long var21 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
      int var10001 = -1;
      b = var21;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var22 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var22.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = " \u0088Þ.\u0015\u009c1\u0091\u0014;\u009a\u009c¶J\u008e\u009d.Z\n\u000bY-\u0088ÿ";
      int var5 = " \u0088Þ.\u0015\u009c1\u0091\u0014;\u009a\u009c¶J\u008e\u009d.Z\n\u000bY-\u0088ÿ".length();
      int var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var24 = true;
         var6[var10001] = var10004;
      } while(var2 < var5);

      c = var6;
      d = new Long[3];
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native long a(int var0, long var1);

   private static long a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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
      if (g[var4] != null) {
         return var4;
      } else {
         Object var5 = f[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 21;
               case 1 -> var10000 = 35;
               case 2 -> var10000 = 54;
               case 3 -> var10000 = 27;
               case 4 -> var10000 = 2;
               case 5 -> var10000 = 31;
               case 6 -> var10000 = 23;
               case 7 -> var10000 = 17;
               case 8 -> var10000 = 12;
               case 9 -> var10000 = 56;
               case 10 -> var10000 = 48;
               case 11 -> var10000 = 8;
               case 12 -> var10000 = 28;
               case 13 -> var10000 = 5;
               case 14 -> var10000 = 46;
               case 15 -> var10000 = 24;
               case 16 -> var10000 = 11;
               case 17 -> var10000 = 22;
               case 18 -> var10000 = 30;
               case 19 -> var10000 = 14;
               case 20 -> var10000 = 3;
               case 21 -> var10000 = 16;
               case 22 -> var10000 = 43;
               case 23 -> var10000 = 58;
               case 24 -> var10000 = 29;
               case 25 -> var10000 = 60;
               case 26 -> var10000 = 38;
               case 27 -> var10000 = 1;
               case 28 -> var10000 = 26;
               case 29 -> var10000 = 10;
               case 30 -> var10000 = 33;
               case 31 -> var10000 = 13;
               case 32 -> var10000 = 25;
               case 33 -> var10000 = 41;
               case 34 -> var10000 = 59;
               case 35 -> var10000 = 42;
               case 36 -> var10000 = 49;
               case 37 -> var10000 = 32;
               case 38 -> var10000 = 7;
               case 39 -> var10000 = 9;
               case 40 -> var10000 = 51;
               case 41 -> var10000 = 63;
               case 42 -> var10000 = 39;
               case 43 -> var10000 = 50;
               case 44 -> var10000 = 4;
               case 45 -> var10000 = 55;
               case 46 -> var10000 = 37;
               case 47 -> var10000 = 15;
               case 48 -> var10000 = 0;
               case 49 -> var10000 = 40;
               case 50 -> var10000 = 62;
               case 51 -> var10000 = 52;
               case 52 -> var10000 = 36;
               case 53 -> var10000 = 20;
               case 54 -> var10000 = 47;
               case 55 -> var10000 = 19;
               case 56 -> var10000 = 57;
               case 57 -> var10000 = 53;
               case 58 -> var10000 = 6;
               case 59 -> var10000 = 44;
               case 60 -> var10000 = 61;
               case 61 -> var10000 = 34;
               case 62 -> var10000 = 45;
               default -> var10000 = 18;
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

            g[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = f;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      g[1] = "c";
      var10000[2] = "c";
      var10000[3] = Integer.TYPE;
      g[3] = "c";
      var10000[4] = "c";
      var10000[5] = Boolean.TYPE;
      g[5] = "c";
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
      var10000[20] = "c";
      var10000[21] = "c";
   }

   private static native Class b(long var0, long var2);

   private static native Field a(Class var0, String var1, Class var2);

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
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     f[var4] = var13;
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

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var26;
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
                     f[var4] = var19;
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
         if (var8 != 'w' && var8 != 237 && var8 != 'N' && var8 != 220) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 213) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'K') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'w') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 237) {
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
