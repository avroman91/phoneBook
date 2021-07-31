package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.InMemoryContactsService;
import phoneBook.ua.ithillel.MenuAction;

import java.util.Scanner;

public class ReadAllMenuAction implements MenuAction {



    @Override
    public void doAction(Scanner sc, InMemoryContactsService inMemoryContactsService)  {

    }

    @Override
    public String getName() {
        return "Read phone book";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
