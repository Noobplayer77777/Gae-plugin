package me.noob.minecraft.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hell implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.chat(ChatColor.BOLD + "GOOD BYE PPL I AM GOING TO ");
            player.chat(ChatColor.RED + "HELL");
            player.kickPlayer("GO TO HELL NERD");
        }
        return false;
    }
}
