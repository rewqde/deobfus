package corz.mx;

import com.corz.client.17;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class 5J {
   private static final String 9 = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V";
   @Unique
   private static final long a = s.a(919922822226129841L, 8727231871495063573L, MethodHandles.lookup().lookupClass()).a(225318307411793L);
   // $FF: synthetic field
   private static transient String OCDSBVOUhL;

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 4*/(class_332 param1, class_266 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I",
   ordinal = 1
),
      require = 0
   )
   private int _/* $FF was: 6*/(class_327 param1, class_5348 param2) {
      // $FF: Couldn't be decompiled
   }

   @ModifyArg(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V",
   ordinal = 1
),
      index = 1,
      require = 0
   )
   private class_2561 _/* $FF was: 4*/(class_2561 param1) {
      // $FF: Couldn't be decompiled
   }

   private static 17 _/* $FF was: 0*/() {
      // $FF: Couldn't be decompiled
   }
}
