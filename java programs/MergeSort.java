import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,5,7,1,3,4,8};
        arr=sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sorting(int[] arr) {
   if(arr.length==1){
       return arr;
   }
    int l=arr.length;

   if(l%2!=0){
        l=l+1;
   }
    int mid = l/2;
     int[] left= Arrays.copyOfRange(arr,0,mid);
     int[] right = Arrays.copyOfRange(arr,mid,arr.length);

   left = sorting(left);
    right=sorting(right);
  return( merge(left, right));
    }


   private static int[] merge(int[] first, int[] second){
        int[] mix=new int[first.length + second.length];
        int k=0;
        int i=0;
        int j=0;

        while(i< first.length && j< second.length){
              if(first[i]<second[j]){
                  mix[k]=first[i];
                  i++;
                  k++;
              }
              else {
                  mix[k] = second[j];
                  j++;
                  k++;
              }
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
