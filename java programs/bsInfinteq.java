
      public class bsInfinteq {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,111,222,333,444,555,666,777,888,999};
            int element = 777;
            System.out.println(ans(arr,element));

        }

        static int ans(int []arr1, int element1){
            int start=0;
            int end=1;
            while(element1>arr1[end]){
                int temp = end+1;
                end=end+(end-start+1);
                start=temp;
            }


            return bsinfinte(arr1, element1, start, end);
        }


        static int bsinfinte(int[] nums, int target, int start, int end){
            while(end>=start){
                int mid= start + (end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }
                else if( target>nums[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }

            return -1;
        }
    }


