import java.util.Scanner;

public class activity7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.print("Enter the size of the array: ");
        length = input.nextInt();

        int array[];
        array = new int[length];
        System.out.print("Enter " + length + " integers:\n");

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
        System.out.println( "Largest element: " + max + "  Smallest element: " + min );
    }
}

