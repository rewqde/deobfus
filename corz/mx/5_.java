package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_758.class})
public class 5_ {
   @Unique
   private static final long a = s.a(6167858392162155851L, -8712938380001063770L, MethodHandles.lookup().lookupClass()).a(230085497882148L);
   // $FF: synthetic field
   private static transient String fuKqiUFCLl;

   @Inject(
      method = {"method_62185(Lnet/minecraft/class_4184;FLnet/minecraft/class_638;IF)Lorg/joml/Vector4f;"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void _/* $FF was: 0*/(class_4184 param1, float param2, class_638 param3, int param4, float param5, CallbackInfoReturnable param6) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 8*/(ByteBuffer param1, int param2, Vector4f param3, float param4, float param5, float param6, float param7, float param8, float param9, CallbackInfo param10) {
      // $FF: Couldn't be decompiled
   }
}
