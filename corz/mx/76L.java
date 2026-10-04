package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_765;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_765.class})
public class 76L {
   @Shadow
   private boolean field_4135;
   @Unique
   private static final long a = s.a(4739066886245828822L, -5301658770350986213L, MethodHandles.lookup().lookupClass()).a(44751063351847L);
   // $FF: synthetic field
   private static transient String PxfetlOxvf;

   @Inject(
      method = {"method_3314()V"},
      at = {@At("HEAD")},
      require = 0
   )
   private void _/* $FF was: 9*/(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @ModifyVariable(
      method = {"method_3313(F)V"},
      at = @At("STORE"),
      ordinal = 0,
      require = 0
   )
   private Vector3f _/* $FF was: 9*/(Vector3f param1) {
      // $FF: Couldn't be decompiled
   }
}
