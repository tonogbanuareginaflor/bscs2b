
package main;
import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
         
        int x = 10;
        
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
  
		System.out.println("Largest Number in a given array is : " + Max);
		System.out.println("Smallest Number in a given array is : " + Min);
	}
}
    
