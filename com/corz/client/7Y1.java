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

public enum 7Y1 {
   public static final 7Y1 8n;
   public static final 7Y1 8q;
   public static final 7Y1 8;
   public static final 7Y1 2;
   public static final 7Y1 4;
   public static final 7Y1 84;
   public static final 7Y1 8i;
   public static final 7Y1 8a;
   public static final 7Y1 8j;
   public static final 7Y1 8y;
   public static final 7Y1 7;
   public static final 7Y1 8g;
   public static final 7Y1 8R;
   public static final 7Y1 8k;
   public static final 7Y1 85;
   public static final 7Y1 8E;
   public static final 7Y1 8m;
   public static final 7Y1 8F;
   public static final 7Y1 8S;
   public static final 7Y1 89;
   public static final 7Y1 9;
   public static final 7Y1 8B;
   public static final 7Y1 6;
   public static final 7Y1 8_;
   public static final 7Y1 1;
   public static final 7Y1 8M;
   public static final 7Y1 8o;
   public static final 7Y1 86;
   public static final 7Y1 8r;
   public static final 7Y1 5;
   public static final 7Y1 8x;
   public static final 7Y1 8e;
   public static final 7Y1 0;
   public static final 7Y1 8I;
   public static final 7Y1 8z;
   private static final 7Y1[] 3;
   private static final long a = s.a(-2892072452819129610L, -4980901972312596950L, MethodHandles.lookup().lookupClass()).a(213758106904752L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;

   private static 7Y1[] _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 50149222913754L;
      e = new Object[45];
      f = new String[45];
      a();
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[35];
      int var17 = 0;
      String var16 = "I+\n\\\u0014\u0083\u001bUÛf\u0094[ÝÚ¤ºöF9_qyL(\u0010Ä*\u0081¶³wã\u0082{\u0083ùÚkS,\u001e\u0010²ÃñW\u0086\u009bï¹8\u008a¥ñ\u0017ÄÉ¼\u0018\u0090\u007f±\u0001\u007f\u007fYTBEèÏªP\r\u0012\b×ZéÖzön\u0018I+\n\\\u0014\u0083\u001bU²Ev'ê[\u0011_QY¸i³Êüh \u009bu«üÍ©\u009f¡\rn\u0094\u0019\u001ayÏ\fétgÖ_üT÷r£\u0090\u0001Ê\u0010\u00adè\u0018\u0012o\u0000\\\u0093\u009fRùPOd\u008dj\u0012ÜÊÅß\n(\bñ1Ç\u0018r[\u0000+Ü\u0005g\u0085I¾^aÄ\u0082\u001eü\u008aN*\u0000mò\u0006Û\u0010×¿Ñ§Ôvê»Ûü\u0093u¡\u0099\u0007S\u0010kÙ\nä8n\u008d\u0011\u0088\u0095 1\u0001\u0094\u0011F\u0010u\u0005þ\u0090¼üÊÜ\u001a\u0004âÖ\u0000!°³\u0018\"å=\u0085J¸I\u0015÷\u0086\u0004\u009e\u0081\u0012\u0090©Ö\u00adsí\u00ad|ÉK\u0018ëûn%_\u0019\u00872T\u008d\u0084\u001d\u0099ByýQ;%ÃBÁQ\u0087\u0010\u0010ùÀt^»¾\u0019\u009dãÌ]£ïp¨\u0010\u0089Ï\u0012?\u009c\u009f}¢\u001d\u009f>ÏO\u001d%_\u0018U\u0083z6Lã*lÕÝP1lkí\u000f\u0017ÅZ¯\u001c\u0006\u0096S\u0010j®Èm!uM¨ªÓ§\u0099±ø@Ú\u0010Åf\u0088Ùõæ¢þÄ\u0011\u00001]le«\u0018Í[\u0084'IøBÃ\u0017£»e¡\u000fí\u000e\u000b\u0085¥¥ùQgØ ëûn%_\u0019\u00872\u0001\u0088q¦\u0003P(àÜoü\"\u008aú\u0092`Ì\u0081\u00adexéÖ×\u0018ëûn%_\u0019\u00872Í(Ñá)\u0005\u0006 üà8\u0099[Fµv\u0010\u0088Ú¡©mà½l\u0017ùoæ\u0099°\u0094 \u0010j\u001d¥i\u0096\u0092o_\u009ayÍ\u0014ì¾$A\u0018Sãó|ÄÑ\u00ad\u000eø4¥l\b)\u007f+\u0013t}\\\u0012\u0083ùÄ\u0018ÐL\u0086\u0083\u000f\u0003e\u0086x:\u001c\u0080u\u0098H¸@ü\u007f5\u0001§yÜ\u0018ëûn%_\u0019\u00872å&±Å_\u008bñdð,\u0014\u0010ç=5Ì\u0018\u0012ª%E\u008f°¡øµ6íÑÁ\u0083<ÿ£\"vX0TpÒ\u0018\u0011@ß\u0098&4ê\u0006å\u0086`Â\u0015$~¡jÔ\u0094ögÑ'R\u0018\u0090\u007f±\u0001\u007f\u007fYT\u000fn\u0015¾\u0003ÙÒ<fü\u0015hKm[»\u0018I+\n\\\u0014\u0083\u001bU%\u0005\u0090âª;\u0087¤×úâÄdëV\u0011\u0018öÍõÇ\t\u008cLëP\u0081K¿à²´\u009f^ù\"à«\u0011\u0017ã\u0010\u009eÿ6ªEæc£²Ý´l¿!£\u0092\u0018Ü:õì\u008d0Xì¯¯`\u008egÜ?¸.`\u009c\u001c9\u008c#\u009d";
      int var18 = "I+\n\\\u0014\u0083\u001bUÛf\u0094[ÝÚ¤ºöF9_qyL(\u0010Ä*\u0081¶³wã\u0082{\u0083ùÚkS,\u001e\u0010²ÃñW\u0086\u009bï¹8\u008a¥ñ\u0017ÄÉ¼\u0018\u0090\u007f±\u0001\u007f\u007fYTBEèÏªP\r\u0012\b×ZéÖzön\u0018I+\n\\\u0014\u0083\u001bU²Ev'ê[\u0011_QY¸i³Êüh \u009bu«üÍ©\u009f¡\rn\u0094\u0019\u001ayÏ\fétgÖ_üT÷r£\u0090\u0001Ê\u0010\u00adè\u0018\u0012o\u0000\\\u0093\u009fRùPOd\u008dj\u0012ÜÊÅß\n(\bñ1Ç\u0018r[\u0000+Ü\u0005g\u0085I¾^aÄ\u0082\u001eü\u008aN*\u0000mò\u0006Û\u0010×¿Ñ§Ôvê»Ûü\u0093u¡\u0099\u0007S\u0010kÙ\nä8n\u008d\u0011\u0088\u0095 1\u0001\u0094\u0011F\u0010u\u0005þ\u0090¼üÊÜ\u001a\u0004âÖ\u0000!°³\u0018\"å=\u0085J¸I\u0015÷\u0086\u0004\u009e\u0081\u0012\u0090©Ö\u00adsí\u00ad|ÉK\u0018ëûn%_\u0019\u00872T\u008d\u0084\u001d\u0099ByýQ;%ÃBÁQ\u0087\u0010\u0010ùÀt^»¾\u0019\u009dãÌ]£ïp¨\u0010\u0089Ï\u0012?\u009c\u009f}¢\u001d\u009f>ÏO\u001d%_\u0018U\u0083z6Lã*lÕÝP1lkí\u000f\u0017ÅZ¯\u001c\u0006\u0096S\u0010j®Èm!uM¨ªÓ§\u0099±ø@Ú\u0010Åf\u0088Ùõæ¢þÄ\u0011\u00001]le«\u0018Í[\u0084'IøBÃ\u0017£»e¡\u000fí\u000e\u000b\u0085¥¥ùQgØ ëûn%_\u0019\u00872\u0001\u0088q¦\u0003P(àÜoü\"\u008aú\u0092`Ì\u0081\u00adexéÖ×\u0018ëûn%_\u0019\u00872Í(Ñá)\u0005\u0006 üà8\u0099[Fµv\u0010\u0088Ú¡©mà½l\u0017ùoæ\u0099°\u0094 \u0010j\u001d¥i\u0096\u0092o_\u009ayÍ\u0014ì¾$A\u0018Sãó|ÄÑ\u00ad\u000eø4¥l\b)\u007f+\u0013t}\\\u0012\u0083ùÄ\u0018ÐL\u0086\u0083\u000f\u0003e\u0086x:\u001c\u0080u\u0098H¸@ü\u007f5\u0001§yÜ\u0018ëûn%_\u0019\u00872å&±Å_\u008bñdð,\u0014\u0010ç=5Ì\u0018\u0012ª%E\u008f°¡øµ6íÑÁ\u0083<ÿ£\"vX0TpÒ\u0018\u0011@ß\u0098&4ê\u0006å\u0086`Â\u0015$~¡jÔ\u0094ögÑ'R\u0018\u0090\u007f±\u0001\u007f\u007fYT\u000fn\u0015¾\u0003ÙÒ<fü\u0015hKm[»\u0018I+\n\\\u0014\u0083\u001bU%\u0005\u0090âª;\u0087¤×úâÄdëV\u0011\u0018öÍõÇ\t\u008cLëP\u0081K¿à²´\u009f^ù\"à«\u0011\u0017ã\u0010\u009eÿ6ªEæc£²Ý´l¿!£\u0092\u0018Ü:õì\u008d0Xì¯¯`\u008egÜ?¸.`\u009c\u001c9\u008c#\u009d".length();
      char var15 = 24;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var16.substring(var24, var24 + var15);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var36;
                  if ((var24 += var15) >= var18) {
                     d = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[59];
                     int var3 = 0;
                     String var4 = "cR\u008c¹³í79d¦õÌ¬\u009dã P\r®ÕBnÿBÐ¿L\u0089\u0089õí\u0000\u0097Xk\u009flÀOWÆe\u0092«-0¹ááxt×TJRþJ\u0085ÆEe\u0092Ãq²ü\u0096\u0095üLl\t$³\u009eqæ£*\u009bBÔ\u0013\u001bÍ\u0099\u009b\u001d\u001e7ðÒ_4f(TüÄÓ\u0095bç¡µ\\\u0011ä\u009aÛ\u0001éU\u0099Q»úNÀ}\u009a¸\u0082\u008dgv¾$È\u008c;Y¾·h\u008f#\u00938©ã\u0000\u008c\u007féª\u0098\u008bêûUÖæe(©ss\u0002Dr\u007f\u0097?úm®&`÷õ\u0087ü\u008bKf\u0013<\u008a²Ù8´J* ÌÇ\u0013S\u0003~\u0085\u0094hþ5]Í?X®D\u008elª\u009b`\u0092\u0088\"'\u008f\u0081\u008c\u001f\u0088äe\u0011§1GÔæ«zàÊÓuûÄõU´à ìÔ^Ó\u0090\u0094 iá\n\u0085Qï\u0000\u009f\u0090aûã\u0006tÿ\u001b\u0089£eÊ\t9AÇv\u009b\u008f\u000b\u000f\u008a@z¬\u008e¢\u0006Qäó\u0093ö\u007f\u0087Ý¨9\u0019dßz\u0098]B\u0097ãÁÇ\u009a.\u0091 öÍ\u008c\u0084R\u0007N<þ¤Q´ðKê¬0È\u001e*\foÔ0y\u000e\u0010\u0081÷²o%p\u008d\u008f~Atò\u0006\u000b\u009e]Â\u000eçá\u0007I\u00910\u009e\u0085åß\u0004pÞ\u0001©&q~äú\u009aS Éú~f.\u0089+wm\fÙ9\u009aI\bÄÜf·¤ÇKþh¥! F§Xê\\aKãSÿS÷vÅb\u0019\u008dêWøü\u0012ã\u0098©H\u007fÚ~\u0083ò»l+¼FÙMq.ZüÁs\u0098É(Fæl\u008e£\u008bÕG";
                     int var5 = "cR\u008c¹³í79d¦õÌ¬\u009dã P\r®ÕBnÿBÐ¿L\u0089\u0089õí\u0000\u0097Xk\u009flÀOWÆe\u0092«-0¹ááxt×TJRþJ\u0085ÆEe\u0092Ãq²ü\u0096\u0095üLl\t$³\u009eqæ£*\u009bBÔ\u0013\u001bÍ\u0099\u009b\u001d\u001e7ðÒ_4f(TüÄÓ\u0095bç¡µ\\\u0011ä\u009aÛ\u0001éU\u0099Q»úNÀ}\u009a¸\u0082\u008dgv¾$È\u008c;Y¾·h\u008f#\u00938©ã\u0000\u008c\u007féª\u0098\u008bêûUÖæe(©ss\u0002Dr\u007f\u0097?úm®&`÷õ\u0087ü\u008bKf\u0013<\u008a²Ù8´J* ÌÇ\u0013S\u0003~\u0085\u0094hþ5]Í?X®D\u008elª\u009b`\u0092\u0088\"'\u008f\u0081\u008c\u001f\u0088äe\u0011§1GÔæ«zàÊÓuûÄõU´à ìÔ^Ó\u0090\u0094 iá\n\u0085Qï\u0000\u009f\u0090aûã\u0006tÿ\u001b\u0089£eÊ\t9AÇv\u009b\u008f\u000b\u000f\u008a@z¬\u008e¢\u0006Qäó\u0093ö\u007f\u0087Ý¨9\u0019dßz\u0098]B\u0097ãÁÇ\u009a.\u0091 öÍ\u008c\u0084R\u0007N<þ¤Q´ðKê¬0È\u001e*\foÔ0y\u000e\u0010\u0081÷²o%p\u008d\u008f~Atò\u0006\u000b\u009e]Â\u000eçá\u0007I\u00910\u009e\u0085åß\u0004pÞ\u0001©&q~äú\u009aS Éú~f.\u0089+wm\fÙ9\u009aI\bÄÜf·¤ÇKþh¥! F§Xê\\aKãSÿS÷vÅb\u0019\u008dêWøü\u0012ã\u0098©H\u007fÚ~\u0083ò»l+¼FÙMq.ZüÁs\u0098É(Fæl\u008e£\u008bÕG".length();
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
                                    b = var6;
                                    c = new Integer[59];
                                    8n = new 7Y1(var11[9], 0);
                                    8q = new 7Y1(var11[14], 1);
                                    8 = new 7Y1(var11[21], 2);
                                    2 = new 7Y1(var11[16], 3);
                                    4 = new 7Y1(var11[3], 4);
                                    84 = new 7Y1(var11[34], 5);
                                    8i = new 7Y1(var11[33], true.b<invokedynamic>(11690, 8764355084465783175L ^ var20));
                                    8a = new 7Y1(var11[31], true.b<invokedynamic>(24533, 8073428788733883356L ^ var20));
                                    8j = new 7Y1(var11[18], true.b<invokedynamic>(23947, 9183711240038855052L ^ var20));
                                    8y = new 7Y1(var11[23], true.b<invokedynamic>(9331, 1745999775152785483L ^ var20));
                                    7 = new 7Y1(var11[11], true.b<invokedynamic>(18626, 6553742488900609256L ^ var20));
                                    8g = new 7Y1(var11[10], true.b<invokedynamic>(6741, 5092222479391946316L ^ var20));
                                    8R = new 7Y1(var11[28], true.b<invokedynamic>(338, 8685032991399472450L ^ var20));
                                    8k = new 7Y1(var11[22], true.b<invokedynamic>(791, 2906670885735853825L ^ var20));
                                    85 = new 7Y1(var11[0], true.b<invokedynamic>(14751, 4520206609833252236L ^ var20));
                                    8E = new 7Y1(var11[6], true.b<invokedynamic>(71, 2034391477791648893L ^ var20));
                                    8m = new 7Y1(var11[32], true.b<invokedynamic>(7005, 6473531932087777098L ^ var20));
                                    8F = new 7Y1(var11[2], true.b<invokedynamic>(3829, 954163253697143496L ^ var20));
                                    8S = new 7Y1(var11[26], true.b<invokedynamic>(15328, 4616011629932894177L ^ var20));
                                    89 = new 7Y1(var11[12], true.b<invokedynamic>(15699, 1365185798652612964L ^ var20));
                                    9 = new 7Y1(var11[20], true.b<invokedynamic>(31798, 5838760930215858220L ^ var20));
                                    8B = new 7Y1(var11[19], true.b<invokedynamic>(14032, 4919059550277262064L ^ var20));
                                    6 = new 7Y1(var11[25], true.b<invokedynamic>(9260, 6751601263661697065L ^ var20));
                                    8_ = new 7Y1(var11[24], true.b<invokedynamic>(7076, 747383747607656342L ^ var20));
                                    1 = new 7Y1(var11[15], true.b<invokedynamic>(19741, 1931108283777589564L ^ var20));
                                    8M = new 7Y1(var11[7], true.b<invokedynamic>(3389, 3476110983088136489L ^ var20));
                                    8o = new 7Y1(var11[27], true.b<invokedynamic>(22339, 4509727614211734347L ^ var20));
                                    86 = new 7Y1(var11[30], true.b<invokedynamic>(26019, 53399476333939107L ^ var20));
                                    8r = new 7Y1(var11[17], true.b<invokedynamic>(29587, 3307451903493447558L ^ var20));
                                    5 = new 7Y1(var11[1], true.b<invokedynamic>(24707, 7809671506585291911L ^ var20));
                                    8x = new 7Y1(var11[5], true.b<invokedynamic>(17593, 4421140266418808977L ^ var20));
                                    8e = new 7Y1(var11[13], true.b<invokedynamic>(9683, 8378723895140895213L ^ var20));
                                    0 = new 7Y1(var11[8], true.b<invokedynamic>(7508, 5776941694110658923L ^ var20));
                                    8I = new 7Y1(var11[29], true.b<invokedynamic>(8554, 3722010431057448315L ^ var20));
                                    8z = new 7Y1(var11[4], true.b<invokedynamic>(13691, 6342720703140714846L ^ var20));
                                    3 = 7172758742731076919L.ñ<invokedynamic>(7172758742731076919L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0087¾úÎÝ\u001e\u00884|\u0099*r\u001915Ô";
                                 var5 = "\u0087¾úÎÝ\u001e\u00884|\u0099*r\u001915Ô".length();
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

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var36;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label54;
                  }

                  var16 = "õ\u0099jªM¨Ä\u0097\u0004¦\u001fdÊ\n§åJ\u008dg\u0005°²o5\u0018õ\u0099jªM¨Ä\u0097|(x\u008d¬t\\±n\u0091\u0018êÜ\r\u0001©";
                  var18 = "õ\u0099jªM¨Ä\u0097\u0004¦\u001fdÊ\n§åJ\u008dg\u0005°²o5\u0018õ\u0099jªM¨Ä\u0097|(x\u008d¬t\\±n\u0091\u0018êÜ\r\u0001©".length();
                  var15 = 24;
                  var24 = -1;
            }

            ++var24;
            var25 = var16.substring(var24, var24 + var15);
            var10001 = 0;
         }
      }
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

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
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

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f[var4] != null) {
         return var4;
      } else {
         Object var5 = e[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 12;
               case 1 -> var10000 = 32;
               case 2 -> var10000 = 39;
               case 3 -> var10000 = 2;
               case 4 -> var10000 = 5;
               case 5 -> var10000 = 48;
               case 6 -> var10000 = 46;
               case 7 -> var10000 = 7;
               case 8 -> var10000 = 11;
               case 9 -> var10000 = 50;
               case 10 -> var10000 = 57;
               case 11 -> var10000 = 16;
               case 12 -> var10000 = 15;
               case 13 -> var10000 = 29;
               case 14 -> var10000 = 1;
               case 15 -> var10000 = 38;
               case 16 -> var10000 = 31;
               case 17 -> var10000 = 59;
               case 18 -> var10000 = 8;
               case 19 -> var10000 = 24;
               case 20 -> var10000 = 30;
               case 21 -> var10000 = 18;
               case 22 -> var10000 = 51;
               case 23 -> var10000 = 17;
               case 24 -> var10000 = 21;
               case 25 -> var10000 = 42;
               case 26 -> var10000 = 23;
               case 27 -> var10000 = 34;
               case 28 -> var10000 = 27;
               case 29 -> var10000 = 26;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 28;
               case 32 -> var10000 = 6;
               case 33 -> var10000 = 53;
               case 34 -> var10000 = 52;
               case 35 -> var10000 = 49;
               case 36 -> var10000 = 13;
               case 37 -> var10000 = 37;
               case 38 -> var10000 = 10;
               case 39 -> var10000 = 55;
               case 40 -> var10000 = 25;
               case 41 -> var10000 = 36;
               case 42 -> var10000 = 0;
               case 43 -> var10000 = 56;
               case 44 -> var10000 = 61;
               case 45 -> var10000 = 33;
               case 46 -> var10000 = 47;
               case 47 -> var10000 = 40;
               case 48 -> var10000 = 60;
               case 49 -> var10000 = 54;
               case 50 -> var10000 = 62;
               case 51 -> var10000 = 58;
               case 52 -> var10000 = 63;
               case 53 -> var10000 = 3;
               case 54 -> var10000 = 22;
               case 55 -> var10000 = 43;
               case 56 -> var10000 = 20;
               case 57 -> var10000 = 44;
               case 58 -> var10000 = 14;
               case 59 -> var10000 = 35;
               case 60 -> var10000 = 45;
               case 61 -> var10000 = 9;
               case 62 -> var10000 = 41;
               default -> var10000 = 19;
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

            f[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var26;
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
                     e[var4] = var19;
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
         if (var8 != 221 && var8 != 245 && var8 != 't' && var8 != 202) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 218) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 241) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 221) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 245) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 't') {
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

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
