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

public class 8V {
   public int 5;
   public int 6;
   public int 8;
   public int 3;
   public int 1;
   public int 7;
   public int 0;
   public int 4;
   public int 9;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String hkmzpqKalv;

   public void _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
      this.ð<invokedynamic>(this, 0, (long)"c", var2);
   }

   public String _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var4 = "c".w<invokedynamic>((long)"c", var2);

      int var10000;
      label32: {
         try {
            var10000 = this.v<invokedynamic>(this, (long)"c", var2);
            if (!var4) {
               return (boolean)var10000;
            }

            if (var10000 > 0) {
               break label32;
            }
         } catch (MatchException var5) {
            throw var5.w<invokedynamic>(var5, (long)"c", var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   static {
      a.b99571f71427e3b19.a.init(8V.class, 204);
      a = s.a(1003508796786066139L, -5254192679465914609L, MethodHandles.lookup().lookupClass()).a(144334160192400L);
      e = new Object[22];
      f = new String[22];
      a();
      d = new HashMap(13);
      long var0 = a ^ 59076710387307L;
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
      String var6 = "f»\u009a_Hk-Ô\u00054{\u0013:úeú\u0095*º³ÎéÌ;L·vîÕ}\u008e\u0093 ì\u0003\u0086^\u0002Ñ¨\u0012F´/8è\nûåã\u0081\u001b\u0019:(¸\u000eGd}\u000e\u0002øÎ@ ñäú»\u0084\u009b\u001f¬sr0ÓË³Õæ\u0087\u009a#\u0082\u0085b^¸ÂÐ)¢åì¼\u0098\u0010\u0085¡ÊGC\u0000Vð¶9´ Ö²\u001eF ü÷\u000fE%\u0006º¬\u001ab\u0096\u0013\u008c¾8ÛÊÅ\u00801\fÕ¹Y\u0084àÃ\u000fçÔ\u0014ª Y÷°\u0081\u0087 \u0093\u009bQYláä\u0089{³m¸Ê\u0094\u001eÞéDP÷ÈIÔ\u009b\bÖ\u0010\u0085\rçÌæ¼â\u008dòi\u0016\u00198bw\u0001";
      int var8 = "f»\u009a_Hk-Ô\u00054{\u0013:úeú\u0095*º³ÎéÌ;L·vîÕ}\u008e\u0093 ì\u0003\u0086^\u0002Ñ¨\u0012F´/8è\nûåã\u0081\u001b\u0019:(¸\u000eGd}\u000e\u0002øÎ@ ñäú»\u0084\u009b\u001f¬sr0ÓË³Õæ\u0087\u009a#\u0082\u0085b^¸ÂÐ)¢åì¼\u0098\u0010\u0085¡ÊGC\u0000Vð¶9´ Ö²\u001eF ü÷\u000fE%\u0006º¬\u001ab\u0096\u0013\u008c¾8ÛÊÅ\u00801\fÕ¹Y\u0084àÃ\u000fçÔ\u0014ª Y÷°\u0081\u0087 \u0093\u009bQYláä\u0089{³m¸Ê\u0094\u001eÞéDP÷ÈIÔ\u009b\bÖ\u0010\u0085\rçÌæ¼â\u008dòi\u0016\u00198bw\u0001".length();
      char var5 = ' ';
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

                  var6 = "-¿³k´j'eØ\u000b\u001cN!m·¿9y\u0012qDø\u008a0ªï\u001f\"cb\u009fz Y\u0080\u0086Ut]\u008bÆc?Ò\u0092þ\u008d7ÜØ\u008dòS*Ù\u0000zV9©x·¾ð9";
                  var8 = "-¿³k´j'eØ\u000b\u001cN!m·¿9y\u0012qDø\u008a0ªï\u001f\"cb\u009fz Y\u0080\u0086Ut]\u008bÆc?Ò\u0092þ\u008d7ÜØ\u008dòS*Ù\u0000zV9©x·¾ð9".length();
                  var5 = ' ';
                  var12 = -1;
            }

            ++var12;
            var13 = var6.substring(var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
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
               case 0 -> var10000 = 30;
               case 1 -> var10000 = 32;
               case 2 -> var10000 = 14;
               case 3 -> var10000 = 12;
               case 4 -> var10000 = 29;
               case 5 -> var10000 = 13;
               case 6 -> var10000 = 2;
               case 7 -> var10000 = 43;
               case 8 -> var10000 = 48;
               case 9 -> var10000 = 62;
               case 10 -> var10000 = 19;
               case 11 -> var10000 = 22;
               case 12 -> var10000 = 6;
               case 13 -> var10000 = 23;
               case 14 -> var10000 = 40;
               case 15 -> var10000 = 46;
               case 16 -> var10000 = 52;
               case 17 -> var10000 = 26;
               case 18 -> var10000 = 3;
               case 19 -> var10000 = 51;
               case 20 -> var10000 = 56;
               case 21 -> var10000 = 54;
               case 22 -> var10000 = 34;
               case 23 -> var10000 = 20;
               case 24 -> var10000 = 49;
               case 25 -> var10000 = 15;
               case 26 -> var10000 = 17;
               case 27 -> var10000 = 28;
               case 28 -> var10000 = 10;
               case 29 -> var10000 = 39;
               case 30 -> var10000 = 27;
               case 31 -> var10000 = 47;
               case 32 -> var10000 = 16;
               case 33 -> var10000 = 21;
               case 34 -> var10000 = 9;
               case 35 -> var10000 = 4;
               case 36 -> var10000 = 55;
               case 37 -> var10000 = 1;
               case 38 -> var10000 = 60;
               case 39 -> var10000 = 5;
               case 40 -> var10000 = 61;
               case 41 -> var10000 = 0;
               case 42 -> var10000 = 44;
               case 43 -> var10000 = 35;
               case 44 -> var10000 = 24;
               case 45 -> var10000 = 57;
               case 46 -> var10000 = 36;
               case 47 -> var10000 = 7;
               case 48 -> var10000 = 53;
               case 49 -> var10000 = 8;
               case 50 -> var10000 = 31;
               case 51 -> var10000 = 63;
               case 52 -> var10000 = 25;
               case 53 -> var10000 = 33;
               case 54 -> var10000 = 42;
               case 55 -> var10000 = 38;
               case 56 -> var10000 = 18;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 58;
               case 59 -> var10000 = 41;
               case 60 -> var10000 = 50;
               case 61 -> var10000 = 45;
               case 62 -> var10000 = 37;
               default -> var10000 = 59;
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
      var10000[6] = Boolean.TYPE;
      f[6] = "c";
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
         if (var8 != 'v' && var8 != 240 && var8 != 234 && var8 != 'X') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'p') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'w') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'v') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 240) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 234) {
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
