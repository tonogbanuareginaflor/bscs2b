9.6 Exercises

9.6.1 Defining terms 

In your own words, define the following terms: 
1. Class - a "blueprint" for creating objects
2. Object - a combination of data and procedures working on available data
3. Instantiate - creating an object within a class
4. Instance Variable - used by objects to store their state (behavioral design pattern)
5. Instance Method - non-static method declared inside a class
6. Class Variable or static member variables - defines a specific attribute/property for a class 
7. Constructor - a special method used to initialize newly created objects 

9.6.2 Java Scavenger Hunt

1. Look for a method that checks if a certain String ends with a certain suffix. For
example, if the given string is "Hello", the method should return true the suffix given
is "lo", and false if the given suffix is "alp".

-> public boolean endsWith(String suffix)

Sample Usage:

String StrVal = "seiso"
System.out.println(StrVal.endsWith("iso"));

//output value is true

2. Look for the method that determines the character representation for a specific digit
in the specified radix. For example, if the input digit is 15, and the radix is 16, the
method would return the character F, since F is the hexadecimal representation for
the number 15 (base 10)

-> public static char forDigit(int digit, int radix) 

Sample Usage:

char CharVal = Character.forDigit(15,16);
System.out.print(CharVal);
//output is false

3. Look for the method that terminates the currently running Java Virtual Machine

-> public static void exit(int status)

Sample Usage: 

System.exit(0);
//program exits 

4. Look for the method that gets the floor of a double value. For example, if I input a
3.13, the method should return the value 3.

-> public static double floor(double a)

Sample Usage: 

double floorVal = Math.floor(3.13);
System.out.println(floorVal);
//output is 3.

5. Look for the method that determines if a certain character is a digit. For example, if I
input '3', it returns the value true.

-> public static boolean isDigit(char ch)

Sample Usage: 

boolean digitVal = Character.isDigit('3')
System.out.println(digitVal);
//output is true

