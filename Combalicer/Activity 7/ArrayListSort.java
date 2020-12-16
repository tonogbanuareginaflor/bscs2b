
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        
        for(int i = 0; i<size; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        System.out.println("The Smallest Integer is " + nums.get(0));
        System.out.println("The Largest Integer is " + nums.get(size-1));
    }
}
