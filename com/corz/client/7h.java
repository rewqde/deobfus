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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 7H {
   private final 7Mk 9;
   private final List 1;
   private final List 5;
   private final int 8;
   private final double 0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String YCrDAAcCCo;

   public _H/* $FF was: 7H*/(7Mk var1, List var2, List var3, long var4, int var6, double var7) {
      var4 = a ^ var4;
      super();
      this.9 = var1;
      this.1 = var2.c<invokedynamic>(var2, (long)"c", var4);
      this.5 = var3.c<invokedynamic>(var3, (long)"c", var4);
      this.8 = var6;
      this.0 = var7;
   }

   public 7Mk _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.i<invokedynamic>(this, (long)"c", var2);
   }

   public List _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.i<invokedynamic>(this, (long)"c", var2);
   }

   public List _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.i<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 5*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.i<invokedynamic>(this, (long)"c", var2);
   }

   public int _/* $FF was: 0*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var5 = 0;
      int var10000 = "c".c<invokedynamic>((long)"c", var2);
      List var10001 = this.i<invokedynamic>(this, (long)"c", var2);
      Iterator var6 = var10001.Ý<invokedynamic>(var10001, (long)"c", var2);
      boolean var4 = (boolean)var10000;

      while(true) {
         if (var6.Ý<invokedynamic>(var6, (long)"c", var2)) {
            76p var7 = (76p)var6.Ý<invokedynamic>(var6, (long)"c", var2);

            label24: {
               try {
                  var10000 = var7.Ý<invokedynamic>(var7, (long)"c", var2);
                  if (var4) {
                     break;
                  }

                  if (var10000 != 0) {
                     break label24;
                  }
               } catch (MatchException var8) {
                  throw var8.c<invokedynamic>(var8, (long)"c", var2);
               }

               ++var5;
            }

            if (!var4) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   public int _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".c<invokedynamic>((long)"c", var2);
      int var5 = 0;
      boolean var4 = var10000;
      List var10 = this.i<invokedynamic>(this, (long)"c", var2);
      Iterator var6 = var10.Ý<invokedynamic>(var10, (long)"c", var2);

      while(true) {
         if (var6.Ý<invokedynamic>(var6, (long)"c", var2)) {
            76p var7 = (76p)var6.Ý<invokedynamic>(var6, (long)"c", var2);

            label24: {
               try {
                  var11 = var7.Ý<invokedynamic>(var7, (long)"c", var2);
                  if (!var4) {
                     break;
                  }

                  if (var11 == 0) {
                     break label24;
                  }
               } catch (MatchException var8) {
                  throw var8.c<invokedynamic>(var8, (long)"c", var2);
               }

               ++var5;
            }

            if (var4) {
               continue;
            }
         }

         var11 = var5;
         break;
      }

      return var11;
   }

   public double _/* $FF was: 6*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return this.i<invokedynamic>(this, (long)"c", var2);
   }

   public double _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   public Set _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      LinkedHashSet var5 = new LinkedHashSet();
      boolean var10000 = "c".c<invokedynamic>((long)"c", var2);
      List var10001 = this.i<invokedynamic>(this, (long)"c", var2);
      Iterator var6 = var10001.Ý<invokedynamic>(var10001, (long)"c", var2);
      boolean var4 = var10000;

      label47:
      while(var6.Ý<invokedynamic>(var6, (long)"c", var2)) {
         76p var7 = (76p)var6.Ý<invokedynamic>(var6, (long)"c", var2);
         MatchException var12;
         if (0L >= var2) {
            try {
               if (!var4) {
                  continue;
               }
            } catch (MatchException var10) {
               var12 = var10;
               boolean var14 = false;
               throw var12.c<invokedynamic>(var12, (long)"c", var2);
            }

            if (0L < var2) {
               break;
            }
         }

         while(true) {
            try {
               var13 = var5;
               if (var4) {
                  return var13;
               }

               var5.Ý<invokedynamic>(var5, var7.Ý<invokedynamic>(var7, (long)"c", var2).c<invokedynamic>(var7.Ý<invokedynamic>(var7, (long)"c", var2), (long)"c", var2), (long)"c", var2);
            } catch (MatchException var8) {
               var12 = var8;
               boolean var15 = false;
               break;
            }

            try {
               if (!var4) {
                  continue label47;
               }
            } catch (MatchException var9) {
               var12 = var9;
               boolean var16 = false;
               break;
            }

            if (0L < var2) {
               break label47;
            }
         }

         throw var12.c<invokedynamic>(var12, (long)"c", var2);
      }

      var13 = var5;
      return var13;
   }

   public List _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".c<invokedynamic>((long)"c", var2);
      List var10003 = this.i<invokedynamic>(this, (long)"c", var2);
      ArrayList var5 = new ArrayList(var10003.Ý<invokedynamic>(var10003, (long)"c", var2));
      boolean var4 = var10000;
      List var12 = this.i<invokedynamic>(this, (long)"c", var2);
      Iterator var6 = var12.Ý<invokedynamic>(var12, (long)"c", var2);

      label47:
      while(var6.Ý<invokedynamic>(var6, (long)"c", var2)) {
         76p var7 = (76p)var6.Ý<invokedynamic>(var6, (long)"c", var2);
         MatchException var13;
         if ("c" >= var2) {
            try {
               if (var4) {
                  continue;
               }
            } catch (MatchException var10) {
               var13 = var10;
               boolean var10001 = false;
               throw var13.c<invokedynamic>(var13, (long)"c", var2);
            }

            if (var2 >= 1L) {
               break;
            }
         }

         while(true) {
            try {
               var14 = var5;
               if (!var4) {
                  return var14;
               }

               var5.Ý<invokedynamic>(var5, var7.Ý<invokedynamic>(var7, (long)"c", var2).c<invokedynamic>(var7.Ý<invokedynamic>(var7, (long)"c", var2), (long)"c", var2), (long)"c", var2);
            } catch (MatchException var8) {
               var13 = var8;
               boolean var15 = false;
               break;
            }

            try {
               if (var4) {
                  continue label47;
               }
            } catch (MatchException var9) {
               var13 = var9;
               boolean var16 = false;
               break;
            }

            if (var2 >= 1L) {
               break label47;
            }
         }

         throw var13.c<invokedynamic>(var13, (long)"c", var2);
      }

      var14 = var5;
      return var14;
   }

   public boolean _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      List var10000 = this.i<invokedynamic>(this, (long)"c", var2);
      return var10000.Ý<invokedynamic>(var10000, (long)"c", var2);
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(7H.class, 315);
      a = s.a(-2388861991368177325L, -3727553081095327096L, MethodHandles.lookup().lookupClass()).a(153462983054033L);
      e = new Object[51];
      f = new String[51];
      a();
      d = new HashMap(13);
      long var0 = a ^ 83399715937827L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u0083÷Y aRRë\u0015Ê\u008fÑgÜhR *{L4#üH7r·}Kø\u009c³\u0088+¸D|ê_\rö5\"\u0092A\\9Ç\u0090\u0018\u0088\u008a\u0093y-\u0080\u0095\nÐ3ïôTRMHe´\u0083T¨¦Õ\u0097\u0010ß°\u0097\u001bÉ<LhÆ¦ù#d¡\u009cà )\bx8¸1\u0018ë÷Ô(/¹Kûµ+\u0089sï\u001bm\u000fa'+Zj3§±1\u0010çTñy@ð\u008f\n\u00ad«b¨ò;ô\u001c";
      int var8 = "\u0083÷Y aRRë\u0015Ê\u008fÑgÜhR *{L4#üH7r·}Kø\u009c³\u0088+¸D|ê_\rö5\"\u0092A\\9Ç\u0090\u0018\u0088\u008a\u0093y-\u0080\u0095\nÐ3ïôTRMHe´\u0083T¨¦Õ\u0097\u0010ß°\u0097\u001bÉ<LhÆ¦ù#d¡\u009cà )\bx8¸1\u0018ë÷Ô(/¹Kûµ+\u0089sï\u001bm\u000fa'+Zj3§±1\u0010çTñy@ð\u008f\n\u00ad«b¨ò;ô\u001c".length();
      char var5 = 16;
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
                     c = new String[8];
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

                  var6 = "pÔa\u009aâ\u008d\u0007¸Í`=\u000e\u0098\u0096\u001cÆ\u0010z,ÔÅ\u0080òò\u0088£áL.½iÅ.";
                  var8 = "pÔa\u009aâ\u008d\u0007¸Í`=\u000e\u0098\u0096\u001cÆ\u0010z,ÔÅ\u0080òò\u0088£áL.½iÅ.".length();
                  var5 = 16;
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
               case 0 -> var10000 = 46;
               case 1 -> var10000 = 15;
               case 2 -> var10000 = 53;
               case 3 -> var10000 = 27;
               case 4 -> var10000 = 62;
               case 5 -> var10000 = 29;
               case 6 -> var10000 = 21;
               case 7 -> var10000 = 16;
               case 8 -> var10000 = 19;
               case 9 -> var10000 = 48;
               case 10 -> var10000 = 50;
               case 11 -> var10000 = 55;
               case 12 -> var10000 = 45;
               case 13 -> var10000 = 24;
               case 14 -> var10000 = 36;
               case 15 -> var10000 = 22;
               case 16 -> var10000 = 56;
               case 17 -> var10000 = 47;
               case 18 -> var10000 = 37;
               case 19 -> var10000 = 11;
               case 20 -> var10000 = 31;
               case 21 -> var10000 = 58;
               case 22 -> var10000 = 42;
               case 23 -> var10000 = 4;
               case 24 -> var10000 = 41;
               case 25 -> var10000 = 39;
               case 26 -> var10000 = 10;
               case 27 -> var10000 = 57;
               case 28 -> var10000 = 3;
               case 29 -> var10000 = 54;
               case 30 -> var10000 = 8;
               case 31 -> var10000 = 26;
               case 32 -> var10000 = 51;
               case 33 -> var10000 = 52;
               case 34 -> var10000 = 63;
               case 35 -> var10000 = 25;
               case 36 -> var10000 = 38;
               case 37 -> var10000 = 0;
               case 38 -> var10000 = 32;
               case 39 -> var10000 = 35;
               case 40 -> var10000 = 61;
               case 41 -> var10000 = 33;
               case 42 -> var10000 = 34;
               case 43 -> var10000 = 6;
               case 44 -> var10000 = 43;
               case 45 -> var10000 = 12;
               case 46 -> var10000 = 20;
               case 47 -> var10000 = 60;
               case 48 -> var10000 = 1;
               case 49 -> var10000 = 28;
               case 50 -> var10000 = 44;
               case 51 -> var10000 = 49;
               case 52 -> var10000 = 23;
               case 53 -> var10000 = 14;
               case 54 -> var10000 = 40;
               case 55 -> var10000 = 7;
               case 56 -> var10000 = 17;
               case 57 -> var10000 = 2;
               case 58 -> var10000 = 18;
               case 59 -> var10000 = 59;
               case 60 -> var10000 = 5;
               case 61 -> var10000 = 9;
               case 62 -> var10000 = 13;
               default -> var10000 = 30;
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
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Double.TYPE;
      f[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = Boolean.TYPE;
      f[13] = "c";
      var10000[14] = "c";
      var10000[15] = Long.TYPE;
      f[15] = "c";
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
      var10000[33] = "c";
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

   private static native Field b(Class var0, String var1, Class var2);

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
         if (var8 != 'i' && var8 != 224 && var8 != 222 && var8 != 220) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 221) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'c') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'i') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 224) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 222) {
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

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);
}
