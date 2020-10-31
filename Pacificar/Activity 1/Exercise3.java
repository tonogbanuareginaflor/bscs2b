public class Exercise3 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The highest number is = " + number1);
        }
        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The highest number is = " + number2);
        }
        else {
            System.out.println("The highest number is = " + number3);
        }
    }
}
