import java.util.Scanner;

public class Activity4{
	
	public static void main(String[] args){
		Scanner form =new Scanner(System.in);
		
		System.out.println("Options:");
		System.out.println("1. C->F");
		System.out.println("2. F->C");
		System.out.print("Enter choice: ");
			int cho = form.nextInt();
		
			if (cho == 1){
			System.out.print("Enter value: ");
			int val = form.nextInt();
			double fahr = val * 9  / 5+ 32;
				System.out.println(val + " degrees Celsius = " + fahr + " degrees Fahrenheit");
				
			}else if (cho == 2){
			System.out.print("Enter value: ");
			int val = form.nextInt();
			double cel = (val - 32) * 5 / 9;
				System.out.println(val + " degrees Fahrenheit = " + cel + " degrees Celsius" );
				} else{
				System.out.println("Invalid Choice=");
			}
	}
}
		