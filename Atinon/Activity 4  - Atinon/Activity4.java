import java.util.*;

	public class Activity4{

		public static void main (String[] args){
		Scanner maku = new Scanner(System.in);

		//input
		System.out.println("Temperature Converter : " +"\n"+
							"1 -- Celsius To Farenheit" +"\n"+
							"2 -- Farenheit To Celsius");
		int temp = maku.nextInt();

		double far,cel,val;

		//switch
		switch(temp){

		case 1:
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("Celsius to Farenheit");
			System.out.println("Please Enter Celsius Value : ");
			cel = maku.nextDouble();
			val = ((cel*9)/5)+32;
			System.out.println("The Temperature you entered in Celsius is: " +cel+
			"\nThe Value in Farenheit is: " +val );
			break;

		case 2:
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("Farenheit to Celsius");
			System.out.println("Please Enter Farenheit Value : ");
			far = maku.nextDouble();
			val = ((far - 32)*5)/9;
			System.out.println("The Temperature you entered in Farenheit is: " +far+
			"\nThe Value in Celsuis is: " +val );
			break;
		default:
		System.out.println("Invalid Choice!");

		}

	}

}