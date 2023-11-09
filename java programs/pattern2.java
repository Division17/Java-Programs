import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the patter:-");
        int s= in.nextInt();

     for(int i=0;i<=(s);i++){
         for(int j=s;j>i;j--){
             System.out.print(" ");
         }
         char m= 'A';
         int breakpoint=(2*i+1)/2;
         for(int c=1;c<2*i;c++){
             System.out.print(m);
              if(c<breakpoint){
                  m++;
              }
              else{
                  m--;
              }
         }
         System.out.println();
     }



    }
}
