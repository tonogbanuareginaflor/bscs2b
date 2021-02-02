package addressbook;

public class AddressBook {
    
    String name, address, num, email;
    
    public void add(String name, String address,
            String num, String email) {
        this.name = "Name: " + name;
        this.address ="Address: " + address;
        this.num = "Telephone Number: " + num;
        this.email = "Email: " + email;
    }
    
    public void delete() {
        name = "";
        address = "";
        num = "";
        email = "";
    }
    
    public void view() {
        if(name.equals("") && address.equals("") && num.equals("")
                && email.equals("")) {
            System.out.print("");
        }
        
        else {
        System.out.println(name);
        System.out.println(address);
        System.out.println(num);
        System.out.println(email);
        }
    }
    
    public void update(String newName, String newAddress,
            String newNum, String newEmail) {
        name = "Name: " + newName;
        address = "Address: " + newAddress;
        num = "Telephone Number: " + newNum;
        email = "Email: " + newEmail;
    }
            
            
    public static void main(String[] args) {
        
        // sample execution
        // 2 entries of AddressBookEntry objects of the class AddressBook
        AddressBook a = new AddressBook();
        AddressBook b = new AddressBook();
        

        
        a.add("zyrix", "valderama", "09123789621", "zj@email.com");
        a.update("jonelyn", "sotelo", "05436782938", "sotelo@email.com");
        a.view();
        
        b.add("christine", "azuelo", "09989591217", "christy@email.com");
        b.delete();
        b.view();
    }
    
}