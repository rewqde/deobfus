package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 5b {
   private static final long a;
   private static final Object[] b;
   private static final String[] c;
   // $FF: synthetic field
   private static transient String FJZaaIRKup;

   private _b/* $FF was: 5b*/() {
   }

   public static 7TE _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 2*/(Object[] var0) {
      boolean var3 = (Boolean)var0[3];
      long var4 = (Long)var0[0];
      boolean var8 = (Boolean)var0[1];
      boolean var9 = (Boolean)var0[5];
      boolean var1 = (Boolean)var0[4];
      boolean var7 = (Boolean)var0[2];
      boolean var2 = (Boolean)var0[6];
      boolean var6 = (Boolean)var0[7];
      var4 = a ^ var4;
      boolean var10 = "c".E<invokedynamic>((long)"c", var4);

      boolean var10000;
      label209: {
         label210: {
            label159: {
               try {
                  var10000 = var8;
                  if (var10) {
                     break label159;
                  }

                  if (!var8) {
                     break label210;
                  }
               } catch (MatchException var22) {
                  throw var22.E<invokedynamic>(var22, (long)"c", var4);
               }

               var10000 = var7;
            }

            boolean var10001;
            label152: {
               label151: {
                  try {
                     var10001 = var10;
                     if (0L >= var4) {
                        break label152;
                     }

                     if (var10) {
                        break label151;
                     }

                     if (var10000) {
                        break label210;
                     }
                  } catch (MatchException var21) {
                     throw var21.E<invokedynamic>(var21, (long)"c", var4);
                  }

                  var10000 = var3;
               }

               try {
                  var10001 = var10;
               } catch (MatchException var20) {
                  var24 = var20;
                  var10001 = false;
                  throw var24.E<invokedynamic>(var24, (long)"c", var4);
               }
            }

            label139: {
               label138: {
                  try {
                     if (0L >= var4) {
                        break label139;
                     }

                     if (var10001) {
                        break label138;
                     }

                     if (var10000) {
                        break label210;
                     }
                  } catch (MatchException var19) {
                     var24 = var19;
                     var10001 = false;
                     throw var24.E<invokedynamic>(var24, (long)"c", var4);
                  }

                  var10000 = var1;
               }

               try {
                  var10001 = var10;
               } catch (MatchException var18) {
                  var25 = var18;
                  var10001 = false;
                  throw var25.E<invokedynamic>(var25, (long)"c", var4);
               }
            }

            label125: {
               label124: {
                  try {
                     if (var4 < 0L) {
                        break label125;
                     }

                     if (var10001) {
                        break label124;
                     }

                     if (var10000) {
                        break label210;
                     }
                  } catch (MatchException var17) {
                     var25 = var17;
                     var10001 = false;
                     throw var25.E<invokedynamic>(var25, (long)"c", var4);
                  }

                  var10000 = var9;
               }

               try {
                  var10001 = var10;
               } catch (MatchException var16) {
                  var26 = var16;
                  var10001 = false;
                  throw var26.E<invokedynamic>(var26, (long)"c", var4);
               }
            }

            label111: {
               label110: {
                  try {
                     if ("c" < var4) {
                        break label111;
                     }

                     if (var10001) {
                        break label110;
                     }

                     if (var10000) {
                        break label210;
                     }
                  } catch (MatchException var15) {
                     var26 = var15;
                     var10001 = false;
                     throw var26.E<invokedynamic>(var26, (long)"c", var4);
                  }

                  var10000 = var2;
               }

               try {
                  var10001 = var10;
               } catch (MatchException var14) {
                  var27 = var14;
                  var10001 = false;
                  throw var27.E<invokedynamic>(var27, (long)"c", var4);
               }
            }

            label97: {
               label96: {
                  try {
                     if ("c" <= var4) {
                        break label97;
                     }

                     if (var10001) {
                        break label96;
                     }

                     if (var10000) {
                        break label210;
                     }
                  } catch (MatchException var13) {
                     var27 = var13;
                     var10001 = false;
                     throw var27.E<invokedynamic>(var27, (long)"c", var4);
                  }

                  var10000 = var6;
               }

               try {
                  var10001 = var10;
               } catch (MatchException var12) {
                  var28 = var12;
                  var10001 = false;
                  throw var28.E<invokedynamic>(var28, (long)"c", var4);
               }
            }

            try {
               if (var10001) {
                  return var10000;
               }

               if (!var10000) {
                  break label209;
               }
            } catch (MatchException var11) {
               var28 = var11;
               var10001 = false;
               throw var28.E<invokedynamic>(var28, (long)"c", var4);
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      a.b99571f71427e3b19.a.init(5b.class, 32);
      a = s.a(-5102389280487025541L, -6142570015005133071L, MethodHandles.lookup().lookupClass()).a(175223066869302L);
      b = new Object[24];
      c = new String[24];
      a();
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int a(long var0, long var2);

   private static native void a();

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = b[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(c[var4]);
            b[var4] = var5;
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
      Object var5 = b[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = c[var4];
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
               b[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     b[var4] = var13;
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
      Object var5 = b[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = c[var4];
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
               b[var4] = var26;
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
                     b[var4] = var19;
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
         if (var8 != 'F' && var8 != 's' && var8 != 228 && var8 != 'U') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'P') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'E') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'F') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 's') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 228) {
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
