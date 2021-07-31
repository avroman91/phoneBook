package phoneBook.ua.ithillel.menu;


import phoneBook.ua.ithillel.InMemoryContactsService;
import phoneBook.ua.ithillel.MenuAction;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {
    @Override
    public void doAction(Scanner sc, InMemoryContactsService inMemoryContactsService)  {
    }

    @Override
    public String getName() {
        return "Remove existing contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
