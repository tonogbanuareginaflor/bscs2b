
package Exercises;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input ten numbers");
        
        int max, min, nums[] = new int[10];
        
        for(int i = 0; i<nums.length; i++) {
            System.out.print((i+1) + ". ");
            nums[i] = sc.nextInt();
        }
        max = nums[0];
        min = nums[0];
        for(int i = 0; i<nums.length; i++) {
            if(max<nums[i]) {
                max = nums[i];
            }
            if(min>nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Maximum Value is " + max);
        System.out.println("Minimum Value is " + min);
    }
}
