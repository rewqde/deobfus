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
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_4184;
import net.minecraft.class_757;

public class 18 extends 9a {
   private static final double 5 = (double)64.0F;
   private static final int 6A;
   private static final int 1;
   private final 44 8;
   private final 4H 6i;
   private final 4H 64;
   private final 4H 6;
   private volatile List 3;
   private final AtomicBoolean 9;
   private final Set 2;
   private ExecutorService 0;
   private int 7;
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
   private static transient String tvtwZmhYho;

   public _8/* $FF was: 18*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private static 4R _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static List _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static List _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private class_243 _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      class_243 var4 = (class_243)var1[1];
      var2 = b ^ var2;
      class_757 var10000 = "c".ä<invokedynamic>((long)"c", var2).d<invokedynamic>("c".ä<invokedynamic>((long)"c", var2), (long)"c", var2);
      class_4184 var5 = var10000.Ñ<invokedynamic>(var10000, (long)"c", var2);
      double var17 = (double)var5.Ñ<invokedynamic>(var5, (long)"c", var2);
      double var6 = var17.T<invokedynamic>(var17, (long)"c", var2);
      var17 = (double)var5.Ñ<invokedynamic>(var5, (long)"c", var2);
      double var8 = var17.T<invokedynamic>(var17, (long)"c", var2);
      double var10 = var4.d<invokedynamic>(var4, (long)"c", var2) - var6.T<invokedynamic>(var6, (long)"c", var2) * var8.T<invokedynamic>(var8, (long)"c", var2) * "c";
      double var12 = var4.d<invokedynamic>(var4, (long)"c", var2) - var8.T<invokedynamic>(var8, (long)"c", var2) * "c";
      double var14 = var4.d<invokedynamic>(var4, (long)"c", var2) + var6.T<invokedynamic>(var6, (long)"c", var2) * var8.T<invokedynamic>(var8, (long)"c", var2) * "c";
      return new class_243(var10, var12, var14);
   }

   public int _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      List var10000 = this.d<invokedynamic>(this, (long)"c", var2);
      return var10000.Ñ<invokedynamic>(var10000, (long)"c", var2);
   }

   private static int _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 9*/(long var0, double var2, double var4, double var6, 76Z var8) {
      var0 = b ^ var0;
      double var9 = (var8.Ñ<invokedynamic>(var8, (long)"c", var0) + var8.Ñ<invokedynamic>(var8, (long)"c", var0)) / "c" - var2;
      double var11 = (var8.Ñ<invokedynamic>(var8, (long)"c", var0) + var8.Ñ<invokedynamic>(var8, (long)"c", var0)) / "c" - var4;
      double var13 = (var8.Ñ<invokedynamic>(var8, (long)"c", var0) + var8.Ñ<invokedynamic>(var8, (long)"c", var0)) / "c" - var6;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   private static boolean _/* $FF was: 1*/(long param0, Map param2, class_2338 param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 6*/(long var0, class_2680 var2) {
      var0 = b ^ var0;
      return var2.Ñ<invokedynamic>(var2, "c".ä<invokedynamic>((long)"c", var0), (long)"c", var0);
   }

   private void _/* $FF was: 4*/(List param1, long param2, boolean param4, int param5, int param6, double param7, double param9, double param11) {
      // $FF: Couldn't be decompiled
   }

   private static Thread _/* $FF was: 1*/(long param0, Runnable param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(18.class, 595);
      b = com.corz.client.s.a(-3830650161817747781L, -9051999071095905112L, MethodHandles.lookup().lookupClass()).a(155126469961958L);
      o = new Object[229];
      p = new String[229];
      b();
      h = new HashMap(13);
      long var11 = b ^ 36678533578409L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "\u001cN\u009a6¨I$òÙtmÔ[äÖÒÝa,HK¨ýf\u000bÌÃÅ\u0086\u0086\u0086ÿV\\IY\u009fR¨\u00050ÉÈügh\u009f7\u00063-\u0010\u00883_+Èyê&ù\u008a\u0013$Ã´×\u009bßHS/ÄÖ\u000e¸VlL~ü:Ï°E/þBâ";
      int var19 = "\u001cN\u009a6¨I$òÙtmÔ[äÖÒÝa,HK¨ýf\u000bÌÃÅ\u0086\u0086\u0086ÿV\\IY\u009fR¨\u00050ÉÈügh\u009f7\u00063-\u0010\u00883_+Èyê&ù\u008a\u0013$Ã´×\u009bßHS/ÄÖ\u000e¸VlL~ü:Ï°E/þBâ".length();
      char var16 = '(';
      int var15 = -1;

      while(true) {
         ++var15;
         byte[] var21 = var13.doFinal(var17.substring(var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = b(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            f = var20;
            g = new String[2];
            n = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var32 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var32.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[33];
            int var3 = 0;
            String var4 = "ÊÝ\u009fÛü¢9\u000f\u0098\u0094\u0097\u0080@WÝàèL]\u009bnÀÌ\u001d\u008c3C6KÐU<\u0085Ù/ü\u0002\riªiÆØXªU§RTçbÞÒ\u0095(\b\u009bÞ°NÂ\u001bë\u0094¤z<\u001fgQå-\u0015\u001fÖö\f¨\u0095h\u0095*G\rf@ô,ú/\u0086Ù\u008eBQ=J\u0015þ:X\u000e\u000b\u0085\u0007Î\u0097Ù¸Çè\u0012\u0099gtµ]$.þ\u0083òR\u001d[s\u000eÞ.P\u0080*ñg-¤¬¹\u0089\u0002ìÁÅ\u0094¾å2+ýy¶\u0092{Îë\u0085[ì¢_D\u008cìÐ«¶\u0084<¯7M'¥.õ;#+ÉO!3\u0007¾Îý7=\u008d\u001a°\u009d\u009649Vû*\u0092\u00120\u0016\u001d\u001b\u0086\u0085îõ9.{;\u008fÓèÎ'\u0005A\u0007\u0089\u009e79\u00841e\u0099|\u009f\u0098[Éø\u0083Áï\u0013§:Ó\t\u0081\u0014éÉ\u009f\u008b";
            int var5 = "ÊÝ\u009fÛü¢9\u000f\u0098\u0094\u0097\u0080@WÝàèL]\u009bnÀÌ\u001d\u008c3C6KÐU<\u0085Ù/ü\u0002\riªiÆØXªU§RTçbÞÒ\u0095(\b\u009bÞ°NÂ\u001bë\u0094¤z<\u001fgQå-\u0015\u001fÖö\f¨\u0095h\u0095*G\rf@ô,ú/\u0086Ù\u008eBQ=J\u0015þ:X\u000e\u000b\u0085\u0007Î\u0097Ù¸Çè\u0012\u0099gtµ]$.þ\u0083òR\u001d[s\u000eÞ.P\u0080*ñg-¤¬¹\u0089\u0002ìÁÅ\u0094¾å2+ýy¶\u0092{Îë\u0085[ì¢_D\u008cìÐ«¶\u0084<¯7M'¥.õ;#+ÉO!3\u0007¾Îý7=\u008d\u001a°\u009d\u009649Vû*\u0092\u00120\u0016\u001d\u001b\u0086\u0085îõ9.{;\u008fÓèÎ'\u0005A\u0007\u0089\u009e79\u00841e\u0099|\u009f\u0098[Éø\u0083Áï\u0013§:Ó\t\u0081\u0014éÉ\u009f\u008b".length();
            int var2 = 0;

            label32:
            while(true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
               byte var36 = -1;

               while(true) {
                  long var8 = var33;
                  byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                  long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           l = var6;
                           m = new Integer[33];
                           1 = true.f<invokedynamic>(16925, var11 ^ 5197563743368273779L);
                           6A = true.f<invokedynamic>(11188, var11 ^ 6791604535864211145L);
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "Ú\u009a\u0005®^I·ç7\u0003ö\u0002\t¨¾ò";
                        var5 = "Ú\u009a\u0005®^I·ç7\u0003ö\u0002\t¨¾ò".length();
                        var2 = 0;
                  }

                  var10001 = var2;
                  var2 += 8;
                  var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
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
               case 0 -> var10000 = 23;
               case 1 -> var10000 = 15;
               case 2 -> var10000 = 37;
               case 3 -> var10000 = 12;
               case 4 -> var10000 = 46;
               case 5 -> var10000 = 58;
               case 6 -> var10000 = 9;
               case 7 -> var10000 = 18;
               case 8 -> var10000 = 24;
               case 9 -> var10000 = 3;
               case 10 -> var10000 = 57;
               case 11 -> var10000 = 49;
               case 12 -> var10000 = 25;
               case 13 -> var10000 = 17;
               case 14 -> var10000 = 40;
               case 15 -> var10000 = 27;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 7;
               case 18 -> var10000 = 16;
               case 19 -> var10000 = 0;
               case 20 -> var10000 = 10;
               case 21 -> var10000 = 21;
               case 22 -> var10000 = 63;
               case 23 -> var10000 = 51;
               case 24 -> var10000 = 59;
               case 25 -> var10000 = 19;
               case 26 -> var10000 = 61;
               case 27 -> var10000 = 29;
               case 28 -> var10000 = 36;
               case 29 -> var10000 = 30;
               case 30 -> var10000 = 8;
               case 31 -> var10000 = 14;
               case 32 -> var10000 = 34;
               case 33 -> var10000 = 35;
               case 34 -> var10000 = 62;
               case 35 -> var10000 = 13;
               case 36 -> var10000 = 33;
               case 37 -> var10000 = 5;
               case 38 -> var10000 = 50;
               case 39 -> var10000 = 47;
               case 40 -> var10000 = 20;
               case 41 -> var10000 = 44;
               case 42 -> var10000 = 39;
               case 43 -> var10000 = 54;
               case 44 -> var10000 = 4;
               case 45 -> var10000 = 28;
               case 46 -> var10000 = 31;
               case 47 -> var10000 = 48;
               case 48 -> var10000 = 56;
               case 49 -> var10000 = 32;
               case 50 -> var10000 = 52;
               case 51 -> var10000 = 43;
               case 52 -> var10000 = 22;
               case 53 -> var10000 = 53;
               case 54 -> var10000 = 1;
               case 55 -> var10000 = 2;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 41;
               case 59 -> var10000 = 60;
               case 60 -> var10000 = 45;
               case 61 -> var10000 = 55;
               case 62 -> var10000 = 38;
               default -> var10000 = 6;
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

   private static native void b();

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

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'd' && var8 != 'y' && var8 != 228 && var8 != 'O') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 209) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'T') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'd') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'y') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 228) {
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

   private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);
}
