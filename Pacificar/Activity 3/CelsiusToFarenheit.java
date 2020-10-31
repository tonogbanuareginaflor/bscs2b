import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        int i=50; // counter for while loop
        while(i>1){ // while loop to iterate the task inside, in this case it will ask if the user wants to calculate again
            double celsius, farenheit; // declaration of variables
            Scanner sc = new Scanner(System.in); // creates a scanner object

            System.out.println("\nPacificar - Acivity 3");
            System.out.println("Celsius to Farenheit Converter \n");
            System.out.print("Input Celsius Value in double/float: ");
            celsius = sc.nextDouble(); // scans the input from the user which is a double
            farenheit = (celsius * 9/5) + 32; // formula for conversion of celsius to farenheit

            System.out.println(celsius + "\u2103" +" in Farenheit is = " + farenheit + "\u2109");


            System.out.print("Dow you want to calculate again?(y/n) : "); // Asks the user if he/she wants to calculate again
            char choice = sc.next().charAt(0); // scans the input from the user
            if (choice == 'y') {
                i--; // if the user answers 'yes' then the counter will decrease and it will iterate the the code inside the while loop
            }
            else if (choice == 'n') { // if the user answers 'no' then the program will exit
                System.exit(0);
            }
            else { // if the user inputs an invalid input, the program will exit
                System.out.println("You entered an invalid output, program will terminate in 3 seconds.");
                System.exit(3);
            }
        }

    }
}


