package activity9AB;

public class Info {

    String fName, address, contactNum, email;

    public void add(String name, String address,
            String num, String email) {
        this.fName = "Full Name: " + name;
        this.address ="Address: " + address;
        this.contactNum = "Telephone Number: " + num;
        this.email = "Email: " + email;
    }
    
    public void update(String newName, String newAddress,
            String newNum, String newEmail) {
    	fName = "Full Name: " + newName;
        address = "Address: " + newAddress;
        contactNum = "Telephone Number: " + newNum;
        email = "Email: " + newEmail;
    }
    
    public void view() {
        if(fName.equals("") && address.equals("") && contactNum.equals("")
                && email.equals("")) {
            System.out.print("");
        }

        else {
        System.out.println(fName);
        System.out.println(address);
        System.out.println(contactNum);
        System.out.println(email);
        }
    }

    public void delete() {
    	fName = "";
        address = "";
        contactNum = "";
        email = "";
    }

    public static void main(String[] args) {
    	Info person1 = new Info();
    	Info person2 = new Info();

    	person1.add("Vladimir Austria", "Quezon City", "09756493180", "VladimirAustria@yahoo.com");
    	person1.update("Karl Frederick Alamasen", "Manila", "09123456789", "KarlFA@yahoo.com");
    	person1.view();

    	person2.add("Shain Sandoval", "Cuartero", "09219123468", "ShainS@yahoo.com");
    	person2.delete();
    	person2.view();
    }

}
