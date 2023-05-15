import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        // Προσθέστε ενδεικτικές επαφές στο addressBook εδώ

        Contact contact1 = new Contact("John Smith", "1234567890", "john@example.com", "123 Main St");
        Contact contact2 = new Contact("Jane Doe", "9876543210", "jane@example.com", "456 Elm St");
        Contact contact3 = new Contact("Mike Johnson", "5555555555", "mike@example.com", "789 Oak St");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("Επιλέξτε μια επιλογή:");
            System.out.println("1. Προβολή όλων των επαφών");
            System.out.println("2. Προσθήκη νέας επαφής");
            System.out.println("3. Αναζήτηση επαφής βάσει ονόματος");
            System.out.println("4. Αναζήτηση επαφής βάσει τηλεφώνου");
            System.out.println("5. Επεξεργασία επαφής βάσει ονόματος");
            System.out.println("6. Διαγραφή επαφής βάσει ονόματος");
            System.out.println("7. Έξοδος από την εφαρμογή");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addressBook.displayContacts();
                    break;
                case 2:
                    System.out.println("Δώστε τα στοιχεία της νέας επαφής:");
                    System.out.print("Όνομα: ");
                    String name = scanner.next();
                    System.out.print("Τηλέφωνο: ");
                    String phone = scanner.next();
                    System.out.print("E-mail: ");
                    String email = scanner.next();
                    System.out.print("Διεύθυνση: ");
                    String address = scanner.next();

                    Contact newContact = new Contact(name, phone, email, address);
                    addressBook.addContact(newContact);
                    System.out.println("Η επαφή προστέθηκε.");
                    break;
                case 3:
                    System.out.print("Δώστε το όνομα της επαφής για αναζήτηση: ");
                    String searchName = scanner.next();
                    Contact foundByName = addressBook.searchByName(searchName);
                    if (foundByName != null) {
                        System.out.println("Η επαφή βρέθηκε:");
                        System.out.println("Όνομα: " + foundByName.getName());
                        System.out.println("Τηλέφωνο: " + foundByName.getPhone());
                        System.out.println("E-mail: " + foundByName.getEmail());
                        System.out.println("Διεύθυνση: " + foundByName.getAddress());
                    } else {
                        System.out.println("Η επαφή δε βρέθηκε.");
                    }
                    break;
                case 4:
                    System.out.print("Δώστε το τηλέφωνο της επαφής για αναζήτηση: ");
                    String searchPhone = scanner.next();
                    Contact foundByPhone = addressBook.searchByPhone(searchPhone);
                    if (foundByPhone != null) {
                        System.out.println("Η επαφή βρέθηκε:");
                        System.out.println("Όνομα: " + foundByPhone.getName());
                        System.out.println("Τηλέφωνο: " + foundByPhone.getPhone());
                        System.out.println("E-mail: " + foundByPhone.getEmail());
                        System.out.println("Διεύθυνση: " + foundByPhone.getAddress());
                    } else {
                        System.out.println("Η επαφή δε βρέθηκε.");
                    }
                    break;
                case 5:
                    System.out.print("Δώστε το όνομα της επαφής για επεξεργασία: ");
                    String editName = scanner.next();
                    Contact contactToEdit = addressBook.searchByName(editName);
                    if (contactToEdit != null) {
                        System.out.print("Δώστε το νέο τηλέφωνο: ");
                        String newPhone = scanner.next();
                        contactToEdit.setPhone(newPhone);
                        System.out.println("Η επαφή επεξεργάστηκε.");
                    } else {
                        System.out.println("Η επαφή δε βρέθηκε.");
                    }
                    break;
                case 6:
                    System.out.print("Δώστε το όνομα της επαφής για διαγραφή: ");
                    String deleteName = scanner.next();
                    Contact contactToDelete = addressBook.searchByName(deleteName);
                    if (contactToDelete != null) {
                        addressBook.removeContact(deleteName);
                        System.out.println("Η επαφή διαγράφηκε.");
                    } else {
                        System.out.println("Η επαφή δε βρέθηκε.");
                    }
                    break;
                case 7:
                    System.out.println("Έξοδος από την εφαρμογή.");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ διαλέξτε ξανά.");
                    break;
            }
        }

        scanner.close();
    }
}

