import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\tTemperature Converter");
        System.out.println("1. Celsius to Fahrenheit ");
        System.out.println("2. Fahrenheit to Celsius ");
        System.out.print("Enter a number: ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter the Celsius value:");
                double celsius = scan.nextDouble();

                System.out.println("You have entered: " + celsius + "\u2103");

                double result1 = (celsius * 9/5) + 32;

                System.out.print("The converted temperature is " + result1 + "\u2109");
                break;
            case 2:
                System.out.print("Enter the Fahrenheit value:");
                double fahrenheit = scan.nextDouble();

                System.out.println("You have entered: " + fahrenheit + "\u2109");

                double result2 = (fahrenheit - 32) + 5/9;

                System.out.print("The converted temperature is " + result2 + "\u2103");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
