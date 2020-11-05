import java.util.Scanner;

public class Activity4
{
    public void menu()
    {
        System.out.println ("1) Celsius to Fahrenheit\n2) Fahrenheit to Celsius");
        System.out.print("Enter number of choice: ");
    }
    public Activity4()
    {
        Scanner in = new Scanner(System.in);
        menu();
        switch (in.nextInt()) {
            case 1 -> {
                System.out.print("Enter temperature (Celsius) to convert to Fahrenheit: ");
                float C = in.nextFloat();
                float F = C * (9f / 5) + 32;
                System.out.println(C + " degree Celsius = " + F + " degree Fahrenheit.");
            }
            case 2 -> {
                System.out.print("Enter temperature (Fahrenheit) to convert to Celsius: ");
                float F = in.nextFloat();
                float C = (F - 32) * (5f / 9);
                System.out.println(F + " degree Fahrenheit  = " + C + " degree Celsius.");
            }
        }
    }
    public static void main (String[]args)
    {
        new Activity4();
    }
}
