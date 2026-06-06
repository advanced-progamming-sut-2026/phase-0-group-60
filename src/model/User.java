package model;

import java.util.Date;

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
    private int coins;
    private int gems;
    private int difficultyLevel;
    private boolean stayLoggedIn;
    private String securityQuestion;
    private String securityAnswer;

    // TODO: Add collection of unlocked plants
    // TODO: Add collection of seen zombies
    // TODO: Add progress tracking data
    // TODO: Add quest completion tracking

    /**
     * Get the unique username of this user
     */
    public String getUsername() {
        // TODO: Implementation
        return username;
    }

    /**
     * Get the display nickname of this user
     */
    public String getNickname() {
        // TODO: Implementation
        return nickname;
    }

    /**
     * Update the user's nickname
     */
    public void setNickname(String nickname) {
        // TODO: Implementation - Validate length (3-30 chars)
    }

    /**
     * Set the hashed password
     */
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

    /**
     * Get the user's email address
     */
    public String getEmail() {
        // TODO: Implementation
        return email;
    }

    /**
     * Set the user's email address
     */
    public void setEmail(String email) {
        // TODO: Implementation - Validate email format
    }

    /**
     * Get the user's gender
     */
    public String getGender() {
        // TODO: Implementation
        return gender;
    }

    /**
     * Get the user's current coin balance
     */
    public int getCoins() {
        // TODO: Implementation
        return coins;
    }

    /**
     * Add coins to the user's account
     */
    public void addCoins(int amount) {
        // TODO: Implementation
    }

    /**
     * Remove coins from the user's account
     */
    public boolean removeCoins(int amount) {
        // TODO: Implementation
        return false;
    }

    /**
     * Get the user's current gem balance
     */
    public int getGems() {
        // TODO: Implementation
        return gems;
    }

    /**
     * Add gems to the user's account
     */
    public void addGems(int amount) {
        // TODO: Implementation
    }

    /**
     * Remove gems from the user's account
     */
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

    /**
     * Get the timestamp when this account was created
     */
    public Date getCreatedAt() {
        // TODO: Implementation
        return createdAt;
    }

    /**
     * Check if user should stay logged in
     */
    public boolean isStayLoggedIn() {
        // TODO: Implementation
        return stayLoggedIn;
    }

    /**
     * Set stay logged in preference
     */
    public void setStayLoggedIn(boolean stay) {
        // TODO: Implementation
    }

    /**
     * Get the security question for password recovery
     */
    public String getSecurityQuestion() {
        // TODO: Implementation
        return securityQuestion;
    }

    /**
     * Verify the security answer
     */
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
}
