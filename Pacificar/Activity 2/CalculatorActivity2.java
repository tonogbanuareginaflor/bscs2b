import java.util.Scanner;

//Program that prints the sum, product, difference, quotient, and remainder of two numbers given by the user.
public class  CalculatorActivity2 {
    public static void main(String[] args) {
        //Initialization of Variables
        int sum, product, difference, quotient, remainder;

        //Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers \n");

        //Asking Input from the User
        System.out.print("Enter num 1: ");
        String number1 = sc.nextLine();
        System.out.print("Enter num 2: ");
        String number2 = sc.nextLine();

        //Conversion of input from String to Integer
        int num1 = Integer.parseInt(number1);
        int num2  = Integer.parseInt(number2);

        //Operations
        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2;
        quotient =  num1 / num2;
        remainder = num1 % num2;

        //Print the output of the operations
        System.out.println("\n" + num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
}
