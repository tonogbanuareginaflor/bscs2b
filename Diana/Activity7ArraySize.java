/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

public class Activity7ArraySize {
    public static void main(String[] args) {
        
        int count, max, min, i;
        int[] Arraysize = new int[100];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number size:");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements");
         
        for(i = 0; i < count; i++) {
            Arraysize[i] = in.nextInt();
        }
   
        max = min = Arraysize[0];
         
        for(i = 1; i < count; i++) {
            if(Arraysize[i] > max)
                max = Arraysize[i];
            else if (Arraysize[i] < min)
                min = Arraysize[i];
                
        }
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
    }
}
