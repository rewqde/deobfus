package corz.mx;

import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_465.class})
public interface 6i {
   @Accessor("field_2776")
   int _/* $FF was: 4*/();

   @Accessor("field_2800")
   int _/* $FF was: 1*/();

   @Accessor("field_2792")
   int _/* $FF was: 0*/();
}
