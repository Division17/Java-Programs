public class Main {
    public static void main(String[] args) {
        int [] arr={2,4,6,9,12,14,16,18};
        int target=15;
        System.out.println(floor(arr, target));

    }

    static int floor(int [] arr1 ,int element){
        int start=0;
        int end=arr1.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(element>arr1[mid]){
                start=mid+1;
            } else if (element<arr1[mid]) {
                end=mid-1;
            }
               else{
                   return mid;
            }
        }
        return end;
    }
}