package phoneBook.ua.ithillel.contactService;

import phoneBook.ua.ithillel.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class InMemoryContactsService implements ContactsService {


    private ContactList contactList = new ContactList();


    @Override
    public ContactList getAll() {
        return contactList;
    }

    @Override
    public void remove(int index) {

        if (contactList.size() == 0) {
            System.out.println("Phonebook is empty");
        } else if (index < 0 || index >= contactList.size()) {
            System.out.println("Incorrect input");
        } else {
            contactList.remove(index);
        }
    }

    @Override
    public void add(Contact contact) {
        contactList.add(contact);
    }


    public ContactList findByName(String name) {
        return ListUtils.filter(contactList, contact -> contact.getName().contains(name));
    }

}
