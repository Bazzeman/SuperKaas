//package bas.pennings.superKaas.config;
//
//import bas.pennings.superKaas.SuperKaas;
//import lombok.Getter;
//import org.bukkit.Bukkit;
//import org.bukkit.Location;
//import org.bukkit.configuration.ConfigurationSection;
//import org.bukkit.configuration.file.FileConfiguration;
//import org.jetbrains.annotations.Nullable;
//
//public class MainConfigHandler implements IConfigHandler {
//
//    private final SuperKaas superKaas;
//    private FileConfiguration mainConfig;
//    @Getter private boolean isSpawnSystemEnabled;
//
//    private static final String LOCATION_DATA_PREFIX = "spawn-location";
//    private static final String LOCATION_ENABLED_KEY = "enabled";
//    private static final String LOCATION_WORLD_KEY = "world";
//    private static final String LOCATION_X_KEY = "x";
//    private static final String LOCATION_Y_KEY = "y";
//    private static final String LOCATION_Z_KEY = "z";
//    private static final String LOCATION_YAW_KEY = "yaw";
//    private static final String LOCATION_PITCH_KEY = "pitch";
//
//    public MainConfigHandler(SuperKaas kaasCore) {
//        this.superKaas = kaasCore;
//    }
//
//    @Override
//    public void setupConfig() {
//        superKaas.saveDefaultConfig();
//        mainConfig = superKaas.getConfig();
//    }
//
//    @Override
//    public void saveConfig() {
//        superKaas.saveConfig();
//    }
//
//    @Override
//    public void reloadConfig() {
//        superKaas.reloadConfig();
//    }
//
//    public Location getSpawnLocation() {
//        @Nullable ConfigurationSection spawnLocationSection = mainConfig.getConfigurationSection(LOCATION_DATA_PREFIX);
//
//        if (spawnLocationSection == null) {
//            return null;
//        }
//
//        isSpawnSystemEnabled = spawnLocationSection.getBoolean(LOCATION_ENABLED_KEY, false);
//        String worldName = spawnLocationSection.getString(LOCATION_WORLD_KEY, "world");
//        double x = spawnLocationSection.getDouble(LOCATION_X_KEY, 0);
//        double y = spawnLocationSection.getDouble(LOCATION_Y_KEY, 999);
//        double z = spawnLocationSection.getDouble(LOCATION_Z_KEY, 0);
//        float yaw = (float) spawnLocationSection.getDouble(LOCATION_YAW_KEY, 0.0);
//        float pitch = (float) spawnLocationSection.getDouble(LOCATION_PITCH_KEY, 0.0);
//
//        return new Location(Bukkit.getWorld(worldName), x, y, z, yaw, pitch);
//    }
//}
