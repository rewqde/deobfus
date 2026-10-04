package corz.mx;

import com.corz.client.15;
import com.corz.client.s;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_759.class})
public abstract class 6U {
   @Shadow
   private class_1799 field_4048;
   @Unique
   private static Method 5;
   @Unique
   private static Method 4;
   @Unique
   private static boolean 6;
   @Unique
   private static final long a = s.a(1775773436501336712L, -4380418471862201114L, MethodHandles.lookup().lookupClass()).a(66250187758016L);

   @Shadow
   public abstract void method_3233(class_1309 var1, class_1799 var2, class_811 var3, class_4587 var4, class_11659 var5, int var6);

   @Shadow
   protected abstract void method_65816(float var1, class_4587 var2, int var3, class_1306 var4);

   @Shadow
   protected abstract void method_3224(class_4587 var1, class_1306 var2, float var3);

   @Shadow
   protected abstract void method_3218(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5);

   @Shadow
   protected abstract void method_49340(class_4587 var1, float var2, class_1306 var3, class_1657 var4);

   @Shadow
   protected abstract void method_3231(class_4587 var1, class_11659 var2, int var3, float var4, float var5, float var6);

   @Shadow
   protected abstract void method_3222(class_4587 var1, class_11659 var2, int var3, float var4, class_1306 var5, float var6, class_1799 var7);

   @Shadow
   protected abstract void method_3219(class_4587 var1, class_11659 var2, int var3, float var4, float var5, class_1306 var6);

   @Inject(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = {@At("HEAD")}
   )
   private void _/* $FF was: 9*/(float param1, class_4587 param2, class_11659 param3, class_746 param4, int param5, CallbackInfo param6) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = {@At("TAIL")}
   )
   private void _/* $FF was: 1*/(float param1, class_4587 param2, class_11659 param3, class_746 param4, int param5, CallbackInfo param6) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   private 15 _/* $FF was: 3*/() {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void _/* $FF was: 5*/(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   private void _/* $FF was: 0*/(15 param1, class_742 param2, float param3, float param4, class_1268 param5, float param6, class_1799 param7, float param8, class_4587 param9, class_11659 param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   private static void _/* $FF was: 5*/() {
      if (!6) {
         6 = true;

         try {
            Class var0 = Class.forName("c");

            for(Method var4 : var0.getDeclaredMethods()) {
               if ((var4.getName().equals("c") || var4.getName().equals("c") || var4.getName().equals("c")) && var4.getParameterCount() == 4) {
                  var4.setAccessible(true);
                  5 = var4;
               }

               if ((var4.getName().equals("c") || var4.getName().equals("c") || var4.getName().equals("c")) && var4.getParameterCount() == 5) {
                  var4.setAccessible(true);
                  4 = var4;
               }
            }
         } catch (Exception var5) {
         }

      }
   }

   @Unique
   private static void _/* $FF was: 4*/(float var0, class_4587 var1, int var2, class_1306 var3) {
      5();
      if (5 != null) {
         try {
            5.invoke((Object)null, var0, var1, var2, var3);
         } catch (Exception var5) {
         }
      }

   }

   @Unique
   private static void _/* $FF was: 8*/(float var0, class_4587 var1, float var2, class_1306 var3, class_1799 var4) {
      5();
      if (4 != null) {
         try {
            4.invoke((Object)null, var0, var1, var2, var3, var4);
         } catch (Exception var6) {
         }
      }

   }
}
