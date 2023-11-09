import java.util.Scanner;

public class FindIthbit {
    public static void main(String[] args) {
       int n=789;
        System.out.println(ithbit(n));
        System.out.println(ithbit(n));
        System.out.println(ithbit(n));
        System.out.println(ithbit(n));
    }
    static int  ithbit(int m){

           System.out.println("ith bit to be found");
           Scanner in = new Scanner(System.in);
           int b = in.nextInt();
           return m & (1 << (b - 1));


    }
}
