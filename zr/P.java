package zr;

import java.lang.reflect.Method;
import java.util.function.Consumer;

final class P {
   private static Class<?> JNI;
   private static Class<?> MU;
   private static Object K32;
   private static Method mGetFn;
   private static volatile long clientBase = 0L;
   // $FF: synthetic field
   private static transient String lryuDtGHko;

   private static void ensureInit() throws Throwable {
      if (mGetFn == null) {
         Class var0 = Class.forName("org.lwjgl.system.APIUtil");
         JNI = Class.forName("org.lwjgl.system.JNI");
         MU = Class.forName("org.lwjgl.system.MemoryUtil");
         K32 = var0.getMethod("apiCreateLibrary", String.class).invoke((Object)null, "kernel32");
         mGetFn = K32.getClass().getMethod("getFunctionAddress", CharSequence.class);
      }
   }

   static long base(Consumer<String> var0) {
      try {
         if (clientBase != 0L) {
            return clientBase;
         } else {
            ensureInit();
            long var1 = findClientBase(var0);
            if (var1 == 0L) {
               var0.accept("P: client base not found");
               return 0L;
            } else {
               clientBase = var1;
               var0.accept("P: client native base=0x" + Long.toHexString(var1));
               return var1;
            }
         }
      } catch (Throwable var3) {
         var0.accept("P base ERROR: " + String.valueOf(var3));
         return 0L;
      }
   }

   static boolean applyPatches(long[] var0, Consumer<String> var1) {
      try {
         long var2 = base(var1);
         if (var2 == 0L) {
            return false;
         } else {
            long var4 = fn("VirtualProtect");
            long var6 = nmemAlloc(16L);
            int var8 = 0;

            for(long var12 : var0) {
               long var14 = var2 + var12;
               int var16 = callVirtualProtect(var4, var14, 1L, 64, var6);
               if (var16 == 0) {
                  var1.accept("  VirtualProtect FAILED @0x" + Long.toHexString(var12));
               } else {
                  memPutByte(var14, (byte)-61);
                  int var17 = memGetInt(var6);
                  callVirtualProtect(var4, var14, 1L, var17, var6);
                  ++var8;
                  var1.accept("  patched 0x" + Long.toHexString(var12) + " -> 0xC3");
               }
            }

            nmemFree(var6);
            return var8 == var0.length;
         }
      } catch (Throwable var18) {
         var1.accept("P ERROR: " + String.valueOf(var18));
         return false;
      }
   }

   static boolean writeBytes(long var0, byte[] var2, Consumer<String> var3) {
      long var4 = base(var3);
      return var4 == 0L ? false : writeAbs(var4 + var0, var2, "0x" + Long.toHexString(var0), var3);
   }

   static boolean writeAbs(long var0, byte[] var2, String var3, Consumer<String> var4) {
      try {
         ensureInit();
         long var5 = fn("VirtualProtect");
         long var7 = nmemAlloc(16L);
         int var9 = callVirtualProtect(var5, var0, (long)var2.length, 64, var7);
         if (var9 == 0) {
            var4.accept("  writeAbs VirtualProtect FAILED @" + var3);
            nmemFree(var7);
            return false;
         } else {
            for(int var10 = 0; var10 < var2.length; ++var10) {
               memPutByte(var0 + (long)var10, var2[var10]);
            }

            int var12 = memGetInt(var7);
            callVirtualProtect(var5, var0, (long)var2.length, var12, var7);
            nmemFree(var7);
            var4.accept("  wrote " + var2.length + "B @" + var3);
            return true;
         }
      } catch (Throwable var11) {
         var4.accept("P writeAbs ERROR: " + String.valueOf(var11));
         return false;
      }
   }

   static byte[] readAbs(long var0, int var2, Consumer<String> var3) {
      try {
         ensureInit();
         byte[] var4 = new byte[var2];

         for(int var5 = 0; var5 < var2; ++var5) {
            var4[var5] = memGetByte(var0 + (long)var5);
         }

         return var4;
      } catch (Throwable var6) {
         var3.accept("readAbs ERROR: " + String.valueOf(var6));
         return null;
      }
   }

