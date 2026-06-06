package model.sun;

/**
 * Manages the sun resource system in the game
 */
public class SunSystem {
    private int totalSunAmount;
    private int ticksSinceLastDrop;
    private Sun[] droppingSuns;

    /**
     * Add sun from a plant producer
     */
    public void addSunFromPlant(int x, int y, int amount) {
        // TODO: Implementation - Create collectible sun pellet
    }

    /**
     * Drop sun from the sky
     */
    public void dropSun(int x, int y, SunType type) {
        // TODO: Implementation - Based on formula x = max(6 + 0.05t, 12)
    }

    /**
     * Collect a sun pellet
     */
    public boolean collectSun(int x, int y) {
        // TODO: Implementation
        return false;
    }

    /**
     * Update sun drop timing
     */
    public void update(int currentTick) {
        // TODO: Implementation
    }

    /**
     * Get current total sun amount
     */
    public int getTotalSun() {
        // TODO: Implementation
        return totalSunAmount;
    }

    /**
     * Consume sun for plant placement
     */
    public boolean consumeSun(int amount) {
        // TODO: Implementation
        return false;
    }
}
