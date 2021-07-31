package phoneBook.ua.ithillel;

import phoneBook.ua.ithillel.menu.AddContactMenuAction;
import phoneBook.ua.ithillel.menu.Menu;
import phoneBook.ua.ithillel.menu.ReadAllMenuAction;
import phoneBook.ua.ithillel.menu.RemoveContactMenuAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuAction> actions = new ArrayList<>();
        actions.add(new ReadAllMenuAction());
        actions.add(new AddContactMenuAction(scanner));
        actions.add(new RemoveContactMenuAction());
        Menu menu = new Menu(scanner, actions);
        menu.run();

    }
}
