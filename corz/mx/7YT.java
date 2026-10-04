package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1309.class})
public abstract class 7YT {
   @Unique
   private static final long a = s.a(8930013167078371207L, 1620403635942209035L, MethodHandles.lookup().lookupClass()).a(96515010564006L);

   @Inject(
      method = {"method_6043()V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 9*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }
}
