package corz.mx;

import com.corz.client.66;
import com.corz.client.6w;
import com.corz.client.7Yn;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.function.Consumer;
import net.minecraft.class_310;
import net.minecraft.class_3285;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_310.class})
public class 7fZ {
   @Shadow
   public @Nullable class_638 field_1687;
   @Shadow
   private int field_1752;
   @Unique
   private static final long a = s.a(-8503918961950525002L, -8172743867155845790L, MethodHandles.lookup().lookupClass()).a(64861184344485L);
   // $FF: synthetic field
   private static transient String zhAQGPYgrH;

   @ModifyArg(
      method = {"<init>(Lnet/minecraft/class_542;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_3283;<init>([Lnet/minecraft/class_3285;)V"
),
      index = 0
   )
   private class_3285[] _/* $FF was: 4*/(class_3285[] var1) {
      class_3285 var2 = 7fZ::9;
      class_3285[] var3 = (class_3285[])Arrays.copyOf(var1, var1.length + 1);
      var3[var1.length] = var2;
      return var3;
   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 1*/(CallbackInfo var1) {
      7Yn var2 = new 7Yn();
      6w.0(var2);
      if (var2.6()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At("RETURN")}
   )
   private void _/* $FF was: 6*/(CallbackInfo var1) {
      66 var2 = new 66(this.field_1752);
      6w.9(var2);
      this.field_1752 = var2.4;
   }

   @Inject(
      method = {"method_1574()V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 0*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_1590(Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(boolean param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_1536()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 4*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }

   private static void _/* $FF was: 9*/(Consumer param0) {
      // $FF: Couldn't be decompiled
   }
}
