 class Solution {
    
     public int[] searchRange(int [] arr, int target){
     //   int [] arr = {5,7,7,8,8,10};
     //   int target=8;
        int [] check={-1,-1};
        check[0]=index(arr,target, true);
        if(check[0]!=-1){

            check[1]= index(arr,target, false);
        }
        
       return check;
}

  static int index(int [] nums, int element , boolean conf){
                int ans=-1;
                int start=0;
                int end=nums.length-1;
                while(start<=end)
                {
                    int mid=start+(end-start)/2;

                    if(element<nums[mid]){
                        end=mid-1;
                    }
                    else if(element>nums[mid]){
                        start=mid+1;
                    }

                    else{
                        ans=mid;
                        if(conf){
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
                    }
                }
       
    
    return ans;


  }




}