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
import net.minecraft.class_2350;

public class 4l {
   private static final int 8;
   private static final int 0;
   private static final int 6;
   private static final int 5;
   private static final int 4;
   private static final int 1;
   private static final class_2350[] 3;
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
   private static transient String gyVIjHbqIJ;

   private _l/* $FF was: 4l*/() {
   }

   public static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0W _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0W _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0W _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0W _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static long[] _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static 7YS _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(4l.class, 441);
      a = s.a(-8037256308062612747L, -7183110024497841556L, MethodHandles.lookup().lookupClass()).a(173395212510161L);
      long var25 = a ^ 92053111309228L;
      i = new Object[230];
      j = new String[230];
      a();
      d = new HashMap(13);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[9];
      int var21 = 0;
      String var20 = "\u0004\b\bîm\u009a9\u0089K\u0082E\u0011- NÍþz\u008aUaKi©\u0010gö¥êµ\u0090'\u000b\u0083G\u0004\u009dPmo\u0080\u0018\u0081æ\rcÁrqÃ%Ådh/X\u0080\r>$ßBM¸2\u0082\u0010Ñ¼âÿ¥l\u0012X\u0017\u0080ó\u0011ê¤3u\u0018bÌ{ZðS¯\u0081\u0003¸\u0083\u0093WNu\rÈ _Òæ\u008d<Í \u0004àÍª\u0097ô\u000e\u0017\u00873,\"ª\u007fJ¼\u008c³ÈBÓé\u0088\u0006?ÿ|\brìö\"\u0010_}\büó¦H(w\u0091²Ôþ':y";
      int var22 = "\u0004\b\bîm\u009a9\u0089K\u0082E\u0011- NÍþz\u008aUaKi©\u0010gö¥êµ\u0090'\u000b\u0083G\u0004\u009dPmo\u0080\u0018\u0081æ\rcÁrqÃ%Ådh/X\u0080\r>$ßBM¸2\u0082\u0010Ñ¼âÿ¥l\u0012X\u0017\u0080ó\u0011ê¤3u\u0018bÌ{ZðS¯\u0081\u0003¸\u0083\u0093WNu\rÈ _Òæ\u008d<Í \u0004àÍª\u0097ô\u000e\u0017\u00873,\"ª\u007fJ¼\u008c³ÈBÓé\u0088\u0006?ÿ|\brìö\"\u0010_}\büó¦H(w\u0091²Ôþ':y".length();
      char var19 = 24;
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var20.substring(var29, var29 + var19);
         int var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = a(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var43;
                  if ((var29 += var19) >= var22) {
                     b = var23;
                     c = new String[9];
                     g = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[53];
                     int var8 = 0;
                     String var9 = "ÙTÝÛ\u0086\u0000±ÚS?\u0099\u0018\u0095\u001d\u007f\u00ad\u0004iÚ®´\u001dU\"àÜ¡6¶ô>J\u000fË~;æì\b3Ðõ5_¯üý3*¥\u0092\u008b\u0096{öz\u0090\u009f\u008b9Då\u0097=£iÆ\u0098c1gê¸\u00058û¦\u0085\u009c\u0098\u0095L\u001f\u0011©Ë¿ª© AÁà~\u0003_V\u000f\u009b\u0000dò#ªyÞ\u0010yì\u009e³M\u0012þ!\u0018\u0006^MW»Ã\u0014îÕ§i\u0095Úòb\u0085°~\u001bY\\ ,\u0097Ä\u008aíO³w¡Øµï\u008f\u001fÀÃ\n t\u0080¡Õ¾+èè\u001dqÊ.$¬\u0016aeë\u0083iâML\t¹e\u0001\u001eÎt\u0011|·\u008fb\u001a=&û,\u0086^¿Òò¿W\u0089¾\u0015§4,6\u0093J!ZÚóþgÿ\u008bl÷\tt½¶\u0086Çð\u0096_ÿësS\u0019\u0013C\u0084|!±\"v^'\u001b9)¬Ã^ç·\u0002\u001cÏ\u0091\u0087\u0014 \u009aEVJ\u0007\b\u000e¦Þ®ñÀ\b\u0004Q!\u0089!Wñµ-\u008e\u0081\u0013¶ê\u0083\u0097NQC»1@ò4ge&T6.|V\"]|&Õr]\u0012\u008f\u0013\u0083¥täAa\u0014\r¼\u001a\u0002¶ÅõêÎe;É\u0091P\u0019¾u]K!\u0089Î$5OtÌ¥!QhüD1¢;S!z8\"ÊÚ\u0088Pz©XÛ¬\u008f<Zá#UÇD×Ôjq\u009fc8\u0092ñom\fÐHÓ¿E\u009c\u009f?\u0006\u0086Ax¢ãÔ";
                     int var10 = "ÙTÝÛ\u0086\u0000±ÚS?\u0099\u0018\u0095\u001d\u007f\u00ad\u0004iÚ®´\u001dU\"àÜ¡6¶ô>J\u000fË~;æì\b3Ðõ5_¯üý3*¥\u0092\u008b\u0096{öz\u0090\u009f\u008b9Då\u0097=£iÆ\u0098c1gê¸\u00058û¦\u0085\u009c\u0098\u0095L\u001f\u0011©Ë¿ª© AÁà~\u0003_V\u000f\u009b\u0000dò#ªyÞ\u0010yì\u009e³M\u0012þ!\u0018\u0006^MW»Ã\u0014îÕ§i\u0095Úòb\u0085°~\u001bY\\ ,\u0097Ä\u008aíO³w¡Øµï\u008f\u001fÀÃ\n t\u0080¡Õ¾+èè\u001dqÊ.$¬\u0016aeë\u0083iâML\t¹e\u0001\u001eÎt\u0011|·\u008fb\u001a=&û,\u0086^¿Òò¿W\u0089¾\u0015§4,6\u0093J!ZÚóþgÿ\u008bl÷\tt½¶\u0086Çð\u0096_ÿësS\u0019\u0013C\u0084|!±\"v^'\u001b9)¬Ã^ç·\u0002\u001cÏ\u0091\u0087\u0014 \u009aEVJ\u0007\b\u000e¦Þ®ñÀ\b\u0004Q!\u0089!Wñµ-\u008e\u0081\u0013¶ê\u0083\u0097NQC»1@ò4ge&T6.|V\"]|&Õr]\u0012\u008f\u0013\u0083¥täAa\u0014\r¼\u001a\u0002¶ÅõêÎe;É\u0091P\u0019¾u]K!\u0089Î$5OtÌ¥!QhüD1¢;S!z8\"ÊÚ\u0088Pz©XÛ¬\u008f<Zá#UÇD×Ôjq\u009fc8\u0092ñom\fÐHÓ¿E\u009c\u009f?\u0006\u0086Ax¢ãÔ".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var52 = -1;

                        while(true) {
                           long var13 = var46;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var55 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    e = var11;
                                    f = new Integer[53];
                                    0 = true.p<invokedynamic>(27820, var25 ^ 6261692260206987389L);
                                    5 = true.p<invokedynamic>(3545, var25 ^ 8523970242536319270L);
                                    6 = true.p<invokedynamic>(16487, var25 ^ 3432493459102229679L);
                                    8 = true.p<invokedynamic>(27820, var25 ^ 6261692260206987389L);
                                    4 = true.p<invokedynamic>(13941, var25 ^ 4171873794487521957L);
                                    1 = true.p<invokedynamic>(28646, var25 ^ 7477503525977901845L);
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = -5935534748008330260L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var49 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    h = var49;
                                    3 = 7693074285211659590L.n<invokedynamic>(7693074285211659590L, var25);
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "¹-\u0003Õ\u009cîQO¡2äÞáË\u0097é";
                                 var10 = "¹-\u0003Õ\u009cîQO¡2äÞáË\u0097é".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var19 = var20.charAt(var29);
                  break;
               default:
                  var23[var21++] = var43;
                  if ((var29 += var19) < var22) {
                     var19 = var20.charAt(var29);
                     continue label64;
                  }

                  var20 = "Z? <\u0082/Ae)\u0017q0\u008cÁ'\u000f\u0007ÖË¾\tî\u0006º\u009e\u0093i²Po\u00818\u0010\u0012¾ÎB¬¹¿ä.\u001dqB\\ù\u0010\u0011";
                  var22 = "Z? <\u0082/Ae)\u0017q0\u008cÁ'\u000f\u0007ÖË¾\tî\u0006º\u009e\u0093i²Po\u00818\u0010\u0012¾ÎB¬¹¿ä.\u001dqB\\ù\u0010\u0011".length();
                  var19 = ' ';
                  var29 = -1;
            }

            ++var29;
            var30 = var20.substring(var29, var29 + var19);
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
               case 0 -> var10000 = 21;
               case 1 -> var10000 = 10;
               case 2 -> var10000 = 29;
               case 3 -> var10000 = 44;
               case 4 -> var10000 = 15;
               case 5 -> var10000 = 46;
               case 6 -> var10000 = 6;
               case 7 -> var10000 = 56;
               case 8 -> var10000 = 20;
               case 9 -> var10000 = 17;
               case 10 -> var10000 = 60;
               case 11 -> var10000 = 14;
               case 12 -> var10000 = 48;
               case 13 -> var10000 = 0;
               case 14 -> var10000 = 49;
               case 15 -> var10000 = 11;
               case 16 -> var10000 = 19;
               case 17 -> var10000 = 12;
               case 18 -> var10000 = 61;
               case 19 -> var10000 = 39;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 54;
               case 22 -> var10000 = 38;
               case 23 -> var10000 = 3;
               case 24 -> var10000 = 23;
               case 25 -> var10000 = 50;
               case 26 -> var10000 = 41;
               case 27 -> var10000 = 59;
               case 28 -> var10000 = 26;
               case 29 -> var10000 = 5;
               case 30 -> var10000 = 30;
               case 31 -> var10000 = 36;
               case 32 -> var10000 = 4;
               case 33 -> var10000 = 7;
               case 34 -> var10000 = 33;
               case 35 -> var10000 = 52;
               case 36 -> var10000 = 2;
               case 37 -> var10000 = 24;
               case 38 -> var10000 = 35;
               case 39 -> var10000 = 28;
               case 40 -> var10000 = 55;
               case 41 -> var10000 = 51;
               case 42 -> var10000 = 18;
               case 43 -> var10000 = 1;
               case 44 -> var10000 = 63;
               case 45 -> var10000 = 53;
               case 46 -> var10000 = 13;
               case 47 -> var10000 = 62;
               case 48 -> var10000 = 9;
               case 49 -> var10000 = 37;
               case 50 -> var10000 = 16;
               case 51 -> var10000 = 25;
               case 52 -> var10000 = 47;
               case 53 -> var10000 = 22;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 31;
               case 56 -> var10000 = 57;
               case 57 -> var10000 = 40;
               case 58 -> var10000 = 8;
               case 59 -> var10000 = 32;
               case 60 -> var10000 = 43;
               case 61 -> var10000 = 34;
               case 62 -> var10000 = 27;
               default -> var10000 = 45;
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
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Integer.TYPE;
      j[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = Boolean.TYPE;
      j[14] = "c";
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
      var10000[34] = Void.TYPE;
      j[34] = "c";
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
      var10000[62] = Long.TYPE;
      j[62] = "c";
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

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var26;
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
                     i[var4] = var19;
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
         if (var8 != 251 && var8 != 232 && var8 != 205 && var8 != "c") {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 233) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'n') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 251) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 232) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 205) {
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
