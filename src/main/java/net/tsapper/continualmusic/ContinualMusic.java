package net.tsapper.continualmusic;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.tsapper.continualmusic.config.ContinualMusicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContinualMusic implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		AutoConfig.register(ContinualMusicConfig.class, GsonConfigSerializer::new);
	}
}
