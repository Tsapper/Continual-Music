package net.tsapper.continualmusic.mixin;

import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.sound.MusicSound;
import net.tsapper.continualmusic.ContinualMusic;
import net.minecraft.client.gui.screen.TitleScreen;
import net.tsapper.continualmusic.config.ContinualMusicConfig;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MusicSound.class)
public class ContinualMusicMixin
{
    @Inject(method = "getMinDelay", at = @At("RETURN"), cancellable = true)
    public void continualmusic$getMinDelay(CallbackInfoReturnable<Integer> ci)
    {
        if (AutoConfig.getConfigHolder(ContinualMusicConfig.class) != null)
        {
            ContinualMusicConfig config = ContinualMusicConfig.getInstance();
            ci.setReturnValue(config.time * 20);
        }
    }

    @Inject(method = "getMaxDelay", at = @At("RETURN"), cancellable = true)
    public void continualmusic$getMaxDelay(CallbackInfoReturnable<Integer> ci)
    {
        if (AutoConfig.getConfigHolder(ContinualMusicConfig.class) != null)
        {
            ContinualMusicConfig config = ContinualMusicConfig.getInstance();
            ci.setReturnValue(config.time * 20);
        }
    }
}
