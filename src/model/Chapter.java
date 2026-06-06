package model;

import model.enums.ChapterType;

import java.util.List;

/**
 * Represents a chapter/world in the adventure mode.
 * Each chapter has 4 levels and specific terrain/zombie types.
 * Examples: Ancient Egypt, Frozen Caves, Beach, Dark Ages
 */
public class Chapter {
    private String name;
    private int chapterNumber;
    private ChapterType type;
    private List<Level> levels;
    private boolean isUnlocked;

    /**
     * Get the name of this chapter
     */
    public String getName() {
        // TODO: Implementation
        return name;
    }

    /**
     * Get the chapter number
     */
    public int getChapterNumber() {
        // TODO: Implementation
        return chapterNumber;
    }

    /**
     * Get the type/theme of this chapter
     */
    public ChapterType getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Get all levels in this chapter
     */
    public List<Level> getLevels() {
        // TODO: Implementation
        return levels;
    }

    /**
     * Get a specific level by number
     */
    public Level getLevel(int levelNumber) {
        // TODO: Implementation
        return null;
    }

    /**
     * Check if this chapter is unlocked for the user
     */
    public boolean isUnlocked() {
        // TODO: Implementation
        return isUnlocked;
    }

    /**
     * Unlock this chapter
     */
    public void unlock() {
        // TODO: Implementation
    }
}
