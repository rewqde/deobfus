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

public enum 7Oc {
   public static final 7Oc 8;
   public static final 7Oc 9;
   public static final 7Oc 0;
   public static final 7Oc 7;
   public static final 7Oc 4;
   public static final 7Oc 2;
   public static final 7Oc 1;
   public static final 7Oc 3;
   public final boolean 7C;
   public final boolean 5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;

   private _Oc/* $FF was: 7Oc*/(boolean var3, boolean var4) {
      this.7C = var3;
      this.5 = var4;
   }

   public boolean _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public static 7Oc _/* $FF was: 9*/(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private static 7Oc[] _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7Oc.class, 537);
      a = s.a(2093601365952819136L, 6351301372672940082L, MethodHandles.lookup().lookupClass()).a(11621116112369L);
      long var20 = a ^ 75569073419303L;
      h = new Object[28];
      i = new String[28];
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
      String[] var18 = new String[51];
      int var16 = 0;
      String var15 = "gó\u0093jÞÌ<Þñ\u0088\u001aÁaé8\u009eö\u0087Ð<\u0084\u009c\u0092>\u0092ÿþ\u0086\u0080\u001d\u008aô0\u0091ÉÁK÷\u008e\u000ef2,ÿ\u001a7\u000bI\u001ayÎ»â÷\u009cS\u009b\u001b\nÃ~ÿõÑ\u0096Ì#øF[\u009eñ\u0088\u009bCÍ)\u007fÚêW\u0018\u001aáýîï½×å©²R×E\u009b¿{\u0014ì\u0089l\u001a$\u0001¯(Àh\u0081Ä\u0017N\"\u0006êj@0|A)×æ\u0005\u0084ÙB\r=\rÏòë\u0017¿rd\u009dÆ\rnVSÊ\u0083\u0000 ôôÁ Ú\u0093Ï\t\u0085ïSá\u0016\b4Y(©\u001bçé\u0017\u0014ôöÿ\u0095âÝÊ«²(\u008e}Ý_«\u0098\u0084%/}ÝW\\;õ^\u009e\u001føÓK}\f\n\u0018tÇ\u008fÅk¿sÀpI×ö\u0091\u001eø\u0018cÙRÕ¯<,qbÔ\f¡N\u0017Ê9ù}¯\u009aÒÌ\bj Ez\u0087\u009arÃL\u0092Íø\u001d1Ô\u008f³°gÑb¥¼$F¸½\u0005ß¦\u001a|ü\u0003 /¯\u0003\u0017Ì\u0019³¥,z\u0081l\u0099\u008cðgøß\nññ¤/qvù$Wwi\u0018\u000b(æ\u009d´¿¹y<ÂÛ\u0094¨W¤(\u00888\u0088ÝáÂ?\u0016×\u0016Ñªo®ÅÆÀKÉæ\\@^a\u009a¿\u0018)\u007fhÆ-×Þ±B\u009fVF,_>\u008dÅ>\u0001ØÉ\u0092°± <Ìp\u009e)¾\u0095\u001c\u0096Âe\u0087¥â\u009c\u001fz\u0004Yn@\u0095¡ØÍ¸5j\u009b<\u0015C\u00182ß#:W'\u001c\fÆ\u009bèa\u0097\u0003©ãÂ{M¯\u000e\u009b\u009a£\u0018Á\u0010\u0097óÔÙÊ²d=¦ \u0094»\\A\u0082ø;!Ëù_k8éXp\u0084û\u0091FIUfG\u0084\u008be>\u001dO¤g\u008b®ºøô\u000e\u0087ì°¢>S\u008c=W\u0091\u007fTæN\u0018\u0092\u0088Ièr,\u0092\u0002Y¾°Ó;c\u0004§\u0010\u0015dË²\u0082!Qu@|m²@mà\u008b \b\u0092\u0012³\u0089^\t?\u001dM¯öy\u009eM£\u0003X<\u009f«\"ô\u008b\u0011G%\u009fNu>d }¹M3D@Ô\u0000\u007fý¹\u0086 Dï6\u009aéäù*y\u0086>\u001e'Ð\u0086º\u0017\u001d~\u0018\u0013ê¹^\u008e\u0006ü-ù#\u000e\u0000éÇ\u0013×mà I½²#j(*iw2\u007fv\u008d¦\u009bsÚ Ï \u0001\u009bö\f\u0087\u009e,êqãP\u0006±\u0098RÐK\u0016\u000e\u0099(\u009eX\u001c\bÆ\u0010£0vÛñÅjP\rær}¤;Kï(P¥§õj¬Ü\u007fl³K2`*©GiwV°ú\u0083\u0089\u0094\u0013\u0083Ä°í4\u0017\u0002!kU[ I`\u009d\u0010kõ)q`&~±¾õ\u0017º\u0014\u0095'¼\u0018\u001bGN~øìn\u000e'\u0086\u000e\u000e\u0003ô¥\u0013Ô\u009c\u009dçc\u008c%!(]ºß&¿g\u0007ñFÊ\u0087\u0017ø½j\u001d9\u0089çäk\u0091Û}EýÔ\u009b7ªJò¥\u0011,¹dóá6 \u0017Â°nl\u0088P\u0011¯Y\f\u0087{¨yºÚKw\u0001²1à\u0018\u0084\u0018Ð`Ó¬ì\u00968»Cù\r8®\u0082?\u0098¯\u008d*\u0090¥\u0090\u001eE\u000bÆ\u0003k·v#òä.\u0094w\u009eÈ\u0091\u007f\u0002\u001c#\u009dY\u0002f\u0080:¤öÈK&\u0084L¿1Ñf\u008eÆ\u000f \u0005±?\u0003h\rLTD\u00833#U@ùøcîºiÙÌ=×ÖV¥ga:\u0003F\u0010cNÒ\u007fFé6»å\u009a\u009eä\u0091BJ%\u0018\u009c\u0005\u0084ûOí£_rÝ{8æ¾X\r\u00ad\u001bF\u0018\u0019ÐþÝ \u000eÉ\u0080Jô\u001d+V3üuBÒÂÄ£K³·äÒEA]ÒK'\u0002\u0004+2Í(s_\u008b\u0015\u0090¤\t\u0015×inÓ>ZA\u0082\u009am\u009e\u009fµß]ü£°\u0014]UÀ,8\u0095Üêl¹-\u0012\u000b ½\u008cì{¢?NúÊ6\u009cpd¾\u000fç\u0084]2J\u0099ÁkTWY\u0087\u0081\u009c\u0007¢Ó\u0018Ú\u0005½\f%Nv\u00031«Y¥û)%å\u0095\\Ü]W»ï\u009d(Zª-ò_Þ:ÿvâ7âðyì«´\u001cî\u0004ª QY\u009b\u0087·µ²Éèfíä#0\u009f\u0082ê\u0084(nj%\u0006W\u0010\u0018\u001f\u0090]<\u0015&óÒBËÝÍ+A8ôÏõ=À\u0084W¼û[7\u00101\u0006í]Ã\u008f\u0018\r#^¦b¥\u0090\u0019\u009e\u0092V'å8\u0095¥.?Ç·Ã±ûß\u0018\u008aö\u0099íõ58s£§ð®çÎÿÅuò¬\u008e!\u008f\u0016\u009c õk¼^YÅ\u0086\rñ%¥»h*ã{@\u0016\u000b\u0003gxQ2.\u0011´V\nCpú ¼¨\u0080ñ{ß¬\u0081-b\u0016d\tU\u000eÎîE\u0098Ê\u009cgË»\u0096§\u008b/¼µ½\u008e\u0018\u000fMì;óN\u0099%è\u0017É\u001eüÁ\u0096\bSÿf|\u008aVV\u0019 Ä£4?S\u0014Åa\u00825\u0096i\u009e[J\nR\u0002Ù\u0002\"\u0094r\u0088UÍDÂ4\u0002¯Ä üP\u0000Íb\u008eý\u00071ZPªR\u0003¿G\u0018\u008afî\u000eÿò·w÷Gº!üIq\u0010à\r\u0083¡ÆS5í6J$ñ\u000fU\u0096\u0084\u0018k3R×c`O«½\u007f+GµâÙ\u009fÃRëÑz\t\u0015¹ \u009bå\u0003ÌÐ\u008b#\u0087Ü\u0096¨´\u009d\u0093ð\u008a$%m\u0001C0Wr»µ²Ï\n`,¤\u0018\u0000ý|\u0093ßÕóF(Íc\u001ed®®ÆÓ½ç\u008cÇò\u0000\u0099 \u001af\u008e\u0080=5lñx2HR÷\u00879\u0018PIãÖÑB\u0014O¹þ\u009bSUb\u0081\u0087 \u0085 4$\u0098ü2G\rÞe¬0L@ürÚÄQÉ\u00ad\n\u0088%n3C&Âsô";
      int var17 = "gó\u0093jÞÌ<Þñ\u0088\u001aÁaé8\u009eö\u0087Ð<\u0084\u009c\u0092>\u0092ÿþ\u0086\u0080\u001d\u008aô0\u0091ÉÁK÷\u008e\u000ef2,ÿ\u001a7\u000bI\u001ayÎ»â÷\u009cS\u009b\u001b\nÃ~ÿõÑ\u0096Ì#øF[\u009eñ\u0088\u009bCÍ)\u007fÚêW\u0018\u001aáýîï½×å©²R×E\u009b¿{\u0014ì\u0089l\u001a$\u0001¯(Àh\u0081Ä\u0017N\"\u0006êj@0|A)×æ\u0005\u0084ÙB\r=\rÏòë\u0017¿rd\u009dÆ\rnVSÊ\u0083\u0000 ôôÁ Ú\u0093Ï\t\u0085ïSá\u0016\b4Y(©\u001bçé\u0017\u0014ôöÿ\u0095âÝÊ«²(\u008e}Ý_«\u0098\u0084%/}ÝW\\;õ^\u009e\u001føÓK}\f\n\u0018tÇ\u008fÅk¿sÀpI×ö\u0091\u001eø\u0018cÙRÕ¯<,qbÔ\f¡N\u0017Ê9ù}¯\u009aÒÌ\bj Ez\u0087\u009arÃL\u0092Íø\u001d1Ô\u008f³°gÑb¥¼$F¸½\u0005ß¦\u001a|ü\u0003 /¯\u0003\u0017Ì\u0019³¥,z\u0081l\u0099\u008cðgøß\nññ¤/qvù$Wwi\u0018\u000b(æ\u009d´¿¹y<ÂÛ\u0094¨W¤(\u00888\u0088ÝáÂ?\u0016×\u0016Ñªo®ÅÆÀKÉæ\\@^a\u009a¿\u0018)\u007fhÆ-×Þ±B\u009fVF,_>\u008dÅ>\u0001ØÉ\u0092°± <Ìp\u009e)¾\u0095\u001c\u0096Âe\u0087¥â\u009c\u001fz\u0004Yn@\u0095¡ØÍ¸5j\u009b<\u0015C\u00182ß#:W'\u001c\fÆ\u009bèa\u0097\u0003©ãÂ{M¯\u000e\u009b\u009a£\u0018Á\u0010\u0097óÔÙÊ²d=¦ \u0094»\\A\u0082ø;!Ëù_k8éXp\u0084û\u0091FIUfG\u0084\u008be>\u001dO¤g\u008b®ºøô\u000e\u0087ì°¢>S\u008c=W\u0091\u007fTæN\u0018\u0092\u0088Ièr,\u0092\u0002Y¾°Ó;c\u0004§\u0010\u0015dË²\u0082!Qu@|m²@mà\u008b \b\u0092\u0012³\u0089^\t?\u001dM¯öy\u009eM£\u0003X<\u009f«\"ô\u008b\u0011G%\u009fNu>d }¹M3D@Ô\u0000\u007fý¹\u0086 Dï6\u009aéäù*y\u0086>\u001e'Ð\u0086º\u0017\u001d~\u0018\u0013ê¹^\u008e\u0006ü-ù#\u000e\u0000éÇ\u0013×mà I½²#j(*iw2\u007fv\u008d¦\u009bsÚ Ï \u0001\u009bö\f\u0087\u009e,êqãP\u0006±\u0098RÐK\u0016\u000e\u0099(\u009eX\u001c\bÆ\u0010£0vÛñÅjP\rær}¤;Kï(P¥§õj¬Ü\u007fl³K2`*©GiwV°ú\u0083\u0089\u0094\u0013\u0083Ä°í4\u0017\u0002!kU[ I`\u009d\u0010kõ)q`&~±¾õ\u0017º\u0014\u0095'¼\u0018\u001bGN~øìn\u000e'\u0086\u000e\u000e\u0003ô¥\u0013Ô\u009c\u009dçc\u008c%!(]ºß&¿g\u0007ñFÊ\u0087\u0017ø½j\u001d9\u0089çäk\u0091Û}EýÔ\u009b7ªJò¥\u0011,¹dóá6 \u0017Â°nl\u0088P\u0011¯Y\f\u0087{¨yºÚKw\u0001²1à\u0018\u0084\u0018Ð`Ó¬ì\u00968»Cù\r8®\u0082?\u0098¯\u008d*\u0090¥\u0090\u001eE\u000bÆ\u0003k·v#òä.\u0094w\u009eÈ\u0091\u007f\u0002\u001c#\u009dY\u0002f\u0080:¤öÈK&\u0084L¿1Ñf\u008eÆ\u000f \u0005±?\u0003h\rLTD\u00833#U@ùøcîºiÙÌ=×ÖV¥ga:\u0003F\u0010cNÒ\u007fFé6»å\u009a\u009eä\u0091BJ%\u0018\u009c\u0005\u0084ûOí£_rÝ{8æ¾X\r\u00ad\u001bF\u0018\u0019ÐþÝ \u000eÉ\u0080Jô\u001d+V3üuBÒÂÄ£K³·äÒEA]ÒK'\u0002\u0004+2Í(s_\u008b\u0015\u0090¤\t\u0015×inÓ>ZA\u0082\u009am\u009e\u009fµß]ü£°\u0014]UÀ,8\u0095Üêl¹-\u0012\u000b ½\u008cì{¢?NúÊ6\u009cpd¾\u000fç\u0084]2J\u0099ÁkTWY\u0087\u0081\u009c\u0007¢Ó\u0018Ú\u0005½\f%Nv\u00031«Y¥û)%å\u0095\\Ü]W»ï\u009d(Zª-ò_Þ:ÿvâ7âðyì«´\u001cî\u0004ª QY\u009b\u0087·µ²Éèfíä#0\u009f\u0082ê\u0084(nj%\u0006W\u0010\u0018\u001f\u0090]<\u0015&óÒBËÝÍ+A8ôÏõ=À\u0084W¼û[7\u00101\u0006í]Ã\u008f\u0018\r#^¦b¥\u0090\u0019\u009e\u0092V'å8\u0095¥.?Ç·Ã±ûß\u0018\u008aö\u0099íõ58s£§ð®çÎÿÅuò¬\u008e!\u008f\u0016\u009c õk¼^YÅ\u0086\rñ%¥»h*ã{@\u0016\u000b\u0003gxQ2.\u0011´V\nCpú ¼¨\u0080ñ{ß¬\u0081-b\u0016d\tU\u000eÎîE\u0098Ê\u009cgË»\u0096§\u008b/¼µ½\u008e\u0018\u000fMì;óN\u0099%è\u0017É\u001eüÁ\u0096\bSÿf|\u008aVV\u0019 Ä£4?S\u0014Åa\u00825\u0096i\u009e[J\nR\u0002Ù\u0002\"\u0094r\u0088UÍDÂ4\u0002¯Ä üP\u0000Íb\u008eý\u00071ZPªR\u0003¿G\u0018\u008afî\u000eÿò·w÷Gº!üIq\u0010à\r\u0083¡ÆS5í6J$ñ\u000fU\u0096\u0084\u0018k3R×c`O«½\u007f+GµâÙ\u009fÃRëÑz\t\u0015¹ \u009bå\u0003ÌÐ\u008b#\u0087Ü\u0096¨´\u009d\u0093ð\u008a$%m\u0001C0Wr»µ²Ï\n`,¤\u0018\u0000ý|\u0093ßÕóF(Íc\u001ed®®ÆÓ½ç\u008cÇò\u0000\u0099 \u001af\u008e\u0080=5lñx2HR÷\u00879\u0018PIãÖÑB\u0014O¹þ\u009bSUb\u0081\u0087 \u0085 4$\u0098ü2G\rÞe¬0L@ürÚÄQÉ\u00ad\n\u0088%n3C&Âsô".length();
      char var14 = ' ';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var15.substring(var24, var24 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[51];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\u001f<Y¯\u0016Úß\u0012ÖÍy&ÎHÖ\"kh$K087\u0015";
                     int var5 = "\u001f<Y¯\u0016Úß\u0012ÖÍy&ÎHÖ\"kh$K087\u0015".length();
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
                                    f = new Integer[5];
                                    8 = new 7Oc(true.r<invokedynamic>(431, 8470138450061210752L ^ var20), 0, false, true);
                                    9 = new 7Oc(true.r<invokedynamic>(27400, 7952880566262390326L ^ var20), 1, false, false);
                                    0 = new 7Oc(true.r<invokedynamic>(14712, 7556822876152302677L ^ var20), 2, false, false);
                                    7 = new 7Oc(true.r<invokedynamic>(13525, 5355287913173909952L ^ var20), 3, false, true);
                                    4 = new 7Oc(true.r<invokedynamic>(17263, 8939322457665107525L ^ var20), 4, true, false);
                                    2 = new 7Oc(true.r<invokedynamic>(30189, 265736540166406395L ^ var20), 5, true, false);
                                    1 = new 7Oc(true.r<invokedynamic>(16745, 6578938784515257424L ^ var20), true.z<invokedynamic>(7543, 3050840695138865061L ^ var20), true, false);
                                    3 = new 7Oc(true.r<invokedynamic>(25272, 5527006809694754692L ^ var20), true.z<invokedynamic>(29067, 1759339178729546591L ^ var20), true, false);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\"\u001fów\u0011ü\u0092Ã>C§\u0091¾VuJ";
                                 var5 = "\"\u001fów\u0011ü\u0092Ã>C§\u0091¾VuJ".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "zÙ\u0092Ü4Bís¾9%+T\u00adÖË\u0018\u0013âHÍZùó3Y\bô©%\u0004ã<\u0001Ý\u0092ß~öù\u0081";
                  var17 = "zÙ\u0092Ü4Bís¾9%+T\u00adÖË\u0018\u0013âHÍZùó3Y\bô©%\u0004ã<\u0001Ý\u0092ß~öù\u0081".length();
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
               case 0 -> var10000 = 2;
               case 1 -> var10000 = 29;
               case 2 -> var10000 = 59;
               case 3 -> var10000 = 47;
               case 4 -> var10000 = 30;
               case 5 -> var10000 = 48;
               case 6 -> var10000 = 6;
               case 7 -> var10000 = 39;
               case 8 -> var10000 = 40;
               case 9 -> var10000 = 45;
               case 10 -> var10000 = 0;
               case 11 -> var10000 = 19;
               case 12 -> var10000 = 41;
               case 13 -> var10000 = 25;
               case 14 -> var10000 = 32;
               case 15 -> var10000 = 57;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 4;
               case 18 -> var10000 = 56;
               case 19 -> var10000 = 61;
               case 20 -> var10000 = 34;
               case 21 -> var10000 = 49;
               case 22 -> var10000 = 53;
               case 23 -> var10000 = 13;
               case 24 -> var10000 = 26;
               case 25 -> var10000 = 36;
               case 26 -> var10000 = 17;
               case 27 -> var10000 = 62;
               case 28 -> var10000 = 31;
               case 29 -> var10000 = 1;
               case 30 -> var10000 = 23;
               case 31 -> var10000 = 60;
               case 32 -> var10000 = 33;
               case 33 -> var10000 = 28;
               case 34 -> var10000 = 22;
               case 35 -> var10000 = 50;
               case 36 -> var10000 = 55;
               case 37 -> var10000 = 18;
               case 38 -> var10000 = 7;
               case 39 -> var10000 = 51;
               case 40 -> var10000 = 3;
               case 41 -> var10000 = 16;
               case 42 -> var10000 = 8;
               case 43 -> var10000 = 21;
               case 44 -> var10000 = 24;
               case 45 -> var10000 = 14;
               case 46 -> var10000 = 54;
               case 47 -> var10000 = 15;
               case 48 -> var10000 = 5;
               case 49 -> var10000 = 44;
               case 50 -> var10000 = 27;
               case 51 -> var10000 = 43;
               case 52 -> var10000 = 35;
               case 53 -> var10000 = 52;
               case 54 -> var10000 = 10;
               case 55 -> var10000 = 63;
               case 56 -> var10000 = 37;
               case 57 -> var10000 = 20;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 12;
               case 60 -> var10000 = 38;
               case 61 -> var10000 = 46;
               case 62 -> var10000 = 11;
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
      var10000[2] = Boolean.TYPE;
      i[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
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
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
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

   private static native Field a(Class var0, String var1, Class var2);

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
         if (var8 != 203 && var8 != 234 && var8 != 251 && var8 != 216) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'O') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 240) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 203) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 234) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 251) {
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
