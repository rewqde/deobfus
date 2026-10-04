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

public enum 9Y {
   public static final 9Y 7;
   public static final 9Y 3;
   public static final 9Y 6;
   public static final 9Y 2;
   public static final 9Y 8;
   public static final 9Y 1;
   private static final 9Y[] 5;
   private static final long a;
   private static final long b;
   private static final Object[] c;
   private static final String[] d;

   private static 9Y[] _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(9Y.class, 276);
      a = s.a(8553678504063637994L, 2605733119942693587L, MethodHandles.lookup().lookupClass()).a(199562985534978L);
      long var14 = a ^ 57501118409550L;
      c = new Object[16];
      d = new String[16];
      a();
      Cipher var6;
      Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var7 = 1; var7 < 8; ++var7) {
         var10003[var7] = (byte)((int)(var14 << var7 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var5 = new String[6];
      int var11 = 0;
      String var10 = "#¨\u0002\u009eÜ´B\u001eÄâ»ÙMË\u0019¹\u0010\u0080àÛ:è\u009c\u0002\u007f\u0012p¬v\u0011\u0007&,\u0010\u0006w¾\u00adu¼ê40Qãí s\u00189\u0018#¨\u0002\u009eÜ´B\u001e@qO\u0019Ïzb¥1;Yæ\u0084P©&";
      int var12 = "#¨\u0002\u009eÜ´B\u001eÄâ»ÙMË\u0019¹\u0010\u0080àÛ:è\u009c\u0002\u007f\u0012p¬v\u0011\u0007&,\u0010\u0006w¾\u00adu¼ê40Qãí s\u00189\u0018#¨\u0002\u009eÜ´B\u001e@qO\u0019Ïzb¥1;Yæ\u0084P©&".length();
      char var9 = 16;
      int var17 = -1;

      label37:
      while(true) {
         ++var17;
         String var18 = var10.substring(var17, var17 + var9);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var6.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var13).intern();
            switch (var10001) {
               case 0:
                  var5[var11++] = var26;
                  if ((var17 += var9) >= var12) {
                     Cipher var0;
                     Cipher var20 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var28 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                     }

                     var20.init(2, var28.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8986146175563654887L;
                     byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                     long var29 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                     var10001 = -1;
                     b = var29;
                     7 = new 9Y(var5[4], 0);
                     3 = new 9Y(var5[3], 1);
                     6 = new 9Y(var5[1], 2);
                     2 = new 9Y(var5[5], 3);
                     8 = new 9Y(var5[0], 4);
                     1 = new 9Y(var5[2], 5);
                     5 = -2111352381402477704L.ì<invokedynamic>(-2111352381402477704L, var14);
                     return;
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var5[var11++] = var26;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label37;
                  }

                  var10 = "ðÖ5\u0004=ì>\u001e\u0010¥M¤_Ñ\u0018Eº¬lÕÂïsÇË";
                  var12 = "ðÖ5\u0004=ì>\u001e\u0010¥M¤_Ñ\u0018Eº¬lÕÂïsÇË".length();
                  var9 = '\b';
                  var17 = -1;
            }

            ++var17;
            var18 = var10.substring(var17, var17 + var9);
            var10001 = 0;
         }
      }
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

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (d[var4] != null) {
         return var4;
      } else {
         Object var5 = c[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 56;
               case 1 -> var10000 = 2;
               case 2 -> var10000 = 40;
               case 3 -> var10000 = 59;
               case 4 -> var10000 = 33;
               case 5 -> var10000 = 11;
               case 6 -> var10000 = 8;
               case 7 -> var10000 = 28;
               case 8 -> var10000 = 22;
               case 9 -> var10000 = 53;
               case 10 -> var10000 = 25;
               case 11 -> var10000 = 44;
               case 12 -> var10000 = 26;
               case 13 -> var10000 = 58;
               case 14 -> var10000 = 23;
               case 15 -> var10000 = 35;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 21;
               case 18 -> var10000 = 55;
               case 19 -> var10000 = 49;
               case 20 -> var10000 = 13;
               case 21 -> var10000 = 45;
               case 22 -> var10000 = 47;
               case 23 -> var10000 = 7;
               case 24 -> var10000 = 3;
               case 25 -> var10000 = 62;
               case 26 -> var10000 = 43;
               case 27 -> var10000 = 27;
               case 28 -> var10000 = 9;
               case 29 -> var10000 = 61;
               case 30 -> var10000 = 63;
               case 31 -> var10000 = 18;
               case 32 -> var10000 = 14;
               case 33 -> var10000 = 17;
               case 34 -> var10000 = 54;
               case 35 -> var10000 = 52;
               case 36 -> var10000 = 1;
               case 37 -> var10000 = 4;
               case 38 -> var10000 = 10;
               case 39 -> var10000 = 36;
               case 40 -> var10000 = 34;
               case 41 -> var10000 = 5;
               case 42 -> var10000 = 60;
               case 43 -> var10000 = 20;
               case 44 -> var10000 = 12;
               case 45 -> var10000 = 50;
               case 46 -> var10000 = 46;
               case 47 -> var10000 = 24;
               case 48 -> var10000 = 15;
               case 49 -> var10000 = 31;
               case 50 -> var10000 = 32;
               case 51 -> var10000 = 16;
               case 52 -> var10000 = 38;
               case 53 -> var10000 = 0;
               case 54 -> var10000 = 30;
               case 55 -> var10000 = 37;
               case 56 -> var10000 = 39;
               case 57 -> var10000 = 41;
               case 58 -> var10000 = 29;
               case 59 -> var10000 = 51;
               case 60 -> var10000 = 6;
               case 61 -> var10000 = 19;
               case 62 -> var10000 = 57;
               default -> var10000 = 48;
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

            d[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = c;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
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

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static Method d(long var0, long var2) {
      int var4 = a(var0, var2);
      Object var5 = c[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = d[var4];
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
               c[var4] = var26;
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
                     c[var4] = var19;
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
         if (var8 != 231 && var8 != 199 && var8 != 'h' && var8 != 213) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'f') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 236) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 231) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 199) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'h') {
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
