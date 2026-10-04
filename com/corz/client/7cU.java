package com.corz.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1269;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2818;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_638;

public class 7cu {
   private static final long a;
   private static final String b;
   private static final Object[] c;
   private static final String[] d;
   // $FF: synthetic field
   private static transient String PSzfWLhzfq;

   public static Stream _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 4*/(Object[] var0) {
      class_2248 var4 = (class_2248)var0[2];
      long var1 = (Long)var0[0];
      var1 = a ^ var1;

      boolean var7;
      try {
         class_638 var10000 = "c".U<invokedynamic>((long)"c", var1).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var1), (long)"c", var1);
         if (var10000.b<invokedynamic>(var10000, (class_2338)var0[1], (long)"c", var1).b<invokedynamic>(var10000.b<invokedynamic>(var10000, (class_2338)var0[1], (long)"c", var1), (long)"c", var1) == var4) {
            var7 = true;
            return var7;
         }
      } catch (IllegalStateException var5) {
         throw var5.t<invokedynamic>(var5, (long)"c", var1);
      }

      var7 = false;
      return var7;
   }

   public static boolean _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean _/* $FF was: 9*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static void _/* $FF was: 8*/(Object[] var0) {
      long var3 = (Long)var0[1];
      boolean var1 = (Boolean)var0[2];
      var3 = a ^ var3;
      boolean var10000 = "c".t<invokedynamic>((long)"c", var3);
      class_636 var10001 = "c".U<invokedynamic>((long)"c", var3).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var3), (long)"c", var3);
      class_1269 var6 = var10001.b<invokedynamic>(var10001, "c".U<invokedynamic>((long)"c", var3).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var3), (long)"c", var3), "c".U<invokedynamic>((long)"c", var3), (class_3965)var0[0], (long)"c", var3);
      boolean var5 = var10000;

      label26: {
         try {
            var10000 = var6 instanceof class_1269.class_9860;
            if (var5) {
               break label26;
            }

            if (!var10000) {
               return;
            }
         } catch (IllegalStateException var8) {
            throw var8.t<invokedynamic>(var8, (long)"c", var3);
         }

         var10000 = var1;
      }

      try {
         if (var10000) {
            "c".U<invokedynamic>((long)"c", var3).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var3), (long)"c", var3).b<invokedynamic>("c".U<invokedynamic>((long)"c", var3).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var3), (long)"c", var3), "c".U<invokedynamic>((long)"c", var3), (long)"c", var3);
         }
      } catch (IllegalStateException var7) {
         throw var7.t<invokedynamic>(var7, (long)"c", var3);
      }

   }

   private static class_2818 _/* $FF was: 8*/(byte var0, long var1, class_1923 var3) {
      long var4 = ((long)var0 << 56 | var1 << 8 >>> 8) ^ a;
      class_638 var10000 = "c".U<invokedynamic>((long)"c", var4).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var4), (long)"c", var4);
      return var10000.b<invokedynamic>(var10000, var3.ö<invokedynamic>(var3, (long)"c", var4), var3.ö<invokedynamic>(var3, (long)"c", var4), (long)"c", var4);
   }

   private static boolean _/* $FF was: 5*/(long var0, class_1923 var2) {
      var0 = a ^ var0;
      class_638 var10000 = "c".U<invokedynamic>((long)"c", var0).ö<invokedynamic>("c".U<invokedynamic>((long)"c", var0), (long)"c", var0);
      return var10000.b<invokedynamic>(var10000, var2.ö<invokedynamic>(var2, (long)"c", var0), var2.ö<invokedynamic>(var2, (long)"c", var0), (long)"c", var0);
   }

   private static class_1923 _/* $FF was: 3*/(class_1923 var0, long var1, class_1923 var3, class_1923 var4) {
      var1 = a ^ var1;
      int var6 = var4.ö<invokedynamic>(var4, (long)"c", var1);
      int var7 = var4.ö<invokedynamic>(var4, (long)"c", var1);
      int var10000 = "c".t<invokedynamic>((long)"c", var1);
      ++var6;
      boolean var5 = (boolean)var10000;

      label31: {
         label30: {
            try {
               var10000 = var6;
               if (!var5) {
                  break label31;
               }

               if (var6 <= var0.ö<invokedynamic>(var0, (long)"c", var1)) {
                  break label30;
               }
            } catch (IllegalStateException var9) {
               throw var9.t<invokedynamic>(var9, (long)"c", var1);
            }

            var6 = var3.ö<invokedynamic>(var3, (long)"c", var1);
            ++var7;
         }

         var10000 = var7;
      }

      try {
         if (var10000 > var0.ö<invokedynamic>(var0, (long)"c", var1)) {
            throw new IllegalStateException(b);
         }
      } catch (IllegalStateException var8) {
         throw var8.t<invokedynamic>(var8, (long)"c", var1);
      }

      return new class_1923(var6, var7);
   }

   static {
      a.b99571f71427e3b19.a.init(7cu.class, 40);
      a = s.a(1628222428131682558L, -7216690271493363435L, MethodHandles.lookup().lookupClass()).a(222758513554846L);
      c = new Object[63];
      d = new String[63];
      a();
      long var0 = a ^ 131597570428082L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001c~\u0014\u0010ìB®\u009541û\u0091\u0098\u0018\ny\u0006pýW\u008brL\u00144±à\u0083v\u0092@0".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
   }

   private static IllegalStateException a(IllegalStateException var0) {
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

   private static native int a(long var0, long var2);

   private static void a() {
      Object[] var10000 = c;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      d[1] = "c";
      var10000[2] = "c";
      var10000[3] = Boolean.TYPE;
      d[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Long.TYPE;
      d[12] = "c";
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
      var10000[33] = Void.TYPE;
      d[33] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = c[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(d[var4]);
            c[var4] = var5;
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
