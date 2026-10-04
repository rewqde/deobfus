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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1921;
import net.minecraft.class_2960;

public class 55 {
   public static final class_2960 2;
   public static final RenderPipeline 8;
   public static final Function 4;
   public static final RenderPipeline 3;
   public static final Function 1;
   private static final long a = s.a(6064616763598377553L, 6878386420520166990L, MethodHandles.lookup().lookupClass()).a(69831806780742L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final Object[] h;
   private static final String[] i;
   // $FF: synthetic field
   private static transient String pmjwkRlPxm;

   public static void _/* $FF was: 3*/(Object[] var0) {
   }

   private _5/* $FF was: 55*/() {
   }

   private static class_1921 _/* $FF was: 3*/(long param0, class_2960 param2) {
      // $FF: Couldn't be decompiled
   }

   private static class_1921 _/* $FF was: 4*/(long param0, class_2960 param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 111834784151254L;
      long var22 = var20 ^ 18758168288633L;
      long var24 = var20 ^ 126811894086821L;
      long var26 = var20 ^ 117335129095132L;
      h = new Object[50];
      i = new String[50];
      a();
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "\r'\u0099]\u0092\u0006ç\u0013\u0097@¯\u0095V\u0082>Û2kMcÆn\u000eÐ©^\u0003Òb\u001e=\u0083 :¨\u008b,`U4M«¸¢\bÐP\u008a\u001fiâ»®ÐNp\u0017$Å\u001a×\u0084m:¬\u0018N\r°f0©`e\u0017@\u0094e\u0080\u009dÇè\nHå\u0012uÕ\u0091O(\u0092°¨pöäDÚ¶P\u0089;£Gw\u0091S\u0015Ë\u0094Ov\u009eûì\u0002ûþ½\u0081ïß\u0002\u00ad;¨²=vÎ(¬×\u0000'púü}\u0097¥Û'\u009d<[ò\u0014ª\u001b&\u001aã1@ö¡É[\u0097\u009fEu,\u000f,%CÑ¡!\u0018\u00ad_l\u007fÝÞ.\u0012ö~\u0000óö9ôäS8ÿÂF~-Æ ²ªòÁ\u0018EÐÿ:mðÞuÇÇpäç\u0013ü®Q\u009cZ\u009c\u0088\"\u001e¿j]>\u0018îú\u0000\u0091\u000béç\r\u0099D%\u0080ÍâæåPr\u0092\u0081^\u0014xe(g.\u008a!\u000f\u0012Zh/ìõÇ\u001e¥3%\u008dá3ïÓÉ9Ï¢s\"c Û6F8Ì\u0004\u001d¨TÐË";
      int var17 = "\r'\u0099]\u0092\u0006ç\u0013\u0097@¯\u0095V\u0082>Û2kMcÆn\u000eÐ©^\u0003Òb\u001e=\u0083 :¨\u008b,`U4M«¸¢\bÐP\u008a\u001fiâ»®ÐNp\u0017$Å\u001a×\u0084m:¬\u0018N\r°f0©`e\u0017@\u0094e\u0080\u009dÇè\nHå\u0012uÕ\u0091O(\u0092°¨pöäDÚ¶P\u0089;£Gw\u0091S\u0015Ë\u0094Ov\u009eûì\u0002ûþ½\u0081ïß\u0002\u00ad;¨²=vÎ(¬×\u0000'púü}\u0097¥Û'\u009d<[ò\u0014ª\u001b&\u001aã1@ö¡É[\u0097\u009fEu,\u000f,%CÑ¡!\u0018\u00ad_l\u007fÝÞ.\u0012ö~\u0000óö9ôäS8ÿÂF~-Æ ²ªòÁ\u0018EÐÿ:mðÞuÇÇpäç\u0013ü®Q\u009cZ\u009c\u0088\"\u001e¿j]>\u0018îú\u0000\u0091\u000béç\r\u0099D%\u0080ÍâæåPr\u0092\u0081^\u0014xe(g.\u008a!\u000f\u0012Zh/ìõÇ\u001e¥3%\u008dá3ïÓÉ9Ï¢s\"c Û6F8Ì\u0004\u001d¨TÐË".length();
      char var14 = ' ';
      int var29 = -1;

      label45:
      while(true) {
         ++var29;
         String var30 = var15.substring(var29, var29 + var14);
         int var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
            String var54 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var54;
                  if ((var29 += var14) >= var17) {
                     b = var18;
                     c = new String[11];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var32 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var56 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var32.init(2, var56.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "è\u0000|\u0094J6,Ä?¸\u0002>bñ\u009c^";
                     int var5 = "è\u0000|\u0094J6,Ä?¸\u0002>bñ\u009c^".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var59 = true;
                        var6[var10001] = var10004;
                     } while(var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     String var33 = 32618.k<invokedynamic>(32618, 1157057637313602954L ^ var20);
                     2 = var33.ó<invokedynamic>(var33, true.k<invokedynamic>(26283, 3262333307826306114L ^ var20), -2489591387298271422L, var20);
                     RenderPipeline.Builder var34 = (new RenderPipeline.Snippet[]{-2489549477722499748L.µ<invokedynamic>(-2489549477722499748L, var20)}).ó<invokedynamic>(new RenderPipeline.Snippet[]{-2489549477722499748L.µ<invokedynamic>(-2489549477722499748L, var20)}, -2490188963578423391L, var20);
                     String var50 = 20213.k<invokedynamic>(20213, 8876220925945074711L ^ var20);
                     var34 = var34.N<invokedynamic>(var34, var50.ó<invokedynamic>(var50, true.k<invokedynamic>(18045, 6665340816789134487L ^ var20), -2489591387298271422L, var20), -2490343447076651391L, var20).N<invokedynamic>(var34.N<invokedynamic>(var34, var50.ó<invokedynamic>(var50, true.k<invokedynamic>(18045, 6665340816789134487L ^ var20), -2489591387298271422L, var20), -2490343447076651391L, var20), true.k<invokedynamic>(21099, 3825447893242529928L ^ var20), -2489502284450154330L, var20);
                     var34 = var34.N<invokedynamic>(var34, true.k<invokedynamic>(25057, 3248324391672773385L ^ var20), -2486370956797259225L, var20).N<invokedynamic>(var34.N<invokedynamic>(var34, true.k<invokedynamic>(25057, 3248324391672773385L ^ var20), -2486370956797259225L, var20), true.k<invokedynamic>(20821, 1051294921365441459L ^ var20), -2486324788713623199L, var20);
                     var34 = var34.N<invokedynamic>(var34, -2486491673360959986L.µ<invokedynamic>(-2486491673360959986L, var20), -2489381132087865018L, var20).N<invokedynamic>(var34.N<invokedynamic>(var34, -2486491673360959986L.µ<invokedynamic>(-2486491673360959986L, var20), -2489381132087865018L, var20), false, -2490229179564202666L, var20);
                     var34 = var34.N<invokedynamic>(var34, -2489753034709028053L.µ<invokedynamic>(-2489753034709028053L, var20), -2490095823190856682L, var20).N<invokedynamic>(var34.N<invokedynamic>(var34, -2489753034709028053L.µ<invokedynamic>(-2489753034709028053L, var20), -2490095823190856682L, var20), false, -2490035032191111309L, var20);
                     Object[] var60 = new Object[]{var34.N<invokedynamic>(var34, -2489795803272225798L.µ<invokedynamic>(-2489795803272225798L, var20), -2490468134262055920L.µ<invokedynamic>(-2490468134262055920L, var20), -2486961568899090439L, var20).N<invokedynamic>(var34.N<invokedynamic>(var34, -2489795803272225798L.µ<invokedynamic>(-2489795803272225798L, var20), -2490468134262055920L.µ<invokedynamic>(-2490468134262055920L, var20), -2486961568899090439L, var20), -2485991453455891786L, var20), var22};
                     8 = var60.ó<invokedynamic>(var60, -2490357564015856229L, var20);
                     Function var39 = 55::4;
                     4 = var39.ó<invokedynamic>(var39, -2486464557708207553L, var20);
                     RenderPipeline.Builder var40 = (new RenderPipeline.Snippet[]{-2489549477722499748L.µ<invokedynamic>(-2489549477722499748L, var20)}).ó<invokedynamic>(new RenderPipeline.Snippet[]{-2489549477722499748L.µ<invokedynamic>(-2489549477722499748L, var20)}, -2490188963578423391L, var20);
                     var50 = 20213.k<invokedynamic>(20213, 8876220925945074711L ^ var20);
                     var40 = var40.N<invokedynamic>(var40, var50.ó<invokedynamic>(var50, true.k<invokedynamic>(12683, 3393298931792849775L ^ var20), -2489591387298271422L, var20), -2490343447076651391L, var20).N<invokedynamic>(var40.N<invokedynamic>(var40, var50.ó<invokedynamic>(var50, true.k<invokedynamic>(12683, 3393298931792849775L ^ var20), -2489591387298271422L, var20), -2490343447076651391L, var20), true.k<invokedynamic>(25057, 3248324391672773385L ^ var20), -2489502284450154330L, var20);
                     var40 = var40.N<invokedynamic>(var40, true.k<invokedynamic>(25057, 3248324391672773385L ^ var20), -2486370956797259225L, var20).N<invokedynamic>(var40.N<invokedynamic>(var40, true.k<invokedynamic>(25057, 3248324391672773385L ^ var20), -2486370956797259225L, var20), true.k<invokedynamic>(20821, 1051294921365441459L ^ var20), -2486324788713623199L, var20);
                     var40 = var40.N<invokedynamic>(var40, -2486491673360959986L.µ<invokedynamic>(-2486491673360959986L, var20), -2489381132087865018L, var20).N<invokedynamic>(var40.N<invokedynamic>(var40, -2486491673360959986L.µ<invokedynamic>(-2486491673360959986L, var20), -2489381132087865018L, var20), false, -2490229179564202666L, var20);
                     var40 = var40.N<invokedynamic>(var40, -2486122512064116604L.µ<invokedynamic>(-2486122512064116604L, var20), -2490095823190856682L, var20).N<invokedynamic>(var40.N<invokedynamic>(var40, -2486122512064116604L.µ<invokedynamic>(-2486122512064116604L, var20), -2490095823190856682L, var20), false, -2490035032191111309L, var20);
                     var60 = new Object[]{var40.N<invokedynamic>(var40, -2489795803272225798L.µ<invokedynamic>(-2489795803272225798L, var20), -2490468134262055920L.µ<invokedynamic>(-2490468134262055920L, var20), -2486961568899090439L, var20).N<invokedynamic>(var40.N<invokedynamic>(var40, -2489795803272225798L.µ<invokedynamic>(-2489795803272225798L, var20), -2490468134262055920L.µ<invokedynamic>(-2490468134262055920L, var20), -2486961568899090439L, var20), -2485991453455891786L, var20), var22};
                     3 = var60.ó<invokedynamic>(var60, -2490357564015856229L, var20);
                     Function var45 = 55::3;
                     1 = var45.ó<invokedynamic>(var45, -2486464557708207553L, var20);
                     return;
                  }

                  var14 = var15.charAt(var29);
                  break;
               default:
                  var18[var16++] = var54;
                  if ((var29 += var14) < var17) {
                     var14 = var15.charAt(var29);
                     continue label45;
                  }

                  var15 = "Ì¨¦3Ø-â{ä\u0095ï\u0097\u009e\u0092\u008f\u000f\u0096¹£,Þº\u0094\u0081\u0084fÉ$\u009dÖõ\u008c\u0083\u0018þP\u0002çtrnûË\u008a÷I\u0088W!Æ\u007fLÑ£\u00866(\u0018 Ñ&ã\u00815IånN~\\\u0084¥$\u008dgoHW\u008a¤ÞÚ\u0007ý\u0001'\u007fC\u007f\u0088\r\u0082µÄòÈm";
                  var17 = "Ì¨¦3Ø-â{ä\u0095ï\u0097\u009e\u0092\u008f\u000f\u0096¹£,Þº\u0094\u0081\u0084fÉ$\u009dÖõ\u008c\u0083\u0018þP\u0002çtrnûË\u008a÷I\u0088W!Æ\u007fLÑ£\u00866(\u0018 Ñ&ã\u00815IånN~\\\u0084¥$\u008dgoHW\u008a¤ÞÚ\u0007ý\u0001'\u007fC\u007f\u0088\r\u0082µÄòÈm".length();
                  var14 = '8';
                  var29 = -1;
            }

            ++var29;
            var30 = var15.substring(var29, var29 + var14);
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

   private static int b(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (i[var4] != null) {
         return var4;
      } else {
         Object var5 = h[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 43;
               case 1 -> var10000 = 18;
               case 2 -> var10000 = 36;
               case 3 -> var10000 = 23;
               case 4 -> var10000 = 9;
               case 5 -> var10000 = 10;
               case 6 -> var10000 = 21;
               case 7 -> var10000 = 5;
               case 8 -> var10000 = 52;
               case 9 -> var10000 = 12;
               case 10 -> var10000 = 49;
               case 11 -> var10000 = 41;
               case 12 -> var10000 = 22;
               case 13 -> var10000 = 62;
               case 14 -> var10000 = 20;
               case 15 -> var10000 = 2;
               case 16 -> var10000 = 48;
               case 17 -> var10000 = 61;
               case 18 -> var10000 = 11;
               case 19 -> var10000 = 24;
               case 20 -> var10000 = 14;
               case 21 -> var10000 = 17;
               case 22 -> var10000 = 31;
               case 23 -> var10000 = 58;
               case 24 -> var10000 = 56;
               case 25 -> var10000 = 50;
               case 26 -> var10000 = 16;
               case 27 -> var10000 = 26;
               case 28 -> var10000 = 55;
               case 29 -> var10000 = 51;
               case 30 -> var10000 = 35;
               case 31 -> var10000 = 4;
               case 32 -> var10000 = 25;
               case 33 -> var10000 = 57;
               case 34 -> var10000 = 34;
               case 35 -> var10000 = 3;
               case 36 -> var10000 = 1;
               case 37 -> var10000 = 39;
               case 38 -> var10000 = 32;
               case 39 -> var10000 = 29;
               case 40 -> var10000 = 37;
               case 41 -> var10000 = 6;
               case 42 -> var10000 = 53;
               case 43 -> var10000 = 33;
               case 44 -> var10000 = 19;
               case 45 -> var10000 = 40;
               case 46 -> var10000 = 27;
               case 47 -> var10000 = 63;
               case 48 -> var10000 = 42;
               case 49 -> var10000 = 30;
               case 50 -> var10000 = 38;
               case 51 -> var10000 = 7;
               case 52 -> var10000 = 45;
               case 53 -> var10000 = 8;
               case 54 -> var10000 = 13;
               case 55 -> var10000 = 59;
               case 56 -> var10000 = 60;
               case 57 -> var10000 = 28;
               case 58 -> var10000 = 47;
               case 59 -> var10000 = 0;
               case 60 -> var10000 = 15;
               case 61 -> var10000 = 44;
               case 62 -> var10000 = 54;
               default -> var10000 = 46;
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

            i[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = h;
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
      var10000[11] = "c";
      var10000[12] = Boolean.TYPE;
      i[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = Integer.TYPE;
      i[18] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = h[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(i[var4]);
            h[var4] = var5;
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
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     h[var4] = var13;
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
      Object var5 = h[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = i[var4];
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
               h[var4] = var26;
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
                     h[var4] = var19;
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
         if (var8 != 'M' && var8 != 'A' && var8 != 181 && var8 != 't') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'N') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 243) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'M') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'A') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 181) {
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

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
