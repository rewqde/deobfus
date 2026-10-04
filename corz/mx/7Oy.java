package corz.mx;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface 7Oy {
   @Accessor("field_3716")
   void _/* $FF was: 4*/(int var1);

   @Accessor("field_3716")
   int _/* $FF was: 6*/();

   @Invoker("method_2911")
   void _/* $FF was: 0*/();
}
