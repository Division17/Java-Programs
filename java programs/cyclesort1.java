import java.util.Arrays;

public class q268{
    public static void main(String[] args) {
     int [] arr={0,5,1,2,3};
     System.out.println(cyclesort(arr));
    }

    static int  cyclesort(int [] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length&& i!= nums[i]){
                swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
   
        return nums.length;
    }

    static void swap(int [] arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}