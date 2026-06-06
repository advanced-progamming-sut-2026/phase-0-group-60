package model.entity.zombie;

import model.entity.BoardEntity;
import java.util.List;

/**
 * Abstract base class for all zombie types in the game.
 * Zombies are offensive entities that move across the board trying to reach the
 * player's house.
 * Each zombie type has unique behaviors, armor types, and special abilities.
 */
public abstract class Zombie extends BoardEntity {
    protected String type;
    protected float speed;
    protected int damage;
    protected int costToSpawn;
    protected boolean isGlowing;
    protected List<Armor> armor;

    /**
     * Get the type/name of this zombie
     */
    public String getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Get the movement speed of this zombie (in units per tick)
     */
    public float getSpeed() {
        // TODO: Implementation
        return speed;
    }

    /**
     * Get the damage this zombie deals to plants
     */
    public int getDamage() {
        // TODO: Implementation
        return damage;
    }

    /**
     * Get the wave cost (value required to spawn this zombie)
     */
    public int getCostToSpawn() {
        // TODO: Implementation
        return costToSpawn;
    }

    /**
     * Check if this zombie is glowing (5% chance, gives plant food when killed)
     */
    public boolean isGlowing() {
        // TODO: Implementation
        return isGlowing;
    }

    /**
     * Get list of armor pieces this zombie is wearing
     */
    public List<Armor> getArmor() {
        // TODO: Implementation
        return armor;
    }

    /**
     * Remove armor from this zombie
     */
    public void removeArmor(Armor armor) {
        // TODO: Implementation
    }

    /**
     * Make this zombie move towards the player's house
     */
    public void moveForward() {
        // TODO: Implementation - Decrement x position
    }

    /**
     * Attack a plant at the given position
     */
    public void attackPlant() {
        // TODO: Implementation
    }

    /**
     * Get the special ability/behavior of this zombie type
     */
    public abstract void performSpecialAbility();

    /**
     * Update zombie state each tick
     */
    @Override
    public void update() {
        // TODO: Implementation - Move, attack, apply effects
    }
}
