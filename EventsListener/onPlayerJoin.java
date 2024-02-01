/*
* Author: AtomixDem
* Date: 1/02/2024
*/
package me.atomixdem.atomixdemplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AtomixDemPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started.");

        getServer().getPluginManager().registerEvents(this, this); // Register all the events
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.println("A player has join the server!");
        event.setJoinMessage("Welcome to the server!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("The plugin has stopped.");
    }
}
