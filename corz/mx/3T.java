package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2338;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_636.class})
public abstract class 3T {
   @Unique
   private static final long a = s.a(-2168381789832972323L, -6673887229237077722L, MethodHandles.lookup().lookupClass()).a(214902569043472L);

   @Inject(
      method = {"method_2899(Lnet/minecraft/class_2338;)Z"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 6*/(class_2338 param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }
}
