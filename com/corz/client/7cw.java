package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7cW {
   public static final int 7;
   public static final int 3;
   public static final int 9;
   public static final double 2 = 0.79;
   public static final int 4;
   private static final int[][] 5;
   private static final long a;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String TliMoRuzcI;

   private _cW/* $FF was: 7cW*/() {
   }

   static boolean _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0g _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static int _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 4Z _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 0g _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static Map _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 3*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static int _/* $FF was: 0*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static 738 _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 1*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 8*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static List _/* $FF was: 5*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      ArrayList var4 = new ArrayList((Set)var0[1]);
      var4.ø<invokedynamic>(var4, (long)"c", var1);
      return var4;
   }

   private static int _/* $FF was: 1*/(boolean param0, int param1, int param2, int param3, long param4, int param6, 73a param7, 73a param8) {
      // $FF: Couldn't be decompiled
   }

   private static double _/* $FF was: 7*/(long var0, Map var2, 73a var3) {
      var0 = a ^ var0;
      Set var10000 = (Set)var2.g<invokedynamic>(var2, var3.g<invokedynamic>(var3, (long)"c", var0).ø<invokedynamic>(var3.g<invokedynamic>(var3, (long)"c", var0), (long)"c", var0), (long)"c", var0);
      return (double)(-var10000.g<invokedynamic>(var10000, (long)"c", var0)) / ("c" + (double)var3.g<invokedynamic>(var3, (long)"c", var0));
   }

   private static boolean _/* $FF was: 5*/(long param0, int param2, 73a param3) {
      // $FF: Couldn't be decompiled
   }

   private static Set _/* $FF was: 2*/(Long var0) {
      return new HashSet();
   }

   private static boolean _/* $FF was: 0*/(Long var0, Long var1) {
      return true;
   }

   static {
      a.b99571f71427e3b19.a.init(7cW.class, 808);
      a = s.a(5261695634086279933L, -6387149730655621780L, MethodHandles.lookup().lookupClass()).a(187019837616694L);
      e = new Object[136];
      f = new String[136];
      a();
      d = new HashMap(13);
      long var0 = a ^ 75854068399106L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[10];
      int var5 = 0;
      String var6 = "ÿ&urWq\u0095+\u000f§ÈÖûÛ7\u0019ýµvü¾NÌ.ª\b³àÖÝúN'áÄ\u0080R\u0001Ë¸Û\u0016×aê*Î%\u0097Õ~âØ`T¾3Ò\u0088\u0005\u009a@VÔ";
      int var7 = "ÿ&urWq\u0095+\u000f§ÈÖûÛ7\u0019ýµvü¾NÌ.ª\b³àÖÝúN'áÄ\u0080R\u0001Ë¸Û\u0016×aê*Î%\u0097Õ~âØ`T¾3Ò\u0088\u0005\u009a@VÔ".length();
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
                     c = new Integer[10];
                     7 = true.f<invokedynamic>(5328, var0 ^ 577809847080256567L);
                     3 = true.f<invokedynamic>(13306, var0 ^ 4738341340900107036L);
                     9 = true.f<invokedynamic>(31421, var0 ^ 5309937631798323807L);
                     4 = true.f<invokedynamic>(24375, var0 ^ 239011809986858967L);
                     5 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "êUMTzè Ø\u0001ù¼Ü\u0019Åc,";
                  var7 = "êUMTzè Ø\u0001ù¼Ü\u0019Åc,".length();
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

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static native int a(long var0, long var2);

   private static native void a();

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

   private static native Field b(Class var0, String var1, Class var2);

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
