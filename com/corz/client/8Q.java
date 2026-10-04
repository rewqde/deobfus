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
import net.minecraft.class_2960;

public class 8q {
   private static final int 77;
   private static final int 78;
   private static final int 9;
   private static final int 7T;
   private static final int 8;
   private static final int 4;
   private static final int 7a;
   private static final int 7;
   private static final int 7W;
   private static final class_2960 76;
   private static final class_2960 0;
   private static final int 7k;
   private static final int 1;
   private static final boolean 7m;
   private final int 7A;
   private final int 7P;
   private final int 3;
   private final int 7t;
   private String 74;
   private boolean 6;
   private boolean 7q;
   private final 7C 2;
   private boolean 7L;
   private final 7TT 7J;
   private final 7TT 7R;
   private final 7TT 5;
   private static final long a = s.a(-512106605955437568L, 812173403599336922L, MethodHandles.lookup().lookupClass()).a(232348649231999L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String tVJzGtkBxo;

   public _q/* $FF was: 8q*/(int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static int _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.ð<invokedynamic>(this, (long)"c", var2);
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.ð<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 5296280789685L;
      h = new Object[124];
      i = new String[124];
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
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "\u0002\u009d`ÁuòZ6%\u0004ñÉ\u0087_d6\u0016×{©jLP·`:É\u00837\u0005Ép_\u0011ìæ\u009e;Z³1È4Ê¬ÄS\u0088yp\"úKþÀt æ\u0082&(\"\u0088i&±9\u008b9\u001aTê\u0089\u0018ý1\u009c-Ä\u0090\u0085I\u0018QÊ^ÜRµ(o±1È«\u0006÷ËìÏ²Ë\u0089\u009dò\u0084\u0093»©\u0007\u0014ðâ\u0091kæ%MÑ®¥4ú¢S«\u0014`ªû0R\u0016\u008f\u0098\u0016u$\u001b\u0089ö\u000e\u009a\f\u0099~â\u009e¼æ\u0099ÒñîÍET\u0094Á\u0006ì±:\tÍQ\u0082Ë8Æì%\u0086Æ\u0011âß\u0013Ý\u0010V\u008e\u0091&ËÄ\tv¤7ðæ\u0000\u0015ÝÑ";
      int var17 = "\u0002\u009d`ÁuòZ6%\u0004ñÉ\u0087_d6\u0016×{©jLP·`:É\u00837\u0005Ép_\u0011ìæ\u009e;Z³1È4Ê¬ÄS\u0088yp\"úKþÀt æ\u0082&(\"\u0088i&±9\u008b9\u001aTê\u0089\u0018ý1\u009c-Ä\u0090\u0085I\u0018QÊ^ÜRµ(o±1È«\u0006÷ËìÏ²Ë\u0089\u009dò\u0084\u0093»©\u0007\u0014ðâ\u0091kæ%MÑ®¥4ú¢S«\u0014`ªû0R\u0016\u008f\u0098\u0016u$\u001b\u0089ö\u000e\u009a\f\u0099~â\u009e¼æ\u0099ÒñîÍET\u0094Á\u0006ì±:\tÍQ\u0082Ë8Æì%\u0086Æ\u0011âß\u0013Ý\u0010V\u008e\u0091&ËÄ\tv¤7ðæ\u0000\u0015ÝÑ".length();
      char var14 = '8';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var15.substring(var24, var24 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var39 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var39;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var41 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var41.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[45];
                     int var3 = 0;
                     String var4 = "\fùÐ\ny]\t\u0084ô^\u0000OqÜ9Ü¼ÙðK]\u0019J\u0010)\u0014 ]ª+zs®\u0089L¹ù¤p=è\u0005\u001fz©\u0003!Â.DÆ\fÊÈSG6 5¶k8£ RÈ±&v1lý\u0086~î'\u0087\u000b\u0088X7DÙpÌë\u000bºÚ{ÄÉ\u008b\u0082¬¯ô·\u009a\u0086B¡u1Gñ\u0002(åE\u001a_\u0019 \u008e~e³º¤l´ý¬ûH+Jßl9QØìÑá;Ä@\u009bù\u0004NÍ\u0095+a©.æØ\u0017\u0090ÎéGU¾¶\u008e\u0092¨~ávg|P<.0\u00825Æy.}¦àS±\u0080\u001a\u0016Vk{\u0019ß§{\fàìègAþÒ@Ö\u0085âB\u001ao¶\f´îßÿ\u009dò~Ýëÿ³X¼Jë\u0084ríNid©?¿¼\"5]>ÁÏý\u0095îZ\u0016uÿß#%½B\u0095ñ\u0010o»³÷,\u0081Dý\u009eZfUjÂè1ª\u000e¶\u0090\u0083ýâÆ)]ß0Úb\u0087M\u008aõáÖ8\u0085\u00adMU`#và\u0094Âù÷Ã\u008bAÿrÆÄ°3ÿ®LÒN¯Ûõú³¿T%@.DqYS×$\u001a\u007fCÓ\u0011\u001c8\u0093Ü>÷";
                     int var5 = "\fùÐ\ny]\t\u0084ô^\u0000OqÜ9Ü¼ÙðK]\u0019J\u0010)\u0014 ]ª+zs®\u0089L¹ù¤p=è\u0005\u001fz©\u0003!Â.DÆ\fÊÈSG6 5¶k8£ RÈ±&v1lý\u0086~î'\u0087\u000b\u0088X7DÙpÌë\u000bºÚ{ÄÉ\u008b\u0082¬¯ô·\u009a\u0086B¡u1Gñ\u0002(åE\u001a_\u0019 \u008e~e³º¤l´ý¬ûH+Jßl9QØìÑá;Ä@\u009bù\u0004NÍ\u0095+a©.æØ\u0017\u0090ÎéGU¾¶\u008e\u0092¨~ávg|P<.0\u00825Æy.}¦àS±\u0080\u001a\u0016Vk{\u0019ß§{\fàìègAþÒ@Ö\u0085âB\u001ao¶\f´îßÿ\u009dò~Ýëÿ³X¼Jë\u0084ríNid©?¿¼\"5]>ÁÏý\u0095îZ\u0016uÿß#%½B\u0095ñ\u0010o»³÷,\u0081Dý\u009eZfUjÂè1ª\u000e¶\u0090\u0083ýâÆ)]ß0Úb\u0087M\u008aõáÖ8\u0085\u00adMU`#và\u0094Âù÷Ã\u008bAÿrÆÄ°3ÿ®LÒN¯Ûõú³¿T%@.DqYS×$\u001a\u007fCÓ\u0011\u001c8\u0093Ü>÷".length();
                     int var2 = 0;

                     label36:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var42 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while(true) {
                           long var8 = var42;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           long var48 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var46) {
                              case 0:
                                 var28[var10001] = var48;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[45];
                                    78 = true.x<invokedynamic>(26867, var20 ^ 3003085689862927881L);
                                    9 = true.x<invokedynamic>(32568, var20 ^ 6184603113991184868L);
                                    4 = true.x<invokedynamic>(26788, var20 ^ 725479677037393533L);
                                    7k = true.x<invokedynamic>(25952, var20 ^ 4869145102928690098L);
                                    7 = true.x<invokedynamic>(26788, var20 ^ 725479677037393533L);
                                    1 = true.x<invokedynamic>(25952, var20 ^ 4869145102928690098L);
                                    7a = true.x<invokedynamic>(5904, var20 ^ 7374719340501518797L);
                                    77 = true.x<invokedynamic>(25240, var20 ^ 6511775184429825125L);
                                    7T = true.x<invokedynamic>(7072, var20 ^ 8065451279545156936L);
                                    8 = true.x<invokedynamic>(25240, var20 ^ 6511775184429825125L);
                                    7W = true.x<invokedynamic>(14145, var20 ^ 2218681650924317082L);
                                    String var29 = 27239.v<invokedynamic>(27239, 1423044928638502506L ^ var20);
                                    76 = var29.¢<invokedynamic>(var29, true.v<invokedynamic>(30303, 8959506298419665495L ^ var20), -8312447926713763835L, var20);
                                    var29 = 28678.v<invokedynamic>(28678, 510837439512108047L ^ var20);
                                    0 = var29.¢<invokedynamic>(var29, true.v<invokedynamic>(19594, 8892194807032832129L ^ var20), -8312447926713763835L, var20);
                                    var29 = true.v<invokedynamic>(18451, 5130674973111411743L ^ var20).¢<invokedynamic>(true.v<invokedynamic>(18451, 5130674973111411743L ^ var20), "", -8311241045463628648L, var20).ô<invokedynamic>(true.v<invokedynamic>(18451, 5130674973111411743L ^ var20).¢<invokedynamic>(true.v<invokedynamic>(18451, 5130674973111411743L ^ var20), "", -8311241045463628648L, var20), -8313264802515314957L.Ö<invokedynamic>(-8313264802515314957L, var20), -8311068493955558968L, var20);
                                    7m = var29.ô<invokedynamic>(var29, true.v<invokedynamic>(197, 3440273682850720971L ^ var20), -8312059609235695972L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var48;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\t<\u001bÃ0ø\b\nkZ¸*\u00001\u008d£";
                                 var5 = "\t<\u001bÃ0ø\b\nkZ¸*\u00001\u008d£".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var42 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var39;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "Lc\tC\u0002PlqýçË\u00142Q\u0082\u0017âÍæþm±\u0019Á\u0010õ\u0097Bp½¤ëfd>\u009bÒ;_\u000e\u001c";
                  var17 = "Lc\tC\u0002PlqýçË\u00142Q\u0082\u0017âÍæþm±\u0019Á\u0010õ\u0097Bp½¤ëfd>\u009bÒ;_\u000e\u001c".length();
                  var14 = 24;
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
               case 0 -> var10000 = 13;
               case 1 -> var10000 = 43;
               case 2 -> var10000 = 62;
               case 3 -> var10000 = 6;
               case 4 -> var10000 = 30;
               case 5 -> var10000 = 36;
               case 6 -> var10000 = 20;
               case 7 -> var10000 = 17;
               case 8 -> var10000 = 61;
               case 9 -> var10000 = 25;
               case 10 -> var10000 = 1;
               case 11 -> var10000 = 19;
               case 12 -> var10000 = 34;
               case 13 -> var10000 = 32;
               case 14 -> var10000 = 8;
               case 15 -> var10000 = 60;
               case 16 -> var10000 = 23;
               case 17 -> var10000 = 55;
               case 18 -> var10000 = 48;
               case 19 -> var10000 = 31;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 52;
               case 22 -> var10000 = 54;
               case 23 -> var10000 = 57;
               case 24 -> var10000 = 27;
               case 25 -> var10000 = 26;
               case 26 -> var10000 = 9;
               case 27 -> var10000 = 2;
               case 28 -> var10000 = 3;
               case 29 -> var10000 = 22;
               case 30 -> var10000 = 49;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 37;
               case 33 -> var10000 = 33;
               case 34 -> var10000 = 42;
               case 35 -> var10000 = 29;
               case 36 -> var10000 = 63;
               case 37 -> var10000 = 35;
               case 38 -> var10000 = 56;
               case 39 -> var10000 = 21;
               case 40 -> var10000 = 28;
               case 41 -> var10000 = 18;
               case 42 -> var10000 = 51;
               case 43 -> var10000 = 24;
               case 44 -> var10000 = 15;
               case 45 -> var10000 = 47;
               case 46 -> var10000 = 11;
               case 47 -> var10000 = 16;
               case 48 -> var10000 = 0;
               case 49 -> var10000 = 50;
               case 50 -> var10000 = 40;
               case 51 -> var10000 = 7;
               case 52 -> var10000 = 4;
               case 53 -> var10000 = 53;
               case 54 -> var10000 = 44;
               case 55 -> var10000 = 41;
               case 56 -> var10000 = 14;
               case 57 -> var10000 = 45;
               case 58 -> var10000 = 59;
               case 59 -> var10000 = 38;
               case 60 -> var10000 = 10;
               case 61 -> var10000 = 12;
               case 62 -> var10000 = 39;
               default -> var10000 = 46;
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
      var10000[5] = Boolean.TYPE;
      i[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Void.TYPE;
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
      var10000[19] = Double.TYPE;
      i[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = Integer.TYPE;
      i[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = "c";
      var10000[29] = "c";
      var10000[30] = "c";
      var10000[31] = "c";
      var10000[32] = "c";
      var10000[33] = "c";
      var10000[34] = Float.TYPE;
      i[34] = "c";
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
      var10000[49] = Long.TYPE;
      i[49] = "c";
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
         if (var8 != 240 && var8 != 'i' && var8 != 214 && var8 != 206) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 244) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 162) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 240) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'i') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 214) {
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
