package phoneBook.ua.ithillel;

import java.util.*;

public class ContactList {

    public List<Contact> contactList = new ArrayList();

    public Contact get(int index) {
        return contactList.get(index);
    }

    public void set(int index, Contact contact) {
        contactList.set(index, contact);
    }

    public int size(int size) {
        return contactList.size();
    }

    public void remove(int index) {
        contactList.remove(index);
    }

    public void add(Contact contact) {
        contactList.add(contact);
    }

}
