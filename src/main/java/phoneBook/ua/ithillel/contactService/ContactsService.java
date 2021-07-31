package phoneBook.ua.ithillel.contactService;

public interface ContactsService {


    ContactList getAll();

    void remove(int index);

    void add(Contact contact);


}
