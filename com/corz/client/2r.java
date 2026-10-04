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

public class 2R extends 9a {
   private final 4H 2;
   private final 4H 5;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h;
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;
   private static final Object[] o;
   private static final String[] p;
   // $FF: synthetic field
   private static transient String IVnQlxNcvu;

   public _R/* $FF was: 2R*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(2R.class, 101);
      b = com.corz.client.s.a(-3285550658044075355L, 4009654630158147613L, MethodHandles.lookup().lookupClass()).a(40309952143695L);
      o = new Object[55];
      p = new String[55];
      b();
      h = new HashMap(13);
      long var11 = b ^ 125955560895712L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[11];
      int var18 = 0;
      String var17 = "ÛÅz\u001a\u0089áWîî\u0087à·ìgîÈ\u0014),\u001f\u001båP\u008c\t\u009eëP! Xò\u0005yûY¥ BbÚÌ?\u001a_ö@rJ¶5C,¿\u00950Ì@&ü\u0003Ç\u0018\\¦\u0018Í|_Å\u0086¨zËãþ\u0082u\u008bNÚîG*Þ¡gö²ùF%\u0095,?q\u0018\u009c©\u0084\b\u0001Q®\u0097\u001f%\u0005\u007f\u0083¯¤?\u0087\u0093í82÷\u0013* ð\u009e\u001eéÞif\u009a\rý§Nê7Ø{¨½\u0099ëyõRkß¸HÏÏ¶uE \u0099é?\u0090\tßá*\u0095s\u0096@ÛÀÌ2S\u001b\u008eÌ²¤Y\u0093\n·Zb§ã{8\u0018X\u0097h¦þ\u008aKÈd±\u0016áWâ½\u0014bºÙ}i\u000bôc í£\tÙ\u0013ºhTS1\u009d§ÓâÿzÃ½Í/\u0090÷@\u0016\u008a\u008a\u0004JG \u0081<\u0018\u0018ó¥\u007f´´Y@Q2p«P\u0018\u00168\u000b$\u0014¦IU\u0015ÁXÚÔ\u008cTòèò\"\u0004ÍÁu÷ZG½gÆ±\u0012\u0094ìðz\u00899ÿ^\u001fÅí®ò\u0015\u008b¨µFA¥ñã?ê\u0081#_z?øï\\F:\u009aW\u009a\u0019\u001b³50Ë£\u0095¢9\u0013â\u001e¯ð\u0003?\u0096`· §ü¤Ô\t4\u0091¹ »(\u000bêß\u0014v\u0005ýi\u0081¥â\u0094å~ÖD-\u0086\u00990©¿G\u0083\by'Ìts\u0091´\u00ad>\u001eÉez\u0003_";
      int var19 = "ÛÅz\u001a\u0089áWîî\u0087à·ìgîÈ\u0014),\u001f\u001båP\u008c\t\u009eëP! Xò\u0005yûY¥ BbÚÌ?\u001a_ö@rJ¶5C,¿\u00950Ì@&ü\u0003Ç\u0018\\¦\u0018Í|_Å\u0086¨zËãþ\u0082u\u008bNÚîG*Þ¡gö²ùF%\u0095,?q\u0018\u009c©\u0084\b\u0001Q®\u0097\u001f%\u0005\u007f\u0083¯¤?\u0087\u0093í82÷\u0013* ð\u009e\u001eéÞif\u009a\rý§Nê7Ø{¨½\u0099ëyõRkß¸HÏÏ¶uE \u0099é?\u0090\tßá*\u0095s\u0096@ÛÀÌ2S\u001b\u008eÌ²¤Y\u0093\n·Zb§ã{8\u0018X\u0097h¦þ\u008aKÈd±\u0016áWâ½\u0014bºÙ}i\u000bôc í£\tÙ\u0013ºhTS1\u009d§ÓâÿzÃ½Í/\u0090÷@\u0016\u008a\u008a\u0004JG \u0081<\u0018\u0018ó¥\u007f´´Y@Q2p«P\u0018\u00168\u000b$\u0014¦IU\u0015ÁXÚÔ\u008cTòèò\"\u0004ÍÁu÷ZG½gÆ±\u0012\u0094ìðz\u00899ÿ^\u001fÅí®ò\u0015\u008b¨µFA¥ñã?ê\u0081#_z?øï\\F:\u009aW\u009a\u0019\u001b³50Ë£\u0095¢9\u0013â\u001e¯ð\u0003?\u0096`· §ü¤Ô\t4\u0091¹ »(\u000bêß\u0014v\u0005ýi\u0081¥â\u0094å~ÖD-\u0086\u00990©¿G\u0083\by'Ìts\u0091´\u00ad>\u001eÉez\u0003_".length();
      char var16 = '`';
      int var23 = -1;

      label45:
      while(true) {
         ++var23;
         String var24 = var17.substring(var23, var23 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     f = var20;
                     g = new String[11];
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var26 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var35 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var26.init(2, var35.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Ò\u0085&\u0084(iDë\u0087°ù\u0001Iþ)Ö±n\u001e¾È>\u0086ó";
                     int var5 = "Ò\u0085&\u0084(iDë\u0087°ù\u0001Iþ)Ö±n\u001e¾È>\u0086ó".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var38 = true;
                        var6[var10001] = var10004;
                     } while(var2 < var5);

                     l = var6;
                     m = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "\u0093¡ñÝõ)\u0097\";Z÷T¢V\u0095µ)\\HN:ÚÅs«Í¶\u008e1\u009eýR(Þ÷È\u001diÙ½Ê±ðM¯4ÊsÏÂÐ<hý\\\u0092©¯\u0084m~-â%\u0013\u008d®5\tùï{´";
                  var19 = "\u0093¡ñÝõ)\u0097\";Z÷T¢V\u0095µ)\\HN:ÚÅs«Í¶\u008e1\u009eýR(Þ÷È\u001diÙ½Ê±ðM¯4ÊsÏÂÐ<hý\\\u0092©¯\u0084m~-â%\u0013\u008d®5\tùï{´".length();
                  var16 = ' ';
                  var23 = -1;
            }

            ++var23;
            var24 = var17.substring(var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native String b(byte[] var0);

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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static native int d(int var0, long var1);

   private static native int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
      if (p[var4] != null) {
         return var4;
      } else {
         Object var5 = o[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 24;
               case 1 -> var10000 = 49;
               case 2 -> var10000 = 60;
               case 3 -> var10000 = 34;
               case 4 -> var10000 = 43;
               case 5 -> var10000 = 28;
               case 6 -> var10000 = 37;
               case 7 -> var10000 = 20;
               case 8 -> var10000 = 14;
               case 9 -> var10000 = 26;
               case 10 -> var10000 = 47;
               case 11 -> var10000 = 29;
               case 12 -> var10000 = 63;
               case 13 -> var10000 = 4;
               case 14 -> var10000 = 56;
               case 15 -> var10000 = 11;
               case 16 -> var10000 = 25;
               case 17 -> var10000 = 17;
               case 18 -> var10000 = 30;
               case 19 -> var10000 = 32;
               case 20 -> var10000 = 5;
               case 21 -> var10000 = 22;
               case 22 -> var10000 = 61;
               case 23 -> var10000 = 52;
               case 24 -> var10000 = 46;
               case 25 -> var10000 = 59;
               case 26 -> var10000 = 13;
               case 27 -> var10000 = 18;
               case 28 -> var10000 = 40;
               case 29 -> var10000 = 10;
               case 30 -> var10000 = 12;
               case 31 -> var10000 = 38;
               case 32 -> var10000 = 21;
               case 33 -> var10000 = 48;
               case 34 -> var10000 = 44;
               case 35 -> var10000 = 6;
               case 36 -> var10000 = 41;
               case 37 -> var10000 = 23;
               case 38 -> var10000 = 36;
               case 39 -> var10000 = 3;
               case 40 -> var10000 = 50;
               case 41 -> var10000 = 51;
               case 42 -> var10000 = 53;
               case 43 -> var10000 = 39;
               case 44 -> var10000 = 35;
               case 45 -> var10000 = 42;
               case 46 -> var10000 = 33;
               case 47 -> var10000 = 27;
               case 48 -> var10000 = 55;
               case 49 -> var10000 = 58;
               case 50 -> var10000 = 31;
               case 51 -> var10000 = 8;
               case 52 -> var10000 = 45;
               case 53 -> var10000 = 16;
               case 54 -> var10000 = 57;
               case 55 -> var10000 = 9;
               case 56 -> var10000 = 1;
               case 57 -> var10000 = 0;
               case 58 -> var10000 = 62;
               case 59 -> var10000 = 7;
               case 60 -> var10000 = 15;
               case 61 -> var10000 = 2;
               case 62 -> var10000 = 54;
               default -> var10000 = 19;
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

            p[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = o;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Void.TYPE;
      p[4] = "c";
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
      var10000[15] = Long.TYPE;
      p[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = Boolean.TYPE;
      p[18] = "c";
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
      var10000[31] = "c";
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
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = o[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(p[var4]);
            o[var4] = var5;
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
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = p[var4];
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
               o[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     o[var4] = var13;
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

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method h(long var0, long var2);

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 198 && var8 != 214 && var8 != 197 && var8 != 205) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'i') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 233) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 198) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 214) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 197) {
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
