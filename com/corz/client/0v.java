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

public class 0v {
   public static final int 8b;
   private static final int 84;
   private static final int 0;
   private static final int 8L;
   private static final int 8H;
   private static final int 8C;
   private static final int 7;
   private static final int 83;
   private static final int 8_;
   private static final int 8Q;
   private static final int 8r;
   private static final int 8D;
   private static final int 8x;
   private static final int 8O;
   private static final int 8g;
   private static final int 2;
   private static final int 8u;
   private static final int 8E;
   private static final int 8I;
   private static final int 8z;
   private static final int 9;
   private final 47 88;
   private int 5;
   private int 8t;
   private int 8Y;
   private int 8M;
   private boolean 8w;
   private boolean 8G;
   private String 8;
   private boolean 8A;
   private final 7C 8f;
   private int 8F;
   private boolean 81;
   private int 8R;
   private int 6;
   private final List 8T;
   private final 7TT 1;
   private final 7TT[] 8e;
   private final 7TT 8q;
   private final 7TT 8m;
   private final 7TT 8N;
   private static final int 4;
   private int 3;
   private int 8s;
   private static final long a = s.a(-3125278535304360775L, -3362672560624267474L, MethodHandles.lookup().lookupClass()).a(190320250723493L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h = new Object[203];
   private static final String[] i = new String[203];
   // $FF: synthetic field
   private static transient String ZFEnpEHmvC;

   public _v/* $FF was: 0v*/(int param1, int param2, 47 param3, char param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] var1) {
      long var4 = (Long)var1[4];
      var4 = a ^ var4;
      this.ê<invokedynamic>(this, (Integer)var1[0], (long)"c", var4);
      this.ê<invokedynamic>(this, (Integer)var1[1], (long)"c", var4);
      this.ê<invokedynamic>(this, (Integer)var1[2], (long)"c", var4);
      this.ê<invokedynamic>(this, (Integer)var1[3], (long)"c", var4);
   }

