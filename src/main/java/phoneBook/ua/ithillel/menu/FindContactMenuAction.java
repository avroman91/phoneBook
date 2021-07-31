package phoneBook.ua.ithillel.menu;

import phoneBook.ua.ithillel.InMemoryContactsService;

import java.util.Locale;
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
        for (int i = 0; i < inMemoryContactsService.contactList.size(); i++) {
            if (inMemoryContactsService.contactList.get(i).getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))){
                System.out.println(inMemoryContactsService.contactList.get(i));
            };
        }
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
