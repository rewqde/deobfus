package com.corz.client;

import com.google.gson.JsonObject;
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

public class 3F {
   public final String 9;
   public final int 8;
   public final int 1j;
   public final int 5;
   public final int 4;
   public final int 6;
   public final int 3;
   public final int 10;
   public final int 2;
   public final int 1;
   public final long 7;
   public final String 0;
   private static final long a = s.a(1038261306839098226L, -1443179584395829002L, MethodHandles.lookup().lookupClass()).a(42810257531868L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h = new Object[72];
   private static final String[] i = new String[72];
   // $FF: synthetic field
   private static transient String BfLVmYzXQU;

   public _F/* $FF was: 3F*/(String param1, int param2, int param3, int param4, int param5, long param6, int param8, int param9, int param10, int param11, int param12, long param13) {
      // $FF: Couldn't be decompiled
   }

   private String _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = this.k<invokedynamic>(this, (long)"c", var2).d<invokedynamic>(this.k<invokedynamic>(this, (long)"c", var2), 0, true.è<invokedynamic>(4, this.k<invokedynamic>(this, (long)"c", var2).d<invokedynamic>(this.k<invokedynamic>(this, (long)"c", var2), (long)"c", var2), (long)"c", var2), (long)"c", var2);
      return var10000.d<invokedynamic>(var10000, "c".W<invokedynamic>((long)"c", var2), (long)"c", var2);
   }

   public boolean _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[1];
      3F var4 = (3F)var1[0];
      var2 = a ^ var2;
      boolean var5 = "c".è<invokedynamic>((long)"c", var2);

      boolean var9;
      label46: {
         label34: {
            label33: {
               try {
                  var10000 = var4;
                  if (!var5) {
                     break label33;
                  }

                  if (var4 == null) {
                     break label34;
                  }
               } catch (MatchException var7) {
                  throw var7.è<invokedynamic>(var7, (long)"c", var2);
               }

               var10000 = this;
            }

            try {
               var9 = var10000.k<invokedynamic>(var10000, (long)"c", var2).d<invokedynamic>(var10000.k<invokedynamic>(var10000, (long)"c", var2), var4.k<invokedynamic>(var4, (long)"c", var2), (long)"c", var2);
               if (!var5) {
                  return var9;
               }

               if (var9) {
                  break label46;
               }
            } catch (MatchException var6) {
               throw var6.è<invokedynamic>(var6, (long)"c", var2);
            }
         }

         var9 = false;
         return var9;
      }

