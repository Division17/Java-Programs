
import java.util.*;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int n = in.nextInt();

        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
               arr[i] = new int[i+1];
            }

        for(int i = 0; i<n;i++)
        {
            for(int j = 1; j<arr[i].length;j++){
                arr[i][j] = i+j;
            }
        }

        for(int[] i : arr){
            for(int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
            }
        }
        }




