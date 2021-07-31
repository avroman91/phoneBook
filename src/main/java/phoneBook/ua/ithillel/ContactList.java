package phoneBook.ua.ithillel;

import java.util.*;

public class ContactList {

    public List<Contact> contactList = new ArrayList();

    public ContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Contact get(int index) {
        return contactList.get(index);
    }

    public void set(int index, Contact contact) {
        contactList.set(index, contact);
    }

    public int size() {
        return contactList.size();
    }

    public void remove(int index) {
        contactList.remove(index);
    }

    public void add(Contact contact) {
        contactList.add(contact);
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("Your phone book: \n");
        for (int i = 0; i < contactList.size(); i++) {
            st.append(i + 1).append(" ").append(contactList.get(i).getName()).append("\n");
        }
        st.append("End");
        return st.toString();
    }
}
