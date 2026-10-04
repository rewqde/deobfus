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
import net.minecraft.class_1923;
import net.minecraft.class_2680;
import net.minecraft.class_5321;

public class 2I extends 9a {
   private final 44 4O;
   private final 44 6;
   private final 4H 4Q;
   private final 44 4L;
   private final 4H 2;
   private final 4H 4q;
   private final 4H 7;
   private final 4H 4K;
   private final 4H 4N;
   private final 4H 47;
   private final 4H 4R;
   private final 4H 4p;
   private final 4b 9;
   private final 8N 4b;
   private final List 8;
   private final Map 1;
   private final Map 4f;
   private int 0;
   private static final int 4S;
   private static final long 40;
   private static final int 4B;
   private static final int 4g;
   private static final int 4G;
   private static final int 43;
   private static final int 4w;
   private static final int 5;
   private static final int 42;
   private static final int 3;
   private static final int 46;
   private static final int 4I;
   private static final int 4A;
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
   private static transient String DgPjFvFlFW;

   private static class_5321 _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public _I/* $FF was: 2I*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   protected native void _/* $FF was: 0*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private 7Oh _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   protected void _/* $FF was: 5*/(7f6 param1) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 5*/(long param0, class_5321 param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(char param1, int param2, short param3, class_2680 param4) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 3*/(char param0, int param1, class_1923 param2, char param3, int param4, Long param5) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 2*/(long param0, class_1923 param2, int param3, Long param4) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 4*/(class_1923 var0, long var1, class_1923 var3) {
      var1 = b ^ var1;
      int var10000 = (var3.R<invokedynamic>(var3, (long)"c", var1) - var0.R<invokedynamic>(var0, (long)"c", var1)).Ä<invokedynamic>(var3.R<invokedynamic>(var3, (long)"c", var1) - var0.R<invokedynamic>(var0, (long)"c", var1), (long)"c", var1);
      int var10001 = var3.R<invokedynamic>(var3, (long)"c", var1) - var0.R<invokedynamic>(var0, (long)"c", var1);
      return var10000 + var10001.Ä<invokedynamic>(var10001, (long)"c", var1);
   }

   static {
      a.b99571f71427e3b19.a.init(2I.class, 251);
      b = com.corz.client.s.a(-6565040833624956849L, -9159829158826100193L, MethodHandles.lookup().lookupClass()).a(133589779942280L);
      t = new Object[242];
      u = new String[242];
      b();
      h = new HashMap(13);
      long var22 = b ^ 42131570238510L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[12];
      int var29 = 0;
      String var28 = "]Ðö#Ü\u0088\u008eu\u0092]}ó\u008c\u0086\u0080¡ÿWÌ?¯ÿÙ¦ Pq¹\n*n\"\u0017|÷p&âéî\u0081Vx]\u009aáò©\u008e¯\u0088¢\u008fá\u009dÎ\u0080\u0018/m_\u008f¼ö\u0001FZÔ\u0018Ë\u001e\u0007TgU/\u007f§Ys;C\u0010&\bü\u0090\u0085\u00925ìþÉ\u009fÊgnÑa\u0010e\u0010VÔà\u0003fcÄ\u0094üç\u0012ô¬C\u0018/\u008dk&\u001eÿ\u009a\u0097çÒ\u0017qI'å\u008c-\u0087SU¶\u0084å\u000f k\u00194\u009dw'!©ÈGÖ\u0017,SäU\u0094Øå\u0012\u008a@ï\u00163]\u0006[¨ÝdJ\u0010íßÝ\u008b\u0001í©\u001c]Å\u0084Å(m±Â\u0018ò\bÇ¸\u0080\u0094\u008d'à±üÛ» »\u009c m#]\u008f~\u0010\u008a(}p'DL\u0095Ú7\u008e\u0013\u0012\u009e\u0084\\=\u0099q[Ú4éx\u000e½/\u0087Ym$\u0082\u001bî.vk¥DÂ+±";
      int var30 = "]Ðö#Ü\u0088\u008eu\u0092]}ó\u008c\u0086\u0080¡ÿWÌ?¯ÿÙ¦ Pq¹\n*n\"\u0017|÷p&âéî\u0081Vx]\u009aáò©\u008e¯\u0088¢\u008fá\u009dÎ\u0080\u0018/m_\u008f¼ö\u0001FZÔ\u0018Ë\u001e\u0007TgU/\u007f§Ys;C\u0010&\bü\u0090\u0085\u00925ìþÉ\u009fÊgnÑa\u0010e\u0010VÔà\u0003fcÄ\u0094üç\u0012ô¬C\u0018/\u008dk&\u001eÿ\u009a\u0097çÒ\u0017qI'å\u008c-\u0087SU¶\u0084å\u000f k\u00194\u009dw'!©ÈGÖ\u0017,SäU\u0094Øå\u0012\u008a@ï\u00163]\u0006[¨ÝdJ\u0010íßÝ\u008b\u0001í©\u001c]Å\u0084Å(m±Â\u0018ò\bÇ¸\u0080\u0094\u008d'à±üÛ» »\u009c m#]\u008f~\u0010\u008a(}p'DL\u0095Ú7\u008e\u0013\u0012\u009e\u0084\\=\u0099q[Ú4éx\u000e½/\u0087Ym$\u0082\u001bî.vk¥DÂ+±".length();
      char var27 = 24;
      int var35 = -1;

      label72:
      while(true) {
         ++var35;
         String var36 = var28.substring(var35, var35 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = b(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     f = var31;
                     g = new String[12];
                     n = new HashMap(13);
                     Cipher var11;
                     Cipher var38 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[56];
                     int var14 = 0;
                     String var15 = "N\u00adk0\u008b¡Ê ÃÍã\u001aa\fÏ\u008fTµÛ=\u001aR«æ!0{\u0002\u00876Þ¨g)\u0097È¾\u007f\u009dôV\u0017,\u0006\u000e£È/\u00adø=8'z\u0017¹S§1r\u0094ÀLU,\u0001a+\u00ad\u0004O\u0083{_1÷\"X\u0098ÅH\u001f\u001d\u000fÉ\u000f\u0018n\u0094ÕÏÁ7¶óÌËT\u001cI1»\u0002\nâ\u0003\u001e\u001cAõo|{%Ê§\u009eÉº\u008a}N\u008b\u0019\"\u0095\u001c\u0014»\u0096C\u00adÒ\u001fç§£Ã!Óz*Éò\u001a[Û±p'Ëz\u0089¢ÿW\u009aHòª\u0083Ð¤V¢V\t\u009eg\u008f´\u0094g½´å·\u008e¦Úö4NÓj\u000fc`\u009f¿r\u0087üå\u0015\u0092Õ!x\u009d\u009e]\u0014ÇigAôß±øX¶.»¯ð³-ÙS9 êv\u0011S\u0002ýQF\u0000Ïáñ#Ñ!Õ\"b\u0010t\u0087Á[T%\u0097!.\u0098\u0097ñ\u0096¤Y¯\u0085tL¼[È_£Ò\u009béøÓ«w\"ð\u009c>Õ¹ÆÉ\u001bi\u008c!5T\u0017æ\u0002bqÀ'\u0094Ãy\u0004\u000fNr\u009e~s\u0001µ\\?£kzî\u000eÖ\u0005 Y\u0095¦¾(,\\\u0087¹4Ñß\u0088]¥ÛÏ\u0012É ;\u0001\u0004÷'®Ëú[ÖúaªäyP{r\u000fäßÅ\u001bYp(ð;¡\u009e%v\u0000\u0097o¹oI\u0011[ëoS\u000fB§íòÄ^A«\u008cEB¨!Ü®¨f¨z\u0016\u001c°÷\u0098þ\u0082»·©v\\ì¼\u0082\n4\u0086\u000eóöÛ #æÌ_§I¬\u001aJå";
                     int var16 = "N\u00adk0\u008b¡Ê ÃÍã\u001aa\fÏ\u008fTµÛ=\u001aR«æ!0{\u0002\u00876Þ¨g)\u0097È¾\u007f\u009dôV\u0017,\u0006\u000e£È/\u00adø=8'z\u0017¹S§1r\u0094ÀLU,\u0001a+\u00ad\u0004O\u0083{_1÷\"X\u0098ÅH\u001f\u001d\u000fÉ\u000f\u0018n\u0094ÕÏÁ7¶óÌËT\u001cI1»\u0002\nâ\u0003\u001e\u001cAõo|{%Ê§\u009eÉº\u008a}N\u008b\u0019\"\u0095\u001c\u0014»\u0096C\u00adÒ\u001fç§£Ã!Óz*Éò\u001a[Û±p'Ëz\u0089¢ÿW\u009aHòª\u0083Ð¤V¢V\t\u009eg\u008f´\u0094g½´å·\u008e¦Úö4NÓj\u000fc`\u009f¿r\u0087üå\u0015\u0092Õ!x\u009d\u009e]\u0014ÇigAôß±øX¶.»¯ð³-ÙS9 êv\u0011S\u0002ýQF\u0000Ïáñ#Ñ!Õ\"b\u0010t\u0087Á[T%\u0097!.\u0098\u0097ñ\u0096¤Y¯\u0085tL¼[È_£Ò\u009béøÓ«w\"ð\u009c>Õ¹ÆÉ\u001bi\u008c!5T\u0017æ\u0002bqÀ'\u0094Ãy\u0004\u000fNr\u009e~s\u0001µ\\?£kzî\u000eÖ\u0005 Y\u0095¦¾(,\\\u0087¹4Ñß\u0088]¥ÛÏ\u0012É ;\u0001\u0004÷'®Ëú[ÖúaªäyP{r\u000fäßÅ\u001bYp(ð;¡\u009e%v\u0000\u0097o¹oI\u0011[ëoS\u000fB§íòÄ^A«\u008cEB¨!Ü®¨f¨z\u0016\u001c°÷\u0098þ\u0082»·©v\\ì¼\u0082\n4\u0086\u000eóöÛ #æÌ_§I¬\u001aJå".length();
                     int var13 = 0;

                     label54:
                     while(true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while(true) {
                           long var19 = var53;
                           byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                           long var62 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    l = var17;
                                    m = new Integer[56];
                                    4w = true.d<invokedynamic>(21824, var22 ^ 8165304027377246841L);
                                    4B = true.d<invokedynamic>(32506, var22 ^ 7155907731734694366L);
                                    4G = true.d<invokedynamic>(724, var22 ^ 7160938715178169817L);
                                    4g = true.d<invokedynamic>(19553, var22 ^ 5969461622740466551L);
                                    3 = true.d<invokedynamic>(26785, var22 ^ 1751651441400225666L);
                                    4I = true.d<invokedynamic>(13459, var22 ^ 457819553730184067L);
                                    42 = true.d<invokedynamic>(26785, var22 ^ 1751651441400225666L);
                                    43 = true.d<invokedynamic>(21824, var22 ^ 8165304027377246841L);
                                    4A = true.d<invokedynamic>(24956, var22 ^ 2339249807987119712L);
                                    5 = true.d<invokedynamic>(724, var22 ^ 7160938715178169817L);
                                    46 = true.d<invokedynamic>(13496, var22 ^ 6419522274384954265L);
                                    4S = true.d<invokedynamic>(19553, var22 ^ 5969461622740466551L);
                                    q = new HashMap(13);
                                    Cipher var0;
                                    Cipher var40 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                                    byte[] var60 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var60[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var40.init(2, var55.generateSecret(new DESKeySpec(var60)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "¾YÜäSÂ\u0006>\u0014yí\u000b\u0006\u0089b®";
                                    int var5 = "¾YÜäSÂ\u0006>\u0014yí\u000b\u0006\u0089b®".length();
                                    int var2 = 0;

                                    do {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                                       var10001 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                       byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                       var62 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                       boolean var61 = true;
                                       var6[var10001] = var62;
                                    } while(var2 < var5);

                                    o = var6;
                                    p = new Long[2];
                                    40 = true.p<invokedynamic>(12495, var22 ^ 4953114929269946940L);
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "Ú8\u001aÜ]\u009dO¸r\u0019\u009dÊâóZ`";
                                 var16 = "Ú8\u001aÜ]\u009dO¸r\u0019\u009dÊâóZ`".length();
                                 var13 = 0;
                           }

                           var10001 = var13;
                           var13 += 8;
                           var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var53 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = "x\u001e\u0095â\u007f· \u0018î\u009f\u0017\u0012n;ìm:\t\nn=Gß\u008e\u0010\u0007\u0085Íée}\u001cpy£rñ¸5n\u008a";
                  var30 = "x\u001e\u0095â\u007f· \u0018î\u009f\u0017\u0012n;ìm:\t\nn=Gß\u008e\u0010\u0007\u0085Íée}\u001cpy£rñ¸5n\u008a".length();
                  var27 = 24;
                  var35 = -1;
            }

            ++var35;
            var36 = var28.substring(var35, var35 + var27);
            var10001 = 0;
         }
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

   private static native long e(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 0 -> var10000 = 46;
               case 1 -> var10000 = 41;
               case 2 -> var10000 = 11;
               case 3 -> var10000 = 52;
               case 4 -> var10000 = 47;
               case 5 -> var10000 = 40;
               case 6 -> var10000 = 17;
               case 7 -> var10000 = 6;
               case 8 -> var10000 = 14;
               case 9 -> var10000 = 32;
               case 10 -> var10000 = 26;
               case 11 -> var10000 = 19;
               case 12 -> var10000 = 0;
               case 13 -> var10000 = 39;
               case 14 -> var10000 = 48;
               case 15 -> var10000 = 45;
               case 16 -> var10000 = 16;
               case 17 -> var10000 = 56;
               case 18 -> var10000 = 5;
               case 19 -> var10000 = 49;
               case 20 -> var10000 = 31;
               case 21 -> var10000 = 51;
               case 22 -> var10000 = 35;
               case 23 -> var10000 = 33;
               case 24 -> var10000 = 62;
               case 25 -> var10000 = 42;
               case 26 -> var10000 = 50;
               case 27 -> var10000 = 27;
               case 28 -> var10000 = 36;
               case 29 -> var10000 = 60;
               case 30 -> var10000 = 23;
               case 31 -> var10000 = 9;
               case 32 -> var10000 = 34;
               case 33 -> var10000 = 22;
               case 34 -> var10000 = 58;
               case 35 -> var10000 = 2;
               case 36 -> var10000 = 20;
               case 37 -> var10000 = 55;
               case 38 -> var10000 = 59;
               case 39 -> var10000 = 61;
               case 40 -> var10000 = 38;
               case 41 -> var10000 = 21;
               case 42 -> var10000 = 30;
               case 43 -> var10000 = 43;
               case 44 -> var10000 = 24;
               case 45 -> var10000 = 28;
               case 46 -> var10000 = 54;
               case 47 -> var10000 = 18;
               case 48 -> var10000 = 44;
               case 49 -> var10000 = 63;
               case 50 -> var10000 = 13;
               case 51 -> var10000 = 10;
               case 52 -> var10000 = 53;
               case 53 -> var10000 = 3;
               case 54 -> var10000 = 7;
               case 55 -> var10000 = 29;
               case 56 -> var10000 = 12;
               case 57 -> var10000 = 25;
               case 58 -> var10000 = 4;
               case 59 -> var10000 = 15;
               case 60 -> var10000 = 57;
               case 61 -> var10000 = 1;
               case 62 -> var10000 = 8;
               default -> var10000 = 37;
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
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      u[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Double.TYPE;
      u[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = Integer.TYPE;
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
      var10000[39] = Void.TYPE;
      u[39] = "c";
      var10000[40] = "c";
      var10000[41] = "c";
      var10000[42] = "c";
      var10000[43] = "c";
      var10000[44] = "c";
      var10000[45] = "c";
      var10000[46] = "c";
      var10000[47] = "c";
      var10000[48] = "c";
      var10000[49] = Long.TYPE;
      u[49] = "c";
      var10000[50] = "c";
      var10000[51] = Byte.TYPE;
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
      var10000[76] = Float.TYPE;
      u[76] = "c";
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
         if (var8 != 'R' && var8 != 240 && var8 != 254 && var8 != 198) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 235) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 196) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'R') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 240) {
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

   private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite g(MethodHandles.Lookup var0, String var1, MethodType var2);
}
