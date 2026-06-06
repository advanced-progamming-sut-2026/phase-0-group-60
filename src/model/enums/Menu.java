package model.enums;

import view.GameMenu;
import view.auth.*;
import view.gameplay.*;
import view.hub.*;

import java.util.Scanner;

public enum Menu {
    Login(new LoginMenu()),
    Signup(new SignupMenu()),
    Game(new GameplayMenu()),
    Network(new NetworkMenu()),
    Collection(new CollectionMenu()),
    Main(new MainMenu()),
    News(new NewsMenu()),
    Profile(new ProfileMenu()),
    Settings(new SettingsMenu());

    private final GameMenu menu;

    Menu(GameMenu menu) {
        this.menu = menu;
    }

    public void handle(Scanner scanner) {
        this.menu.handle(scanner);
    }
}
