package sample;

public class Entry {
    String fName, address, contactNum, email;

    public Entry(String fName, String address, String contactNum, String email) {
        this.fName = fName;
        this.address = address;
        this.contactNum = contactNum;
        this.email = email;
    }

    public Entry() {

    }

    public void setName(String name) {
        this.fName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNum(String num) {
        this.contactNum = num;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public String getName() {
        System.out.print("Full Name: ");
        return fName;
    }

    public String getAddress() {
        System.out.print("Address: ");
        return address;
    }

    public String getNum() {
        System.out.print("Contact Number: ");
        return contactNum;
    }

    public String getEmail() {
        System.out.print("Email Address: ");
        return email;
    }

    public static void main(String[] args) {
        Entry info1 = new Entry();
        Entry info2 = new Entry("Vladimir Austria", "Quezon City", "09756493180", "VladimirAustria@yahoo.com");

        info1.setName("Karl Frederick Alamasen");
        info1.setAddress("Manila");

        System.out.println(info1.getName());
        System.out.println(info1.getAddress());
        
        System.out.println();
        
        System.out.println(info2.getName());
        System.out.println(info2.getAddress());
        System.out.println(info2.getNum());
        System.out.println(info2.getEmail());
    }
}
