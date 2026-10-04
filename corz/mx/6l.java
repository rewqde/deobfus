package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1661;
import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_465;
import net.minecraft.class_8881;
import net.minecraft.class_8898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_8898.class})
public abstract class 6l extends class_465 {
   @Unique
   private static final long a = s.a(8921870730746353653L, 853889724156982117L, MethodHandles.lookup().lookupClass()).a(55237068557227L);

   protected _l/* $FF was: 6l*/(class_8881 var1, class_1661 var2, class_2561 var3) {
      super(var1, var2, var3);
   }

   @Inject(
      method = {"method_25426()V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 1*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 6*/(class_4185 param1) {
      // $FF: Couldn't be decompiled
   }

   private void _/* $FF was: 1*/(class_4185 param1) {
      // $FF: Couldn't be decompiled
   }
}
