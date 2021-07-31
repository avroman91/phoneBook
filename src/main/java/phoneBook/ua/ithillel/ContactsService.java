package phoneBook.ua.ithillel;

public interface ContactsService {


    ContactList getAll();

    void remove(int index);

    void add(Contact contact, InMemoryContactsService inMemoryContactsService);


}
