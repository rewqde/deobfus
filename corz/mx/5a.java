package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_922.class})
public class 5a {
   @Unique
   private static final long a = s.a(8767688993760527936L, -6617553233586441505L, MethodHandles.lookup().lookupClass()).a(268219171657688L);
   // $FF: synthetic field
   private static transient String EXNzyFFuVM;

   @Inject(
      method = {"method_62355(Lnet/minecraft/class_1309;Lnet/minecraft/class_10042;F)V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 7*/(class_1309 param1, class_10042 param2, float param3, CallbackInfo param4) {
      // $FF: Couldn't be decompiled
   }
}
