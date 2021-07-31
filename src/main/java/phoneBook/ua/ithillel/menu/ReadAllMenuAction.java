package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.Scanner;

public class ReadAllMenuAction implements MenuAction {

    private InMemoryContactsService inMemoryContactsService;

    public ReadAllMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner scan) {
        System.out.println(inMemoryContactsService.getAll());
    }

    @Override
    public String getName() {
        return "Read phone book";
    }

}
