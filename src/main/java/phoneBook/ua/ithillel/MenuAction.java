package phoneBook.ua.ithillel;

import java.util.Scanner;

public interface MenuAction {

    void doAction(Scanner sc, InMemoryContactsService inMemoryContactsService);

    String getName();

    boolean closeAfter();
}
