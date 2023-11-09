import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//      int [] arr= new int[10];
//      for(int i=0; i<10;i++)
//      {    arr[i]=in.nextInt();       }
//
//     for(int num: arr){

//         System.out.print(num);
//      }


        int[][] arr2D = new int[3][3];
        System.out.print("Enter the elements:-");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }
//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D[i].length; j++) {
//                System.out.print(arr2D[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr2D.length; i++) {
//            System.out.println(Arrays.toString(arr2D[i]));
//        }
    for( int[] a:arr2D){
        System.out.println(Arrays.toString(a));

    }
    }
}