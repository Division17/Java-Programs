import java.util.*;
import java.lang.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Triangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr= new int[t][3];
        for(int i=0; i<t;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= in.nextInt();
            }
        }

        for(int i=0;i<t;i++){
            if((arr[i][0]+arr[i][1])>arr[i][2] && (arr[i][1]+arr[i][2])>arr[i][0] && (arr[i][0]+arr[i][2])>arr[i][1]){
                System.out.println((arr[i][0]+arr[i][1])+arr[i][2]);


            }
            else{
                System.out.println("-1");
            }
        }
    }
}