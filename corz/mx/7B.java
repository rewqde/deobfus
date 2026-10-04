package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_2394;
import net.minecraft.class_702;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_702.class})
public class 7B {
   @Unique
   private static final long a = s.a(6506664197595507044L, 8132578078684172553L, MethodHandles.lookup().lookupClass()).a(183911556228054L);
   // $FF: synthetic field
   private static transient String SkWDFivafU;

   @Inject(
      method = {"method_3061(Lnet/minecraft/class_1297;Lnet/minecraft/class_2394;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 7*/(class_1297 var1, class_2394 var2, CallbackInfo var3) {
      if (7(var2)) {
         var3.cancel();
      }

   }

   @Inject(
      method = {"method_3051(Lnet/minecraft/class_1297;Lnet/minecraft/class_2394;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 3*/(class_1297 var1, class_2394 var2, int var3, CallbackInfo var4) {
      if (7(var2)) {
         var4.cancel();
      }

   }

   @Unique
   private static boolean _/* $FF was: 7*/(class_2394 param0) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3056(Lnet/minecraft/class_2394;DDDDDD)Lnet/minecraft/class_703;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 2*/(class_2394 param1, double param2, double param4, double param6, double param8, double param10, double param12, CallbackInfoReturnable param14) {
      // $FF: Couldn't be decompiled
   }
}
