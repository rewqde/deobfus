package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_638.class_5271.class})
public class 08 {
   @Unique
   private static final long a = s.a(1883949437361460760L, -27866141681309493L, MethodHandles.lookup().lookupClass()).a(35791879579639L);
   // $FF: synthetic field
   private static transient String VANxDHOrew;

   @Inject(
      method = {"method_217()J"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
