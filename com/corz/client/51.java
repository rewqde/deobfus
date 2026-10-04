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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1728;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2863;
import net.minecraft.class_310;

public class 51 {
   private static final class_310 4N;
   private static final int 4D;
   private static final int 4k;
   private 7To 4u;
   private int 4w;
   private int 0;
   private int 7;
   private static final long 9;
   private 7t3 4;
   private int 2;
   private long 8;
   private long 45;
   private long 5;
   private long 4b;
   private 7ck 4e;
   private int 3;
   private int 4z;
   private int 6;
   private int 4R;
   private class_1792 47;
   private int 1;
   private String 4y;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;
   private static final Object[] k;
   private static final String[] l;
   // $FF: synthetic field
   private static transient String RtGZyhYHhE;

   public _1/* $FF was: 51*/(int param1, short param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      boolean var10000;
      try {
         if (this.û<invokedynamic>(this, (long)"c", var2) != null) {
            var10000 = true;
            return var10000;
         }
      } catch (MatchException var4) {
         throw var4.£<invokedynamic>(var4, (long)"c", var2);
      }

      var10000 = false;
      return var10000;
   }

   public 7ck _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.û<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 8*/(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var3 = (Integer)var1[2];
      int var2 = (Integer)var1[1];
      long var5 = ((long)var4 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      return this.û<invokedynamic>(this, (long)"c", var5);
   }

   public class_1792 _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.û<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.û<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.û<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.R<invokedynamic>(this, (7To)null, (long)"c", var2);
      this.R<invokedynamic>(this, "c".ý<invokedynamic>((long)"c", var2), (long)"c", var2);
      this.R<invokedynamic>(this, (7ck)null, (long)"c", var2);
   }

