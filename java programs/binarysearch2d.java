import java.util.Arrays;

public class binarysearch2d {
    public static void main(String[] args) {
        int [][] array ={
                {10,20,30,40}, {15,25,35,45},{28,29,37,49},{33,34,38,50} };
        int target= 37;
        System.out.println(Arrays.toString(search(array,target  )));
    }

    static int[] search(int[][] max, int element)
    {
      int r=0;
      int c=max.length-1;

      while(r<max.length && c>=0){

          if( max[r][c]==element) {
          return new int[]{r,c};
          }

          if(element>max[r][c]) {
          r++;
          }
          else {
          c--;
          }
          }





       return new int[]{-1,-1};
    }
}
