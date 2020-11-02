import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Options \n" +
                         "1. C -> F \n" +
                         "2. F -> C ");
        System.out.print("Enter your choice: ");
        int num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println("C -> F");
                System.out.print("Enter Celsius: ");
                double celsius = scan.nextDouble();
                System.out.println(celsius + "\u2103" + " to \u2109 is " + ((celsius * 9/5) + 32) + "\u2103");
                break;
            case 2:
                System.out.println("F -> C");
                System.out.print("Enter Farenheit: ");
                double farenheit = scan.nextDouble();
                System.out.println(farenheit + "\u2109" + " to \u2103 is " + ((farenheit - 32) * 5/9) + "\u2109");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
