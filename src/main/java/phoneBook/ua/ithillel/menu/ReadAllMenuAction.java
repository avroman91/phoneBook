package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.Scanner;

public class ReadAllMenuAction implements MenuAction {

    private Scanner sc;
    private InMemoryContactsService inMemoryContactsService;

    public ReadAllMenuAction(Scanner sc, InMemoryContactsService inMemoryContactsService) {
        this.sc = sc;
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner sc) {
        System.out.println(inMemoryContactsService.getAll());

    }

    @Override
    public String getName() {
        return "Read phone book";
    }

}
