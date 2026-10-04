package com.corz.client;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class 0F {
   public final String 8n;
   public final 3F 8C;
   public String 0;
   public 7Y_ 6;
   public 7Yh 2;
   public 7cl 7;
   public String 8;
   public boolean 9;
   public final int 8R;
   public final int 1;
   public final int 8r;
   public final int 5;
   private final Map 8U;
   private final Map 4;
   private final Map 3;
   private static final long a = s.a(-6081898509894442049L, 152528985140336478L, MethodHandles.lookup().lookupClass()).a(216708571961502L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;
   private static final Object[] k = new Object[136];
   private static final String[] l = new String[136];
   // $FF: synthetic field
   private static transient String AunWjDHgXq;

   public _F/* $FF was: 0F*/(String param1, 3F param2, long param3, int param5, short param6, int param7, int param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 3c _/* $FF was: 4*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.c<invokedynamic>(this, (long)"c", var2);
      return (3c)var10000.Ï<invokedynamic>(var10000, var1[1], (long)"c", var2);
   }

   public Collection _/* $FF was: 7*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.c<invokedynamic>(this, (long)"c", var2);
      return var10000.Ï<invokedynamic>(var10000, (long)"c", var2);
   }

   public void _/* $FF was: 9*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      this.c<invokedynamic>(this, (long)"c", var2).Ï<invokedynamic>(this.c<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
   }

   public List _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".m<invokedynamic>((long)"c", var2);
      int var5 = 0;
      boolean var4 = var10000;
      Collection var10 = this.c<invokedynamic>(this, (long)"c", var2).Ï<invokedynamic>(this.c<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      Iterator var6 = var10.Ï<invokedynamic>(var10, (long)"c", var2);

      while(true) {
         if (var6.Ï<invokedynamic>(var6, (long)"c", var2)) {
            3c var7 = (3c)var6.Ï<invokedynamic>(var6, (long)"c", var2);

            label24: {
               try {
                  var11 = var7.c<invokedynamic>(var7, (long)"c", var2);
                  if (var4) {
                     break;
                  }

                  if (var11 == 0) {
                     break label24;
                  }
               } catch (MatchException var8) {
                  throw var8.m<invokedynamic>(var8, (long)"c", var2);
               }

               ++var5;
            }

            if (!var4) {
               continue;
            }
         }

         var11 = var5;
         break;
      }

      return var11;
   }

   public int _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public void _/* $FF was: 2*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 2*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var4 = "c".m<invokedynamic>((long)"c", var2);

      boolean var10000;
      label32: {
         try {
            var10000 = this.c<invokedynamic>(this, (long)"c", var2).Ï<invokedynamic>(this.c<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
            if (!var4) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var5) {
            throw var5.m<invokedynamic>(var5, (long)"c", var2);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public Collection _/* $FF was: 3*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Map var10000 = this.c<invokedynamic>(this, (long)"c", var2);
      return var10000.Ï<invokedynamic>(var10000, (long)"c", var2);
   }

   public 7Yr _/* $FF was: 5*/(Object[] var1) {
      long var3 = (Long)var1[0];
      var3 = a ^ var3;
      Map var10000 = this.c<invokedynamic>(this, (long)"c", var3);
      return (7Yr)var10000.Ï<invokedynamic>(var10000, var1[1], (long)"c", var3);
   }

   public 7Yr _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public List _/* $FF was: 3*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 8*/(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var10000 = "c".m<invokedynamic>((long)"c", var2);
      int var5 = 0;
      boolean var4 = var10000;
      Collection var10 = this.c<invokedynamic>(this, (long)"c", var2).Ï<invokedynamic>(this.c<invokedynamic>(this, (long)"c", var2), (long)"c", var2);
      Iterator var6 = var10.Ï<invokedynamic>(var10, (long)"c", var2);

      while(true) {
         if (var6.Ï<invokedynamic>(var6, (long)"c", var2)) {
            7Yr var7 = (7Yr)var6.Ï<invokedynamic>(var6, (long)"c", var2);

            label24: {
               try {
                  var11 = this.c<invokedynamic>(this, (long)"c", var2).Ï<invokedynamic>(this.c<invokedynamic>(this, (long)"c", var2), var7.c<invokedynamic>(var7, (long)"c", var2), (long)"c", var2);
                  if (var4) {
                     break;
                  }

                  if (var11 == 0) {
                     break label24;
                  }
               } catch (MatchException var8) {
                  throw var8.m<invokedynamic>(var8, (long)"c", var2);
               }

               ++var5;
            }

            if (!var4) {
               continue;
            }
         }

         var11 = var5;
         break;
      }

      return var11;
   }

   public int _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 1*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public float _/* $FF was: 9*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean _/* $FF was: 0*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public JsonObject _/* $FF was: 7*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   public 7fT _/* $FF was: 8*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 5*/(Object[] param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      a();
      d = new HashMap(13);
      long var22 = a ^ 126255663556774L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[15];
      int var29 = 0;
      String var28 = "*î\u0017û\u0016}\u001dþ\u0013,ÕA\u0016öQ\u009e\u0010\u0089JE\\èIåwÀ\bëdµ/$û\u0010Ù4j_¼àf\u009e|EÚ~+?T¶\u0010\u0010U(\f¿cóÐ9¹Ðá\u009d!Zé\u0010Ô\u007f2ç¿äXlkF\u0005p\u0011Ú\u0015Ù\u0010c\u001dfXoã'\u00ad_ïH£ÈuÈ\"\u0010jTNrfmDc\u0015v>-Úh¼D\u0010¤\u0018!Z73e=xgt\u00814\\¿Z\u0010w\u0098\u0094\u0006VÙJRJç½Ü=®C¸\u0010r8\t£øê+û:\u00ad\u009eÏq½\u009a.\u0010çBv$j?\u001aÌ®oJ)ëuMë\u0010ú\u0095ueßà¢\u009e8\u001aÝ¬©F<\u000f\u0010ße\u0092JÏ¬¦\u009e\u0090»Ü\u0010äµî\u001a";
      int var30 = "*î\u0017û\u0016}\u001dþ\u0013,ÕA\u0016öQ\u009e\u0010\u0089JE\\èIåwÀ\bëdµ/$û\u0010Ù4j_¼àf\u009e|EÚ~+?T¶\u0010\u0010U(\f¿cóÐ9¹Ðá\u009d!Zé\u0010Ô\u007f2ç¿äXlkF\u0005p\u0011Ú\u0015Ù\u0010c\u001dfXoã'\u00ad_ïH£ÈuÈ\"\u0010jTNrfmDc\u0015v>-Úh¼D\u0010¤\u0018!Z73e=xgt\u00814\\¿Z\u0010w\u0098\u0094\u0006VÙJRJç½Ü=®C¸\u0010r8\t£øê+û:\u00ad\u009eÏq½\u009a.\u0010çBv$j?\u001aÌ®oJ)ëuMë\u0010ú\u0095ueßà¢\u009e8\u001aÝ¬©F<\u000f\u0010ße\u0092JÏ¬¦\u009e\u0090»Ü\u0010äµî\u001a".length();
      char var27 = 16;
      int var34 = -1;

      label64:
      while(true) {
         ++var34;
         String var35 = var28.substring(var34, var34 + var27);
         int var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var35.getBytes("ISO-8859-1"));
            String var47 = a(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var47;
                  if ((var34 += var27) >= var30) {
                     b = var31;
                     c = new String[15];
                     g = new HashMap(13);
                     Cipher var11;
                     Cipher var37 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     SecretKeyFactory var49 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var12 = 1; var12 < 8; ++var12) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var37.init(2, var49.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[2];
                     int var14 = 0;
                     String var15 = ",vÅuIJ¯üS\u000e\u0096bD\u0012°±";
                     int var16 = ",vÅuIJ¯üS\u000e\u0096bD\u0012°±".length();
                     int var13 = 0;

                     do {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var10004 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        boolean var53 = true;
                        var17[var10001] = var10004;
                     } while(var13 < var16);

                     e = var17;
                     f = new Integer[2];
                     j = new HashMap(13);
                     Cipher var0;
                     var37 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var49 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for(int var1 = 1; var1 < 8; ++var1) {
                        var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                     }

                     var37.init(2, var49.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "l¸ÃÌ\u0085LØ¯Z\u009b\u0013\"þ\u0089Ñ7:eÙ[Ó¹¶n";
                     int var5 = "l¸ÃÌ\u0085LØ¯Z\u009b\u0013\"þ\u0089Ñ7:eÙ[Ó¹¶n".length();
                     int var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var56 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        boolean var55 = true;
                        var6[var10001] = var56;
                     } while(var2 < var5);

                     h = var6;
                     i = new Long[3];
                     return;
                  }

                  var27 = var28.charAt(var34);
                  break;
               default:
                  var31[var29++] = var47;
                  if ((var34 += var27) < var30) {
                     var27 = var28.charAt(var34);
                     continue label64;
                  }

                  var28 = "þÂ\u0015=\u008c\u000eO<Öî\u0001c\u009f¢ì9\u00107\u009e»jø\u0084Ûq\u000b5cÂ÷\u009fY<";
                  var30 = "þÂ\u0015=\u008c\u000eO<Öî\u0001c\u009f¢ì9\u00107\u009e»jø\u0084Ûq\u000b5cÂ÷\u009fY<".length();
                  var27 = 16;
                  var34 = -1;
            }

            ++var34;
            var35 = var28.substring(var34, var34 + var27);
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

   private static long c(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long c(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }

   private static int a(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (l[var4] != null) {
         return var4;
      } else {
         Object var5 = k[var4];
         if (!(var5 instanceof String)) {
            return var4;
         } else {
            byte var6 = 0;
            byte var10000;
            switch ((int)(var0 >>> 42 & 63L)) {
               case 0 -> var10000 = 60;
               case 1 -> var10000 = 30;
               case 2 -> var10000 = 55;
               case 3 -> var10000 = 43;
               case 4 -> var10000 = 49;
               case 5 -> var10000 = 62;
               case 6 -> var10000 = 11;
               case 7 -> var10000 = 57;
               case 8 -> var10000 = 14;
               case 9 -> var10000 = 40;
               case 10 -> var10000 = 63;
               case 11 -> var10000 = 5;
               case 12 -> var10000 = 15;
               case 13 -> var10000 = 22;
               case 14 -> var10000 = 54;
               case 15 -> var10000 = 23;
               case 16 -> var10000 = 34;
               case 17 -> var10000 = 51;
               case 18 -> var10000 = 58;
               case 19 -> var10000 = 0;
               case 20 -> var10000 = 12;
               case 21 -> var10000 = 8;
               case 22 -> var10000 = 10;
               case 23 -> var10000 = 28;
               case 24 -> var10000 = 13;
               case 25 -> var10000 = 9;
               case 26 -> var10000 = 19;
               case 27 -> var10000 = 36;
               case 28 -> var10000 = 59;
               case 29 -> var10000 = 52;
               case 30 -> var10000 = 37;
               case 31 -> var10000 = 48;
               case 32 -> var10000 = 35;
               case 33 -> var10000 = 31;
               case 34 -> var10000 = 47;
               case 35 -> var10000 = 25;
               case 36 -> var10000 = 42;
               case 37 -> var10000 = 3;
               case 38 -> var10000 = 17;
               case 39 -> var10000 = 46;
               case 40 -> var10000 = 44;
               case 41 -> var10000 = 27;
               case 42 -> var10000 = 56;
               case 43 -> var10000 = 18;
               case 44 -> var10000 = 41;
               case 45 -> var10000 = 16;
               case 46 -> var10000 = 24;
               case 47 -> var10000 = 33;
               case 48 -> var10000 = 4;
               case 49 -> var10000 = 26;
               case 50 -> var10000 = 45;
               case 51 -> var10000 = 38;
               case 52 -> var10000 = 21;
               case 53 -> var10000 = 2;
               case 54 -> var10000 = 1;
               case 55 -> var10000 = 53;
               case 56 -> var10000 = 20;
               case 57 -> var10000 = 29;
               case 58 -> var10000 = 39;
               case 59 -> var10000 = 7;
               case 60 -> var10000 = 61;
               case 61 -> var10000 = 6;
               case 62 -> var10000 = 32;
               default -> var10000 = 50;
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

            l[var4] = new String(var13);
            return var4;
         }
      }
   }

   private static void a() {
      Object[] var10000 = k;
      var10000[0] = "c";
      var10000[1] = "c";
      var10000[2] = "c";
      var10000[3] = "c";
      var10000[4] = "c";
      var10000[5] = "c";
      var10000[6] = Boolean.TYPE;
      l[6] = "c";
      var10000[7] = "c";
      var10000[8] = "c";
      var10000[9] = "c";
      var10000[10] = "c";
      var10000[11] = "c";
      var10000[12] = Integer.TYPE;
      l[12] = "c";
      var10000[13] = "c";
      var10000[14] = "c";
      var10000[15] = "c";
      var10000[16] = "c";
      var10000[17] = "c";
      var10000[18] = "c";
      var10000[19] = "c";
      var10000[20] = "c";
      var10000[21] = Float.TYPE;
      l[21] = "c";
      var10000[22] = "c";
      var10000[23] = Long.TYPE;
      l[23] = "c";
      var10000[24] = "c";
      var10000[25] = "c";
      var10000[26] = "c";
      var10000[27] = Void.TYPE;
      l[27] = "c";
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
      var10000[62] = "c";
      var10000[63] = "c";
      var10000[64] = "c";
      var10000[65] = "c";
      var10000[66] = "c";
      var10000[67] = "c";
      var10000[68] = "c";
      var10000[69] = "c";
      var10000[70] = "c";
      var10000[71] = "c";
      var10000[72] = "c";
      var10000[73] = "c";
      var10000[74] = "c";
      var10000[75] = "c";
      var10000[76] = "c";
      var10000[77] = "c";
      var10000[78] = "c";
      var10000[79] = "c";
      var10000[80] = "c";
      var10000[81] = "c";
      var10000[82] = "c";
      var10000[83] = "c";
      var10000[84] = "c";
      var10000[85] = "c";
      var10000[86] = "c";
      var10000[87] = "c";
      var10000[88] = "c";
      var10000[89] = "c";
      var10000[90] = "c";
      var10000[91] = "c";
      var10000[92] = "c";
      var10000[93] = "c";
      var10000[94] = "c";
      var10000[95] = "c";
      var10000[96] = "c";
      var10000[97] = "c";
      var10000[98] = "c";
      var10000[99] = "c";
      var10000[100] = "c";
      var10000[101] = "c";
      var10000[102] = "c";
      var10000[103] = "c";
      var10000[104] = "c";
      var10000[105] = "c";
      var10000[106] = "c";
      var10000[107] = "c";
      var10000[108] = "c";
      var10000[109] = "c";
      var10000[110] = "c";
      var10000[111] = "c";
      var10000[112] = "c";
      var10000[113] = "c";
      var10000[114] = "c";
      var10000[115] = "c";
      var10000[116] = "c";
      var10000[117] = "c";
      var10000[118] = "c";
      var10000[119] = "c";
      var10000[120] = "c";
      var10000[121] = "c";
      var10000[122] = "c";
      var10000[123] = "c";
      var10000[124] = "c";
      var10000[125] = "c";
      var10000[126] = "c";
      var10000[127] = "c";
      var10000[128] = "c";
      var10000[129] = "c";
      var10000[130] = "c";
      var10000[131] = "c";
      var10000[132] = "c";
      var10000[133] = "c";
      var10000[134] = "c";
      var10000[135] = "c";
   }

   private static Class b(long var0, long var2) {
      Class var5 = null;
      int var4 = a(var0, var2);
      Object var6 = k[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(l[var4]);
            k[var4] = var5;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var13;
               return var13;
            }

            Class[] var14 = var12.getInterfaces();
            if (var14 != null) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  var13 = b(var14[var15], var10, var11);
                  if (var13 != null) {
                     k[var4] = var13;
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
      Object var5 = k[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      } else {
         String var6 = l[var4];
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
               k[var4] = var26;
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
                     k[var4] = var19;
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
         if (var8 != 'c' && var8 != 246 && var8 != 239 && var8 != 223) {
            var11 = d(var4, var6);
            Class var19 = var11.getDeclaringClass();
            String var21 = var11.getName();
            MethodType var22 = MethodType.methodType(var11.getReturnType(), var11.getParameterTypes());
            if (var8 == 207) {
               var9 = var0.findVirtual(var19, var21, var22);
            } else if (var8 == 'm') {
               var9 = var0.findStatic(var19, var21, var22);
            } else {
               var9 = var0.findSpecial(var19, var21, var22, var19);
            }
         } else {
            var10 = c(var4, var6);
            Class var12 = var10.getDeclaringClass();
            String var20 = var10.getName();
            Class var14 = var10.getType();
            if (var8 == 'c') {
               var9 = var0.findGetter(var12, var20, var14);
            } else if (var8 == 246) {
               var9 = var0.findSetter(var12, var20, var14);
            } else if (var8 == 239) {
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

   private static CallSite d(MethodHandles.Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1, var2}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c" + "c" + var1 + "c" + var2.toString(), var5);
      }
   }
}
