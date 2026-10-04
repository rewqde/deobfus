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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7t {
   private final List 7r;
   private final int[] 7U;
   private final int[] 7W;
   private final int[] 3;
   private final Set 7k;
   private final Set 7m;
   private int 7;
   private boolean 7f;
   private int 7v;
   private int 76;
   private int 9;
   private int 4;
   private int 2;
   private int 7L;
   private int 5;
   private int 7R;
   private int 7B;
   private int 6;
   private int 7d;
   private int 7A;
   private int 71;
   private int 7o;
   private int 7g;
   private int 0;
   private int 8;
   private int 1;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final long e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String PKZjOHRaEK;

   public _t/* $FF was: 7t*/(char param1, int param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   public static long _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      this.æ<invokedynamic>(this, this.Ä<invokedynamic>(this, (long)"c", var3) + var2, (long)"c", var3);
   }

   public void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] var1) {
      long var5 = (Long)var1[1];
      var5 = a ^ var5;
      this.æ<invokedynamic>(this, (Integer)var1[0], (long)"c", var5);
      this.æ<invokedynamic>(this, (Integer)var1[2], (long)"c", var5);
      this.æ<invokedynamic>(this, (Integer)var1[3], (long)"c", var5);
      this.æ<invokedynamic>(this, (Integer)var1[4], (long)"c", var5);
   }

   public void _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _G/* $FF was: 7G*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      List var10000 = this.Ä<invokedynamic>(this, (long)"c", var2);
      return var10000.g<invokedynamic>(var10000, (long)"c", var2);
   }

   public int _a/* $FF was: 3a*/(Object[] var1) {
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return this.Ä<invokedynamic>(this, (long)"c", var3)[((73h)var1[0]).g<invokedynamic>((73h)var1[0], (long)"c", var3)];
   }

   public int _g/* $FF was: 3g*/(Object[] var1) {
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      return this.Ä<invokedynamic>(this, (long)"c", var3)[((73h)var1[1]).g<invokedynamic>((73h)var1[1], (long)"c", var3)];
   }

   public int _7/* $FF was: 77*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 3*/(Object[] var1) {
      int var2 = (Integer)var1[2];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[0];
      long var5 = ((long)var4 << 32 | (long)var3 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      Set var10000 = this.Ä<invokedynamic>(this, (long)"c", var5);
      return var10000.g<invokedynamic>(var10000, (long)"c", var5);
   }

   public int _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public boolean _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _u/* $FF was: 7u*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _k/* $FF was: 7k*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _v/* $FF was: 7v*/(Object[] var1) {
      int var4 = (Integer)var1[2];
      int var3 = (Integer)var1[1];
      int var2 = (Integer)var1[0];
      long var5 = ((long)var2 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ a;
      return this.Ä<invokedynamic>(this, (long)"c", var5);
   }

   public int _4/* $FF was: 74*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _s/* $FF was: 7s*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _E/* $FF was: 7E*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _t/* $FF was: 7t*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _R/* $FF was: 7R*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _I/* $FF was: 7I*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public Set _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 1*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Set var10000 = this.Ä<invokedynamic>(this, (long)"c", var2);
      return var10000.g<invokedynamic>(var10000, (long)"c", var2);
   }

   public int _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _C/* $FF was: 7C*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _d/* $FF was: 7d*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int _c/* $FF was: 7c*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public int __/* $FF was: 7_*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ä<invokedynamic>(this, (long)"c", var2);
   }

   public double _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ä<invokedynamic>(this, (long)"c", var2) + this.Ä<invokedynamic>(this, (long)"c", var2)) / "c";
   }

   public double _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ä<invokedynamic>(this, (long)"c", var2) + this.Ä<invokedynamic>(this, (long)"c", var2)) / "c";
   }

   public double _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ä<invokedynamic>(this, (long)"c", var2) + this.Ä<invokedynamic>(this, (long)"c", var2)) / "c";
   }

   public int _x/* $FF was: 7x*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int[] var10000 = this.Ä<invokedynamic>(this, (long)"c", var2);
      73h var10001 = "c".B<invokedynamic>((long)"c", var2);
      int var5 = var10000[var10001.g<invokedynamic>(var10001, (long)"c", var2)];
      int[] var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      73h var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      var5 += var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
      var12 = this.Ä<invokedynamic>(this, (long)"c", var2);
      var10002 = "c".B<invokedynamic>((long)"c", var2);
      return var5 + var12[var10002.g<invokedynamic>(var10002, (long)"c", var2)];
   }

   public double _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7t.class, 585);
      a = s.a(-595463930016860507L, 3919371221661694207L, MethodHandles.lookup().lookupClass()).a(87909572085177L);
      f = new Object[89];
      g = new String[89];
      a();
      d = new HashMap(13);
      long var5 = a ^ 50273633661588L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[21];
      int var10 = 0;
      String var11 = "\u0019l]By~#_CÌ'IZèFFÜ\u000bG-q2hðJý\u0007\u001dÜ@\u0080¼\u0006\u0005¯_¡&l\u009d\u000bä\b^\u001bü2z\f\u009bð\u0002ù\u008a\u0013?w¬ª\u0080 ÜA3A\u00adéè£\u008a\"òë\u0081\u0016\u0081\u001dqð\u0001iqý\u0017\u0010¤\u0018I:\u0018þ¯\u0090\u00adÖsUÌB\u008e.Ü½ÂX§Ë[p×ìxµ\nhÏíÀ©\f\u0017\u008b\u0015D\u0094\u0010¡DÔ\u000fÑ´¶¬DO7Æân\u0002L ü6!q\u000b\u00ad$Ú¼";
      int var12 = "\u0019l]By~#_CÌ'IZèFFÜ\u000bG-q2hðJý\u0007\u001dÜ@\u0080¼\u0006\u0005¯_¡&l\u009d\u000bä\b^\u001bü2z\f\u009bð\u0002ù\u008a\u0013?w¬ª\u0080 ÜA3A\u00adéè£\u008a\"òë\u0081\u0016\u0081\u001dqð\u0001iqý\u0017\u0010¤\u0018I:\u0018þ¯\u0090\u00adÖsUÌB\u008e.Ü½ÂX§Ë[p×ìxµ\nhÏíÀ©\f\u0017\u008b\u0015D\u0094\u0010¡DÔ\u000fÑ´¶¬DO7Æân\u0002L ü6!q\u000b\u00ad$Ú¼".length();
      int var9 = 0;

      label33:
      while(true) {
         int var10001 = var9;
         var9 += 8;
         byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
         long[] var19 = var13;
         var10001 = var10++;
         long var24 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
         byte var28 = -1;

         while(true) {
            long var15 = var24;
            byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
            long var31 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
            switch (var28) {
               case 0:
                  var19[var10001] = var31;
                  if (var9 >= var12) {
                     b = var13;
                     c = new Integer[21];
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var26 = SecretKeyFactory.getInstance("DES");
                     byte[] var30 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var30[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var26.generateSecret(new DESKeySpec(var30)), new IvParameterSpec(new byte[8]));
                     long var2 = -3488675382787795006L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     e = var27;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var9 < var12) {
                     continue label33;
                  }

                  var11 = "Å/æ±¯#\u0010\u0006h/F\"@NkZ";
                  var12 = "Å/æ±¯#\u0010\u0006h/F\"@NkZ".length();
                  var9 = 0;
            }

            var10001 = var9;
            var9 += 8;
            var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
            var19 = var13;
            var10001 = var10++;
            var24 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
            var28 = 0;
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
               case 0 -> var10000 = 43;
               case 1 -> var10000 = 19;
               case 2 -> var10000 = 1;
               case 3 -> var10000 = 35;
               case 4 -> var10000 = 55;
               case 5 -> var10000 = 20;
               case 6 -> var10000 = 0;
               case 7 -> var10000 = 13;
               case 8 -> var10000 = 56;
               case 9 -> var10000 = 63;
               case 10 -> var10000 = 37;
               case 11 -> var10000 = 45;
               case 12 -> var10000 = 51;
               case 13 -> var10000 = 26;
               case 14 -> var10000 = 9;
               case 15 -> var10000 = 32;
               case 16 -> var10000 = 34;
               case 17 -> var10000 = 12;
               case 18 -> var10000 = 41;
               case 19 -> var10000 = 14;
               case 20 -> var10000 = 21;
               case 21 -> var10000 = 23;
               case 22 -> var10000 = 24;
               case 23 -> var10000 = 31;
               case 24 -> var10000 = 38;
               case 25 -> var10000 = 33;
               case 26 -> var10000 = 3;
               case 27 -> var10000 = 59;
               case 28 -> var10000 = 30;
               case 29 -> var10000 = 7;
               case 30 -> var10000 = 48;
               case 31 -> var10000 = 5;
               case 32 -> var10000 = 39;
               case 33 -> var10000 = 18;
               case 34 -> var10000 = 61;
               case 35 -> var10000 = 27;
               case 36 -> var10000 = 60;
               case 37 -> var10000 = 15;
               case 38 -> var10000 = 6;
               case 39 -> var10000 = 17;
               case 40 -> var10000 = 25;
               case 41 -> var10000 = 4;
               case 42 -> var10000 = 53;
               case 43 -> var10000 = 47;
               case 44 -> var10000 = 46;
               case 45 -> var10000 = 2;
               case 46 -> var10000 = 28;
               case 47 -> var10000 = 50;
               case 48 -> var10000 = 8;
               case 49 -> var10000 = 36;
               case 50 -> var10000 = 16;
               case 51 -> var10000 = 44;
               case 52 -> var10000 = 42;
               case 53 -> var10000 = 22;
               case 54 -> var10000 = 11;
               case 55 -> var10000 = 62;
               case 56 -> var10000 = 49;
               case 57 -> var10000 = 57;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 10;
               case 60 -> var10000 = 54;
               case 61 -> var10000 = 52;
               case 62 -> var10000 = 29;
               default -> var10000 = 40;
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
      var10000[1] = Integer.TYPE;
      g[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Long.TYPE;
      g[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Boolean.TYPE;
      g[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = Void.TYPE;
      g[21] = "c";
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

   private static Field a(Class var0, String var1, Class var2) {
      for(Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static native Field b(Class var0, String var1, Class var2);

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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
