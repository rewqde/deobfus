package com.corz.client;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

public class 09 {
   private SocketChannel 2;
   private final List 3;
   private Consumer 1;
   private 7tf 6;
   private final ByteBuffer 7;
   private final ConcurrentLinkedQueue 8;
   private boolean 9;
   private int 0;
   private ByteBuffer 4;
   private static final long a;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final Object[] f;
   private static final String[] g;
   // $FF: synthetic field
   private static transient String oBkdJBkqXE;

   public _9/* $FF was: 09*/(long var1) {
      var1 = a ^ var1;
      super();
      this.3 = new ArrayList();
      int var10001 = 7059.j<invokedynamic>(7059, 3486906614406760050L ^ var1);
      this.7 = var10001.ÿ<invokedynamic>(var10001, -2802105812518255623L, var1);
      this.8 = new ConcurrentLinkedQueue();
      this.Ô<invokedynamic>(this, (boolean)true.j<invokedynamic>(7304, 7953394103969562989L ^ var1), -2801896590802483263L, var1);
      this.Ô<invokedynamic>(this, true.j<invokedynamic>(17768, 3537667108775860367L ^ var1), -2801862431745831966L, var1);
   }

   public native void _/* $FF was: 7*/(Object[] var1) throws IOException;

   public native void _/* $FF was: 6*/(Object[] var1);

   public native void _/* $FF was: 9*/(Object[] var1) throws IOException;

   public native void _/* $FF was: 5*/(Object[] var1) throws IOException;

   public native void _/* $FF was: 4*/(Object[] var1);

   public native boolean _/* $FF was: 7*/(Object[] var1);

   static {
      a.b99571f71427e3b19.a.init(09.class, 249);
      60987d881e22e3();
   }

   private static native Exception a(Exception var0);

   private static native String a(byte[] var0);

   private static native int a(int var0, long var1);

   private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Class b(long var0, long var2);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Field c(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method d(long var0, long var2);

   private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

   // $FF: synthetic method
   private static native void _0987d881e22e3/* $FF was: 60987d881e22e3*/();
}
