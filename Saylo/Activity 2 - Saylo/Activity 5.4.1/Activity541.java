
package activity.pkg5.pkg4.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Activity541 {


    public static void main(String[] args) {
        
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        try{
            System.out.print("Enter word 1: ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2: ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3: ");
            word3 = dataIn.readLine();
            
        }
        catch ( IOException e){
            System.out.println("Error!");
        }
        System.out.println (word1 +" "+ word2 +" "+ word3);

    }
    
}
