package corz.mx;

import com.corz.client.6w;
import com.corz.client.7TK;
import com.corz.client.7Y8;
import com.corz.client.81;
import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public class 7tN {
   @Shadow
   private double field_1795;
   @Shadow
   private double field_1794;
   // $FF: synthetic field
   private static transient String YCUamfJSBX;

   @Inject(
      method = {"method_1600(JDD)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 4*/(long var1, double var3, double var5, CallbackInfo var7) {
      double var8 = var3 - this.field_1795;
      double var10 = var5 - this.field_1794;
      if (var8 != "c" || var10 != "c") {
         81 var12 = new 81(var8, var10);
         6w.2(var12);
      }
   }

   @Inject(
      method = {"method_1598(JDD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 3*/(long var1, double var3, double var5, CallbackInfo var7) {
      7Y8 var8 = new 7Y8(var5);
      6w.6(var8);
      if (var8.2()) {
         var7.cancel();
      }

   }

   @Inject(
      method = {"method_1601(JLnet/minecraft/class_11910;I)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 3*/(long var1, class_11910 var3, int var4, CallbackInfo var5) {
      7TK var6 = new 7TK(var3.comp_4801(), var4);
      6w.5(var6);
   }
}
