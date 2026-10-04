package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_10255;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_10255.class})
public class 40 {
   @Unique
   private static final long a = s.a(8480498801568705602L, 4395760735751215339L, MethodHandles.lookup().lookupClass()).a(277590053697382L);
   // $FF: synthetic field
   private static transient String XUDaCrpNqW;

   @Redirect(
      method = {"method_5773()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_10255;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"
)
   )
   private void _/* $FF was: 2*/(class_10255 param1, class_1313 param2, class_243 param3) {
      // $FF: Couldn't be decompiled
   }
}
