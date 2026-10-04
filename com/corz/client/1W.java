package com.corz.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_634;
import net.minecraft.class_640;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class 1w extends 9a {
   public static Matrix4f 8L;
   public static Matrix4f 8p;
   public static Matrix4f 8n;
   private final 4H 8u;
   private final 44 3;
   private final 4H 8w;
   private final 4H 8a;
   private final 4H 8t;
   private final 4H 8b;
   private final 4H 8Q;
   private final 4H 8;
   private final 4H 86;
   private final 4H 8Y;
   private final 4H 80;
   private final 4H 83;
   private final 4H 8C;
   private final 4A 8g;
   private static final float 88 = 4.0F;
   private static final float 8m = 2.0F;
   private static final float 8c = 3.0F;
   private static final float 8Z = 16.0F;
   private static final float 87 = 2.0F;
   private static final float 8z = 2.0F;
   private static final float 1 = 2.0F;
   private static final float 8N = 1.0F;
   private static final float 81 = 3.0F;
   private static final float 8P = 4.0F;
   private static final float 8A = 3.0F;
   private static final float 0 = 6.0F;
   private static final float 5 = 4.0F;
   private static final float 7 = 180.0F;
   private static final float 8V = 0.92F;
   private static final float 8W = 130.0F;
   private static final float 8I = 24.0F;
   private static final float 8d = 1.0F;
   private static final float 8H = 0.72F;
   private static final int 82;
   private static final int 8F;
   private static final int 9;
   private static final int 6;
   private static final int 8X;
   private static final int 8s;
   private static final int 2;
   private final Map 8y;
   private long 8x;
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
   private static transient String TXJRNGWqHO;

   public _w/* $FF was: 1w*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _/* $FF was: 0*/();

   public void _/* $FF was: 8*/(762 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private float _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] var1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      7Mj[] var5 = "c".Â<invokedynamic>((long)"c", var2);

      try {
         Class var10000 = "c".Å<invokedynamic>((long)"c", var2);
         class_634 var6 = var10000.X<invokedynamic>(var10000, (long)"c", var2);

         label40: {
            try {
               var10000 = var6;
               if (var5 == null) {
                  break label40;
               }

               if (var6 == null) {
                  return -1;
               }
            } catch (Throwable var9) {
               throw var9.Â<invokedynamic>(var9, (long)"c", var2);
            }

            var10000 = var6;
         }

         class_640 var7 = var10000.X<invokedynamic>(var10000, ((class_1657)var1[1]).X<invokedynamic>((class_1657)var1[1], (long)"c", var2), (long)"c", var2);

         try {
            if (var7 != null) {
               var13 = 0.Â<invokedynamic>(0, var7.X<invokedynamic>(var7, (long)"c", var2), (long)"c", var2);
               return var13;
            }
         } catch (Throwable var8) {
            throw var8.Â<invokedynamic>(var8, (long)"c", var2);
         }

         var13 = -1;
         return var13;
      } catch (Throwable var10) {
         return -1;
      }
   }

   private static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static Color _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static float _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 0*/(Object[] var0) {
      double var4 = (Double)var0[1];
      float var1 = (Float)var0[2];
      double var2 = (Double)var0[0];
      return var2 + (var4 - var2) * (double)var1;
   }

   private static float _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private class_243 _/* $FF was: 0*/(Object[] var1) {
      long var3 = (Long)var1[0];
      class_243 var2 = (class_243)var1[1];
      var3 = b ^ var3;
      Class var10000 = "c".Å<invokedynamic>((long)"c", var3).¤<invokedynamic>("c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      class_4184 var5 = var10000.X<invokedynamic>(var10000, (long)"c", var3);
      var10000 = "c".Å<invokedynamic>((long)"c", var3).X<invokedynamic>("c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      int var6 = var10000.X<invokedynamic>(var10000, (long)"c", var3);
      var10000 = "c".Å<invokedynamic>((long)"c", var3).X<invokedynamic>("c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      int var7 = var10000.X<invokedynamic>(var10000, (long)"c", var3);
      int[] var8 = new int[]{0, 0, var6, var7};
      class_243 var9 = var5.X<invokedynamic>(var5, (long)"c", var3);
      float var10 = (float)(var2.¤<invokedynamic>(var2, (long)"c", var3) - var9.¤<invokedynamic>(var9, (long)"c", var3));
      float var11 = (float)(var2.¤<invokedynamic>(var2, (long)"c", var3) - var9.¤<invokedynamic>(var9, (long)"c", var3));
      float var12 = (float)(var2.¤<invokedynamic>(var2, (long)"c", var3) - var9.¤<invokedynamic>(var9, (long)"c", var3));
      var10000 = (new Matrix4f("c".Å<invokedynamic>((long)"c", var3))).X<invokedynamic>(new Matrix4f("c".Å<invokedynamic>((long)"c", var3)), "c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      Matrix4f var13 = var10000.X<invokedynamic>(var10000, "c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      Vector3f var14 = new Vector3f();
      var13.X<invokedynamic>(var13, var10, var11, var12, var8, var14, (long)"c", var3);
      var10000 = "c".Å<invokedynamic>((long)"c", var3).X<invokedynamic>("c".Å<invokedynamic>((long)"c", var3), (long)"c", var3);
      double var15 = (double)var10000.X<invokedynamic>(var10000, (long)"c", var3);
      return new class_243((double)var14.¤<invokedynamic>(var14, (long)"c", var3) / var15, (double)((float)var7 - var14.¤<invokedynamic>(var14, (long)"c", var3)) / var15, (double)var14.¤<invokedynamic>(var14, (long)"c", var3));
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static 73P _/* $FF was: 2*/(UUID var0) {
      return new 73P();
   }

   private static boolean _/* $FF was: 1*/(long var0, Map.Entry var2) {
      var0 = b ^ var0;
      7Mj[] var3 = "c".Â<invokedynamic>((long)"c", var0);

      boolean var10000;
      label32: {
         try {
            var10000 = ((73P)var2.X<invokedynamic>(var2, (long)"c", var0)).¤<invokedynamic>((73P)var2.X<invokedynamic>(var2, (long)"c", var0), (long)"c", var0);
            if (var3 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var4) {
            throw var4.Â<invokedynamic>(var4, (long)"c", var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      a.b99571f71427e3b19.a.init(1w.class, 161);
      b = com.corz.client.s.a(-921955667810798997L, -3272713394807228126L, MethodHandles.lookup().lookupClass()).a(100369263187676L);
      long var31 = b ^ 116022109049096L;
      t = new Object[258];
      u = new String[258];
      b();
      h = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[3];
      int var27 = 0;
      String var26 = "ê²ï$\u008cJS§Ý¼ÔJ/Nèk\u0010\"å£Tv7\u0017b\u0086]MËq\"«þ\u0010ör\u0084½\u0081Ç\u0098>\f%>\rÛ\u001b°æ";
      int var28 = "ê²ï$\u008cJS§Ý¼ÔJ/Nèk\u0010\"å£Tv7\u0017b\u0086]MËq\"«þ\u0010ör\u0084½\u0081Ç\u0098>\f%>\rÛ\u001b°æ".length();
      char var25 = 16;
      int var24 = -1;

      while(true) {
         ++var24;
         byte[] var30 = var22.doFinal(var26.substring(var24, var24 + var25).getBytes("ISO-8859-1"));
         String var44 = b(var30).intern();
         int var10001 = -1;
         var29[var27++] = var44;
         if ((var24 += var25) >= var28) {
            f = var29;
            g = new String[3];
            n = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            SecretKeyFactory var46 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var12 = 1; var12 < 8; ++var12) {
               var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
            }

            var10000.init(2, var46.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[48];
            int var14 = 0;
            String var15 = " \"&\u0080ìµóÀ\u0082`kCÝ\u001e\u009a×¦ÀáçkÀCL§M!\u0096j\u000f\u0084eeâ¨m\u0084\u0096ÉpJ¸µTµD\u0018ÉL9\u0096+\u0087ó¦N\tÜ@\u0096(·ú&ÿÀ¸¦ñnÄHV\u001dd\u0014\u0089¹¯ëÇgÃpw÷\u009e³\u0004¢&\u0002ã2\u0016;y\u001e\u009bÆÃ\u0094Î\u0089ÎÚ±CØ\u001e¶¬\u0019÷UÍDj\u0097\u0094V®äP{ýl\u001dl®\u0007qÜ\u0089yË\u0094ã\u009a\u0081÷b¡Xp>-ht¾\u009eÓ\u0095C\u0094¨ÊýÒÈR\u0015Àe6\u0089¡\u008e=zBÀ\u001b½}*®\u0084\u0084ë¿<Ï±\u0097áÜ\u008e0CóX@)[\u0010Ý\u0005ó©2\u0090Ñöl»\u0007\u0084\u0011\u009eÝ½ä\u00897³~Ä\u0089\u00adb$ÞKÇÁr\n\u0010iÕû¡\u008f\u001ak§\u0015 ¼yï»ÿu5J\u0000_\r\u009c\u0088\u0089°(\u0001É\u0019\t»´on¢º²@³E^r(1½<H\u008f[\u0093\u0086h,\u001f\u008c'dhBÍ.ú\u0018\u0015\u0015<OÂ\u0097:\u008bÛû3\u0091\u000eËIV\u008fE{õ(z+\tTÎ(\t\u001döÀ\u00160o7Z\u008dØ\u0089)·`\u009fVÆü×¶ëY\u000e\u008cÍ®JTô×Û¿9 ÃG®ã®ÞÌ\u0089\u008f\u001d(z/õ";
            int var16 = " \"&\u0080ìµóÀ\u0082`kCÝ\u001e\u009a×¦ÀáçkÀCL§M!\u0096j\u000f\u0084eeâ¨m\u0084\u0096ÉpJ¸µTµD\u0018ÉL9\u0096+\u0087ó¦N\tÜ@\u0096(·ú&ÿÀ¸¦ñnÄHV\u001dd\u0014\u0089¹¯ëÇgÃpw÷\u009e³\u0004¢&\u0002ã2\u0016;y\u001e\u009bÆÃ\u0094Î\u0089ÎÚ±CØ\u001e¶¬\u0019÷UÍDj\u0097\u0094V®äP{ýl\u001dl®\u0007qÜ\u0089yË\u0094ã\u009a\u0081÷b¡Xp>-ht¾\u009eÓ\u0095C\u0094¨ÊýÒÈR\u0015Àe6\u0089¡\u008e=zBÀ\u001b½}*®\u0084\u0084ë¿<Ï±\u0097áÜ\u008e0CóX@)[\u0010Ý\u0005ó©2\u0090Ñöl»\u0007\u0084\u0011\u009eÝ½ä\u00897³~Ä\u0089\u00adb$ÞKÇÁr\n\u0010iÕû¡\u008f\u001ak§\u0015 ¼yï»ÿu5J\u0000_\r\u009c\u0088\u0089°(\u0001É\u0019\t»´on¢º²@³E^r(1½<H\u008f[\u0093\u0086h,\u001f\u008c'dhBÍ.ú\u0018\u0015\u0015<OÂ\u0097:\u008bÛû3\u0091\u000eËIV\u008fE{õ(z+\tTÎ(\t\u001döÀ\u00160o7Z\u008dØ\u0089)·`\u009fVÆü×¶ëY\u000e\u008cÍ®JTô×Û¿9 ÃG®ã®ÞÌ\u0089\u008f\u001d(z/õ".length();
            int var13 = 0;

            label50:
            while(true) {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               long[] var36 = var17;
               var10001 = var14++;
               long var47 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
               byte var51 = -1;

               while(true) {
                  long var19 = var47;
                  byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                  long var55 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                  switch (var51) {
                     case 0:
                        var36[var10001] = var55;
                        if (var13 >= var16) {
                           l = var17;
                           m = new Integer[48];
                           2 = true.k<invokedynamic>(14792, var31 ^ 4330588816469354935L);
                           9 = true.k<invokedynamic>(16663, var31 ^ 67178393497375061L);
                           6 = true.k<invokedynamic>(29395, var31 ^ 8548356455392223902L);
                           8X = true.k<invokedynamic>(18312, var31 ^ 6962034097965799413L);
                           8F = true.k<invokedynamic>(6484, var31 ^ 8344316222339696908L);
                           8s = true.k<invokedynamic>(13995, var31 ^ 6440807935375599354L);
                           82 = true.k<invokedynamic>(5371, var31 ^ 1729581961545827456L);
                           q = new HashMap(13);
                           Cipher var0;
                           Cipher var37 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           SecretKeyFactory var49 = SecretKeyFactory.getInstance("DES");
                           byte[] var53 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                           for(int var1 = 1; var1 < 8; ++var1) {
                              var53[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                           }

                           var37.init(2, var49.generateSecret(new DESKeySpec(var53)), new IvParameterSpec(new byte[8]));
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4 = "X¬\u001bTÔ\u001e\u000e£PL\u00875¢)òª";
                           int var5 = "X¬\u001bTÔ\u001e\u000e£PL\u00875¢)òª".length();
                           int var2 = 0;

                           do {
                              var10001 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                              var10001 = var3++;
                              long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                              byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                              var55 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                              boolean var54 = true;
                              var6[var10001] = var55;
                           } while(var2 < var5);

                           o = var6;
                           p = new Long[2];
                           (new Matrix4f()).v<invokedynamic>(new Matrix4f(), 7287852301959696599L, var31);
                           (new Matrix4f()).v<invokedynamic>(new Matrix4f(), 7287198720786620789L, var31);
                           (new Matrix4f()).v<invokedynamic>(new Matrix4f(), 7288945877705782848L, var31);
                           return;
                        }
                        break;
                     default:
                        var36[var10001] = var55;
                        if (var13 < var16) {
                           continue label50;
                        }

                        var15 = "\u007f\u008d2 W\u0088ç'\u0007Lâ\u008d\u0010[6½";
                        var16 = "\u007f\u008d2 W\u0088ç'\u0007Lâ\u008d\u0010[6½".length();
                        var13 = 0;
                  }

                  var10001 = var13;
                  var13 += 8;
                  var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                  var36 = var17;
                  var10001 = var14++;
                  var47 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                  var51 = 0;
               }
            }
         }

         var25 = var26.charAt(var24);
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static long e(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long e(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (u[var4] != null) {
         return var4;
      } else {
         Object var5 = t[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 44;
               case 1 -> var10000 = 55;
               case 2 -> var10000 = 6;
               case 3 -> var10000 = 10;
               case 4 -> var10000 = 36;
               case 5 -> var10000 = 35;
               case 6 -> var10000 = 39;
               case 7 -> var10000 = 31;
               case 8 -> var10000 = 45;
               case 9 -> var10000 = 37;
               case 10 -> var10000 = 40;
               case 11 -> var10000 = 19;
               case 12 -> var10000 = 61;
               case 13 -> var10000 = 60;
               case 14 -> var10000 = 54;
               case 15 -> var10000 = 25;
               case 16 -> var10000 = 34;
               case 17 -> var10000 = 50;
               case 18 -> var10000 = 5;
               case 19 -> var10000 = 15;
               case 20 -> var10000 = 1;
               case 21 -> var10000 = 43;
               case 22 -> var10000 = 16;
               case 23 -> var10000 = 11;
               case 24 -> var10000 = 3;
               case 25 -> var10000 = 24;
               case 26 -> var10000 = 53;
               case 27 -> var10000 = 26;
               case 28 -> var10000 = 0;
               case 29 -> var10000 = 46;
               case 30 -> var10000 = 42;
               case 31 -> var10000 = 28;
               case 32 -> var10000 = 23;
               case 33 -> var10000 = 17;
               case 34 -> var10000 = 59;
               case 35 -> var10000 = 22;
               case 36 -> var10000 = 32;
               case 37 -> var10000 = 9;
               case 38 -> var10000 = 14;
               case 39 -> var10000 = 49;
               case 40 -> var10000 = 29;
               case 41 -> var10000 = 13;
               case 42 -> var10000 = 21;
               case 43 -> var10000 = 30;
               case 44 -> var10000 = 56;
               case 45 -> var10000 = 7;
               case 46 -> var10000 = 2;
               case 47 -> var10000 = 52;
               case 48 -> var10000 = 33;
               case 49 -> var10000 = 41;
               case 50 -> var10000 = 38;
               case 51 -> var10000 = 51;
               case 52 -> var10000 = 8;
               case 53 -> var10000 = 20;
               case 54 -> var10000 = 4;
               case 55 -> var10000 = 63;
               case 56 -> var10000 = 18;
               case 57 -> var10000 = 62;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 47;
               case 60 -> var10000 = 12;
               case 61 -> var10000 = 57;
               case 62 -> var10000 = 48;
               default -> var10000 = 27;
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

            u[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = t;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Boolean.TYPE;
      u[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Integer.TYPE;
      u[8] = "c";
      var10000[9] = Float.TYPE;
      u[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = Long.TYPE;
      u[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = "c";
      var10000[29] = Void.TYPE;
      u[29] = "c";
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
      var10000[40] = Character.TYPE;
      u[40] = "c";
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
      var10000[51] = Double.TYPE;
      u[51] = "c";
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
      var10000[78] = "c";
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
   }

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
         if (var8 != 164 && var8 != 237 && var8 != 197 && var8 != 'v') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'X') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 194) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 164) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 237) {
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

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite g(MethodHandles.Lookup var0, String var1, MethodType var2);
}
