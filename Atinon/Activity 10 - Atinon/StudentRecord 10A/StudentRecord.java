package studentrecord;

 public class StudentRecord extends Record{

   protected String remarks;
   protected double gradeOOP;
   protected double gradePE;
   protected double gradeDiscrete;

    
   public StudentRecord(String name, String idNumber, String course){
       this.name = name;
       this.idNumber = idNumber;
       this.course = course; 
   }
   @Override
   
  public double gettotalGrade(){
      double total = 0;
   total = (gradeAI + gradeData + gradeProgram + gradeOOP + gradePE + gradeDiscrete)/6;
                return total;           
  } 

    public String getRemarks() {
        if (gettotalGrade()>=90) {
		remarks ="Outstanding";
	} else if(gettotalGrade()>=85){
		remarks = "Very Satisfactory";
	} else if(gettotalGrade()>=80){
		remarks = "Satisfactory";
	} else if (gettotalGrade()>=75) {
		remarks ="Fairly Satisfactory";
	} else {
		remarks ="Did Not Meet Expectation";
	}
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public void setgradeOOP (double tGrade) {
        gradeOOP = tGrade;
    }

    public void setgradePE(double tGrade) {
        gradePE = tGrade;
    }

    public void setgradeDiscrete (double Tgrade) {
        gradeDiscrete = Tgrade;
    }
}   
