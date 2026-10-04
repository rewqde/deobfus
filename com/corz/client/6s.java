package com.corz.client;

import com.mojang.blaze3d.pipeline.RenderPipeline;
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
import net.minecraft.class_2960;

public class 6S {
   private static final float 9 = -0.3F;
   private static final float 4 = -0.6F;
   private static final float 2 = -0.4F;
   private static final float 6 = -0.8F;
   private static final float 7 = -1.2F;
   private static final float 86 = -0.2F;
   public static final RenderPipeline 1;
   public static final RenderPipeline 3;
   public static final RenderPipeline 5;
   public static final RenderPipeline 8;
   public static final RenderPipeline 0;
   public static final RenderPipeline 8D;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final Object[] e;
   private static final String[] f;
   // $FF: synthetic field
   private static transient String ozjmlCIUGj;

   private _S/* $FF was: 6S*/() {
   }

   public static void _/* $FF was: 6*/(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      (new Object[0]).V<invokedynamic>(new Object[0], (long)"c", var1);
   }

   private static class_2960 _/* $FF was: 7*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static class_2960 _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static RenderPipeline _/* $FF was: 4*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static RenderPipeline _/* $FF was: 5*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static RenderPipeline _/* $FF was: 2*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   private static RenderPipeline _/* $FF was: 6*/(Object[] param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      a.b99571f71427e3b19.a.init(6S.class, 766);
      a = s.a(-4031431545887132672L, -4307449419721394696L, MethodHandles.lookup().lookupClass()).a(134270963462968L);
      long var9 = a ^ 108144952164765L;
      long var11 = var9 ^ 84744701669813L;
      long var13 = var9 ^ 136608969695449L;
      long var15 = var9 ^ 32240495948443L;
      e = new Object[62];
      f = new String[62];
      a();
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[17];
      int var5 = 0;
      String var4 = "\u0097\u009cD\u0091(C&&\" \u0087T\u001e¸Xv !Á\u0019;\u0000ÜÁ÷ÙpÌy¯x<È\u000e`¹wB\u0083\n\n/¶vm\u009f_;\\ 6-hO\n\u0013ÑË¼\u0096«ð:\u0085èØ\u0000vSµ&¥°jüïI\\\u009f¶¥Ø(.jæÁ\nR\u0085gª»\u0090\u0016!ýù6Â\\\t5\u007fû\u000eåP\u0095¸k«ääIþu¨\u0091Ø\n¥_(Ôn!¨\u0013,¡\u001b¿\u0087\u008e¥Efª=7ã\u0005_#J^ ø1¾DF\n¦\u009bL±\u0092½½®G\u001a(,´¼Ç\u009cwZ'ý\u0096´\u000eÿ/Ðüonn@n\u0012\u00ad\u0016\u0080ßM\u0080Æs\u008d\føG`Õ-ªå¥\u0018o\u008fj\\\u0095\u0086N#'\u0091:\u00035$\u009cóâ\u009dçÒVx·Z óânL:\u0095¼\\\u0089àé¦ÈgBËû¦gêµëeCF\u0004|\u0000½O>$ \fj,Ëu\u009bÌç\u0089\u0089s75#Oç\u0099\u009d\u0091\u0084\u0088ê\u0081FmüNõ´\u0080\u0096Ú\u0018ëæY%K£ÿ³2>ò²\u0000ý\u0007\u0014lÏ¸éxíõ% Ê}]ÎðeºÆ (=êÇttß!\\©\u0006a\u0085×Û\u001aCÆ»÷\u0017\u0095¬\u0010ÿ\u0019§Y\u0013\u0084\u0084Zåè¡\u0082\u0007 ¹\u0017 uæõ!³!Dg\u008d;ï \u0003\u0012µ~çA\u0086Ô>÷\u001c8^\u0084\u0096s´SpE0Ø\u000flMk\u009bd¬¬\u008a\u008a\u008b¢\u0019rq\u000e\u0080n\u008d\u0015\u000f\u0001¯\u0016ñ¼¥çÄoÑ¿qZ:\u009d±â*óþ\u0004@è\u0097iÁ\u0010\u00ad©û¨âv\u0013\u0012NO¹\u0019â\u0007½d";
      int var6 = "\u0097\u009cD\u0091(C&&\" \u0087T\u001e¸Xv !Á\u0019;\u0000ÜÁ÷ÙpÌy¯x<È\u000e`¹wB\u0083\n\n/¶vm\u009f_;\\ 6-hO\n\u0013ÑË¼\u0096«ð:\u0085èØ\u0000vSµ&¥°jüïI\\\u009f¶¥Ø(.jæÁ\nR\u0085gª»\u0090\u0016!ýù6Â\\\t5\u007fû\u000eåP\u0095¸k«ääIþu¨\u0091Ø\n¥_(Ôn!¨\u0013,¡\u001b¿\u0087\u008e¥Efª=7ã\u0005_#J^ ø1¾DF\n¦\u009bL±\u0092½½®G\u001a(,´¼Ç\u009cwZ'ý\u0096´\u000eÿ/Ðüonn@n\u0012\u00ad\u0016\u0080ßM\u0080Æs\u008d\føG`Õ-ªå¥\u0018o\u008fj\\\u0095\u0086N#'\u0091:\u00035$\u009cóâ\u009dçÒVx·Z óânL:\u0095¼\\\u0089àé¦ÈgBËû¦gêµëeCF\u0004|\u0000½O>$ \fj,Ëu\u009bÌç\u0089\u0089s75#Oç\u0099\u009d\u0091\u0084\u0088ê\u0081FmüNõ´\u0080\u0096Ú\u0018ëæY%K£ÿ³2>ò²\u0000ý\u0007\u0014lÏ¸éxíõ% Ê}]ÎðeºÆ (=êÇttß!\\©\u0006a\u0085×Û\u001aCÆ»÷\u0017\u0095¬\u0010ÿ\u0019§Y\u0013\u0084\u0084Zåè¡\u0082\u0007 ¹\u0017 uæõ!³!Dg\u008d;ï \u0003\u0012µ~çA\u0086Ô>÷\u001c8^\u0084\u0096s´SpE0Ø\u000flMk\u009bd¬¬\u008a\u008a\u008b¢\u0019rq\u000e\u0080n\u008d\u0015\u000f\u0001¯\u0016ñ¼¥çÄoÑ¿qZ:\u009d±â*óþ\u0004@è\u0097iÁ\u0010\u00ad©û¨âv\u0013\u0012NO¹\u0019â\u0007½d".length();
      char var3 = 16;
      int var18 = -1;

      label27:
      while(true) {
         ++var18;
         String var19 = var4.substring(var18, var18 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var25;
                  if ((var18 += var3) >= var6) {
                     b = var7;
                     c = new String[17];
                     Object[] var10006 = new Object[]{true.t<invokedynamic>(13910, 7577504482823775083L ^ var9), -7815735858233115620L.P<invokedynamic>(-7815735858233115620L, var9), var15, true, true};
                     1 = var10006.V<invokedynamic>(var10006, -7815582868102986920L, var9);
                     var10006 = new Object[]{true.t<invokedynamic>(29255, 1721340099961644917L ^ var9), -7814997653099837308L.P<invokedynamic>(-7814997653099837308L, var9), var15, true, false};
                     3 = var10006.V<invokedynamic>(var10006, -7815582868102986920L, var9);
                     Object[] var10005 = new Object[]{true.t<invokedynamic>(27385, 4654023994469941192L ^ var9), -7815735858233115620L.P<invokedynamic>(-7815735858233115620L, var9), true, var11};
                     5 = var10005.V<invokedynamic>(var10005, -7815024398927361878L, var9);
                     var10005 = new Object[]{true.t<invokedynamic>(14594, 9094091300689882172L ^ var9), -7814997653099837308L.P<invokedynamic>(-7814997653099837308L, var9), false, var11};
                     8 = var10005.V<invokedynamic>(var10005, -7815024398927361878L, var9);
                     var10005 = new Object[]{var13, true.t<invokedynamic>(24566, 6089180854873148110L ^ var9), -7815735858233115620L.P<invokedynamic>(-7815735858233115620L, var9), true};
                     0 = var10005.V<invokedynamic>(var10005, -7815848310948082536L, var9);
                     var10005 = new Object[]{var13, true.t<invokedynamic>(29400, 3236559529453512687L ^ var9), -7814997653099837308L.P<invokedynamic>(-7814997653099837308L, var9), false};
                     8D = var10005.V<invokedynamic>(var10005, -7815848310948082536L, var9);
                     return;
                  }

                  var3 = var4.charAt(var18);
                  break;
               default:
                  var7[var5++] = var25;
                  if ((var18 += var3) < var6) {
                     var3 = var4.charAt(var18);
                     continue label27;
                  }

                  var4 = "\f\u0080ÛØ\u001b\t[\u0097\u0007¶fw\u001eql\u0093\u008aý\u0004\tþSð\u0016Û\u00008ß,Áµ6!:QÕÒÕ}½`Ô©02ñ\u009e\u0093()©\u0093\u0096B\u008dçú=¿^ç\u0007*2¹õ¶\u0091C\u0091õñ\u0014\u0098\u0017~¥R\u0002Ma\u000f8ºLþ\u009b\u0092J";
                  var6 = "\f\u0080ÛØ\u001b\t[\u0097\u0007¶fw\u001eql\u0093\u008aý\u0004\tþSð\u0016Û\u00008ß,Áµ6!:QÕÒÕ}½`Ô©02ñ\u009e\u0093()©\u0093\u0096B\u008dçú=¿^ç\u0007*2¹õ¶\u0091C\u0091õñ\u0014\u0098\u0017~¥R\u0002Ma\u000f8ºLþ\u009b\u0092J".length();
                  var3 = '0';
                  var18 = -1;
            }

            ++var18;
            var19 = var4.substring(var18, var18 + var3);
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

   private static Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

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
               case 0 -> var10000 = 10;
               case 1 -> var10000 = 58;
               case 2 -> var10000 = 15;
               case 3 -> var10000 = 42;
               case 4 -> var10000 = 48;
               case 5 -> var10000 = 47;
               case 6 -> var10000 = 26;
               case 7 -> var10000 = 18;
               case 8 -> var10000 = 37;
               case 9 -> var10000 = 28;
               case 10 -> var10000 = 45;
               case 11 -> var10000 = 52;
               case 12 -> var10000 = 54;
               case 13 -> var10000 = 62;
               case 14 -> var10000 = 55;
               case 15 -> var10000 = 35;
               case 16 -> var10000 = 24;
               case 17 -> var10000 = 56;
               case 18 -> var10000 = 43;
               case 19 -> var10000 = 50;
               case 20 -> var10000 = 44;
               case 21 -> var10000 = 32;
               case 22 -> var10000 = 34;
               case 23 -> var10000 = 31;
               case 24 -> var10000 = 1;
               case 25 -> var10000 = 21;
               case 26 -> var10000 = 29;
               case 27 -> var10000 = 39;
               case 28 -> var10000 = 2;
               case 29 -> var10000 = 36;
               case 30 -> var10000 = 40;
               case 31 -> var10000 = 17;
               case 32 -> var10000 = 30;
               case 33 -> var10000 = 14;
               case 34 -> var10000 = 59;
               case 35 -> var10000 = 38;
               case 36 -> var10000 = 27;
               case 37 -> var10000 = 53;
               case 38 -> var10000 = 0;
               case 39 -> var10000 = 3;
               case 40 -> var10000 = 60;
               case 41 -> var10000 = 4;
               case 42 -> var10000 = 49;
               case 43 -> var10000 = 12;
               case 44 -> var10000 = 51;
               case 45 -> var10000 = 8;
               case 46 -> var10000 = 25;
               case 47 -> var10000 = 33;
               case 48 -> var10000 = 20;
               case 49 -> var10000 = 23;
               case 50 -> var10000 = 16;
               case 51 -> var10000 = 6;
               case 52 -> var10000 = 19;
               case 53 -> var10000 = 5;
               case 54 -> var10000 = 61;
               case 55 -> var10000 = 13;
               case 56 -> var10000 = 57;
               case 57 -> var10000 = 11;
               case 58 -> var10000 = 46;
               case 59 -> var10000 = 63;
               case 60 -> var10000 = 9;
               case 61 -> var10000 = 7;
               case 62 -> var10000 = 22;
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
      var10000[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = Boolean.TYPE;
      f[11] = "c";
      var10000[12] = Float.TYPE;
      f[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = Void.TYPE;
      f[17] = "c";
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

   private static native Method d(long var0, long var2);

   private static MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6) {
      char var8 = var2.charAt(0);
      MethodHandle var9 = null;
      Field var10 = null;
      Method var11 = null;

      try {
         if (var8 != 197 && var8 != 'z' && var8 != 'P' && var8 != 'F') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 192) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'V') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 197) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'z') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'P') {
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
