package corz.mx;

import com.corz.client.7cK;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1060;
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1060.class})
public abstract class 7Mn {
   @Unique
   private static final Set 6 = ConcurrentHashMap.newKeySet();

   @Inject(
      method = {"method_4619(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 6*/(class_2960 var1, CallbackInfoReturnable var2) {
      if (var1 != null && "c".equals(var1.method_12836())) {
         if (6.add(var1)) {
            try {
               InputStream var3 = 7cK.class.getClassLoader().getResourceAsStream("c" + var1.method_12836() + "c" + var1.method_12832());

               try {
                  if (var3 != null) {
                     class_1011 var4 = class_1011.method_4309(var3);
                     ((class_1060)this).method_4616(var1, new class_1043(7Mn::2, var4));
                  }
               } catch (Throwable var7) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var3 != null) {
                  var3.close();
               }
            } catch (Exception var8) {
            }

         }
      }
   }

   private static String _/* $FF was: 2*/(class_2960 var0) {
      return var0.toString();
   }
}
