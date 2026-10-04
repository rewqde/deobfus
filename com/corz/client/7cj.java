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

public class 7cJ {
   private static final int 1;
   private static final int 31;
   private static final int 8;
   private static final int 4;
   private static final int 6;
   private static final int 2;
   private final 4r 3;
   private final 7TT 3q;
   private final 7TT 7;
   private int 3O;
   private int 0;
   private int 5;
   private int 9;
   private static final long a = s.a(-7821589120554675998L, 6248779148295390771L, MethodHandles.lookup().lookupClass()).a(280496136999753L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e = new Object[74];
   private static final String[] f = new String[74];
   // $FF: synthetic field
   private static transient String uzIcAcuNjj;

   public _cJ/* $FF was: 7cJ*/(4r param1, int param2, int param3, long param4, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   private int[] _/* $FF was: 4*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.Ø<invokedynamic>(this, (long)"c", var2);
   }

   public void _/* $FF was: 6*/(Object[] var1) {
      long var4 = (Long)var1[4];
      var4 = a ^ var4;
      this.ä<invokedynamic>(this, (Integer)var1[0], (long)"c", var4);
      this.ä<invokedynamic>(this, (Integer)var1[1], (long)"c", var4);
      this.ä<invokedynamic>(this, (Integer)var1[2], (long)"c", var4);
      this.ä<invokedynamic>(this, (Integer)var1[3], (long)"c", var4);
   }

   private int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var0 = a ^ 5532885517155L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[29];
      int var5 = 0;
      String var6 = "¤\u000e\u0017ìÇöu³:á\u0012ñ 'K\u0011È\u0003*Õd\r.\u0016¿_\u001dK\u0089y@ÊÇ\u0080y@¿ØáÜ×llçÑ\u0085n\u0017\u0018ØÝ\u008a9\u0084\u0081iIx\u009dÕgmó\u001f9\u000f§<xµÉã^]Ú\u008a9o°òö\u001eÛå\u001ap\\\u001b¥çº¢¢*\u0005\u001c9\u0099´H\u0016\u0088\t+{#ÊyDw\u0017ûÈ£Uh\u0011^výÒ_N\u0086ò PqÔßÚ6ÊÏ2^\u0095e\u001d\u0014P\u009fmw¶¨²µPm9ì\u0011\u00143\u0099J²²\u0011Ú©\u0001?4À\u009e´ÝÏGæÇ\u001f\u008b\u0087;¤²5÷HKúd\u008d+|5\u001aÚ\u0086ò÷r¸¢LF$ åºi³ïÕá©]/\fz¦G\u0017";
      int var7 = "¤\u000e\u0017ìÇöu³:á\u0012ñ 'K\u0011È\u0003*Õd\r.\u0016¿_\u001dK\u0089y@ÊÇ\u0080y@¿ØáÜ×llçÑ\u0085n\u0017\u0018ØÝ\u008a9\u0084\u0081iIx\u009dÕgmó\u001f9\u000f§<xµÉã^]Ú\u008a9o°òö\u001eÛå\u001ap\\\u001b¥çº¢¢*\u0005\u001c9\u0099´H\u0016\u0088\t+{#ÊyDw\u0017ûÈ£Uh\u0011^výÒ_N\u0086ò PqÔßÚ6ÊÏ2^\u0095e\u001d\u0014P\u009fmw¶¨²µPm9ì\u0011\u00143\u0099J²²\u0011Ú©\u0001?4À\u009e´ÝÏGæÇ\u001f\u008b\u0087;¤²5÷HKúd\u008d+|5\u001aÚ\u0086ò÷r¸¢LF$ åºi³ïÕá©]/\fz¦G\u0017".length();
      int var4 = 0;

      label23:
      while(true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var19 = -1;

         while(true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var21 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[29];
                     1 = true.o<invokedynamic>(17070, var0 ^ 7152053792052845156L);
                     8 = true.o<invokedynamic>(32, var0 ^ 7480788895453108475L);
                     4 = true.o<invokedynamic>(4016, var0 ^ 6776395458386614113L);
                     2 = true.o<invokedynamic>(20014, var0 ^ 7498242331090294524L);
                     6 = true.o<invokedynamic>(14490, var0 ^ 2594779626547109956L);
                     31 = true.o<invokedynamic>(11393, var0 ^ 6005137949307139159L);
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ö¤ã¼\u0011\u009e(ïw1yG\u0013MÈ\u0004";
                  var7 = "ö¤ã¼\u0011\u009e(ïw1yG\u0013MÈ\u0004".length();
                  var4 = 0;
            }

            var10001 = var4;
            var4 += 8;
            var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var19 = 0;
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
      if (f[var4] != null) {
         return var4;
      } else {
         Object var5 = e[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 33;
               case 1 -> var10000 = 7;
               case 2 -> var10000 = 21;
               case 3 -> var10000 = 1;
               case 4 -> var10000 = 10;
               case 5 -> var10000 = 25;
               case 6 -> var10000 = 56;
               case 7 -> var10000 = 4;
               case 8 -> var10000 = 14;
               case 9 -> var10000 = 55;
               case 10 -> var10000 = 44;
               case 11 -> var10000 = 15;
               case 12 -> var10000 = 61;
               case 13 -> var10000 = 22;
               case 14 -> var10000 = 2;
               case 15 -> var10000 = 11;
               case 16 -> var10000 = 50;
               case 17 -> var10000 = 45;
               case 18 -> var10000 = 12;
               case 19 -> var10000 = 16;
               case 20 -> var10000 = 18;
               case 21 -> var10000 = 53;
               case 22 -> var10000 = 40;
               case 23 -> var10000 = 43;
               case 24 -> var10000 = 63;
               case 25 -> var10000 = 47;
               case 26 -> var10000 = 37;
               case 27 -> var10000 = 20;
               case 28 -> var10000 = 32;
               case 29 -> var10000 = 26;
               case 30 -> var10000 = 24;
               case 31 -> var10000 = 48;
               case 32 -> var10000 = 54;
               case 33 -> var10000 = 62;
               case 34 -> var10000 = 38;
               case 35 -> var10000 = 5;
               case 36 -> var10000 = 27;
               case 37 -> var10000 = 34;
               case 38 -> var10000 = 8;
               case 39 -> var10000 = 29;
               case 40 -> var10000 = 41;
               case 41 -> var10000 = 46;
               case 42 -> var10000 = 19;
               case 43 -> var10000 = 9;
               case 44 -> var10000 = 3;
               case 45 -> var10000 = 52;
               case 46 -> var10000 = 13;
               case 47 -> var10000 = 59;
               case 48 -> var10000 = 28;
               case 49 -> var10000 = 57;
               case 50 -> var10000 = 60;
               case 51 -> var10000 = 0;
               case 52 -> var10000 = 6;
               case 53 -> var10000 = 36;
               case 54 -> var10000 = 35;
               case 55 -> var10000 = 31;
               case 56 -> var10000 = 58;
               case 57 -> var10000 = 39;
               case 58 -> var10000 = 51;
               case 59 -> var10000 = 17;
               case 60 -> var10000 = 49;
               case 61 -> var10000 = 42;
               case 62 -> var10000 = 30;
               default -> var10000 = 23;
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

            f[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = e;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      f[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = Short.TYPE;
      f[7] = "c";
      var10000[8] = Long.TYPE;
      f[8] = "c";
      var10000[9] = Void.TYPE;
      f[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = Double.TYPE;
      f[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = Float.TYPE;
      f[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = "c";
      var10000[22] = "c";
      var10000[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = "c";
      var10000[28] = Boolean.TYPE;
      f[28] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     e[var4] = var13;
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
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = f[var4];
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
               e[var4] = var26;
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
                     e[var4] = var19;
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
         if (var8 != 216 && var8 != 228 && var8 != 233 && var8 != 239) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 250) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 226) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 216) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 228) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 233) {
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
