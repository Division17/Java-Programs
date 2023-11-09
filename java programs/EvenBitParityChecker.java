import java.util.Scanner;

public class EvenBitParityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();


            if (hasEvenParity(binaryNumber)) {
                System.out.println("The binary number has odd bit parity.");
            } else {
                System.out.println("The binary number does not have odd bit parity, but the correction is:-"+"\n"+"hello");
                binaryNumber+="1";
                System.out.println(binaryNumber);
            }
        scanner.close();
    }


    public static boolean hasEvenParity(String binaryNumber) {
        int countOnes = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                countOnes++;
            }
        }

        return countOnes % 2 != 0;
    }
}
