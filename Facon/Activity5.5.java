public class Activity5{
    public static void main(String args[]){
        
        for (int i=1; i<=5; i++){ //rows
            
            for (int j=1; j <= 5-i; j++){ //space
                System.out.print("  ");
            
            }for (int k=1; k <= (2 * i) - 1; k++){ //pattern
                System.out.print(" "+i);         
           
            }
            System.out.println();
        }                                                 
    }
}