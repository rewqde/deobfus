package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1657.class})
public abstract class 6r {
   @Unique
   private static final long a = s.a(-5067223148019353576L, -6863030419269643053L, MethodHandles.lookup().lookupClass()).a(148397301978693L);

   @Inject(
      method = {"method_7324(Lnet/minecraft/class_1297;)V"},
      at = {@At("RETURN")}
   )
   private void _/* $FF was: 4*/(class_1297 param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }
}
