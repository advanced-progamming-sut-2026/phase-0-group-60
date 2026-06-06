package model.greenhouse;

import java.time.LocalTime;

/**
 * Represents a single pot in the greenhouse.
 * Pots can be locked/unlocked and contain growing plants.
 */
public class GreenhousePot {
    private int x;
    private int y;
    private boolean isUnlocked;
    private String plantType;
    private LocalTime plantedTime;
    private LocalTime readyTime;
    private GrowthPhase growthPhase;

    /**
     * Get the X coordinate of this pot
     */
    public int getX() {
        // TODO: Implementation
        return x;
    }

    /**
     * Get the Y coordinate of this pot
     */
    public int getY() {
        // TODO: Implementation
        return y;
    }

    /**
     * Check if this pot is unlocked
     */
    public boolean isUnlocked() {
        // TODO: Implementation
        return isUnlocked;
    }

    /**
     * Check if this pot is empty
     */
    public boolean isEmpty() {
        // TODO: Implementation
        return plantType == null;
    }

    /**
     * Get the plant type growing in this pot
     */
    public String getPlantType() {
        // TODO: Implementation
        return plantType;
    }

    /**
     * Check if the plant is fully grown and ready to collect
     */
    public boolean isReady() {
        // TODO: Implementation
        return plantType != null;
    }

    /**
     * Get time remaining until plant is ready
     */
    public long getTimeRemaining() {
        // TODO: Implementation
        return 0L;
    }

    /**
     * Get the growth phase of the plant
     */
    public GrowthPhase getGrowthPhase() {
        // TODO: Implementation
        return growthPhase;
    }

    /**
     * Update the growth status based on elapsed time
     */
    public void updateGrowth() {
        // TODO: Implementation
    }
}

