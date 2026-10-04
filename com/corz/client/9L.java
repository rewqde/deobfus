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
import net.minecraft.class_2338;

public class 9l extends 9a {
   private final 44 74;
   private final 44 3;
   private final 44 7S;
   private final 44 7;
   private final 4H 7f;
   private final 4H 7r;
   private final 4H 7o;
   private final 44 7g;
   private final 44 73;
   private static final int 8;
   private int 7m;
   private int 7p;
   private int 2;
   private class_2338 7Q;
   private int 9;
   private int 6;
   private int 7R;
   private int 0;
   private long 1;
   private boolean 5;
   private static final long b;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long l;
   private static final Object[] m;
   private static final String[] n;
   // $FF: synthetic field
   private static transient String RpGoTyTgKP;

   public _l/* $FF was: 9l*/(long param1) {
      // $FF: Couldn't be decompiled
   }

   public native void _r/* $FF was: 1r*/(Object[] var1);

   public native void _U/* $FF was: 1U*/();

   public native void _/* $FF was: 0*/();

   public void _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _k/* $FF was: 5k*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _L/* $FF was: 5L*/() {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _0/* $FF was: 50*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _r/* $FF was: 5r*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _1/* $FF was: 51*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _X/* $FF was: 6X*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _m/* $FF was: 5m*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(9l.class, 836);
      b = com.corz.client.s.a(-2848237847064787721L, 4140317675662738324L, MethodHandles.lookup().lookupClass()).a(44279950877145L);
      m = new Object[161];
      n = new String[161];
      b();
      h = new HashMap(13);
      long var5 = b ^ 67003593405357L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var13 = new long[32];
      int var10 = 0;
      String var11 = "]_\"©#{h2\u0099\u0088×\u009d\u000eaÜ>\u008eÊö=\u00106DØ1à\bì\u008aÀ\u0005eåÎ\"\f\u0019q®bsâ£ï ¡\u0011=ê\u008b¬Þ$\u0091*ß\u009e\u0093\u008e`´º\u0094#\u001cÆx_d\b\u0081êÖ ?\u009fâ\u009d¢mÕò¬Ri<\u0082·G8äK]:É%Ä\u001eóe\u008c=îòô::\u0007©»þ\u008f\u0004fÄ0#Þ9Z\u0088²_\u000fþáá\u0083Ì½úôÐ\u0095\u0099hÈ\u0089\tbWâ\u0002 h¤}\u001cª\u0015\r\u00adÄ\u001a\u0089i\u00956{¯3ì\u0084B\u0095K\u008f\u0010Lâì\u001bÜ\u0003t\u009a\u001a\u0016»\u0081\u00128\u0013.k=ªtA»\u0081\u001eª¸\u0092¸\u0086\u009cú¦,R\u0081áö`\u001cw·òg±u\u0019\u0017P1P³\u000eàD+,B!J\u008d-'cxÙª/Ê¹PÐn";
      int var12 = "]_\"©#{h2\u0099\u0088×\u009d\u000eaÜ>\u008eÊö=\u00106DØ1à\bì\u008aÀ\u0005eåÎ\"\f\u0019q®bsâ£ï ¡\u0011=ê\u008b¬Þ$\u0091*ß\u009e\u0093\u008e`´º\u0094#\u001cÆx_d\b\u0081êÖ ?\u009fâ\u009d¢mÕò¬Ri<\u0082·G8äK]:É%Ä\u001eóe\u008c=îòô::\u0007©»þ\u008f\u0004fÄ0#Þ9Z\u0088²_\u000fþáá\u0083Ì½úôÐ\u0095\u0099hÈ\u0089\tbWâ\u0002 h¤}\u001cª\u0015\r\u00adÄ\u001a\u0089i\u00956{¯3ì\u0084B\u0095K\u008f\u0010Lâì\u001bÜ\u0003t\u009a\u001a\u0016»\u0081\u00128\u0013.k=ªtA»\u0081\u001eª¸\u0092¸\u0086\u009cú¦,R\u0081áö`\u001cw·òg±u\u0019\u0017P1P³\u000eàD+,B!J\u008d-'cxÙª/Ê¹PÐn".length();
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
                     f = var13;
                     g = new Integer[32];
                     8 = true.v<invokedynamic>(9268, var5 ^ 1384965550057119947L);
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var26 = SecretKeyFactory.getInstance("DES");
                     byte[] var30 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var30[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var26.generateSecret(new DESKeySpec(var30)), new IvParameterSpec(new byte[8]));
                     long var2 = -7944345072993166197L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     l = var27;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var9 < var12) {
                     continue label33;
                  }

                  var11 = "\u000eu\u0098ð¹\u009cMT¼\u0089Õ·ì¶\u0004#";
                  var12 = "\u000eu\u0098ð¹\u009cMT¼\u0089Õ·ì¶\u0004#".length();
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

   private static native int b(int var0, long var1);

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

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (n[var4] != null) {
         return var4;
      } else {
         Object var5 = m[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 60;
               case 1 -> var10000 = 54;
               case 2 -> var10000 = 56;
               case 3 -> var10000 = 30;
               case 4 -> var10000 = 62;
               case 5 -> var10000 = 31;
               case 6 -> var10000 = 38;
               case 7 -> var10000 = 26;
               case 8 -> var10000 = 55;
               case 9 -> var10000 = 27;
               case 10 -> var10000 = 19;
               case 11 -> var10000 = 14;
               case 12 -> var10000 = 58;
               case 13 -> var10000 = 16;
               case 14 -> var10000 = 7;
               case 15 -> var10000 = 6;
               case 16 -> var10000 = 13;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 23;
               case 19 -> var10000 = 11;
               case 20 -> var10000 = 5;
               case 21 -> var10000 = 63;
               case 22 -> var10000 = 40;
               case 23 -> var10000 = 52;
               case 24 -> var10000 = 22;
               case 25 -> var10000 = 3;
               case 26 -> var10000 = 21;
               case 27 -> var10000 = 0;
               case 28 -> var10000 = 44;
               case 29 -> var10000 = 2;
               case 30 -> var10000 = 4;
               case 31 -> var10000 = 18;
               case 32 -> var10000 = 32;
               case 33 -> var10000 = 28;
               case 34 -> var10000 = 1;
               case 35 -> var10000 = 36;
               case 36 -> var10000 = 24;
               case 37 -> var10000 = 49;
               case 38 -> var10000 = 41;
               case 39 -> var10000 = 9;
               case 40 -> var10000 = 8;
               case 41 -> var10000 = 17;
               case 42 -> var10000 = 59;
               case 43 -> var10000 = 15;
               case 44 -> var10000 = 35;
               case 45 -> var10000 = 39;
               case 46 -> var10000 = 46;
               case 47 -> var10000 = 42;
               case 48 -> var10000 = 12;
               case 49 -> var10000 = 34;
               case 50 -> var10000 = 48;
               case 51 -> var10000 = 47;
               case 52 -> var10000 = 57;
               case 53 -> var10000 = 25;
               case 54 -> var10000 = 29;
               case 55 -> var10000 = 10;
               case 56 -> var10000 = 45;
               case 57 -> var10000 = 53;
               case 58 -> var10000 = 20;
               case 59 -> var10000 = 37;
               case 60 -> var10000 = 43;
               case 61 -> var10000 = 33;
               case 62 -> var10000 = 50;
               default -> var10000 = 51;
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

            n[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void b() {
      Object[] var10000 = m;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = Void.TYPE;
      n[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Float.TYPE;
      n[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Long.TYPE;
      n[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Integer.TYPE;
      n[15] = "c";
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
      var10000[27] = Boolean.TYPE;
      n[27] = "c";
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
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
      var10000[136] = "c";
      var10000[137] = "c";
      var10000[138] = "c";
      var10000[139] = "c";
      var10000[140] = "c";
      var10000[141] = "c";
      var10000[142] = "c";
      var10000[143] = "c";
      var10000[144] = "c";
      var10000[145] = "c";
      var10000[146] = "c";
      var10000[147] = "c";
      var10000[148] = "c";
      var10000[149] = "c";
      var10000[150] = "c";
      var10000[151] = "c";
      var10000[152] = "c";
      var10000[153] = "c";
      var10000[154] = "c";
      var10000[155] = "c";
      var10000[156] = "c";
      var10000[157] = "c";
      var10000[158] = "c";
      var10000[159] = "c";
      var10000[160] = "c";
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = m[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(n[var4]);
            m[var4] = var5;
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
      Object var5 = m[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = n[var4];
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
               m[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = d(var14[var15], var10, var11);
                  if (var13 != null) {
                     m[var4] = var13;
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
      Object var5 = m[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = n[var4];
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
               m[var4] = var26;
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
                     m[var4] = var19;
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
         if (var8 != 170 && var8 != 246 && var8 != 241 && var8 != "c") {
            var11 = h(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'o') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 200) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = g(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 170) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 246) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 241) {
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

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
