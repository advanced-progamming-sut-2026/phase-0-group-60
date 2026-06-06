package model;

import model.enums.TileType;

/**
 * Represents a single tile on the game board.
 * A tile can contain plants, zombies, obstacles, and various terrain types.
 * Each tile is immutable in terms of position but mutable in terms of content.
 */
public class Tile {
    private int x;
    private int y;
    private TileType type;
    // TODO: Add references to plants and zombies that occupy this tile
    // TODO: Add methods to check and manage tile content

    public Tile(int x, int y, TileType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    /**
     * Get the X coordinate of this tile
     */
    public int getX() {
        // TODO: Implementation
        return x;
    }

    /**
     * Get the Y coordinate of this tile
     */
    public int getY() {
        // TODO: Implementation
        return y;
    }

    /**
     * Get the terrain type of this tile
     */
    public TileType getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Set the terrain type of this tile
     */
    public void setType(TileType type) {
        // TODO: Implementation
    }

    /**
     * Check if this tile can accommodate a plant
     */
    public boolean canPlacePlant() {
        // TODO: Implementation
        return false;
    }

    /**
     * Check if this tile is currently empty
     */
    public boolean isEmpty() {
        // TODO: Implementation
        return false;
    }
}
