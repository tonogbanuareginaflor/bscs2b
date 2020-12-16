import java.util.*;

	public class Activity5{

		public static void main (String[] args){
			Scanner zead = new Scanner(System.in);
				System.out.println( "Please Enter The Number Of Rows : ");
						int rows = zead.nextInt();
							for(int i = 0;i < rows;i++){
								 for(int j=0; j < rows-i;j++){
									System.out.print(" ");
							         } for(int a = 0; a < i;a++){
										System.out.print("*");
							            } System.out.println();
							}
		}
	}