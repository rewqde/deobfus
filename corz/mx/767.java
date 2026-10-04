package corz.mx;

import com.corz.client.6w;
import com.corz.client.8i;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class 767 {
   // $FF: synthetic field
   private static transient String UCMloglXrW;

   @Inject(
      method = {"method_1466(JILnet/minecraft/class_11908;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 0*/(long var1, int var3, class_11908 var4, CallbackInfo var5) {
      8i var6 = new 8i(var4.comp_4795(), var3);
      6w.1(var6);
      if (var6.1()) {
         var5.cancel();
      }

   }
}
