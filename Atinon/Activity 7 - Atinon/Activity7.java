import java.util.*;

	public class Activity7{

				// Getting Max Value of an Array
			 public int max(int [] array) {
			      int max = 0;

			      for(int i=0; i<array.length; i++ ) {
			         if(array[i]>max) {
			            max = array[i];
			         }
			      }
			    	return max;
			   }
			   // getting Min Value of an Array
			   public int min(int [] array) {
			      int min = array[0];

			      for(int i=0; i<array.length; i++ ) {
			         if(array[i]<min) {
			            min = array[i];
			         }
			      }
			      return min;
 			  }
		public static void main (String[] args){
			Scanner maku = new Scanner(System.in);

			// Getting Input from the user and storing it inside an array
			int[] array = new int[10];
		      System.out.println("Enter 10 Digits:");
		      for (int i=0; i<10; i++)
		      {
		    	  array[i] = maku.nextInt();
		      }
		    Activity7 in = new Activity7();
		         System.out.println("The Largest Element : "+ in.max(array));
		         System.out.println("The Smallest Element : "+ in.min(array));
   }
}