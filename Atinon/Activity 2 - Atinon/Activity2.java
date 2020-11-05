import java.util.*;
public class Activity2{

	public static void main (String[] args){

	Scanner maku = new Scanner(System.in);

	//variable input
	int num1,num2;

	System.out.println("Please Enter The First Number: ");
	num1 = maku.nextInt();
	System.out.println("Please Enter The Second Number: ");
	num2 = maku.nextInt();

	//computation var
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
