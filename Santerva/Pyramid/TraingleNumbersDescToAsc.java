
package main;

import java.util.Scanner;

public class TraingleNumbersDescToAsc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Desired Number: ");
        int num = sc.nextInt();
        
        for (int a = 1; a <= num; a++)
        {
            for (int j = 1; j<= num - a; j++) 
            { 
            System.out.print(" ");
            }
            for (int k = a; k >= 1; k--)
            {
                System.out.print(k);
            }
           for (int c = 2; c <= a; c++)
            { 
            System.out.print(c); 
            }
            System.out.println(); 
            }
    }
}


    

