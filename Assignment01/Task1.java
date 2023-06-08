package Assignment01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        }

        System.out.println("Result of: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);

        scanner.close();
    }
}
