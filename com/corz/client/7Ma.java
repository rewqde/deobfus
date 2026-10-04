package com.corz.client;

import com.corz.client.schematic.RouteArbitration;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public record 7MA(6b 7, 39 8, 7O0 4, List<RouteArbitration.Phantom> 9, String 5) {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String cVZTnzIXJu;

   public _MA/* $FF was: 7MA*/(6b var1, 39 var2, 7O0 var3, List var4, String var5) {
      this.7 = var1;
      this.8 = var2;
      this.4 = var3;
      this.9 = var4;
      this.5 = var5;
   }

   public boolean _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   public 6b _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public 39 _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public 7O0 _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7MA.class, 462);
      a = s.a(1540695044344511544L, -2214353996144441829L, MethodHandles.lookup().lookupClass()).a(50963647340148L);
      e = new Object[27];
      f = new String[27];
      a();
      d = new HashMap(13);
      long var0 = a ^ 136538778476176L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = ")\bðO8X´¤9ø+å·\u0089'0ñZæ\u0084\u008a\u0089Ô\u0006SØçÂÃM½Ä\u0010IÀ·ÑÜ§kÝ7ùênÑÿG*\u0010Ó\u0011\u001fó{YBÂQ\u0010Aí4\u0003\u0019s\u0018©ñÔ\u009eù/óm)\u0014)l_\u001e»¤}Î \u0096\f\u0082\u0002¯";
      int var8 = ")\bðO8X´¤9ø+å·\u0089'0ñZæ\u0084\u008a\u0089Ô\u0006SØçÂÃM½Ä\u0010IÀ·ÑÜ§kÝ7ùênÑÿG*\u0010Ó\u0011\u001fó{YBÂQ\u0010Aí4\u0003\u0019s\u0018©ñÔ\u009eù/óm)\u0014)l_\u001e»¤}Î \u0096\f\u0082\u0002¯".length();
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
                     c = new String[6];
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

                  var6 = "\u009by§Èâ\u0015\r\u009e\b\u0001èL.U5,.T1Ìõ\u0096÷å4Z\u008f8\u0088Î°¸a\b\u0017°¾\u007f\u009a\u009e{<QØ\u009c¿ÂS mä×\u009dÊÎáfn©cDCÝÇx\u0094T\u0082\föxö\u0011 âÎ\u0017¸`-ï";
                  var8 = "\u009by§Èâ\u0015\r\u009e\b\u0001èL.U5,.T1Ìõ\u0096÷å4Z\u008f8\u0088Î°¸a\b\u0017°¾\u007f\u009a\u009e{<QØ\u009c¿ÂS mä×\u009dÊÎáfn©cDCÝÇx\u0094T\u0082\föxö\u0011 âÎ\u0017¸`-ï".length();
                  var5 = '0';
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

   private static native String a(int var0, long var1);

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

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
               case 0 -> var10000 = 38;
               case 1 -> var10000 = 35;
               case 2 -> var10000 = 15;
               case 3 -> var10000 = 2;
               case 4 -> var10000 = 46;
               case 5 -> var10000 = 20;
               case 6 -> var10000 = 23;
               case 7 -> var10000 = 44;
               case 8 -> var10000 = 4;
               case 9 -> var10000 = 31;
               case 10 -> var10000 = 1;
               case 11 -> var10000 = 14;
               case 12 -> var10000 = 50;
               case 13 -> var10000 = 34;
               case 14 -> var10000 = 30;
               case 15 -> var10000 = 57;
               case 16 -> var10000 = 42;
               case 17 -> var10000 = 22;
               case 18 -> var10000 = 3;
               case 19 -> var10000 = 28;
               case 20 -> var10000 = 21;
               case 21 -> var10000 = 36;
               case 22 -> var10000 = 43;
               case 23 -> var10000 = 52;
               case 24 -> var10000 = 26;
               case 25 -> var10000 = 19;
               case 26 -> var10000 = 18;
               case 27 -> var10000 = 32;
               case 28 -> var10000 = 60;
               case 29 -> var10000 = 7;
               case 30 -> var10000 = 48;
               case 31 -> var10000 = 33;
               case 32 -> var10000 = 49;
               case 33 -> var10000 = 13;
               case 34 -> var10000 = 25;
               case 35 -> var10000 = 10;
               case 36 -> var10000 = 62;
               case 37 -> var10000 = 27;
               case 38 -> var10000 = 29;
               case 39 -> var10000 = 11;
               case 40 -> var10000 = 63;
               case 41 -> var10000 = 17;
               case 42 -> var10000 = 12;
               case 43 -> var10000 = 47;
               case 44 -> var10000 = 24;
               case 45 -> var10000 = 8;
               case 46 -> var10000 = 16;
               case 47 -> var10000 = 0;
               case 48 -> var10000 = 51;
               case 49 -> var10000 = 39;
               case 50 -> var10000 = 61;
               case 51 -> var10000 = 40;
               case 52 -> var10000 = 56;
               case 53 -> var10000 = 37;
               case 54 -> var10000 = 54;
               case 55 -> var10000 = 58;
               case 56 -> var10000 = 9;
               case 57 -> var10000 = 59;
               case 58 -> var10000 = 53;
               case 59 -> var10000 = 55;
               case 60 -> var10000 = 5;
               case 61 -> var10000 = 45;
               case 62 -> var10000 = 6;
               default -> var10000 = 41;
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
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Integer.TYPE;
      f[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = Boolean.TYPE;
      f[9] = "c";
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