   public int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _I/* $FF was: 2I*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int[] _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var11 = a ^ 69540508265955L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "PB¯)²*¯!ú&:\u0088ï,¨Ä\u0010i\u0007L\"µ\u0000ÈÏ\u001fuþiÖNÚî(Ê\u0015Þz®ê\u0082\u008d]è\u0004\u0098¼W5¾¥.IP\"þ4=ç$ù_\u008c Ë\"©ö\u0089Ò\u008d&ë\u000f e°²ö\u0093&uO×\u0015{\u0095\u0014Ç¥\u0004¸2c*;\u0007ôÂ\u001e\u009d\u000eó_ÕÜÌ\u0010\u008aè\u001f\fBYü?>in\u0014\u007f£fæ";
      int var19 = "PB¯)²*¯!ú&:\u0088ï,¨Ä\u0010i\u0007L\"µ\u0000ÈÏ\u001fuþiÖNÚî(Ê\u0015Þz®ê\u0082\u008d]è\u0004\u0098¼W5¾¥.IP\"þ4=ç$ù_\u008c Ë\"©ö\u0089Ò\u008d&ë\u000f e°²ö\u0093&uO×\u0015{\u0095\u0014Ç¥\u0004¸2c*;\u0007ôÂ\u001e\u009d\u000eó_ÕÜÌ\u0010\u008aè\u001f\fBYü?>in\u0014\u007f£fæ".length();
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
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[83];
                     int var3 = 0;
                     String var4 = "Dê¾1z>\u00049M7Ä\u0090\u0081]<Ûõ¹\u0091+äµzÅyU7B\u0016\u0013¸Ë\bN\u009fÅgWï\u0093\u0088¨´è¡\u0013\u0087O\u00ad0ÿ\u0007^\u0092}¤ÝÄ½ÚØµ9óhHª?\u0002\u0006é²,ýü8Hv°÷Õ6p\u0086c\u0000\u0002÷O\u0015\u0018Á©\\\u0007\fßªêÉn\bç\u001b³ Ñ¬DO):\u001c\u0004ñ\u0086EQüÞ8mªj#>¿»NN\u001dW\u009ffN\u0004ô¿Rw×å½éâ¹ÈGãâ\u009a\u009aáp¬R¥`£)16Z\u0017\bæù&\u0001\u0083\u00173ÒÆÆx¬\u0086Í>\u0010\u0092Ï;%\u0002óàÍ®\u001cDö¥O}\u009eÊçÛ\ná+ß[ÌP-æ0\u0001¸]*Þ¡\u0086\u000b\u0019è2\u0002¿c\u0018\u0093áØx\u001e\u0081¦$\u00926 Ûð%\u0007\u007f#\u0086\u0016È\u0099\u009fpu\u009bÓû\u008dÐìé\rÎÓ\u0092\u00adîßaL\u0014£Ó\u0088\u0000ìßj\u0006'µ¤y¤µ=\u000bs\f£\u0011¤k±7\u0088î\u0088R9\u0099\u0010E\u001c\u0099T\u0011¯\u0097´öþ\n\u008f§Ïä1ü¶²ÉWvIóä:6á\u0003\u0017~\u0015Çé3ï\u001f/ç\u0090\u0089xZ\nvb\u000fÑ@é\u0003Dzd\u0016*\u0004F\u0087BÃdé\u0087Ó[-\u0099ëßüj·%8>\u0006<f5«Ë\u0082ÒµN³\u0003yTüXAÝùï\u001esVã\u008eôÛ9÷]ô\u0081\u009bS{\u0001\u0093y\u0097cíã\u009fþ\u009d°/Îô# \u0012\u0006\u000b\u008d\u000f\u0006ï\u0081_ iñ\u0000Wó¸\u009f\u001b\u008b\u008cÆHh¦¼L{+¸O\u008däþSÕüex×W^\"\u0011\u009f+æ÷è\u008eÁ\u008a§\u009eôR\"þ\u0010wt$\u0088b\u008aÊF§\u008eh±Í\u0097ß^Y\u0000\tÕ\u0018§\u0001\u001dÑ7m\u0015ç\r\f\u0007&Fä«\u0085\u0015£µ:]ö÷w{ÁÀ«}lh|ÌQt±ÁA¿\u0082\u0088\u0087I\u001d0©0Ø\u0014Ôýq\u001ba\u000b¬\u0014ë(,w\u0006®oM®\u0090\\L\u0086\u0087µèU¯¹\tÿ\u0084¥²\u007fR7Ì\u0093¸ý%åeF?ýY¡\u000få&_ÔÿËtí\u0017,¼h\u0002ûO.?\u00823âÛ|?\u0011\u0096;m8\u008f\u0006ÄMù[:\u009dr\u008e2àæ\t¤,\u009bW¾ó";
                     int var5 = "Dê¾1z>\u00049M7Ä\u0090\u0081]<Ûõ¹\u0091+äµzÅyU7B\u0016\u0013¸Ë\bN\u009fÅgWï\u0093\u0088¨´è¡\u0013\u0087O\u00ad0ÿ\u0007^\u0092}¤ÝÄ½ÚØµ9óhHª?\u0002\u0006é²,ýü8Hv°÷Õ6p\u0086c\u0000\u0002÷O\u0015\u0018Á©\\\u0007\fßªêÉn\bç\u001b³ Ñ¬DO):\u001c\u0004ñ\u0086EQüÞ8mªj#>¿»NN\u001dW\u009ffN\u0004ô¿Rw×å½éâ¹ÈGãâ\u009a\u009aáp¬R¥`£)16Z\u0017\bæù&\u0001\u0083\u00173ÒÆÆx¬\u0086Í>\u0010\u0092Ï;%\u0002óàÍ®\u001cDö¥O}\u009eÊçÛ\ná+ß[ÌP-æ0\u0001¸]*Þ¡\u0086\u000b\u0019è2\u0002¿c\u0018\u0093áØx\u001e\u0081¦$\u00926 Ûð%\u0007\u007f#\u0086\u0016È\u0099\u009fpu\u009bÓû\u008dÐìé\rÎÓ\u0092\u00adîßaL\u0014£Ó\u0088\u0000ìßj\u0006'µ¤y¤µ=\u000bs\f£\u0011¤k±7\u0088î\u0088R9\u0099\u0010E\u001c\u0099T\u0011¯\u0097´öþ\n\u008f§Ïä1ü¶²ÉWvIóä:6á\u0003\u0017~\u0015Çé3ï\u001f/ç\u0090\u0089xZ\nvb\u000fÑ@é\u0003Dzd\u0016*\u0004F\u0087BÃdé\u0087Ó[-\u0099ëßüj·%8>\u0006<f5«Ë\u0082ÒµN³\u0003yTüXAÝùï\u001esVã\u008eôÛ9÷]ô\u0081\u009bS{\u0001\u0093y\u0097cíã\u009fþ\u009d°/Îô# \u0012\u0006\u000b\u008d\u000f\u0006ï\u0081_ iñ\u0000Wó¸\u009f\u001b\u008b\u008cÆHh¦¼L{+¸O\u008däþSÕüex×W^\"\u0011\u009f+æ÷è\u008eÁ\u008a§\u009eôR\"þ\u0010wt$\u0088b\u008aÊF§\u008eh±Í\u0097ß^Y\u0000\tÕ\u0018§\u0001\u001dÑ7m\u0015ç\r\f\u0007&Fä«\u0085\u0015£µ:]ö÷w{ÁÀ«}lh|ÌQt±ÁA¿\u0082\u0088\u0087I\u001d0©0Ø\u0014Ôýq\u001ba\u000b¬\u0014ë(,w\u0006®oM®\u0090\\L\u0086\u0087µèU¯¹\tÿ\u0084¥²\u007fR7Ì\u0093¸ý%åeF?ýY¡\u000få&_ÔÿËtí\u0017,¼h\u0002ûO.?\u00823âÛ|?\u0011\u0096;m8\u008f\u0006ÄMù[:\u009dr\u008e2àæ\t¤,\u009bW¾ó".length();
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
                                    f = new Integer[83];
                                    83 = true.u<invokedynamic>(14190, var11 ^ 6180927590972529161L);
                                    2 = true.u<invokedynamic>(24440, var11 ^ 4452504971866174021L);
                                    8I = true.u<invokedynamic>(22299, var11 ^ 1950590449160845893L);
                                    8Q = true.u<invokedynamic>(3643, var11 ^ 6508377125876343676L);
                                    8_ = true.u<invokedynamic>(26746, var11 ^ 2098441201197892865L);
                                    8r = true.u<invokedynamic>(12969, var11 ^ 3951541130390085504L);
                                    9 = true.u<invokedynamic>(23688, var11 ^ 958739696110236152L);
                                    8D = true.u<invokedynamic>(15807, var11 ^ 8412037986468991170L);
                                    8u = true.u<invokedynamic>(19115, var11 ^ 2293278132163602307L);
                                    84 = true.u<invokedynamic>(1389, var11 ^ 549332578000447563L);
                                    0 = true.u<invokedynamic>(3432, var11 ^ 1038781872064307216L);
                                    8x = true.u<invokedynamic>(24632, var11 ^ 2656887622512135507L);
                                    8E = true.u<invokedynamic>(2093, var11 ^ 3237765515089388807L);
                                    8C = true.u<invokedynamic>(22023, var11 ^ 6280420908180798320L);
                                    8z = true.u<invokedynamic>(28473, var11 ^ 8598345492855996935L);
                                    4 = true.u<invokedynamic>(16488, var11 ^ 5412716810484772147L);
                                    8H = true.u<invokedynamic>(16488, var11 ^ 5412716810484772147L);
                                    7 = true.u<invokedynamic>(5957, var11 ^ 1256231834149534256L);
                                    8g = true.u<invokedynamic>(19522, var11 ^ 1292949097246187808L);
                                    8L = true.u<invokedynamic>(16488, var11 ^ 5412716810484772147L);
                                    8O = true.u<invokedynamic>(29102, var11 ^ 8885303209310280948L);
                                    8b = true.u<invokedynamic>(2159, var11 ^ 3157594651115889956L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0002\u0011\u008f7]#vò¥Kÿ!\u009cT¶\u0006";
                                 var5 = "\u0002\u0011\u008f7]#vò¥Kÿ!\u009cT¶\u0006".length();
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

                  var17 = "sÆWþ¿J\u0001Ùô\u000eBqõû\u0093û\u0017ÒyPÆ®¦e;\u0085Í»¤)Ëe\u0018]U_\n\u0092xëí]\u0007³´_HÛ~fãlJ\u0010Ã«\u0087";
                  var19 = "sÆWþ¿J\u0001Ùô\u000eBqõû\u0093û\u0017ÒyPÆ®¦e;\u0085Í»¤)Ëe\u0018]U_\n\u0092xëí]\u0007³´_HÛ~fãlJ\u0010Ã«\u0087".length();
                  var16 = ' ';
                  var24 = -1;
            }

            ++var24;
            var25 = var17.substring(var24, var24 + var16);
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
               case 0 -> var10000 = 60;
               case 1 -> var10000 = 1;
               case 2 -> var10000 = 28;
               case 3 -> var10000 = 3;
               case 4 -> var10000 = 49;
               case 5 -> var10000 = 36;
               case 6 -> var10000 = 11;
               case 7 -> var10000 = 37;
               case 8 -> var10000 = 12;
               case 9 -> var10000 = 54;
               case 10 -> var10000 = 16;
               case 11 -> var10000 = 13;
               case 12 -> var10000 = 41;
               case 13 -> var10000 = 34;
               case 14 -> var10000 = 52;
               case 15 -> var10000 = 42;
               case 16 -> var10000 = 2;
               case 17 -> var10000 = 5;
               case 18 -> var10000 = 15;
               case 19 -> var10000 = 22;
               case 20 -> var10000 = 43;
               case 21 -> var10000 = 56;
               case 22 -> var10000 = 20;
               case 23 -> var10000 = 26;
               case 24 -> var10000 = 29;
               case 25 -> var10000 = 33;
               case 26 -> var10000 = 44;
               case 27 -> var10000 = 7;
               case 28 -> var10000 = 10;
               case 29 -> var10000 = 61;
               case 30 -> var10000 = 51;
               case 31 -> var10000 = 6;
               case 32 -> var10000 = 9;
               case 33 -> var10000 = 24;
               case 34 -> var10000 = 40;
               case 35 -> var10000 = 57;
               case 36 -> var10000 = 50;
               case 37 -> var10000 = 32;
               case 38 -> var10000 = 27;
               case 39 -> var10000 = 53;
               case 40 -> var10000 = 19;
               case 41 -> var10000 = 35;
               case 42 -> var10000 = 8;
               case 43 -> var10000 = 23;
               case 44 -> var10000 = 0;
               case 45 -> var10000 = 48;
               case 46 -> var10000 = 25;
               case 47 -> var10000 = 45;
               case 48 -> var10000 = 30;
               case 49 -> var10000 = 18;
               case 50 -> var10000 = 58;
               case 51 -> var10000 = 14;
               case 52 -> var10000 = 38;
               case 53 -> var10000 = 63;
               case 54 -> var10000 = 46;
               case 55 -> var10000 = 31;
               case 56 -> var10000 = 55;
               case 57 -> var10000 = 4;
               case 58 -> var10000 = 39;
               case 59 -> var10000 = 17;
               case 60 -> var10000 = 47;
               case 61 -> var10000 = 21;
               case 62 -> var10000 = 62;
               default -> var10000 = 59;
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
      var10000[3] = Integer.TYPE;
      i[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      i[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Double.TYPE;
      i[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = Void.TYPE;
      i[14] = "c";
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
      var10000[26] = Character.TYPE;
      i[26] = "c";
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
      var10000[54] = Float.TYPE;
      i[54] = "c";
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
      var10000[77] = Long.TYPE;
      i[77] = "c";
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
         if (var8 != 'm' && var8 != 234 && var8 != 206 && var8 != 249) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'b') {
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
            if (var8 == 'm') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 234) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 206) {
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
