package MiniExercise1;

import java.util.Random;
import java.util.Scanner;

public class MiniExercise1 {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1() {
        // Step 1: Ask the user how many elements they would like to create
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1: Enter the number of elements to create:");
        int numElements = scanner.nextInt();
        scanner.nextLine();

        // Step 2: Create an Object array with X elements
        Object[] array = new Object[numElements];

        // Step 3: Loop to ask the user for values
        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter a value for element " + (i + 1) + ":");
            String valueStr = scanner.nextLine();

            // Step 3a: Convert value to a Boolean if it's either 0 or 1
            if (valueStr.equals("0") || valueStr.equals("1")) {
                boolean value = Boolean.parseBoolean(valueStr);
                array[i] = value;
            } else {
                // Step 3b: Convert value to a byte if it's within the byte range
                int intValue = Integer.parseInt(valueStr);
                if (intValue >= Byte.MIN_VALUE && intValue <= Byte.MAX_VALUE) {
                    byte value = (byte) intValue;
                    array[i] = value;
                    // Step 3c: Convert value to a short if it's within the short range
                } else if (intValue >= Short.MIN_VALUE && intValue <= Short.MAX_VALUE) {
                    short value = (short) intValue;
                    array[i] = value;
                } else {
                    // Step 3d: Convert value to an integer if it's a number
                    array[i] = intValue;
                }
            }
        }

        // Print the final object array
        System.out.println("Array elements:");
        for (Object element : array) {
            System.out.println(element);
        }
    }


    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: a multidimensional array storing the values of the multiplicationTable
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Step 2: Ask the user how many questions they would like to answer
        System.out.println("\nTask 2: Enter the number of questions to answer:");
        int numQuestions = scanner.nextInt();
        scanner.nextLine();

        int numCorrect = 0;

        for (int q = 0; q < numQuestions; q++) {
            // Step 3a: Randomly select two indices from the multiplicationTable
            int i = random.nextInt(10);
            int j = random.nextInt(10);

            // Step 3b: ask the user to input the answer to the expression
            System.out.println("\nQuestion " + (q + 1) + ":");
            System.out.println("What is " + (i + 1) + " x " + (j + 1) + "?");

            int userAnswer = scanner.nextInt();
            scanner.nextLine();

            int correctAnswer = multiplicationTable[i][j];

            // Step 3c : Display a congrats message
            if (userAnswer == correctAnswer) {
                System.out.println("Congratulations! Your answer is correct.");
                numCorrect++;
            } else {
                // Step 3c: Display the correct answer if answer is incorrect
                System.out.println("Incorrect answer. The correct answer is " + correctAnswer + ".");
            }
        }

        // Step 4: Display a summary
        double percentage = (double) numCorrect / numQuestions * 100;
        System.out.printf("You answered %d out of %d. That's a percentage of %.0f%%\n", numCorrect, numQuestions, percentage);

        System.out.println("Thank you for answering all the questions correctly!");
    }
}
