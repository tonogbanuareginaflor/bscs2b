
public class Activity3 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 23, num3 = 5;
        int highestNum = (num1 > num2 ? num1 : num2) > num3 ? 
                        (num1 > num2 ? num1 : num2) : num3;	
        
        System.out.println
        ("number 1 = " + num1 +
         "\nnumber 2 = " + num2 +
         "\nnumber 3 = " + num3 +
         "\nThe highest number is = " + highestNum);
    }
}
