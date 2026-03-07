package bas.pennings.superKaas.persistantDataContainer;

import bas.pennings.superKaas.SuperKaas;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

public enum PlayerDataKeys {
    
    Species("species", PersistentDataType.STRING);

    public final NamespacedKey key;
    public final PersistentDataType<?, ?> type;

    PlayerDataKeys(String keyName, PersistentDataType<?, ?> type) {
        this.key = new NamespacedKey(SuperKaas.instance, keyName);
        this.type = type;
    }
}
