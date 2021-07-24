package BasicCalculator;
// BasicCalculator.SimpleCalculator.java
/*
A calculator that asks the user which operation they want to do (addition, subtraction, multiplication, division,
modulo) and which two numbers they want to use. Once it has that, it performs the operation of those two numbers
and prints the result.
By Soleil Vivero
*/

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        String operator;
        int num1, num2, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("What operator do you want to use?");
        operator = input.nextLine();
        System.out.println("What is the first number of the operation?");
        num1 = input.nextInt();
        System.out.println("What is the second number of the operation?");
        num2 = input.nextInt();
        // TODO: incorporate a for-loop for checking whether the inputs for each question are valid

        // Removes all the spaces from the input string. "\\s" is a single space in unicode.
        operator = operator.replaceAll("\\s", "");

        if(operator.equals("+"))
            result = num1 + num2;
        else if(operator.equals("-"))
            result = num1 - num2;
        else if(operator.equals("*"))
            result = num1 * num2;
        else if(operator.equals("/"))
            result = num1 / num2;
        else if(operator.equals("%"))
            result = num1 % num2;
        else
            System.out.println("Invalid operator, please try again.");
            System.exit(0);
        System.out.println(result);
    }
}