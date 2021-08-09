package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.contactService.Contact;
import phoneBook.ua.ithillel.contactService.ContactList;
import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.List;
import java.util.Scanner;

public class FindContactMenuAction implements MenuAction {

    private final InMemoryContactsService inMemoryContactsService;

    public FindContactMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner scan) {
        System.out.print("Please enter contact name or part of the name: ");
        String name = scan.nextLine();
        Contact found = inMemoryContactsService.findByName(name);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("There is no such contact");
        }
    }

    @Override
    public String getName() {
        return "Find by name";
    }

}
