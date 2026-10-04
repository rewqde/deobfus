package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_338.class})
public class 5H {
   @Unique
   private static final long a = s.a(2834099773624011906L, 7262410784508324434L, MethodHandles.lookup().lookupClass()).a(3201168948470L);
   // $FF: synthetic field
   private static transient String nwqcmBTiNB;

   @ModifyVariable(
      method = {"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 1
   )
   private class_2561 _/* $FF was: 3*/(class_2561 param1) {
      // $FF: Couldn't be decompiled
   }
}
