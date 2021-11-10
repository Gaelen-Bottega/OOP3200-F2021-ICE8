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

        // Multi-Dimensional Array

        System.out.println("Multi-Dimensional Array example");
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values: ");

        for (int i = 0; i < 10; i++) {
            var randRows = (int)(Math.random() * rows);
            var randCols = (int)(Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }
    }
}
