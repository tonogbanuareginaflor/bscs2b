import java.util.*;

	public class Activity5{

		public static void main (String[] args){
			Scanner maku = new Scanner(System.in);

		System.out.println("******************************************" +"\n"+
							"* CODED BY : MARK VINCENT ATINON BSCS 2B *" +"\n"+
							"************ ACTIVITY 5 - LOOPS **********" +"\n"+
							"****** DIFFERENT SHAPES USING LOOPS ******" +"\n"+
							"*        SELECT FROM THE FOLLOWING:      *" +"\n"+
							"*      1  ---------------- RECTANGLE     *" +"\n"+
							"*      2  ---------------- LEFT TRIANGLE *" +"\n"+
							"*      3  --------------- RIGHT TRIANGLE *" +"\n"+
							"*      4  ----------------- TRIANGLE     *" +"\n"+
							"*      5  -------------- TRIANGLE NUMBER *" +"\n"+
							"*      6  ------------- TRIANGLE RNUMBER *" +"\n"+
							"******************************************\n");
		System.out.println("Please Enter The Number Of Your Choice : ");
							int user_in = maku.nextInt();

						switch (user_in){

						case 1 :
							System.out.println("You Have Selected Number 1:" +"\n"+ "Please Enter The Number Of Rows : ");
							int rows = maku.nextInt();
							   for(int j = 0; j< rows; j++){
									for(int i = 0; i < rows; i++)
									  System.out.print(" * ");
                						System.out.print("\n");
											} break;
                		case 2 :
							System.out.println("You Have Selected Number 2:" +"\n"+ "Please Enter The Number Of Rows : ");
							rows = maku.nextInt();
							 for(int i = 0; i < rows; i++) {
							      for(int j = 0; j < i; j++) {
							          System.out.print("* ");
							          } System.out.println();
								 			 } break;
						case 3 :
							System.out.println("You Have Selected Number 3:" +"\n"+ "Please Enter The Number Of Rows : ");
							rows = maku.nextInt();
							for(int i = 0;i < rows;i++){
								 for(int j=0; j < rows-i;j++){
									System.out.print(" ");
							         } for(int a = 0; a < i;a++){
										System.out.print("*");
							            } System.out.println();
											} break;
						case 4 :
							System.out.println("You Have Selected Number 4:" +"\n"+ "Please Enter The Number Of Rows : ");
							rows = maku.nextInt();
							 for (int i = 0; i < rows; i++) {
							      for (int j = 0; j < rows - i; j++){
							       System.out.print(" ");
							        }for (int k = 0; k < i; k++){
							          System.out.print("* ");
							            } System.out.println();
											} break;
						case 5 :
							System.out.println("You Have Selected Number 5:" +"\n"+ "Please Enter The Number Of Rows : ");
							rows = maku.nextInt();
								for (int i = 1; i <= rows; i++){
									for (int j = 1; j<= rows - i; j++){
									  System.out.print(" ");
									   } for (int j = 1; j <= i; j++){
									     System.out.print(i+" ");
											} System.out.println();
      										 } break;
						case 6 :
							System.out.println("You Have Selected Number 6:" +"\n"+ "Please Enter The Number Of Rows : ");
							rows = maku.nextInt();
      							for (int a = 1; a <= rows; a++){
								   for (int j = 1; j<= rows - a; j++){
									 System.out.print(" ");
									  } for (int k = a; k >= 1; k--){
									 	System.out.print(k);
										 } for (int c = 2; c <= a; c++){
											System.out.print(c);
 							    		      } System.out.println();
							            	}break;
		}
	}
}



