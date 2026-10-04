package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_332.class})
public class 2h {
   @Unique
   private static final long a = s.a(-2270939240554671143L, 2332249225146800497L, MethodHandles.lookup().lookupClass()).a(76455968812074L);
   // $FF: synthetic field
   private static transient String puDecOmmCG;

   @Inject(
      method = {"method_44379(IIII)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 4*/(int param1, int param2, int param3, int param4, CallbackInfo param5) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_44380()V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 2*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @ModifyVariable(
      method = {"method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 2
   )
   private class_2561 _/* $FF was: 9*/(class_2561 param1) {
      // $FF: Couldn't be decompiled
   }
}
