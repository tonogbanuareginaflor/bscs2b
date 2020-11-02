
package activity.pkg3;


public class Activity3 {

 
    public static void main(String[] args) {
      int a = 10;
      int b = 23;
      int c = 5;
      int number = (a > b ? a : b) > c ? (a > b ? a : b) :c;
      
      
      System.out.println("Number 1 = "+a);
      System.out.println("Number 2 = "+b);
      System.out.println("Number 3 = "+c);
      System.out.println("The highest number is = "+number);
    }
    
}
