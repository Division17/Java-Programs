import java.util.Scanner;

import static java.lang.System.exit;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        do {
            System.out.println("Enter the numbers you want to so calculation with:- ");
            int a= in.nextInt();
            int b= in.nextInt();

            System.out.println("Enter 1: For Addition");
            System.out.println("Enter 2: For Subtract");
            System.out.println("Enter 3: For Multiplication");
            System.out.println("Enter 4: For quotient");
            System.out.println("Enter 5: For Remainder");
            System.out.println("Enter greater than 5: To exit");
            System.out.println("Enter the choice");
            c= in.nextInt();

            switch (c){

                case 1-> System.out.print("Sum ="+ (a+b));
                case 2-> System.out.print("Difference ="+(a-b));
                case 3-> System.out.print("Product="+ (a*b));
                case 4->System.out.print("Quotient="+ (a/b));
                case 5-> System.out.print("Remainder ="+ (a%b));
                default -> System.out.println("Enter a correct option");





            }
            System.out.println();
        }while(c<=5);

    }
}
