import java.util.*;

public class activity7{
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i=0; i<10; i++10)
        {
            array[i] = sc.nextInt();
        }
        activity7 in = new activity7();
        System.out.println("The Largest Element : "+ in.max(array));
        System.out.println("The Smallest Element : "+ in.min(array));
    }
}