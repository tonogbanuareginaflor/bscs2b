
package main;

import java.util.Scanner;

public class ArrayInputMinMax {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the size of the Array: ");
        int x = sc.nextInt();
        
         
            
         
         int Input[] = new int[x];
         
         for(int i = 0; i < x; i++){
             System.out.print("Input Number "+(i+1)+": ");
             Input[i] = sc.nextInt();
         }
         
         int Min = Input[0];
         int Max = Input[0];
        
         
         for(int i = 0; i < x; i++){
             if(Input[i]<Min){Min = Input[i];}
            
             if(Input[i]>Max){Max = Input[i];}
         }
         System.out.println("The Minimum Value in the Array: "+Min);
         System.out.println("The Maximum Value in the Array: "+Max);      
    }
    
}
