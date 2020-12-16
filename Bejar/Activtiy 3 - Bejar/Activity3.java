import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature (Celsius) to convert to Fahrenheit: ");
        float C = in.nextFloat();
        float F = C * (9f / 5) + 32;
        System.out.println(C + " degree Celsius = " + F +" degree Fahrenheit.");
    }
}

