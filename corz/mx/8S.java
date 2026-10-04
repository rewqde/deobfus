package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2680;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_4970.class})
public class 8S {
   @Unique
   private static final long a = s.a(-2558690222702002933L, 2155359939511246275L, MethodHandles.lookup().lookupClass()).a(150944252145028L);
   // $FF: synthetic field
   private static transient String atjKueDHXc;

   @Inject(
      method = {"method_9604(Lnet/minecraft/class_2680;)Lnet/minecraft/class_2464;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 2*/(class_2680 param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }
}
