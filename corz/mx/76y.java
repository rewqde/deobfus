package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_4604;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_897.class})
public class 76y {
   @Unique
   private static final long a = s.a(3379178048087952343L, -3854602879735265226L, MethodHandles.lookup().lookupClass()).a(253378360383099L);
   // $FF: synthetic field
   private static transient String mWHYFZkZSW;

   @Inject(
      method = {"method_62358(Lnet/minecraft/class_1297;)Lnet/minecraft/class_238;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 8*/(class_1297 param1, CallbackInfoReturnable param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_62354(Lnet/minecraft/class_1297;Lnet/minecraft/class_10017;F)V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 1*/(class_1297 param1, class_10017 param2, float param3, CallbackInfo param4) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3933(Lnet/minecraft/class_1297;Lnet/minecraft/class_4604;DDD)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(class_1297 param1, class_4604 param2, double param3, double param5, double param7, CallbackInfoReturnable param9) {
      // $FF: Couldn't be decompiled
   }
}
