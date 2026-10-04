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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1269;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

public class 2F extends 9a {
   private static final double 2j = (double)5.0F;
   private final 4i 2v;
   private final 4H 6;
   private final 4H 2m;
   private final 44 2b;
   private final 4H 24;
   private final 4k 2t;
   private final 44 1;
   private final 4H 2H;
   private final 4H 7;
   private final 4H 2V;
   private static final Random 2;
   private final 7T6 2r;
   private class_2338 2U;
   private class_2338 2N;
   private boolean 2l;
   private class_3965 2T;
   private class_3965 2x;
   private int 2q;
   private int 8;
   private int 2F;
   private int 9;
   private class_2338 2O;
   private 6k 2J;
   private boolean 2u;
   private int 3;
   private 03 2G;
   private class_2338 2D;
   private class_2338 26;
   private class_3965 2o;
   private int 2C;
   private int 2B;
   private boolean 2a;
   private boolean 5;
   private boolean 2Z;
   private int 0;
   private int 2n;
   private int 2P;
   private int 2L;
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
   private static transient String bdjhBqEehT;

   public _F/* $FF was: 2F*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public void _U/* $FF was: 1U*/() {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private 7Op _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7Op _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void __/* $FF was: 8_*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _C/* $FF was: 4C*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_1269 _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _N/* $FF was: 9N*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _j/* $FF was: 4j*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _o/* $FF was: 4o*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _q/* $FF was: 4q*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7OP _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static class_2338 _/* $FF was: 0*/(Object[] var0) {
      int var3 = (Integer)var0[2];
      long var1 = (Long)var0[0];
      var1 = b ^ var1;
      int[] var5 = "c".B<invokedynamic>((long)"c", var1)[var3];
      return ((class_2338)var0[1]).M<invokedynamic>((class_2338)var0[1], var5[0], 0, var5[1], (long)"c", var1);
   }

   private class_3965 _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_3965 _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static class_243 _/* $FF was: 8*/(Object[] var0) {
      int var2 = (Integer)var0[0];
      int var5 = (Integer)var0[1];
      class_243 var4 = (class_243)var0[3];
      int var1 = (Integer)var0[2];
      long var6 = ((long)var2 << 48 | (long)var5 << 32 >>> 16 | (long)var1 << 48 >>> 48) ^ b;
      double var8 = ("c".B<invokedynamic>((long)"c", var6).M<invokedynamic>("c".B<invokedynamic>((long)"c", var6), (long)"c", var6) * "c" - "c") * "c";
      double var10 = ("c".B<invokedynamic>((long)"c", var6).M<invokedynamic>("c".B<invokedynamic>((long)"c", var6), (long)"c", var6) * "c" - "c") * "c";

      class_243 var13;
      label40: {
         label41: {
            try {
               int[] var10000 = "c".B<invokedynamic>((long)"c", var6);
               class_2350.class_2351 var10001 = ((class_2350)var0[4]).M<invokedynamic>((class_2350)var0[4], (long)"c", var6);
               switch (var10000[var10001.M<invokedynamic>(var10001, (long)"c", var6)]) {
                  case 1 -> { }
                  case 2 -> { }
                  case 3 -> { }
                  default -> throw new MatchException((String)null, (Throwable)null);
               }
            } catch (MatchException var12) {
               throw var12.É<invokedynamic>(var12, (long)"c", var6);
            }

            var13 = var4.M<invokedynamic>(var4, var8, var10, (double)"c", (long)"c", var6);
            return var13;
         }

         var13 = var4.M<invokedynamic>(var4, var8, (double)"c", var10, (long)"c", var6);
         return var13;
      }

      var13 = var4.M<invokedynamic>(var4, (double)"c", var8, var10, (long)"c", var6);
      return var13;
   }

   private boolean __/* $FF was: 4_*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private double[] _/* $FF was: 6*/(Object[] var1) {
      class_2338 var4 = (class_2338)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      class_746 var10000 = "c".B<invokedynamic>((long)"c", var2).á<invokedynamic>("c".B<invokedynamic>((long)"c", var2), (long)"c", var2);
      class_243 var5 = var10000.M<invokedynamic>(var10000, (long)"c", var2);
      return new double[]{var5.á<invokedynamic>(var5, (long)"c", var2) - (double)var4.M<invokedynamic>(var4, (long)"c", var2), var5.á<invokedynamic>(var5, (long)"c", var2) - (double)var4.M<invokedynamic>(var4, (long)"c", var2), var5.á<invokedynamic>(var5, (long)"c", var2) - (double)var4.M<invokedynamic>(var4, (long)"c", var2)};
   }

   private double[] _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      class_746 var10000 = "c".B<invokedynamic>((long)"c", var2).á<invokedynamic>("c".B<invokedynamic>((long)"c", var2), (long)"c", var2);
      class_243 var4 = var10000.M<invokedynamic>(var10000, (float)"c", (long)"c", var2);
      return new double[]{var4.á<invokedynamic>(var4, (long)"c", var2), var4.á<invokedynamic>(var4, (long)"c", var2), var4.á<invokedynamic>(var4, (long)"c", var2)};
   }

