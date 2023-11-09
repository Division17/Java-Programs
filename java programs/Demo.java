public class Demo {
   
        public static void main(String[] args) {
           int [] nums={ 1,2,3,4,5,6,7,8,9,0};
           int target=5;
           int ans=find(nums,target);
           System.out.println(ans);
   
          
        }
   
     static  int  find(int [] arr,int element){
                if(arr.length==0){
                   return -1;
                }
                 else{
                        for(int i=0;i<arr.length;i++){
                          if(arr[i]==element){
                           return i;
                          }
                        }
   
                 }  
         
      return 0;   
       
   }
    }

