package phoneBook.ua.ithillel.menu;

import java.util.Scanner;

public interface MenuAction {

    void doAction(Scanner sc);

    String getName();

    boolean closeAfter();
}
