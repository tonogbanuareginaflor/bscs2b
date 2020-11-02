
package main;
    
    import java.util.Scanner;
public class Square {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Put a Number: ");
        int num = sc.nextInt();
        
        for(int j = 0; j< num; j++){
            for(int i = 0; i < num; i++)
                System.out.print(" * ");
                System.out.print("\n");
        }
    }
    
}
