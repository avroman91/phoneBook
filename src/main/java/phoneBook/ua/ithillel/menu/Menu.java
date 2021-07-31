package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu(Scanner sc, List<MenuAction> actions) {
        this.sc = sc;
        this.actions = actions;
    }

    private Scanner sc;
    private List<MenuAction> actions;
    InMemoryContactsService inMemoryContactsService;


    private void printActions() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, actions.get(i).getName());
        }
        System.out.printf("%d - exit\n", actions.size() + 1);
    }

    private int getChoice() {
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice - 1;
    }

    public void run() {
        while (true) {
            printActions();
            int choice = getChoice();
            if (choice < 0 || choice > actions.size()) {
                System.out.println("Incorrect choice");
                continue;
            }
            if (choice == actions.size()) {
                break;
            }
            actions.get(choice).doAction(sc);
        }
    }

    public void addAction(MenuAction action) {
        actions.add(action);
    }

}
