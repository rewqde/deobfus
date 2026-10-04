package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 0P {
   public static final String 2;
   public static final String 3;
   public static final String 4;
   public static final String 1;
   public static final String 6o;
   public static final String 6r;
   public static final String 5;
   public static final String 9;
   public static final String 6;
   public static final String 0;
   public static final int 8;
   public static final int 6P;
   private String 6H;
   private int 7;
   private int 63;
   private int 68;
   private final ArrayList 6x = new ArrayList();
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
   private static transient String nbEeCsQuAm;

   public static String _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      ArrayList var10000 = this.Ï<invokedynamic>(this, (long)"c", var2);
      return var10000.Þ<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ï<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ï<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ï<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ï<invokedynamic>(this, (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(0P.class, 50);
      a = s.a(-375919793434558314L, 4385657191451446601L, MethodHandles.lookup().lookupClass()).a(33952362443240L);
      h = new Object[35];
      i = new String[35];
      a();
      d = new HashMap(13);
      long var11 = a ^ 67353382043779L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[37];
      int var18 = 0;
      String var17 = "£Ò¤\u0010\u008dK28õû0²}\u0014\u0004\u0096c\u001dÊ(°5\u008f½ CÝPfS<S´â)K\u0003¾ôDÜ\u00961Ú;\tîªàÓñ\u0014sï£\u0017õ  1ÂÇ!Ã>\u008d\u009f\u008faø\u000béû(ß\u000bé\u0097÷2{D\u0086\u001d\u007f\u0089gçöá\u0010Z\u0010ÇÏ.¤ÕÀ?\f\r\u0083þ0 Ë \u008f±M¯\u009f\u007fíc,ÿ\u009dV\u0086.ô\n»ª\bp\u0080\u00921\u001bc\u009a¼\u0088 ¿K (\u0015\u0093\u0007·\u008bmõ\u0005\"¡NqaQX?õ©g\u009bt\u0012p\u008f¢\bNC,^Ï\u000e¸\u0010ù\u008cvHß\n \u0019¿µ!uht@ÎÍ³-ÒÄ\u0001võz\u0099£®ÖÎ\u0019´^nµï\u001eÃÙ\u0010t¡ï\u0093æË¾3træi¾¨»z(\u0002\u009aÀ×IFöÐ\u0012×<ü\r\"êRÔD³ð\u0080¬î\u0095uÒ\u0080\u0004\u0093¼\u0013t\u0092\u000e¹\u009fïðhH dr3ã\u0095H\u0093{}ªèÖ,¯uÔå±wÎa#\u0001¶\u0011¯\u0080ÓFÿ¡Í\u0010u/\u0002,½XRß§g¬\b\u009eÌ\tÜ\u0018´¦º\u0003\u00863uê\u0096\rÀ\u0097uª\u0088\u009fÄ× \u00192nNu\u0010BÏ¤À5C\u0010N§\u0090J^\u0090Ïêµ\u0010ì \u008c)\u0016;\u008f±¿§\u0091Ý\u0088±ÅÔ \u0095â\u008cõÎOH\u0003P½_~Ì]\u0010T/0ZÓÄ4Y\u0099J\u009f\u0081u_?ÒÚ\u0010\u0095_\u0093\u009bÃ×ªÚ9\u0017\u000f\u0014¸åIF(.\"úæ\u0087[\u0012\u0093i&\fû@4H¯Ìoo°n\u0014\u009e\u0002Äplío;©¾ß\u00adi¹\u0012±\u008bW cg\u0088\u009b\u0019¿Bý³b#\u0015©¦q;Ý©k\u008aêí\rm\u0099\u0081kÈ\u0099)\u0010ò\u0010rd]N4\u0000ò\u0004t,DHQKm¼ \u0090\u0088öÜ\u0011¤Ä+f\u008b\u0013a\u0095 \u000e\u008bÊ\u0099Ú\u008eùÅý¾F%ÏZÊúÖ\u008a\u0010h6\u008cî@As®X¬çû$n9Z ¤ê#YMÔ2:hñ\u0086çÀ\u008ayú Ø\u0019Ó\u0018\u001dùc2\t«øWÏõµ(\u008e-x\u009e\r9\u0082P\u0018s\\LÅk\u0084\u0018¼÷Oÿcòðº»\u009fª\u0006«¥vÙ[\u009a*\u0083\u0088\u008cÓá(\u0007õK\u0002w\u0089æ\u0091æÑ\u000e\u0003\u0015uû¨×/\u0019\u0012þó*8g\u0082¢²UðV\u009d³ssþ*ê2\u001a !·\u008féÂ>» \u0005ºbq,g·PÉb3È\u009a\u0005óz7÷\u0080ø\u009fS\u0094\u0015(¶.\b¼\u001eñ¾ÂE\u0083¹ iÄºµë\u000eTU`)Wy¤A` âÛI7{\u001cY\u0004Ë<ää\u0018ÏO¬¶H\u0019°b¸CÈ¢\u0090\u008a3!\u0017sK\u0007\u0081§\u0093\u0006(\u001c ª\u0094ª\u00ad5ÿ&\u008cÐVW\u0080ñ\u001fÄóóÄ>ú¾*\u0084`\u000fU¢ÿ/¤°\fgµÌ\u0097\u009aõ\u0018õÏSæ+Y\u0080\u007fb£3½óÈ\u0081ªG«(ÜcÀÎj B·\u007f<è2\u009c6²ÜÎáYí1D\u00027\u0001\u008e/ÇîÀ§b\u0092R>Pè\u000f\u00108ÍËR\u0081çhÊkÂªÙÊ¯_u\u0018F\u000f\u008eÝ®¬BZâV½\u009d\u0014±¦\u0084ÂF\u0081IÃ¹QX\u0010FJ9\u0083ã`K§Þ'@\u0091e\u00887Ó\u0018©jRuï\u008aÊ}ª!.¢\u00839\u0095&\u008bþ\u0082°é7\u00943\u0018\")ÃWü\u001cÇz~\u0080!=Ù5S~½[^\u008c¢å#Q";
      int var19 = "£Ò¤\u0010\u008dK28õû0²}\u0014\u0004\u0096c\u001dÊ(°5\u008f½ CÝPfS<S´â)K\u0003¾ôDÜ\u00961Ú;\tîªàÓñ\u0014sï£\u0017õ  1ÂÇ!Ã>\u008d\u009f\u008faø\u000béû(ß\u000bé\u0097÷2{D\u0086\u001d\u007f\u0089gçöá\u0010Z\u0010ÇÏ.¤ÕÀ?\f\r\u0083þ0 Ë \u008f±M¯\u009f\u007fíc,ÿ\u009dV\u0086.ô\n»ª\bp\u0080\u00921\u001bc\u009a¼\u0088 ¿K (\u0015\u0093\u0007·\u008bmõ\u0005\"¡NqaQX?õ©g\u009bt\u0012p\u008f¢\bNC,^Ï\u000e¸\u0010ù\u008cvHß\n \u0019¿µ!uht@ÎÍ³-ÒÄ\u0001võz\u0099£®ÖÎ\u0019´^nµï\u001eÃÙ\u0010t¡ï\u0093æË¾3træi¾¨»z(\u0002\u009aÀ×IFöÐ\u0012×<ü\r\"êRÔD³ð\u0080¬î\u0095uÒ\u0080\u0004\u0093¼\u0013t\u0092\u000e¹\u009fïðhH dr3ã\u0095H\u0093{}ªèÖ,¯uÔå±wÎa#\u0001¶\u0011¯\u0080ÓFÿ¡Í\u0010u/\u0002,½XRß§g¬\b\u009eÌ\tÜ\u0018´¦º\u0003\u00863uê\u0096\rÀ\u0097uª\u0088\u009fÄ× \u00192nNu\u0010BÏ¤À5C\u0010N§\u0090J^\u0090Ïêµ\u0010ì \u008c)\u0016;\u008f±¿§\u0091Ý\u0088±ÅÔ \u0095â\u008cõÎOH\u0003P½_~Ì]\u0010T/0ZÓÄ4Y\u0099J\u009f\u0081u_?ÒÚ\u0010\u0095_\u0093\u009bÃ×ªÚ9\u0017\u000f\u0014¸åIF(.\"úæ\u0087[\u0012\u0093i&\fû@4H¯Ìoo°n\u0014\u009e\u0002Äplío;©¾ß\u00adi¹\u0012±\u008bW cg\u0088\u009b\u0019¿Bý³b#\u0015©¦q;Ý©k\u008aêí\rm\u0099\u0081kÈ\u0099)\u0010ò\u0010rd]N4\u0000ò\u0004t,DHQKm¼ \u0090\u0088öÜ\u0011¤Ä+f\u008b\u0013a\u0095 \u000e\u008bÊ\u0099Ú\u008eùÅý¾F%ÏZÊúÖ\u008a\u0010h6\u008cî@As®X¬çû$n9Z ¤ê#YMÔ2:hñ\u0086çÀ\u008ayú Ø\u0019Ó\u0018\u001dùc2\t«øWÏõµ(\u008e-x\u009e\r9\u0082P\u0018s\\LÅk\u0084\u0018¼÷Oÿcòðº»\u009fª\u0006«¥vÙ[\u009a*\u0083\u0088\u008cÓá(\u0007õK\u0002w\u0089æ\u0091æÑ\u000e\u0003\u0015uû¨×/\u0019\u0012þó*8g\u0082¢²UðV\u009d³ssþ*ê2\u001a !·\u008féÂ>» \u0005ºbq,g·PÉb3È\u009a\u0005óz7÷\u0080ø\u009fS\u0094\u0015(¶.\b¼\u001eñ¾ÂE\u0083¹ iÄºµë\u000eTU`)Wy¤A` âÛI7{\u001cY\u0004Ë<ää\u0018ÏO¬¶H\u0019°b¸CÈ¢\u0090\u008a3!\u0017sK\u0007\u0081§\u0093\u0006(\u001c ª\u0094ª\u00ad5ÿ&\u008cÐVW\u0080ñ\u001fÄóóÄ>ú¾*\u0084`\u000fU¢ÿ/¤°\fgµÌ\u0097\u009aõ\u0018õÏSæ+Y\u0080\u007fb£3½óÈ\u0081ªG«(ÜcÀÎj B·\u007f<è2\u009c6²ÜÎáYí1D\u00027\u0001\u008e/ÇîÀ§b\u0092R>Pè\u000f\u00108ÍËR\u0081çhÊkÂªÙÊ¯_u\u0018F\u000f\u008eÝ®¬BZâV½\u009d\u0014±¦\u0084ÂF\u0081IÃ¹QX\u0010FJ9\u0083ã`K§Þ'@\u0091e\u00887Ó\u0018©jRuï\u008aÊ}ª!.¢\u00839\u0095&\u008bþ\u0082°é7\u00943\u0018\")ÃWü\u001cÇz~\u0080!=Ù5S~½[^\u008c¢å#Q".length();
      char var16 = 24;
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
                     c = new String[37];
                     1 = true.f<invokedynamic>(1285, 8027039676678308245L ^ var11);
                     6r = true.f<invokedynamic>(28480, 848494927910202348L ^ var11);
                     4 = true.f<invokedynamic>(22092, 1785572257784746727L ^ var11);
                     2 = true.f<invokedynamic>(21483, 3401358990543443836L ^ var11);
                     6 = true.f<invokedynamic>(14613, 4068904285079420349L ^ var11);
                     0 = true.f<invokedynamic>(3856, 2696016869205183404L ^ var11);
                     3 = true.f<invokedynamic>(27087, 6397509858652384623L ^ var11);
                     5 = true.f<invokedynamic>(24749, 4731949312224781334L ^ var11);
                     6o = true.f<invokedynamic>(5533, 2038734667089973556L ^ var11);
                     9 = true.f<invokedynamic>(24326, 8916770770460924849L ^ var11);
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "1aÿûÜ\u001c\u00ad£Hù\u0019\u0097uªèå\u0018\u000fç¨Y¾\u0089Bté;\u009dÒ\u0019\u009c\rÖÁ\u000b'÷0\u0003Û\u000fijþ\u0006a\u0013Ò";
                     int var5 = "1aÿûÜ\u001c\u00ad£Hù\u0019\u0097uªèå\u0018\u000fç¨Y¾\u0089Bté;\u009dÒ\u0019\u009c\rÖÁ\u000b'÷0\u0003Û\u000fijþ\u0006a\u0013Ò".length();
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
                                    f = new Integer[8];
                                    6P = true.g<invokedynamic>(31724, var11 ^ 8301281853166794813L);
                                    8 = true.g<invokedynamic>(9036, var11 ^ 7501152306813919386L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0007\u001fh\"#¼\u0081äî%\u008ft«\u0003LZ";
                                 var5 = "\u0007\u001fh\"#¼\u0081äî%\u008ft«\u0003LZ".length();
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

                  var17 = "\u0018ÝÍ\u0084:±f|m\u007fA\u0002\u009cÐ~\u0088pÌ\re\u001eµ9Ï\u008eþ>\u00866Úëø(:$oÜá\u001eÒblò\u008e\u0096 O>m\u0085\u0084\u000b¦0èíüÑoúAì\u008dVÓc\u0017ûNÞb¶_";
                  var19 = "\u0018ÝÍ\u0084:±f|m\u007fA\u0002\u009cÐ~\u0088pÌ\re\u001eµ9Ï\u008eþ>\u00866Úëø(:$oÜá\u001eÒblò\u008e\u0096 O>m\u0085\u0084\u000b¦0èíüÑoúAì\u008dVÓc\u0017ûNÞb¶_".length();
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
               case 0 -> var10000 = 17;
               case 1 -> var10000 = 58;
               case 2 -> var10000 = 44;
               case 3 -> var10000 = 4;
               case 4 -> var10000 = 28;
               case 5 -> var10000 = 47;
               case 6 -> var10000 = 49;
               case 7 -> var10000 = 57;
               case 8 -> var10000 = 12;
               case 9 -> var10000 = 61;
               case 10 -> var10000 = 11;
               case 11 -> var10000 = 31;
               case 12 -> var10000 = 53;
               case 13 -> var10000 = 55;
               case 14 -> var10000 = 14;
               case 15 -> var10000 = 35;
               case 16 -> var10000 = 51;
               case 17 -> var10000 = 32;
               case 18 -> var10000 = 5;
               case 19 -> var10000 = 36;
               case 20 -> var10000 = 6;
               case 21 -> var10000 = 15;
               case 22 -> var10000 = 19;
               case 23 -> var10000 = 0;
               case 24 -> var10000 = 42;
               case 25 -> var10000 = 23;
               case 26 -> var10000 = 63;
               case 27 -> var10000 = 7;
               case 28 -> var10000 = 10;
               case 29 -> var10000 = 24;
               case 30 -> var10000 = 30;
               case 31 -> var10000 = 1;
               case 32 -> var10000 = 22;
               case 33 -> var10000 = 41;
               case 34 -> var10000 = 56;
               case 35 -> var10000 = 48;
               case 36 -> var10000 = 62;
               case 37 -> var10000 = 16;
               case 38 -> var10000 = 34;
               case 39 -> var10000 = 38;
               case 40 -> var10000 = 9;
               case 41 -> var10000 = 13;
               case 42 -> var10000 = 2;
               case 43 -> var10000 = 45;
               case 44 -> var10000 = 8;
               case 45 -> var10000 = 29;
               case 46 -> var10000 = 33;
               case 47 -> var10000 = 25;
               case 48 -> var10000 = 60;
               case 49 -> var10000 = 50;
               case 50 -> var10000 = 37;
               case 51 -> var10000 = 20;
               case 52 -> var10000 = 52;
               case 53 -> var10000 = 46;
               case 54 -> var10000 = 43;
               case 55 -> var10000 = 3;
               case 56 -> var10000 = 39;
               case 57 -> var10000 = 54;
               case 58 -> var10000 = 26;
               case 59 -> var10000 = 27;
               case 60 -> var10000 = 59;
               case 61 -> var10000 = 21;
               case 62 -> var10000 = 18;
               default -> var10000 = 40;
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
      var10000[2] = Void.TYPE;
      i[2] = "c";
      var10000[3] = Integer.TYPE;
      i[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Long.TYPE;
      i[7] = "c";
      var10000[8] = "c";
      var10000[9] = Boolean.TYPE;
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

   private static native Field b(Class var0, String var1, Class var2);

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
         if (var8 != 207 && var8 != 'M' && var8 != 203 && var8 != 198) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 't') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 222) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 207) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'M') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 203) {
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
