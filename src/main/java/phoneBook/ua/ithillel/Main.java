package phoneBook.ua.ithillel;

import phoneBook.ua.ithillel.contactService.ContactList;
import phoneBook.ua.ithillel.contactService.InMemoryContactsService;
import phoneBook.ua.ithillel.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuAction> actions = new ArrayList<>();
        InMemoryContactsService memory = new InMemoryContactsService();
        actions.add(new ReadAllMenuAction(scanner, memory));
        actions.add(new AddContactMenuAction(memory));
        actions.add(new RemoveContactMenuAction(scanner, memory));
        actions.add(new FindContactMenuAction(scanner, memory));
        Menu menu = new Menu(scanner, actions);
        menu.run();

    }
}
