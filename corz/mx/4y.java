package corz.mx;

import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_765.class})
public class 4y {
   @Unique
   private static final long a = s.a(-7133548745482982308L, -7809108301662766900L, MethodHandles.lookup().lookupClass()).a(196549071512789L);
   // $FF: synthetic field
   private static transient String jBeoniNdJO;

   @ModifyArg(
      method = {"method_3313(F)V"},
      at = @At(
   value = "INVOKE",
   target = "Lcom/mojang/blaze3d/buffers/Std140Builder;putFloat(F)Lcom/mojang/blaze3d/buffers/Std140Builder;",
   ordinal = 0
)
   )
   private float _/* $FF was: 6*/(float param1) {
      // $FF: Couldn't be decompiled
   }
}
