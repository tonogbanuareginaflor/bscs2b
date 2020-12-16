//4.11.3 Output greatest value
package main;

public class GreatestValue {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 23;
		int num3 = 5;
		int greatestValue;

		System.out.println("number 1 = " + num1);
		System.out.println("number 2 = " + num2);
		System.out.println("number 3 = " + num3);

		if (num1 >= num2) {

			if (num1 >= num3) {
				greatestValue = num1;
			}

			else {
				greatestValue = num3;
			}
		} else {

			if (num2 >= num3) {
				greatestValue = num2;
			}

			else {
				greatestValue = num3;
			}
		}

		System.out.println("The highest number is " + greatestValue);
	}
}
