package phoneBook.ua.ithillel.contactService;

public class Contact {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + phone;
    }
}
