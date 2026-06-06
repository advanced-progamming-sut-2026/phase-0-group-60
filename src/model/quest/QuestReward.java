package model.quest;

import model.User;

/**
 * Represents rewards given for completing a quest
 */
public class QuestReward {
    private int coins;
    private int gems;
    private int seedPackets;
    private String unlockedPlant;
    private String unlockedLevel;

    /**
     * Get coin reward amount
     */
    public int getCoins() {
        // TODO: Implementation
        return coins;
    }

    /**
     * Get gem reward amount
     */
    public int getGems() {
        // TODO: Implementation
        return gems;
    }

    /**
     * Get seed packet reward amount
     */
    public int getSeedPackets() {
        // TODO: Implementation
        return seedPackets;
    }

    /**
     * Get the unlocked plant ID if any
     */
    public String getUnlockedPlant() {
        // TODO: Implementation
        return unlockedPlant;
    }

    /**
     * Get the unlocked level ID if any
     */
    public String getUnlockedLevel() {
        // TODO: Implementation
        return unlockedLevel;
    }

    /**
     * Apply this reward to the user
     */
    public void applyTo(User user) {
        // TODO: Implementation
    }
}