   public 4n _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 4n _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[1];
      int var4 = (Integer)var1[2];
      var2 = a ^ var2;
      ((class_1728)var1[0]).M<invokedynamic>((class_1728)var1[0], var4, (long)"c", var2);
      "c".ý<invokedynamic>((long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2), (long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2), (long)"c", var2), (long)"c", var2).M<invokedynamic>("c".ý<invokedynamic>((long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2), (long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2).û<invokedynamic>("c".ý<invokedynamic>((long)"c", var2), (long)"c", var2), (long)"c", var2), new class_2863(var4), (long)"c", var2);
   }

   private List _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private String _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private String _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7ck _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private int _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_1728 _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 7*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      this.R<invokedynamic>(this, (7t3)var1[0], (long)"c", var3);
      this.R<invokedynamic>(this, this.û<invokedynamic>(this, (long)"c", var3), (long)"c", var3);
   }

   private long _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.û<invokedynamic>(this, (long)"c", var2) - this.û<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static Predicate _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 8*/(short param0, int param1, 7ck param2, short param3, class_1799 param4) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(51.class, 112);
      a = s.a(5374221474126046017L, 644513326114510064L, MethodHandles.lookup().lookupClass()).a(307417517270L);
      long var31 = a ^ 59272160273766L;
      k = new Object[192];
      l = new String[192];
      a();
      d = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[25];
      int var27 = 0;
      String var26 = "w#®\u0085à\u0004cìÀ^8Ä,\u0011ìr\u0010\u001d\u0085\u0004¡w\u001a3T\u0096\u0096ÕIn\u008a<\r\u0010÷õ[[\u001eY#¤þ;\u001d\u00ad\u008eÁt£\u0010{\u007f~þJ\u001e¹\u0005ÁèC\tkõï\u0082 jãEÊ¨pI&þÔ\u0085áÀ<\u0092r\u0089Øt{\u009fH|\u008eA\u0092\u000fEÚ÷CÚ\u0010B»¢eÑWËµ`L\u009f\u001d\u0082\u008eé\u0099\u0010·=dÌÒ¢hP±VÂßÄÅñ\u001e(! &Ï¿=B\u0085È\u0087ªp¤\u0018¾*»Ïx\u0095%y¨¬ÙZ\u0014\u0093*o<³\u0003\u001d\u0081ø~Ý!\u008a\u0010\u001dhÊ¹> \u001aS1\fÞ-@G96\u00184!7O·\u0098\u001bEiù\u0001\u0091Ââ»\u0091HT[\u008e\u001c?¶)\u0018´f\u009bn\u009dµê§\u0096§\u001e5þÙù\u009cÈ\u00adÅW²;\u008a\u0001\u0010ð%9Ä\u009e\u0005\t;y\u009e*ïnÂ£Z\u0010f¯0\u008c\t\u0096Xl_À ¼\u0092?ru8\u0019ø\u0092\u008c\u009d³¢Üg\u001fm\u0081ÙÞ\u0091n¤¨#;ÛW=\u0084iÔT?ðº=£\u0081ÃA_Ônø\u000f9U»\u0015\u009fº\u0002Òn|DÄëñ\u0000\u00ad(\u001aî«mR)\u00adùÃø \u0000\u009aÂ~\u001d\u0011\u0087ÄÌÃÎú\u008a\u009f3:ºñã.\u009am°ÐH\tº!Ã\u0010d\u0098\u0086NW\u0096\u0099K\u0014§\u0010t'Í\u009f\u009f(;\u008b5\u008fî\u0084\u0007\u0010Ch\u0014n\u0095=å× :_µQL³Or\u0096\u0002\\Å\u0093YZÿI5\tyð½\u009e\u0010ù ÕZ<*õl\u007f+\u001c\u0096Á&Ñ& F\u0092é\u0087ì\u0005GªÈòÅcåuJ*Ó-\u00ad\u001f\u0090Å»\u0088·\u0007µ\u0094[´ÐX(´\u0003£¥O¡\u0084h\u0000\u0084\u0088î\u009a£}\u000bW\u009c~m\u0013RÌÑ¶\u0011h\u0083s7Í\u001160@þ¶ëÏJ\u0010\u0006°\u00ad4êÕþ°ê\u000b¬ù\u0089,Ej I\u007f4ÒúÎ2\f\u0000Ýi±Q»ú«Fk½âR\u000e\\\nÑ\\ô»D¿ßù\u0010õW.\u0019Æu\"Þ±6ú)E\u00109Æ";
      int var28 = "w#®\u0085à\u0004cìÀ^8Ä,\u0011ìr\u0010\u001d\u0085\u0004¡w\u001a3T\u0096\u0096ÕIn\u008a<\r\u0010÷õ[[\u001eY#¤þ;\u001d\u00ad\u008eÁt£\u0010{\u007f~þJ\u001e¹\u0005ÁèC\tkõï\u0082 jãEÊ¨pI&þÔ\u0085áÀ<\u0092r\u0089Øt{\u009fH|\u008eA\u0092\u000fEÚ÷CÚ\u0010B»¢eÑWËµ`L\u009f\u001d\u0082\u008eé\u0099\u0010·=dÌÒ¢hP±VÂßÄÅñ\u001e(! &Ï¿=B\u0085È\u0087ªp¤\u0018¾*»Ïx\u0095%y¨¬ÙZ\u0014\u0093*o<³\u0003\u001d\u0081ø~Ý!\u008a\u0010\u001dhÊ¹> \u001aS1\fÞ-@G96\u00184!7O·\u0098\u001bEiù\u0001\u0091Ââ»\u0091HT[\u008e\u001c?¶)\u0018´f\u009bn\u009dµê§\u0096§\u001e5þÙù\u009cÈ\u00adÅW²;\u008a\u0001\u0010ð%9Ä\u009e\u0005\t;y\u009e*ïnÂ£Z\u0010f¯0\u008c\t\u0096Xl_À ¼\u0092?ru8\u0019ø\u0092\u008c\u009d³¢Üg\u001fm\u0081ÙÞ\u0091n¤¨#;ÛW=\u0084iÔT?ðº=£\u0081ÃA_Ônø\u000f9U»\u0015\u009fº\u0002Òn|DÄëñ\u0000\u00ad(\u001aî«mR)\u00adùÃø \u0000\u009aÂ~\u001d\u0011\u0087ÄÌÃÎú\u008a\u009f3:ºñã.\u009am°ÐH\tº!Ã\u0010d\u0098\u0086NW\u0096\u0099K\u0014§\u0010t'Í\u009f\u009f(;\u008b5\u008fî\u0084\u0007\u0010Ch\u0014n\u0095=å× :_µQL³Or\u0096\u0002\\Å\u0093YZÿI5\tyð½\u009e\u0010ù ÕZ<*õl\u007f+\u001c\u0096Á&Ñ& F\u0092é\u0087ì\u0005GªÈòÅcåuJ*Ó-\u00ad\u001f\u0090Å»\u0088·\u0007µ\u0094[´ÐX(´\u0003£¥O¡\u0084h\u0000\u0084\u0088î\u009a£}\u000bW\u009c~m\u0013RÌÑ¶\u0011h\u0083s7Í\u001160@þ¶ëÏJ\u0010\u0006°\u00ad4êÕþ°ê\u000b¬ù\u0089,Ej I\u007f4ÒúÎ2\f\u0000Ýi±Q»ú«Fk½âR\u000e\\\nÑ\\ô»D¿ßù\u0010õW.\u0019Æu\"Þ±6ú)E\u00109Æ".length();
      char var25 = 16;
      int var35 = -1;

      label72:
      while(true) {
         ++var35;
         String var36 = var26.substring(var35, var35 + var25);
         int var10001 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var50;
                  if ((var35 += var25) >= var28) {
                     b = var29;
                     c = new String[25];
                     g = new HashMap(13);
                     Cipher var11;
                     Cipher var38 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var52 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                     }

                     var38.init(2, var52.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[14];
                     int var14 = 0;
                     String var15 = "\u0000Ã\u001a¼(eYòäá\u0004Ü\u0011\u0088í\u0018\u0095|µµÔ\u001c\u0005ã±(Î\\¦\u0003£4úN\u001eÀS\u000fñÀ\u0099÷\u0092«Õ\r£Î\u0083SD\u009dqõø\\H\"\u0007OVÉP\u0090¾¤Tµ\u0098´9\u0086oDrÂÜ\u0002UÇ\u000f\u0016{²Õù{\u0097\u008b\u0015\u0096Ý\u009c%âý";
                     int var16 = "\u0000Ã\u001a¼(eYòäá\u0004Ü\u0011\u0088í\u0018\u0095|µµÔ\u001c\u0005ã±(Î\\¦\u0003£4úN\u001eÀS\u000fñÀ\u0099÷\u0092«Õ\r£Î\u0083SD\u009dqõø\\H\"\u0007OVÉP\u0090¾¤Tµ\u0098´9\u0086oDrÂÜ\u0002UÇ\u000f\u0016{²Õù{\u0097\u008b\u0015\u0096Ý\u009c%âý".length();
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
                                    e = var17;
                                    f = new Integer[14];
                                    4k = true.x<invokedynamic>(29844, var31 ^ 7667825393147982993L);
                                    4D = true.x<invokedynamic>(4171, var31 ^ 979868078987792463L);
                                    j = new HashMap(13);
                                    Cipher var0;
                                    Cipher var40 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var55 = SecretKeyFactory.getInstance("DES");
                                    byte[] var60 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var60[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                                    }

                                    var40.init(2, var55.generateSecret(new DESKeySpec(var60)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "\u0010µ\u0081/ÛÀFtd\u0098Ã\u001d*\u0098\u0094{P\u001aÐ\u008bh>\u0089â";
                                    int var5 = "\u0010µ\u0081/ÛÀFtd\u0098Ã\u001d*\u0098\u0094{P\u001aÐ\u008bh>\u0089â".length();
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

                                    h = var6;
                                    i = new Long[3];
                                    9 = true.z<invokedynamic>(1063, var31 ^ 6329537673121915927L);
                                    4N = 6619725031781943625L.£<invokedynamic>(6619725031781943625L, var31);
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "É¶\u000etK\u0003Bà;Zï\u0017T¯\u0003\u0080";
                                 var16 = "É¶\u000etK\u0003Bà;Zï\u0017T¯\u0003\u0080".length();
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

                  var25 = var26.charAt(var35);
                  break;
               default:
                  var29[var27++] = var50;
                  if ((var35 += var25) < var28) {
                     var25 = var26.charAt(var35);
                     continue label72;
                  }

                  var26 = "j\u0004¦e¨ZAAò~µõ´\u009a\u0090\u0092\u0098[ù´½\tï\u009b Á¹ÕW»\u0097\r\u0000\u001aGITA/Êï\u0004MdÑØ¿)ü2i¼\u0097\"\fªà";
                  var28 = "j\u0004¦e¨ZAAò~µõ´\u009a\u0090\u0092\u0098[ù´½\tï\u009b Á¹ÕW»\u0097\r\u0000\u001aGITA/Êï\u0004MdÑØ¿)ü2i¼\u0097\"\fªà".length();
                  var25 = 24;
                  var35 = -1;
            }

            ++var35;
            var36 = var26.substring(var35, var35 + var25);
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

   private static native String a(int var0, long var1);

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

   private static native long c(int var0, long var1);

   private static long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (l[var4] != null) {
         return var4;
      } else {
         Object var5 = k[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 25;
               case 1 -> var10000 = 12;
               case 2 -> var10000 = 28;
               case 3 -> var10000 = 50;
               case 4 -> var10000 = 32;
               case 5 -> var10000 = 56;
               case 6 -> var10000 = 62;
               case 7 -> var10000 = 54;
               case 8 -> var10000 = 14;
               case 9 -> var10000 = 36;
               case 10 -> var10000 = 26;
               case 11 -> var10000 = 8;
               case 12 -> var10000 = 46;
               case 13 -> var10000 = 33;
               case 14 -> var10000 = 16;
               case 15 -> var10000 = 35;
               case 16 -> var10000 = 7;
               case 17 -> var10000 = 30;
               case 18 -> var10000 = 27;
               case 19 -> var10000 = 21;
               case 20 -> var10000 = 0;
               case 21 -> var10000 = 5;
               case 22 -> var10000 = 41;
               case 23 -> var10000 = 38;
               case 24 -> var10000 = 45;
               case 25 -> var10000 = 60;
               case 26 -> var10000 = 11;
               case 27 -> var10000 = 31;
               case 28 -> var10000 = 58;
               case 29 -> var10000 = 49;
               case 30 -> var10000 = 9;
               case 31 -> var10000 = 20;
               case 32 -> var10000 = 63;
               case 33 -> var10000 = 4;
               case 34 -> var10000 = 23;
               case 35 -> var10000 = 3;
               case 36 -> var10000 = 39;
               case 37 -> var10000 = 29;
               case 38 -> var10000 = 2;
               case 39 -> var10000 = 22;
               case 40 -> var10000 = 44;
               case 41 -> var10000 = 43;
               case 42 -> var10000 = 6;
               case 43 -> var10000 = 53;
               case 44 -> var10000 = 59;
               case 45 -> var10000 = 51;
               case 46 -> var10000 = 10;
               case 47 -> var10000 = 55;
               case 48 -> var10000 = 24;
               case 49 -> var10000 = 47;
               case 50 -> var10000 = 52;
               case 51 -> var10000 = 48;
               case 52 -> var10000 = 42;
               case 53 -> var10000 = 18;
               case 54 -> var10000 = 13;
               case 55 -> var10000 = 61;
               case 56 -> var10000 = 1;
               case 57 -> var10000 = 17;
               case 58 -> var10000 = 40;
               case 59 -> var10000 = 34;
               case 60 -> var10000 = 15;
               case 61 -> var10000 = 19;
               case 62 -> var10000 = 57;
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

            l[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static native void a();

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = k[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(l[var4]);
            k[var4] = var5;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     k[var4] = var13;
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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 251 && var8 != 'R' && var8 != 253 && var8 != 234) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'M') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 163) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 251) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'R') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 253) {
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

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);
}
