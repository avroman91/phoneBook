package phoneBook.ua.ithillel.menu;


import phoneBook.ua.ithillel.contactService.Contact;
import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {

    private Scanner scan;
    private InMemoryContactsService inMemoryContactsService;

    public AddContactMenuAction(Scanner scan, InMemoryContactsService inMemoryContactsService) {
        this.scan = scan;
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner scan) {
        System.out.print("Enter contact name:  ");
        String name = scan.nextLine();
        System.out.print("Enter contact phone number: ");
        String phone = scan.nextLine();
        Contact newContact = new Contact(name, phone);
        inMemoryContactsService.add(newContact);
    }

    @Override
    public String getName() {
        return "Add new contact";
    }

}
