package corz.mx;

import com.corz.client.9J;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_638.class})
public class 7MK {
   @Unique
   private static final long a = s.a(8933370757089645096L, -5584131261366238922L, MethodHandles.lookup().lookupClass()).a(245909444828842L);
   // $FF: synthetic field
   private static transient String YBeaDZSBrK;

   @Inject(
      method = {"method_41928(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;I)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 7*/(class_2338 param1, class_2680 param2, int param3, CallbackInfo param4) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_41926(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;Lnet/minecraft/class_243;)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 3*/(class_2338 var1, class_2680 var2, class_243 var3, CallbackInfo var4) {
      9J.9D(var1, var2);
   }
}