      var9 = true;
      return var9;
   }

   public String _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public JsonObject _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static 3F _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var11 = a ^ 6797934211161L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[26];
      int var18 = 0;
      String var17 = "\u0088\u0085%üQ®líÂ\u008bÄ\u0084\u0084-ÕÙ\u0010\u0084å#\u001f\u0090§_?\\»ºÀ\u0083ûCM\u0010»öTvr\u0004\u00adôû\u008aq Ä\rí¸\u0018ºªG\u0010\u001a\u0082Ü×Hm\u0017P´o\u0093N°âO:%\u0001ñÏ\u0010\u001a#¹ì¥>ß½p5Áï¾8,·\u0010×\u0092\u0089¢Å§\u009b(Ø5ÒäY\u0081jÃ \u0007Xÿ»?LW,\u0081\u001eTý/;ý\u0088\u008b6&\u0014æour!ø(\r,«¦\u009a0Ài°Y\u008dØ\u009a\r^\u009bR·ýçÐæ\u001aR\u0085\u001bð\u0002¬ÊíñÈ#\u001eË<±8\\\u0093ª\u0002OÊ\u009eµ?B÷Ñ£{]\u0010i(Á\t,7Ôçª\u0015àÊ½.ûc\u0010ô\u0084ÈY/\bKxp\u008a#\u0097Ô\u0090\u001d\u0006\u0010\u0010\u0017Îé$S¨»Z\u009eiüð\u0015Bó ÂZÕÄë\u000bC]\u0095°{©\u0000\u009a¹¼c\t\u009dc\\¾Â6è'ÜØ (\u0086Í(±1é}¢±Jù\u00adÔp«5¶\u009bÜ·s\u0001×\u0099Ï>éÉ|Ò\u007f[F\u0013\u0082\u000f\u001cFR×ÇÁ\u009f\u0010êÚ4ú@ù÷\u0082@\u000f\u0005&m°\u0096\u0001\u0010e°¨\"2Ã\u0091rÜ¡Î\u0019C¿%Ä(\tª\u0016¡ûùÂ;bÞR\u009e¾{Íf\u000bc»±@ì9Us¦£Z¦Ç0)¸¤r&\u0092wBæ\u0010VMuÒ]¿ÇÚ\r´p\"\u0097wSR\u0010¿\u001cöX,°\u0014%\u000e\u0099j\u0000#:B\u009e8\u0015\u0090xAÆ=q\u008b£ôjÀ\u0098ì6\u0006ö\fy\u0001}ò\\]èÚ\u0094½:\u0094£¿üúô×¤»9\u0090\u0099~^ë'¿£\bSFDv¦ux \u0010\u0084\u0014¾Ê\u0081k\u00adàVâ<cÔ£\të\u0010\u008drîè1zÑJ$Üê\u0080@\u008d6±\u0010rY\\ÍðÂ¿\u00167\u0093iÜ\u008a¨)Â\u0010\u0018\u009dâ(°t£§\f\u0001dá`?äe(ae%·°\u0005£Ö\u0094Ïjj\u001eï<Z\u0006\u009b`Ä\r\u0083`Ó\u008e¥\u0091Ø\r\u0013ñgè\bã\u0007NDí#";
      int var19 = "\u0088\u0085%üQ®líÂ\u008bÄ\u0084\u0084-ÕÙ\u0010\u0084å#\u001f\u0090§_?\\»ºÀ\u0083ûCM\u0010»öTvr\u0004\u00adôû\u008aq Ä\rí¸\u0018ºªG\u0010\u001a\u0082Ü×Hm\u0017P´o\u0093N°âO:%\u0001ñÏ\u0010\u001a#¹ì¥>ß½p5Áï¾8,·\u0010×\u0092\u0089¢Å§\u009b(Ø5ÒäY\u0081jÃ \u0007Xÿ»?LW,\u0081\u001eTý/;ý\u0088\u008b6&\u0014æour!ø(\r,«¦\u009a0Ài°Y\u008dØ\u009a\r^\u009bR·ýçÐæ\u001aR\u0085\u001bð\u0002¬ÊíñÈ#\u001eË<±8\\\u0093ª\u0002OÊ\u009eµ?B÷Ñ£{]\u0010i(Á\t,7Ôçª\u0015àÊ½.ûc\u0010ô\u0084ÈY/\bKxp\u008a#\u0097Ô\u0090\u001d\u0006\u0010\u0010\u0017Îé$S¨»Z\u009eiüð\u0015Bó ÂZÕÄë\u000bC]\u0095°{©\u0000\u009a¹¼c\t\u009dc\\¾Â6è'ÜØ (\u0086Í(±1é}¢±Jù\u00adÔp«5¶\u009bÜ·s\u0001×\u0099Ï>éÉ|Ò\u007f[F\u0013\u0082\u000f\u001cFR×ÇÁ\u009f\u0010êÚ4ú@ù÷\u0082@\u000f\u0005&m°\u0096\u0001\u0010e°¨\"2Ã\u0091rÜ¡Î\u0019C¿%Ä(\tª\u0016¡ûùÂ;bÞR\u009e¾{Íf\u000bc»±@ì9Us¦£Z¦Ç0)¸¤r&\u0092wBæ\u0010VMuÒ]¿ÇÚ\r´p\"\u0097wSR\u0010¿\u001cöX,°\u0014%\u000e\u0099j\u0000#:B\u009e8\u0015\u0090xAÆ=q\u008b£ôjÀ\u0098ì6\u0006ö\fy\u0001}ò\\]èÚ\u0094½:\u0094£¿üúô×¤»9\u0090\u0099~^ë'¿£\bSFDv¦ux \u0010\u0084\u0014¾Ê\u0081k\u00adàVâ<cÔ£\të\u0010\u008drîè1zÑJ$Üê\u0080@\u008d6±\u0010rY\\ÍðÂ¿\u00167\u0093iÜ\u008a¨)Â\u0010\u0018\u009dâ(°t£§\f\u0001dá`?äe(ae%·°\u0005£Ö\u0094Ïjj\u001eï<Z\u0006\u009b`Ä\r\u0083`Ó\u008e¥\u0091Ø\r\u0013ñgè\bã\u0007NDí#".length();
      char var16 = 16;
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
                     c = new String[26];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "Ê6ð8\u0011]õP=\u0017vØ\u0099l+\u009el-\u0001É$O\u0001-\u008b\u009aù\u0084¶\n(,\u0093ÿÅ5ÏyÆ'8©\u0081\u0015¼`H6°ZjZL}\u00ad%õ\bpÏBv@ÔeuÉ®\u000e¶\r\u0084";
                     int var5 = "Ê6ð8\u0011]õP=\u0017vØ\u0099l+\u009el-\u0001É$O\u0001-\u008b\u009aù\u0084¶\n(,\u0093ÿÅ5ÏyÆ'8©\u0081\u0015¼`H6°ZjZL}\u00ad%õ\bpÏBv@ÔeuÉ®\u000e¶\r\u0084".length();
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
                                    f = new Integer[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u001f]\u0011(1áÉ±B(\u008aNGZ¯´";
                                 var5 = "\u001f]\u0011(1áÉ±B(\u008aNGZ¯´".length();
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

                  var17 = "{±\u001e¢ú¾c®f\u0002YïJ\u009bÁ¬ÚQhF\u000fMlR\u000fÀq/\u0080q~4Ä\u0016Ï\u0010´?Z\u008b\u00105àäÏ\u0097\u001aÌvÊ\u009b[Ê\u009187V";
                  var19 = "{±\u001e¢ú¾c®f\u0002YïJ\u009bÁ¬ÚQhF\u000fMlR\u000fÀq/\u0080q~4Ä\u0016Ï\u0010´?Z\u008b\u00105àäÏ\u0097\u001aÌvÊ\u009b[Ê\u009187V".length();
                  var16 = '(';
                  var24 = -1;
            }

            ++var24;
            var25 = var17.substring(var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
               case 0 -> var10000 = 34;
               case 1 -> var10000 = 10;
               case 2 -> var10000 = 20;
               case 3 -> var10000 = 1;
               case 4 -> var10000 = 25;
               case 5 -> var10000 = 2;
               case 6 -> var10000 = 29;
               case 7 -> var10000 = 30;
               case 8 -> var10000 = 32;
               case 9 -> var10000 = 59;
               case 10 -> var10000 = 17;
               case 11 -> var10000 = 22;
               case 12 -> var10000 = 50;
               case 13 -> var10000 = 19;
               case 14 -> var10000 = 35;
               case 15 -> var10000 = 28;
               case 16 -> var10000 = 14;
               case 17 -> var10000 = 56;
               case 18 -> var10000 = 54;
               case 19 -> var10000 = 63;
               case 20 -> var10000 = 42;
               case 21 -> var10000 = 37;
               case 22 -> var10000 = 52;
               case 23 -> var10000 = 33;
               case 24 -> var10000 = 43;
               case 25 -> var10000 = 39;
               case 26 -> var10000 = 48;
               case 27 -> var10000 = 15;
               case 28 -> var10000 = 23;
               case 29 -> var10000 = 47;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 27;
               case 32 -> var10000 = 60;
               case 33 -> var10000 = 5;
               case 34 -> var10000 = 61;
               case 35 -> var10000 = 57;
               case 36 -> var10000 = 16;
               case 37 -> var10000 = 53;
               case 38 -> var10000 = 24;
               case 39 -> var10000 = 46;
               case 40 -> var10000 = 45;
               case 41 -> var10000 = 41;
               case 42 -> var10000 = 8;
               case 43 -> var10000 = 0;
               case 44 -> var10000 = 6;
               case 45 -> var10000 = 58;
               case 46 -> var10000 = 7;
               case 47 -> var10000 = 3;
               case 48 -> var10000 = 55;
               case 49 -> var10000 = 51;
               case 50 -> var10000 = 11;
               case 51 -> var10000 = 31;
               case 52 -> var10000 = 49;
               case 53 -> var10000 = 18;
               case 54 -> var10000 = 26;
               case 55 -> var10000 = 62;
               case 56 -> var10000 = 13;
               case 57 -> var10000 = 36;
               case 58 -> var10000 = 40;
               case 59 -> var10000 = 21;
               case 60 -> var10000 = 12;
               case 61 -> var10000 = 38;
               case 62 -> var10000 = 44;
               default -> var10000 = 9;
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
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Boolean.TYPE;
      i[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Integer.TYPE;
      i[9] = "c";
      var10000[10] = "c";
      var10000[11] = Long.TYPE;
      i[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Character.TYPE;
      i[16] = "c";
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
      var10000[27] = Void.TYPE;
      i[27] = "c";
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
      var10000[71] = "c";
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
         if (var8 != 'k' && var8 != 'u' && var8 != 'W' && var8 != 233) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'd') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 232) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'k') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'u') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'W') {
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
