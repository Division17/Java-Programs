import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int t = in.nextInt();
     switch (t) {
         case 1,2,3,4->System.out.println("Less than 5");

         case 5->System.out.println("Equal to five");


         case 6,7,8,9->System.out.println("More than 5");
         default -> System.out.println("Choose correct option");






     }
    }
}