   private static byte memGetByte(long var0) throws Throwable {
      return (Byte)MU.getMethod("memGetByte", Long.TYPE).invoke((Object)null, var0);
   }

   static long resolveExport(String var0, String var1, Consumer<String> var2) {
      try {
         ensureInit();
         Class var3 = Class.forName("org.lwjgl.system.APIUtil");
         Object var4 = var3.getMethod("apiCreateLibrary", String.class).invoke((Object)null, var0);
         Method var5 = var4.getClass().getMethod("getFunctionAddress", CharSequence.class);
         long var6 = (Long)var5.invoke(var4, var1);
         return var6;
      } catch (Throwable var8) {
         var2.accept("resolveExport " + var0 + "!" + var1 + " FAILED: " + String.valueOf(var8));
         return 0L;
      }
   }

   private static long findClientBase(Consumer<String> var0) throws Throwable {
      long var1 = fn("CreateToolhelp32Snapshot");
      long var3 = fn("Module32FirstW");
      long var5 = fn("Module32NextW");
      long var7 = fn("CloseHandle");
      long var9 = fn("GetCurrentProcessId");
      int var11 = (Integer)JNI.getMethod("callI", Long.TYPE).invoke((Object)null, var9);
      long var12 = (Long)JNI.getMethod("callPPP", Long.TYPE, Long.TYPE, Long.TYPE).invoke((Object)null, 24L, (long)var11, var1);
      if (var12 != 0L && var12 != -1L) {
         long var14 = nmemAlloc(1088L);
         memPutInt(var14, 1080);
         Method var16 = JNI.getMethod("callPPI", Long.TYPE, Long.TYPE, Long.TYPE);
         long var17 = 0L;

         for(int var19 = (Integer)var16.invoke((Object)null, var12, var14, var3); var19 != 0; var19 = (Integer)var16.invoke((Object)null, var12, var14, var5)) {
            long var20 = memGetAddress(var14 + 24L);
            int var22 = memGetInt(var14 + 32L);
            String var23 = memUTF16(var14 + 48L).toLowerCase();
            long var24 = (long)var22 & 4294967295L;
            if (var23.startsWith("jvm") && var23.endsWith(".tmp") && var24 >= 10485760L) {
               var17 = var20;
               var0.accept("  module " + var23 + " base=0x" + Long.toHexString(var20) + " size=" + var24);
               break;
            }
         }

         nmemFree(var14);
         JNI.getMethod("callPI", Long.TYPE, Long.TYPE).invoke((Object)null, var12, var7);
         return var17;
      } else {
         var0.accept("snapshot failed");
         return 0L;
      }
   }

   private static long fn(String var0) throws Throwable {
      return (Long)mGetFn.invoke(K32, var0);
   }

   private static int callVirtualProtect(long var0, long var2, long var4, int var6, long var7) throws Throwable {
      return (Integer)JNI.getMethod("callPPPPI", Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE).invoke((Object)null, var2, var4, (long)var6, var7, var0);
   }

   private static long nmemAlloc(long var0) throws Throwable {
      return (Long)MU.getMethod("nmemAlloc", Long.TYPE).invoke((Object)null, var0);
   }

   private static void nmemFree(long var0) throws Throwable {
      MU.getMethod("nmemFree", Long.TYPE).invoke((Object)null, var0);
   }

   private static void memPutInt(long var0, int var2) throws Throwable {
      MU.getMethod("memPutInt", Long.TYPE, Integer.TYPE).invoke((Object)null, var0, var2);
   }

   private static int memGetInt(long var0) throws Throwable {
      return (Integer)MU.getMethod("memGetInt", Long.TYPE).invoke((Object)null, var0);
   }

   private static long memGetAddress(long var0) throws Throwable {
      return (Long)MU.getMethod("memGetAddress", Long.TYPE).invoke((Object)null, var0);
   }

   private static void memPutByte(long var0, byte var2) throws Throwable {
      MU.getMethod("memPutByte", Long.TYPE, Byte.TYPE).invoke((Object)null, var0, var2);
   }

   private static String memUTF16(long var0) throws Throwable {
      return (String)MU.getMethod("memUTF16", Long.TYPE).invoke((Object)null, var0);
   }
}
