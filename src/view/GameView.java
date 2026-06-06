package view;

import model.Game;
import model.enums.Menu;

import java.util.Scanner;

public class GameView {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            Game.getCurrentMenu().handle(scanner);
        } while (Game.getCurrentMenu() != Menu.Exit);
    }
}
