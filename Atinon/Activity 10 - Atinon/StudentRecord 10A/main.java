package studentrecord;

public class main {
    
    public static void main(String[] args){
        
        StudentRecord recs = new StudentRecord("Mark Vincent A. Atinon", "2019M0082","Bachelor Of Science in Computer Science Major In Artificial Intellligence");
        
        
    recs.setgradeAI(81);
    recs.setgradeData(91);
    recs.setgradeProgram(80);
    recs.setgradeOOP(94);
    recs.setgradePE(85);
    recs.setgradeDiscrete(83);
    
    
    System.out.println("Name: " + recs.name);
    System.out.println("Student ID: " + recs.idNumber);
    System.out.println("Course: " + recs.course);
    System.out.println("Total Grade: " + recs.gettotalGrade());
    System.out.println("Remarks: " + recs.getRemarks());
    }
}
