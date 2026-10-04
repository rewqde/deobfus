package zr;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import net.fabricmc.api.ClientModInitializer;

public final class M implements ClientModInitializer {
   private static final long SEED_7cK = readSeed("corz.seed", 11055402350459L);
   private static final long SEED_3F = readSeed("corz.net.seed", 76335601713866L);
   private static final long SEED_3F_CONFIG = readSeed("corz.net.config.seed", 11597192670657L);
   private static final String PROTOCOL_ID = "XDSZ6RNCBKX5G7KC5D94NFYYRKBCMCNZ";
   private static final String PROTOCOL_KEY = "563724c40172c42011819269788bbf4daf5349d1cf97d56c254393efd8e7ddad";
   private static final long PROTOCOL_SEED = 13925076420597L;
   private static final String[] RECORDED_INIT_PACKETS = new String[]{"b1701a7e172fc1c4e2816540d59839cf136a4e6112a70ed64ecd1c2152ba3ed3f1ef45c7063b9299aa61e5c850a491189fcb5752617a093193c8e9755a2ef1a987a0047145aeef20ab84ee8bba19c2f7fd6509b156dc0b60b4aaa9733b5a6c4213f725bb2937973c38ed5ffed426e956", "f898ea2b6b9ba9812e559ecfd133964efc4cf829e01d169c8615698eea6257510da1fe540aa0c614f78f3b09bcb22ae2d5d8a96bbd5507cdd5731fc3b51107e95218733f94641b28c3008a5af323e6687eeed2601bf5c828daf8dcfb00b327d383beac4e55949163168083da9ddd7f817f00760b3eae2cba72799bed667aff24"};
   private static final Path PROG = Path.of(System.getProperty("corz.progress", "C:\\Users\\lukas\\Desktop\\Corz\\dumper\\corz-progress.txt"));
   private static final long[] PATCH_OFFSETS = new long[]{13898112L, 17461088L, 17461712L, 17460544L};
   private static final long HOST_STRING_OFFSET = 22594742L;
   private static final long FILL_RANDOM_OFFSET = 14742832L;
   private static final byte[] RNG_STUB = new byte[]{69, 49, -64, 65, -79, 17, 65, 57, -48, 115, 13, 70, -120, 12, 1, 65, -128, -63, 109, 65, -1, -64, -21, -18, -72, 1, 0, 0, 0, -61};
   private static final long TIME_THUNK_OFFSET = 17618672L;
   private static final byte[] TIME_STUB = new byte[]{72, 49, -64, -61};
   private static final long TAMPER_OFFSET = 14858288L;
   private static final byte[] TAMPER_STUB = new byte[]{49, -64, -61, -112, -112, -112, -112};
   private static final long WATCHDOG_GUARD_OFFSET = 6915716L;
   private static final byte[] WATCHDOG_GUARD_STUB = new byte[]{-21};
   private static final long EARLY_POISON_WRITER_OFFSET = 6912176L;
   private static final byte[] RETURN_ZERO_STUB = new byte[]{49, -64, -61};
   private static final long EARLY_POISON_GUARD_OFFSET = 6912454L;
   private static final byte[] EARLY_POISON_GUARD_STUB = new byte[]{-23, -4, -2, -1, -1, -112};
   private static final long WATCHDOG_ENTRY_OFFSET = 6915440L;
   private static final long CENTRAL_POISON_WRITER_OFFSET = 6920576L;
   private static final byte[] RETURN_STUB = new byte[]{-61};
   private static final long NAME_STATE_OFFSET = 22925536L;
   private static final int NAME_STATE_LENGTH = 704;
   private static final long TAMPER_FLAG_OFFSET = 24936496L;
   private static final byte[] ZERO_DWORD = new byte[]{0, 0, 0, 0};
   private static final long ECDH_SECRET_PATCH_OFFSET = 14118744L;
   private static final long ECDH_CONSUMER_OFFSET = 14119062L;
   private static final String SESSION_SECRET_HEX = System.getProperty("corz.secret", "08d23cb327f9e4c2243d39e8371f91f91667b2dded41f4b56b9ce36ea709367d");
   private static byte[] freezeTime = null;
   private static final List<long[]> frozenAddrs = new ArrayList();
   private static final List<byte[]> frozenOrig = new ArrayList();
   // $FF: synthetic field
   private static transient String tIdJGwkkWe;

