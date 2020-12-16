public class Activity1_3 {


	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 23;
		int n3 = 5;

		int max = (n1 > n2 ? n1 : n2 > n3 ? (n1 > n2 ? n1 : n2) : n3);

		System.out.println("Number 1 is " + n1);
		System.out.println("Number 2 is " + n2);
		System.out.println("Number 3 is " + n3);
		System.out.println("The highest number is " + max);

	}

}