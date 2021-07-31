package phoneBook.ua.ithillel.contactService;

import java.util.Locale;

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
        } else if (index < 0 || index >= contactList.size()){
            System.out.println("Incorrect input");
        } else {
            contactList.remove(index);
        }
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
