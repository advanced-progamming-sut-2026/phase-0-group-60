package model.shop;

import model.User;

/**
 * Represents a purchasable item in the shop.
 */
public class ShopItem {
    private String itemId;
    private String name;
    private ShopItemType type;
    private int costCoins;
    private int costGems;
    private int quantity;
    private int maxCapacity;
    private String associatedPlant;

    /**
     * Get the unique item ID
     */
    public String getItemId() {
        // TODO: Implementation
        return itemId;
    }

    /**
     * Get the display name of this item
     */
    public String getName() {
        // TODO: Implementation
        return name;
    }

    /**
     * Get the type of this item
     */
    public ShopItemType getType() {
        // TODO: Implementation
        return type;
    }

    /**
     * Get the coin cost of this item
     */
    public int getCostCoins() {
        // TODO: Implementation
        return costCoins;
    }

    /**
     * Get the gem cost of this item
     */
    public int getCostGems() {
        // TODO: Implementation
        return costGems;
    }

    /**
     * Get the quantity obtained per purchase
     */
    public int getQuantity() {
        // TODO: Implementation
        return quantity;
    }

    /**
     * Get the maximum number of this item that can be owned
     */
    public int getMaxCapacity() {
        // TODO: Implementation
        return maxCapacity;
    }

    /**
     * Get the associated plant type (for seed packets)
     */
    public String getAssociatedPlant() {
        // TODO: Implementation
        return associatedPlant;
    }

    /**
     * Check if this item can be purchased right now
     */
    public boolean canPurchase(User user, int currentCount) {
        // TODO: Implementation - Check currency and capacity
        return false;
    }
}

