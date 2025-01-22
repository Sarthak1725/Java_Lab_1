// Name: Sarthak patil
// PRN: 23070126088
// Batch: 
// Program: Calculator with Fibonacci, Mean, and Variance


import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        Calculator calculator = new Calculator();
        int choice;

        do {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Mean of Array");
            System.out.println("7. Variance of Array");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(calculator);
                    break;
                case 2:
                    performSubtraction(calculator);
                    break;
                case 3:
                    performMultiplication(calculator);
                    break;
                case 4:
                    performDivision(calculator);
                    break;
                case 5:
                    performFibonacci(calculator);
                    break;
                case 6:
                    performMean(calculator);
                    break;
                case 7:
                    performVariance(calculator);
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);
    }

    private void performAddition(Calculator calculator) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.add(num1, num2));
    }

    private void performSubtraction(Calculator calculator) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.subtract(num1, num2));
    }

    private void performMultiplication(Calculator calculator) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.multiply(num1, num2));
    }

    private void performDivision(Calculator calculator) {
        System.out.print("Enter numerator: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.divide(num1, num2));
    }

    private void performFibonacci(Calculator calculator) {
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        System.out.println("Fibonacci Sequence: " + calculator.fibonacci(terms));
    }

    private void performMean(Calculator calculator) {
        double[] array = inputArray();
        System.out.println("Mean: " + calculator.mean(array));
    }

    private void performVariance(Calculator calculator) {
        double[] array = inputArray();
        System.out.println("Variance: " + calculator.variance(array));
    }

    private double[] inputArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
