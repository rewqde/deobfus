package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_9975;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_9975.class})
public class 7fJ {
   @Unique
   private static final long a = s.a(3900540852906049214L, 3597398897773253813L, MethodHandles.lookup().lookupClass()).a(50428862207252L);
   // $FF: synthetic field
   private static transient String ToOXBYMlrk;

   @Inject(
      method = {"method_62310(FLnet/minecraft/class_4587;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 9*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_62307(Lnet/minecraft/class_4587;FFFLnet/minecraft/class_12131;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 0*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }
}
