import java.util.ArrayList;

public class INdexes {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        int target=4;
        int index=0;
        System.out.println(indexex(arr,target,index));
    }

    private static ArrayList indexex(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= indexex(arr,target,index+1);
        list.addAll(ansFromBelow);

        return list;
    }
}
