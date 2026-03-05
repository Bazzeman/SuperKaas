package bas.pennings.superKaas;

import bas.pennings.superKaas.config.IConfigHandler;
import bas.pennings.superKaas.config.MessagesConfigHandler;
import bas.pennings.superKaas.utils.MessageService;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuperKaas extends JavaPlugin {

    private IConfigHandler[] configHandlers;

    @Override
    public void onEnable() {
//        MainConfigHandler mainConfigHandler = new MainConfigHandler(this);
        MessagesConfigHandler messagesConfigHandler = new MessagesConfigHandler(this, getLogger());

        MessageService messageFormatter = new MessageService(getLogger(), messagesConfigHandler);

//        EventManager eventManager = new EventManager(mainConfigHandler, clanService);

//        ClanCommands clanCommands = new ClanCommands(this, logger, clanService, messageFormatter);

        // Setup configuration files
        configHandlers = new IConfigHandler[] { messagesConfigHandler };
        for (IConfigHandler configHandler : configHandlers) {
            configHandler.setupConfig();
        }

        // Registrations
//        clanCommands.registerCommands();
//        getServer().getPluginManager().registerEvents(eventManager, this);

        // Services
        messageFormatter.loadMessages();

        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {

        // Save configuration files
        for (IConfigHandler configHandler : configHandlers) {
            configHandler.saveConfig();
        }

        getLogger().info("Plugin disabled!");
    }
}
