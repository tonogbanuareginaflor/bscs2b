package studentrecord;
public class Record {
    
   protected String name;
   protected String idNumber;
   protected String course;
   protected double gradeAI;
   protected double gradeData;
   protected double gradeProgram;
   protected double totalGrade;
    
   
   public String getName(){
       return name;
   }
   
    public void setName(String temp) {
        name = temp;
    }
    
    public double gettotalGrade(){
        double total = 0;
    total = (gradeAI + gradeData + gradeProgram)/4;
                return total;
    }
    
    public void setgradeAI (double tGrade) {
        gradeAI = tGrade;
    }

    public void setgradeData(double tGrade) {
        gradeData = tGrade;
    }

    public void setgradeProgram (double Tgrade) {
        gradeProgram = Tgrade;
    }
}
