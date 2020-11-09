public class four {

	public static void main(String[] args) {
		int rows = 5;
		int t = 0;

		for (int i = 1; i <= rows; ++i, t = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print("  ");
			}

			while (t != 2 * i - 1) {
				System.out.print("* ");
				++t;
			}

			System.out.println();
		}
	}
}
