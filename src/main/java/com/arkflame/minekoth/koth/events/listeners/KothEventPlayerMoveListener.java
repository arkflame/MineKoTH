package com.arkflame.minekoth.koth.events.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.arkflame.minekoth.koth.events.managers.KothEventManager;

public class KothEventPlayerMoveListener implements Listener {
    private KothEventManager kothEventManager;

    public KothEventPlayerMoveListener(KothEventManager kothEventManager) {
        this.kothEventManager = kothEventManager;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        kothEventManager.updatePlayerState(event.getPlayer(), event.getTo());
        Player player = event.getPlayer();
        // Check if theres koth event
        if (kothEventManager.getKothEvent() == null) {
            return;
        }
    }
}
