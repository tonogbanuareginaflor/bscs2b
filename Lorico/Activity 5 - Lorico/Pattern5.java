public class Pattern5{
    public static void main(String args[]){
        
        for (int i=1; i<=5; i++){ //rows
            
            for (int j=1; j <= 5-i; j++){ //space
                System.out.print(" ");
            
            }for (int k=1; k <= (2* i) - 1; k++){ //
                System.out.print(i);        //pattern 
           
            }
            System.out.println();
        }                                                 
    }
}