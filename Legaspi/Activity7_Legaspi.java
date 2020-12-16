import java.util.*;
public class Activity7_Legaspi {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner skaner = new Scanner(System.in);
        int dugang = skaner.nextInt();
        int [] nums = new int [dugang];
        System.out.println("Good!Now Enter your numbers: ");
        for (int i = 0; i<=nums.length-1; i++)
        {
            dugang=skaner.nextInt();
            nums[i]=dugang;
        }
        Arrays.sort(nums);
        System.out.println("The SMALLEST(MINIMUM) NUMBER is "+nums[0]+" while the LARGEST(MAXIMUM) Number is "+nums[nums.length-1]);
    }
    }
