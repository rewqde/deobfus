package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 8F {
   public static final int 0;
   private final 7f[] 4;
   private int 8;
   private int 7;
   private int 3;
   private long 5;
   private int 1;
   private float 9;
   private float 4c;
   public static final int 4L;
   private final Map 2;
   private 5W 6;
   private static final long a;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;
   private static final Object[] i;
   private static final String[] j;
   // $FF: synthetic field
   private static transient String NbcryDCnmw;

   public _F/* $FF was: 8F*/(short param1, int param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public float _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7f _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7f _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(8F.class, 759);
      a = s.a(-3249109970814892860L, -5958104960289655490L, MethodHandles.lookup().lookupClass()).a(152707767295694L);
      i = new Object[99];
      j = new String[99];
      a();
      long var22 = a ^ 138147952099867L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var26 = var24.doFinal("\u0013¯ù¢Ø\u000eílrx'³»ç\u009b7þ®\u001e&T }$ÀQÈ§a\u001fIÀØò\u0013Q{àÁ\u0012&\u0000\u001c×\u0003¬µ?à'ËÉ\u0094Ó\u008fTe¹\u009a\u009eõÀè&sw»ÈDó\u0082\\~&²\u0098Ø]bl\u0005òç_å\u009a\u00adlVBå\u0098ªS\u009dÎûG§Ô\u0092c&3«À\u00851û\u0013v;\u0018\u0085¾Uä¦¼ìZaq¨2ÀËZÕ\u009a\u0085\u001eG®ý\u000f\u009a\u0011^jÖ^aùÓ9æà\u0016Çcj»Ð\"\u001eÞÂR\b¾âõº\u0094[\u0006ê\u0007\u0099o\u0086\u0093MSö\u007f\n\u0005QS«Åï#\u0000'o8nF\u0015\u008fà\u0086&óq\"JðP¬\u0017Ä\u0011$îÌ\u0093¹Æ/\u009f\u00054Àñ\u00153È®~\u0013ò\u001eÏ<áÊÀ\u0080-\u0094( êt:ÈÌ©z\u001e¸ÎÎ.'\u0085 m7\u0014Ðð°5´8þA\u001aªEÝcU\u0087¯\u001fÕKdÈ¼Ð òðKO\u0093o-*áâ\u008b\u00addÇ\u009dLÔ2".getBytes("ISO-8859-1"));
      String var36 = a(var26).intern();
      int var10001 = -1;
      b = var36;
      e = new HashMap(13);
      Cipher var11;
      var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var37 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
      }

      var10000.init(2, var37.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var17 = new long[24];
      int var14 = 0;
      String var15 = "ì\u001c\u00970\u00ad\u001a$õ\u0019\u009e¦g--jºþs®G\u000bË\tÂ\u0084vÌr´Èá\u001b ºYÍY\b\u0016;\u000bo\u0007\u008aoÿB4gtÐÁ\u009d\u009b6\u009cíe2Å¼\r-rÕ2¤l.õ\u00071\u008br¯\u008d\u000fÞsþPy³Ùïþ»\u0013#t\u0087\u0085µ2p¦\u001c/R¹\u0097ÒÄâ*¤MÞ\u0007¢Á¸\u0004gé@xT\u0092t\u0082\u001c\f³ÄÍ¤çMû¬\u0097\u0086\u0005$ò*zó<UÍ! <\u0018\u0097\u0019ðg#:\u0090&\u0018\u0099ÓÕÅR/\u0006\u0014Ö\u0011@\u009dÖ\u001b\u0012\u000bZL«ðï";
      int var16 = "ì\u001c\u00970\u00ad\u001a$õ\u0019\u009e¦g--jºþs®G\u000bË\tÂ\u0084vÌr´Èá\u001b ºYÍY\b\u0016;\u000bo\u0007\u008aoÿB4gtÐÁ\u009d\u009b6\u009cíe2Å¼\r-rÕ2¤l.õ\u00071\u008br¯\u008d\u000fÞsþPy³Ùïþ»\u0013#t\u0087\u0085µ2p¦\u001c/R¹\u0097ÒÄâ*¤MÞ\u0007¢Á¸\u0004gé@xT\u0092t\u0082\u001c\f³ÄÍ¤çMû¬\u0097\u0086\u0005$ò*zó<UÍ! <\u0018\u0097\u0019ðg#:\u0090&\u0018\u0099ÓÕÅR/\u0006\u0014Ö\u0011@\u009dÖ\u001b\u0012\u000bZL«ðï".length();
      int var13 = 0;

      label47:
      while(true) {
         var10001 = var13;
         var13 += 8;
         byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
         long[] var29 = var17;
         var10001 = var14++;
         long var38 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
         byte var42 = -1;

         while(true) {
            long var19 = var38;
            byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
            long var46 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
            switch (var42) {
               case 0:
                  var29[var10001] = var46;
                  if (var13 >= var16) {
                     c = var17;
                     d = new Integer[24];
                     4L = true.t<invokedynamic>(17139, var22 ^ 2064301114506177161L);
                     0 = true.t<invokedynamic>(3990, var22 ^ 3705909246727530478L);
                     h = new HashMap(13);
                     Cipher var0;
                     Cipher var30 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var40 = SecretKeyFactory.getInstance("DES");
                     byte[] var44 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var44[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                     }

                     var30.init(2, var40.generateSecret(new DESKeySpec(var44)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "Z\u0018èJ\u0098Ü\fkrùv'\u0000)éq";
                     int var5 = "Z\u0018èJ\u0098Ü\fkrùv'\u0000)éq".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var45 = true;
                        var6[var10001] = var46;
                     } while(var2 < var5);

                     f = var6;
                     g = new Long[2];
                     return;
                  }
                  break;
               default:
                  var29[var10001] = var46;
                  if (var13 < var16) {
                     continue label47;
                  }

                  var15 = "öm\u0099\u0018©üCÂ«iéûRÀÆ\u0088";
                  var16 = "öm\u0099\u0018©üCÂ«iéûRÀÆ\u0088".length();
                  var13 = 0;
            }

            var10001 = var13;
            var13 += 8;
            var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
            var29 = var17;
            var10001 = var14++;
            var38 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
            var42 = 0;
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

   private static long b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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

   private static native int a(long var0, long var2);

   private static native void a();

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

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'x' && var8 != 221 && var8 != 'k' && var8 != 211) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'Z') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 199) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'x') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 221) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'k') {
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
