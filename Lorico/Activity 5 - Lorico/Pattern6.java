public class Pattern5 {
	public static void main(String args[]) {

		for (int i = 1; i <= 5; i++) { //rows
			for (int j = 1; j <= 5 - i; j++) { //space
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);        //left pattern
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l); //right pattern
			}
			System.out.println();
		}
	}
}