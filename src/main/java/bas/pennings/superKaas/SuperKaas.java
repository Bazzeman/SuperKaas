package bas.pennings.superKaas;

import bas.pennings.superKaas.config.IConfigHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuperKaas extends JavaPlugin {

//    private IConfigHandler[] configHandlers;

    @Override
    public void onEnable() {
//        MainConfigHandler mainConfigHandler = new MainConfigHandler(this);

//        EventManager eventManager = new EventManager(mainConfigHandler, clanService);

        // Setup configuration files
//        configHandlers = new IConfigHandler[] { mainConfigHandler };
//        for (IConfigHandler configHandler : configHandlers) {
//            configHandler.setupConfig();
//        }

        // Registrations
//        getServer().getPluginManager().registerEvents(eventManager, this);

        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {

        // Save configuration files
//        for (ConfigHandler configHandler : configHandlers) {
//            configHandler.saveConfig();
//        }

        getLogger().info("Plugin disabled!");
    }
}
