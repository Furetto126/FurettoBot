package com.furetto126.furettobot;

import com.furetto126.furettobot.listeners.CommandsListener;
import com.furetto126.furettobot.listeners.FunniSFXListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class FurettoBot{

    public static JDABuilder builder;

    public static void main(String[] args) throws LoginException {
        builder = JDABuilder.createDefault(DiscordToken.token);
        builder.enableCache(CacheFlag.VOICE_STATE);
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        builder.setActivity(Activity.watching("you :O"));
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS);
        registerListeners();
        builder.build();
    }

    public static void registerListeners(){
        builder.addEventListeners(new CommandsListener());
        builder.addEventListeners(new FunniSFXListener());
    }
}
