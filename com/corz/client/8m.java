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

public class 8m {
   public static final int 1;
   public static final int 8;
   private final Map 5;
   private long 0;
   public long 7;
   public long 9;
   public long 6;
   public long 2;
   public long 3;
   public long 4;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;
   private static final Object[] i;
   private static final String[] j;
   // $FF: synthetic field
   private static transient String ehkLtMiRcB;

   public _m/* $FF was: 8m*/(long var1) {
      var1 = a ^ var1;
      super();
      this.5 = new HashMap();
      this.ó<invokedynamic>(this, h, (long)"c", var1);
   }

   public 7f3 _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      this.È<invokedynamic>(this, (long)"c", var4).¥<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var4), (Long)var1[0].Ü<invokedynamic>((Long)var1[0], (long)"c", var4), (long)"c", var4);
   }

   public boolean _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 0d _/* $FF was: 9*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      Map var10000 = this.È<invokedynamic>(this, (long)"c", var4);
      return (0d)var10000.¥<invokedynamic>(var10000, (Long)var1[0].Ü<invokedynamic>((Long)var1[0], (long)"c", var4), (long)"c", var4);
   }

   public int _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.È<invokedynamic>(this, (long)"c", var2);
      return var10000.¥<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.È<invokedynamic>(this, (long)"c", var2).¥<invokedynamic>(this.È<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   private void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(8m.class, 622);
      a = s.a(594976304889755447L, 1766755866094980889L, MethodHandles.lookup().lookupClass()).a(30535463768792L);
      i = new Object[105];
      j = new String[105];
      a();
      d = new HashMap(13);
      long var16 = a ^ 10444842563890L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "Ýõ2\u0098g¼|ØÊ\u0012]ìÃïcT(Èµ'o\u009cì\u0085¦\u0016©\u009f\u0090ð£\u0084¸. ÜL\u0002Á;\u0002î'*2å\u001b]¯H\t³ä©9¹Ì(ý\u0097\u009e=ùxÎ¥e»\u008a\u000fÎ]¢§eãMáÐ\u001fd®©\u0015Þì³QØ7Ús/fTÜò>@\f\u0001b\u009f\u0010j]\bð2ZB\"zeusU\u000eÂí;Å\u001c\u0092Wæny\u0018\u0092\t\u0002\u0094äXý;pïíóýÖFTp¼\u0094U¼Gb2ÈÉ×qw\u00adOV\u001ar rEí\u009bîÜá-ù@\u001a\u0087äõ\u001f\u001a\u0098L\u0095þä%\u009eù$\u0005X\u0085\u0082\r`u(\b\u0015TÿP)AA\u0097ê;÷³\u009e¥\u008aV~]\u0089<Oµ\u0011¡r¾\u0091ê·L4÷\u0005U\u009f\u009b\u001e®ë £\u0092í\u0090/¦=É\u0002ìR1K¶±\"\u008dø\u000esP\u0080\u0084\u0081ç\u0014Íÿ\\¾¾>0hYçL8ã5¹ì\u008c ·®¯+\u0007m2+sX\u008cí¢\u009fÓ\u001f¾\u0087bìÍ8î:¶_þt\u009d\u000e$Ã\u0089Ê¾¼~àç^\u0092w\u0096p^\u0002<òÜ\u0097Î\u0086\u0016ðtôî§;/)1nù:®Ýï\u0089mN\u007f\u0015î\u001eÆ\u000b÷ïp0¥&¥*$ûFÝút(gf\u0084\u0012TQ\u0000\u009f6\u0019¶©\u009cÒ\u007fD=\u0086\u0090\u001dK6d\u009a\u0092\u0082×Ê±÷ÒÜOÁ4é\u001c\u0096G<\u0084÷dF\u008a\"WK\u009c\u009aâë\u0002¬m¾\u008dMJÀE¨7ü5áeµy\u009c*Cí\u0098C¢3\u0089hËUÌ\u0081%èw ç/ \u008fùÊ\u009a»\u0096h\u001b0S¿®}²L¸Û·æwë\u0091Ù\u0082m¾°D\u0089ØÔ÷L\u008fªLæ¡.kÌ\\«ÊwYJÆBmªmQytªà\u0000û^\u0000ÿJ\u0010,E\u0087j\u000b\u0093üB8R&Ô§Ý¥v\u0010B^\u0016LËÑßã0\u0018JÞ¹\u009aû<(\u001eïkdF;\u0019>Òr\r\u0091wCOSÄG\u001e.5«§\u0007;¸@3ú\u009csþcÒøÔ»³RÂ\u0018{;\u008c0y®Hn\u0089\b!qÓ`\u008a\u0006÷F£\u0001\u0095ÐÇ©(ù.ØÆ\"á\u008es´_/«¸\u0092\b¶Å&\u0084w½\u0015\u0016\u0085L\u0085ã\u0016lô\u008a¦©Ò6±Âõ§m";
      int var24 = "Ýõ2\u0098g¼|ØÊ\u0012]ìÃïcT(Èµ'o\u009cì\u0085¦\u0016©\u009f\u0090ð£\u0084¸. ÜL\u0002Á;\u0002î'*2å\u001b]¯H\t³ä©9¹Ì(ý\u0097\u009e=ùxÎ¥e»\u008a\u000fÎ]¢§eãMáÐ\u001fd®©\u0015Þì³QØ7Ús/fTÜò>@\f\u0001b\u009f\u0010j]\bð2ZB\"zeusU\u000eÂí;Å\u001c\u0092Wæny\u0018\u0092\t\u0002\u0094äXý;pïíóýÖFTp¼\u0094U¼Gb2ÈÉ×qw\u00adOV\u001ar rEí\u009bîÜá-ù@\u001a\u0087äõ\u001f\u001a\u0098L\u0095þä%\u009eù$\u0005X\u0085\u0082\r`u(\b\u0015TÿP)AA\u0097ê;÷³\u009e¥\u008aV~]\u0089<Oµ\u0011¡r¾\u0091ê·L4÷\u0005U\u009f\u009b\u001e®ë £\u0092í\u0090/¦=É\u0002ìR1K¶±\"\u008dø\u000esP\u0080\u0084\u0081ç\u0014Íÿ\\¾¾>0hYçL8ã5¹ì\u008c ·®¯+\u0007m2+sX\u008cí¢\u009fÓ\u001f¾\u0087bìÍ8î:¶_þt\u009d\u000e$Ã\u0089Ê¾¼~àç^\u0092w\u0096p^\u0002<òÜ\u0097Î\u0086\u0016ðtôî§;/)1nù:®Ýï\u0089mN\u007f\u0015î\u001eÆ\u000b÷ïp0¥&¥*$ûFÝút(gf\u0084\u0012TQ\u0000\u009f6\u0019¶©\u009cÒ\u007fD=\u0086\u0090\u001dK6d\u009a\u0092\u0082×Ê±÷ÒÜOÁ4é\u001c\u0096G<\u0084÷dF\u008a\"WK\u009c\u009aâë\u0002¬m¾\u008dMJÀE¨7ü5áeµy\u009c*Cí\u0098C¢3\u0089hËUÌ\u0081%èw ç/ \u008fùÊ\u009a»\u0096h\u001b0S¿®}²L¸Û·æwë\u0091Ù\u0082m¾°D\u0089ØÔ÷L\u008fªLæ¡.kÌ\\«ÊwYJÆBmªmQytªà\u0000û^\u0000ÿJ\u0010,E\u0087j\u000b\u0093üB8R&Ô§Ý¥v\u0010B^\u0016LËÑßã0\u0018JÞ¹\u009aû<(\u001eïkdF;\u0019>Òr\r\u0091wCOSÄG\u001e.5«§\u0007;¸@3ú\u009csþcÒøÔ»³RÂ\u0018{;\u008c0y®Hn\u0089\b!qÓ`\u008a\u0006÷F£\u0001\u0095ÐÇ©(ù.ØÆ\"á\u008es´_/«¸\u0092\b¶Å&\u0084w½\u0015\u0016\u0085L\u0085ã\u0016lô\u008a¦©Ò6±Âõ§m".length();
      char var21 = 16;
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var22.substring(var29, var29 + var21);
         int var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     b = var25;
                     c = new String[15];
                     g = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[12];
                     int var8 = 0;
                     String var9 = "L}\u0090\u001f`º?×\u0097²{Ñ:f\u001eù1Ð\u0095\u008e`\u0080gøÎ\u0091µ\u001bD¯Õ\u00830k\nÛé\\\u0010îa#n\u0097\u0080Xø\u0080¬~Ç\u0096\u001dñ¬ÑcN\u000fÙ\u0011{\u0084ëk9\u0015\u0092Ù\u0082\u0016\u0090\u0019ymÖÑ÷\"%";
                     int var10 = "L}\u0090\u001f`º?×\u0097²{Ñ:f\u001eù1Ð\u0095\u008e`\u0080gøÎ\u0091µ\u001bD¯Õ\u00830k\nÛé\\\u0010îa#n\u0097\u0080Xø\u0080¬~Ç\u0096\u001dñ¬ÑcN\u000fÙ\u0011{\u0084ëk9\u0015\u0092Ù\u0082\u0016\u0090\u0019ymÖÑ÷\"%".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var52 = -1;

                        while(true) {
                           long var13 = var46;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var55 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    e = var11;
                                    f = new Integer[12];
                                    8 = true.g<invokedynamic>(16775, var16 ^ 3707391392202506299L);
                                    1 = true.g<invokedynamic>(28706, var16 ^ 4898032019981562256L);
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = -1731250823565985479L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var49 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    h = var49;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "ç®\u0004\u009cûÎ\u001aÎ\u001bKHð\u0090òÅ\u009e";
                                 var10 = "ç®\u0004\u009cûÎ\u001aÎ\u001bKHð\u0090òÅ\u009e".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "\u009f&°\u0014§\u0082\u001b\u001c\u0083M5Í\u001f'Î\u0082\u009c==\u001b\u000båaÊ\u0006\u0013|\u0011\u0099ñ1V¼¦á\u0015Èo\u0006¿,dÙ\u007fW\u008bÂÅ y^Äû®ª¤¨ò\u009f\u008d!iàiÒ³À/]=Nñ14B©½³UÖ=";
                  var24 = "\u009f&°\u0014§\u0082\u001b\u001c\u0083M5Í\u001f'Î\u0082\u009c==\u001b\u000båaÊ\u0006\u0013|\u0011\u0099ñ1V¼¦á\u0015Èo\u0006¿,dÙ\u007fW\u008bÂÅ y^Äû®ª¤¨ò\u009f\u008d!iàiÒ³À/]=Nñ14B©½³UÖ=".length();
                  var21 = '0';
                  var29 = -1;
            }

            ++var29;
            var30 = var22.substring(var29, var29 + var21);
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

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = i;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      j[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Boolean.TYPE;
      j[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Integer.TYPE;
      j[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = Void.TYPE;
      j[14] = "c";
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
      var10000[99] = "c";
      var10000[100] = "c";
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
   }

   private static native Class b(long var0, long var2);

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
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     i[var4] = var13;
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
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var26;
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
                     i[var4] = var19;
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
         if (var8 != 200 && var8 != 243 && var8 != 237 && var8 != '$') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 165) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 220) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 200) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 243) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 237) {
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
