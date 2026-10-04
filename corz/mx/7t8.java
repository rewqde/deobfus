package corz.mx;

import com.corz.client.9J;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1937.class})
public class 7t8 {
   // $FF: synthetic field
   private static transient String PZsUCpmaIS;

   @Inject(
      method = {"method_30092(Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;II)Z"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 4*/(class_2338 var1, class_2680 var2, int var3, int var4, CallbackInfoReturnable var5) {
      class_1937 var6 = (class_1937)this;
      if (var6.method_8608()) {
         class_2680 var7 = var6.method_8320(var1);
         if (var7 != var2) {
            9J.6(var1, var7, var2);
         }

      }
   }
}
