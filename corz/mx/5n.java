package corz.mx;

import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_310.class})
public interface 5n {
   @Invoker("method_1536")
   boolean _/* $FF was: 2*/();

   @Accessor("field_1771")
   void _/* $FF was: 7*/(int var1);
}
