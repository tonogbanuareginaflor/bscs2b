import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Activity7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> Array = new ArrayList<>();

		System.out.print("Enter the size of an Array: ");
		int count = scan.nextInt();

		System.out.println("Enter " + count + " values:");

		for (int i = 0; i < count; i++) {
			int array = scan.nextInt();
			Array.add(array);
			Collections.sort(Array);
		}
		System.out.println("The Largest Element: " + Array.get(count - 1));
		System.out.println("The Smallest Element: " + Array.get(0));
	}
}
