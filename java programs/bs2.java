import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
       int [] numbers ={2,7,11,15} ;
       int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
  static int[] twoSum(int[] numbers, int target) {
        int start=1;
        int  end= numbers.length-1;
        while(end>start){
            int mid=start+(end-start)/2;
            if(numbers[mid]>target){
                end=mid-1;
            }
            else if(numbers[start]+numbers[mid]==target && start <mid){
                return new int[]{start,mid};
            }
                else{
                    start=start+1;
            }
        }


        return new int[]{-1,-1};  }
}
