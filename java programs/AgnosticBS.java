public class AgnosticBS {
    public static void main(String[] args) {
        int [] num={99,12,3,1,0};
        int target=12;
        System.out.println(binarySearch(num,target));
    }
    static int binarySearch(int [] arr, int element){
        int start=0;
        int end=arr.length-1;
        int mid = start + (end - start) / 2;
        boolean isAsec= arr[start]<arr[end];
        while(end>=start) {

            if(arr[mid]==element){
                return mid;
            }
            mid=start+(end-start)/2;
            if(isAsec) {
                if (element < arr[mid]) {
                    end = mid + 1;
                } else {
                 start=mid-1;
                }
            }

            else{
                    if (element > arr[mid]) {
                        end = mid + 1;
                    } else {
                        start=mid-1;
                    }

                }

        }
        return -1;
    }
}

