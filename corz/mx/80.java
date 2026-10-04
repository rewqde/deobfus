package corz.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   targets = {"net/minecraft/class_1796$class_1797"}
)
public interface 80 {
   @Accessor("comp_3083")
   int _/* $FF was: 4*/();

   @Accessor("comp_3084")
   int _/* $FF was: 5*/();
}
