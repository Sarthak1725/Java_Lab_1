import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    // Function to get a single integer input from the user
    public int getNumberInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to get a double input from the user
    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to get an array of integers from the user
    public int[] getArrayInput(String prompt, int size) {
        System.out.println(prompt);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Function to get an array of doubles from the user
    public double[] getDoubleArrayInput(String prompt, int size) {
        System.out.println(prompt);
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
