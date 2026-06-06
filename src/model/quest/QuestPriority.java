package model.quest;

/**
 * Priority levels for quest display ordering
 */
public enum QuestPriority {
    CRITICAL(1),
    HIGH(2),
    MEDIUM(3),
    LOW(4);

    private int priorityLevel;

    QuestPriority(int level) {
        this.priorityLevel = level;
    }

    /**
     * Get the numeric priority level (lower = higher priority)
     */
    public int getPriorityLevel() {
        return priorityLevel;
    }
}
