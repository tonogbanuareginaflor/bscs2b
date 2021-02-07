/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity6;

import java.util.Scanner;
import java.util.Arrays;


public class Activity6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int[] myArray = new int[10];
        
        System.out.println("Enter Values: ");
        for (int x = 0; x < myArray.length; x++ ){
            int i = input.nextInt();
            myArray[x] = i;
           
        }
                 Arrays.sort(myArray);

         System.out.println("Maximum number = " 
         + myArray[myArray.length - 1] + " Minimum number = " + myArray[0]);
        // TODO code application logic here
    }
    
}
