package ca.durhamcollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Input declarations
        String name = null;
        float age = 0.0f;

        // Output to user statements
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        // Print results
        System.out.printf("%s\n", name);
        System.out.printf("%.1f", age);


    }
}
