package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1058;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4603.class})
public class 7tG {
   @Unique
   private static final long a = s.a(-2346173255662636559L, 9158112294523265579L, MethodHandles.lookup().lookupClass()).a(150646420112028L);
   // $FF: synthetic field
   private static transient String GwnPkqKtCE;

   @Inject(
      method = {"method_23070(Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_1058;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void _/* $FF was: 0*/(class_4587 param0, class_4597 param1, class_1058 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }
}
