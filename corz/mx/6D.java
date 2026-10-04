package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_10151;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_10151.class})
public abstract class 6D {
   @Unique
   private static final long a = s.a(-5766707846773162633L, -3064675677722957169L, MethodHandles.lookup().lookupClass()).a(24180704989273L);

   @Inject(
      method = {"method_62945(Lnet/minecraft/class_10151$class_10153;Lnet/minecraft/class_3300;Lnet/minecraft/class_3695;)V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 9*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }
}
