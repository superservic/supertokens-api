package is.swan.tokens.profile;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;

public abstract class ProfileManager {

    public abstract void load(Profile profile);

    public abstract void unload(Profile profile);

    public abstract Profile getProfile(UUID uuid);

    public abstract Profile getProfile(Player player);

    public abstract Collection<Profile> getProfiles();

}
