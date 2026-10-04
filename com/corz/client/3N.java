package com.corz.client;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 3n {
   private static final Path 9;
   private final List 4;
   private volatile 7TZ 0;
   private volatile String 7;
   private volatile String 6;
   private volatile boolean 1;
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
   private static transient String CVXSezwbSF;

   public _n/* $FF was: 3n*/(short param1, int param2, char param3) {
      // $FF: Couldn't be decompiled
   }

   public static Path _/* $FF was: 3*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return "c".É<invokedynamic>((long)"c", var1);
   }

   private static void _/* $FF was: 7*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;

      try {
         "c".É<invokedynamic>((long)"c", var1).p<invokedynamic>("c".É<invokedynamic>((long)"c", var1), new FileAttribute[0], (long)"c", var1);
      } catch (IOException var4) {
      }

   }

   public synchronized void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.K<invokedynamic>(this, (long)"c", var2);
   }

   public 7TZ _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.K<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.K<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.K<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.K<invokedynamic>(this, (long)"c", var2);
   }

   public void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 7*/(long param1, String param3, Path param4, String param5, byte param6) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 0*/(long var0, Path var2) {
      var0 = a ^ var0;
      return var2.Õ<invokedynamic>(var2, (long)"c", var0).toString();
   }

   private static boolean _/* $FF was: 2*/(long param0, Path param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(3n.class, 269);
      a = s.a(-5453375813289734031L, -366857170558112214L, MethodHandles.lookup().lookupClass()).a(33291836620870L);
      long var20 = a ^ 51984937323467L;
      h = new Object[89];
      i = new String[89];
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
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "\u009d¤îÄçu\u0000¬Y\u0094j\\\u0091\u009fÐ\u0018(\u0016\u008c«\r$H\u0004©4>^4·C[{CöV\u0005ÿ\u001bb\u0018Ì\u0019l\u0006\u001d\u008e\u008b\u0082IÈí0Éö!K°@â\u0087sÜeü(\u001f\u0088?ê¼\u0011\u008byK_I\u008f\u0086VÁ(ççËO\u0017@ÆT\u0003î~½#\u008e ,&ÇÀñ¸\u0012ï\u0082 »\u009aÔ²\u008d\f\u0088\\\u009d9\u0092\u009f\u0088\u0084\u001237USv\u0084ËÄ'tl\u0098×\u0081~\u0081\u0011\u0018\u0089$\r¯±t\u000fÅãT\u0019·bæ\u0013P«LH`èS\u00932\u0018\u0088cag\u0096Ê\u0098¡¢¾\u009f\u001bC\u000eÇhÀ¬t\u0089\u0094\u001f\u008fD(Óö\u0089\u0092\u0004$oiþZ£\u001f$ÝYÝbw,1\u008eP½ù¬\u001f\fEc_n\u0080N\\Â-~Ö\u0012\\\u0010½CpQWIh¢÷Úý\u000eJ¢3\u000e\u0010ç\bÝÕéP½^\u0086Xp\u0091»7\u001f&(sÃ\u0006ÿ\u009b.lmêÇÅ´ò\\O\u0086þ\u009d\"\u0018Âr\u0094.tÛâ\u008c¾ðòVv\u0001n'WxÒ\u0081 \u001e\u0014Ôü3\u0001Yý|·ú\u000f/\f\u0085f\u009c\u009b\u0019N\u0015\u0012*P\u009bÄ¬®ðMNÅ(Ó\u0016\u0010Ì.zU£ïp°\u0004\u0015F`õ+3²Êü\u009a\u009cÌôòg\u008b\u0088Æ7\u0095\u0018\u0016÷\b\u008c\u0093æ\u0099 \u007f\u0017?\u0019ñ\u0089w\\O\u0005\u001aÍ|Ç\u009c¶.\u0094\u008d¬Y%?\nU\u001eÞ/Í®ÁØ ,û\u008d\u0080÷h¦¹Dß\u0006f!\fí\u0085\u0090\u0088S»sD/¾Ó\u009c\u0011qM\u008f=U\u0010©\u0016AOt\u0092\u0093\bòð\u000b\u0086|Â¢'\u00102\u001c7lZÑÉ¬sxë\u0082°!jô(\u0085aâÎQ¾)\u0010]a\u0080¾È2H*Â\u0018\u009b\u009cK\u008a\u0019j\u0093§\u0006ú\u000fF\u0018/A¯¥\u0004\u0090¿\u0003\u000e8XtI¸m8\u009e=|\n H;V2Ô%RÑª\u008dl\u0099Â5¬I\u001b4\u0000xWE\u0088\t§\u0006÷\"\u008e\u0094[o8\u00886\u0018Æ»©·2¹\":ý \u0014`l \nýÐDu\u0015ái?@§{\u0015\u000f$r\u0089\u000e\u0004\u0087\u0016.1ü]\tã\u00850 Êªû\u0018z#\u0004Ù1RÉ{\u0092\u001fµ´è7-µé`(\u0089`¦t¨+bÓç$E\u008cv\u000f\u001bh6\u009d÷Å¤\u0091\u000f\u0090\u0010Mü\u001f§-\u009aC³ô9³ô¤(Þm ¥!V\u0018\u0084\u001c)ï¹Ú\u0095£%Ù\u001fØ\u0092\u0012{\u0010\u0083\u000eâ\u0083iâ\u0097ö{¤\u00054\u0010êº'b§9XK_\u009b\u0082Ëy\u0006O\u0094";
      int var17 = "\u009d¤îÄçu\u0000¬Y\u0094j\\\u0091\u009fÐ\u0018(\u0016\u008c«\r$H\u0004©4>^4·C[{CöV\u0005ÿ\u001bb\u0018Ì\u0019l\u0006\u001d\u008e\u008b\u0082IÈí0Éö!K°@â\u0087sÜeü(\u001f\u0088?ê¼\u0011\u008byK_I\u008f\u0086VÁ(ççËO\u0017@ÆT\u0003î~½#\u008e ,&ÇÀñ¸\u0012ï\u0082 »\u009aÔ²\u008d\f\u0088\\\u009d9\u0092\u009f\u0088\u0084\u001237USv\u0084ËÄ'tl\u0098×\u0081~\u0081\u0011\u0018\u0089$\r¯±t\u000fÅãT\u0019·bæ\u0013P«LH`èS\u00932\u0018\u0088cag\u0096Ê\u0098¡¢¾\u009f\u001bC\u000eÇhÀ¬t\u0089\u0094\u001f\u008fD(Óö\u0089\u0092\u0004$oiþZ£\u001f$ÝYÝbw,1\u008eP½ù¬\u001f\fEc_n\u0080N\\Â-~Ö\u0012\\\u0010½CpQWIh¢÷Úý\u000eJ¢3\u000e\u0010ç\bÝÕéP½^\u0086Xp\u0091»7\u001f&(sÃ\u0006ÿ\u009b.lmêÇÅ´ò\\O\u0086þ\u009d\"\u0018Âr\u0094.tÛâ\u008c¾ðòVv\u0001n'WxÒ\u0081 \u001e\u0014Ôü3\u0001Yý|·ú\u000f/\f\u0085f\u009c\u009b\u0019N\u0015\u0012*P\u009bÄ¬®ðMNÅ(Ó\u0016\u0010Ì.zU£ïp°\u0004\u0015F`õ+3²Êü\u009a\u009cÌôòg\u008b\u0088Æ7\u0095\u0018\u0016÷\b\u008c\u0093æ\u0099 \u007f\u0017?\u0019ñ\u0089w\\O\u0005\u001aÍ|Ç\u009c¶.\u0094\u008d¬Y%?\nU\u001eÞ/Í®ÁØ ,û\u008d\u0080÷h¦¹Dß\u0006f!\fí\u0085\u0090\u0088S»sD/¾Ó\u009c\u0011qM\u008f=U\u0010©\u0016AOt\u0092\u0093\bòð\u000b\u0086|Â¢'\u00102\u001c7lZÑÉ¬sxë\u0082°!jô(\u0085aâÎQ¾)\u0010]a\u0080¾È2H*Â\u0018\u009b\u009cK\u008a\u0019j\u0093§\u0006ú\u000fF\u0018/A¯¥\u0004\u0090¿\u0003\u000e8XtI¸m8\u009e=|\n H;V2Ô%RÑª\u008dl\u0099Â5¬I\u001b4\u0000xWE\u0088\t§\u0006÷\"\u008e\u0094[o8\u00886\u0018Æ»©·2¹\":ý \u0014`l \nýÐDu\u0015ái?@§{\u0015\u000f$r\u0089\u000e\u0004\u0087\u0016.1ü]\tã\u00850 Êªû\u0018z#\u0004Ù1RÉ{\u0092\u001fµ´è7-µé`(\u0089`¦t¨+bÓç$E\u008cv\u000f\u001bh6\u009d÷Å¤\u0091\u000f\u0090\u0010Mü\u001f§-\u009aC³ô9³ô¤(Þm ¥!V\u0018\u0084\u001c)ï¹Ú\u0095£%Ù\u001fØ\u0092\u0012{\u0010\u0083\u000eâ\u0083iâ\u0097ö{¤\u00054\u0010êº'b§9XK_\u009b\u0082Ëy\u0006O\u0094".length();
      char var14 = '(';
      int var23 = -1;

      label45:
      while(true) {
         ++var23;
         String var24 = var15.substring(var23, var23 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var34 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var34;
                  if ((var23 += var14) >= var17) {
                     b = var18;
                     c = new String[25];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var26 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var36 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var26.init(2, var36.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0096©ì5£s\u008b/jº'5Ð\b±\u009a$\u0011 \u0084ø¾W¾";
                     int var5 = "\u0096©ì5£s\u008b/jº'5Ð\b±\u009a$\u0011 \u0084ø¾W¾".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var39 = true;
                        var6[var10001] = var10004;
                     } while(var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     Path var27 = -7388024839746754116L.p<invokedynamic>(-7388024839746754116L, var20).Õ<invokedynamic>(-7388024839746754116L.p<invokedynamic>(-7388024839746754116L, var20), -7394311091147202427L, var20).Õ<invokedynamic>(-7388024839746754116L.p<invokedynamic>(-7388024839746754116L, var20).Õ<invokedynamic>(-7388024839746754116L.p<invokedynamic>(-7388024839746754116L, var20), -7394311091147202427L, var20), true.e<invokedynamic>(28948, 3418827250207446509L ^ var20), -7387104872355846796L, var20);
                     9 = var27.Õ<invokedynamic>(var27, true.e<invokedynamic>(20943, 3795783257684833582L ^ var20), -7387104872355846796L, var20);
                     return;
                  }

                  var14 = var15.charAt(var23);
                  break;
               default:
                  var18[var16++] = var34;
                  if ((var23 += var14) < var17) {
                     var14 = var15.charAt(var23);
                     continue label45;
                  }

                  var15 = "\u0012Dì ÖÖ²Æ\u0086\u0080á7ý\u0086\u0003\u0089\u001f\u008d\n³\u0017îÃè+â\u0015f\u000e\"x\u0092 sØ¼õjx\u0095^»x\u009a¼\u008aB%\u001cñ£xÜÔ\u001ebZI!\u0000·V\u009bÛ\u0087";
                  var17 = "\u0012Dì ÖÖ²Æ\u0086\u0080á7ý\u0086\u0003\u0089\u001f\u008d\n³\u0017îÃè+â\u0015f\u000e\"x\u0092 sØ¼õjx\u0095^»x\u009a¼\u008aB%\u001cñ£xÜÔ\u001ebZI!\u0000·V\u009bÛ\u0087".length();
                  var14 = ' ';
                  var23 = -1;
            }

            ++var23;
            var24 = var15.substring(var23, var23 + var14);
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
               case 0 -> var10000 = 44;
               case 1 -> var10000 = 35;
               case 2 -> var10000 = 25;
               case 3 -> var10000 = 61;
               case 4 -> var10000 = 1;
               case 5 -> var10000 = 55;
               case 6 -> var10000 = 57;
               case 7 -> var10000 = 41;
               case 8 -> var10000 = 28;
               case 9 -> var10000 = 8;
               case 10 -> var10000 = 29;
               case 11 -> var10000 = 3;
               case 12 -> var10000 = 34;
               case 13 -> var10000 = 38;
               case 14 -> var10000 = 14;
               case 15 -> var10000 = 10;
               case 16 -> var10000 = 12;
               case 17 -> var10000 = 60;
               case 18 -> var10000 = 22;
               case 19 -> var10000 = 36;
               case 20 -> var10000 = 52;
               case 21 -> var10000 = 7;
               case 22 -> var10000 = 45;
               case 23 -> var10000 = 49;
               case 24 -> var10000 = 0;
               case 25 -> var10000 = 58;
               case 26 -> var10000 = 47;
               case 27 -> var10000 = 62;
               case 28 -> var10000 = 23;
               case 29 -> var10000 = 59;
               case 30 -> var10000 = 40;
               case 31 -> var10000 = 53;
               case 32 -> var10000 = 18;
               case 33 -> var10000 = 31;
               case 34 -> var10000 = 20;
               case 35 -> var10000 = 32;
               case 36 -> var10000 = 43;
               case 37 -> var10000 = 24;
               case 38 -> var10000 = 11;
               case 39 -> var10000 = 2;
               case 40 -> var10000 = 27;
               case 41 -> var10000 = 50;
               case 42 -> var10000 = 51;
               case 43 -> var10000 = 37;
               case 44 -> var10000 = 33;
               case 45 -> var10000 = 56;
               case 46 -> var10000 = 46;
               case 47 -> var10000 = 21;
               case 48 -> var10000 = 19;
               case 49 -> var10000 = 63;
               case 50 -> var10000 = 6;
               case 51 -> var10000 = 30;
               case 52 -> var10000 = 17;
               case 53 -> var10000 = 13;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 5;
               case 56 -> var10000 = 48;
               case 57 -> var10000 = 9;
               case 58 -> var10000 = 15;
               case 59 -> var10000 = 26;
               case 60 -> var10000 = 4;
               case 61 -> var10000 = 54;
               case 62 -> var10000 = 39;
               default -> var10000 = 16;
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
      var10000[4] = "c";
      var10000[5] = Void.TYPE;
      i[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Boolean.TYPE;
      i[8] = "c";
      var10000[9] = "c";
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
      var10000[20] = Integer.TYPE;
      i[20] = "c";
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

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

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
         if (var8 != 'K' && var8 != 'V' && var8 != 201 && var8 != 'O') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 213) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'p') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'K') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'V') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 201) {
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
