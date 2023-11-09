 public class BinarySearch {
     public static void main(String[] args) {
         int [] num={0,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99};
         int target=77;
         System.out.println(binarySearch(num,target));
     }
     static int binarySearch(int [] arr, int element){
        int start=0;
        int end=arr.length-1;
        while(end>=start) {
            int mid = start + (end - start) / 2;
            if (element > arr[mid]) {
                start = mid + 1;
            } else if (element < arr[mid]) {
                end = mid - 1;

            } else {
                    return mid;
            }

        }
         return -1;
     }
}