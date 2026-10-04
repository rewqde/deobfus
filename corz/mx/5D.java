package corz.mx;

import com.corz.client.2Q;
import com.corz.client.s;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_243;
import net.minecraft.class_4063;
import net.minecraft.class_4184;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import net.minecraft.class_9960;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public abstract class 5D {
   @Shadow
   @Final
   private class_9960 field_53081;
   @Unique
   private static final long a = s.a(2811754936115626158L, -4379603417441479665L, MethodHandles.lookup().lookupClass()).a(38224224621022L);

   @Inject(
      method = {"method_62200(Lnet/minecraft/class_9909;Lnet/minecraft/class_4184;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 0*/(class_9909 param1, class_4184 param2, GpuBufferSlice param3, CallbackInfo param4) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_62204(Lnet/minecraft/class_9909;Lnet/minecraft/class_4063;Lnet/minecraft/class_243;JFIF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 9*/(class_9909 param1, class_4063 param2, class_243 param3, long param4, float param6, int param7, float param8, CallbackInfo param9) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 4*/(GpuBufferSlice param0, 2Q param1) {
      // $FF: Couldn't be decompiled
   }
}
