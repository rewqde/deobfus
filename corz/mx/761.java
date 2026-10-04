package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1657;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class 761 {
   @Unique
   private static final long a = s.a(8083040533960783746L, 1791380692472700195L, MethodHandles.lookup().lookupClass()).a(213540116305599L);

   @Inject(
      method = {"method_7351(Lnet/minecraft/class_2680;)F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 3*/(class_2680 param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_55755()D"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 9*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
