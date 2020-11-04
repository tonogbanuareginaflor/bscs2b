
public class Loops {
    public static void main(String[] args) {        
        
        System.out.println("i");
        for(int row = 0; row<4; row++) {
            for(int col = 0; col<10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nii");
        for(int row = 1; row<6; row++) {
            for(int col = 0; col<row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\niii");
        for(int row = 1; row<6; row++) {
            for(int space = 6; space>row; space--){
                System.out.print(" ");
            }
            for(int col = 0; col<row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\niv");
        for(int row = 1; row<10; row+=2) {
            for(int space = 10; space>row; space--){
                System.out.print(" ");
            }
            for(int col = 0; col<row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        System.out.println("\nv");
        for(int row = 1, num = 0; row<10; row+=2, num++) {
            for(int space = 10; space>row; space--){
                System.out.print(" ");
            }
            for(int col = 0; col<row; col++) {
                System.out.print(" " + (row-num));
            }
            System.out.println();
        }

        System.out.println("\nvi");
        int spaces = 4;
        for (int i = 1; i<6; i++){
            for (int j = spaces; j>=1; j--){
                System.out.print("  ");
            }
            for (int k = i; k != 0; k--){
                System.out.print(k+" ");
            }
            spaces--;
            for (int l = 2; l <= i; l++){
                System.out.print(l+" ");
            }

            System.out.println();
         
        }
    }
}
