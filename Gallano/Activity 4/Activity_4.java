import java.util.Scanner;

	class Activity4 {
		public static void main(String[] args) {
		
			Scanner temperature = new Scanner(System.in);

			System.out.println(("Options: ") + (" \n 1. C - F") + ("\n 2. F - C "));

			System.out.print("Enter choice: ");
			int choice = temperature.nextInt();

			if (choice == 1) {

				System.out.print("Enter choice: ");
				int temp = temperature.nextInt();
				double fahr = (temp * 9) / 5 + 32;
				System.out.println(temp + " degrees Celcius = " + fahr + " degrees Farenheit ");

			} else if (choice == 2) {

				System.out.print("Enter choice: ");
				int temp = temperature.nextInt();
				double cels = (temp - 32) * 5 / 9;
				System.out.println(temp + " degrees Celcius = " + cels + " degrees Farenheit ");
			}
		}
	}