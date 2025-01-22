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

    //  function for Fibonacci Sequence
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

    //  function to calculate the Mean of Array
    public static void meanOfArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = getArrayInput(size);
        double sum = 0;
        for (double num : array)
            sum += num;
        System.out.println("Mean of array elements: " + (sum / size));
    }

    //  function to calculate the Variance of Array
    public static void varianceOfArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = getArrayInput(size);
        double mean = calculateMean(array);
        double variance = 0;
        for (double num : array)
            variance += Math.pow(num - mean, 2);
        System.out.println("Variance of array elements: " + (variance / size));
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