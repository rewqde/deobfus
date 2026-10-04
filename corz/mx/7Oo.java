package corz.mx;

import com.corz.client.1w;
import com.corz.client.9a;
import com.corz.client.s;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_11286;
import net.minecraft.class_4184;
import net.minecraft.class_5498;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_757.class})
public abstract class 7Oo {
   @Shadow
   @Final
   private class_4184 field_18765;
   @Unique
   private static final long a = s.a(7666548591984588111L, 3711232335077870835L, MethodHandles.lookup().lookupClass()).a(71094778939665L);

   @Redirect(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_5498;method_31034()Z"
)
   )
   private boolean _/* $FF was: 4*/(class_5498 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_11286;method_71123(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"
)
   )
   private GpuBufferSlice _/* $FF was: 0*/(class_11286 var1, Matrix4f var2) {
      1w.8L.set(var2);
      return var1.method_71123(var2);
   }

   @Inject(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V",
   ordinal = 1
)}
   )
   private void _/* $FF was: 7*/(class_9779 var1, CallbackInfo var2) {
      class_4184 var3 = 9a.4.field_1773.method_19418();
      1w.8p.identity();
      1w.8n.set((new Matrix4f()).rotation(var3.method_23767().conjugate(new Quaternionf())));
   }

   @ModifyReturnValue(
      method = {"method_3196(Lnet/minecraft/class_4184;FZ)F"},
      at = {@At("RETURN")}
   )
   private float _/* $FF was: 2*/(float param1, @Local(argsOnly = true) boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3202()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 7*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
