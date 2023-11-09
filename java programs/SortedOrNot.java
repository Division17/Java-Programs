public class SortedOrNot {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,67,7,8,9};
        int index=0;
        System.out.println(result(arr,index));
    }

   static boolean result(int[] arr, int index) {
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && result(arr,index+1);
    }

}
