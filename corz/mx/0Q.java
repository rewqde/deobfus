package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_315;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_315.class})
public class 0Q {
   @Unique
   private static final long a = s.a(-5371475096159732907L, -2447347460206182745L, MethodHandles.lookup().lookupClass()).a(218485576002287L);
   // $FF: synthetic field
   private static transient String veMlyiawtL;

   @Inject(
      method = {"method_38521()I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void _/* $FF was: 1*/(CallbackInfoReturnable param1) {
      // $FF: Couldn't be decompiled
   }
}
