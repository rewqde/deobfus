package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class 31 {
   @Unique
   private static final long a = s.a(3410700094711503278L, 6528050777686527339L, MethodHandles.lookup().lookupClass()).a(3055730072032L);
   // $FF: synthetic field
   private static transient String FKuPJhLFqX;

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1753(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void _/* $FF was: 5*/(class_332 param1, class_9779 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_55802(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void _/* $FF was: 4*/(class_332 param1, class_9779 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      at = {@At("HEAD")},
      cancellable = true,
      method = {"method_55803(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_70837(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55800(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55801(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55804(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   private void _/* $FF was: 9*/(class_332 param1, class_9779 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1736(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void _/* $FF was: 3*/(class_332 param1, class_9779 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1765(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void _/* $FF was: 1*/(class_332 param1, class_9779 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1735(Lnet/minecraft/class_332;Lnet/minecraft/class_1297;)V"},
      cancellable = true
   )
   private void _/* $FF was: 7*/(class_332 param1, class_1297 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }
}
