

public class practiceBSq {
    public static void main(String[] args) {
        int [] arr ={2,3,6,9,14,16,18};
        int target=15;
        int ans=floor(arr,target);
         System.out.println(ans);
}

  static int floor(int[] arr1, int element){

         int start=0;
         int end=arr1.length-1;

         while(end>=start){
            int mid=start+(end-start) /2;
           
            if(element>arr1[mid]){
                start=mid+1;
            }
            else if(element<arr1[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }




         }
  

return end;
}

}
