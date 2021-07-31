package phoneBook.ua.ithillel.menu;


import phoneBook.ua.ithillel.contactService.InMemoryContactsService;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {
    private InMemoryContactsService inMemoryContactsService;

    public RemoveContactMenuAction(InMemoryContactsService inMemoryContactsService) {
        this.inMemoryContactsService = inMemoryContactsService;
    }

    @Override
    public void doAction(Scanner sc) {
        System.out.print("Please enter index of contact which you want to delete: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        inMemoryContactsService.remove(index);
    }

    @Override
    public String getName() {
        return "Remove existing contact";
    }

}
