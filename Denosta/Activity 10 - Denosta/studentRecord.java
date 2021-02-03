package studentRecord;

public class studentRecord {

    String fName, address, contactNum, email, pLanguage;
    int apGrade, scieneGrade, mathGrade;

    public void add(String fName, String address, 
            String contactNum, String email, String pLanguage) {
        this.fName = "Full Name: " + fName;
        this.address ="Address: " + address;
        this.contactNum = "Contact Number: " + contactNum;
        this.email = "Email Adress: " + email;
        this.pLanguage = "Programming Language: " + pLanguage;
    }

    public void delete() {
    	fName = "";
        address = "";
        contactNum = "";
        email = "";
        pLanguage = "";
    }

    public void view() {
        if(fName.equals("") && address.equals("") && contactNum.equals("")
                && email.equals("") && pLanguage.equals("")) {
            System.out.print("");
        }

        else {
        System.out.println(fName);
        System.out.println(address);
        System.out.println(contactNum);
        System.out.println(email);
        System.out.println(pLanguage);
        }
    }

    public void update(String newFName, String newAddress,
        String newContactNum, String newEmail, String newPLanguage) {
    	  fName = "Full Name: " + newFName;
        address = "Address: " + newAddress;
        contactNum = "Contact Number: " + newContactNum;
        email = "Email Address: " + newEmail;
        pLanguage = "Programming Language: " + newPLanguage;
    }

    public void setGrades(int engGrade, int mathGrade, int sciGrade) {
        this.apGrade = engGrade;
        this.scieneGrade = mathGrade;
        this.mathGrade = sciGrade;
    }

    public void getAverage() {
        System.out.println("Araling Panlipunan Grade = " + apGrade);
        System.out.println("Science Grade = " + scieneGrade);
        System.out.println("Mathematics Grade = " + mathGrade);
        System.out.println("Average = " + ((apGrade + scieneGrade + mathGrade) / 3 ));
    }

    public static void main(String[] args) {
    	studentRecord student1 = new studentRecord();
    	studentRecord student2 = new studentRecord();       

    	student1.add("Vladimir Austria", "Quezon City", "09756493180", "VladimirAustria@yahoo.com", "C++");
    	student1.update("Karl Frederick Alamasen", "Manila", "09123456789", "KarlFA@yahoo.com", "Java");
    	student1.view();
    	student1.setGrades(96, 90, 83);
    	student1.getAverage();

    	student2.add("Shain Sandoval", "Cuartero", "09219123468", "ShainS@yahoo.comcom", "Python");
    	student2.delete();
    	student2.view();
    }
}
