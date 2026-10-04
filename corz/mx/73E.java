package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1937.class})
public class 73E {
   @Unique
   private static final long a = s.a(4572732083425910556L, -6152570943822262543L, MethodHandles.lookup().lookupClass()).a(163483817784598L);
   // $FF: synthetic field
   private static transient String cioHzaGQmo;

   @Inject(
      method = {"method_8430(F)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 9*/(float param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_8478(F)F"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 4*/(float param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }
}