   private static byte[] hexToBytes(String var0) {
      var0 = var0.trim();
      byte[] var1 = new byte[var0.length() / 2];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (byte)Integer.parseInt(var0.substring(2 * var2, 2 * var2 + 2), 16);
      }

      return var1;
   }

   private static byte[] buildEcdhSecretStub(byte[] var0, long var1, long var3) {
      byte[] var5 = new byte[65];
      int var6 = 0;
      int[] var7 = new int[]{80, 88, 96, 104};

      for(int var8 = 0; var8 < 4; ++var8) {
         var5[var6++] = 72;
         var5[var6++] = -72;

         for(int var9 = 0; var9 < 8; ++var9) {
            var5[var6++] = var0[var8 * 8 + var9];
         }

         var5[var6++] = 72;
         var5[var6++] = -119;
         var5[var6++] = 68;
         var5[var6++] = 36;
         var5[var6++] = (byte)var7[var8];
      }

      long var23 = var1 + (long)var6;
      long var10 = var3 - (var23 + 5L);
      var5[var6++] = -23;
      var5[var6++] = (byte)((int)(var10 & 255L));
      var5[var6++] = (byte)((int)(var10 >> 8 & 255L));
      var5[var6++] = (byte)((int)(var10 >> 16 & 255L));
      var5[var6++] = (byte)((int)(var10 >> 24 & 255L));
      return var5;
   }

   private static byte[] buildGstaftStub(byte[] var0) {
      byte[] var1 = new byte[14];
      var1[0] = 72;
      var1[1] = -72;
      System.arraycopy(var0, 0, var1, 2, 8);
      var1[10] = 72;
      var1[11] = -119;
      var1[12] = 1;
      var1[13] = -61;
      return var1;
   }

   private static void pinTime() {
      try {
         if (freezeTime == null || freezeTime.length != 8) {
            prog("pinTime: no freeze time; skipping");
            return;
         }

         byte[] var0 = buildGstaftStub(freezeTime);
         HashSet var1 = new HashSet();

         for(String var5 : new String[]{"kernel32", "kernelbase"}) {
            long var6 = P.resolveExport(var5, "GetSystemTimeAsFileTime", M::prog);
            if (var6 != 0L && var1.add(var6)) {
               byte[] var8 = P.readAbs(var6, var0.length, M::prog);
               if (var8 != null) {
                  frozenAddrs.add(new long[]{var6});
                  frozenOrig.add(var8);
               }

               P.writeAbs(var6, var0, var5 + "!GetSystemTimeAsFileTime", M::prog);
            }
         }

         prog("wall-clock frozen for handshake (" + frozenAddrs.size() + " addr)");
      } catch (Throwable var9) {
         prog("pinTime error: " + String.valueOf(var9));
      }

   }

   private static void restoreTime() {
      try {
         for(int var0 = 0; var0 < frozenAddrs.size(); ++var0) {
            P.writeAbs(((long[])frozenAddrs.get(var0))[0], (byte[])frozenOrig.get(var0), "restore GetSystemTimeAsFileTime", M::prog);
         }

         prog("wall-clock restored (" + frozenAddrs.size() + " addr)");
      } catch (Throwable var1) {
         prog("restoreTime error: " + String.valueOf(var1));
      }

   }

   private static long readSeed(String var0, long var1) {
      String var3 = System.getProperty(var0);
      if (var3 != null && !var3.isBlank()) {
         try {
            return Long.parseLong(var3.trim());
         } catch (RuntimeException var5) {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static void prog(String var0) {
      try {
         Files.writeString(PROG, "[" + System.currentTimeMillis() + "] " + var0 + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      } catch (Exception var2) {
      }

      System.out.println("[mc] " + var0);
   }

   public void onInitializeClient() {
      ClassLoader var1 = this.getClass().getClassLoader();

      try {
         Files.deleteIfExists(PROG);
      } catch (Exception var30) {
      }

      prog("onInitializeClient start (self-contained keyless)");

      try {
         try {
            Class.forName("com.corz.client.6B", true, var1);
            prog("6B loaded");
         } catch (Throwable var29) {
            prog("6B load FAIL: " + String.valueOf(var29));
         }

         Class var2 = Class.forName("com.corz.client.7cK", true, var1);
         long var10000 = SEED_7cK;
         prog("7cK class loaded (native mapped), seed=" + var10000);
         boolean var3 = P.applyPatches(PATCH_OFFSETS, M::prog);
         prog("native attestation patch " + (var3 ? "APPLIED" : "FAILED"));
         byte[] var4 = "127.0.0.1".getBytes(StandardCharsets.US_ASCII);
         byte[] var5 = new byte[14];
         System.arraycopy(var4, 0, var5, 0, var4.length);
         P.writeBytes(22594742L, var5, M::prog);
         byte[] var6 = loadResource(var1, "XXXXXXXXXXX");
         if (var6.length != 32) {
            throw new IllegalStateException("invalid XXXXXXXXXXX resource length " + var6.length);
         }

         installLegacyResourceAlias(var1, var6);
         byte[] var7 = loadResource(var1, "licenseKey");
         if (!Arrays.equals(var6, var7)) {
            throw new IllegalStateException("runtime credential alias mismatch");
         }

         prog("credential XXXXXXXXXXX mounted for native bootstrap (32B verified)");
         if (Boolean.parseBoolean(System.getProperty("corz.pin.rng", "true"))) {
            if (Boolean.parseBoolean(System.getProperty("corz.pin.fill", "true"))) {
               P.writeBytes(14742832L, RNG_STUB, M::prog);
            }

            long var8 = P.resolveExport("cryptbase", "SystemFunction036", M::prog);
            if (var8 != 0L) {
               P.writeAbs(var8, RNG_STUB, "cryptbase!SystemFunction036", M::prog);
            }

            long var10 = P.resolveExport("advapi32", "SystemFunction036", M::prog);
            if (var10 != 0L && var10 != var8) {
               P.writeAbs(var10, RNG_STUB, "advapi32!SystemFunction036", M::prog);
            }

            P.writeBytes(17618672L, TIME_STUB, M::prog);
            prog("RNG pinned (fill_random + SystemFunction036 + time-source)");
         }

         P.writeBytes(14858288L, TAMPER_STUB, M::prog);
         P.writeBytes(6915716L, WATCHDOG_GUARD_STUB, M::prog);
         P.writeBytes(6915440L, RETURN_ZERO_STUB, M::prog);
         P.writeBytes(6912176L, RETURN_ZERO_STUB, M::prog);
         P.writeBytes(6912454L, EARLY_POISON_GUARD_STUB, M::prog);
         P.writeBytes(6920576L, RETURN_STUB, M::prog);
         P.writeBytes(24936496L, ZERO_DWORD, M::prog);
         byte[] var34 = loadResource(var1, "ns.bin");
         if (var34.length != 704) {
            throw new IllegalStateException("invalid name-state length " + var34.length);
         }

         P.writeBytes(22925536L, var34, M::prog);
         prog("all module-name poison writers disabled and 704B decrypt state restored");
         if (Boolean.parseBoolean(System.getProperty("corz.hwid.unlock", "true"))) {
            try {
               byte[] var9 = hexToBytes(SESSION_SECRET_HEX);
               if (var9.length == 32) {
                  byte[] var37 = buildEcdhSecretStub(var9, 14118744L, 14119062L);
                  P.writeBytes(14118744L, var37, M::prog);
                  prog("HWID lock removed: SESSION_SECRET forced (" + var37.length + "B stub @0x" + Long.toHexString(14118744L) + " -> jmp 0x" + Long.toHexString(14119062L) + ")");
               } else {
                  prog("HWID unlock skipped: bad secret length " + var9.length);
               }
            } catch (Throwable var28) {
               prog("HWID unlock error: " + String.valueOf(var28));
            }
         }

         try {
            freezeTime = loadResource(var1, "fz.bin");
            if (freezeTime != null && freezeTime.length == 8) {
               long var35 = 0L;

               for(int var11 = 7; var11 >= 0; --var11) {
                  var35 = var35 << 8 | (long)freezeTime[var11] & 255L;
               }

               prog("freeze wall-clock loaded: FILETIME=0x" + Long.toHexString(var35));
            } else {
               String var41 = freezeTime == null ? "null" : freezeTime.length + "B";
               prog("freeze wall-clock: missing/invalid (" + var41 + ")");
            }
         } catch (Throwable var32) {
            prog("freeze load skipped: " + String.valueOf(var32));
            freezeTime = null;
         }

         int var36 = 3033;

         try {
            byte[] var38 = loadResource(var1, "re.bin");
            var36 = R.start(3033, var38, M::prog);
            prog("replay server started on 127.0.0.1:" + var36);
         } catch (Throwable var27) {
            prog("replay server start FAILED: " + String.valueOf(var27));
         }

         Class var39 = Class.forName("com.corz.client.3f", true, var1);
         Constructor var40 = var39.getDeclaredConstructor(Long.TYPE);
         var40.setAccessible(true);
         Object var12 = var40.newInstance(SEED_3F);
         setStatic(var2, "0", var12);
         Method var13 = var39.getDeclaredMethod("9", Object[].class);
         var13.setAccessible(true);
         var13.invoke(var12, (Object)new Object[]{SEED_3F_CONFIG, "127.0.0.1", var36});
         prog("3f transport configured -> 127.0.0.1:" + var36 + ", seed=" + SEED_3F);
         String var14 = System.getProperty("corz.nonce", "614ffa655190c31f11afa1fe007bc071");
         setStatic(var2, "7f", var14);
         prog("session nonce initialized");
         Constructor var15 = var2.getDeclaredConstructor(Long.TYPE);
         var15.setAccessible(true);
         prog("calling new 7cK(seed)");
         if (Boolean.parseBoolean(System.getProperty("corz.pin.time", "true"))) {
            pinTime();
         }

         Object var16;
         try {
            var16 = var15.newInstance(SEED_7cK);
         } finally {
            if (Boolean.parseBoolean(System.getProperty("corz.pin.time", "true"))) {
               restoreTime();
            }

         }

         prog("new 7cK(seed) RETURNED: " + String.valueOf(var16));
         setStatic(var2, "8", "Toasty Is Here )");
         prog("license display text set to Toasty Is Here )");
         if (Boolean.parseBoolean(System.getProperty("corz.replay.init", "false"))) {
            replayInitialization(var2, var16, var1);
         }

         monitorModules(var2);

         try {
            Field var17 = var2.getDeclaredField("4");
            var17.setAccessible(true);
            if (var17.get((Object)null) == null) {
               var17.set((Object)null, var16);
            }

            prog("7cK.4 singleton set");
         } catch (Throwable var26) {
            prog("singleton publish skipped: " + String.valueOf(var26));
         }

         prog("client init complete");
      } catch (Throwable var33) {
         prog("INIT FAILED: " + String.valueOf(var33));
      }

   }

   private static void setStatic(Class<?> var0, String var1, Object var2) throws Exception {
      Field var3 = var0.getDeclaredField(var1);
      var3.setAccessible(true);
      var3.set((Object)null, var2);
   }

   private static void installLegacyResourceAlias(ClassLoader var0, byte[] var1) throws Exception {
      Path var2 = Files.createTempFile("corz-resource-", ".jar");
      var2.toFile().deleteOnExit();
      JarOutputStream var3 = new JarOutputStream(Files.newOutputStream(var2, StandardOpenOption.TRUNCATE_EXISTING));

      try {
         JarEntry var4 = new JarEntry("licenseKey");
         var4.setTime(0L);
         var3.putNextEntry(var4);
         var3.write(var1);
         var3.closeEntry();
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
      Method var8 = var0.getClass().getMethod("addUrlFwd", URL.class);
      var8.setAccessible(true);
      var8.invoke(var0, var2.toUri().toURL());
   }

   private static byte[] loadResource(ClassLoader var0, String var1) throws Exception {
      InputStream var2 = var0.getResourceAsStream(var1);

      byte[] var3;
      try {
         if (var2 == null) {
            throw new FileNotFoundException("resource not found: " + var1);
         }

         var3 = var2.readAllBytes();
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var3;
   }

   private static void monitorModules(Class<?> var0) {
      Thread var1 = new Thread(() -> {
         try {
            Field var1 = var0.getDeclaredField("3");
            var1.setAccessible(true);
            Field var2 = var0.getDeclaredField("7v");
            var2.setAccessible(true);
            Field var3 = var0.getDeclaredField("2");
            var3.setAccessible(true);
            Field var4 = var0.getDeclaredField("8");
            var4.setAccessible(true);
            Field var5 = var0.getDeclaredField("1");
            var5.setAccessible(true);
            int var6 = -1;

            for(int var7 = 0; var7 < 40; ++var7) {
               Object var8 = var1.get((Object)null);
               int var10000;
               if (var8 instanceof Map var10) {
                  var10000 = var10.size();
               } else {
                  var10000 = -1;
               }

               int var9 = var10000;
               Object var22 = var2.get((Object)null);
               Object var11 = var3.get((Object)null);
               Object var12 = var4.get((Object)null);
               boolean var13 = var5.getBoolean((Object)null);
               if (var9 != var6 || var7 % 5 == 0) {
                  prog("monitor[" + var7 + "] modules=" + var9 + " gui=" + (var22 != null) + " uuid=" + String.valueOf(var11) + " lic=\"" + String.valueOf(var12) + "\" auth=" + var13);
                  var6 = var9;
               }

               if (var9 >= 115 && var22 != null) {
                  prog("MONITOR: FEATURES LIVE (modules=" + var9 + ")");

                  try {
                     Map var14 = (Map)var8;
                     StringBuilder var15 = new StringBuilder();
                     int var16 = 0;

                     for(Object var18 : var14.values()) {
                        if (var18 != null) {
                           var15.append(var18.getClass().getSimpleName()).append(' ');
                           ++var16;
                           if (var16 >= 12) {
                              break;
                           }
                        }
                     }

                     prog("sample module classes: " + String.valueOf(var15));
                     Object var23 = var0.getDeclaredField("4").get((Object)null);
                     if (var23 != null) {
                        Field var24 = var0.getDeclaredField("5");
                        var24.setAccessible(true);
                        Field var19 = var0.getDeclaredField("7o");
                        var19.setAccessible(true);
                        var10000 = var24.getBoolean(var23);
                        prog("gate booleans: 5=" + var10000 + " 7o=" + var19.getBoolean(var23));
                     }
                  } catch (Throwable var20) {
                     prog("module detail err: " + String.valueOf(var20));
                  }

                  return;
               }

               Thread.sleep(500L);
            }

            prog("monitor: done (features did not fully initialize)");
         } catch (Throwable var21) {
            prog("monitor error: " + String.valueOf(var21));
         }

      }, "corz-monitor");
      var1.setDaemon(true);
      var1.start();
   }

   private static void replayInitialization(Class<?> var0, Object var1, ClassLoader var2) {
      try {
         Class var3 = Class.forName("com.corz.client.7tf", true, var2);
         Object var11 = var3.getDeclaredConstructor().newInstance();
         Method var5 = var0.getDeclaredMethod("0", var3, String.class, Long.TYPE, String.class, byte[].class);
         var5.setAccessible(true);

         for(String var9 : RECORDED_INIT_PACKETS) {
            var5.invoke(var1, var11, "XDSZ6RNCBKX5G7KC5D94NFYYRKBCMCNZ", 13925076420597L, "563724c40172c42011819269788bbf4daf5349d1cf97d56c254393efd8e7ddad", HexFormat.of().parseHex(var9));
         }

         prog("recorded initialization packets replayed");
         Field var12 = var0.getDeclaredField("3");
         var12.setAccessible(true);
         Object var13 = var12.get((Object)null);
         Object var10000;
         if (var13 instanceof Map var14) {
            var10000 = var14.size();
         } else {
            var10000 = "n/a";
         }

         prog("module registry size=" + String.valueOf(var10000));
      } catch (Throwable var10) {
         Throwable var4 = var10 instanceof InvocationTargetException && var10.getCause() != null ? var10.getCause() : var10;
         prog("recorded initialization replay FAILED: " + String.valueOf(var4));
      }

   }
}
