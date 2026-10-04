package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_638.class})
public class 3O {
   @Unique
   private static final long a = s.a(-5494320203369816476L, 1614687395425979626L, MethodHandles.lookup().lookupClass()).a(6658472141361L);
   // $FF: synthetic field
   private static transient String IZtlFjaeCf;

   @Inject(
      method = {"method_8444(Lnet/minecraft/class_1297;ILnet/minecraft/class_2338;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 3*/(class_1297 param1, int param2, class_2338 param3, int param4, CallbackInfo param5) {
      // $FF: Couldn't be decompiled
   }
}
