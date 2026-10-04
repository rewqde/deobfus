package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface 4u {
   Object[] a = new Object[13];
   String[] b = new String[13];

   boolean _/* $FF was: 0*/(Object[] var1);

   default boolean _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   boolean _/* $FF was: 1*/(Object[] var1);

   default boolean _/* $FF was: 6*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   boolean _/* $FF was: 2*/(Object[] var1);

   boolean _/* $FF was: 8*/(Object[] var1);

   private static MatchException b(MatchException var0) {
      return var0;
   }

   static {
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
               case 0 -> var10000 = 62;
               case 1 -> var10000 = 9;
               case 2 -> var10000 = 60;
               case 3 -> var10000 = 5;
               case 4 -> var10000 = 34;
               case 5 -> var10000 = 41;
               case 6 -> var10000 = 2;
               case 7 -> var10000 = 16;
               case 8 -> var10000 = 23;
               case 9 -> var10000 = 59;
               case 10 -> var10000 = 17;
               case 11 -> var10000 = 20;
               case 12 -> var10000 = 35;
               case 13 -> var10000 = 53;
               case 14 -> var10000 = 37;
               case 15 -> var10000 = 24;
               case 16 -> var10000 = 57;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 11;
               case 19 -> var10000 = 58;
               case 20 -> var10000 = 8;
               case 21 -> var10000 = 15;
               case 22 -> var10000 = 49;
               case 23 -> var10000 = 25;
               case 24 -> var10000 = 38;
               case 25 -> var10000 = 0;
               case 26 -> var10000 = 14;
               case 27 -> var10000 = 32;
               case 28 -> var10000 = 47;
               case 29 -> var10000 = 29;
               case 30 -> var10000 = 39;
               case 31 -> var10000 = 3;
               case 32 -> var10000 = 10;
               case 33 -> var10000 = 56;
               case 34 -> var10000 = 45;
               case 35 -> var10000 = 30;
               case 36 -> var10000 = 6;
               case 37 -> var10000 = 21;
               case 38 -> var10000 = 19;
               case 39 -> var10000 = 42;
               case 40 -> var10000 = 36;
               case 41 -> var10000 = 31;
               case 42 -> var10000 = 54;
               case 43 -> var10000 = 7;
               case 44 -> var10000 = 43;
               case 45 -> var10000 = 63;
               case 46 -> var10000 = 51;
               case 47 -> var10000 = 33;
               case 48 -> var10000 = 28;
               case 49 -> var10000 = 50;
               case 50 -> var10000 = 1;
               case 51 -> var10000 = 44;
               case 52 -> var10000 = 22;
               case 53 -> var10000 = 40;
               case 54 -> var10000 = 48;
               case 55 -> var10000 = 18;
               case 56 -> var10000 = 13;
               case 57 -> var10000 = 55;
               case 58 -> var10000 = 52;
               case 59 -> var10000 = 27;
               case 60 -> var10000 = 12;
               case 61 -> var10000 = 26;
               case 62 -> var10000 = 46;
               default -> var10000 = 4;
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
      var10000[0] = " 55\toi1 vD`o&4,\t8s";
      var10000[1] = "`}\u0019w1\u0006\u0015]\u0012x ItS\u0019s$\u0013\u0000";
      var10000[2] = Boolean.TYPE;
      b[2] = "java/lang/Boolean";
      var10000[3] = "\u0019YXq3v\u0012VI>P{\u0007[FUey\u0016HZyrt";
      var10000[4] = "N\u0002j\u001dd]_\u0017)Pk[H\u0003s\u001d0F\u001a";
      var10000[5] = "_Zew\t-*znx\u0018bKtes\u001c8?";
      var10000[6] = "d-ti&\u0016\u0011\r\u007ff7Yp\u0003tm3\u0003\u0004";
      var10000[7] = "$;\u000f.9\u001b/4\u001eaX\u0015$?\u001a;";
      var10000[8] = "* )_\u001fH/q%\u0003zI\u0011v S\u001c\u001ex)}\u0002\u001ew";
      var10000[9] = "MejL-\u000fM;&w+~\u0016g*J}\u0010Q~i\u001a\u0012D\u0013k1\u001e{\u001bN:3w";
      var10000[10] = "\u0003\tn@\\c\u0003W\"{X\u0012X\u000b.F\f|\u001f\u0012m\u0016c(]\u00075\u0012\nw\u0000V7{";
      var10000[11] = "SQ]W)1S\u000f\u0011l.@\bS\u001dQy.OJ^\u0001\u0016z\r_\u0006\u0005\u007f%P\u000e\u0004l";
      var10000[12] = "!@C)_C!\u001e\u000f\u0012\n2|\u001e\u0001-\u001fNz\u001fDo`\by^Am\u001c\u000ex\u001b\u0003\u0012";
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

            if (var12.getName().equals("java.lang.Object")) {
               StringBuffer var19 = new StringBuffer();
               var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
               throw new RuntimeException(var19.toString());
            }

            var12 = var12.getSuperclass();
            if (var12 == null) {
               var12 = b(518626498961311L, 0L);
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

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 224 && var8 != 'B' && var8 != 240 && var8 != 'D') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 236) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 219) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 224) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'B') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 240) {
               var9 = var0.findStaticGetter(var12, var20, var14);
            } else {
               var9 = var0.findStaticSetter(var12, var20, var14);
            }
         }

         return MethodHandles.dropArguments(var9, var3.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
      } catch (Exception var15) {
         StringBuilder var13 = new StringBuilder();
         var13.append(var15.getClass().getName()).append(" : ").append(var10 != null ? var10.toString() : (var11 != null ? var11.toString() : " null ")).append(" : ").append(var15.toString());
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

   private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/corz/client/4u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
