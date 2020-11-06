
package activity.pkg7;

import java.util.Scanner;
public class Activity7 {


    public static void main(String[] args) {
        int hoho;
        int Saisho, Dekai;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array Size: ");
        
        hoho = sc.nextInt(); //number of elements from user
        int[] AraAra = new int[hoho]; //declaring an array of elements
        //lfor loop takes user's input for elements
        for (int i = 0; i < hoho; i++){
            System.out.print("Enter element "+(i+1)+": ");
            AraAra[i] = sc.nextInt(); //takes input from user for array
        }
        
        Saisho = AraAra [0]; //assume first element as smallest value
        Dekai = AraAra [0]; //assume first element as largest value
        
        for (int i = 0; i < hoho; i++){
            if (AraAra[i] < Saisho) {Saisho = AraAra[i];} //lfor loop finds minimum element/s
            if (AraAra[i] > Dekai) {Dekai = AraAra[i];} //for loop finds maximum element/s
        }System.out.println("The smallest value in the Array is: " + Saisho);
        System.out.println("The biggest value in the Array is: " + Dekai);


        
        
    }
    
}
