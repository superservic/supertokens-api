package is.swan.tokens.reward;

import org.bukkit.Material;

import java.util.List;

public abstract class Reward {

    public abstract String getConfigKey();

    public abstract String getName();

    public abstract List<String> getCommands();

    public abstract int getPrice();

    public abstract Material getMaterial();

    public abstract int getAmount();

    public abstract List<String> getLore();

    public abstract short getDurability();

    public abstract boolean isGlow();

    public abstract boolean isSpecial();

    public abstract int getSlot();

}
