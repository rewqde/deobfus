package corz.mx;

import com.corz.client.6w;
import com.corz.client.7Ya;
import com.corz.client.s;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2535.class})
public class 5z {
   @Unique
   private static final long a = s.a(5335772167700879958L, 8329459296390535031L, MethodHandles.lookup().lookupClass()).a(87844006433931L);
   // $FF: synthetic field
   private static transient String qzuoSAsojf;

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 8*/(class_2596 var1, CallbackInfo var2) {
      7Ya var3 = new 7Ya(var1);
      6w.1(var3);
      if (var3.7()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 6*/(ChannelHandlerContext param1, class_2596 param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }
}
