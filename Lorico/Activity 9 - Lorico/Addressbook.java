//10.10.2 Addressbook Exercise
package addressbookentry;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressbook {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> addresses = new ArrayList<String>();
        ArrayList<String> telephones = new ArrayList<String>();
        ArrayList<String> emails = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        Entry name1 = new Entry();
        name1.setName("Sky");
        names.add("Sky");

        Entry address1 = new Entry();
        address1.setAddress("Alfea");
        addresses.add("Alfea");

        Entry telephone1 = new Entry();
        telephone1.setTelephone("539 - 4134");
        telephones.add("539-4134");

        Entry email1 = new Entry();
        email1.setEmail("gloomysky@outlook.com");
        emails.add("gloomysky@outlook.com");

        boolean repeat = true;
        while (repeat){
            System.out.println("\n1. ADD ENTRY"+"\n2. DELETE ENTRY"+"\n3. VIEW ALL ENTRY"+"\n4. UPDATE ENTRY"+"\nEXIT");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("\nAdding Entry...");

                    Entry name = new Entry();
                    System.out.print("Enter Name: ");
                    String addName = input.next();
                    name.setName(addName+addName);
                    names.add(addName);

                    Entry address = new Entry();
                    System.out.print("Enter Address: ");
                    String addAddress = input.next();
                    address.setAddress(addAddress);
                    addresses.add(addAddress);

                    Entry telephone = new Entry();
                    System.out.print("Enter Telephone Number: ");
                    String addTelephone = input.next();
                    telephone.setTelephone(addTelephone);
                    telephones.add(addTelephone);

                    Entry email = new Entry();
                    System.out.print("Enter Email Address: ");
                    String addEmail = input.next();
                    email.setEmail(addEmail);
                    emails.add(addEmail);
                    System.out.println("Entry Added Succesfully!");
                    break;

                case 2:
                    System.out.println("\nDeleting Entry...");
                    System.out.print("Enter Name to Delete: ");
                    String deleteEntry = input.next();

                    if (names.contains(deleteEntry))
                        for (int i = 0; i < names.size(); i++) {
                            if (deleteEntry.equals(names.get(i))) {
                                System.out.println(deleteEntry +" has been deleted.");
                                names.remove(i);
                                addresses.remove(i);
                                telephones.remove(i);
                                emails.remove(i);
                            }
                        } else {
                        System.out.println("No " + deleteEntry + " in the list.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\nViewing all entries...");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println((i + 1) + ". Name:    " + names.get(i) + "\n   Address: " + addresses.get(i) + "\n   Tel No.: " +
                                telephones.get(i) + "\n   E-mail:  " + emails.get(i));
                    }
                    System.out.println(	"\n" + names.size() + " entries found in the list.");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nUpdating Entry...");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println((i + 1) + ". Name:    " + names.get(i) + "\n   Address: " + addresses.get(i) + "\n   Tel No.: " +
                                telephones.get(i) + "\n   E-mail:  " + emails.get(i));
                    }

                    System.out.print("Enter Entry to Update: ");
                    int update =  input.nextInt();

                    System.out.print("Enter New Name: ");
                    String updateName = input.next();
                    names.set((update - 1), updateName);

                    System.out.print("Enter New Address: ");
                    String updateAddress =  input.next();
                    addresses.set((update - 1), updateAddress);

                    System.out.print("Enter New Tel No.: ");
                    String updateTelephone =  input.next();
                    telephones.set((update - 1), updateTelephone);

                    System.out.print("Enter New E-mail: ");
                    String updateEmail =  input.next();
                    emails.set((update - 1), updateEmail);
                    break;

                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
            }
        }
}
