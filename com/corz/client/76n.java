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

public class 76N {
   private static final int 8;
   private final HashMap 8y;
   private final HashMap 7;
   private long 9;
   public long 1;
   public long 4;
   public long 2;
   public long 6;
   public long 5;
   public long 3;
   public long 8R;
   public long 0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;
   private static final Object[] k;
   private static final String[] l;
   // $FF: synthetic field
   private static transient String dclinXyYOZ;

   public _6N/* $FF was: 76N*/(int param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ô<invokedynamic>(this, this.G<invokedynamic>(this, (long)"c", var2) + 1L, (long)"c", var2);
      long var10002 = this.G<invokedynamic>(this, (long)"c", var2);
      this.ô<invokedynamic>(this, var10002 + 1L, (long)"c", var2);
      return var10002;
   }

   public void _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ô<invokedynamic>(this, this.G<invokedynamic>(this, (long)"c", var2) + 1L, (long)"c", var2);
   }

   public void _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ô<invokedynamic>(this, this.G<invokedynamic>(this, (long)"c", var2) + 1L, (long)"c", var2);
   }

   public void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7T_ _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7T_ _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7T_ _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      HashMap var10000 = this.G<invokedynamic>(this, (long)"c", var2);
      return var10000.U<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.G<invokedynamic>(this, (long)"c", var2).U<invokedynamic>(this.G<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      this.G<invokedynamic>(this, (long)"c", var2).U<invokedynamic>(this.G<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   public String _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(76N.class, 153);
      a = s.a(-1698726926638141060L, 3967719674307388126L, MethodHandles.lookup().lookupClass()).a(160621914349789L);
      k = new Object[71];
      l = new String[71];
      a();
      d = new HashMap(13);
      long var22 = a ^ 64109589621612L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[9];
      int var29 = 0;
      String var28 = "2\\\nà£r¹ê3þ2\b³`\u009d¡T\u0083ðYE¼8ôÞ\u009eª³\u0004\u0016+\u0003E\u009a\u0019\fó£ÚoL_ô\u0082W,çL\u0005ÉÚK °\u009f\u00100uæ±jÒ\"\u0083\u000b®\u001cIÆ\u0015\u0085`\u001e{é\u00842´¨\u0095'n\u0002}zÌúX¬\u0011\u0002\u0088Ïsz\f?á7¿[º¯Ðª8{\u001f\u0083¥\u008eä¸\u0003±qô\u008c\u009a\u0087\u001fÔ«öåq\u001a08).\u0082ý\u009dó\u008c\u001dÐú¡+ù\u0000\u001f~\u0085¬,\u008c a\r\u0014@w¯©Â\t%\u0085¿(9Êv\u0099\u0098&às\u009eH \u0010tìý3Rf\u0005Ìy\u0080ï}}Î\u009eÈ\u001aGs{\u0012'}üE\f\u0089â(\u0005\u008eÐáC«¸Õ¯¦á\u0007\u008cKÓ»\u000e·Û\u0098®H\u008f\u001amºå\u0015Fr\u009b¶´#Z ^\u0013\u00913 baÊ\u008a1\u0083!«¯«,«È\u001d\u0095i\u0088\u0016óL.K\u0091ªwáe.¦¬?\u000b(¥\u0095%\u0084\rÉlÄe,}\rÙ\u0091y!\u0092Õ2PIà³¬\u0002\u0018í,lÈÿÅY_[öaÓÚü";
      int var30 = "2\\\nà£r¹ê3þ2\b³`\u009d¡T\u0083ðYE¼8ôÞ\u009eª³\u0004\u0016+\u0003E\u009a\u0019\fó£ÚoL_ô\u0082W,çL\u0005ÉÚK °\u009f\u00100uæ±jÒ\"\u0083\u000b®\u001cIÆ\u0015\u0085`\u001e{é\u00842´¨\u0095'n\u0002}zÌúX¬\u0011\u0002\u0088Ïsz\f?á7¿[º¯Ðª8{\u001f\u0083¥\u008eä¸\u0003±qô\u008c\u009a\u0087\u001fÔ«öåq\u001a08).\u0082ý\u009dó\u008c\u001dÐú¡+ù\u0000\u001f~\u0085¬,\u008c a\r\u0014@w¯©Â\t%\u0085¿(9Êv\u0099\u0098&às\u009eH \u0010tìý3Rf\u0005Ìy\u0080ï}}Î\u009eÈ\u001aGs{\u0012'}üE\f\u0089â(\u0005\u008eÐáC«¸Õ¯¦á\u0007\u008cKÓ»\u000e·Û\u0098®H\u008f\u001amºå\u0015Fr\u009b¶´#Z ^\u0013\u00913 baÊ\u008a1\u0083!«¯«,«È\u001d\u0095i\u0088\u0016óL.K\u0091ªwáe.¦¬?\u000b(¥\u0095%\u0084\rÉlÄe,}\rÙ\u0091y!\u0092Õ2PIà³¬\u0002\u0018í,lÈÿÅY_[öaÓÚü".length();
      char var27 = '8';
      int var35 = -1;

      label73:
      while(true) {
         ++var35;
         String var36 = var28.substring(var35, var35 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     b = var31;
                     c = new String[9];
                     g = new HashMap(13);
                     Cipher var11;
                     Cipher var38 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[3];
                     int var14 = 0;
                     String var15 = "Ñ¤\u008d\u0014\u0098öÞRµ\u000e\u008fÛ\u0017\u00116N\u0014y\u000fÓ\u0012Ó¬Æ";
                     int var16 = "Ñ¤\u008d\u0014\u0098öÞRµ\u000e\u008fÛ\u0017\u00116N\u0014y\u000fÓ\u0012Ó¬Æ".length();
                     int var13 = 0;

                     do {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var10004 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        boolean var58 = true;
                        var17[var10001] = var10004;
                     } while(var13 < var16);

                     e = var17;
                     f = new Integer[3];
                     8 = true.n<invokedynamic>(7453, var22 ^ 5524856766983323698L);
                     j = new HashMap(13);
                     Cipher var0;
                     var38 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "Ëx\u0096Õ÷©\u008aóÁÎyB<kýª";
                     int var5 = "Ëx\u0096Õ÷©\u008aóÁÎyB<kýª".length();
                     int var2 = 0;

                     label44:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var40 = var6;
                        var10001 = var3++;
                        long var54 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var60 = -1;

                        while(true) {
                           long var8 = var54;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var63 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var40[var10001] = var63;
                                 if (var2 >= var5) {
                                    h = var6;
                                    i = new Long[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var10001] = var63;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¸£TQ4\u0097\u0095u¥\u008cê\u0097\u0018F§n";
                                 var5 = "¸£TQ4\u0097\u0095u¥\u008cê\u0097\u0018F§n".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var40 = var6;
                           var10001 = var3++;
                           var54 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label73;
                  }

                  var28 = "ÿÓÁ×½\u009f8àz\u0084íºò\u0099V\u0091ëÒ\u0005Î\u001f>*o¢Ç\u0085\u001bÍ\u008b\u0016\u008cÄ4üç\u001fñ\bjq\u0014\u0013\u001f\u000b\u0003\\?h\u0013è\u0087rölÃ(\u0082Dä¯DËyzãT\u001dÇ\u0003ÝêJ\b¸ÁlQîy\u0096$\u0090°D]\u0015 ÄÍÁ}bxöxí";
                  var30 = "ÿÓÁ×½\u009f8àz\u0084íºò\u0099V\u0091ëÒ\u0005Î\u001f>*o¢Ç\u0085\u001bÍ\u008b\u0016\u008cÄ4üç\u001fñ\bjq\u0014\u0013\u001f\u000b\u0003\\?h\u0013è\u0087rölÃ(\u0082Dä¯DËyzãT\u001dÇ\u0003ÝêJ\b¸ÁlQîy\u0096$\u0090°D]\u0015 ÄÍÁ}bxöxí".length();
                  var27 = '8';
                  var35 = -1;
            }

            ++var35;
            var36 = var28.substring(var35, var35 + var27);
            var10001 = 0;
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

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

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

   private static native long c(int var0, long var1);

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
               case 0 -> var10000 = 56;
               case 1 -> var10000 = 29;
               case 2 -> var10000 = 55;
               case 3 -> var10000 = 3;
               case 4 -> var10000 = 53;
               case 5 -> var10000 = 50;
               case 6 -> var10000 = 23;
               case 7 -> var10000 = 41;
               case 8 -> var10000 = 13;
               case 9 -> var10000 = 58;
               case 10 -> var10000 = 24;
               case 11 -> var10000 = 2;
               case 12 -> var10000 = 45;
               case 13 -> var10000 = 31;
               case 14 -> var10000 = 26;
               case 15 -> var10000 = 16;
               case 16 -> var10000 = 39;
               case 17 -> var10000 = 57;
               case 18 -> var10000 = 21;
               case 19 -> var10000 = 47;
               case 20 -> var10000 = 11;
               case 21 -> var10000 = 17;
               case 22 -> var10000 = 38;
               case 23 -> var10000 = 42;
               case 24 -> var10000 = 10;
               case 25 -> var10000 = 35;
               case 26 -> var10000 = 25;
               case 27 -> var10000 = 19;
               case 28 -> var10000 = 27;
               case 29 -> var10000 = 43;
               case 30 -> var10000 = 49;
               case 31 -> var10000 = 28;
               case 32 -> var10000 = 12;
               case 33 -> var10000 = 8;
               case 34 -> var10000 = 20;
               case 35 -> var10000 = 36;
               case 36 -> var10000 = 34;
               case 37 -> var10000 = 51;
               case 38 -> var10000 = 37;
               case 39 -> var10000 = 1;
               case 40 -> var10000 = 0;
               case 41 -> var10000 = 15;
               case 42 -> var10000 = 54;
               case 43 -> var10000 = 59;
               case 44 -> var10000 = 48;
               case 45 -> var10000 = 22;
               case 46 -> var10000 = 62;
               case 47 -> var10000 = 52;
               case 48 -> var10000 = 63;
               case 49 -> var10000 = 32;
               case 50 -> var10000 = 14;
               case 51 -> var10000 = 5;
               case 52 -> var10000 = 7;
               case 53 -> var10000 = 30;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 6;
               case 56 -> var10000 = 46;
               case 57 -> var10000 = 9;
               case 58 -> var10000 = 4;
               case 59 -> var10000 = 44;
               case 60 -> var10000 = 33;
               case 61 -> var10000 = 40;
               case 62 -> var10000 = 61;
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

            l[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = k;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      l[1] = "c";
      var10000[2] = "c";
      var10000[3] = Integer.TYPE;
      l[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = Boolean.TYPE;
      l[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = Void.TYPE;
      l[14] = "c";
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
         if (var8 != 'G' && var8 != 244 && var8 != 254 && var8 != 's') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'U') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 250) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'G') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 244) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 254) {
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
