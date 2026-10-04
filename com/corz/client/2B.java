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

public class 2b extends 9a {
   private final 4H 7;
   private final 4H 1;
   private final 4H 5;
   private final 4i 2;
   private Boolean 3;
   private Boolean 8;
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
   private static transient String EvNfDnzvJF;

   public _b/* $FF was: 2b*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   protected native void _U/* $FF was: 1U*/();

   protected void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(2b.class, 29);
      b = com.corz.client.s.a(-564422210627052864L, 1118246984947017744L, MethodHandles.lookup().lookupClass()).a(66916954678246L);
      o = new Object[60];
      p = new String[60];
      b();
      h = new HashMap(13);
      long var11 = b ^ 39946190696242L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[15];
      int var18 = 0;
      String var17 = "\u008b\u0093o,ËÏãV\\\u0094,\"\u0015¸,$?7Ü\u0014øfûá\rGbÒ³D\u0012r(f÷\b#[\u001e\u0019\u0001\u009e\u008fqO¶·&ï©¯d}(å¸f\u0011î\u0000(»yÄ3\u0089¯©]r&`\u0010 ®é%&&Òö\u0091ÃV\u0006$â'Á\u0007à\u0081.\u0013\u0095\u0014\u000f\u0011M4Öl\u001e×¡¯\u0010á²\u0084\u000fÒ\u0092;\u0015Hdµ\u0000Ú\u0015\u0006Ý(¸\u0016(7#Ãiv»Èæðkó¥gø¾\u0097\u009bÖ®õJønL@ùÌ}þ¤$O(Ò\u0001\u00adI(p>»È5>³\u0094\"<ÑÌ¸ªªÚ\u0082/¢ð³ÁÏë\u0003¾\u0016è\tQU@@\u0083\u0085òzÕ\u0001x\u0010«G\u0092S\u0088|Õ\tgWªÜ\u0095f\u0017\u0013\u0010Ä\u008cz\u001fw\u008c*Ig÷ï\u007fÿaÞ+0\u0098sfh»xºÑ\r\u001f§\u009f\u0085Idä;-Wc\u0010üëòMÙØ\u0086Ä4)I¡\fÍ8\u00964ÿ\u0082k|}\u0098qÉï¼ Q¤\u0007ÓìL\u0096i\u008eH:àð&ñ\u0095b4\u0011ÎV\\\u009btno~\u0013äh²\u008a L&ª\u001có´ú+õ¢¤hü,ÄËûb\u0007+@mk\bM\u0088w\u008d³@\u0094_\u0018£<pö±Ü¿û\u009a¡\n\u008e°j\u00006%\u0004A>ü\u0094\u0086\b\u0018\u000e\u0093Þ´\u0088Yù\u0082 ¤D*ö\u0098.}}\u0089hHdU¡S";
      int var19 = "\u008b\u0093o,ËÏãV\\\u0094,\"\u0015¸,$?7Ü\u0014øfûá\rGbÒ³D\u0012r(f÷\b#[\u001e\u0019\u0001\u009e\u008fqO¶·&ï©¯d}(å¸f\u0011î\u0000(»yÄ3\u0089¯©]r&`\u0010 ®é%&&Òö\u0091ÃV\u0006$â'Á\u0007à\u0081.\u0013\u0095\u0014\u000f\u0011M4Öl\u001e×¡¯\u0010á²\u0084\u000fÒ\u0092;\u0015Hdµ\u0000Ú\u0015\u0006Ý(¸\u0016(7#Ãiv»Èæðkó¥gø¾\u0097\u009bÖ®õJønL@ùÌ}þ¤$O(Ò\u0001\u00adI(p>»È5>³\u0094\"<ÑÌ¸ªªÚ\u0082/¢ð³ÁÏë\u0003¾\u0016è\tQU@@\u0083\u0085òzÕ\u0001x\u0010«G\u0092S\u0088|Õ\tgWªÜ\u0095f\u0017\u0013\u0010Ä\u008cz\u001fw\u008c*Ig÷ï\u007fÿaÞ+0\u0098sfh»xºÑ\r\u001f§\u009f\u0085Idä;-Wc\u0010üëòMÙØ\u0086Ä4)I¡\fÍ8\u00964ÿ\u0082k|}\u0098qÉï¼ Q¤\u0007ÓìL\u0096i\u008eH:àð&ñ\u0095b4\u0011ÎV\\\u009btno~\u0013äh²\u008a L&ª\u001có´ú+õ¢¤hü,ÄËûb\u0007+@mk\bM\u0088w\u008d³@\u0094_\u0018£<pö±Ü¿û\u009a¡\n\u008e°j\u00006%\u0004A>ü\u0094\u0086\b\u0018\u000e\u0093Þ´\u0088Yù\u0082 ¤D*ö\u0098.}}\u0089hHdU¡S".length();
      char var16 = ' ';
      int var24 = -1;

