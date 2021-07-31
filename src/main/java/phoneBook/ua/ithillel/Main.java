package phoneBook.ua.ithillel;

import phoneBook.ua.ithillel.contactService.InMemoryContactsService;
import phoneBook.ua.ithillel.menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuAction> actions = new ArrayList<>();
        InMemoryContactsService memory = new InMemoryContactsService();
        actions.add(new ReadAllMenuAction(memory));
        actions.add(new AddContactMenuAction(memory));
        actions.add(new RemoveContactMenuAction(memory));
        actions.add(new FindContactMenuAction(memory));
        Menu menu = new Menu(actions);
        menu.run();

    }
}
