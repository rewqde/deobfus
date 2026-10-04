package a.b99571f71427e3b19;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class a {
   private static String mc2a9944fecca7ffa = "99571f71427e3b19";
   private static byte[] mb5b403924f1f92cb = new byte[]{-112, 94, 70, -83, -94, -67, 105, -128, 117, 28, 125, -55, 26, -60, 93, -96, 27, -59, -42, 10, -11, 92, -127, 55, -55, 37, 75, -24, -102, 70, -81, 90};
   private static byte[] m62c1750435a98902 = new byte[]{101, -110, -1, -94, 73, 113, -9, -70, 6, -54, 102, -114, -55, -23, -7, 68, -53, 41, 120, -68, -63, -72, -68, 112, 118, -53, -53, 48, 40, 64, -14, 92};
   // $FF: synthetic field
   private static transient String GfRwYHiMkv;

   public static native void init(Class<?> var0, int var1);

   private static native void bootstrap(Class<?> var0, byte[] var1, byte[] var2, byte[] var3, String var4);

   private static void mfd5447eb2833d625(String platform) throws IOException {
      byte[] container = m2797329048170746("native/" + mc2a9944fecca7ffa + "/s1");
      byte[] variant = mc4570111f0c9a479(container, platform);
      if (variant == null) {
         throw new UnsatisfiedLinkError("invalid platform: " + platform);
      } else {
         File tempFile = File.createTempFile("jvmtp-s1-" + mc2a9944fecca7ffa + "-", m279336a8564800cd(platform));
         tempFile.deleteOnExit();
         Files.write(tempFile.toPath(), variant, new OpenOption[0]);
         System.load(tempFile.getAbsolutePath());
      }
   }

   private static byte[] mc4570111f0c9a479(byte[] c, String platform) {
      int p = 0;
      int count = (c[p] & 255) << 8 | c[p + 1] & 255;
      p += 2;

      for(int i = 0; i < count; ++i) {
         int tagLen = c[p++] & 255;
         String tag = new String(c, p, tagLen, StandardCharsets.UTF_8);
         p += tagLen;
         int offset = me5d84ad517ef41fe(c, p);
         p += 4;
         int len = me5d84ad517ef41fe(c, p);
         p += 4;
         if (tag.equals(platform)) {
            return Arrays.copyOfRange(c, offset, offset + len);
         }
      }

      return null;
   }

   private static int me5d84ad517ef41fe(byte[] c, int o) {
      return (c[o] & 255) << 24 | (c[o + 1] & 255) << 16 | (c[o + 2] & 255) << 8 | c[o + 3] & 255;
   }

   private static byte[] m2797329048170746(String name) throws IOException {
      InputStream is = a.class.getResourceAsStream("/" + name);

      byte[] var2;
      try {
         if (is == null) {
            throw new IOException("resource not found: " + name);
         }

         var2 = is.readAllBytes();
      } catch (Throwable var5) {
         if (is != null) {
            try {
               is.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (is != null) {
         is.close();
      }

      return var2;
   }

   private static byte[] m82512a2c3f67707b() {
      if (mb5b403924f1f92cb != null && m62c1750435a98902 != null) {
         byte[] baked = new byte[mb5b403924f1f92cb.length];

         for(int i = 0; i < baked.length; ++i) {
            baked[i] = (byte)(mb5b403924f1f92cb[i] ^ m62c1750435a98902[i % m62c1750435a98902.length]);
         }

         return m0e115e67801e1457(baked, m58df9ccb68c003f2());
      } else {
         return new byte[32];
      }
   }

   private static byte[] m0e115e67801e1457(byte[] baked, byte[] tag) {
      byte[] in = new byte[baked.length + tag.length];
      System.arraycopy(baked, 0, in, 0, baked.length);
      System.arraycopy(tag, 0, in, baked.length, tag.length);
      return mbf37c74475433b2f(in);
   }

   private static byte[] m58df9ccb68c003f2() {
      return C50195a7cf0.md1d6a06057();
   }

   private static byte[] mbf37c74475433b2f(byte[] in) {
      try {
         return MessageDigest.getInstance("SHA-256").digest(in);
      } catch (NoSuchAlgorithmException e) {
         throw new IllegalStateException("SHA-256 unavailable", e);
      }
   }

   private static String m902bed67d4b6b206() {
      String os = System.getProperty("os.name").toLowerCase();
      String arch = System.getProperty("os.arch").toLowerCase();
      if (m752838b851d71044()) {
         return mb0d9d29e72f62533(arch) + "-android";
      } else {
         String osName;
         if (!os.contains("darwin") && !os.contains("mac")) {
            if (os.contains("win")) {
               osName = "windows";
            } else {
               if (!os.contains("linux")) {
                  throw new UnsupportedOperationException("Unsupported OS: " + os);
               }

               osName = "linux";
            }
         } else {
            osName = "macos";
         }

         boolean isAarch64 = arch.contains("aarch64") || arch.contains("arm64");
         String archName;
         if (isAarch64) {
            archName = "aarch64";
         } else {
            if (!arch.contains("amd64") && !arch.contains("x86_64") && !arch.contains("x64")) {
               throw new UnsupportedOperationException("Unsupported architecture: " + arch);
            }

            archName = "x86_64";
         }

         return archName + "-" + osName;
      }
   }

   private static boolean m752838b851d71044() {
      return System.getProperty("java.vm.name", "").equalsIgnoreCase("Dalvik") || System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
   }

   private static String mb0d9d29e72f62533(String arch) {
      if (!arch.contains("aarch64") && !arch.contains("arm64")) {
         if (!arch.contains("x86_64") && !arch.contains("amd64")) {
            if (arch.contains("arm")) {
               return "armv7a";
            } else if (!arch.contains("x86") && !arch.contains("i686") && !arch.contains("i386")) {
               throw new UnsupportedOperationException("Unsupported Android architecture: " + arch);
            } else {
               return "x86";
            }
         } else {
            return "x86_64";
         }
      } else {
         return "aarch64";
      }
   }

   private static String m279336a8564800cd(String platform) {
      if (platform.contains("windows")) {
         return ".dll";
      } else {
         return platform.contains("macos") ? ".dylib" : ".so";
      }
   }

   static {
      try {
         String platform = m902bed67d4b6b206();
         mfd5447eb2833d625(platform);
         byte[] blob = m2797329048170746("native/" + mc2a9944fecca7ffa + "/r");
         byte[] bk = m2797329048170746("native/" + mc2a9944fecca7ffa + "/bk");
         bootstrap(a.class, blob, bk, m82512a2c3f67707b(), "native/" + mc2a9944fecca7ffa + "/" + platform);
      } catch (IOException e) {
         throw new UnsatisfiedLinkError("jvmtp bootstrap failed: " + e.getMessage());
      }
   }
}
