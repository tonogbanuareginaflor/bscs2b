public class pyramid {

    public static void main(String[] args) {

        //pyramid 1
    for(int i=1; i<=4; i++){

        for (int j=1; j<=10; j++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
//pyramid 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pyramid 3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pyramid 4
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= (4 - i) * 2; j++) {
                System.out.print(" ");

            }
            for (int k = i; k >= 0; k--) {
                System.out.print("* ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //pyramid 5
        for (int i=1; i<=5; i++){
            for (int j=4; j>=i; j--){
                System.out.print("  ");
            }
            for (int k=1; k<=(2*i)-1; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    //pyramid 6
       for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= (5 - i) * 2; j++) {
            System.out.print(" ");

        }
        for (int k = i; k >= 1; k--) {
            System.out.print(" " + k);
        }
        for (int l = 2; l <= i; l++) {
            System.out.print(" " + l);
        }
        System.out.println();
    }
       }

}

