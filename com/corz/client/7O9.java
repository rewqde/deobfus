package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public record 7O9(9t 8, long 3, int 5, int 2, 56 0, boolean 6, boolean 7, int 4) {
   public static final 7O9 9;
   private static final long a;
   private static final Object[] b;
   private static final String[] c;
   // $FF: synthetic field
   private static transient String FYRTQGxVbw;

   public _O9/* $FF was: 7O9*/(9t var1, long var2, int var4, int var5, 56 var6, boolean var7, boolean var8, int var9) {
      this.8 = var1;
      this.3 = var2;
      this.5 = var4;
      this.2 = var5;
      this.0 = var6;
      this.6 = var7;
      this.7 = var8;
      this.4 = var9;
   }

   public static 7O9 _/* $FF was: 7*/(long param0, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public static 7O9 _/* $FF was: 7*/(9t param0, long param1, 56 param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public 7O9 _/* $FF was: 3*/(int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public 9t _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public 56 _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7O9.class, 555);
      a = s.a(-1077454760327271360L, -8144255399572944325L, MethodHandles.lookup().lookupClass()).a(279993040360101L);
      long var0 = a ^ 68563220035974L;
      b = new Object[20];
      c = new String[20];
      a();
      9 = new 7O9((9t)null, 0L, 0, 0, 2343035947671267285L.c<invokedynamic>(2343035947671267285L, var0), false, true, 0);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = b;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = Boolean.TYPE;
      c[3] = "c";
      var10000[4] = Integer.TYPE;
      c[4] = "c";
      var10000[5] = Long.TYPE;
      c[5] = "c";
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

   private static native Field b(Class var0, String var1, Class var2);

   private static native Field c(long var0, long var2);

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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 'J' && var8 != 213 && var8 != 'c' && var8 != 'r') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 207) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'u') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'J') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 213) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'c') {
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
