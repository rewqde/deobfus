package com.corz.client;

import com.google.gson.JsonObject;
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

public class 7Yr {
   public final String 8;
   public final int 5;
   public final int 9w;
   public final int 96;
   public final int 7;
   public final int 3;
   public final int 9v;
   public final int 9A;
   public final int 9V;
   public final int 0;
   public final int 9d;
   public final 73f 1;
   public final int 2;
   public String 9m;
   public 7Yd 9F;
   public int 6;
   public int 9O;
   public long 9r;
   public long 9R;
   public long 9;
   public String 4;
   private static final long a = s.a(1579018193434401688L, 774705909922564852L, MethodHandles.lookup().lookupClass()).a(162711419930360L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;
   private static final Object[] f = new Object[50];
   private static final String[] g = new String[50];
   // $FF: synthetic field
   private static transient String EZrBKuFWNq;

   public _Yr/* $FF was: 7Yr*/(String var1, int var2, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, 73f var14, int var15) {
      var3 = a ^ var3;
      super();
      this.q<invokedynamic>(this, "c".Q<invokedynamic>((long)"c", var3), (long)"c", var3);
      this.8 = var1;
      this.5 = var2;
      this.9w = var5;
      this.96 = var6;
      this.7 = var7;
      this.3 = var8;
      this.9v = var9;
      this.9A = var10;
      this.9V = var11;
      this.0 = var12;
      this.9d = var13;
      this.1 = var14;
      this.2 = var15;
   }

   public double _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ù<invokedynamic>(this, (long)"c", var2) + this.Ù<invokedynamic>(this, (long)"c", var2)) / "c" + "c";
   }

   public double _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ù<invokedynamic>(this, (long)"c", var2) + this.Ù<invokedynamic>(this, (long)"c", var2)) / "c" + "c";
   }

   public double _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (double)(this.Ù<invokedynamic>(this, (long)"c", var2) + this.Ù<invokedynamic>(this, (long)"c", var2)) / "c" + "c";
   }

   public boolean _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      boolean var10000;
      try {
         if (this.Ù<invokedynamic>(this, (long)"c", var2) == "c".Q<invokedynamic>((long)"c", var2)) {
            var10000 = true;
            return var10000;
         }
      } catch (MatchException var4) {
         throw var4.m<invokedynamic>(var4, (long)"c", var2);
      }

      var10000 = false;
      return var10000;
   }

   public boolean _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      7Yd var10000 = this.Ù<invokedynamic>(this, (long)"c", var2);
      return var10000.ú<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public JsonObject _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var5 = a ^ 41564417655724L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[15];
      int var12 = 0;
      String var11 = "a\u0097Ð8¤Në{×\u0082!\u0000\u0007mÌ\u0092\u0010ÄµÄ\u001f·\u0001SÊm\u0094îØ\u0007ÎÏ\u0087\u0010vy\u0012^²\u0092Ä±§Ã@Ö,Ù-<\u0010Ô®X ¥ô^ì9\u0011\u0088çÈ\u0012Z[\u0010\u0090S[Æ¤'l®ox¬ÅTp×\u0087\u0010\u0090/`À\u0083ÞÖõsÝý\u0005éna\n\u0010z\u0084\u0095h\u0094V[\u008fËKA×û\u0006^w\u0010S\u0089Ù×DÛ\u0012\u0099Cëb\u009f\u0005\u0012Ân\u0010öÂ\u0012q2êþ\u001e©\u0010OX\u001bÀF]\u0010rÄïNüÅ_ûg·I\u0080\u008b_Î×\u0010z\u009f²\u0007\u0092ë\u0095Úy¦\u008cýÂF\u0013â\u0010IZwt\u0011\u009434\u008a´\u001fÌEÄ©-\u0010fÔ\u0014Ïà\u0000¼!ñ·æ\u0016Û\u0091=\r";
      int var13 = "a\u0097Ð8¤Në{×\u0082!\u0000\u0007mÌ\u0092\u0010ÄµÄ\u001f·\u0001SÊm\u0094îØ\u0007ÎÏ\u0087\u0010vy\u0012^²\u0092Ä±§Ã@Ö,Ù-<\u0010Ô®X ¥ô^ì9\u0011\u0088çÈ\u0012Z[\u0010\u0090S[Æ¤'l®ox¬ÅTp×\u0087\u0010\u0090/`À\u0083ÞÖõsÝý\u0005éna\n\u0010z\u0084\u0095h\u0094V[\u008fËKA×û\u0006^w\u0010S\u0089Ù×DÛ\u0012\u0099Cëb\u009f\u0005\u0012Ân\u0010öÂ\u0012q2êþ\u001e©\u0010OX\u001bÀF]\u0010rÄïNüÅ_ûg·I\u0080\u008b_Î×\u0010z\u009f²\u0007\u0092ë\u0095Úy¦\u008cýÂF\u0013â\u0010IZwt\u0011\u009434\u008a´\u001fÌEÄ©-\u0010fÔ\u0014Ïà\u0000¼!ñ·æ\u0016Û\u0091=\r".length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while(true) {
         ++var17;
         String var18 = var11.substring(var17, var17 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[15];
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var28 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var28.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8359157961268457626L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var29 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     e = var29;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "æ\u0000Þ\u000fâ/\u0006MÙ=R¸@b\u0013P\u0010\u0007õ?Q,\u0091¼Ó\u008dökòUÏì¸";
                  var13 = "æ\u0000Þ\u000fâ/\u0006MÙ=R¸@b\u0013P\u0010\u0007õ?Q,\u0091¼Ó\u008dökòUÏì¸".length();
                  var10 = 16;
                  var17 = -1;
            }

            ++var17;
            var18 = var11.substring(var17, var17 + var10);
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
               case 0 -> var10000 = 56;
               case 1 -> var10000 = 4;
               case 2 -> var10000 = 3;
               case 3 -> var10000 = 63;
               case 4 -> var10000 = 61;
               case 5 -> var10000 = 17;
               case 6 -> var10000 = 36;
               case 7 -> var10000 = 39;
               case 8 -> var10000 = 1;
               case 9 -> var10000 = 2;
               case 10 -> var10000 = 6;
               case 11 -> var10000 = 37;
               case 12 -> var10000 = 23;
               case 13 -> var10000 = 35;
               case 14 -> var10000 = 41;
               case 15 -> var10000 = 42;
               case 16 -> var10000 = 29;
               case 17 -> var10000 = 19;
               case 18 -> var10000 = 18;
               case 19 -> var10000 = 55;
               case 20 -> var10000 = 58;
               case 21 -> var10000 = 26;
               case 22 -> var10000 = 52;
               case 23 -> var10000 = 22;
               case 24 -> var10000 = 47;
               case 25 -> var10000 = 5;
               case 26 -> var10000 = 40;
               case 27 -> var10000 = 53;
               case 28 -> var10000 = 27;
               case 29 -> var10000 = 11;
               case 30 -> var10000 = 34;
               case 31 -> var10000 = 9;
               case 32 -> var10000 = 28;
               case 33 -> var10000 = 14;
               case 34 -> var10000 = 46;
               case 35 -> var10000 = 33;
               case 36 -> var10000 = 59;
               case 37 -> var10000 = 32;
               case 38 -> var10000 = 15;
               case 39 -> var10000 = 7;
               case 40 -> var10000 = 43;
               case 41 -> var10000 = 51;
               case 42 -> var10000 = 49;
               case 43 -> var10000 = 50;
               case 44 -> var10000 = 38;
               case 45 -> var10000 = 12;
               case 46 -> var10000 = 45;
               case 47 -> var10000 = 24;
               case 48 -> var10000 = 16;
               case 49 -> var10000 = 62;
               case 50 -> var10000 = 0;
               case 51 -> var10000 = 20;
               case 52 -> var10000 = 8;
               case 53 -> var10000 = 44;
               case 54 -> var10000 = 60;
               case 55 -> var10000 = 30;
               case 56 -> var10000 = 31;
               case 57 -> var10000 = 54;
               case 58 -> var10000 = 13;
               case 59 -> var10000 = 10;
               case 60 -> var10000 = 48;
               case 61 -> var10000 = 25;
               case 62 -> var10000 = 57;
               default -> var10000 = 21;
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
      var10000[5] = Long.TYPE;
      g[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Boolean.TYPE;
      g[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Void.TYPE;
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
         if (var8 != 217 && var8 != 'q' && var8 != 'Q' && var8 != 'd') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 250) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'm') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 217) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'q') {
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

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4) {
      int var5 = var4.length - 2;
      long var6 = (Long)var4[var5];
      ++var5;
      long var9 = (Long)var4[var5];
      MethodHandle var8 = a(var0, var1, var2, var3, var6, var9);
      var1.setTarget(MethodHandles.explicitCastArguments(var8, var3));
      return var8.asSpreader(Object[].class, var4.length).invoke(var4);
   }

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
