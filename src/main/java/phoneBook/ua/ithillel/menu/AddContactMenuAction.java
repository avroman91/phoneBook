package phoneBook.ua.ithillel.menu;


import phoneBook.ua.ithillel.Contact;
import phoneBook.ua.ithillel.ContactsService;
import phoneBook.ua.ithillel.InMemoryContactsService;

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
        System.out.println(newContact);
        inMemoryContactsService.add(newContact);
    }


    @Override
    public String getName() {
        return "Add new contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
