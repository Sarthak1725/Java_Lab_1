import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    // function for addition 
    public static void addition() {
        System.out.print("Enter two numbers to add: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
    }

    //function for  Subtraction
    public static void subtraction() {
        System.out.print("Enter two numbers to subtract: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Difference: " + (num1 - num2));
    }

    //  function for Multiplication
    public static void multiplication() {
        System.out.print("Enter two numbers to multiply: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Product: " + (num1 * num2));
    }

    //  function for Division
    public static void division() {
        System.out.print("Enter two numbers to divide: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 != 0)
            System.out.println("Quotient: " + (num1 / num2));
        else
            System.out.println("Error: Division by zero is not allowed!");
    }

    
    // Helper: Input Array
    private static double[] getArrayInput(int size) {
        double[] array = new double[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    // Helper: Calculate Mean
    private static double calculateMean(double[] array) {
        double sum = 0;
        for (double num : array)
            sum += num;
        return sum / array.length;
    }
}