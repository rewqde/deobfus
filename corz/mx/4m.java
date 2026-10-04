package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_743.class})
public class 4m {
   @Unique
   private static final long a = s.a(-8109319810304028705L, -8875123916651210311L, MethodHandles.lookup().lookupClass()).a(31121983483170L);
   // $FF: synthetic field
   private static transient String nlnZZbYiOr;

   @Inject(
      method = {"method_3129()V"},
      at = {@At("RETURN")}
   )
   private void _/* $FF was: 7*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }
}
