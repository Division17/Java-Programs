import java.util.Scanner;

public class LRCEvenParityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Create a 2D array to store the data
        int[][] data = new int[numRows][numCols];

        // Read the data
        for (int i = 0; i < numRows; i++) {
            System.out.printf("Enter %d bits for row %d (0s and 1s only): ", numCols, i + 1);
            for (int j = 0; j < numCols; j++) {
                data[i][j] = scanner.nextInt();
            }
        }

        // Check even bit parity for each row
        boolean hasError = false;
        for (int i = 0; i < numRows; i++) {
            int parityBit = data[i][0]; // Initialize parity bit with the first bit in the row
            for (int j = 1; j < numCols; j++) {
                parityBit ^= data[i][j]; // Calculate parity bit by XORing with each bit in the row
            }

            if (parityBit != 0) {
                hasError = true;
                System.out.printf("Error in row %d%n", i + 1);
            }
        }

        if (!hasError) {
            System.out.println("No errors detected. Data is correct.");
        }

        scanner.close();
    }
}

