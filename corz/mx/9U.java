package corz.mx;

import com.corz.client.5;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_1041.class})
public class 9U {
   // $FF: synthetic field
   private static transient String tXRlaJgrVR;

   @ModifyVariable(
      method = {"method_4476(IZ)I"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int _/* $FF was: 4*/(int var1) {
      class_310 var2 = class_310.method_1551();
      return var2 != null && var2.field_1755 instanceof 5 ? 2 : var1;
   }
}
