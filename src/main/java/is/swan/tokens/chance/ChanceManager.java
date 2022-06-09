package is.swan.tokens.chance;

import org.bukkit.Material;

import java.util.Map;

public abstract class ChanceManager {

    public abstract DropChance getChance(Material material);

    public abstract void reloadChances();

    public abstract Map<Material, DropChance> getDropChances();

}
