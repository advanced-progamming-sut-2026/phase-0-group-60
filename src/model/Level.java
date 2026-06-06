package model;

import model.enums.LevelType;
import java.util.List;

/**
 * Represents a single level/stage in a chapter.
 * Contains wave configurations, reward information, and level-specific
 * mechanics.
 */
public class Level {
    private int levelNumber;
    private int chapterNumber;
    private LevelType type;
    private int numWaves;
    private List<Integer> waveZombieCosts;
    private int rewardCoins;
    private int rewardGems;
    private int rewardSeedPackets;
    private boolean isCompleted;
    private boolean isUnlocked;
    private int highScore;
    private int rows;
    private int cols;

    /**
     * Get the level number within the chapter
     */
    public int getLevelNumber() {
        // TODO: Implementation
        return levelNumber;
    }

    /**
     * Get the chapter number this level belongs to
     */
    public int getChapterNumber() {
        // TODO: Implementation
        return chapterNumber;
    }

    /**
     * Get the type of this level (normal, special, boss, etc)
     */
    public LevelType getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Get the number of waves in this level
     */
    public int getNumWaves() {
        // TODO: Implementation
        return numWaves;
    }

    /**
     * Get the difficulty cost for a specific wave
     */
    public int getWaveCost(int waveNumber) {
        // TODO: Implementation
        return 0;
    }

    /**
     * Get all wave costs
     */
    public List<Integer> getWaveCosts() {
        // TODO: Implementation
        return waveZombieCosts;
    }

    /**
     * Get coin reward for completing this level
     */
    public int getRewardCoins() {
        // TODO: Implementation
        return rewardCoins;
    }

    /**
     * Get gem reward for completing this level
     */
    public int getRewardGems() {
        // TODO: Implementation
        return rewardGems;
    }

    /**
     * Get seed packet reward for completing this level
     */
    public int getRewardSeedPackets() {
        // TODO: Implementation
        return rewardSeedPackets;
    }

    /**
     * Check if this level has been completed
     */
    public boolean isCompleted() {
        // TODO: Implementation
        return isCompleted;
    }

    /**
     * Mark this level as completed
     */
    public void markCompleted() {
        // TODO: Implementation
    }

    /**
     * Check if this level is unlocked for the player
     */
    public boolean isUnlocked() {
        // TODO: Implementation
        return isUnlocked;
    }

    /**
     * Unlock this level
     */
    public void unlock() {
        // TODO: Implementation
    }

    /**
     * Get the player's high score on this level
     */
    public int getHighScore() {
        // TODO: Implementation
        return highScore;
    }

    /**
     * Set a new high score
     */
    public void setHighScore(int score) {
        // TODO: Implementation
    }

    /**
     * Get the number of rows in the board for this level
     */
    public int getRows() {
        // TODO: Implementation
        return rows;
    }

    /**
     * Get the number of columns in the board for this level
     */
    public int getCols() {
        // TODO: Implementation
        return cols;
    }
}
