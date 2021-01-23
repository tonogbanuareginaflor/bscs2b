
package addressbookentry;

public class AddressBookEntryB {
    class main {

    private String name;
    private String address;
    private String cellphoneNumber;
    private String emailAddress;

    public main() {

    }

    public main(String name, String address, String cellphoneNumber, String emailAddress) {
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

}
