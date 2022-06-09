package is.swan.tokens.profile;

import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class Profile {

    public abstract UUID getUUID();

    public abstract Player getPlayer();

    public abstract long getTokens();

    public abstract void setTokens(long mobCoins);

    public abstract int getAmountMined();

    public abstract void setAmountMined(int amountMined);

}
