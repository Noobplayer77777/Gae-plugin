package me.noob.minecraft.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class Leavebed implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        //here is the code when a player leaves the bed
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GOLD + "GooD Morning");
    }

}
