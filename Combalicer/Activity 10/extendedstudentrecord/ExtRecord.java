
package extendedstudentrecord;


public class ExtRecord {

    String name, address, num, email, lang;
    int engGrade, mathGrade, sciGrade;
    
    public void add(String name, String address, 
            String num, String email, String lang) {
        this.name = "Name: " + name;
        this.address ="Address: " + address;
        this.num = "Telephone Number: " + num;
        this.email = "Email: " + email;
        this.lang = "Preferred Programming Language: " + lang;
    }
    
    public void delete() {
        name = "";
        address = "";
        num = "";
        email = "";
        lang = "";
    }
    
    public void view() {
        
        if(name.equals("") && address.equals("") && num.equals("")
                && email.equals("") && lang.equals("")) {
            System.out.print("");
        }
        
        else {
        System.out.println(name);
        System.out.println(address);
        System.out.println(num);
        System.out.println(email);
        System.out.println(lang);
        }
    }
    
    public void update(String newName, String newAddress,
            String newNum, String newEmail, String newLang) {
        name = "Name: " + newName;
        address = "Address: " + newAddress;
        num = "Telephone Number: " + newNum;
        email = "Email: " + newEmail;
        lang = "Preferred Programming Language: " + newLang;
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
        
        ExtRecord a = new ExtRecord();
        ExtRecord b = new ExtRecord();       

        
        a.add("john", "poblacion", "09454764800", "jays@email.com", "Java");
        a.update("ryan", "odiong", "09123456789", "ryan@email.com", "Python");
        a.view();
		a.setGrades(90, 85, 92);
        a.getAverage();
        
        b.add("jay", "lapaz", "09313222111", "jay@email.com", "C++");
        b.delete();
        b.view();
        

    }
    
}
