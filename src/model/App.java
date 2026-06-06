package model;

import model.entity.plant.Plant;
import model.enums.Menu;
import java.util.List;

/**
 * Central game state manager.
 * Manages the current user session, menu state, and overall game session.
 * Implements a singleton pattern to ensure only one game instance exists.
 */
public class App {
    private static User loggedInUser = null;
    private static Menu currentMenu = Menu.Signup;
    private static GameplaySession currentSession = null;

    /**
     * Get the currently logged-in user, or null if none
     */
    public static User getLoggedInUser() {
        // TODO: Implementation
        return loggedInUser;
    }

    /**
     * Set the currently logged-in user
     */
    public static void setLoggedInUser(User user) {
        // TODO: Implementation
        loggedInUser = user;
    }

    /**
     * Check if a user is currently logged in
     */
    public static boolean isUserLoggedIn() {
        // TODO: Implementation
        return loggedInUser != null;
    }

    /**
     * Logout the current user
     */
    public static void logout() {
        // TODO: Implementation
        loggedInUser = null;
    }

    /**
     * Get the current active menu
     */
    public static Menu getCurrentMenu() {
        // TODO: Implementation
        return currentMenu;
    }

    /**
     * Set the current menu to display
     */
    public static void setCurrentMenu(Menu menu) {
        // TODO: Implementation - Validate menu transitions
        currentMenu = menu;
    }

    /**
     * Get the current active game session
     */
    public static GameplaySession getCurrentSession() {
        // TODO: Implementation
        return currentSession;
    }

    /**
     * Create and set a new game session
     */
    public static void createNewSession(Chapter chapter, Level level, List<Plant> selectedPlants) {
        // TODO: Implementation - Initialize board, waves, etc.
    }

    /**
     * End the current game session
     */
    public static void endSession() {
        // TODO: Implementation - Save progress, calculate rewards
        currentSession = null;
    }

    /**
     * Save all game data to persistent storage
     */
    public static void saveGameState() {
        // TODO: Implementation - Serialize user data and progress
    }

    /**
     * Load all game data from persistent storage
     */
    public static void loadGameState() {
        // TODO: Implementation - Deserialize user data and progress
    }
}
