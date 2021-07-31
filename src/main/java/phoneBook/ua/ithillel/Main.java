package phoneBook.ua.ithillel;

import phoneBook.ua.ithillel.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuAction> actions = new ArrayList<>();
        ContactList contactList = new ContactList(new ArrayList<>());
        InMemoryContactsService memory = new InMemoryContactsService(contactList);
        actions.add(new ReadAllMenuAction(scanner, memory));
        actions.add(new AddContactMenuAction(scanner, memory));
        actions.add(new RemoveContactMenuAction(scanner, memory));
        actions.add(new FindContactMenuAction(scanner, memory));
        Menu menu = new Menu(scanner, actions);
        menu.run();

    }
}
