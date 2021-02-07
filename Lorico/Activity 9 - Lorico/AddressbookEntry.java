//10.10.1 Address Book Entry Exercise
package addressbookentry;

public class AddressbookEntry {
    public static void main(String[] args) {

        String Name="Name: ", Address="Address: ", Telephone="Telephone Number: ", Email="Email Address: ";

        Entry name = new Entry();
        name.setName(Name+"Captain");
        System.out.println(name.getName());

        Entry address = new Entry();
        address.setAddress(Address+"Iloilo City");
        System.out.println(address.getAddress());

        Entry telephone = new Entry();
        telephone.setTelephone(Telephone+"987-1234");
        System.out.println(telephone.getTelephone());

        Entry email = new Entry();
        email.setEmail(Email+"captaina101@.yahoo.com");
        System.out.println(email.getEmail());
    }
}
