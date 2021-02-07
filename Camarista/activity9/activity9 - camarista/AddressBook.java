package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class main {

    private String name;
    private String address;
    private String cellphoneNumber;
    private String emailAddress;

    public main() {

    }

    public main(String name, String address, String cellphoneNumber,String emailAddress) {
        this.name = name;
        this.address = address;
        this.cellphoneNumber = cellphoneNumber;
        this.emailAddress = emailAddress;
    }

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
    public Scanner sc = new Scanner(System.in);

    main nEntry = new main();


    public void add() {


        System.out.println("\nADD AN ENTRY");
        System.out.print("Enter Name: ");
        nEntry.setName(sc.nextLine());
        System.out.print("Enter Address: ");
        nEntry.setAddress(sc.nextLine());
        System.out.print("Enter Cellphone number: ");
        nEntry.setCellphoneNumber(sc.nextLine());
        System.out.print("Enter Email address: ");
        nEntry.setEmailAddress(sc.nextLine());

        entries.add(nEntry);
    }

    public void delete(){

        System.out.println("\nDELETE ENTRY");

        int j = 0;
        j = entries.stream().map((nEntry) -> {
            System.out.println("Name: " + nEntry.getName());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Address: " + nEntry.getAddress());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Cellphone number: " + nEntry.getCellphoneNumber());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Email address: " + nEntry.getEmailAddress());
            return nEntry;
        }).map((_item) -> 1).reduce(j, Integer::sum);
        System.out.println("\n");


        System.out.print("Enter number to delete: ");
        int choice = Integer.parseInt(sc.nextLine())-1;

        entries.remove(choice);
        System.out.println("You successfully deleted an entry");
        entries.add(nEntry);

    }
    public void view(){

        System.out.println("\nVIEW ALL ENTRIES ");

        int j = 0;
        j = entries.stream().map((nEntry) -> {
            System.out.println("Name: " + nEntry.getName());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Address: " + nEntry.getAddress());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Cellphone number: " + nEntry.getCellphoneNumber());
            return nEntry;
        }).map((nEntry) -> {
            System.out.println("Email address: " + nEntry.getEmailAddress());
            return nEntry;
        }).map((_item) -> 1).reduce(j, Integer::sum);
        System.out.println("\n");
    }
    public void update(){

        System.out.println("\nUPDATE ");
        view();
        int choice = Integer.parseInt(sc.nextLine())-1;
        System.out.println("1. Name" +"\n"+
                "2. Address" +"\n"+
                "3. Cellphone number" +"\n"+
                "4. Email address");
        System.out.print("Enter the number of an entry you want to change: ");
        int update = sc.nextInt();

        switch(update){
            case 1 :
                System.out.print("Enter New Name: ");
                entries.get(choice).setName(sc.next());
                break;
            case 2 :
                System.out.print("Enter New Address: ");
                entries.get(choice).setAddress(sc.next());
                break;
            case 3 :
                System.out.print("Enter New Cellphone Number: ");
                entries.get(choice).setCellphoneNumber(sc.next());
                break;
            case 4 :
                System.out.print("Enter New Email Address: ");
                entries.get(choice).setEmailAddress(sc.next());
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
        System.out.println("Menu");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add entry" + "\n"
                + "2. Delete entry" + "\n"
                + "3. View all entries" + "\n"
                + "4. Update an entry \n");
        System.out.print("Choose a number: ");

        int choice = sc.nextInt();

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
                System.out.println("INVALID TRY AGAIN");
                menu(am);

        }
        menu(am);
    }


}
