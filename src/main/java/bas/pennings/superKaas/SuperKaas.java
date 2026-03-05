package bas.pennings.superKaas;

import org.bukkit.plugin.java.JavaPlugin;

public final class SuperKaas extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}
