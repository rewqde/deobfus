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

public class 7O7 {
   public static final int 5;
   public static final int 3;
   public static final int 9;
   public static final int 4;
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
   private static transient String zJwVXQIvQb;

   private _O7/* $FF was: 7O7*/() {
   }

   public static boolean _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static String _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7O7.class, 592);
      a = s.a(-3972943671750616951L, -4925332969647991200L, MethodHandles.lookup().lookupClass()).a(189923535838734L);
      h = new Object[22];
      i = new String[22];
      a();
      d = new HashMap(13);
      long var11 = a ^ 8919848632590L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[27];
      int var18 = 0;
      String var17 = "+\u001cµÜ$Z.HZÊØ\u0001ª\u0000\u0098[\u0010Bö\u0094\u0092\u001f\u0095\u0085³Y¥ýdÍ÷Á;\u0010\u0011ÜØiÆ3²Ô\u0015\u0004¨Ùb\u0010Á³\u0010¼¿Õxä\u008c\u0082fÜæÙZ9O«å\u0010\u007f\u0080Ä\u008dÔ\u008cÍÉQ:#7þBU'\u0010Y·\u0094/\\$Z\u0084\u0006\u001dH\u0090{MÒ#\u0010\u009a\u0097-Í\u008e¿µ° ep\u009f!S°> E\u000e\u0000yÌû\u0006Äæ\u0016\bJ5ùWXV!²áMÌÆHHéÜ\u009b>H®J\u0010%ìóLö\u009cUR\n\u0012\u008fDO£«\u008b\u00108»°È½L7ï\u0014\u0006Êßt\u001f\t×\u0010Z\u008b\u007f\u0080\u009d\\ãõ¡\u0094¥íÍ\u00148 \u0010\u0086\u0096\u008ekß¡RÓÆ\u0011HT¬uT\u001f\u0010Ö$Óu'd)\u009c\u001fÍÒbÞÜ\u0012½\u0010àJ9µ\u0015>?ælçW\u0081÷\u0001Ëæ\u0010\u000b6Æ¦´ëíA\u0085¹ßþ['\fþ\u0010 v\u009dS\u0081<áéÍØ¬\u009eÉ\u0014b\u001b\u0010¥¦\u0090¦È,gvÓyÖÃt\rñ\u0091\u0010\u0005\u00050SÀ\\\u0087\u0019\u0015Ûo\u0004xì\u0091u\u0010+.@P·V\u001cÎ\u009a|;õËÞ6ß\u00101]vÃMÛ\u0010<Eö\u0091\u008d\u0012»\u0091\u0010\u0010êc:\u0083C#H40÷\u0081ñUÂdw\u0010Êjñvï\u0081\u001eý\u0085MH0\u0094û÷4\u0010\u000e[8=¤Ét?m\u0005é\u001b\u0087*\u0019\\ Ã¡Ã»ò\u0087\u0092è\u008exgÑc(\u001cûã£Ò ¬ÐÁCíu½,â5\u008f§\u0010 \u009cIýß£÷¿\u0091À<óMâ\u0092\u0013";
      int var19 = "+\u001cµÜ$Z.HZÊØ\u0001ª\u0000\u0098[\u0010Bö\u0094\u0092\u001f\u0095\u0085³Y¥ýdÍ÷Á;\u0010\u0011ÜØiÆ3²Ô\u0015\u0004¨Ùb\u0010Á³\u0010¼¿Õxä\u008c\u0082fÜæÙZ9O«å\u0010\u007f\u0080Ä\u008dÔ\u008cÍÉQ:#7þBU'\u0010Y·\u0094/\\$Z\u0084\u0006\u001dH\u0090{MÒ#\u0010\u009a\u0097-Í\u008e¿µ° ep\u009f!S°> E\u000e\u0000yÌû\u0006Äæ\u0016\bJ5ùWXV!²áMÌÆHHéÜ\u009b>H®J\u0010%ìóLö\u009cUR\n\u0012\u008fDO£«\u008b\u00108»°È½L7ï\u0014\u0006Êßt\u001f\t×\u0010Z\u008b\u007f\u0080\u009d\\ãõ¡\u0094¥íÍ\u00148 \u0010\u0086\u0096\u008ekß¡RÓÆ\u0011HT¬uT\u001f\u0010Ö$Óu'd)\u009c\u001fÍÒbÞÜ\u0012½\u0010àJ9µ\u0015>?ælçW\u0081÷\u0001Ëæ\u0010\u000b6Æ¦´ëíA\u0085¹ßþ['\fþ\u0010 v\u009dS\u0081<áéÍØ¬\u009eÉ\u0014b\u001b\u0010¥¦\u0090¦È,gvÓyÖÃt\rñ\u0091\u0010\u0005\u00050SÀ\\\u0087\u0019\u0015Ûo\u0004xì\u0091u\u0010+.@P·V\u001cÎ\u009a|;õËÞ6ß\u00101]vÃMÛ\u0010<Eö\u0091\u008d\u0012»\u0091\u0010\u0010êc:\u0083C#H40÷\u0081ñUÂdw\u0010Êjñvï\u0081\u001eý\u0085MH0\u0094û÷4\u0010\u000e[8=¤Ét?m\u0005é\u001b\u0087*\u0019\\ Ã¡Ã»ò\u0087\u0092è\u008exgÑc(\u001cûã£Ò ¬ÐÁCíu½,â5\u008f§\u0010 \u009cIýß£÷¿\u0091À<óMâ\u0092\u0013".length();
      char var16 = 16;
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
                     c = new String[27];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "½À£×\u0016Ù\u0006\u00981KOì!Ðz¬¹¿\u000b.¹\u009aC\u0099U.¤o*\u0005B `÷N/¢J\u0000x¢JV\fÜk\u0086\u0012\u0087ù\u0098\u0096þ\u0090W¿¦\u0082xÀÛ¶\"Å×d\u001eÿ\u0086Fø\u0094ªZÄm\u0084\u0004äB";
                     int var5 = "½À£×\u0016Ù\u0006\u00981KOì!Ðz¬¹¿\u000b.¹\u009aC\u0099U.¤o*\u0005B `÷N/¢J\u0000x¢JV\fÜk\u0086\u0012\u0087ù\u0098\u0096þ\u0090W¿¦\u0082xÀÛ¶\"Å×d\u001eÿ\u0086Fø\u0094ªZÄm\u0084\u0004äB".length();
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
                                    f = new Integer[12];
                                    3 = true.j<invokedynamic>(24435, var11 ^ 2138764865581682121L);
                                    4 = true.j<invokedynamic>(10505, var11 ^ 382497432767626160L);
                                    5 = true.j<invokedynamic>(17901, var11 ^ 7839534155583756124L);
                                    9 = true.j<invokedynamic>(12735, var11 ^ 6362725364333830925L);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u008c¡\u0088º\u0003\u0099\u00059\"¨²\u008eöüª6";
                                 var5 = "\u008c¡\u0088º\u0003\u0099\u00059\"¨²\u008eöüª6".length();
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

                  var17 = "\b#¤e\u001c¨S/9îÆQ\u0018Ø\u0084Ç\u0010y\u0080åè¢\u000bôÇeÁ\u008e\u008a'Ò¥É";
                  var19 = "\b#¤e\u001c¨S/9îÆQ\u0018Ø\u0084Ç\u0010y\u0080åè¢\u000bôÇeÁ\u008e\u008a'Ò¥É".length();
                  var16 = 16;
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

   private static native String a(byte[] var0);

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

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static int b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 0 -> var10000 = 32;
               case 1 -> var10000 = 44;
               case 2 -> var10000 = 57;
               case 3 -> var10000 = 3;
               case 4 -> var10000 = 5;
               case 5 -> var10000 = 52;
               case 6 -> var10000 = 7;
               case 7 -> var10000 = 56;
               case 8 -> var10000 = 36;
               case 9 -> var10000 = 24;
               case 10 -> var10000 = 37;
               case 11 -> var10000 = 16;
               case 12 -> var10000 = 1;
               case 13 -> var10000 = 48;
               case 14 -> var10000 = 0;
               case 15 -> var10000 = 60;
               case 16 -> var10000 = 55;
               case 17 -> var10000 = 10;
               case 18 -> var10000 = 40;
               case 19 -> var10000 = 50;
               case 20 -> var10000 = 12;
               case 21 -> var10000 = 14;
               case 22 -> var10000 = 6;
               case 23 -> var10000 = 54;
               case 24 -> var10000 = 34;
               case 25 -> var10000 = 19;
               case 26 -> var10000 = 33;
               case 27 -> var10000 = 49;
               case 28 -> var10000 = 4;
               case 29 -> var10000 = 26;
               case 30 -> var10000 = 13;
               case 31 -> var10000 = 15;
               case 32 -> var10000 = 31;
               case 33 -> var10000 = 62;
               case 34 -> var10000 = 35;
               case 35 -> var10000 = 9;
               case 36 -> var10000 = 23;
               case 37 -> var10000 = 42;
               case 38 -> var10000 = 58;
               case 39 -> var10000 = 47;
               case 40 -> var10000 = 38;
               case 41 -> var10000 = 43;
               case 42 -> var10000 = 17;
               case 43 -> var10000 = 61;
               case 44 -> var10000 = 39;
               case 45 -> var10000 = 2;
               case 46 -> var10000 = 59;
               case 47 -> var10000 = 25;
               case 48 -> var10000 = 30;
               case 49 -> var10000 = 22;
               case 50 -> var10000 = 28;
               case 51 -> var10000 = 53;
               case 52 -> var10000 = 29;
               case 53 -> var10000 = 51;
               case 54 -> var10000 = 27;
               case 55 -> var10000 = 63;
               case 56 -> var10000 = 46;
               case 57 -> var10000 = 41;
               case 58 -> var10000 = 18;
               case 59 -> var10000 = 20;
               case 60 -> var10000 = 21;
               case 61 -> var10000 = 8;
               case 62 -> var10000 = 45;
               default -> var10000 = 11;
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
      var10000[1] = Boolean.TYPE;
      i[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Integer.TYPE;
      i[5] = "c";
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
         if (var8 != 163 && var8 != 238 && var8 != 212 && var8 != 236) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'z') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'j') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 163) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 238) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 212) {
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

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

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
