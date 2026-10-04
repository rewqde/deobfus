package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $FF: synthetic class
public class 7OU {
   static final int[] 8;
   static final int[] 6;
   static final int[] 4;
   static final int[] 3;
   private static final Object[] a;
   private static final String[] b;
   // $FF: synthetic field
   private static transient String pUcnUASEUa;

   static {
      a.b99571f71427e3b19.a.init(7OU.class, 718);
      long var11 = s.a(6509038716757629763L, 5021859326387414858L, MethodHandles.lookup().lookupClass()).a(132298961862089L) ^ 127064348723595L;
      a = new Object[44];
      b = new String[44];
      a();
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "Í¹ðÎðs}Þ\u009e}J ô\t\u00ad7";
      int var6 = "Í¹ðÎðs}Þ\u009e}J ô\t\u00ad7".length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var32 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      3 = new int[7211529106837635673L.o<invokedynamic>(7211529106837635673L, var11).length];

      try {
         7213360178330060478L.Ò<invokedynamic>(7213360178330060478L, var11)[7212470914134614877L.Ò<invokedynamic>(7212470914134614877L, var11).í<invokedynamic>(7212470914134614877L.Ò<invokedynamic>(7212470914134614877L, var11), 7211932003877314531L, var11)] = 1;
      } catch (NoSuchFieldError var30) {
      }

      try {
         7213360178330060478L.Ò<invokedynamic>(7213360178330060478L, var11)[7212420275586886758L.Ò<invokedynamic>(7212420275586886758L, var11).í<invokedynamic>(7212420275586886758L.Ò<invokedynamic>(7212420275586886758L, var11), 7211932003877314531L, var11)] = 2;
      } catch (NoSuchFieldError var29) {
      }

      try {
         7213360178330060478L.Ò<invokedynamic>(7213360178330060478L, var11)[7213109622429736609L.Ò<invokedynamic>(7213109622429736609L, var11).í<invokedynamic>(7213109622429736609L.Ò<invokedynamic>(7213109622429736609L, var11), 7211932003877314531L, var11)] = 3;
      } catch (NoSuchFieldError var28) {
      }

      4 = new int[7211652222341089256L.o<invokedynamic>(7211652222341089256L, var11).length];

      try {
         7213022418121522629L.Ò<invokedynamic>(7213022418121522629L, var11)[7211852700487545032L.Ò<invokedynamic>(7211852700487545032L, var11).í<invokedynamic>(7211852700487545032L.Ò<invokedynamic>(7211852700487545032L, var11), 7212997886196114408L, var11)] = 1;
      } catch (NoSuchFieldError var27) {
      }

      try {
         7213022418121522629L.Ò<invokedynamic>(7213022418121522629L, var11)[7212716578394332495L.Ò<invokedynamic>(7212716578394332495L, var11).í<invokedynamic>(7212716578394332495L.Ò<invokedynamic>(7212716578394332495L, var11), 7212997886196114408L, var11)] = 2;
      } catch (NoSuchFieldError var26) {
      }

      6 = new int[7212614204324370752L.o<invokedynamic>(7212614204324370752L, var11).length];

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7212291569900577075L.Ò<invokedynamic>(7212291569900577075L, var11).í<invokedynamic>(7212291569900577075L.Ò<invokedynamic>(7212291569900577075L, var11), 7212572093947042999L, var11)] = 1;
      } catch (NoSuchFieldError var25) {
      }

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7213311492207959886L.Ò<invokedynamic>(7213311492207959886L, var11).í<invokedynamic>(7213311492207959886L.Ò<invokedynamic>(7213311492207959886L, var11), 7212572093947042999L, var11)] = 2;
      } catch (NoSuchFieldError var24) {
      }

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7213552845951310983L.Ò<invokedynamic>(7213552845951310983L, var11).í<invokedynamic>(7213552845951310983L.Ò<invokedynamic>(7213552845951310983L, var11), 7212572093947042999L, var11)] = 3;
      } catch (NoSuchFieldError var23) {
      }

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7212355719805371282L.Ò<invokedynamic>(7212355719805371282L, var11).í<invokedynamic>(7212355719805371282L.Ò<invokedynamic>(7212355719805371282L, var11), 7212572093947042999L, var11)] = 4;
      } catch (NoSuchFieldError var22) {
      }

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7213636952023495637L.Ò<invokedynamic>(7213636952023495637L, var11).í<invokedynamic>(7213636952023495637L.Ò<invokedynamic>(7213636952023495637L, var11), 7212572093947042999L, var11)] = 5;
      } catch (NoSuchFieldError var21) {
      }

      try {
         7213486442063184311L.Ò<invokedynamic>(7213486442063184311L, var11)[7213237408189410328L.Ò<invokedynamic>(7213237408189410328L, var11).í<invokedynamic>(7213237408189410328L.Ò<invokedynamic>(7213237408189410328L, var11), 7212572093947042999L, var11)] = (int)var0[1];
      } catch (NoSuchFieldError var20) {
      }

      8 = new int[7212914016991858378L.o<invokedynamic>(7212914016991858378L, var11).length];

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7212726306254038548L.Ò<invokedynamic>(7212726306254038548L, var11).í<invokedynamic>(7212726306254038548L.Ò<invokedynamic>(7212726306254038548L, var11), 7211739946140561592L, var11)] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7211597818088403841L.Ò<invokedynamic>(7211597818088403841L, var11).í<invokedynamic>(7211597818088403841L.Ò<invokedynamic>(7211597818088403841L, var11), 7211739946140561592L, var11)] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7214478485860137157L.Ò<invokedynamic>(7214478485860137157L, var11).í<invokedynamic>(7214478485860137157L.Ò<invokedynamic>(7214478485860137157L, var11), 7211739946140561592L, var11)] = 3;
      } catch (NoSuchFieldError var17) {
      }

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7213162660623037814L.Ò<invokedynamic>(7213162660623037814L, var11).í<invokedynamic>(7213162660623037814L.Ò<invokedynamic>(7213162660623037814L, var11), 7211739946140561592L, var11)] = 4;
      } catch (NoSuchFieldError var16) {
      }

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7211411865459822826L.Ò<invokedynamic>(7211411865459822826L, var11).í<invokedynamic>(7211411865459822826L.Ò<invokedynamic>(7211411865459822826L, var11), 7211739946140561592L, var11)] = 5;
      } catch (NoSuchFieldError var15) {
      }

      try {
         7211773314181358996L.Ò<invokedynamic>(7211773314181358996L, var11)[7212821930738532093L.Ò<invokedynamic>(7212821930738532093L, var11).í<invokedynamic>(7212821930738532093L.Ò<invokedynamic>(7212821930738532093L, var11), 7211739946140561592L, var11)] = (int)var0[0];
      } catch (NoSuchFieldError var14) {
      }

   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (b[var4] != null) {
         return var4;
      } else {
         Object var5 = a[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 1;
               case 1 -> var10000 = 10;
               case 2 -> var10000 = 39;
               case 3 -> var10000 = 40;
               case 4 -> var10000 = 25;
               case 5 -> var10000 = 20;
               case 6 -> var10000 = 19;
               case 7 -> var10000 = 61;
               case 8 -> var10000 = 8;
               case 9 -> var10000 = 23;
               case 10 -> var10000 = 51;
               case 11 -> var10000 = 31;
               case 12 -> var10000 = 56;
               case 13 -> var10000 = 45;
               case 14 -> var10000 = 43;
               case 15 -> var10000 = 62;
               case 16 -> var10000 = 14;
               case 17 -> var10000 = 55;
               case 18 -> var10000 = 37;
               case 19 -> var10000 = 21;
               case 20 -> var10000 = 12;
               case 21 -> var10000 = 38;
               case 22 -> var10000 = 48;
               case 23 -> var10000 = 9;
               case 24 -> var10000 = 33;
               case 25 -> var10000 = 32;
               case 26 -> var10000 = 52;
               case 27 -> var10000 = 7;
               case 28 -> var10000 = 11;
               case 29 -> var10000 = 3;
               case 30 -> var10000 = 27;
               case 31 -> var10000 = 2;
               case 32 -> var10000 = 15;
               case 33 -> var10000 = 24;
               case 34 -> var10000 = 29;
               case 35 -> var10000 = 42;
               case 36 -> var10000 = 58;
               case 37 -> var10000 = 59;
               case 38 -> var10000 = 16;
               case 39 -> var10000 = 28;
               case 40 -> var10000 = 50;
               case 41 -> var10000 = 4;
               case 42 -> var10000 = 30;
               case 43 -> var10000 = 57;
               case 44 -> var10000 = 22;
               case 45 -> var10000 = 47;
               case 46 -> var10000 = 60;
               case 47 -> var10000 = 63;
               case 48 -> var10000 = 18;
               case 49 -> var10000 = 13;
               case 50 -> var10000 = 0;
               case 51 -> var10000 = 41;
               case 52 -> var10000 = 49;
               case 53 -> var10000 = 17;
               case 54 -> var10000 = 36;
               case 55 -> var10000 = 5;
               case 56 -> var10000 = 26;
               case 57 -> var10000 = 53;
               case 58 -> var10000 = 46;
               case 59 -> var10000 = 54;
               case 60 -> var10000 = 6;
               case 61 -> var10000 = 34;
               case 62 -> var10000 = 44;
               default -> var10000 = 35;
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

            b[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = a;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Integer.TYPE;
      b[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = a[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(b[var4]);
            a[var4] = var5;
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
      Object var5 = a[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = b[var4];
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
               a[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     a[var4] = var13;
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
      Object var5 = a[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = b[var4];
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
               a[var4] = var26;
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
                     a[var4] = var19;
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

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
