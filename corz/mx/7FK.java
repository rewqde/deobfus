package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_742.class})
public class 7FK {
   @Unique
   private static final long a = s.a(-2570045463853710023L, -2724225728041233841L, MethodHandles.lookup().lookupClass()).a(124453008239412L);
   // $FF: synthetic field
   private static transient String YWNrixtwBm;

   @Inject(
      method = {"method_52814()Lnet/minecraft/class_8685;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 4*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
