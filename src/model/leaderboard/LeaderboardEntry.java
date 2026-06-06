package model.leaderboard;

/**
 * Represents a single player's entry on the leaderboard
 */
public class LeaderboardEntry {
    private String username;
    private String nickname;
    private int maxChapter;
    private int maxLevel;
    private int minigamesCompleted;
    private int dailyQuestsCompleted;
    private int totalQuestsCompleted;
    private int highestScore;

    /**
     * Get the player's username
     */
    public String getUsername() {
        // TODO: Implementation
        return username;
    }

    /**
     * Get the player's display nickname
     */
    public String getNickname() {
        // TODO: Implementation
        return nickname;
    }

    /**
     * Get the farthest chapter reached
     */
    public int getMaxChapter() {
        // TODO: Implementation
        return maxChapter;
    }

    /**
     * Get the farthest level reached in the max chapter
     */
    public int getMaxLevel() {
        // TODO: Implementation
        return maxLevel;
    }

    /**
     * Get the number of minigames completed
     */
    public int getMinigamesCompleted() {
        // TODO: Implementation
        return minigamesCompleted;
    }

    /**
     * Get the number of daily quests completed
     */
    public int getDailyQuestsCompleted() {
        // TODO: Implementation
        return dailyQuestsCompleted;
    }

    /**
     * Get the total number of quests completed
     */
    public int getTotalQuestsCompleted() {
        // TODO: Implementation
        return totalQuestsCompleted;
    }

    /**
     * Get the highest score from survival mode
     */
    public int getHighestScore() {
        // TODO: Implementation
        return highestScore;
    }

    /**
     * Update the max chapter and level
     */
    public void updateProgress(int chapter, int level) {
        // TODO: Implementation
    }

    /**
     * Increment minigames completed
     */
    public void addMinigameCompletion() {
        // TODO: Implementation
    }

    /**
     * Submit a new high score
     */
    public void submitScore(int score) {
        // TODO: Implementation
    }
}
