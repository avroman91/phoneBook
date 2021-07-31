package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.InMemoryContactsService;

import java.util.Scanner;

public interface MenuAction {

    void doAction(Scanner sc);

    String getName();

    boolean closeAfter();
}
