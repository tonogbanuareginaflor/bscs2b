
package studentrecord;
public class Record {

    protected String name;
    protected String idNumber;
    protected String course;
    protected double gradeEthics;
    protected double gradePE;
    protected double gradeDiscrete;
    protected double gradeAI;
    protected double gradeDataStruct;
    protected double gradeOOP;
    protected double gradeContemporary;
    protected double totalGrade;
    protected String remarks;

    public String getName(){
        return name;
    }
    public void setName(String temp) {
        name = temp;
    }


    public double gettotalGrade(){
        double total = 0;
        total = (gradeAI + gradeDataStruct + gradeContemporary + gradeOOP + gradePE + gradeDiscrete + gradeEthics)/7;
        return total;
    }

    public void setgradeAI (double tGrade) {
        gradeAI = tGrade;
    }

    public void setgradeDataStruct(double tGrade) {
        gradeDataStruct = tGrade;
    }

    public void setgradeContemporary (double tGrade) {
        gradeContemporary = tGrade;
    }
    public void setgradeOOP (double tGrade) {
        gradeOOP = tGrade;
    }

    public void setgradeEthics (double tGrade) {
        gradeOOP = tGrade;
    }

    public void setgradePE(double tGrade) {
        gradePE = tGrade;
    }

    public void setgradeDiscrete (double tGrade) {
        gradeDiscrete = tGrade;
    }
}
