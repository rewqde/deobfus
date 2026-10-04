package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1007.class})
public class 7v {
   @Unique
   private static final long a = s.a(-3265889322578096302L, -3575835219028618407L, MethodHandles.lookup().lookupClass()).a(206147116440779L);
   // $FF: synthetic field
   private static transient String hiUZYdOcBr;

   @Inject(
      method = {"method_4213(Lnet/minecraft/class_10055;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 6*/(class_10055 param1, class_4587 param2, class_11659 param3, class_12075 param4, CallbackInfo param5) {
      // $FF: Couldn't be decompiled
   }
}
