package com.corz.client;

import com.google.gson.JsonObject;
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

public record 737(String 9, long 7, int 2, int 1, int 5, int 4, int 0, long 6) {
   private static final long a = s.a(-4734174029839934181L, -2360666173329469381L, MethodHandles.lookup().lookupClass()).a(84903324257088L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long h;
   private static final Object[] i = new Object[42];
   private static final String[] j = new String[42];
   // $FF: synthetic field
   private static transient String VdIUtpKUWc;

   public _37/* $FF was: 737*/(String var1, long var2, int var4, int var5, int var6, int var7, long var8) {
      this(var1, var2, var4, var5, var6, var7, 0, var8);
   }

   public _37/* $FF was: 737*/(String var1, long var2, int var4, int var5, int var6, int var7, int var8, long var9) {
      this.9 = var1;
      this.7 = var2;
      this.2 = var4;
      this.1 = var5;
      this.5 = var6;
      this.4 = var7;
      this.0 = var8;
      this.6 = var9;
   }

   public boolean _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 1*/() {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 9*/(String param1, int param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   public static 737 _/* $FF was: 2*/(String param0, long param1, int param3, int param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 6*/(JsonObject param1) {
      // $FF: Couldn't be decompiled
   }

   public static 737 _/* $FF was: 7*/(JsonObject param0) {
      // $FF: Couldn't be decompiled
   }

   public String _/* $FF was: 2*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 4*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 8*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/() {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }

   public long _/* $FF was: 6*/() {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var16 = a ^ 61198459377149L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[19];
      int var23 = 0;
      String var22 = "\u0084ä<¾Ç®ï3nz4\u0084]Ìúò\u0010V\u0086'»\u0019¸¼z\u0014ñ@\u00ad\u0084ëâø\u0010Å°ô\u0010µzþ\u008f}\u0014ºIÄ?Ú\u008e Ixqg°\u0092Ëúñlqèhm=l¯\u0018i§Ñ\u001e%¤-2\u0094\u001bÌø\"\tÂ\u000eâï(Ç9&\u009d\n;\u0002Ï\u0007û\u0003Î\u0097¨l\u0086\t\u0088;þ\u001dQ\t0Ö¡ÆÅ¶?G\u0096\u0015\"\u007fò\u008a_hõ\u007fû/\u0015\u0086í(</öâuî\u0098·6b!\"ß\u0012\bwîJ\u0005,>\u0091\u009e¡¹ÇM\u00952r\u0088[õr \u001bqV\u008f\u0088\u008e¿zR\u0012C¡\u0018\u001aò*\u008eoZ:\u0014MàÙ_\u0011Û\u0018Õ\u008cl\u001bÊ\u009f³.îü/l\u000b\u0010®;\u0018¢d\fG¹\u0010Ò\u0005ô)ÛJ¿\u0010b£ø\u0099èm\u0013¿§¨<åX\u0085\u0086\u009d\u0010ì7õ÷Ë¾~ªº¯\u001bv.[ÂØ\u0010\u000f\u0093AÀf³?\u001b¹¨\u0002öv¿öÉ\u0010\u00934Ñ\u009e\u0018NZqS\u0084Ï©¼Ê¬\u007f \u0011¸%\u001f]\u00ad\u0014ZùCE\u001eñªA\u001fÙzw\u0081e.\fú\u0010§¶sTD²Z\u0010N\u0003\u008fËæçj\u0085K\rh&\n\b\u001a\u008b\u0010\u001fÐ¦øK×í¹\u000f=¯\u001d[Ã®7\u0010HeW\u000f\rú\u0013$o\u009fÃ\tCÚ+2\u0010A\u0093\u009c\u0093\u0012iÙ6)\u0017Íö\u0089$L1\u0010{t\u0081\u00103\u0086ÝL\u0086ö]\f\u0016:Ñ&\u0010\"Y>ÄpË\u001a³Æ\u0004\u0001\u0018¡§'Ù\u0010r=ªü\u0097µ\tÉ\u001f\u008fïÆM\u0092\u0005\u0017";
      int var24 = "\u0084ä<¾Ç®ï3nz4\u0084]Ìúò\u0010V\u0086'»\u0019¸¼z\u0014ñ@\u00ad\u0084ëâø\u0010Å°ô\u0010µzþ\u008f}\u0014ºIÄ?Ú\u008e Ixqg°\u0092Ëúñlqèhm=l¯\u0018i§Ñ\u001e%¤-2\u0094\u001bÌø\"\tÂ\u000eâï(Ç9&\u009d\n;\u0002Ï\u0007û\u0003Î\u0097¨l\u0086\t\u0088;þ\u001dQ\t0Ö¡ÆÅ¶?G\u0096\u0015\"\u007fò\u008a_hõ\u007fû/\u0015\u0086í(</öâuî\u0098·6b!\"ß\u0012\bwîJ\u0005,>\u0091\u009e¡¹ÇM\u00952r\u0088[õr \u001bqV\u008f\u0088\u008e¿zR\u0012C¡\u0018\u001aò*\u008eoZ:\u0014MàÙ_\u0011Û\u0018Õ\u008cl\u001bÊ\u009f³.îü/l\u000b\u0010®;\u0018¢d\fG¹\u0010Ò\u0005ô)ÛJ¿\u0010b£ø\u0099èm\u0013¿§¨<åX\u0085\u0086\u009d\u0010ì7õ÷Ë¾~ªº¯\u001bv.[ÂØ\u0010\u000f\u0093AÀf³?\u001b¹¨\u0002öv¿öÉ\u0010\u00934Ñ\u009e\u0018NZqS\u0084Ï©¼Ê¬\u007f \u0011¸%\u001f]\u00ad\u0014ZùCE\u001eñªA\u001fÙzw\u0081e.\fú\u0010§¶sTD²Z\u0010N\u0003\u008fËæçj\u0085K\rh&\n\b\u001a\u008b\u0010\u001fÐ¦øK×í¹\u000f=¯\u001d[Ã®7\u0010HeW\u000f\rú\u0013$o\u009fÃ\tCÚ+2\u0010A\u0093\u009c\u0093\u0012iÙ6)\u0017Íö\u0089$L1\u0010{t\u0081\u00103\u0086ÝL\u0086ö]\f\u0016:Ñ&\u0010\"Y>ÄpË\u001a³Æ\u0004\u0001\u0018¡§'Ù\u0010r=ªü\u0097µ\tÉ\u001f\u008fïÆM\u0092\u0005\u0017".length();
      char var21 = 16;
      int var29 = -1;

      label64:
      while(true) {
         ++var29;
         String var30 = var22.substring(var29, var29 + var21);
         int var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     b = var25;
                     c = new String[19];
                     g = new HashMap(13);
                     Cipher var5;
                     Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var45 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var6 = 1; var6 < 8; ++var6) {
                        var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                     }

                     var32.init(2, var45.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[4];
                     int var8 = 0;
                     String var9 = "\tó¬\u0000\u0001ó¥\u0099T³óþóS\u0093ì";
                     int var10 = "\tó¬\u0000\u0001ó¥\u0099T³óþóS\u0093ì".length();
                     int var7 = 0;

                     label46:
                     while(true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        byte var52 = -1;

                        while(true) {
                           long var13 = var46;
                           byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                           long var55 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    e = var11;
                                    f = new Integer[4];
                                    Cipher var0;
                                    Cipher var34 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    SecretKeyFactory var48 = SecretKeyFactory.getInstance("DES");
                                    byte[] var54 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for(int var1 = 1; var1 < 8; ++var1) {
                                       var54[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                                    }

                                    var34.init(2, var48.generateSecret(new DESKeySpec(var54)), new IvParameterSpec(new byte[8]));
                                    long var2 = -480177622997528320L;
                                    byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                                    long var49 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                                    var10001 = -1;
                                    h = var49;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "3Ý\u0089(¨0ÊÇÅq¹;°\nýË";
                                 var10 = "3Ý\u0089(¨0ÊÇÅq¹;°\nýË".length();
                                 var7 = 0;
                           }

                           var10001 = var7;
                           var7 += 8;
                           var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var46 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "~¢\u00adq¸\u000eÈ~_UÝLóÅ\"/\u0010\u009fÀf\u001a4ï\u009a1ï\u009bO\u0096_ç\u0017¶";
                  var24 = "~¢\u00adq¸\u000eÈ~_UÝLóÅ\"/\u0010\u009fÀf\u001a4ï\u009a1ï\u009bO\u0096_ç\u0017¶".length();
                  var21 = 16;
                  var29 = -1;
            }

            ++var29;
            var30 = var22.substring(var29, var29 + var21);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      if (j[var4] != null) {
         return var4;
      } else {
         Object var5 = i[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 36;
               case 1 -> var10000 = 43;
               case 2 -> var10000 = 54;
               case 3 -> var10000 = 17;
               case 4 -> var10000 = 25;
               case 5 -> var10000 = 40;
               case 6 -> var10000 = 58;
               case 7 -> var10000 = 0;
               case 8 -> var10000 = 28;
               case 9 -> var10000 = 55;
               case 10 -> var10000 = 22;
               case 11 -> var10000 = 7;
               case 12 -> var10000 = 10;
               case 13 -> var10000 = 20;
               case 14 -> var10000 = 45;
               case 15 -> var10000 = 12;
               case 16 -> var10000 = 46;
               case 17 -> var10000 = 21;
               case 18 -> var10000 = 13;
               case 19 -> var10000 = 51;
               case 20 -> var10000 = 1;
               case 21 -> var10000 = 33;
               case 22 -> var10000 = 23;
               case 23 -> var10000 = 31;
               case 24 -> var10000 = 15;
               case 25 -> var10000 = 50;
               case 26 -> var10000 = 57;
               case 27 -> var10000 = 41;
               case 28 -> var10000 = 42;
               case 29 -> var10000 = 32;
               case 30 -> var10000 = 27;
               case 31 -> var10000 = 49;
               case 32 -> var10000 = 26;
               case 33 -> var10000 = 44;
               case 34 -> var10000 = 52;
               case 35 -> var10000 = 56;
               case 36 -> var10000 = 3;
               case 37 -> var10000 = 6;
               case 38 -> var10000 = 34;
               case 39 -> var10000 = 63;
               case 40 -> var10000 = 35;
               case 41 -> var10000 = 62;
               case 42 -> var10000 = 61;
               case 43 -> var10000 = 2;
               case 44 -> var10000 = 39;
               case 45 -> var10000 = 60;
               case 46 -> var10000 = 11;
               case 47 -> var10000 = 29;
               case 48 -> var10000 = 16;
               case 49 -> var10000 = 19;
               case 50 -> var10000 = 5;
               case 51 -> var10000 = 18;
               case 52 -> var10000 = 37;
               case 53 -> var10000 = 47;
               case 54 -> var10000 = 4;
               case 55 -> var10000 = 24;
               case 56 -> var10000 = 8;
               case 57 -> var10000 = 14;
               case 58 -> var10000 = 48;
               case 59 -> var10000 = 53;
               case 60 -> var10000 = 38;
               case 61 -> var10000 = 9;
               case 62 -> var10000 = 59;
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

            j[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = i;
      var10000[0] = "c";
      var10000[1] = Integer.TYPE;
      j[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = Boolean.TYPE;
      j[5] = "c";
      var10000[6] = "c";
      var10000[7] = "c";
      var10000[8] = Long.TYPE;
      j[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = Void.TYPE;
      j[16] = "c";
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
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = i[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(j[var4]);
            i[var4] = var5;
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
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     i[var4] = var13;
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
      Object var5 = i[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = j[var4];
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
               i[var4] = var26;
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
                     i[var4] = var19;
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
         if (var8 != 204 && var8 != 'f' && var8 != 'T' && var8 != 'z') {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 'c') {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 192) {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 204) {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 'f') {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 'T') {
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
