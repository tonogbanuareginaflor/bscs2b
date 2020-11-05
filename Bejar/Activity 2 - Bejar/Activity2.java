import java.util.Scanner;
public class Activity2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2) + " (Sum) ");

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2)+ " (Difference) ");

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2)+ " (Product) ");

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2)+ " (Quotient) ");

        System.out.println(num1 + " % " + num2 + " = " +
                (num1 % num2)+ " (Remainder) ");
    }
}