import java.util.*;

	public class Activity7{

			 public int max(int [] array) {
			      int max = 0;

			      for(int i=0; i<array.length; i++ ) {
			         if(array[i]>max) {
			            max = array[i];
			         }
			      }
			    	return max;
			   }
			   
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
			Scanner nad = new Scanner(System.in);


			int[] array = new int[10];
		      System.out.println("Enter 10 Digits:");
		      for (int i=0; i<10; i++)
		      {
		    	  array[i] = nad.nextInt();
		      }
		    Activity7 in = new Activity7();
		         System.out.println("The Largest Element : "+ in.max(array));
		         System.out.println("The Smallest Element : "+ in.min(array));
   }
}