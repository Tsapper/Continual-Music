package net.tsapper.continualmusic.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "continualmusicconfig")
public class ContinualMusicConfig implements ConfigData
{
    @ConfigEntry.Gui.Tooltip()
    public int time = 5;

    public static ContinualMusicConfig getInstance()
    {
        return AutoConfig.getConfigHolder(ContinualMusicConfig.class).getConfig();
    }
}