   private boolean _j/* $FF was: 4j*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _M/* $FF was: 0M*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _4/* $FF was: 94*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      class_638 var10000 = "c".B<invokedynamic>((long)"c", var3).á<invokedynamic>("c".B<invokedynamic>((long)"c", var3), (long)"c", var3);
      return var10000.M<invokedynamic>(var10000, "c".B<invokedynamic>((long)"c", var3).M<invokedynamic>("c".B<invokedynamic>((long)"c", var3), (long)"c", var3), (class_2338)var1[0], "c".É<invokedynamic>((long)"c", var3), (long)"c", var3);
   }

   private class_2350 _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static class_2350 _/* $FF was: 3*/(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = b ^ var1;

      class_2350 var10000;
      label66: {
         label67: {
            label68: {
               label69: {
                  label70: {
                     try {
                        switch (var3) {
                           case 0:
                              var10000 = "c".B<invokedynamic>((long)"c", var1);
                              return var10000;
                           case 1:
                              break label66;
                           case 2:
                              break label67;
                           case 3:
                              break label68;
                           case 4:
                              break label69;
                           case 5:
                              break label70;
                        }
                     } catch (MatchException var4) {
                        throw var4.É<invokedynamic>(var4, (long)"c", var1);
                     }

                     var10000 = "c".B<invokedynamic>((long)"c", var1);
                     return var10000;
                  }

                  var10000 = "c".B<invokedynamic>((long)"c", var1);
                  return var10000;
               }

               var10000 = "c".B<invokedynamic>((long)"c", var1);
               return var10000;
            }

            var10000 = "c".B<invokedynamic>((long)"c", var1);
            return var10000;
         }

         var10000 = "c".B<invokedynamic>((long)"c", var1);
         return var10000;
      }

      var10000 = "c".B<invokedynamic>((long)"c", var1);
      return var10000;
   }

   private static int _/* $FF was: 3*/(Object[] var0) {
      long var2 = (Long)var0[1];
      var2 = b ^ var2;

      byte var10000;
      label64: {
         label65: {
            label66: {
               label67: {
                  label68: {
                     try {
                        switch ("c".B<invokedynamic>((long)"c", var2)[((class_2350)var0[0]).M<invokedynamic>((class_2350)var0[0], (long)"c", var2)]) {
                           case 1 -> { }
                           case 2 -> { }
                           case 3 -> { }
                           case 4 -> { }
                           case 5 -> { }
                           case 6 -> { }
                           default -> throw new MatchException((String)null, (Throwable)null);
                        }
                     } catch (MatchException var4) {
                        throw var4.É<invokedynamic>(var4, (long)"c", var2);
                     }

                     var10000 = 5;
                     return var10000;
                  }

                  var10000 = 4;
                  return var10000;
               }

               var10000 = 3;
               return var10000;
            }

            var10000 = 2;
            return var10000;
         }

         var10000 = 1;
         return var10000;
      }

      var10000 = 0;
      return var10000;
   }

