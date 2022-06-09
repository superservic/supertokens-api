package is.swan.tokens.reward;

import java.util.List;
import java.util.Map;

public abstract class RewardManager {

    public abstract void saveLastRewards();

    public abstract void loadLastRewards();

    public abstract void refreshNormalRewards();

    public abstract void refreshSpecialRewards();

    public abstract void reloadRewards();

    public abstract Reward getReward(String configKey);

    public abstract List<Reward> getRewards();

    public abstract Map<Integer, Reward> getCurrentRewards();

}
