import java.util.Scanner;
import java.util.Arrays;

public class Activity6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] array = new int[10];

		System.out.println("Enter numbers:");
		for (int i = 0; i < array.length; i++) {
				int j = scan.nextInt();
				array[i] = j;
		}

		Arrays.sort(array);

		System.out.println("The maximum number = " + array[array.length - 1]);
		System.out.println("The minimum number = " + array[0]);
	}
}