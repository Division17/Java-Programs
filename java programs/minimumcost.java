import java.util.*;
public class minimumcost {
    public static void main(String[] args) {
        int [] nums ={1,2,1,2,1,3,3};
        int k=2;
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        ArrayList <Integer> list= new ArrayList <Integer>(2);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
            }

        }
        System.out.println(k+list.size());

    }
}
