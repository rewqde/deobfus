package corz.mx;

import com.corz.client.2z;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2622;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class 0V {
   @Unique
   private static final long a = s.a(-6020133858917398971L, -1872139221676211526L, MethodHandles.lookup().lookupClass()).a(217679154732601L);
   // $FF: synthetic field
   private static transient String meBToFKxxz;

   @Inject(
      method = {"method_45730(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 7*/(String param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_11094(Lnet/minecraft/class_2622;)V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 6*/(class_2622 var1, CallbackInfo var2) {
      2z.7S(var1.method_11293());
   }
}
