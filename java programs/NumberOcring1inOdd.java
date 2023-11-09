public class NumberOcring1inOdd {

        public static void main(String[] args) {
            // Create an example array
            int[] arr = {2, 2, 3, 7, 7, 8, 7, 8, 8, 2};
            // Call the findSingle method to find the number that occurs once in the array
            int result = findSingle(arr);
            // Print the result to the console
            System.out.println(result);
        }

        public static int findSingle(int[] arr) {
            // Initialize variables to keep track of numbers that occur once and twice
            int ones = 0;
            int twos = 0;
            // Iterate over the elements in the array
            for (int i = 0; i < arr.length; i++) {
                // Update twos to include numbers that have occurred twice
                twos |= ones & arr[i];
                // Update ones to include numbers that have occurred once
                ones ^= arr[i];
                // Find numbers that have not occurred three times
                int not_threes = ~(ones & twos);
                // Update ones and twos to exclude numbers that have occurred three times
                ones &= not_threes;
                twos &= not_threes;
            }
            // Return the number that occurs once in the array
            return ones;
        }
        }
