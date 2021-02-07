
package loops;

import java.util.Scanner;
public class activity5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("i)");
        int height = 4, width = 10;

        for (int i = 1; i <= height; ++i){
            for (int j = 1; j <= width; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("ii)");
        int rows = 5;

        for (int i = 1; i <= rows; ++i){
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("iii)");
        int rows1 = 5;

        for (int i = 1; i<=rows1; i++){
            for(int j = rows1; j>=1; j--){
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("iv)");

        int odd = 1;
        int spaces = 4;

        for (int i = 1; i<6; i++){
            for (int j = spaces; j>=1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j<=odd; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces = spaces -1;
            odd = odd+2;
        }


        System.out.println(" ");
        System.out.println("v)");


        int odd1 = 1;
        int spaces1 = 4;

        for (int i = 1; i<6; i++){
            for (int j = spaces1; j>=1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j<=odd1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
            spaces1 = spaces1 -1;
            odd1 = odd1+2;
        }


        System.out.println(" ");
        System.out.println("vi)");

        int SPACES = 4;
        for (int i = 1; i<6; i++){
            int kk = 0;
            for (int j = SPACES; j>=1; j--){
                System.out.print("  ");
            }
            for (kk = i; kk != 0; kk--){
                System.out.print(kk+" ");
            }
            SPACES--;
            for (int l = 2; l <= i; l++){
                System.out.print(l+" ");
            }

            System.out.println();

        }

    }
}
