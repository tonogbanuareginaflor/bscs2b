# MARK VINCENT ATINON - BSCS 2B AI
# 9.6 Exercises -- OOP ACTIVITY 8
9.6.1 - Defining Terms
1. class is like a blueprint of a program
2.object is like a blueprint for creating a blueprint 
3.instantiate is like a process of create a keyword of an objecy from a class.
4.Instance Variable is a non static variable because they are created separately.
5. Instance Method - are non static method because theya re created separately.
6. Class Variables or static member variable - are variables that are static and belong to the class itself.
7. Constructor - are functions that is being called when the class is being executed.

# 9.6.2 Java Scavenger Hunt - 

### 1. Look for a method that checks if a certain String ends with a certain suffix. For
example, if the given string is "Hello", the method should return true the suffix given
is "lo", and false if the given suffix is "alp"

boolean public static endsWith()
Sample Usage :

String VarStr = "Hello"

System.out.println(VarStr.endsWith("lo"));
//output value is true
System.out.println(VarStr.endsWith("ple"));
//ouput val is false

### 2. Look for the method that determines the character representation for a specific digit
in the specified radix. For example, if the input digit is 15, and the radix is 16, the
method would return the character F, since F is the hexadecimal representation for
the number 15 (base 10)

 public static char forDigit(int digit, int radix)  

Sample Usage :
char valChar= Character.forDigit(15,16);
System.out.print(valChar);
//output is false

### 3. Look for the method that terminates the currently running Java Virtual Machine

 public static void exit(int status)

Sample Usage :

System.exit(0);
//exits the program silently


### 4. Look for the method that gets the floor of a double value. For example, if I input a
3.13, the method should return the value 3.

 public static double floor(double a)

double myVal = Math.floor(3.13);
System.out.println(myVal);
//output is 3.


### 5. Look for the method that determines if a certain character is a digit. For example, if I
input '3', it returns the value true.

public static boolean isDigit(char ch)

Sample Usage :

boolean valDigit = Character.isDigit('3')
System.out.println(valDigit);
//output is true
