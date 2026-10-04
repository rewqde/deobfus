package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_12079;
import net.minecraft.class_2960;

public class 10 extends 9a implements 76e {
   public static final String 3;
   private static final Map 0;
   private final 4i 5;
   private final 4H 4;
   private static final Map 8;
   public static class_2960 7;
   public final 5j 2;
   private static final List 6;
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
   private static transient String qaPqQErTaP;

   private static class_2960 _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String[] _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public _0/* $FF was: 10*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native class_2960 _/* $FF was: 0*/(Object[] var1);

   public static class_2960 _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public class_2960 _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static class_12079.class_12081 _/* $FF was: 0*/(Object[] var0) {
      long var2 = (Long)var0[0];
      class_2960 var1 = (class_2960)var0[1];
      var2 = b ^ var2;
      Map var10000 = "c".ó<invokedynamic>((long)"c", var2);
      return (class_12079.class_12081)var10000.Õ<invokedynamic>(var10000, var1, 5s::new, (long)"c", var2);
   }

   static {
      a.b99571f71427e3b19.a.init(10.class, 713);
      b = com.corz.client.s.a(3365363501746700223L, 738661662042283513L, MethodHandles.lookup().lookupClass()).a(1375310959219L);
      long var20 = b ^ 12763556572858L;
      long var22 = var20 ^ 83460826425318L;
      o = new Object[86];
      p = new String[86];
      b();
      h = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[31];
      int var16 = 0;
      String var15 = "ò<\u009a(L©VkÎ\u0011\u00009\u008d\u0084R.\u001e D\u0085\u0087j¢G ¼\u00ad6|ÚS\"$§ÀÃS$\u001fè¹_ú\u0097\u0098\u001e(\u008epdÏpë®o\u0091\t\u0010fã? s×o\u0092>\u00839\u0006îlF¾ Ç\u001e±\u009b9\u0017\u0006¶ï¬3ê U\u0085Àí¥®¿ÃÑ\u0002mGÑFRð\u0010cì ú[¢é\u0012Ìá\u0013ýepek\u001cpYõ\u0000\u0093»ùIê\"\u0086¿ ·î#|2\u0018\u0089>ê#ä©\u008e©^ì\u0010º¼m=';ÄI\u009a&©T°\u0010\u000fÁ[¡û\u0091Ë\u0081XN(Q%\u000bÂê\u0018y\u008bû\u0012ÿ\u0001h\u0010\"\u001c^«¾W/u\u0093\u009d\u008e6\u0092»i2 Ó\tÉ\u008e,bB8¨3\u008fCð/\u0086\u0089\u0091\u0002ÈÑûp\u0006Éõ\u0001èòàÙ[r\u0010#ÇÏC¤9\u0006Âx¬\u008f\u0082\u0007íi· \feR\u0089ûæÅSó@)0\b\u0012ê\u0004[ú\u001e]\u0099Þ7\u008b23å©\u009f:Eë\u0010?^Ð\u0089]ü\u0013wû¤Hacè\u0086l\u0018Ô\u008f\u0085\f¡\u0000\u009d\u001cJ\u00ad;PÅ*]¨°é¥&@ë$Þ «ÙÕúí`»\u001cÜô»\u001dyaC\u0000a\f¸t\u00ad&µà»ºRP\u0011\u008b\u001bÐ \u0089â{pöì¸ÕD\u008aâCJÝô®Îê\u0016\u001dÒáÈ=¦+3¸Ý\rE\u0018\u0010C-¼GZ¦ýÃÙ\u0082_\fp¥}Ù\u0018ô\u0084fz1vb¿>\u009e=\u0012r\u0002º\b*Ap\u001d©øOT Hë\u0092×Xb\u001ehÈ<¤\u0083Éì\u0006\u0087#iÝ\u0007\u0004ÐvéÊú÷ýÞ\u001fV>\u0010ThÈ[¼Çb²1ÂìqUJ**\u0018²,à9\u001fr8Q¥ùÙ*¡\u008bî`ÒnL\b\u001fu\u0003æ\u0018Aÿ©aÒ$\u0083\u0085¹Î£\u001aOý_~-¡ú\u0003e\u0011Ð× Hû 0\"\u0018Ü\u0083\u001e¡\u0099\u001at¶X_t÷\u0004\u0087O\u0012üZ\u007fm6%\u009frô÷\u00188\u0096,>pKÖñWðm¨\u0011\u0095b§\u0012&\u0088bR#üú\u00101\"3-]bi\u0010ªZa°ù«@Ã ×Ý\u007f³Å«D\u0081yP\u0085\u000fZÖ?Zá®6ãT\u008b!lÏïÐ\u008a6-YD IiÕ\u0084'àN\u008dÓã\t\u0097\u00ad¶Í\u008eáÒ^|I\u0006Y\u0091Þ\u008eJÖ>V\u0083Í\u0018#%z_9ÃIÌ¢ëlã\u001cóºC×\u0086À½\u0086+eè\u0010Ññ\u009aÎ£\u009dÆ\u0082f\u008fí\u0092F©às\u00100Ôáw@H\u0013E\u0081\"\u007f\u0014\u0080\u009aw\u007f";
      int var17 = "ò<\u009a(L©VkÎ\u0011\u00009\u008d\u0084R.\u001e D\u0085\u0087j¢G ¼\u00ad6|ÚS\"$§ÀÃS$\u001fè¹_ú\u0097\u0098\u001e(\u008epdÏpë®o\u0091\t\u0010fã? s×o\u0092>\u00839\u0006îlF¾ Ç\u001e±\u009b9\u0017\u0006¶ï¬3ê U\u0085Àí¥®¿ÃÑ\u0002mGÑFRð\u0010cì ú[¢é\u0012Ìá\u0013ýepek\u001cpYõ\u0000\u0093»ùIê\"\u0086¿ ·î#|2\u0018\u0089>ê#ä©\u008e©^ì\u0010º¼m=';ÄI\u009a&©T°\u0010\u000fÁ[¡û\u0091Ë\u0081XN(Q%\u000bÂê\u0018y\u008bû\u0012ÿ\u0001h\u0010\"\u001c^«¾W/u\u0093\u009d\u008e6\u0092»i2 Ó\tÉ\u008e,bB8¨3\u008fCð/\u0086\u0089\u0091\u0002ÈÑûp\u0006Éõ\u0001èòàÙ[r\u0010#ÇÏC¤9\u0006Âx¬\u008f\u0082\u0007íi· \feR\u0089ûæÅSó@)0\b\u0012ê\u0004[ú\u001e]\u0099Þ7\u008b23å©\u009f:Eë\u0010?^Ð\u0089]ü\u0013wû¤Hacè\u0086l\u0018Ô\u008f\u0085\f¡\u0000\u009d\u001cJ\u00ad;PÅ*]¨°é¥&@ë$Þ «ÙÕúí`»\u001cÜô»\u001dyaC\u0000a\f¸t\u00ad&µà»ºRP\u0011\u008b\u001bÐ \u0089â{pöì¸ÕD\u008aâCJÝô®Îê\u0016\u001dÒáÈ=¦+3¸Ý\rE\u0018\u0010C-¼GZ¦ýÃÙ\u0082_\fp¥}Ù\u0018ô\u0084fz1vb¿>\u009e=\u0012r\u0002º\b*Ap\u001d©øOT Hë\u0092×Xb\u001ehÈ<¤\u0083Éì\u0006\u0087#iÝ\u0007\u0004ÐvéÊú÷ýÞ\u001fV>\u0010ThÈ[¼Çb²1ÂìqUJ**\u0018²,à9\u001fr8Q¥ùÙ*¡\u008bî`ÒnL\b\u001fu\u0003æ\u0018Aÿ©aÒ$\u0083\u0085¹Î£\u001aOý_~-¡ú\u0003e\u0011Ð× Hû 0\"\u0018Ü\u0083\u001e¡\u0099\u001at¶X_t÷\u0004\u0087O\u0012üZ\u007fm6%\u009frô÷\u00188\u0096,>pKÖñWðm¨\u0011\u0095b§\u0012&\u0088bR#üú\u00101\"3-]bi\u0010ªZa°ù«@Ã ×Ý\u007f³Å«D\u0081yP\u0085\u000fZÖ?Zá®6ãT\u008b!lÏïÐ\u008a6-YD IiÕ\u0084'àN\u008dÓã\t\u0097\u00ad¶Í\u008eáÒ^|I\u0006Y\u0091Þ\u008eJÖ>V\u0083Í\u0018#%z_9ÃIÌ¢ëlã\u001cóºC×\u0086À½\u0086+eè\u0010Ññ\u009aÎ£\u009dÆ\u0082f\u008fí\u0092F©às\u00100Ôáw@H\u0013E\u0081\"\u007f\u0014\u0080\u009aw\u007f".length();
      char var14 = 24;
      int var25 = -1;

      label45:
      while(true) {
         ++var25;
         String var26 = var15.substring(var25, var25 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var56 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var56;
                  if ((var25 += var14) >= var17) {
                     f = var18;
                     g = new String[31];
                     3 = true.h<invokedynamic>(4399, 3410501325098957713L ^ var20);
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var28 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var58 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var28.init(2, var58.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "ÐãËÇ9\u0086\u0099{\u0085øóª*gáwð\u0007N\b\u0007ú\u008c0";
                     int var5 = "ÐãËÇ9\u0086\u0099{\u0085øóª*gáwð\u0007N\b\u0007ú\u008c0".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var61 = true;
                        var6[var10001] = var10004;
                     } while(var2 < var5);

                     l = var6;
                     m = new Integer[3];
                     0 = new LinkedHashMap();
                     Class var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     String var44 = 26140.h<invokedynamic>(26140, 6810957926098062512L ^ var20);
                     Object[] var10005 = new Object[]{var22, true.h<invokedynamic>(20554, 3804180556345735928L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 30553.h<invokedynamic>(30553, 3858706493037501936L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(20353, 1874062556231591228L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 9958.h<invokedynamic>(9958, 8573978168501767234L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(6791, 1717683427466817574L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 13792.h<invokedynamic>(13792, 728374377807683394L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(10443, 2555307074089353838L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 4612.h<invokedynamic>(4612, 4020553016812943523L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(13206, 6070761332623153440L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 9267.h<invokedynamic>(9267, 4997763336399326855L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(9564, 2864110923140468717L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 2053.h<invokedynamic>(2053, 1752347043443647142L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(9100, 623211683115403553L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 24948.h<invokedynamic>(24948, 7424760526715603916L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(27575, 1904986037350744343L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 18949.h<invokedynamic>(18949, 3587949919566946474L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(9483, 402935822169444269L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     var29 = -1768932472852656336L.ó<invokedynamic>(-1768932472852656336L, var20);
                     var44 = 2086.h<invokedynamic>(2086, 889280933931721357L ^ var20);
                     var10005 = new Object[]{var22, true.h<invokedynamic>(26173, 1614216510427122822L ^ var20)};
                     var29.Õ<invokedynamic>(var29, var44, var10005.Á<invokedynamic>(var10005, -1767874224133893493L, var20), -1769891955488732881L, var20);
                     8 = new HashMap();
                     null.r<invokedynamic>((class_2960)null, -1770319168989621191L, var20);
                     var29 = 29737.h<invokedynamic>(29737, 2101220328632999574L ^ var20);
                     6 = var29.Á<invokedynamic>(var29, true.h<invokedynamic>(29327, 3952266577204467763L ^ var20), true.h<invokedynamic>(32504, 8890816772618572872L ^ var20), true.h<invokedynamic>(27127, 3491008238482506591L ^ var20), true.h<invokedynamic>(16894, 5055100667692247876L ^ var20), -1771849160362712532L, var20);
                     return;
                  }

                  var14 = var15.charAt(var25);
                  break;
               default:
                  var18[var16++] = var56;
                  if ((var25 += var14) < var17) {
                     var14 = var15.charAt(var25);
                     continue label45;
                  }

                  var15 = "8´vû\u008b\u0091\u0086ÜÙáV]3K\u001bµ\u0010ÆÕ\u009c;T dú°âk¥=Ä$\u0081";
                  var17 = "8´vû\u008b\u0091\u0086ÜÙáV]3K\u001bµ\u0010ÆÕ\u009c;T dú°âk¥=Ä$\u0081".length();
                  var14 = 16;
                  var25 = -1;
            }

            ++var25;
            var26 = var15.substring(var25, var25 + var14);
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
               case 0 -> var10000 = 20;
               case 1 -> var10000 = 52;
               case 2 -> var10000 = 13;
               case 3 -> var10000 = 35;
               case 4 -> var10000 = 12;
               case 5 -> var10000 = 7;
               case 6 -> var10000 = 37;
               case 7 -> var10000 = 49;
               case 8 -> var10000 = 62;
               case 9 -> var10000 = 2;
               case 10 -> var10000 = 27;
               case 11 -> var10000 = 56;
               case 12 -> var10000 = 47;
               case 13 -> var10000 = 60;
               case 14 -> var10000 = 16;
               case 15 -> var10000 = 58;
               case 16 -> var10000 = 32;
               case 17 -> var10000 = 18;
               case 18 -> var10000 = 28;
               case 19 -> var10000 = 33;
               case 20 -> var10000 = 59;
               case 21 -> var10000 = 6;
               case 22 -> var10000 = 40;
               case 23 -> var10000 = 1;
               case 24 -> var10000 = 3;
               case 25 -> var10000 = 26;
               case 26 -> var10000 = 55;
               case 27 -> var10000 = 9;
               case 28 -> var10000 = 41;
               case 29 -> var10000 = 5;
               case 30 -> var10000 = 50;
               case 31 -> var10000 = 31;
               case 32 -> var10000 = 23;
               case 33 -> var10000 = 11;
               case 34 -> var10000 = 14;
               case 35 -> var10000 = 4;
               case 36 -> var10000 = 44;
               case 37 -> var10000 = 19;
               case 38 -> var10000 = 30;
               case 39 -> var10000 = 54;
               case 40 -> var10000 = 53;
               case 41 -> var10000 = 21;
               case 42 -> var10000 = 63;
               case 43 -> var10000 = 46;
               case 44 -> var10000 = 42;
               case 45 -> var10000 = 45;
               case 46 -> var10000 = 29;
               case 47 -> var10000 = 61;
               case 48 -> var10000 = 10;
               case 49 -> var10000 = 17;
               case 50 -> var10000 = 24;
               case 51 -> var10000 = 39;
               case 52 -> var10000 = 22;
               case 53 -> var10000 = 43;
               case 54 -> var10000 = 25;
               case 55 -> var10000 = 15;
               case 56 -> var10000 = 57;
               case 57 -> var10000 = 51;
               case 58 -> var10000 = 48;
               case 59 -> var10000 = 0;
               case 60 -> var10000 = 36;
               case 61 -> var10000 = 38;
               case 62 -> var10000 = 8;
               default -> var10000 = 34;
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

   private static native void b();

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

   private static native Field d(Class var0, String var1, Class var2);

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

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 211 && var8 != 'm' && var8 != 243 && var8 != 'r') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 213) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 193) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 211) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'm') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 243) {
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
