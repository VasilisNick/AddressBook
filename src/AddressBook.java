/**
 * Η κλάση AddressBook αποτελεί την βασική κλάση του προγράμματος. Αποθηκεύει το σύνολο της πληροφορίας και αποτελεί το UI της εφαρμογής.
 *
 * @author mscict22049
 */
public class AddressBook {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact Co1;

        Co1 = new Contact("Vassilis", "Nikolakopoulos", "6971234567", "nikovas19@gmail.com", "Makridimitri 5");
        Co1.setTelnumber("8901234567");
        System.out.println(Co1.toString ());
    }
}
