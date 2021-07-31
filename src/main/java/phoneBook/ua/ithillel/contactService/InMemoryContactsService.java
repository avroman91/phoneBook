package phoneBook.ua.ithillel.contactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class InMemoryContactsService implements ContactsService {


    private ContactList contactList = new ContactList();


    @Override
    public ContactList getAll() {
        return contactList;
    }

    @Override
    public void remove(int index) {
        contactList.remove(index);
    }

    @Override
    public void add(Contact contact) {
        contactList.add(contact);
    }

    public Object find(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                return contactList.get(i);
            }
        }
        return "There is no such contact";
    }
}
