package SecondSession;// SecondSession.Scanner3.java
/*
By Soleil Vivero
*/

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("What age are you?");
        age = input.nextInt();

        if(age < 18)
            System.out.println("You are prime meat for an ENFJ.");
        else
            System.out.println("You are too old!");
    }
}
