package com.corz.client;

import com.mojang.blaze3d.buffers.GpuBuffer;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_324;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_5819;
import net.minecraft.class_776;

public class 9_ extends class_437 implements 4s {
   private static final int 2;
   private static final int 14;
   private final class_437 7;
   private final 3n 1;
   private final class_4587 19;
   private String 1d;
   private final List 5;
   private boolean 3;
   private float 12;
   private float 1a;
   private float 6;
   private float 0;
   private GpuBuffer 8;
   private int 1J;
   private float 1m;
   private float 1H;
   private float 4;
   private boolean 15;
   private int[] 9;
   private int[] 1N;
   private int[] 16;
   private static final long a = s.a(1700304414845784086L, 7848970719973405955L, MethodHandles.lookup().lookupClass()).a(149058423713995L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;
   private static final Object[] k = new Object[282];
   private static final String[] l = new String[282];
   // $FF: synthetic field
   private static transient String hvbSOfeJqp;

   public __/* $FF was: 9_*/(long param1, class_437 param3, 3n param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25421() {
      return false;
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   private void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static 3N _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static 6s _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void method_25394(class_332 param1, int param2, int param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void method_25432() {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25402(class_11909 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25404(class_11908 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      "c".v<invokedynamic>((long)"c", var2).t<invokedynamic>("c".v<invokedynamic>((long)"c", var2), this.ß<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   private static String _/* $FF was: 2*/(char param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 9*/(int var0, char var1, int var2, 7fu var3, 7fu var4) {
      long var5 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      int var10000 = var3.ß<invokedynamic>(var3, (long)"c", var5);
      return var10000.v<invokedynamic>(var10000, var4.ß<invokedynamic>(var4, (long)"c", var5), (long)"c", var5);
   }

   private static 3N _/* $FF was: 0*/(long param0, class_776 param2, class_324 param3, class_1920 param4, class_2338 param5, class_5819 param6, class_2680 param7) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var22 = a ^ 42015045786596L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[10];
      int var29 = 0;
      String var28 = "AJN|X1{l\u0017èt\u008eÅ·x\u000e\u008cá¨W#Å×;\u00875-Z\u008a#\u0094¯\u0007=n\u0093\u0085èç] r# \u0097Àr]\u001fáxý\u0081ÿ\u0085ë±\u0081PÊ.\u001e\u001e¢\u0010\u0011±\u001d\u000f\u0085äÐøØä` `uJ·(Ø¶Z,rûEb\nNäÕ\u0084\u0007\\¬Þ\u0083\u0015\u0012[\u000e\u0016\u0081¯X»&Ïé:0Ãº(z\u001c\u00adU\u0088\u0010Ì^¸J±aà\"UZ\u000fkÂ«\u0013!(\u0093Ú\u0088ÅØ°ÿ}\u0007QÁö;2Ø\tHL4u)\u008c\u0089\u001c_lJð¨5\u0086ef\u008bÔO\u000fGu0(h\u0004ßBW»Ûø\u007fÜ\"}¿º\rXs_Í1Øþ*â*]!\u0004¦TBYÅ\u0010ñ¾ùÃjò\u0010Zì¨\fß¬êîÜ46¯T\u008e2Â(î\u008eê\u009d§¾¦Þ\u009dC6b?\u009b\u0099p\u0087¿E0©\u0096Hh³ì\u0089iÑG\u009aòÕlW±Ö\fP:";
      int var30 = "AJN|X1{l\u0017èt\u008eÅ·x\u000e\u008cá¨W#Å×;\u00875-Z\u008a#\u0094¯\u0007=n\u0093\u0085èç] r# \u0097Àr]\u001fáxý\u0081ÿ\u0085ë±\u0081PÊ.\u001e\u001e¢\u0010\u0011±\u001d\u000f\u0085äÐøØä` `uJ·(Ø¶Z,rûEb\nNäÕ\u0084\u0007\\¬Þ\u0083\u0015\u0012[\u000e\u0016\u0081¯X»&Ïé:0Ãº(z\u001c\u00adU\u0088\u0010Ì^¸J±aà\"UZ\u000fkÂ«\u0013!(\u0093Ú\u0088ÅØ°ÿ}\u0007QÁö;2Ø\tHL4u)\u008c\u0089\u001c_lJð¨5\u0086ef\u008bÔO\u000fGu0(h\u0004ßBW»Ûø\u007fÜ\"}¿º\rXs_Í1Øþ*â*]!\u0004¦TBYÅ\u0010ñ¾ùÃjò\u0010Zì¨\fß¬êîÜ46¯T\u008e2Â(î\u008eê\u009d§¾¦Þ\u009dC6b?\u009b\u0099p\u0087¿E0©\u0096Hh³ì\u0089iÑG\u009aòÕlW±Ö\fP:".length();
      char var27 = '@';
      int var36 = -1;

      label81:
      while(true) {
         ++var36;
         String var37 = var28.substring(var36, var36 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
            String var53 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var53;
                  if ((var36 += var27) >= var30) {
                     b = var31;
                     c = new String[10];
                     g = new HashMap(13);
                     Cipher var11;
                     Cipher var39 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var39.init(2, var55.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[45];
                     int var14 = 0;
                     String var15 = "mh§\u0012xI,è§åÎÎ²ñ\u0083U\u0086|\u0084\u0019¡Fõ/l]\u0016xÅÒ¢FÆ\u009c½úRTg\u009e¾To\u0004u\u0088EmÖ\u0014Á»×}\u0097\u0018a£J\u0005kBv!Ô\\È}JE¤\u00929a\u0098ªñØº+·ÉÜ\u000fúFîY\u0095\u0096ðW8PO\u0091{\u009fÄæ£íw4kX\u001b\u0080D=ÆûJ¦:º×b\u0007\u009d3¡8·~÷N\u0082ÑA\u0093.ü¹ÒÊxÝ(T0ÞçÌ5Õm\u001bd¾\u0096ÂReQ\u0082I\u001cà¹\u0097âÕøê\u0011\u0007ü\u009d\u0083\u0087\u0094<+u\u0087Iæ\u0091AÅæz\u0098\u0087\r\u0084\u008eùBd\u0098î%\u009c×_ØCVêð¡¤¦Öæ\u0083ñ¢!WYJà\u0098\"¯aÉ/\u0081å\u0001ÌuþMÎ¾2^-ä\u0099\u0012Q¾dj\u009d(\u008ci\u001bgRÿ\u0094\u00148w\r±Z\u0098\u008eÜ|&Û8Ê«#Õ\u0013}åm§¿rÑ\u0098D(øOE8ò¡|´g@\u0013\ní\u0081q\u007fcÆ¹\u0088©}r\u0095íPOÆov³¼\u0092}\u0092\u0084Å?\u000e\n@Ë\u00ad\u001b\u0097W1´!Ê¨1_\u0095\u0004>\u00885ZÅÐ&3\u0094>É\u0001";
                     int var16 = "mh§\u0012xI,è§åÎÎ²ñ\u0083U\u0086|\u0084\u0019¡Fõ/l]\u0016xÅÒ¢FÆ\u009c½úRTg\u009e¾To\u0004u\u0088EmÖ\u0014Á»×}\u0097\u0018a£J\u0005kBv!Ô\\È}JE¤\u00929a\u0098ªñØº+·ÉÜ\u000fúFîY\u0095\u0096ðW8PO\u0091{\u009fÄæ£íw4kX\u001b\u0080D=ÆûJ¦:º×b\u0007\u009d3¡8·~÷N\u0082ÑA\u0093.ü¹ÒÊxÝ(T0ÞçÌ5Õm\u001bd¾\u0096ÂReQ\u0082I\u001cà¹\u0097âÕøê\u0011\u0007ü\u009d\u0083\u0087\u0094<+u\u0087Iæ\u0091AÅæz\u0098\u0087\r\u0084\u008eùBd\u0098î%\u009c×_ØCVêð¡¤¦Öæ\u0083ñ¢!WYJà\u0098\"¯aÉ/\u0081å\u0001ÌuþMÎ¾2^-ä\u0099\u0012Q¾dj\u009d(\u008ci\u001bgRÿ\u0094\u00148w\r±Z\u0098\u008eÜ|&Û8Ê«#Õ\u0013}åm§¿rÑ\u0098D(øOE8ò¡|´g@\u0013\ní\u0081q\u007fcÆ¹\u0088©}r\u0095íPOÆov³¼\u0092}\u0092\u0084Å?\u000e\n@Ë\u00ad\u001b\u0097W1´!Ê¨1_\u0095\u0004>\u00885ZÅÐ&3\u0094>É\u0001".length();
                     int var13 = 0;

                     label63:
                     while(true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var56 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte var63 = -1;

                        while(true) {
                           long var19 = var56;
                           byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                           long var68 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                           switch (var63) {
                              case 0:
                                 var40[var10001] = var68;
                                 if (var13 >= var16) {
                                    e = var17;
                                    f = new Integer[45];
                                    14 = true.z<invokedynamic>(12977, var22 ^ 2640910127629629414L);
                                    2 = true.z<invokedynamic>(32592, var22 ^ 9058342159695493676L);
                                    j = new HashMap(13);
                                    Cipher var0;
                                    Cipher var41 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var58 = SecretKeyFactory.getInstance("DES");
                                    byte[] var65 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var65[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var41.init(2, var58.generateSecret(new DESKeySpec(var65)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4 = "4\u001c\bM\u001aO7ÀXÍ\u0091\u0019\u0017_\u0018ø";
                                    int var5 = "4\u001c\bM\u001aO7ÀXÍ\u0091\u0019\u0017_\u0018ø".length();
                                    int var2 = 0;

                                    label47:
                                    while(true) {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                       long[] var42 = var6;
                                       var10001 = var3++;
                                       long var59 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                       byte var66 = -1;

                                       while(true) {
                                          long var8 = var59;
                                          byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                          var68 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                          switch (var66) {
                                             case 0:
                                                var42[var10001] = var68;
                                                if (var2 >= var5) {
                                                   h = var6;
                                                   i = new Long[4];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var10001] = var68;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "²ßhÍ\u0016\u0092\u008fEå\u008bm%õÝ7[";
                                                var5 = "²ßhÍ\u0016\u0092\u008fEå\u008bm%õÝ7[".length();
                                                var2 = 0;
                                          }

                                          var10001 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                          var42 = var6;
                                          var10001 = var3++;
                                          var59 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                          var66 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var68;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "\t[`J\u009c+öH\u0003g¹E4#Ä3";
                                 var16 = "\t[`J\u009c+öH\u0003g¹E4#Ä3".length();
                                 var13 = 0;
                           }

                           var10001 = var13;
                           var13 += 8;
                           var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var56 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                           var63 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var36);
                  break;
               default:
                  var31[var29++] = var53;
                  if ((var36 += var27) < var30) {
                     var27 = var28.charAt(var36);
                     continue label81;
                  }

                  var28 = "ÿaÒ\u0083¾\u008e\u0012\u009e\u0091Ý\u00adÄÀ-ÇÞ(å¦¯¿áI®î?{\u000b~óX<,ÖûÕpYØ\u0010òóA\u0084Â]Ê$ú7M]\rë^B\u000e";
                  var30 = "ÿaÒ\u0083¾\u008e\u0012\u009e\u0091Ý\u00adÄÀ-ÇÞ(å¦¯¿áI®î?{\u000b~óX<,ÖûÕpYØ\u0010òóA\u0084Â]Ê$ú7M]\rë^B\u000e".length();
                  var27 = 16;
                  var36 = -1;
            }

            ++var36;
            var37 = var28.substring(var36, var36 + var27);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static long c(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (l[var4] != null) {
         return var4;
      } else {
         Object var5 = k[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 37;
               case 1 -> var10000 = 56;
               case 2 -> var10000 = 25;
               case 3 -> var10000 = 9;
               case 4 -> var10000 = 15;
               case 5 -> var10000 = 23;
               case 6 -> var10000 = 18;
               case 7 -> var10000 = 8;
               case 8 -> var10000 = 53;
               case 9 -> var10000 = 33;
               case 10 -> var10000 = 46;
               case 11 -> var10000 = 45;
               case 12 -> var10000 = 40;
               case 13 -> var10000 = 54;
               case 14 -> var10000 = 42;
               case 15 -> var10000 = 35;
               case 16 -> var10000 = 4;
               case 17 -> var10000 = 63;
               case 18 -> var10000 = 1;
               case 19 -> var10000 = 12;
               case 20 -> var10000 = 20;
               case 21 -> var10000 = 24;
               case 22 -> var10000 = 0;
               case 23 -> var10000 = 50;
               case 24 -> var10000 = 31;
               case 25 -> var10000 = 29;
               case 26 -> var10000 = 7;
               case 27 -> var10000 = 61;
               case 28 -> var10000 = 36;
               case 29 -> var10000 = 16;
               case 30 -> var10000 = 5;
               case 31 -> var10000 = 38;
               case 32 -> var10000 = 57;
               case 33 -> var10000 = 59;
               case 34 -> var10000 = 17;
               case 35 -> var10000 = 52;
               case 36 -> var10000 = 47;
               case 37 -> var10000 = 22;
               case 38 -> var10000 = 19;
               case 39 -> var10000 = 14;
               case 40 -> var10000 = 62;
               case 41 -> var10000 = 3;
               case 42 -> var10000 = 30;
               case 43 -> var10000 = 2;
               case 44 -> var10000 = 55;
               case 45 -> var10000 = 39;
               case 46 -> var10000 = 6;
               case 47 -> var10000 = 43;
               case 48 -> var10000 = 41;
               case 49 -> var10000 = 32;
               case 50 -> var10000 = 26;
               case 51 -> var10000 = 44;
               case 52 -> var10000 = 48;
               case 53 -> var10000 = 10;
               case 54 -> var10000 = 34;
               case 55 -> var10000 = 28;
               case 56 -> var10000 = 49;
               case 57 -> var10000 = 58;
               case 58 -> var10000 = 27;
               case 59 -> var10000 = 13;
               case 60 -> var10000 = 51;
               case 61 -> var10000 = 21;
               case 62 -> var10000 = 11;
               default -> var10000 = 60;
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

            l[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = k;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      l[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Float.TYPE;
      l[4] = "c";
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
      var10000[15] = Void.TYPE;
      l[15] = "c";
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
      var10000[28] = "c";
      var10000[29] = "c";
      var10000[30] = "c";
      var10000[31] = "c";
      var10000[32] = "c";
      var10000[33] = "c";
      var10000[34] = "c";
      var10000[35] = Boolean.TYPE;
      l[35] = "c";
      var10000[36] = "c";
      var10000[37] = "c";
      var10000[38] = "c";
      var10000[39] = "c";
      var10000[40] = "c";
      var10000[41] = "c";
      var10000[42] = "c";
      var10000[43] = Long.TYPE;
      l[43] = "c";
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
      var10000[78] = Double.TYPE;
      l[78] = "c";
      var10000[79] = "c";
      var10000[80] = "c";
      var10000[81] = "c";
      var10000[82] = "c";
      var10000[83] = "c";
      var10000[84] = "c";
      var10000[85] = "c";
      var10000[86] = "c";
      var10000[87] = "c";
      var10000[88] = "c";
      var10000[89] = "c";
      var10000[90] = "c";
      var10000[91] = "c";
      var10000[92] = "c";
      var10000[93] = "c";
      var10000[94] = "c";
      var10000[95] = "c";
      var10000[96] = "c";
      var10000[97] = "c";
      var10000[98] = "c";
      var10000[99] = "c";
      var10000[100] = "c";
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
      var10000[105] = "c";
      var10000[106] = "c";
      var10000[107] = "c";
      var10000[108] = "c";
      var10000[109] = "c";
      var10000[110] = "c";
      var10000[111] = "c";
      var10000[112] = "c";
      var10000[113] = "c";
      var10000[114] = "c";
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
      var10000[136] = "c";
      var10000[137] = "c";
      var10000[138] = "c";
      var10000[139] = "c";
      var10000[140] = "c";
      var10000[141] = "c";
      var10000[142] = "c";
      var10000[143] = "c";
      var10000[144] = "c";
      var10000[145] = "c";
      var10000[146] = "c";
      var10000[147] = "c";
      var10000[148] = "c";
      var10000[149] = "c";
      var10000[150] = "c";
      var10000[151] = "c";
      var10000[152] = "c";
      var10000[153] = "c";
      var10000[154] = "c";
      var10000[155] = "c";
      var10000[156] = "c";
      var10000[157] = "c";
      var10000[158] = "c";
      var10000[159] = "c";
      var10000[160] = "c";
      var10000[161] = "c";
      var10000[162] = "c";
      var10000[163] = "c";
      var10000[164] = "c";
      var10000[165] = "c";
      var10000[166] = "c";
      var10000[167] = "c";
      var10000[168] = "c";
      var10000[169] = "c";
      var10000[170] = "c";
      var10000[171] = "c";
      var10000[172] = "c";
      var10000[173] = "c";
      var10000[174] = "c";
      var10000[175] = "c";
      var10000[176] = "c";
      var10000[177] = "c";
      var10000[178] = "c";
      var10000[179] = "c";
      var10000[180] = "c";
      var10000[181] = "c";
      var10000[182] = "c";
      var10000[183] = "c";
      var10000[184] = "c";
      var10000[185] = "c";
      var10000[186] = "c";
      var10000[187] = "c";
      var10000[188] = "c";
      var10000[189] = "c";
      var10000[190] = "c";
      var10000[191] = "c";
      var10000[192] = "c";
      var10000[193] = "c";
      var10000[194] = "c";
      var10000[195] = "c";
      var10000[196] = "c";
      var10000[197] = "c";
      var10000[198] = "c";
      var10000[199] = "c";
      var10000[200] = "c";
      var10000[201] = "c";
      var10000[202] = "c";
      var10000[203] = "c";
      var10000[204] = "c";
      var10000[205] = "c";
      var10000[206] = "c";
      var10000[207] = "c";
      var10000[208] = "c";
      var10000[209] = "c";
      var10000[210] = "c";
      var10000[211] = "c";
      var10000[212] = "c";
      var10000[213] = "c";
      var10000[214] = "c";
      var10000[215] = "c";
      var10000[216] = "c";
      var10000[217] = "c";
      var10000[218] = "c";
      var10000[219] = "c";
      var10000[220] = "c";
      var10000[221] = "c";
      var10000[222] = "c";
      var10000[223] = "c";
      var10000[224] = "c";
      var10000[225] = "c";
      var10000[226] = "c";
      var10000[227] = "c";
      var10000[228] = "c";
      var10000[229] = "c";
      var10000[230] = "c";
      var10000[231] = "c";
      var10000[232] = "c";
      var10000[233] = "c";
      var10000[234] = "c";
      var10000[235] = "c";
      var10000[236] = "c";
      var10000[237] = "c";
      var10000[238] = "c";
      var10000[239] = "c";
      var10000[240] = "c";
      var10000[241] = "c";
      var10000[242] = "c";
      var10000[243] = "c";
      var10000[244] = "c";
      var10000[245] = "c";
      var10000[246] = "c";
      var10000[247] = "c";
      var10000[248] = "c";
      var10000[249] = "c";
      var10000[250] = "c";
      var10000[251] = "c";
      var10000[252] = "c";
      var10000[253] = "c";
      var10000[254] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
      var10000["c"] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = k[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(l[var4]);
            k[var4] = var5;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     k[var4] = var13;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var26;
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
                     k[var4] = var19;
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
         if (var8 != 223 && var8 != 253 && var8 != 208 && var8 != 227) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 't') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'v') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 223) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 253) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 208) {
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

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
