package model.quest;

import model.User;

/**
 * Represents a single quest/mission in the game.
 */
public class Quest {
    private String questId;
    private String title;
    private String description;
    private QuestType type;
    private QuestPriority priority;
    private QuestCondition condition;
    private QuestReward reward;
    private boolean isCompleted;
    private int progress;

    /**
     * Get the unique quest ID
     */
    public String getQuestId() {
        // TODO: Implementation
        return questId;
    }

    /**
     * Get the quest title
     */
    public String getTitle() {
        // TODO: Implementation
        return title;
    }

    /**
     * Get the quest description
     */
    public String getDescription() {
        // TODO: Implementation
        return description;
    }

    /**
     * Get the quest type
     */
    public QuestType getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Get the quest priority for display ordering
     */
    public QuestPriority getPriority() {
        // TODO: Implementation
        return priority;
    }

    /**
     * Get the condition that must be met to complete this quest
     */
    public QuestCondition getCondition() {
        // TODO: Implementation
        return condition;
    }

    /**
     * Get the reward for completing this quest
     */
    public QuestReward getReward() {
        // TODO: Implementation
        return reward;
    }

    /**
     * Check if this quest is completed
     */
    public boolean isCompleted() {
        // TODO: Implementation
        return isCompleted;
    }

    /**
     * Mark this quest as completed
     */
    public void markCompleted() {
        // TODO: Implementation
    }

    /**
     * Get the current progress towards quest completion
     */
    public int getProgress() {
        // TODO: Implementation
        return progress;
    }

    /**
     * Update quest progress
     */
    public void updateProgress(int amount) {
        // TODO: Implementation
    }

    /**
     * Check if quest conditions are met
     */
    public boolean areConditionsMet(User user) {
        // TODO: Implementation
        return false;
    }
}
