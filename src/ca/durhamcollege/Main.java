package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Declarations
        String name = null;
        float age = 0.0f;
        boolean isValidInput = false; // Sentinel Value

        // Name output and input
        // No input validation needed because names can have integers, thanks elon!
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        do
        {
            System.out.print("Please enter your age: ");

            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if ((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a floating point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while (!isValidInput);


        // Print results
        System.out.printf("%s\n", name);
        System.out.printf("%.1f\n", age);


    }
}
