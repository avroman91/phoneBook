package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.Scanner;

public class FindContactMenuAction implements MenuAction {

    private Scanner scan;
    private InMemoryContactsService inMemoryContactsService;

    public FindContactMenuAction(Scanner scan, InMemoryContactsService inMemoryContactsService) {
        this.scan = scan;
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner sc) {
        System.out.print("Please enter contact name or part of the name: ");
        String name = sc.nextLine();
        System.out.println(inMemoryContactsService.find(name));
    }

    @Override
    public String getName() {
        return "Find by name";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
