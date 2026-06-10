package model;

import model.entity.plant.Plant;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Represents a user account in the game.
 * Stores all persistent user information including profile data,
 * game progress, currency, and account settings.
 */
public class User {
    private String username;
    private String nickname;
    private String passwordHash;
    private String email;
    private String gender;
    private Date createdAt;
    private Map<News, Boolean> newsList; // (news, seenStatus)
    private int coins;
    private int gems;
    private int difficultyLevel;
    private boolean stayLoggedIn;
    private String securityQuestion;
    private String securityAnswer;

    private List<Plant> unlockedPlants;

    // TODO: Add collection of unlocked plants
    // TODO: Add collection of seen zombies
    // TODO: Add progress tracking data
    // TODO: Add quest completion tracking

    public String getUsername() {
        // TODO: Implementation
        return username;
    }

    public String getNickname() {
        // TODO: Implementation
        return nickname;
    }

    public void setNickname(String nickname) {
        // TODO: Implementation - Validate length (3-30 chars)
    }

    public void setPasswordHash(String passwordHash) {
        // TODO: Implementation
    }

    /**
     * Verify if the given password matches the stored hash
     */
    public boolean verifyPassword(String password) {
        // TODO: Implementation - Use SHA-256 or similar
        return false;
    }

    public String getEmail() {
        // TODO: Implementation
        return email;
    }

    public void setEmail(String email) {
        // TODO: Implementation - Validate email format
    }

    public String getGender() {
        // TODO: Implementation
        return gender;
    }

    public Map<News, Boolean> getNewsList() {
        return newsList;
    }

    public boolean hasSeenNews(News news) {
        // TODO: Implementation
        return true;
    }

    public int getCoins() {
        // TODO: Implementation
        return coins;
    }

    public void addCoins(int amount) {
        // TODO: Implementation
    }

    public boolean removeCoins(int amount) {
        // TODO: Implementation
        return false;
    }

    public int getGems() {
        // TODO: Implementation
        return gems;
    }

    public void addGems(int amount) {
        // TODO: Implementation
    }

    public boolean removeGems(int amount) {
        // TODO: Implementation
        return false;
    }

    /**
     * Get the current difficulty level (1-5)
     */
    public int getDifficultyLevel() {
        // TODO: Implementation
        return difficultyLevel;
    }

    /**
     * Set the game difficulty level (1-5)
     */
    public void setDifficultyLevel(int level) {
        // TODO: Implementation - Validate range 1-5
    }

    public Date getCreatedAt() {
        // TODO: Implementation
        return createdAt;
    }

    public boolean isStayLoggedIn() {
        // TODO: Implementation
        return stayLoggedIn;
    }

    public void setStayLoggedIn(boolean stay) {
        // TODO: Implementation
    }

    public String getSecurityQuestion() {
        // TODO: Implementation
        return securityQuestion;
    }

    public boolean verifySecurityAnswer(String answer) {
        // TODO: Implementation
        return false;
    }

    /**
     * Set a new password through security question verification
     */
    public void resetPassword(String newPassword) {
        // TODO: Implementation - SHA-256 hash
    }

    public List<Plant> getUnlockedPlants() {
        // TODO: Implementation
        return unlockedPlants;
    }

    public void unlockPlant() {
        // TODO: Implementation
    }
}
