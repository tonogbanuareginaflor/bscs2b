import java.util.Scanner;

class activity6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = new int[10];

        System.out.print("Enter 10 numbers:\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMinimum value: " + min + "  Maximum value: " + max);
    }
}




