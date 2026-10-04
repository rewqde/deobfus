package corz.mx;

import com.corz.client.6u;
import com.corz.client.6w;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({class_4184.class})
public class 68 {
   private 6u 9;
   private float 1;
   private boolean 8;
   @Unique
   private static final long a = s.a(-9031697878706276773L, -6554919870853438136L, MethodHandles.lookup().lookupClass()).a(269393809994327L);
   // $FF: synthetic field
   private static transient String nwWQVdyFMl;

   @Inject(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 1*/(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      this.1 = var5;
      this.8 = false;
   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4184;method_19325(FF)V"
)
   )
   private void _/* $FF was: 1*/(Args var1) {
      if (!this.8) {
         float var2 = (Float)var1.get(0);
         float var3 = (Float)var1.get(1);
         this.1(var2, var3);
      }

      if (this.9 != null && this.9.1()) {
         var1.set(0, this.9.6());
         var1.set(1, this.9.3());
      }

   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4184;method_19327(DDD)V"
)
   )
   private void _/* $FF was: 3*/(Args var1) {
      if (!this.8) {
         class_1297 var2 = class_310.method_1551().method_1560();
         float var3 = var2 != null ? var2.method_5705(this.1) : "c";
         float var4 = var2 != null ? var2.method_5695(this.1) : "c";
         this.1(var3, var4);
      }

      if (this.9 != null && this.9.1() && this.9.8()) {
         var1.set(0, this.9.3());
         var1.set(1, this.9.1());
         var1.set(2, this.9.2());
      }

   }

   private void _/* $FF was: 1*/(float var1, float var2) {
      this.9 = new 6u((double)"c", (double)"c", (double)"c", var1, var2, this.1);
      6w.1(this.9);
      this.8 = true;
   }

   @Inject(
      method = {"method_19333()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 8*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
