public class Activity6_array {
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
   public static void main(String args[]) {
      int[] numberset = {100,20,30,50,60,79,90,1,110,80};
     Activity6_array maku = new Activity6_array();
      System.out.println("Maximum value in the array is::"+ maku.max(numberset));
      System.out.println("Minimum value in the array is::"+ maku.min(numberset));
   }
}