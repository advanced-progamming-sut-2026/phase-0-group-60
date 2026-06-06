package model.entity;

/**
 * Abstract base class for all living entities that reside on the game board.
 * Both plants and zombies are BoardEntity instances.
 */
public abstract class BoardEntity {
    protected int x;
    protected int y;
    protected int health;
    protected int maxHealth;

    /**
     * Get the X position of this entity
     */
    public int getX() {
        // TODO: Implementation
        return x;
    }

    /**
     * Get the Y position of this entity
     */
    public int getY() {
        // TODO: Implementation
        return y;
    }

    /**
     * Set the position of this entity
     */
    public void setPosition(int x, int y) {
        // TODO: Implementation
    }

    /**
     * Get the current health of this entity
     */
    public int getHealth() {
        // TODO: Implementation
        return health;
    }

    /**
     * Get the maximum health of this entity
     */
    public int getMaxHealth() {
        // TODO: Implementation
        return maxHealth;
    }

    /**
     * Apply damage to this entity
     */
    public void takeDamage(int damage) {
        // TODO: Implementation
    }

    /**
     * Check if this entity is still alive
     */
    public boolean isAlive() {
        // TODO: Implementation
        return health > 0;
    }

    /**
     * Called each game tick
     */
    public abstract void update();
}
