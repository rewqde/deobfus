package corz.mx;

import com.corz.client.1Y;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2561;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public class 7fl {
   @Shadow
   protected int field_3935;
   @Unique
   private static final long a = s.a(-457952511380480115L, -2314364916267409141L, MethodHandles.lookup().lookupClass()).a(270037210458455L);
   // $FF: synthetic field
   private static transient String kQniRMrzFO;

   @Inject(
      method = {"method_6007()V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 8*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_6007()V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 5*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_6007()V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 0*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_7353(Lnet/minecraft/class_2561;Z)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 8*/(class_2561 var1, boolean var2, CallbackInfo var3) {
      1Y.1((class_746)this, var1, var2);
   }

   @Redirect(
      method = {"method_39759(Lnet/minecraft/class_243;)Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_36454()F"
)
   )
   private float _/* $FF was: 2*/(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 7*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("RETURN")}
   )
   private void _/* $FF was: 2*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_46742()V",
   shift = Shift.AFTER
)}
   )
   private void _/* $FF was: 4*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }
}
