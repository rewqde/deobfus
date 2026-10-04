package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;

public class 73m implements 7Om {
   final class_2338 2;
   final class_2680 8;
   final double 5;
   final 9J 1;
   private static final Object[] a;
   private static final String[] b;
   // $FF: synthetic field
   private static transient String FlYKLqpkIb;

   _3m/* $FF was: 73m*/(9J var1, class_2338 var2, class_2680 var3, double var4) {
      this.1 = var1;
      this.2 = var2;
      this.8 = var3;
      this.5 = var4;
   }

   public 73i _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 4*/(Object[] var1) {
      double var7 = (Double)var1[2];
      double var5 = (Double)var1[1];
      long var9 = (Long)var1[3];
      double var3 = (Double)var1[0];
      6M var2 = (6M)var1[4];
      String var11 = "c";

      String var10000;
      label17: {
         try {
            if (var2 == 6M.0) {
               var10000 = "c";
               break label17;
            }
         } catch (MatchException var15) {
            throw var15.Ê<invokedynamic>(var15, (long)"c", var9);
         }

         var10000 = "c";
      }

      String var13 = var10000;
      return 9a.4.field_1687.method_18026(new class_238(var3 - var11, var5 + "c", var7 - var11, var3 + var11, var5 + var13 - "c", var7 + var11));
   }

   public boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   static {
      a.b99571f71427e3b19.a.init(73m.class, 803);
      a = new Object[7];
      b = new String[7];
      a();
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
               case 0 -> var10000 = 58;
               case 1 -> var10000 = 34;
               case 2 -> var10000 = 22;
               case 3 -> var10000 = 28;
               case 4 -> var10000 = 8;
               case 5 -> var10000 = 42;
               case 6 -> var10000 = 14;
               case 7 -> var10000 = 11;
               case 8 -> var10000 = 29;
               case 9 -> var10000 = 52;
               case 10 -> var10000 = 39;
               case 11 -> var10000 = 20;
               case 12 -> var10000 = 17;
               case 13 -> var10000 = 0;
               case 14 -> var10000 = 16;
               case 15 -> var10000 = 30;
               case 16 -> var10000 = 62;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 2;
               case 19 -> var10000 = 53;
               case 20 -> var10000 = 44;
               case 21 -> var10000 = 57;
               case 22 -> var10000 = 33;
               case 23 -> var10000 = 51;
               case 24 -> var10000 = 24;
               case 25 -> var10000 = 41;
               case 26 -> var10000 = 23;
               case 27 -> var10000 = 7;
               case 28 -> var10000 = 60;
               case 29 -> var10000 = 49;
               case 30 -> var10000 = 25;
               case 31 -> var10000 = 31;
               case 32 -> var10000 = 12;
               case 33 -> var10000 = 5;
               case 34 -> var10000 = 56;
               case 35 -> var10000 = 18;
               case 36 -> var10000 = 6;
               case 37 -> var10000 = 15;
               case 38 -> var10000 = 63;
               case 39 -> var10000 = 36;
               case 40 -> var10000 = 26;
               case 41 -> var10000 = 40;
               case 42 -> var10000 = 27;
               case 43 -> var10000 = 3;
               case 44 -> var10000 = 9;
               case 45 -> var10000 = 54;
               case 46 -> var10000 = 46;
               case 47 -> var10000 = 47;
               case 48 -> var10000 = 48;
               case 49 -> var10000 = 45;
               case 50 -> var10000 = 59;
               case 51 -> var10000 = 38;
               case 52 -> var10000 = 37;
               case 53 -> var10000 = 55;
               case 54 -> var10000 = 32;
               case 55 -> var10000 = 35;
               case 56 -> var10000 = 4;
               case 57 -> var10000 = 50;
               case 58 -> var10000 = 13;
               case 59 -> var10000 = 19;
               case 60 -> var10000 = 43;
               case 61 -> var10000 = 1;
               case 62 -> var10000 = 21;
               default -> var10000 = 10;
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
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
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
