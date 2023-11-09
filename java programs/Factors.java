import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor1(40);
        factor2(60);
        factor3(80);

    }

      static void factor1(int i) {
        for(int j=1;j<=i;j++){
            if(i%j==0){
                System.out.print(j+" ");
            }
        }
          System.out.println();

      }


    static void factor2(int i) {
        for(int j=1;j<=Math.sqrt(i);j++){
            if(i%j==0){
                if(i%j==i/j){
                    System.out.print(" "+j + " ");
                }
                else {
                    System.out.print(j + " " + i/j+" ");
                }
            }
        }
        System.out.println();
    }

    static void factor3(int i) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=1;j<=Math.sqrt(i);j++){
            if(i%j==0){
                if(i%j==i/j){
                    System.out.print(" "+j + " ");
                }
                else {
                    System.out.print(j + " ");
                    list.add(i/j);
                }
            }
        }
        for(int n=list.size()-1;n>=0;n--)
        {
            System.out.print( list.get(n)+" ");
        }
        System.out.println();
    }

}
