package phoneBook.ua.ithillel;

import java.util.Scanner;

public class InMemoryContactsService implements ContactsService {

    public ContactList contactList;


    public InMemoryContactsService(ContactList contactList) {
        this.contactList = contactList;
    }

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
}
