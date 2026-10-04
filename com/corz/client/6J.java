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

public record 6j(K 8, int 6, int 0, int 5, int 1, int 9, int 2, int 7, int 4) {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String UDLbrgKMWu;

   public _j/* $FF was: 6j*/(Object var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.8 = var1;
      this.6 = var2;
      this.0 = var3;
      this.5 = var4;
      this.1 = var5;
      this.9 = var6;
      this.2 = var7;
      this.7 = var8;
      this.4 = var9;
   }

   public static 6j _/* $FF was: 6*/(Object param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public Object _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(6j.class, 134);
      a = s.a(1357203917131308982L, -2686300764429316148L, MethodHandles.lookup().lookupClass()).a(165206814740184L);
      e = new Object[20];
      f = new String[20];
      a();
      d = new HashMap(13);
      long var0 = a ^ 39850840007896L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "à\u008eï\u0011±ý\u0080Û§×\u009d\u0095}\u009ff?\u0087j\u000fº\u008a\u008b\u0013 \u0000*\u0096Òàk\fÄ]\u001c\u0097h^) \u0001\u0018ï\u008f5²G\u009e,zïÚ\u0011ð({j¡ \u007f\u00856.\u000bÚX(\f\u0019\u0019¼¿}çá\u00adÐ¯8'\u001fÖ3òèpúN0[[¼à\u009b2Ø\u00170r\u0083-lÃ¢LJ\u0086  Ç\u0012íI\u0087÷W¡â\u009aH´`\u008fB\u0085\u0081½¦s÷²\u008eà´g\r~\u0088ò\u008b \u0083êã\u009eXÝ½â^7\u0006üjÆÙ\u0015àvy\u008c\u000fn³\u009d ½Ñ1C*Fx0PÛZ¥s\u0083\u008f\u0005Þw7ë\u0013Õë©f\u0086ÎVÿ©\u0006H\u0088ì)gÀÈ _ïxcl|]]É\u0095Ô³\u001f>yåà\u0018\u009a~bð©\u0092%Æ\u0084\u008eä*ô\u0093\u0005ÂDÏ¹U\r4õD";
      int var8 = "à\u008eï\u0011±ý\u0080Û§×\u009d\u0095}\u009ff?\u0087j\u000fº\u008a\u008b\u0013 \u0000*\u0096Òàk\fÄ]\u001c\u0097h^) \u0001\u0018ï\u008f5²G\u009e,zïÚ\u0011ð({j¡ \u007f\u00856.\u000bÚX(\f\u0019\u0019¼¿}çá\u00adÐ¯8'\u001fÖ3òèpúN0[[¼à\u009b2Ø\u00170r\u0083-lÃ¢LJ\u0086  Ç\u0012íI\u0087÷W¡â\u009aH´`\u008fB\u0085\u0081½¦s÷²\u008eà´g\r~\u0088ò\u008b \u0083êã\u009eXÝ½â^7\u0006üjÆÙ\u0015àvy\u008c\u000fn³\u009d ½Ñ1C*Fx0PÛZ¥s\u0083\u008f\u0005Þw7ë\u0013Õë©f\u0086ÎVÿ©\u0006H\u0088ì)gÀÈ _ïxcl|]]É\u0095Ô³\u001f>yåà\u0018\u009a~bð©\u0092%Æ\u0084\u008eä*ô\u0093\u0005ÂDÏ¹U\r4õD".length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while(true) {
         ++var12;
         String var13 = var6.substring(var12, var12 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0082\u0016E\u009d\u0080\u0090\u000e/·àÎ4<T\u0082±ÝÌO¨1³hø£mßçnZõ:¤}BF\u0096Â¨\u008dv±Ãæ\u0016\u009aà/íØ#·e\u009fó\u0088\u0018³ø\ròúé+B¬\u0007ÈBz\u0006\u0099\u0005ÑF®LM\u001c;à";
                  var8 = "\u0082\u0016E\u009d\u0080\u0090\u000e/·àÎ4<T\u0082±ÝÌO¨1³hø£mßçnZõ:¤}BF\u0096Â¨\u008dv±Ãæ\u0016\u009aà/íØ#·e\u009fó\u0088\u0018³ø\ròúé+B¬\u0007ÈBz\u0006\u0099\u0005ÑF®LM\u001c;à".length();
                  var5 = '8';
                  var12 = -1;
            }

            ++var12;
            var13 = var6.substring(var12, var12 + var5);
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

   private static String a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

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
               case 0 -> var10000 = 56;
               case 1 -> var10000 = 28;
               case 2 -> var10000 = 48;
               case 3 -> var10000 = 24;
               case 4 -> var10000 = 63;
               case 5 -> var10000 = 50;
               case 6 -> var10000 = 17;
               case 7 -> var10000 = 53;
               case 8 -> var10000 = 59;
               case 9 -> var10000 = 5;
               case 10 -> var10000 = 19;
               case 11 -> var10000 = 13;
               case 12 -> var10000 = 31;
               case 13 -> var10000 = 16;
               case 14 -> var10000 = 37;
               case 15 -> var10000 = 40;
               case 16 -> var10000 = 11;
               case 17 -> var10000 = 52;
               case 18 -> var10000 = 38;
               case 19 -> var10000 = 62;
               case 20 -> var10000 = 6;
               case 21 -> var10000 = 51;
               case 22 -> var10000 = 36;
               case 23 -> var10000 = 20;
               case 24 -> var10000 = 58;
               case 25 -> var10000 = 1;
               case 26 -> var10000 = 57;
               case 27 -> var10000 = 39;
               case 28 -> var10000 = 35;
               case 29 -> var10000 = 43;
               case 30 -> var10000 = 10;
               case 31 -> var10000 = 49;
               case 32 -> var10000 = 44;
               case 33 -> var10000 = 32;
               case 34 -> var10000 = 3;
               case 35 -> var10000 = 33;
               case 36 -> var10000 = 27;
               case 37 -> var10000 = 29;
               case 38 -> var10000 = 26;
               case 39 -> var10000 = 54;
               case 40 -> var10000 = 25;
               case 41 -> var10000 = 42;
               case 42 -> var10000 = 41;
               case 43 -> var10000 = 7;
               case 44 -> var10000 = 23;
               case 45 -> var10000 = 47;
               case 46 -> var10000 = 30;
               case 47 -> var10000 = 61;
               case 48 -> var10000 = 45;
               case 49 -> var10000 = 22;
               case 50 -> var10000 = 55;
               case 51 -> var10000 = 14;
               case 52 -> var10000 = 0;
               case 53 -> var10000 = 34;
               case 54 -> var10000 = 9;
               case 55 -> var10000 = 8;
               case 56 -> var10000 = 21;
               case 57 -> var10000 = 2;
               case 58 -> var10000 = 4;
               case 59 -> var10000 = 18;
               case 60 -> var10000 = 15;
               case 61 -> var10000 = 12;
               case 62 -> var10000 = 46;
               default -> var10000 = 60;
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

   private static native void a();

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
         if (var8 != 165 && var8 != 228 && var8 != 'n' && var8 != 'd') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'K') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 207) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 165) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 228) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'n') {
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
