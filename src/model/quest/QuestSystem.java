package model.quest;

import model.User;

import java.util.List;

/**
 * Manages the quest system including story quests, epic challenges, daily
 * quests, and tutorials.
 * Quests guide players and provide rewards.
 */
public class QuestSystem {
    private List<Quest> storyQuests;
    private List<Quest> epicQuests;
    private List<Quest> dailyQuests;
    private List<Quest> tutorialQuests;

    /**
     * Initialize the quest system with all quests
     */
    public QuestSystem() {
        // TODO: Implementation - Load all quest definitions
    }

    /**
     * Get all active story quests
     */
    public List<Quest> getStoryQuests() {
        // TODO: Implementation
        return storyQuests;
    }

    /**
     * Get all active epic quests
     */
    public List<Quest> getEpicQuests() {
        // TODO: Implementation
        return epicQuests;
    }

    /**
     * Get all active daily quests
     */
    public List<Quest> getDailyQuests() {
        // TODO: Implementation
        return dailyQuests;
    }

    /**
     * Get all tutorial quests
     */
    public List<Quest> getTutorialQuests() {
        // TODO: Implementation
        return tutorialQuests;
    }

    /**
     * Get a quest by ID
     */
    public Quest getQuestById(String questId) {
        // TODO: Implementation
        return null;
    }

    /**
     * Check if a quest is completed
     */
    public boolean isQuestCompleted(String questId, User user) {
        // TODO: Implementation
        return false;
    }

    /**
     * Mark a quest as completed and apply rewards
     */
    public boolean completeQuest(String questId, User user) {
        // TODO: Implementation - Apply rewards, check dependencies
        return false;
    }

    /**
     * Get the priority-sorted list of quests for display
     */
    public List<Quest> getQuestsByPriority() {
        // TODO: Implementation - Sort: Critical > High > Medium > Low
        return null;
    }

    /**
     * Refresh daily quests (called at midnight)
     */
    public void refreshDailyQuests() {
        // TODO: Implementation - Reset daily quest completion flags
    }
}
