import java.util.Scanner;

	public class Activity4{

		public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		
		System.out.println("Temperature Converter : " +"\n"+
							"1 -- Celsius To Farenheit" +"\n"+
							"2 -- Farenheit To Celsius");
		int temp = in.nextInt();

		double far,cel,val;

		switch(temp){

		case 1:
			System.out.println("Celsius to Farenheit");
			System.out.println("Please Enter Celsius Value : ");
			cel = in.nextDouble();
			val = ((cel*9)/5)+32;
			System.out.println("The Temperature you entered in Celsius is: " +cel+
			"\nThe Value in Farenheit is: " +val );
			break;

		case 2:
			System.out.println("Farenheit to Celsius");
			System.out.println("Please Enter Farenheit Value : ");
			far = in.nextDouble();
			val = ((far - 32)*5)/9;
			System.out.println("The Temperature you entered in Farenheit is: " +far+
			"\nThe Value in Celsuis is: " +val );
			break;
		default:
		System.out.println("Invalid Choice!");

		}

	}

}