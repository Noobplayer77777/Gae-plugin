package me.noob.minecraft.firstplugin;

import me.noob.minecraft.firstplugin.commands.*;
import me.noob.minecraft.firstplugin.events.Leavebed;
import me.noob.minecraft.firstplugin.events.OnDeath;
import me.noob.minecraft.firstplugin.events.PlayerJoin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("FIRSTPLUGIN v2 HAS LOADED FULLY");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new Leavebed(),this);
        getCommand("Hell").setExecutor(new Hell());
        getCommand("Vote1").setExecutor(new Vote1());
        getCommand("Vote2").setExecutor(new Vote2());
        getCommand("Map").setExecutor(new Map());
        getCommand("Heven").setExecutor(new Heven());
        getCommand("Ping").setExecutor(new Ping());
        getCommand("Creative").setExecutor(new Creative());
        getCommand("Survival").setExecutor(new Survival());
        getCommand("Noob").setExecutor(new Noob());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("the FirstPlugin has Stopped");
    }
}
