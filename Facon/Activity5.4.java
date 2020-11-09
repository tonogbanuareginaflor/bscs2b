public class Activity4 {

    public static void main(String[] args) {

        //for rows
        for(int i = 1; i <= 5; i++) {
            
            //for spaces
            for(int space = 1; space <= 5 - i; space++) {
                System.out.print("  ");
            }
            //for stars
            for (int star = 0; star < (i * 2 - 1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}