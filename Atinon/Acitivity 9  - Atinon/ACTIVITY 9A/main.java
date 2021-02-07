package addressbookentry;


import java.util.ArrayList;
import java.util.Scanner;

class line { 
 static void prLine(){
     System.out.println("--------------------------");
 }
 
}
class copyryt {
    static void mk() { 
    System.out.println("MARK VINCENT ATINON BSCS 2B AI");
    }
}

// class
class main {

    private String name;
    private String address;
    private String cellphoneNumber;
    private String emailAddress;

    public main() {

    }

public main(String name, String address, String cellphoneNumber,String emailAddress){
    this.name = name;
    this.address = address;
    this.cellphoneNumber = cellphoneNumber;
    this.emailAddress = emailAddress;
}
  //accessor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
    

class AddressBook {
    private ArrayList<main> entries = new ArrayList<main>();
     public Scanner mac = new Scanner(System.in);
    
     main nEntry = new main();
    
    
    public void add() {
        
        copyryt.mk();
        line.prLine();
        System.out.println("========= ADD ========");
        line.prLine();
        System.out.println("Enter Name: ");
        nEntry.setName(mac.nextLine());
        System.out.println("Enter Address: ");
        nEntry.setAddress(mac.nextLine());
        System.out.println("Enter Cellphone Number: ");
        nEntry.setCellphoneNumber(mac.nextLine());
        System.out.println("Enter Email Address: ");
        nEntry.setEmailAddress(mac.nextLine());
        
        entries.add(nEntry);
    }
    
    public void delete(){
    
        line.prLine();
        System.out.println("========= DELETE ========");
        line.prLine();
        
        int x = 0;
        x = entries.stream().map((nEntry) -> {
            System.out.println("Name : " + nEntry.getName());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Address : " + nEntry.getAddress());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Cellphone Number : " + nEntry.getCellphoneNumber());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Email Address : " + nEntry.getEmailAddress());
            return nEntry;
        }).map((_item) -> 1).reduce(x, Integer::sum);
       System.out.println("\n");
      
        line.prLine();
        System.out.print("Enter number to delete: ");
        int choice = Integer.parseInt(mac.nextLine())-1;

        entries.remove(choice);
        System.out.println("YOU HAVE SUCCESSFULLY DELETED AN ENTRY!");
        entries.add(nEntry);
        
    }
    public void view(){
        
        line.prLine();
        System.out.println("========= VIEW ========");
        line.prLine();
        
        int x = 0;
        x = entries.stream().map((nEntry) -> {
            System.out.println("Name : " + nEntry.getName());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Address : " + nEntry.getAddress());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Cellphone Number : " + nEntry.getCellphoneNumber());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Email Address : " + nEntry.getEmailAddress());
            return nEntry;
        }).map((_item) -> 1).reduce(x, Integer::sum);
       System.out.println("\n");
    }
    public void update(){
        
        line.prLine();
        System.out.println("========= UPDATE ======1==");
        line.prLine();
    
        
        line.prLine();
        view();
        System.out.println("Who do you want to UPDATE?");
        int choice = Integer.parseInt(mac.nextLine())-1;
        System.out.println("1 - NAME" +"\n"+
                           "2 - ADDRESS" +"\n"+
                           "3 - CELLPHONE NUMBER" +"\n"+
                           "4 - EMAIL ADDRESS");
        System.out.println("What do you want to change: ");
        int update = mac.nextInt();
        
            switch(update){
                case 1 :
                    System.out.print("Enter New Name: ");
                    entries.get(choice).setName(mac.next());
                    break;
                case 2 :
                    System.out.print("Enter New Address: ");
                    entries.get(choice).setAddress(mac.next());
                    break;
                case 3 : 
                    System.out.print("Enter New Cellphone Number: ");
                    entries.get(choice).setCellphoneNumber(mac.next());
                    break;
                case 4 :
                    System.out.print("Enter New Email Address: ");
                    entries.get(choice).setEmailAddress(mac.next());
                    break;
                default :
                    System.out.print("ERROR PLEASE TRY AGAIN");
                    update();
                    break;
            }
                System.out.println("ENTRY SUCCESSFULLY UPDATED!");
                 entries.add(nEntry);
    }

//getList
    public ArrayList<main> getList() {
        return entries;
    }


    public static void main(String[] args) {
        AddressBook am = new AddressBook();
        menu(am);
    }

    public static void menu(AddressBook am) {
        line.prLine();
        copyryt.mk();
        line.prLine();
        System.out.println("========== MENU ==========");
        line.prLine();
        Scanner maku = new Scanner(System.in);
        System.out.println("1 -- ADD ENTRY" + "\n"
                + "2 -- DELETE ENTRY" + "\n"
                + "3 -- VIEW ALL ENTRIES" + "\n"
                + "4 -- UPDATE AN ENTRY \n");
        System.out.print("C: ");

        int choice = maku.nextInt();

        switch (choice) {
            case 1:
                am.add();
                break;
            case 2:
                am.delete();
                break;
            case 3:
                am.view();
                break;
            case 4:
                am.update();
                break;
            default:
                System.out.println("INVALID CHOICE TRY AGAIN");
                menu(am);

        }
        menu(am);
    }


}
