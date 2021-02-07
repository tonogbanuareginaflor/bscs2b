package studentrecord;

public class main {

    public static void main(String[] args){

        StudentRecord rec = new StudentRecord("Julliane Pearl M. Camarista",
                "2019M0487",
                "Bachelor Of Science in Computer Science Major In Artificial Intellligence");


        rec.setgradeOOP(90);
        rec.setgradeDiscrete(88);
        rec.setgradeAI(80);
        rec.setgradeDataStruct(93);
        rec.setgradePE(93);
        rec.setgradeContemporary(86);
        rec.setgradeEthics(91);



        System.out.println("Name: " + rec.name);
        System.out.println("Student ID: " + rec.idNumber);
        System.out.println("Course: " + rec.course);
        System.out.println("Total Grade: " + rec.gettotalGrade());
        System.out.println("Remarks: " + rec.getRemarks());
    }
}
