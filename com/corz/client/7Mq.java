package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7Mq {
   private static final int 2X;
   private static final int 29;
   private static final int 4;
   private static final int 2I;
   private static final int 2a;
   private static final int 5;
   private static final double 0 = 0.06;
   private static final double 2c = 0.06;
   private final Map 2b;
   private final Map 2u;
   private final ArrayDeque 2;
   private long 3;
   private int 7;
   private double 2g;
   private double 2w;
   private int 28;
   private int 25;
   private long 2L;
   private int 2A;
   private int 1;
   private boolean 9;
   private long 8;
   private boolean 6;
   private 7Yu 2p;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String zjxRKXncdn;

   public _Mq/* $FF was: 7Mq*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static long _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 9Y _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 9Y _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private 7Yu _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private long _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 76B _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7c6 _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      int var10002 = this.ö<invokedynamic>(this, (long)"c", var2);
      double var10003 = this.ö<invokedynamic>(this, (long)"c", var2);
      double var10004 = this.ö<invokedynamic>(this, (long)"c", var2);
      int var10005 = this.ö<invokedynamic>(this, (long)"c", var2);
      int var10006 = 0.e<invokedynamic>(0, var4 - this.ö<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      int var10007 = this.ö<invokedynamic>(this, (long)"c", var2);
      int var10008 = this.ö<invokedynamic>(this, (long)"c", var2);
      7Yu var10009 = this.ö<invokedynamic>(this, (long)"c", var2);
      ArrayDeque var10010 = this.ö<invokedynamic>(this, (long)"c", var2);
      return new 7c6(var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010.e<invokedynamic>(var10010, (long)"c", var2));
   }

   public void _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var4 = (Long)var1[1];
      var4 = a ^ var4;
      Map var10000 = this.ö<invokedynamic>(this, (long)"c", var4);
      Integer var7 = (Integer)var10000.À<invokedynamic>(var10000, (Long)var1[0].e<invokedynamic>((Long)var1[0], (long)"c", var4), false.e<invokedynamic>(0, (long)"c", var4), (long)"c", var4);
      return var7.À<invokedynamic>(var7, (long)"c", var4);
   }

   private static Long[] _/* $FF was: 1*/(int var0) {
      return new Long[var0];
   }

   private static Long[] _/* $FF was: 0*/(int var0) {
      return new Long[var0];
   }

   static {
      a.b99571f71427e3b19.a.init(7Mq.class, 705);
      a = s.a(-1285240150457030874L, 5156662002412290446L, MethodHandles.lookup().lookupClass()).a(150239107001288L);
      h = new Object[116];
      i = new String[116];
      a();
      d = new HashMap(13);
      long var11 = a ^ 50263228352315L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[16];
      int var16 = 0;
      String var17 = "sµÔ¡øzã\"Ð\u008e§\u0093Ö¹\u0082¥\u009dæöº\u0016º¬\f°Ô\u008fHùsyJp£b|§1\u0017ÁÙ\n²\u0012Íuw\u009a\u0080\u0090±â\u0088¤\u0098\u00ad\u00121$0Ç£\u0003ª·l\r0\u0012\u0086`rÕI\u009a\t%Ø8\tv\u0097Ó¿\u008az¼\u0015ì\u009b\u0093ÝÁ <ù»fÊw\u0085xL~ú¾\u0099\u0092/.Èa";
      int var18 = "sµÔ¡øzã\"Ð\u008e§\u0093Ö¹\u0082¥\u009dæöº\u0016º¬\f°Ô\u008fHùsyJp£b|§1\u0017ÁÙ\n²\u0012Íuw\u009a\u0080\u0090±â\u0088¤\u0098\u00ad\u00121$0Ç£\u0003ª·l\r0\u0012\u0086`rÕI\u009a\t%Ø8\tv\u0097Ó¿\u008az¼\u0015ì\u009b\u0093ÝÁ <ù»fÊw\u0085xL~ú¾\u0099\u0092/.Èa".length();
      int var15 = 0;

      label50:
      while(true) {
         int var10001 = var15;
         var15 += 8;
         byte[] var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var26 = var19;
         var10001 = var16++;
         long var34 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
         byte var39 = -1;

         while(true) {
            long var21 = var34;
            byte[] var23 = var13.doFinal(new byte[]{(byte)((int)(var21 >>> 56)), (byte)((int)(var21 >>> 48)), (byte)((int)(var21 >>> 40)), (byte)((int)(var21 >>> 32)), (byte)((int)(var21 >>> 24)), (byte)((int)(var21 >>> 16)), (byte)((int)(var21 >>> 8)), (byte)((int)var21)});
            long var44 = ((long)var23[0] & 255L) << 56 | ((long)var23[1] & 255L) << 48 | ((long)var23[2] & 255L) << 40 | ((long)var23[3] & 255L) << 32 | ((long)var23[4] & 255L) << 24 | ((long)var23[5] & 255L) << 16 | ((long)var23[6] & 255L) << 8 | (long)var23[7] & 255L;
            switch (var39) {
               case 0:
                  var26[var10001] = var44;
                  if (var15 >= var18) {
                     b = var19;
                     c = new Integer[16];
                     2X = true.v<invokedynamic>(28853, var11 ^ 2241787239041385231L);
                     29 = true.v<invokedynamic>(9928, var11 ^ 1389926280145212788L);
                     2a = true.v<invokedynamic>(5030, var11 ^ 3807945195212578833L);
                     5 = true.v<invokedynamic>(8642, var11 ^ 192069002785231481L);
                     4 = true.v<invokedynamic>(25520, var11 ^ 1747039437509775366L);
                     2I = true.v<invokedynamic>(25520, var11 ^ 1747039437509775366L);
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var36 = SecretKeyFactory.getInstance("DES");
                     byte[] var41 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var41[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var27.init(2, var36.generateSecret(new DESKeySpec(var41)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "ÖÛÖ¹\u009cÔÃ¹¼¥\u008dÁ½·êÛb/¡\u000eS[l\u008axo\u0005\u008f'\u00ad\u008c\r";
                     int var5 = "ÖÛÖ¹\u009cÔÃ¹¼¥\u008dÁ½·êÛb/¡\u000eS[l\u008axo\u0005\u008f'\u00ad\u008c\r".length();
                     int var2 = 0;

                     label34:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte var42 = -1;

                        while(true) {
                           long var8 = var37;
                           byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                           var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                           switch (var42) {
                              case 0:
                                 var28[var10001] = var44;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Long[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var44;
                                 if (var2 < var5) {
                                    continue label34;
                                 }

                                 var4 = "}\u001f\u0014SÝL>)´|\u0091Êÿ\u0091\\À";
                                 var5 = "}\u001f\u0014SÝL>)´|\u0091Êÿ\u0091\\À".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var42 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var26[var10001] = var44;
                  if (var15 < var18) {
                     continue label50;
                  }

                  var17 = "2Ø(Ø\\\u0095¸RT£\u0098á´»\u0096ï";
                  var18 = "2Ø(Ø\\\u0095¸RT£\u0098á´»\u0096ï".length();
                  var15 = 0;
            }

            var10001 = var15;
            var15 += 8;
            var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
            var26 = var19;
            var10001 = var16++;
            var34 = ((long)var20[0] & 255L) << 56 | ((long)var20[1] & 255L) << 48 | ((long)var20[2] & 255L) << 40 | ((long)var20[3] & 255L) << 32 | ((long)var20[4] & 255L) << 24 | ((long)var20[5] & 255L) << 16 | ((long)var20[6] & 255L) << 8 | (long)var20[7] & 255L;
            var39 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
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

   private static long b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
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
      Object[] var10000 = h;
      var10000[0] = "c";
      var10000[1] = Long.TYPE;
      i[1] = "c";
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
      var10000[11] = Integer.TYPE;
      i[11] = "c";
      var10000[12] = Void.TYPE;
      i[12] = "c";
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
      var10000[28] = Double.TYPE;
      i[28] = "c";
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
      var10000[115] = "c";
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

   private static native Field c(long var0, long var2);

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

   private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

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
