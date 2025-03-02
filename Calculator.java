// Calculator.java
import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    // Addition
    public static void addition() {
        System.out.print("Enter two numbers to add: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
    }

    // Subtraction
    public static void subtraction() {
        System.out.print("Enter two numbers to subtract: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Difference: " + (num1 - num2));
    }

    // Multiplication
    public static void multiplication() {
        System.out.print("Enter two numbers to multiply: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Product: " + (num1 * num2));
    }

    // Division
    public static void division() {
        System.out.print("Enter two numbers to divide: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 != 0)
            System.out.println("Quotient: " + (num1 / num2));
        else
            System.out.println("Division by zero is not allowed!");
    }

    // Fibonacci Sequence
    public static void fibonacci() {
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Mean of Array
    public static void meanOfArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        UserInput userInput = new UserInput();
        int[] array = userInput.getArrayInput("Enter array elements:", size);

        int sum = 0;
        for (int num : array) sum += num;
        System.out.println("Mean of array elements: " + (double) sum / size);
    }

    // Variance of Array
    public static void varianceOfArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        UserInput userInput = new UserInput();
        int[] array = userInput.getArrayInput("Enter array elements:", size);

        int sum = 0;
        for (int num : array) sum += num;
        double mean = (double) sum / size;

        double variance = 0;
        for (int num : array) variance += Math.pow(num - mean, 2);
        variance /= size;

        System.out.println("Variance of array elements: " + variance);
    }
}
