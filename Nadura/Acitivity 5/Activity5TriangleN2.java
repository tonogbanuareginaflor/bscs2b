import java.util.*;

	public class Activity5{

		public static void main (String[] args){
			Scanner zead = new Scanner(System.in);
	System.out.println("Please Enter The Number Of Rows : ");
						int rows = zead.nextInt();
      							for (int a = 1; a <= rows; a++){
								   for (int j = 1; j<= rows - a; j++){
									 System.out.print(" ");
									  } for (int k = a; k >= 1; k--){
									 	System.out.print(k);
										 } for (int c = 2; c <= a; c++){
											System.out.print(c);
 							    		      } System.out.println();
	}
	}						            	}