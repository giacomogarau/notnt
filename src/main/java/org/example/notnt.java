package org.example;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class notnt extends JavaPlugin implements Listener {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        EntityType t = e.getEntityType();
        if (t == EntityType.PRIMED_TNT || t == EntityType.MINECART_TNT) {
            e.setCancelled(true);
        }
    }
}
