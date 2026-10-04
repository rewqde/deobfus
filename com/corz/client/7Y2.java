package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7Y2 {
   public static final double 6 = 2.2;
   public static final double 4H = 1.6;
   public static final int 2;
   public static final int 3;
   public static final int 4q;
   private final 7V 4j;
   private final 7Tr[] 7;
   private final int[] 4_;
   private final int[] 4L;
   private final int[] 4Z;
   private final byte[] 0;
   private 73p 4y;
   private int 48;
   private int 41;
   private int 8;
   public int 4U;
   public int 4X;
   public int 4;
   public int 5;
   public int 9;
   public int 4t;
   private String 1;
   private static final long a;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String riVvALeovs;

   public int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public _Y2/* $FF was: 7Y2*/(7V param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public 7V _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.C<invokedynamic>(this, (long)"c", var2);
   }

   public 73p _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.C<invokedynamic>(this, (long)"c", var2);
   }

   public String _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.C<invokedynamic>(this, (long)"c", var2);
   }

   public 7Tr _/* $FF was: 1*/(Object[] var1) {
      int var2 = (Integer)var1[1];
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      return this.C<invokedynamic>(this, (long)"c", var3)[var2];
   }

   public int _/* $FF was: 8*/(Object[] var1) {
      long var3 = (Long)var1[1];
      int var2 = (Integer)var1[0];
      var3 = a ^ var3;
      return this.C<invokedynamic>(this, (long)"c", var3)[var2];
   }

   public void _/* $FF was: 4*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      this.Ë<invokedynamic>(this, "c".P<invokedynamic>((long)"c", var3), (long)"c", var3);
      this.Ë<invokedynamic>(this, (Integer)var1[0], (long)"c", var3);
   }

   public double _/* $FF was: 4*/(Object[] var1) {
      double var4 = (Double)var1[1];
      double var6 = (Double)var1[2];
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      double var10;
      try {
         7V var10000 = this.C<invokedynamic>(this, (long)"c", var2);
         if (var10000.É<invokedynamic>(var10000, (long)"c", var2) == 0) {
            var10 = var4;
            return var10;
         }
      } catch (MatchException var8) {
         throw var8.Í<invokedynamic>(var8, (long)"c", var2);
      }

      var10 = var6;
      return var10;
   }

   private double _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public double _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var5 = (Integer)var1[1];
      int var3 = (Integer)var1[3];
      int var4 = (Integer)var1[2];
      long var6 = ((long)var5 << 32 | (long)var4 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      return this.C<invokedynamic>(this, (long)"c", var6)[var2];
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      this.Ë<invokedynamic>(this, (Integer)var1[0], (long)"c", var2);
   }

   public void _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.Ë<invokedynamic>(this, "c".P<invokedynamic>((long)"c", var2), (long)"c", var2);
      this.Ë<invokedynamic>(this, (String)var1[1], (long)"c", var2);
   }

   public int _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".Í<invokedynamic>((long)"c", var2);
      ArrayList var5 = new ArrayList();
      boolean var4 = var10000;
      int var6 = 0;

      label32:
      while(true) {
         if (var6 < this.C<invokedynamic>(this, (long)"c", var2).length) {
            try {
               if (this.C<invokedynamic>(this, (long)"c", var2)[var6] != "c".P<invokedynamic>((long)"c", var2)) {
                  List var10001 = this.C<invokedynamic>(this, (long)"c", var2).É<invokedynamic>(this.C<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
                  7Of var9 = (7Of)var10001.É<invokedynamic>(var10001, var6, (long)"c", var2);
                  var5.É<invokedynamic>(var5, var9.É<invokedynamic>(var9, (long)"c", var2).Í<invokedynamic>(var9.É<invokedynamic>(var9, (long)"c", var2), (long)"c", var2), (long)"c", var2);
               }
            } catch (MatchException var7) {
               throw var7.Í<invokedynamic>(var7, (long)"c", var2);
            }

            ++var6;
            if (!var4) {
               continue;
            }
         }

         while(var2 <= 0L) {
            if (!var4) {
               continue label32;
            }
         }

         return var5;
      }
   }

   public List _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".Í<invokedynamic>((long)"c", var2);
      ArrayList var5 = new ArrayList();
      boolean var4 = var10000;
      int var6 = 0;

      label32:
      while(true) {
         if (var6 < this.C<invokedynamic>(this, (long)"c", var2).length) {
            try {
               if (this.C<invokedynamic>(this, (long)"c", var2)[var6] == "c".P<invokedynamic>((long)"c", var2)) {
                  List var10001 = this.C<invokedynamic>(this, (long)"c", var2).É<invokedynamic>(this.C<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
                  7Of var9 = (7Of)var10001.É<invokedynamic>(var10001, var6, (long)"c", var2);
                  var5.É<invokedynamic>(var5, var9.É<invokedynamic>(var9, (long)"c", var2).Í<invokedynamic>(var9.É<invokedynamic>(var9, (long)"c", var2), (long)"c", var2), (long)"c", var2);
               }
            } catch (MatchException var7) {
               throw var7.Í<invokedynamic>(var7, (long)"c", var2);
            }

            ++var6;
            if (!var4) {
               continue;
            }
         }

         while(var2 <= 1L) {
            if (!var4) {
               continue label32;
            }
         }

         return var5;
      }
   }

   public String _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7Y2.class, 734);
      a = s.a(-3109411014805810943L, 2773365602853353146L, MethodHandles.lookup().lookupClass()).a(169506040644942L);
      f = new Object[85];
      g = new String[85];
      a();
      long var11 = a ^ 90471300486784L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("L\u0003²VÓ¡D\u0010O?OK\u009f{ 5øH\u0018/ãJScà}\u001aïBÌ4ü\u001bÈÝÖÈ\u0091õÍ´l\u001a\u001a\u009a¾²¦\u009eôs\u0081I\u0083Ö{VÌ¡\u0099wi`\u008djF\u0003\u000bFù²)67&§/\u0087\u0083á3¯g\u0019\u0003\u0018Ql)ñ`\u0005À#HÈ-Ò\u00049=p\u0006³EA\u0010\u0088Å\rML{³ï>Ôppd'\u0015\u00ad·/Ñ> R½\u0092Í^\u009a\u0000\u0095µ\u001d\u0083¾X|ú<VÿÜo.òÂt".getBytes("ISO-8859-1"));
      String var22 = a(var15).intern();
      int var10001 = -1;
      b = var22;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var23 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var23.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[14];
      int var3 = 0;
      String var4 = "\u0081ÁO\u0098b\u0090ÌI¦ö|¨\u0002©\u009c\u0000Ù\u0087FÁo\u0083Û\u0096Ñ°ñe\u00842Hïp´çÝ×¼¤¹¼\u0001èå\u0098OQ0x©\u008f6DöÞ\u00874³Ã*«\u008bÈ»AB8Ò¸nëÆ¢>×\u0080\u001b5\u00adÉj®êîún©2=ÇÝcs±Ý\u008d";
      int var5 = "\u0081ÁO\u0098b\u0090ÌI¦ö|¨\u0002©\u009c\u0000Ù\u0087FÁo\u0083Û\u0096Ñ°ñe\u00842Hïp´çÝ×¼¤¹¼\u0001èå\u0098OQ0x©\u008f6DöÞ\u00874³Ã*«\u008bÈ»AB8Ò¸nëÆ¢>×\u0080\u001b5\u00adÉj®êîún©2=ÇÝcs±Ý\u008d".length();
      int var2 = 0;

      label29:
      while(true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var27 = -1;

         while(true) {
            long var8 = var24;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var29 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[14];
                     4q = true.h<invokedynamic>(6398, var11 ^ 2041639864198069356L);
                     2 = true.h<invokedynamic>(25198, var11 ^ 4944011939546466039L);
                     3 = true.h<invokedynamic>(1647, var11 ^ 7644082020757594871L);
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = ")Íï\u0012¢ø7\u009blHÀIm\u009f\n\u0092";
                  var5 = ")Íï\u0012¢ø7\u009blHÀIm\u009f\n\u0092".length();
                  var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var27 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native String a(byte[] var0);

   private static native int a(int var0, long var1);

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
      if (g[var4] != null) {
         return var4;
      } else {
         Object var5 = f[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 51;
               case 1 -> var10000 = 30;
               case 2 -> var10000 = 26;
               case 3 -> var10000 = 33;
               case 4 -> var10000 = 34;
               case 5 -> var10000 = 29;
               case 6 -> var10000 = 55;
               case 7 -> var10000 = 48;
               case 8 -> var10000 = 11;
               case 9 -> var10000 = 42;
               case 10 -> var10000 = 40;
               case 11 -> var10000 = 49;
               case 12 -> var10000 = 52;
               case 13 -> var10000 = 16;
               case 14 -> var10000 = 62;
               case 15 -> var10000 = 27;
               case 16 -> var10000 = 19;
               case 17 -> var10000 = 59;
               case 18 -> var10000 = 10;
               case 19 -> var10000 = 56;
               case 20 -> var10000 = 7;
               case 21 -> var10000 = 37;
               case 22 -> var10000 = 32;
               case 23 -> var10000 = 0;
               case 24 -> var10000 = 44;
               case 25 -> var10000 = 2;
               case 26 -> var10000 = 54;
               case 27 -> var10000 = 45;
               case 28 -> var10000 = 31;
               case 29 -> var10000 = 3;
               case 30 -> var10000 = 36;
               case 31 -> var10000 = 35;
               case 32 -> var10000 = 21;
               case 33 -> var10000 = 12;
               case 34 -> var10000 = 22;
               case 35 -> var10000 = 14;
               case 36 -> var10000 = 58;
               case 37 -> var10000 = 1;
               case 38 -> var10000 = 39;
               case 39 -> var10000 = 18;
               case 40 -> var10000 = 23;
               case 41 -> var10000 = 63;
               case 42 -> var10000 = 9;
               case 43 -> var10000 = 25;
               case 44 -> var10000 = 50;
               case 45 -> var10000 = 20;
               case 46 -> var10000 = 17;
               case 47 -> var10000 = 38;
               case 48 -> var10000 = 15;
               case 49 -> var10000 = 53;
               case 50 -> var10000 = 43;
               case 51 -> var10000 = 4;
               case 52 -> var10000 = 5;
               case 53 -> var10000 = 28;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 13;
               case 56 -> var10000 = 41;
               case 57 -> var10000 = 24;
               case 58 -> var10000 = 8;
               case 59 -> var10000 = 57;
               case 60 -> var10000 = 46;
               case 61 -> var10000 = 6;
               case 62 -> var10000 = 61;
               default -> var10000 = 47;
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

            g[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = f;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = Boolean.TYPE;
      g[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Integer.TYPE;
      g[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Long.TYPE;
      g[13] = "c";
      var10000[14] = "c";
      var10000[15] = Double.TYPE;
      g[15] = "c";
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
      var10000[30] = Void.TYPE;
      g[30] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = f[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(g[var4]);
            f[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      var5 = (Class)var6;
      return var5;
   }

   private static native Field a(Class var0, String var1, Class var2);

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
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     f[var4] = var13;
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
      Object var5 = f[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = g[var4];
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
               f[var4] = var26;
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
                     f[var4] = var19;
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
         if (var8 != 'C' && var8 != 203 && var8 != 'P' && var8 != 244) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 201) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 205) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'C') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 203) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'P') {
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