      label54:
      while(true) {
         ++var24;
         String var25 = var17.substring(var24, var24 + var16);
         int var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     f = var20;
                     g = new String[15];
                     n = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var38 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var38.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "Ó{\u001e9]RºÍ¤õÈ\u001erÕ.[";
                     int var5 = "Ó{\u001e9]RºÍ¤õÈ\u001erÕ.[".length();
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
                                    m = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "·úKjÎ\u0085\u0014gOÝë\u0088õ\u0083Ñ<";
                                 var5 = "·úKjÎ\u0085\u0014gOÝë\u0088õ\u0083Ñ<".length();
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

                  var17 = "Û\u0083p\u009e\u0096\u0080ä}ò\u0087Lrê[_JÉ\u0005Ì\u001f?½OÎ BùÐ\u009böçmqF^É9\u0090\u0093Ç\u0019L-|\u0019\u00136I\u0000QoÆ\u000b+\u009bÖ\u001e";
                  var19 = "Û\u0083p\u009e\u0096\u0080ä}ò\u0087Lrê[_JÉ\u0005Ì\u001f?½OÎ BùÐ\u009böçmqF^É9\u0090\u0093Ç\u0019L-|\u0019\u00136I\u0000QoÆ\u000b+\u009bÖ\u001e".length();
                  var16 = 24;
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

   private static native String b(int var0, long var1);

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

   private static native int d(int var0, long var1);

   private static int d(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 36;
               case 1 -> var10000 = 2;
               case 2 -> var10000 = 4;
               case 3 -> var10000 = 56;
               case 4 -> var10000 = 32;
               case 5 -> var10000 = 29;
               case 6 -> var10000 = 61;
               case 7 -> var10000 = 44;
               case 8 -> var10000 = 21;
               case 9 -> var10000 = 25;
               case 10 -> var10000 = 40;
               case 11 -> var10000 = 8;
               case 12 -> var10000 = 63;
               case 13 -> var10000 = 17;
               case 14 -> var10000 = 12;
               case 15 -> var10000 = 34;
               case 16 -> var10000 = 39;
               case 17 -> var10000 = 6;
               case 18 -> var10000 = 37;
               case 19 -> var10000 = 52;
               case 20 -> var10000 = 50;
               case 21 -> var10000 = 33;
               case 22 -> var10000 = 1;
               case 23 -> var10000 = 15;
               case 24 -> var10000 = 16;
               case 25 -> var10000 = 60;
               case 26 -> var10000 = 26;
               case 27 -> var10000 = 35;
               case 28 -> var10000 = 3;
               case 29 -> var10000 = 13;
               case 30 -> var10000 = 42;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 31;
               case 33 -> var10000 = 0;
               case 34 -> var10000 = 28;
               case 35 -> var10000 = 20;
               case 36 -> var10000 = 59;
               case 37 -> var10000 = 9;
               case 38 -> var10000 = 18;
               case 39 -> var10000 = 38;
               case 40 -> var10000 = 43;
               case 41 -> var10000 = 22;
               case 42 -> var10000 = 47;
               case 43 -> var10000 = 51;
               case 44 -> var10000 = 19;
               case 45 -> var10000 = 48;
               case 46 -> var10000 = 55;
               case 47 -> var10000 = 45;
               case 48 -> var10000 = 46;
               case 49 -> var10000 = 24;
               case 50 -> var10000 = 57;
               case 51 -> var10000 = 58;
               case 52 -> var10000 = 41;
               case 53 -> var10000 = 54;
               case 54 -> var10000 = 10;
               case 55 -> var10000 = 11;
               case 56 -> var10000 = 62;
               case 57 -> var10000 = 30;
               case 58 -> var10000 = 14;
               case 59 -> var10000 = 23;
               case 60 -> var10000 = 7;
               case 61 -> var10000 = 49;
               case 62 -> var10000 = 53;
               default -> var10000 = 27;
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
         if (var8 != 204 && var8 != 170 && var8 != 246 && var8 != 'R') {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 201) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 192) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 204) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 170) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 246) {
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
