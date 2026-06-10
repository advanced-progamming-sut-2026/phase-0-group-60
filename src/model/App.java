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

    public static User getLoggedInUser() {
        // TODO: Implementation
        return loggedInUser;
    }

    public static void setLoggedInUser(User user) {
        // TODO: Implementation
        loggedInUser = user;
    }

    public static boolean isUserLoggedIn() {
        // TODO: Implementation
        return loggedInUser != null;
    }

    public static void logout() {
        // TODO: Implementation
        loggedInUser = null;
    }

    public static Menu getCurrentMenu() {
        // TODO: Implementation
        return currentMenu;
    }

    public static void setCurrentMenu(Menu menu) {
        // TODO: Implementation - Validate menu transitions
        currentMenu = menu;
    }

    public static GameplaySession getCurrentSession() {
        // TODO: Implementation
        return currentSession;
    }

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
