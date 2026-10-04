package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 5d {
   public static final int 1;
   public static final int 54;
   public static final int 4;
   public static final int 2;
   public static final int 7;
   public static final int 9;
   public static final int 6;
   private static final String[] 3;
   private final Map 5x;
   private final Map 0;
   private String 5F;
   private int 5g;
   private int 8;
   private int 5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String wgKioXPfxi;

   public _d/* $FF was: 5d*/(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      super();
      this.5x = new LinkedHashMap();
      this.0 = new HashMap();
      this.Í<invokedynamic>(this, "c", (long)"c", var4);
   }

   public static String _/* $FF was: 2*/(Object[] var0) {
      long var1 = (Long)var0[1];
      int var3 = (Integer)var0[0];
      var1 = a ^ var1;
      boolean var4 = "c".Æ<invokedynamic>((long)"c", var1);

      String var8;
      label28: {
         label27: {
            try {
               var10000 = var3;
               if (var4) {
                  break label27;
               }

               if (var3 < 0) {
                  break label28;
               }
            } catch (MatchException var6) {
               throw var6.Æ<invokedynamic>(var6, (long)"c", var1);
            }

            var10000 = var3;
         }

         try {
            if (var10000 < "c".¢<invokedynamic>((long)"c", var1).length) {
               var8 = "c".¢<invokedynamic>((long)"c", var1)[var3];
               return var8;
            }
         } catch (MatchException var5) {
            throw var5.Æ<invokedynamic>(var5, (long)"c", var1);
         }
      }

      var8 = "c";
      return var8;
   }

   public static int _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 9*/(Object[] var0) {
      long var2 = (Long)var0[1];
      7FL var1 = (7FL)var0[0];
      var2 = a ^ var2;

      boolean var10000;
      try {
         if (var1 == "c".¢<invokedynamic>((long)"c", var2)) {
            var10000 = true;
            return var10000;
         }
      } catch (MatchException var4) {
         throw var4.Æ<invokedynamic>(var4, (long)"c", var2);
      }

      var10000 = false;
      return var10000;
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[2];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      this.t<invokedynamic>(this, (long)"c", var2).Ð<invokedynamic>(this.t<invokedynamic>(this, (long)"c", var2), (Long)var1[0].Æ<invokedynamic>((Long)var1[0], (long)"c", var2), (long)"c", var2);
      this.Í<invokedynamic>(this, var4, (long)"c", var2);
      this.Í<invokedynamic>(this, this.t<invokedynamic>(this, (long)"c", var2) + 1, (long)"c", var2);
      this.t<invokedynamic>(this, (long)"c", var2).Ð<invokedynamic>(this.t<invokedynamic>(this, (long)"c", var2), var4, true.Æ<invokedynamic>(1, (long)"c", var2), Integer::sum, (long)"c", var2);
      return false;
   }

   public String _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.t<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.t<invokedynamic>(this, (long)"c", var2);
      return var10000.Ð<invokedynamic>(var10000, (long)"c", var2);
   }

   public int _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.t<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.t<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      int var3 = (Integer)var1[2];
      int var4 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      long var5 = ((long)var4 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      return this.t<invokedynamic>(this, (long)"c", var5);
   }

   public Map _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.t<invokedynamic>(this, (long)"c", var2);
   }

   public Collection _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.t<invokedynamic>(this, (long)"c", var2);
      return var10000.Ð<invokedynamic>(var10000, (long)"c", var2);
   }

   public 7fs _/* $FF was: 0*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      Map var10000 = this.t<invokedynamic>(this, (long)"c", var4);
      return (7fs)var10000.Ð<invokedynamic>(var10000, (Long)var1[0].Æ<invokedynamic>((Long)var1[0], (long)"c", var4), (long)"c", var4);
   }

   public String _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.t<invokedynamic>(this, (long)"c", var2).Ð<invokedynamic>(this.t<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(5d.class, 770);
      a = s.a(4450994142719021426L, -8063264482749280382L, MethodHandles.lookup().lookupClass()).a(245822197443093L);
      long var20 = a ^ 94562097514991L;
      h = new Object[71];
      i = new String[71];
      a();
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "üj8tà\u000fW¯\u0098Ïo£\u007f\u0003Ç(Â\u0018'ÏüZ¤Ò®~â\u0016\u0014Z\u0016K\u008cMïI(\u0093`F(\u00199¹\u0081cBBãÔwv7ÆñR\u0090RG\u008e´ô\u009cJEs8\u0082 C\u000f¬ÇO\u008f'Gn =2\u0010â¤¤\u001c\u001f£6óL£â±QKvu\u0010B\ræõU\u00900Ä\u0096=\u0087\u0092\u008dõX<(k=°@$æ\u008e\u0095¾¨(æ:\u0085Øå\u0010õ\u0010\r\u0080\u0002;\u001bÕO\u009e^ïs[Çô\u008aOdSñ61\u0010Í\u0001\u001dlÑ%ýH<@)¨ð¸úÛ\u0010«\u0090<\fSF\r\u0013g]rsÊý\u0081y(RÅÿt¿Xøpµ\u0007.¬æ{\u008d-n_®ç²\u0005@\u00adFÎ´\u0098;.<\u009a`\u0011,Â{\u0001\u00897\u0010'k\u0086[²$Ò\u008fÞMe.¥ê\u008f\u0099\u0010u¥\u009a@¯Ó\u0004g\u001f;¦$\u001aª!\u0000(Wgo \tS\u0087Â°HfxÝô99\u009a\u0005¾\u0012°Å\u0019«V²ê\u0012|PsÑö\u000by5Ê1³N\u0010vV\u0087d¼7Iå\u001aµ\u0096#Êò7\u0095";
      int var17 = "üj8tà\u000fW¯\u0098Ïo£\u007f\u0003Ç(Â\u0018'ÏüZ¤Ò®~â\u0016\u0014Z\u0016K\u008cMïI(\u0093`F(\u00199¹\u0081cBBãÔwv7ÆñR\u0090RG\u008e´ô\u009cJEs8\u0082 C\u000f¬ÇO\u008f'Gn =2\u0010â¤¤\u001c\u001f£6óL£â±QKvu\u0010B\ræõU\u00900Ä\u0096=\u0087\u0092\u008dõX<(k=°@$æ\u008e\u0095¾¨(æ:\u0085Øå\u0010õ\u0010\r\u0080\u0002;\u001bÕO\u009e^ïs[Çô\u008aOdSñ61\u0010Í\u0001\u001dlÑ%ýH<@)¨ð¸úÛ\u0010«\u0090<\fSF\r\u0013g]rsÊý\u0081y(RÅÿt¿Xøpµ\u0007.¬æ{\u008d-n_®ç²\u0005@\u00adFÎ´\u0098;.<\u009a`\u0011,Â{\u0001\u00897\u0010'k\u0086[²$Ò\u008fÞMe.¥ê\u008f\u0099\u0010u¥\u009a@¯Ó\u0004g\u001f;¦$\u001aª!\u0000(Wgo \tS\u0087Â°HfxÝô99\u009a\u0005¾\u0012°Å\u0019«V²ê\u0012|PsÑö\u000by5Ê1³N\u0010vV\u0087d¼7Iå\u001aµ\u0096#Êò7\u0095".length();
      char var14 = '(';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var15.substring(var24, var24 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[14];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var39 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var39.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "\u0092{\u008f_\u0018öuQá\u0014\u001e®\u008bÔCED3\u0086L\u0016\u0085\u0017@c\u009aûòÀ>Ý¡®\u007f\u000b§i\u001fú¸\u008dj\u000eJ{+Ú\u008cº\u00878\u0006Ô\u0013FvNmj§òIIÄ";
                     int var5 = "\u0092{\u008f_\u0018öuQá\u0014\u001e®\u008bÔCED3\u0086L\u0016\u0085\u0017@c\u009aûòÀ>Ý¡®\u007f\u000b§i\u001fú¸\u008dj\u000eJ{+Ú\u008cº\u00878\u0006Ô\u0013FvNmj§òIIÄ".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while(true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[10];
                                    1 = true.l<invokedynamic>(5365, var20 ^ 7724700156868903032L);
                                    54 = true.l<invokedynamic>(5951, var20 ^ 8059529087504597936L);
                                    7 = true.l<invokedynamic>(6903, var20 ^ 316364767441636988L);
                                    9 = true.l<invokedynamic>(24127, var20 ^ 5071314288697838264L);
                                    4 = true.l<invokedynamic>(32195, var20 ^ 790211985122830661L);
                                    6 = true.l<invokedynamic>(2654, var20 ^ 2562605017001844432L);
                                    2 = true.l<invokedynamic>(18118, var20 ^ 1189004229805150798L);
                                    String[] var29 = new String[true.l<invokedynamic>(10743, 7938146352420781438L ^ var20)];
                                    var29[0] = true.b<invokedynamic>(12232, 3033241261133931225L ^ var20);
                                    var29[1] = true.b<invokedynamic>(9067, 5309001220561448562L ^ var20);
                                    var29[2] = true.b<invokedynamic>(21504, 1434918697064716560L ^ var20);
                                    var29[3] = true.b<invokedynamic>(22158, 7824196626858728336L ^ var20);
                                    var29[4] = true.b<invokedynamic>(23434, 1255957631210378901L ^ var20);
                                    var29[5] = true.b<invokedynamic>(7908, 3489084478669853680L ^ var20);
                                    var29[true.l<invokedynamic>(20951, 2512121272921523549L ^ var20)] = true.b<invokedynamic>(31340, 7942674260775958393L ^ var20);
                                    3 = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "<\u0088}_%(w[IÕº\fì\u0014\"\u0098";
                                 var5 = "<\u0088}_%(w[IÕº\fì\u0014\"\u0098".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "×Æ\u009f\u009eõ\u0087\u0093E3ã³Â³\"ôÔ\u00106\u0004@\u001e\u0015Ó\u0010}ü×'ûç\u009e¨É";
                  var17 = "×Æ\u009f\u009eõ\u0087\u0093E3ã³Â³\"ôÔ\u00106\u0004@\u001e\u0015Ó\u0010}ü×'ûç\u009e¨É".length();
                  var14 = 16;
                  var24 = -1;
            }

            ++var24;
            var25 = var15.substring(var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native String a(byte[] var0);

   private static native String a(int var0, long var1);

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 1 -> var10000 = 42;
               case 2 -> var10000 = 16;
               case 3 -> var10000 = 45;
               case 4 -> var10000 = 38;
               case 5 -> var10000 = 61;
               case 6 -> var10000 = 50;
               case 7 -> var10000 = 40;
               case 8 -> var10000 = 32;
               case 9 -> var10000 = 48;
               case 10 -> var10000 = 52;
               case 11 -> var10000 = 51;
               case 12 -> var10000 = 0;
               case 13 -> var10000 = 4;
               case 14 -> var10000 = 21;
               case 15 -> var10000 = 62;
               case 16 -> var10000 = 35;
               case 17 -> var10000 = 46;
               case 18 -> var10000 = 18;
               case 19 -> var10000 = 60;
               case 20 -> var10000 = 57;
               case 21 -> var10000 = 17;
               case 22 -> var10000 = 19;
               case 23 -> var10000 = 8;
               case 24 -> var10000 = 15;
               case 25 -> var10000 = 2;
               case 26 -> var10000 = 5;
               case 27 -> var10000 = 53;
               case 28 -> var10000 = 36;
               case 29 -> var10000 = 29;
               case 30 -> var10000 = 26;
               case 31 -> var10000 = 6;
               case 32 -> var10000 = 44;
               case 33 -> var10000 = 55;
               case 34 -> var10000 = 13;
               case 35 -> var10000 = 3;
               case 36 -> var10000 = 11;
               case 37 -> var10000 = 56;
               case 38 -> var10000 = 23;
               case 39 -> var10000 = 20;
               case 40 -> var10000 = 33;
               case 41 -> var10000 = 31;
               case 42 -> var10000 = 37;
               case 43 -> var10000 = 58;
               case 44 -> var10000 = 39;
               case 45 -> var10000 = 63;
               case 46 -> var10000 = 12;
               case 47 -> var10000 = 22;
               case 48 -> var10000 = 24;
               case 49 -> var10000 = 14;
               case 50 -> var10000 = 41;
               case 51 -> var10000 = 49;
               case 52 -> var10000 = 54;
               case 53 -> var10000 = 25;
               case 54 -> var10000 = 27;
               case 55 -> var10000 = 59;
               case 56 -> var10000 = 30;
               case 57 -> var10000 = 7;
               case 58 -> var10000 = 47;
               case 59 -> var10000 = 9;
               case 60 -> var10000 = 10;
               case 61 -> var10000 = 1;
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
      var10000[3] = "c";
      var10000[4] = Boolean.TYPE;
      i[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Long.TYPE;
      i[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = Void.TYPE;
      i[21] = "c";
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
         if (var8 != 't' && var8 != 205 && var8 != 162 && var8 != 'u') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 208) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 198) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 't') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 205) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 162) {
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
