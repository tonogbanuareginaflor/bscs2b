package GreatestValue;

public class greatestValue {

  public static void main(String[] args) {

    int number1 = 10, number2 = 23, number3 = 5;

    int greatestValue =
        (number1 > number2 ? number1 : number2) > number3
            ? (number1 > number2 ? number1 : number2)
            : number3;

    System.out.println(
        "number 1 = "
            + number1
            + "\n"
            + "number 2 = "
            + number2
            + "\n"
            + "number 3 = "
            + number3
            + "\n"
            + "The highest number is = "
            + greatestValue);

   
  }
}
