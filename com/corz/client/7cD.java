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

public class 7cd {
   public int 3;
   public int 3f;
   public int 39;
   public int 9;
   public int 7;
   public int 2;
   public int 5;
   public int 0;
   public int 4;
   public int 6;
   public long 1;
   public int 3S;
   public int 32;
   public int 8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;
   private static final Object[] i;
   private static final String[] j;
   // $FF: synthetic field
   private static transient String LnUodvqoMs;

   void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7cd.class, 730);
      a = s.a(3724712432608308684L, 6030440603696587495L, MethodHandles.lookup().lookupClass()).a(84149658440516L);
      i = new Object[28];
      j = new String[28];
      a();
      d = new HashMap(13);
      long var16 = a ^ 46294210556954L;
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
      String var22 = "vð\u0010}0\u00078\u0085luv\u0001Ù¼æo\u000föàw\u0010OÂ.\u0018S\u0018G¨\u0000£¯§\u0087\u00897ëA\u0016\u009a®\u007f (\u001dIÌ$\u00ad(\u0086Êv°\u000bnÀ¤C\u0082òP}îvx+Ç\u0095x/8ûk\u0098 »h\u0018\u001aß÷å\u001dÚ©[ÿR± ÂÔw\\1Ë\u000b\u001b\u0080\u0011~4\u008e\u0002¯xØ t3\u0017õ4Í\u0080ð>·tâê© û\u0084\u009f\u0083C(\u008c\u0013«áâT_ãTn\u007f\u009d\u0098[»\u0090NXÉr8ÎÞ\u0096ÄD";
      int var24 = "vð\u0010}0\u00078\u0085luv\u0001Ù¼æo\u000föàw\u0010OÂ.\u0018S\u0018G¨\u0000£¯§\u0087\u00897ëA\u0016\u009a®\u007f (\u001dIÌ$\u00ad(\u0086Êv°\u000bnÀ¤C\u0082òP}îvx+Ç\u0095x/8ûk\u0098 »h\u0018\u001aß÷å\u001dÚ©[ÿR± ÂÔw\\1Ë\u000b\u001b\u0080\u0011~4\u008e\u0002¯xØ t3\u0017õ4Í\u0080ð>·tâê© û\u0084\u009f\u0083C(\u008c\u0013«áâT_ãTn\u007f\u009d\u0098[»\u0090NXÉr8ÎÞ\u0096ÄD".length();
      char var21 = 24;
      int var28 = -1;

      label56:
      while(true) {
         ++var28;
         String var29 = var22.substring(var28, var28 + var21);
         int var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
            String var40 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var40;
                  if ((var28 += var21) >= var24) {
                     b = var25;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var5;
                     Cipher var31 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var42 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var31.init(2, var42.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[2];
                     int var8 = 0;
                     String var9 = "\u0096Ö\u0002\u0097 \u0000\u0084(<¥?\u0091ÓD\bª";
                     int var10 = "\u0096Ö\u0002\u0097 \u0000\u0084(<¥?\u0091ÓD\bª".length();
                     int var7 = 0;

                     do {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        var10001 = var8++;
                        long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        boolean var47 = true;
                        var11[var10001] = var10004;
                     } while(var7 < var10);

                     e = var11;
                     f = new Integer[2];
                     Cipher var0;
                     var31 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var42 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                     }

                     var31.init(2, var42.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -3325866188278889797L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var44 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     h = var44;
                     return;
                  }

                  var21 = var22.charAt(var28);
                  break;
               default:
                  var25[var23++] = var40;
                  if ((var28 += var21) < var24) {
                     var21 = var22.charAt(var28);
                     continue label56;
                  }

                  var22 = "fû\bî\u0010Rd¸ª/HdXqÝñ²Þî=Ê¬Øæ4\\\u0093\u0004[í[q\u0010lx!Çò0X\"¤\u009b\u0087kQó°ó";
                  var24 = "fû\bî\u0010Rd¸ª/HdXqÝñ²Þî=Ê¬Øæ4\\\u0093\u0004[í[q\u0010lx!Çò0X\"¤\u009b\u0087kQó°ó".length();
                  var21 = ' ';
                  var28 = -1;
            }

            ++var28;
            var29 = var22.substring(var28, var28 + var21);
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

   private static int b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (j[var4] != null) {
         return var4;
      } else {
         Object var5 = i[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 59;
               case 1 -> var10000 = 51;
               case 2 -> var10000 = 23;
               case 3 -> var10000 = 33;
               case 4 -> var10000 = 48;
               case 5 -> var10000 = 5;
               case 6 -> var10000 = 60;
               case 7 -> var10000 = 16;
               case 8 -> var10000 = 36;
               case 9 -> var10000 = 32;
               case 10 -> var10000 = 2;
               case 11 -> var10000 = 56;
               case 12 -> var10000 = 0;
               case 13 -> var10000 = 41;
               case 14 -> var10000 = 50;
               case 15 -> var10000 = 8;
               case 16 -> var10000 = 30;
               case 17 -> var10000 = 6;
               case 18 -> var10000 = 34;
               case 19 -> var10000 = 46;
               case 20 -> var10000 = 42;
               case 21 -> var10000 = 45;
               case 22 -> var10000 = 40;
               case 23 -> var10000 = 11;
               case 24 -> var10000 = 24;
               case 25 -> var10000 = 25;
               case 26 -> var10000 = 47;
               case 27 -> var10000 = 28;
               case 28 -> var10000 = 26;
               case 29 -> var10000 = 31;
               case 30 -> var10000 = 49;
               case 31 -> var10000 = 38;
               case 32 -> var10000 = 39;
               case 33 -> var10000 = 61;
               case 34 -> var10000 = 44;
               case 35 -> var10000 = 10;
               case 36 -> var10000 = 63;
               case 37 -> var10000 = 58;
               case 38 -> var10000 = 55;
               case 39 -> var10000 = 13;
               case 40 -> var10000 = 12;
               case 41 -> var10000 = 3;
               case 42 -> var10000 = 9;
               case 43 -> var10000 = 37;
               case 44 -> var10000 = 54;
               case 45 -> var10000 = 15;
               case 46 -> var10000 = 43;
               case 47 -> var10000 = 4;
               case 48 -> var10000 = 7;
               case 49 -> var10000 = 35;
               case 50 -> var10000 = 17;
               case 51 -> var10000 = 53;
               case 52 -> var10000 = 22;
               case 53 -> var10000 = 57;
               case 54 -> var10000 = 1;
               case 55 -> var10000 = 29;
               case 56 -> var10000 = 62;
               case 57 -> var10000 = 52;
               case 58 -> var10000 = 27;
               case 59 -> var10000 = 20;
               case 60 -> var10000 = 21;
               case 61 -> var10000 = 19;
               case 62 -> var10000 = 18;
               default -> var10000 = 14;
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

            j[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = i;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      j[1] = "c";
      var10000[2] = Long.TYPE;
      j[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Double.TYPE;
      j[6] = "c";
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
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = i[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(j[var4]);
            i[var4] = var5;
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

   private static Field c(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     i[var4] = var13;
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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 224 && var8 != 229 && var8 != 235 && var8 != 'p') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 242) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'h') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 229) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 235) {
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

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
