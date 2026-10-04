package com.corz.client;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_12137;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class 90 {
   private static final Vector4f 6;
   private static final Vector3f 9;
   private static final Matrix4f 4K;
   private static final int 3;
   private GpuBuffer 4b;
   private GpuBuffer 8;
   private class_12137 4y;
   private ByteBuffer 7;
   private GpuTexture[] 4;
   private GpuTextureView[] 2;
   private int 5;
   private int 1;
   private int 0;
   private boolean 4t;
   private static final long a = s.a(-4689220594443029141L, 8847762842152335539L, MethodHandles.lookup().lookupClass()).a(91125174464474L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h = new Object[112];
   private static final String[] i = new String[112];
   // $FF: synthetic field
   private static transient String kdPqAAszTw;

   public GpuTextureView _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 9*/(Object[] var1) {
      int var15 = (Integer)var1[1];
      int var9 = (Integer)var1[0];
      long var18 = (Long)var1[4];
      var18 = a ^ var18;
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (float)var9, (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (float)var15, (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[2], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[3], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[5], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[6], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[7], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[8], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[9], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[10], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[11], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[12], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[13], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[14], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[15], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[18], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[16], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (Float)var1[17], (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (float)"c", (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (float)"c", (long)"c", var18);
      this.È<invokedynamic>(this, (long)"c", var18).y<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var18), (long)"c", var18);
   }

   private void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static GpuBuffer _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public GpuTexture _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 6*/(String var0) {
      return var0;
   }

   private static String _/* $FF was: 8*/(long param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 9*/(long param0, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 1*/(long param0, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 9*/(long param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var11 = a ^ 24560306537215L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "\u00ad§0\u009d\u0014&5§Ç\u001cÑV\u001cý¦1\u0004\u0000\u0004yÃ8[\u0090\u0005\u0089\u0097õ.r¿¡NK\u0001\u008e\u000f\u009c\fß(\fk\b\u0004m¥À\u008fï\u009d)\u001a·lî\u0001f:´u°É¤%õz\bëÏB+hÑ\u0007\u001d7\f+hû@Í_\r\u008dì»\u007f³\u008b`\u0088^>)Ì5n$ÐZ!\u00159\u0014Å\u00ads$A\u0007|\u00832\u0007\u009b?Ù{¡\u0010\u0093ãê+eZ,ÈlIyüP\u0098e(\u0011\u009d» T³0Å(9\u001a\u0014½/wøi7¦¦uëß\u009a\u000fv&Úy\"¸bð÷Æ\u009aÿß6?\u000e\u009a\u0007õß¯M>\u009b\u0018eð÷¶ñê\u0090èÁäúKÝ\u0016\u0001ÑbG9'ìÞ¥â8þ\u0016\u0004x§ÅÈ\u0093¹þ\u0015\u0005\f\u0096\u0006§\u000bé\u008bº3\u0002+\u0003\u009bl³o\u0080\u0082\u009bS\u009c¨\u0083IÚ\u001aPM\u000b*0\u0099ówá¼\u0000u²Ó\u000e\u0099\u0015H0¼\u001b\u001cpà\u0091+ª¯N-\u001dÞß)I6&Ï¼í\u0085HÞ\\\u0001=y9Î\u000f=íÆÖc\u0091ó\u0019«çCéXt\u0096$Ù\u0018\u008b9*Õ)ZL¤\u008aÐ÷*åü&àëí\u0014¿ø(eÅ";
      int var19 = "\u00ad§0\u009d\u0014&5§Ç\u001cÑV\u001cý¦1\u0004\u0000\u0004yÃ8[\u0090\u0005\u0089\u0097õ.r¿¡NK\u0001\u008e\u000f\u009c\fß(\fk\b\u0004m¥À\u008fï\u009d)\u001a·lî\u0001f:´u°É¤%õz\bëÏB+hÑ\u0007\u001d7\f+hû@Í_\r\u008dì»\u007f³\u008b`\u0088^>)Ì5n$ÐZ!\u00159\u0014Å\u00ads$A\u0007|\u00832\u0007\u009b?Ù{¡\u0010\u0093ãê+eZ,ÈlIyüP\u0098e(\u0011\u009d» T³0Å(9\u001a\u0014½/wøi7¦¦uëß\u009a\u000fv&Úy\"¸bð÷Æ\u009aÿß6?\u000e\u009a\u0007õß¯M>\u009b\u0018eð÷¶ñê\u0090èÁäúKÝ\u0016\u0001ÑbG9'ìÞ¥â8þ\u0016\u0004x§ÅÈ\u0093¹þ\u0015\u0005\f\u0096\u0006§\u000bé\u008bº3\u0002+\u0003\u009bl³o\u0080\u0082\u009bS\u009c¨\u0083IÚ\u001aPM\u000b*0\u0099ówá¼\u0000u²Ó\u000e\u0099\u0015H0¼\u001b\u001cpà\u0091+ª¯N-\u001dÞß)I6&Ï¼í\u0085HÞ\\\u0001=y9Î\u000f=íÆÖc\u0091ó\u0019«çCéXt\u0096$Ù\u0018\u008b9*Õ)ZL¤\u008aÐ÷*åü&àëí\u0014¿ø(eÅ".length();
      char var16 = '(';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var17.substring(var24, var24 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[10];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "ÉÉ!=PïÙ³:`:\nÊ×\u0083\u00ad:Q#º+QÆ>èâ1ã·\u008c\u0096x\n´\u0004x¸|Ïv³9Í@5ë5:b0ùS\u0096\u0094Cú";
                     int var5 = "ÉÉ!=PïÙ³:`:\nÊ×\u0083\u00ad:Q#º+QÆ>èâ1ã·\u008c\u0096x\n´\u0004x¸|Ïv³9Í@5ë5:b0ùS\u0096\u0094Cú".length();
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
                                    e = var6;
                                    f = new Integer[9];
                                    3 = true.y<invokedynamic>(19208, var11 ^ 3119096266619960554L);
                                    6 = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
                                    9 = new Vector3f(0.0F, 0.0F, 0.0F);
                                    4K = new Matrix4f();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = ")ö±ßº¹£!\u009dÈD·\u0005}\u0005\u008b";
                                 var5 = ")ö±ßº¹£!\u009dÈD·\u0005}\u0005\u008b".length();
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

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "Þ\u008e,Ì¥\u0090Á\blô¶*ÜìÞÉ\u0001\u009béR¦hz\u0006(¼\u0000sK\u0012}Ýq@üíµÃ\t\u009fô$Ô[Ò\u008eÀ\u0013¯\u009a\u0095u\u0081¬\u009b`2Ã·õ\u0088\u009b\" \u001f";
                  var19 = "Þ\u008e,Ì¥\u0090Á\blô¶*ÜìÞÉ\u0001\u009béR¦hz\u0006(¼\u0000sK\u0012}Ýq@üíµÃ\t\u009fô$Ô[Ò\u008eÀ\u0013¯\u009a\u0095u\u0081¬\u009b`2Ã·õ\u0088\u009b\" \u001f".length();
                  var16 = 24;
                  var24 = -1;
            }

            ++var24;
            var25 = var17.substring(var24, var24 + var16);
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

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (i[var4] != null) {
         return var4;
      } else {
         Object var5 = h[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 37;
               case 1 -> var10000 = 35;
               case 2 -> var10000 = 13;
               case 3 -> var10000 = 44;
               case 4 -> var10000 = 39;
               case 5 -> var10000 = 9;
               case 6 -> var10000 = 41;
               case 7 -> var10000 = 54;
               case 8 -> var10000 = 53;
               case 9 -> var10000 = 19;
               case 10 -> var10000 = 59;
               case 11 -> var10000 = 36;
               case 12 -> var10000 = 11;
               case 13 -> var10000 = 63;
               case 14 -> var10000 = 62;
               case 15 -> var10000 = 8;
               case 16 -> var10000 = 18;
               case 17 -> var10000 = 30;
               case 18 -> var10000 = 34;
               case 19 -> var10000 = 42;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 31;
               case 22 -> var10000 = 3;
               case 23 -> var10000 = 46;
               case 24 -> var10000 = 49;
               case 25 -> var10000 = 50;
               case 26 -> var10000 = 25;
               case 27 -> var10000 = 45;
               case 28 -> var10000 = 32;
               case 29 -> var10000 = 40;
               case 30 -> var10000 = 55;
               case 31 -> var10000 = 47;
               case 32 -> var10000 = 26;
               case 33 -> var10000 = 10;
               case 34 -> var10000 = 1;
               case 35 -> var10000 = 38;
               case 36 -> var10000 = 5;
               case 37 -> var10000 = 24;
               case 38 -> var10000 = 57;
               case 39 -> var10000 = 56;
               case 40 -> var10000 = 2;
               case 41 -> var10000 = 60;
               case 42 -> var10000 = 21;
               case 43 -> var10000 = 17;
               case 44 -> var10000 = 33;
               case 45 -> var10000 = 6;
               case 46 -> var10000 = 4;
               case 47 -> var10000 = 23;
               case 48 -> var10000 = 0;
               case 49 -> var10000 = 61;
               case 50 -> var10000 = 51;
               case 51 -> var10000 = 29;
               case 52 -> var10000 = 27;
               case 53 -> var10000 = 22;
               case 54 -> var10000 = 52;
               case 55 -> var10000 = 16;
               case 56 -> var10000 = 12;
               case 57 -> var10000 = 15;
               case 58 -> var10000 = 7;
               case 59 -> var10000 = 14;
               case 60 -> var10000 = 20;
               case 61 -> var10000 = 48;
               case 62 -> var10000 = 28;
               default -> var10000 = 43;
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

            i[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = h;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      i[1] = "c";
      var10000[2] = "c";
      var10000[3] = Void.TYPE;
      i[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Float.TYPE;
      i[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = Long.TYPE;
      i[19] = "c";
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
      var10000[39] = Boolean.TYPE;
      i[39] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = h[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(i[var4]);
            h[var4] = var5;
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
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     h[var4] = var13;
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
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var26;
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
                     h[var4] = var19;
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
         if (var8 != 200 && var8 != 'H' && var8 != '$' && var8 != 230) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'y') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 203) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 200) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'H') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == '$') {
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
