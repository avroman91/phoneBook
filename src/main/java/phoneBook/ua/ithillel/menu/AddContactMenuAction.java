package phoneBook.ua.ithillel.menu;


import phoneBook.ua.ithillel.Contact;
import phoneBook.ua.ithillel.InMemoryContactsService;
import phoneBook.ua.ithillel.MenuAction;

import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {

    private Scanner scan;

    public AddContactMenuAction(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public void doAction(Scanner scan, InMemoryContactsService inMemoryContactsService) {
        System.out.print("Enter contact name:  ");
        String name = scan.nextLine();
        System.out.print("Enter contact phone number: ");
        String phone = scan.nextLine();
        Contact newContact = new Contact(name, phone);
        inMemoryContactsService.add(newContact, inMemoryContactsService);
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