   private boolean _P/* $FF was: 4P*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 2*/(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _X/* $FF was: 4X*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _b/* $FF was: 4b*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _M/* $FF was: 4M*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _r/* $FF was: 3r*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private void _P/* $FF was: 4P*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _L/* $FF was: 4L*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_2338 _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _a/* $FF was: 4a*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _q/* $FF was: 9q*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _d/* $FF was: 4d*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 8*/(long param1, class_2338 param3, class_2338 param4) {
      // $FF: Couldn't be decompiled
   }

   private boolean _Y/* $FF was: 9Y*/(short param1, int param2, short param3, class_2338 param4) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(2F.class, 306);
      b = com.corz.client.s.a(9007456684712406162L, 7805163247323617141L, MethodHandles.lookup().lookupClass()).a(55287572720845L);
      o = new Object[408];
      p = new String[408];
      b();
      h = new HashMap(13);
      long var11 = b ^ 26048754776123L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[32];
      int var18 = 0;
      String var17 = "\u008dâ¦ f\u001eoG%½1' ³0|âýûÎe\u0011ÁÉÎ\u000e\\¹ÿ\u009d»ê<©Þ\u0013\n§ªJÇèï\u0017c\u0082\u0085k\u008fP\u008bÊ[Ã\"2Û\u009côÂ)ù\u009e\u0082\u0010\u00adzýNf.ZÂÛÐ0\u0000\u0006¶û\n\u0010@è\u00985)Ã¾C\u0080\u000eC\u0003\fÏsØ ¨ÿO\u0095ORóÜ³7æá\u001f\u0080ºægY¬º^bC0th§\u0086¡\u0080üX\u0018^¹îVnÏï\u009d\u0097w°ö %«\u0090\u0010\u0089ÞXOµ\u0003\f\u0010·\u000f7¸¦¹tu\u0010vg°ÓÀTò\u0010¥j\u0093¬\u0088¬çÛf4Æ!¡³Ýk -\u0084hfe\u009eYÃ\u008c\u0088\u009bµõ1:RFîÖ\u0091¶íÈx5\u0017R40¹\fÆ \u00ad7| IÂû¾ÏáHäUµ\u0015@Í\u000eæªGâ¿\u009c\\lhý)åÏ\u008a þ\u0097\\þÀ÷\tWÏNÞ5ÜÛ\f%¼|²â\u000bæ½\u0016|Wì\u0094\u001e²xÖH_2úd\u009flº\ty\ta6\u0016ò[Ø#ôäíÀÂ@a\u000f®Ui\u009dVP<æ6WÊ\u0088\u0092\u0088\b\u0013\f«\u000eO\u0018.Ô\u007f¬UWÕi\u0018Ïì£±(z\u0088%\u0090zÏà\u001bü\u001f « f\u0006N^¸^Fc\u0082Þ5\u0019/\u0000\\\u0090\u008b\u001cÄ©\u0086\u009cßõèÏ^%\u001b¨Êä _w3ÊÙÝ\u008dS¤Âúx\u001f\u001aúû\u008al\u00041\u0004\u0093Áuç¾\u0005ñ_\u0013\u0086`\u0010÷h@\u0084\u0006u%\u009cß\u00147´T;OD\u0018=ã°G³È1Ï®\u0098\"Æ%É´ ¿\u0017?4¶cìÈ\u00189\u008dPÀóv\u0081ìJ\u0002ëæí\u009cªD6[¯(B½ùy ä\t Ø|a\u00826\u008es¦µD\u0090\u0019`sm\u0013\u0006\u008b\tð°õ\u009d=ðæ°ç5\u0010¯\u000fâ¥µ;Wo,uÒ^Hi\u001c\u0001\u0010å.\u0085\u0003\u0080\u008cÈ\u0095½\u0080H\u0002i\u008dÞ- å©\u0016´Rôy\u001bh±\tEn¼Jmë\u0003¼}\u0081û\u0005á\u0087\u009c\u0012ëíÉÈ¾ ¿Mà?÷@9\u0083J(]ý\u008b\u0006\u0081,©\u0082OaÁ½¬Ë®C\u0018\u0080E\u0085\u0081é\u0010Rèï\u0018e~`ûÊ\u008edSßXoQ bÙ\u0017ÕsÀÞv\u001eç»\u001e#öAª\u0092\u008f\u0002§T^ìxá{\f\u0019A¹´\u001e \u0000µcÏ¯0\u0011ÞûíÊ\u0016ÑÜ\u008b\u0015E=ËC\t¬Ó¿õtÛ$Ë3uÚ(iëÏÏ§Q:9·ã½\u00ad\u0097Ìå\u0085£Ì\nW\u008a¼\u0014\u009cïO®È*\u0097'ö\u009eêÛ\\Sùj~( ±þkZúï,-\u0001ÃtÝhýY0Gô\n\u0019\u008fË\u008a\u0084FÁ\u008dÀ\u0005>Ç!ô}\u0006Ç\u00004#H\u000f\r\u0080ëÜ\u0081¢\u0086BÏ¼<%PË\u00ad\u0012^\t\\f\u0005î º\u0086²\u0090f%Ò\u0092þ\u00016?ì}\u0014*¬ä\u0005YZ\u009cÏ\u0097\u009b*õ+\u0018z\u0089\u009d\u0083ùÐ\u0095\u0089@Áä²Ê±ßnÎ\u001dY\u0010¦ú²ù*y\u0016U¡\u008c\u009cvtxÞÓ\u0010\rý\u000fÔ$-\u009e;w-Y\u008eÊ\u0086\u0013\u0089\u0018ëNis\u0015~\\«PêÏ]\u0015.\u009aê<:£ð\u0019·\u0094µ";
      int var19 = "\u008dâ¦ f\u001eoG%½1' ³0|âýûÎe\u0011ÁÉÎ\u000e\\¹ÿ\u009d»ê<©Þ\u0013\n§ªJÇèï\u0017c\u0082\u0085k\u008fP\u008bÊ[Ã\"2Û\u009côÂ)ù\u009e\u0082\u0010\u00adzýNf.ZÂÛÐ0\u0000\u0006¶û\n\u0010@è\u00985)Ã¾C\u0080\u000eC\u0003\fÏsØ ¨ÿO\u0095ORóÜ³7æá\u001f\u0080ºægY¬º^bC0th§\u0086¡\u0080üX\u0018^¹îVnÏï\u009d\u0097w°ö %«\u0090\u0010\u0089ÞXOµ\u0003\f\u0010·\u000f7¸¦¹tu\u0010vg°ÓÀTò\u0010¥j\u0093¬\u0088¬çÛf4Æ!¡³Ýk -\u0084hfe\u009eYÃ\u008c\u0088\u009bµõ1:RFîÖ\u0091¶íÈx5\u0017R40¹\fÆ \u00ad7| IÂû¾ÏáHäUµ\u0015@Í\u000eæªGâ¿\u009c\\lhý)åÏ\u008a þ\u0097\\þÀ÷\tWÏNÞ5ÜÛ\f%¼|²â\u000bæ½\u0016|Wì\u0094\u001e²xÖH_2úd\u009flº\ty\ta6\u0016ò[Ø#ôäíÀÂ@a\u000f®Ui\u009dVP<æ6WÊ\u0088\u0092\u0088\b\u0013\f«\u000eO\u0018.Ô\u007f¬UWÕi\u0018Ïì£±(z\u0088%\u0090zÏà\u001bü\u001f « f\u0006N^¸^Fc\u0082Þ5\u0019/\u0000\\\u0090\u008b\u001cÄ©\u0086\u009cßõèÏ^%\u001b¨Êä _w3ÊÙÝ\u008dS¤Âúx\u001f\u001aúû\u008al\u00041\u0004\u0093Áuç¾\u0005ñ_\u0013\u0086`\u0010÷h@\u0084\u0006u%\u009cß\u00147´T;OD\u0018=ã°G³È1Ï®\u0098\"Æ%É´ ¿\u0017?4¶cìÈ\u00189\u008dPÀóv\u0081ìJ\u0002ëæí\u009cªD6[¯(B½ùy ä\t Ø|a\u00826\u008es¦µD\u0090\u0019`sm\u0013\u0006\u008b\tð°õ\u009d=ðæ°ç5\u0010¯\u000fâ¥µ;Wo,uÒ^Hi\u001c\u0001\u0010å.\u0085\u0003\u0080\u008cÈ\u0095½\u0080H\u0002i\u008dÞ- å©\u0016´Rôy\u001bh±\tEn¼Jmë\u0003¼}\u0081û\u0005á\u0087\u009c\u0012ëíÉÈ¾ ¿Mà?÷@9\u0083J(]ý\u008b\u0006\u0081,©\u0082OaÁ½¬Ë®C\u0018\u0080E\u0085\u0081é\u0010Rèï\u0018e~`ûÊ\u008edSßXoQ bÙ\u0017ÕsÀÞv\u001eç»\u001e#öAª\u0092\u008f\u0002§T^ìxá{\f\u0019A¹´\u001e \u0000µcÏ¯0\u0011ÞûíÊ\u0016ÑÜ\u008b\u0015E=ËC\t¬Ó¿õtÛ$Ë3uÚ(iëÏÏ§Q:9·ã½\u00ad\u0097Ìå\u0085£Ì\nW\u008a¼\u0014\u009cïO®È*\u0097'ö\u009eêÛ\\Sùj~( ±þkZúï,-\u0001ÃtÝhýY0Gô\n\u0019\u008fË\u008a\u0084FÁ\u008dÀ\u0005>Ç!ô}\u0006Ç\u00004#H\u000f\r\u0080ëÜ\u0081¢\u0086BÏ¼<%PË\u00ad\u0012^\t\\f\u0005î º\u0086²\u0090f%Ò\u0092þ\u00016?ì}\u0014*¬ä\u0005YZ\u009cÏ\u0097\u009b*õ+\u0018z\u0089\u009d\u0083ùÐ\u0095\u0089@Áä²Ê±ßnÎ\u001dY\u0010¦ú²ù*y\u0016U¡\u008c\u009cvtxÞÓ\u0010\rý\u000fÔ$-\u009e;w-Y\u008eÊ\u0086\u0013\u0089\u0018ëNis\u0015~\\«PêÏ]\u0015.\u009aê<:£ð\u0019·\u0094µ".length();
      char var16 = '@';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var17.substring(var24, var24 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     f = var20;
                     g = new String[32];
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[31];
                     int var3 = 0;
                     String var4 = "Ó¥ò¯P¸Y°yS©À`·\u009fg\rª\\\u001aE\u0001Ïû\n\u008c?\r]mºÒ?RF\u0085\u009cø\u0086Óé\u009fv\u0003\u0090¶\t±\u0085\u0085Ð\u008a\u009cÊn\u0014Çµ\u008c\u0002Ü,\u00027³Ì\u001f>k\u0091â\u0082\blC\u0010\u001e)RiEÐé®f¹¡'fgª\u008c5\u0004\u009c35¿ZËÆ¬&¯=Hº\u009cK³}¦³\u0099ôðñ¾)=[4Q\u001e\u008a\u0083ür\u009e\u008a\u009f/\u0016,½ÍU2\nô×&þ\u000b³A!ÇÄ´eE{A}òþN\u008d[\u0000\u0080Ý\u008cÊ²»¯ºªì\u0082m{á\u000f%\u000eT¹5Àð³\u0082Kw\u0083ÓÅ¸-¸~Vqe\u008b?\u008aÐ\u0080 ¤*Em¿dØ²i\f\u0017V\\Ùv7\u0089\u0094f\u0086%g¬3\u0006Ê\u001a÷B";
                     int var5 = "Ó¥ò¯P¸Y°yS©À`·\u009fg\rª\\\u001aE\u0001Ïû\n\u008c?\r]mºÒ?RF\u0085\u009cø\u0086Óé\u009fv\u0003\u0090¶\t±\u0085\u0085Ð\u008a\u009cÊn\u0014Çµ\u008c\u0002Ü,\u00027³Ì\u001f>k\u0091â\u0082\blC\u0010\u001e)RiEÐé®f¹¡'fgª\u008c5\u0004\u009c35¿ZËÆ¬&¯=Hº\u009cK³}¦³\u0099ôðñ¾)=[4Q\u001e\u008a\u0083ür\u009e\u008a\u009f/\u0016,½ÍU2\nô×&þ\u000b³A!ÇÄ´eE{A}òþN\u008d[\u0000\u0080Ý\u008cÊ²»¯ºªì\u0082m{á\u000f%\u000eT¹5Àð³\u0082Kw\u0083ÓÅ¸-¸~Vqe\u008b?\u008aÐ\u0080 ¤*Em¿dØ²i\f\u0017V\\Ùv7\u0089\u0094f\u0086%g¬3\u0006Ê\u001a÷B".length();
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
                                    l = var6;
                                    m = new Integer[31];
                                    2 = new Random();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "fe¢\u0017\u0093³j<¢HJ\u0002\u0003´[:";
                                 var5 = "fe¢\u0017\u0093³j<¢HJ\u0002\u0003´[:".length();
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

                  var17 = "Ø\"\u0017u4\u009c\t¡ ø .ìî\u0089K/|\u001dÓ@ÑÕ\u009dh\u0014æ'À\u007fùÍmýÏ¾V£\u0019Ó8X¤¸\u008cÀñdÔÑ^«âcïP½\u0088\u0091ÓY¿\u0089\u0016zâô¸ÁyY@\u0095Ä±Áï\u0011\u0097\b\u009b¾ºíÛÂÌîL\u0097(½Ah\u00896Û\u000bÝqtH5;Ê\u001c\u0016\u001f¬\u0004Î\u001fH\u009c±\u008b\u009e\u008e\u00ad\u0007s\u0006|KÆÖ3Ö]\u00808\u001b\u0005âçGÛÆg[E\u0007\u0094SMC|ÐY\u0012Ù\u0014\u0012ýðvÓÅÓú\u0018+×XUCé5£Ó»\u0017=\u0099ÕøD¥Ç«¹p\u0097\u0006ç";
                  var19 = "Ø\"\u0017u4\u009c\t¡ ø .ìî\u0089K/|\u001dÓ@ÑÕ\u009dh\u0014æ'À\u007fùÍmýÏ¾V£\u0019Ó8X¤¸\u008cÀñdÔÑ^«âcïP½\u0088\u0091ÓY¿\u0089\u0016zâô¸ÁyY@\u0095Ä±Áï\u0011\u0097\b\u009b¾ºíÛÂÌîL\u0097(½Ah\u00896Û\u000bÝqtH5;Ê\u001c\u0016\u001f¬\u0004Î\u001fH\u009c±\u008b\u009e\u008e\u00ad\u0007s\u0006|KÆÖ3Ö]\u00808\u001b\u0005âçGÛÆg[E\u0007\u0094SMC|ÐY\u0012Ù\u0014\u0012ýðvÓÅÓú\u0018+×XUCé5£Ó»\u0017=\u0099ÕøD¥Ç«¹p\u0097\u0006ç".length();
                  var16 = 160;
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int d(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

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
               case 0 -> var10000 = 15;
               case 1 -> var10000 = 5;
               case 2 -> var10000 = 1;
               case 3 -> var10000 = 32;
               case 4 -> var10000 = 55;
               case 5 -> var10000 = 49;
               case 6 -> var10000 = 57;
               case 7 -> var10000 = 47;
               case 8 -> var10000 = 17;
               case 9 -> var10000 = 36;
               case 10 -> var10000 = 59;
               case 11 -> var10000 = 52;
               case 12 -> var10000 = 9;
               case 13 -> var10000 = 16;
               case 14 -> var10000 = 31;
               case 15 -> var10000 = 46;
               case 16 -> var10000 = 26;
               case 17 -> var10000 = 22;
               case 18 -> var10000 = 42;
               case 19 -> var10000 = 63;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 37;
               case 22 -> var10000 = 43;
               case 23 -> var10000 = 40;
               case 24 -> var10000 = 50;
               case 25 -> var10000 = 18;
               case 26 -> var10000 = 11;
               case 27 -> var10000 = 25;
               case 28 -> var10000 = 61;
               case 29 -> var10000 = 27;
               case 30 -> var10000 = 38;
               case 31 -> var10000 = 62;
               case 32 -> var10000 = 8;
               case 33 -> var10000 = 19;
               case 34 -> var10000 = 12;
               case 35 -> var10000 = 0;
               case 36 -> var10000 = 51;
               case 37 -> var10000 = 60;
               case 38 -> var10000 = 45;
               case 39 -> var10000 = 30;
               case 40 -> var10000 = 7;
               case 41 -> var10000 = 35;
               case 42 -> var10000 = 28;
               case 43 -> var10000 = 2;
               case 44 -> var10000 = 13;
               case 45 -> var10000 = 14;
               case 46 -> var10000 = 33;
               case 47 -> var10000 = 24;
               case 48 -> var10000 = 34;
               case 49 -> var10000 = 41;
               case 50 -> var10000 = 3;
               case 51 -> var10000 = 29;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 10;
               case 54 -> var10000 = 39;
               case 55 -> var10000 = 6;
               case 56 -> var10000 = 56;
               case 57 -> var10000 = 21;
               case 58 -> var10000 = 23;
               case 59 -> var10000 = 44;
               case 60 -> var10000 = 53;
               case 61 -> var10000 = 54;
               case 62 -> var10000 = 20;
               default -> var10000 = 48;
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
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Boolean.TYPE;
      p[7] = "c";
      var10000[8] = "c";
      var10000[9] = Void.TYPE;
      p[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Integer.TYPE;
      p[13] = "c";
      var10000[14] = Double.TYPE;
      p[14] = "c";
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
      var10000[99] = Long.TYPE;
      p[99] = "c";
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
      var10000[140] = Byte.TYPE;
      p[140] = "c";
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
      var10000[153] = Float.TYPE;
      p[153] = "c";
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

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = p[var4];
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
               o[var4] = var26;
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
                     o[var4] = var19;
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

   private static native MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

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
