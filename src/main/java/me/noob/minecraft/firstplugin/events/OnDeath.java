package me.noob.minecraft.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {


    @EventHandler
    public void OnDeath(PlayerDeathEvent e){
        e.getEntity().sendMessage(ChatColor.AQUA + "AH NOOB YOU DIED!");
    }


}
