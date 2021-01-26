
package address.book.test;


public class AddressBookEntry {
    
private String name;
private String address;
private int telephonenumber;
private String emailaddress;

//constructor
public AddressBookEntry() {}

public AddressBookEntry(String name, String address,
                        int telephonenumber, String emailaddress){
        this.name = name;
        this.address = address;
        this.telephonenumber = telephonenumber;
        this.emailaddress = emailaddress;
        }

//accessor - get
public String getName(){
        return name;}

public String getAddress(){
        return address;}

public int getTelephoneNumber(){
        return telephonenumber;}

public String getEmailAddress(){
        return emailaddress;}

//mutator - set
public void setName(String name){
        this.name = name;}

public void setAddress(String address){
        this.address = address;}

public void setMobileNumber(int telephonenumber){
        this.telephonenumber = telephonenumber;}

public void setEmailAddress(String emailaddress){
        this.emailaddress = emailaddress;}

public String toString(){
        return "Name: " + name + ", Address: " + address +
        ", Mobile Number: " + telephonenumber + ", Email Address: " + emailaddress;
        }
}
