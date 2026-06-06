package model;

import model.entity.plant.Plant;
import model.entity.zombie.Zombie;
import java.util.List;

/**
 * Represents a single active game session.
 * Manages the current game board, zombies, plants, resources, and game state
 * during gameplay.
 */
public class GameplaySession {
    private Chapter chapter;
    private Level level;
    private Tile[][] board;
    private int currentWave;
    private int totalWaves;
    private int tickCount;
    private int sunAmount;
    private int plantFoodCount;
    private List<Plant> selectedPlants;
    private List<Zombie> activeZombies;
    private int coins;
    private int gems;
    private int playerScore;
    private boolean[] lawnMowersUsed;

    /**
     * Get the current chapter
     */
    public Chapter getChapter() {
        // TODO: Implementation
        return chapter;
    }

    /**
     * Get the current level
     */
    public Level getLevel() {
        // TODO: Implementation
        return level;
    }

    /**
     * Get the game board
     */
    public Tile[][] getBoard() {
        // TODO: Implementation
        return board;
    }

    /**
     * Get the current wave number
     */
    public int getCurrentWave() {
        // TODO: Implementation
        return currentWave;
    }

    /**
     * Get the total number of waves
     */
    public int getTotalWaves() {
        // TODO: Implementation
        return totalWaves;
    }

    /**
     * Get the current tick count from level start
     */
    public int getTickCount() {
        // TODO: Implementation
        return tickCount;
    }

    /**
     * Advance game time by specified ticks
     */
    public void advanceTime(int ticks) {
        // TODO: Implementation - Update all entities, spawn zombies, etc.
    }

    /**
     * Get the current sun amount
     */
    public int getSunAmount() {
        // TODO: Implementation
        return sunAmount;
    }

    /**
     * Add sun to the current amount
     */
    public void addSun(int amount) {
        // TODO: Implementation
    }

    /**
     * Remove sun from the current amount
     */
    public boolean removeSun(int amount) {
        // TODO: Implementation
        return false;
    }

    /**
     * Get the current plant food count
     */
    public int getPlantFoodCount() {
        // TODO: Implementation
        return plantFoodCount;
    }

    /**
     * Add plant food to inventory
     */
    public void addPlantFood(int amount) {
        // TODO: Implementation - Max 3
    }

    /**
     * Use plant food on a plant
     */
    public boolean usePlantFood(int x, int y) {
        // TODO: Implementation
        return false;
    }

    /**
     * Get all selected plants for this level
     */
    public List<Plant> getSelectedPlants() {
        // TODO: Implementation
        return selectedPlants;
    }

    /**
     * Get all active zombies on the board
     */
    public List<Zombie> getActiveZombies() {
        // TODO: Implementation
        return activeZombies;
    }

    /**
     * Plant a plant at the specified location
     */
    public boolean plantAt(Plant plant, int x, int y) {
        // TODO: Implementation - Check costs, cooldowns, position validity
        return false;
    }

    /**
     * Pluck/remove a plant at the specified location
     */
    public boolean pluckAt(int x, int y) {
        // TODO: Implementation
        return false;
    }

    /**
     * Collect sun from the specified location
     */
    public boolean collectSun(int x, int y) {
        // TODO: Implementation
        return false;
    }

    /**
     * Check if the player has won
     */
    public boolean hasWon() {
        // TODO: Implementation - All waves completed and all zombies dead
        return false;
    }

    /**
     * Check if the player has lost
     */
    public boolean hasLost() {
        // TODO: Implementation - Lawn mower triggered a second time or zombie reached
        // end
        return false;
    }

    /**
     * Get the session state as a string representation
     */
    public String getSessionState() {
        // TODO: Implementation - Return formatted board state for display
        return "";
    }
}
