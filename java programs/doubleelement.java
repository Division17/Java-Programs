
public class doubleelement {
public static void main(String[] args) {
    int [] arr ={-1,3,2,0};
    System.out.println(findDuplicate(arr));
}
     static boolean findDuplicate(int[] nums) {
   
       
      for(int i=0;i<nums.length-3;i++){
       
        if(nums[i]<nums[i+1]&& nums[i]<nums[i+2]){
          if(nums[i+2]<nums[i+1]){
           
            return true; 
             }     }
    }
      
        return false;
    }
}




