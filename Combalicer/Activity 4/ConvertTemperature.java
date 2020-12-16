
import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. Celcius to Fahrenheit" +
                            "\n2. Fahrenheit to Celcius" +
                            "\nEnter Choice: ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter Value: ");
                double inputCelcius = sc.nextDouble();
                double convertedFahrenheit = (inputCelcius * 9/5) + 32;
                System.out.println(inputCelcius + "°C = "
                        + convertedFahrenheit + "°F ");
                break;
            case 2:
                System.out.print("Enter Value: ");
                double inputFahrenheit = sc.nextDouble();
                double convertedCelcius = (inputFahrenheit - 32) * 5/9;
                System.out.println(inputFahrenheit + "°F = "
                        + convertedCelcius + "°C");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
