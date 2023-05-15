/**
 * Η κλάση Contact περιγράφει μία επαφή που βρίσκεται σε μία εφαρμογή διαχείρισης επαφών.
 * @mscict22049
 */
public class Contact
{
    private String name;
    private String surname;
    private String telnumber;
    private String email;
    private String address;



    /**
     * Αρχικοποιεί μία επαφή. Η αρχικοποίηση περιλαμβάνει όλα τα attributes.
     * @param name Η τιμή που θα εκχωρηθεί στο όνομα της επαφής
     * @param surname Η τιμή που θα εκχωρηθεί στο επώνυμο της επαφής
     * @param telnumber Η τιμή που θα εκχωρηθεί στο νούμερο τηλεφώνου της επαφής
     * @param email Η τιμή που θα εκχωρηθεί στο email της επαφής
     * @param address Η τιμή που θα εκχωρηθεί στη διεύθυνση της επαφής
     */

    public Contact(String name, String surname, String telnumber, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.telnumber = telnumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Τυπώνει στην οθόνη την καρτέλα της επαφής. Περιλαμβάνει όλα τα χαρακτηριστικά της.
     */
    public void Print ()
    {
        System.out.println("Επώνυμο επαφής:.... " + name);
        System.out.println("Όνομα επαφής:.... " + surname);
        System.out.println("Νούμερο τηλεφώνου επαφής:.... " + telnumber);
        System.out.println("Email επαφής:.... " + email);
        System.out.println("Διεύθυνση επαφής:.... " + address);
    }

    /**
     * Επιστρέφει όλα τα χαρακτηριστικά της επαφής σε μία συμβολοσειρά.
     * @return Η συμβολοσειρά με όλα τα χαρακτηριστικά.
     */
    @Override
    public String toString ()
    {
        return name + ", " + surname + ", " +telnumber + ", " +email + ", " +address;
    }
}

