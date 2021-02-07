public class activity6 {
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
        int[] numberset = {150,18,50,80,77,29,59,8,120,40};
        activity6 in = new activity6();
        System.out.println("Maximum value in the array is "+ in.max(numberset));
        System.out.println("Minimum value in the array is "+ in.min(numberset));
    }
}