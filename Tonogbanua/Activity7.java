/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity7;

import java.util.List; 
import java.util.ArrayList; 

/*
 *
 * @author Regina Flor
 */
class Activity7 {


    public static void main(String[] args) 
    {
        List<Integer> alist = new ArrayList<>(); 

        alist.add(02); 

        alist.add(12); 

        alist.add(110); 

        alist.add(35); 

  

        Object[] objects = alist.toArray(); 

  

        // Printing array of objects 

        for (Object obj : objects) 

            System.out.print(obj + " ");
        
        // TODO code application logic here
    }
    
}
