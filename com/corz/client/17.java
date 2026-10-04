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
import net.minecraft.class_2561;

public class 17 extends 9a {
   private static final String[] 9;
   private static final String[] 8;
   private static final String[] 3;
   private static final String[] 6;
   private static final String[] 2;
   private final 4b 7;
   private final 44 5;
   private final 4b 25;
   private final 44 2D;
   private final 4b 2e;
   private final 44 24;
   private final 4b 2P;
   private final 44 23;
   private final 4b 2X;
   private final 44 2u;
   private final 4H 2L;
   private final 4H 29;
   private final 4H 1;
   private String 2Z;
   private double 2Y;
   private int 0;
   private int 2p;
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
   private static transient String qbJUdPMmWP;

   public _7/* $FF was: 17*/(int param1, short param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public class_2561 _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public class_2561 _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_2561 _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private class_2561 _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static String _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(17.class, 386);
      b = com.corz.client.s.a(-1136642963858840626L, 1862480652458296119L, MethodHandles.lookup().lookupClass()).a(232766874453982L);
      long var20 = b ^ 4135327681330L;
      o = new Object[115];
      p = new String[115];
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
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "V-rYçLA\u009dAún\u008aUä$¢\u0010Ý§Ä#$·m÷åN\u0000\u0084\u0085\u0004\u0003j\u0010iû1¶Æ\u0084\u001a\u001aOÙK÷Ù`9n\u0010¾Ã\u0094\u009c$nLÜ§Ã÷I^vû8\u0010Ô\f\u007f\u0017:cþXþ\u0087SË:{\u0086\u0082\u0010\u009fo<vXÅî\u0098GKså\u0085;Á\u0011 \u0087\u0019y§<û\u0086Ó\u009d¶×ýq\b\u001c\u008dý\b\u0013\u0002îÔF\u0004Û¸\u009c?6¿\u0011ì\u0018âyÓ`|\u0084\u001f\u0081cõ\u0001°b\u008b\u009dÁ\u0099)î\u0085\u0086\u0001L\u009e\u0018pm·QR_\u0084ï6\u0007jÑ\u008fl\r%\u0018_}±¾ª@a\u0010áþÐý[ Wl?¨b\u008egfæI\u0010¢\u0019\u0091\u0084¤éÈ\u000bb\u0017÷Îtà¯é\u0010Ò²P>?\u001füWt½ù\u0082½ AÀ\u0010\u0012\u00821njk¡Í\u0097\u0011FPæM\u0012®\u0010\u008c\u0005W\u0003\u0003r®\n/\u00960I\u008a±<10Pü1D9ö9lêÉ£\u001c\u0096\u009fz\u008e3ý\u008c\u009f\u0093ÿ\u0017Ô0\u008aß©\u000b1þÄ\by\u001a?ñr\u009dA\\JM\u008aç\u0084\u008d\u0013";
      int var17 = "V-rYçLA\u009dAún\u008aUä$¢\u0010Ý§Ä#$·m÷åN\u0000\u0084\u0085\u0004\u0003j\u0010iû1¶Æ\u0084\u001a\u001aOÙK÷Ù`9n\u0010¾Ã\u0094\u009c$nLÜ§Ã÷I^vû8\u0010Ô\f\u007f\u0017:cþXþ\u0087SË:{\u0086\u0082\u0010\u009fo<vXÅî\u0098GKså\u0085;Á\u0011 \u0087\u0019y§<û\u0086Ó\u009d¶×ýq\b\u001c\u008dý\b\u0013\u0002îÔF\u0004Û¸\u009c?6¿\u0011ì\u0018âyÓ`|\u0084\u001f\u0081cõ\u0001°b\u008b\u009dÁ\u0099)î\u0085\u0086\u0001L\u009e\u0018pm·QR_\u0084ï6\u0007jÑ\u008fl\r%\u0018_}±¾ª@a\u0010áþÐý[ Wl?¨b\u008egfæI\u0010¢\u0019\u0091\u0084¤éÈ\u000bb\u0017÷Îtà¯é\u0010Ò²P>?\u001füWt½ù\u0082½ AÀ\u0010\u0012\u00821njk¡Í\u0097\u0011FPæM\u0012®\u0010\u008c\u0005W\u0003\u0003r®\n/\u00960I\u008a±<10Pü1D9ö9lêÉ£\u001c\u0096\u009fz\u008e3ý\u008c\u009f\u0093ÿ\u0017Ô0\u008aß©\u000b1þÄ\by\u001a?ñr\u009dA\\JM\u008aç\u0084\u008d\u0013".length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var15.substring(var24, var24 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     f = var18;
                     g = new String[17];
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[25];
                     int var3 = 0;
                     String var4 = "=[\u009d\u0003\u000e«Þì\u009dÚ\u000e` 0rQSë§lÖp¾eññÆk|öºÜxt\u008eÂryñ5è\u00825\u000e\nå\u0084\f\u0010ë\u0081:Ù\u009fÃKG¢m\u0017d¼ìs\u0005ÿß(þ\u0088\u0001¥£æH9Åq\u000b[2\u0016½*dÀ\u0017u½ç©`\u0081B\u0011\u0092Íêbµ²ÒÒ\u0081 \u00adx³B\u001dw\u008c¡·Bª\u0007®\u0085m\u0090Ï°\u0098\u001c\u0089m\u0003\u0084oz\rËë@«1ò\u0094\u0083P\u0003Ê\u001bÊ\u0099¸ÉW\u008e÷\u0095Ð¸Àw~<1&à \u0087S\u0089è¶ÎçA$\nö5ÜïÅo\u008aü\tP=H";
                     int var5 = "=[\u009d\u0003\u000e«Þì\u009dÚ\u000e` 0rQSë§lÖp¾eññÆk|öºÜxt\u008eÂryñ5è\u00825\u000e\nå\u0084\f\u0010ë\u0081:Ù\u009fÃKG¢m\u0017d¼ìs\u0005ÿß(þ\u0088\u0001¥£æH9Åq\u000b[2\u0016½*dÀ\u0017u½ç©`\u0081B\u0011\u0092Íêbµ²ÒÒ\u0081 \u00adx³B\u001dw\u008c¡·Bª\u0007®\u0085m\u0090Ï°\u0098\u001c\u0089m\u0003\u0084oz\rËë@«1ò\u0094\u0083P\u0003Ê\u001bÊ\u0099¸ÉW\u008e÷\u0095Ð¸Àw~<1&à \u0087S\u0089è¶ÎçA$\nö5ÜïÅo\u008aü\tP=H".length();
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
                                    l = var6;
                                    m = new Integer[25];
                                    9 = new String[]{true.m<invokedynamic>(32622, 2599570714401822470L ^ var20), true.m<invokedynamic>(29724, 5289975151589088374L ^ var20), true.m<invokedynamic>(10927, 1499692546767553217L ^ var20), true.m<invokedynamic>(4597, 1410010036217821590L ^ var20)};
                                    8 = new String[]{true.m<invokedynamic>(22708, 3981593052466311384L ^ var20)};
                                    3 = new String[]{true.m<invokedynamic>(23861, 5269006638652028240L ^ var20)};
                                    6 = new String[]{true.m<invokedynamic>(1099, 4913497997725346863L ^ var20)};
                                    2 = new String[]{true.m<invokedynamic>(87, 8866273219669534752L ^ var20), true.m<invokedynamic>(20822, 907529098812848441L ^ var20), true.m<invokedynamic>(15833, 4303067506060596665L ^ var20), true.m<invokedynamic>(12427, 1285059817381173472L ^ var20)};
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "J\u007fe\"7eßÁY(l\u0013é\u009b\u0088è";
                                 var5 = "J\u007fe\"7eßÁY(l\u0013é\u009b\u0088è".length();
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

                  var15 = "ob\u0094ºÝëÂùªíE)aùÅ< a\\þ\u009f!ß\u0017/\u008c\u001dÍþ\u0002\t\u009fß2%ú\u0007:ùð>Ù\u0001]óäS\u001dó";
                  var17 = "ob\u0094ºÝëÂùªíE)aùÅ< a\\þ\u009f!ß\u0017/\u008c\u001dÍþ\u0002\t\u009fß2%ú\u0007:ùð>Ù\u0001]óäS\u001dó".length();
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
               case 0 -> var10000 = 23;
               case 1 -> var10000 = 41;
               case 2 -> var10000 = 46;
               case 3 -> var10000 = 56;
               case 4 -> var10000 = 25;
               case 5 -> var10000 = 24;
               case 6 -> var10000 = 52;
               case 7 -> var10000 = 58;
               case 8 -> var10000 = 63;
               case 9 -> var10000 = 26;
               case 10 -> var10000 = 45;
               case 11 -> var10000 = 5;
               case 12 -> var10000 = 31;
               case 13 -> var10000 = 48;
               case 14 -> var10000 = 7;
               case 15 -> var10000 = 33;
               case 16 -> var10000 = 1;
               case 17 -> var10000 = 50;
               case 18 -> var10000 = 37;
               case 19 -> var10000 = 32;
               case 20 -> var10000 = 44;
               case 21 -> var10000 = 47;
               case 22 -> var10000 = 43;
               case 23 -> var10000 = 13;
               case 24 -> var10000 = 0;
               case 25 -> var10000 = 54;
               case 26 -> var10000 = 49;
               case 27 -> var10000 = 53;
               case 28 -> var10000 = 12;
               case 29 -> var10000 = 60;
               case 30 -> var10000 = 15;
               case 31 -> var10000 = 62;
               case 32 -> var10000 = 19;
               case 33 -> var10000 = 29;
               case 34 -> var10000 = 51;
               case 35 -> var10000 = 4;
               case 36 -> var10000 = 57;
               case 37 -> var10000 = 11;
               case 38 -> var10000 = 55;
               case 39 -> var10000 = 9;
               case 40 -> var10000 = 22;
               case 41 -> var10000 = 18;
               case 42 -> var10000 = 59;
               case 43 -> var10000 = 14;
               case 44 -> var10000 = 6;
               case 45 -> var10000 = 34;
               case 46 -> var10000 = 36;
               case 47 -> var10000 = 28;
               case 48 -> var10000 = 27;
               case 49 -> var10000 = 39;
               case 50 -> var10000 = 38;
               case 51 -> var10000 = 35;
               case 52 -> var10000 = 42;
               case 53 -> var10000 = 16;
               case 54 -> var10000 = 8;
               case 55 -> var10000 = 3;
               case 56 -> var10000 = 2;
               case 57 -> var10000 = 61;
               case 58 -> var10000 = 17;
               case 59 -> var10000 = 40;
               case 60 -> var10000 = 20;
               case 61 -> var10000 = 21;
               case 62 -> var10000 = 10;
               default -> var10000 = 30;
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

   private static void b() {
      Object[] var10000 = o;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Boolean.TYPE;
      p[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Void.TYPE;
      p[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = Double.TYPE;
      p[21] = "c";
      var10000[22] = "c";
      var10000[23] = Integer.TYPE;
      p[23] = "c";
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
   }

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

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = o[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = p[var4];
         int var7 = var6.indexOf(8);
         Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
         ++var7;
         int var9 = var6.indexOf(8, var7);
         String var10 = var6.substring(var7, var9);
         ++var9;
         Class var11 = f(Long.parseLong(var6.substring(var9), 36), 0L);
         Class var12 = var8;

         while(true) {
            Field var13 = c(var12, var10, var11);
            if (var13 != null) {
               o[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     o[var4] = var13;
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
               var12 = f((long)"c", 0L);
            }
         }
      }
   }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

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

   private static native Method h(long var0, long var2);

   private static MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 219 && var8 != 'h' && var8 != 'Q' && var8 != 229) {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 226) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 216) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 219) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'h') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'Q') {
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

   private static Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = b(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

   private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);
}
