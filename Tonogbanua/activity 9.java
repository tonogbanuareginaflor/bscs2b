package activity9;

public class Entry {
    String name, address, num, email;
    
    // constructors
    public Entry(String name, String address, String num, String email) {
        this.name = name;
        this.address = address;
        this.num = num;
        this.email = email;
    }
    
    public Entry() {
        
    }
    
    // mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNum(String num) {
        this.num = num;
    }
    
    public void setEmail(String Email) {
        this.email = email;
    }
    
    // accessors
    public String getName() {
        System.out.print("Name: ");
        return name;
    }
   
    public String getAddress() {
        System.out.print("Address: ");
        return address;
    }
    
    public String getNum() {
        System.out.print("Mobile Number: ");
        return num;
    }
    
    public String getEmail() {
        System.out.print("Email: ");
        return name;
    }
    
    public static void main(String[] args) {
        
        // sample execution
        
        Entry e = new Entry();
        Entry e2 = new Entry("Regina Flor", "Tigbauan", "09999779798", "reginafloryna@gmail.com");
        
        e.setName("REGINA FLOR");
        e.setAddress("TIGBAUAN");
        
        System.out.println(e.getName());
        System.out.println(e.getAddress());
        
        System.out.println(e2.getName());
        System.out.println(e2.getAddress());
        System.out.println(e2.getNum());
        System.out.println(e2.getEmail());
    }
   
}