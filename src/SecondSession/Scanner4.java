package SecondSession;
// SecondSession.Scanner3.java
/*
By Soleil Vivero
*/

import java.util.Scanner;
public class Scanner4 {
    public static void main(String[] args){
        String answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want some cheese?");
        answer = input.nextLine();

        if(answer.toLowerCase().equals("yes"))
            System.out.println("Cheese Gromit!");
        else if(answer.toLowerCase().equals("no"))
            System.out.println("Not even Wensleydale?");
        else
            System.out.println("I'm sorry, I don't understand you lad, speak up!");
    }
}
