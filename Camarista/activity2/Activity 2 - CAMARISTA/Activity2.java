import java.util.Scanner;
public class Activity2{

	public static void main (String[] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Please Enter The First Number: ");
	int num1 = in.nextInt();
	System.out.println("Please Enter The Second Number: ");
	int num2 = in.nextInt();


	int sum = num1 + num2;
	int prod = num1 * num2;
	int diff = num1 - num2;
	int quo = num1/num2;
	int remain = num1 % num2;


	System.out.println("The Sum of two number is: " +sum+
	"\nThe Product of two number is: " +prod+
	"\nThe Difference of two number is: " +diff+
	"\nThe Quotient of two number is: " +quo+
	"\nThe Remainder of two number is: " +remain );






	}

}
