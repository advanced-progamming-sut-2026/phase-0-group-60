package model;

import model.enums.Menu;

public class Game {
    private static User loggedInUser = null;
    private static Menu currentMenu = Menu.Signup;

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        Game.currentMenu = currentMenu;
    }
}
