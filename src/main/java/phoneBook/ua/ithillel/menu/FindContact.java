package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.InMemoryContactsService;

import java.util.Scanner;

public class FindContact implements MenuAction {

    private Scanner scan;
    private InMemoryContactsService inMemoryContactsService;

    @Override
    public void doAction(Scanner sc) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
