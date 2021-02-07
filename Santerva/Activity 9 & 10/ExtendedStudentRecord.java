
package practice;

/**
 *
 * @author TabletPC
 * 
 */
public class ExtendedStudentRecord {

    String name, address, num, emailadd, programl;
    int engGrade, mathGrade, sciGrade;
    
    public void add(String name, String address, 
            String num, String email, String lang) {
        this.name = "Name: " + name;
        this.address ="Address: " + address;
        this.num = "Contact Number: " + num;
        this.emailadd = "Email: " + email;
        this.programl = "Preferred Programming Language: " + lang;
    }
    
    public void delete() {
        name = "";
        address = "";
        num = "";
        emailadd = "";
        programl = "";
    }
    
    public void view() {
        
        if(name.equals("") && address.equals("") && num.equals("")
                && emailadd.equals("") && programl.equals("")) {
            System.out.print("");
        }
        
        else {
        System.out.println(name);
        System.out.println(address);
        System.out.println(num);
        System.out.println(emailadd);
        System.out.println(programl);
        }
    }
    
    public void update(String newName, String newAddress,
            String newNum, String newEmail, String newLang) {
        name = "Name: " + newName;
        address = "Address: " + newAddress;
        num = "Contact Number: " + newNum;
        emailadd = "Email: " + newEmail;
        programl = "Preferred Programming Language: " + newLang;
    }
    
    public void setGrades(int engGrade, int mathGrade, int sciGrade) {
        this.engGrade = engGrade;
        this.mathGrade = mathGrade;
        this.sciGrade = sciGrade;
    }
    
    public void getAverage() {
        System.out.println("English Grade = " + engGrade);
        System.out.println("Math Grade = " + mathGrade);
        System.out.println("Science Grade = " + sciGrade);
        System.out.println("Average = " + ((engGrade + mathGrade + 
                sciGrade) / 3 ));
    }
            
            
    public static void main(String[] args) {
        
        // sample execution
        
        ExtendedStudentRecord a = new ExtendedStudentRecord();
        ExtendedStudentRecord b = new ExtendedStudentRecord();       

        
        a.add("john", "santerva", "09478514053", "yeet@email.com", "SQL");
        a.update("mark", "seal", "09124354489", "teambol@email.com", "Java");
        a.view();
		a.setGrades(91, 87, 89);
        a.getAverage();
        
        b.add("mae", "lopez", "09154413451", "meat@email.com", "C#");
        b.delete();
        b.view();
        

    }
    
}
