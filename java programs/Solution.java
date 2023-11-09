import java.util.Arrays;

public class Solution {
     public static void main(String[] args) {

     }
    public int[] searchRange(int[] arr, int target) {

        int [] arr1={-1,-1};
        arr1[0]= search(arr,target,true);
        if(arr1[0]!=-1)
        {
            arr1[1]=search(arr, target,false);
        }
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }

    int search( int [] arr, int target, boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end=arr.length-1;
        while(start<=end){
            int  mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;  }
        

}
