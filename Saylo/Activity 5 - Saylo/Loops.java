
package loops;

import java.util.Scanner;
public class Loops {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------//       Number 1 Rectangle
        System.out.println("i)");
        int height = 4, width = 10; 
        
        //outer loop for rectangle's height/columns
        for (int i = 1; i <= height; ++i){
        //inner loop for rectangle's width/rows
         for (int j = 1; j <= width; ++j){
             //printing stars
             System.out.print("* ");
         }
         //ending line after each row
         System.out.println();
        }
//----------------------------------------------------------------//       Number 2 Half Triangle (Right)       
        System.out.println("\nii)");
        int rows = 5;
        
        //outer loop for rows
        for (int i = 1; i <= rows; ++i){
        //inner loop for columns
         for (int j = 1; j <= i; ++j){
             //printing of stars    
                System.out.print("*");
                }
                //ending line after each row
                System.out.println();
            }
//----------------------------------------------------------------//        Number 3 Half Triangle (Left)
        System.out.println("\niii)");
        
        int rows1 = 5;
        
        //outer loop for rows
        for (int i = 1; i<=rows1; i++){
            //inner loop for columns
            for(int j = rows1; j>=1; j--){
                //conditions
                if (j > i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
//----------------------------------------------------------------//        Number 4 Pyramid
        System.out.println("\niv)");
        
        int odd = 1;
        int spaces = 4;
        //outer loop for rows
        for (int i = 1; i<6; i++){
            //inner loop for spaces in each row
            for (int j = spaces; j>=1; j--){
                System.out.print("  ");
            }//inner loop for columns
            for (int j = 1; j<=odd; j++){
                System.out.print("* ");
            }
            System.out.println();
            //reduces space as it goes down by column
            spaces = spaces -1;
            //structures the pyramid 's rows through odd numbers (1st row to 5th row - 1,3,5,7,9)
            odd = odd+2;
        }
    
//----------------------------------------------------------------//        Number 5 Pyramid Number Pattern
        System.out.println("\nv)");
        

        int odd1 = 1;
        int spaces1 = 4;
        //outer loop for rows
        for (int i = 1; i<6; i++){
            //inner loop for spaces in each row
            for (int j = spaces1; j>=1; j--){
                System.out.print("  ");
            }//inner loop for columns
            for (int j = 1; j<=odd1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
            //reduces space as it goes down by column
            spaces1 = spaces1 -1;
            //structures the pyramid 's rows through odd numbers (1st row to 5th row - 1,3,5,7,9)
            odd1 = odd1+2;
        }
        
//----------------------------------------------------------------//       Number 6 Pyramid Vice    
        System.out.println("\nvi)");
        
        int SPACES = 4;
        //outer loop for rows
        for (int i = 1; i<6; i++){
            int kk = 0;
            //inner loop for alignment
            for (int j = SPACES; j>=1; j--){
                System.out.print("  ");
            }//inner loop for left side 
            for (kk = i; kk != 0; kk--){
                System.out.print(kk+" ");
            }
            SPACES--;
            //inner loop for right side
            for (int l = 2; l <= i; l++){
                System.out.print(l+" ");
            }

            System.out.println();
         
        }
 
    } 
}
