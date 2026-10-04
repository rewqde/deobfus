package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public class 7tq {
   @Unique
   private static final long a = s.a(7922181138174364215L, -3582591224072018387L, MethodHandles.lookup().lookupClass()).a(247232675110095L);
   // $FF: synthetic field
   private static transient String KHFbKfGmew;

   @Shadow
   protected static class_243 method_18795(class_243 var0, float var1, float var2) {
      throw new AssertionError("c");
   }

   @Inject(
      method = {"method_5862()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 0*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_5851()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 2*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_22861()I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 8*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_5871()F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_5872(DD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(double param1, double param3, CallbackInfo param5) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_5724(FLnet/minecraft/class_243;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;"
)
   )
   private class_243 _/* $FF was: 4*/(class_243 param1, float param2, float param3) {
      // $FF: Couldn't be decompiled
   }
}
