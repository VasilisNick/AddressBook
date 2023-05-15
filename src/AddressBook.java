import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;


    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Η επαφή διαγράφηκε.");
        } else {
            System.out.println("Η επαφή δε βρέθηκε.");
        }
    }

    public Contact searchByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact searchByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Δεν υπάρχουν επαφές.");
        } else {
            System.out.println("Οι επαφές είναι:");
            for (Contact contact : contacts) {
                System.out.println("Όνομα: " + contact.getName());
                System.out.println("Τηλέφωνο: " + contact.getPhone());
                System.out.println("E-mail: " + contact.getEmail());
                System.out.println("Διεύθυνση: " + contact.getAddress());
                System.out.println("------------");
            }
        }
    }


}

