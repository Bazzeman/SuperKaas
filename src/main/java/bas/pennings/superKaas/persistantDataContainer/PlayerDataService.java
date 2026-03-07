package bas.pennings.superKaas.persistantDataContainer;

import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;

public class PlayerDataService {

    @SuppressWarnings("unchecked")
    public <T> void set(Player player, PlayerDataKeys playerDataKey, T value) {
        player.getPersistentDataContainer().set(
                playerDataKey.key,
                (PersistentDataType<?, T>) playerDataKey.type,
                value
        );
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Player player, PlayerDataKeys playerDataKey) {
        return player.getPersistentDataContainer().get(
                playerDataKey.key,
                (PersistentDataType<?, T>) playerDataKey.type
        );
    }

    @SuppressWarnings("unchecked")
    public <T> T getOrDefault(Player player, PlayerDataKeys playerDataKey, T defaultValue) {
        return player.getPersistentDataContainer().getOrDefault(
                playerDataKey.key,
                (PersistentDataType<?, T>) playerDataKey.type,
                defaultValue
        );
    }
}
