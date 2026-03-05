package bas.pennings.superKaas.config;

import bas.pennings.superKaas.SuperKaas;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MessagesConfigHandler implements IConfigHandler {

    private final SuperKaas superKaas;
    private final Logger logger;
    private YamlConfiguration messagesConfig;
    private File messagesFile;

    private static final String MESSAGES_CONFIG_FILE = "messages.yml";

    public MessagesConfigHandler(SuperKaas kaasCore, Logger logger) {
        this.superKaas = kaasCore;
        this.logger = logger;
    }

    @Override
    public void setupConfig() {
        messagesFile = new File(superKaas.getDataFolder(), MESSAGES_CONFIG_FILE);

        if (!messagesFile.exists()) {
            superKaas.saveResource(MESSAGES_CONFIG_FILE, false);
            logger.info("Created new messages config file: " + MESSAGES_CONFIG_FILE);
        }

        messagesConfig = YamlConfiguration.loadConfiguration(messagesFile);
    }

    public @Nullable Map<String, Map<String, String>> getAllMessages() {
        Map<String, Map<String, String>> messages = new HashMap<>();

        for (String section : messagesConfig.getKeys(false)) {
            @Nullable ConfigurationSection clanDataSection =  messagesConfig.getConfigurationSection(section);
            if (clanDataSection == null) {
                continue;
            }

            Map<String, String> sectionMessages = new HashMap<>();
            for (String key : clanDataSection.getKeys(false)) {
                String message = messagesConfig.getString(key);
                sectionMessages.put(key, message);
            }

            messages.put(section, sectionMessages);
        }
        return messages;
    };

    @Override
    public void saveConfig() {}

    @Override
    public void reloadConfig() {
        messagesConfig = YamlConfiguration.loadConfiguration(messagesFile);
    }
}
