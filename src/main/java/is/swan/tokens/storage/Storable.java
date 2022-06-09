package is.swan.tokens.storage;

import java.util.UUID;

public interface Storable {

    void init();

    void loadProfile(UUID uuid);

    void saveProfile(UUID uuid);

}
