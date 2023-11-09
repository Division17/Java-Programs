import java.util.Arrays;

public class Cyclesort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(cycle(arr)));
    }
    static int [] cycle(int [] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (i != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }
    static void swap(int [] arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
