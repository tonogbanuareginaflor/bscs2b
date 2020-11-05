public class Activity3 {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 23;
        int number3 = 5;

        System.out.println("number 1 = "+ number1 +
                "\nnumber 2 = "+ number2 +
                "\nnumber 2 = "+ number3);

        if(number1 >= number2 && number1 >= number3)
            System.out.println("The Highest number is = " + number1);
        else if (number2 >= number1 && number2 >= number3)
            System.out.println("The Highest number is = " + number2);
        else
            System.out.println("The Highest number is = " + number3);

    }
}



