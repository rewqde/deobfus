package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1937;
import net.minecraft.class_2394;
import net.minecraft.class_4770;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_4770.class})
public class 8H {
   @Unique
   private static final long a = s.a(-5935552204200009740L, 2553937205721719029L, MethodHandles.lookup().lookupClass()).a(14855621276255L);
   // $FF: synthetic field
   private static transient String DrSBRXMOdG;

   @Redirect(
      method = {"method_9496(Lnet/minecraft/class_2680;Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;Lnet/minecraft/class_5819;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1937;method_8406(Lnet/minecraft/class_2394;DDDDDD)V"
)
   )
   private void _/* $FF was: 0*/(class_1937 param1, class_2394 param2, double param3, double param5, double param7, double param9, double param11, double param13) {
      // $FF: Couldn't be decompiled
   }
}
