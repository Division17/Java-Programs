
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
       int [] arr={0,2,1,5,3,4};
       int [] arr1= new int[arr.length];  
       for(int i=0;i<arr.length;i++){
        arr1[i]=arr[arr[i]] ;
       }
       
        System.out.print(Arrays.toString(arr1));
       }
    }

