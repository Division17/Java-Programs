import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the star matrix:-");

         int s= in.nextInt();
//________________________________________________________________________________________________

         //pattern 1:-
//        for(int i=0;i<s;i++){
//            for(int j=0;j<s;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//           output of above ------------------
//              * * * * * *
//              * * * * * *
//              * * * * * *
//              * * * * * *
//              * * * * * *
//              * * * * * *

//___________________________________________________________________________________________________
             //  pattern 2:
//      for (int i=0;i<s;i++){
//           for (int j=0;j<=i;j++){
//               System.out.print("* ");
//           }
//          System.out.println();
//      }
//        output of above:-----------------------------
//                Enter the size of the star matrix:-5
//                *
//                * *
//                * * *
//                * * * *
//                * * * * *

//_______________________________________________________________________________________________________

              // pattern 3:-

//        for (int i=0;i<s;i++){
//         for (int j=0;j<=i;j++){
//              System.out.print(j+1+" ");
//         }
//        System.out.println();
//     }
//        output of above:-----------------------------
//                Enter the size of the star matrix:-5
//                 1
//                 1 2
//                 1 2 3
//                 1 2 3 4
//                 1 2 3 4 5

//_____________________________________________________________________________________________________

               // pattern 4

//        for (int i=0;i<s;i++){
//         for (int j=5-i;j>0;j--){
//              System.out.print(j+" ");
//         }
//        System.out.println();
//     }

//        output of above:-----------------------------
//                Enter the size of the star matrix:- 5
//                 5 4 3 2 1
//                 4 3 2 1
//                 3 2 1
//                 2 1
//                 1
//
//__________________________________________________________________________________

             //   pattern 5

//        for (int i=1;i<=s;i++){
//         for (int j=1;j<=i;j++){
//              System.out.print(i+" ");
//         }
//        System.out.println();
//     }

//        output of above:-----------------------------
//                Enter the size of the star matrix:-5
//                  1
//                  2 2
//                  3 3 3
//                  4 4 4 4
//                  5 5 5 5 5

//___________________________________________________________________________________________________

             // pattern 6

//        for (int i=0;i<s;i++){
//         for (int j=5-i;j>0;j--){
//             System.out.print("* ");
//         }
//         System.out.println();
//      }
//        output of above:-----------------------------
//              Enter the size of the star matrix:-5
//                * * * * *
//                * * * *
//                * * *
//                * *
//                *
//_________________________________________________________________________________________________________
//   pattern 7

//        for (int i=1;i<=s;i++){
//
//         for (int j=i;j<s;j++){
//             System.out.print("  ");
//         }
//          for(int y=1;y<=2*i-1;y++){
//              System.out.print("* ");
//      }
//
//         System.out.println();
//      }
//
//        output of above:-----------------------------
//               Enter the size of the star matrix:-5
//                    *
//                  * * *
//                * * * * *
//             * * * * * * *
//           * * * * * * * * *
//
//
//____________________________________________________________________________________________________________
//
//            pattern:- 8
//
//        for (int i=1;i<=s;i++){
//
//         for (int j=i;j>1;j--){
//             System.out.print("  ");
//         }
//          for(int y=2*(s-i)+1;y>0;y--){
//              System.out.print("* ");
//      }
//
//         System.out.println();
//      }
//
//        output of above:-----------------------------
//        Enter the size of the star matrix:-5
//                * * * * * * * * *
//                 * * * * * * *
//                   * * * * *
//                     * * *
//                       *
//
//__________________________________________________________________________________________________________

//      pattern : 9
//
//        for (int i=1;i<=s;i++){
//
//         for (int j=i;j<s;j++){
//             System.out.print("  ");
//         }
//          for(int y=1;y<=2*i-1;y++){
//              System.out.print("* ");
//      }
//
//         System.out.println();
//      }
//
//            for (int a=1;a<=s;a++){
//
//         for (int b=a;b>1;b--){
//             System.out.print("  ");
//         }
//          for(int c=2*(s-a)+1;c>0;c--){
//              System.out.print("* ");
//      }
//
//         System.out.println();
//      }
//
//        output of above:-----------------------------
//                Enter the size of the star matrix:- 5
//                                *
//                              * * *
//                            * * * * *
//                          * * * * * * *
//                        * * * * * * * * *
//                        * * * * * * * * *
//                          * * * * * * *
//                            * * * * *
//                              * * *
//                                *
//
//______________________________________________________________________________________________________________________
//
//     //   pattern:- 10
//
//      for(int i=0; i<=s;i++) {
//
//          for (int j = 0; j < i; j++) {
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//
//        for(int q=1; q<s;q++) {
//
//            for (int t =s-q; t>0; t--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        output of above:-----------------------------
//        Enter the size of the star matrix:-5
//
//                   *
//                   **
//                   ***
//                   ****
//                   *****
//                   ****
//                   ***
//                   **
//                   *
//
//________________________________________________________________________________________________________________________

//       pattern: 11
//         for(int i=0;i<s;i++){
//             for(int j=0;j<=i;j++){
//                 if((i+j)%2!=0){
//                 System.out.print("0");
//                 }
//                 else {
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();
//         }
//
//               output of above:-----------------------------
//               Enter the size of the star matrix:-5
//                         1
//                         01
//                         101
//                         0101
//                         10101
//_____________________________________________________________________________________________________________________

//    pattern : 12
//
//     for(int i=1;i<s;i++)
//     {
//         for(int j=1;j<=i;j++){
//             System.out.print(j);
//         }
//         for(int h=s-i;h>1;h--){
//             System.out.print(" ");
//         }
//         for(int l=s-i;l>1;l--){
//             System.out.print(" ");
//         }
//         for(int k=i;k>=1;k--){
//             System.out.print(k);
//         }
//         System.out.println();
//     }
//
//             output of the above:------------------------------------
//                Enter the size of the star matrix:-5
//                          1      1
//                          12    21
//                          123  321
//                          12344321
//
//_____________________________________________________________________________________________________________________

// pattern 13

//        int ss=1;
//        for (int i=0;i<s;i++){
//           for (int j=0;j<=i;j++){
//               System.out.print(ss+" ");
//               ss=ss+1;
//           }
//          System.out.println();
//      }
//
//       output of the above:-_____________________________________________
//        Enter the size of the star matrix:-5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//
//__________________________________________________________________________________________________________________________________

 // pattern 14
//
//
//        for (char i=65;i<s+65;i++){
//           for (char j=65;j<=i;j++){
//
//               System.out.print( j+" ");
//
//           }
//          System.out.println();
//      }
////   output of the above pattern:----------------------------------------------
//        Enter the size of the star matrix:-5
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//
//_______________________________________________________________________________________________________________________________

// pattern:- 15
//
//
//        for (char i=1;i<=s;i++){
//
//           for (char j=65;j<=(65+s)-i;j++){
//
//               System.out.print( j+" ");
//
//           }
//          System.out.println();
//      }
//
//          output of the above:-_________________________________________
//
//        Enter the size of the star matrix:-5
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
//
//_____________________________________________________________________________________________________________________________________

// pattern 16
//
//        for (char i=65;i<s+65;i++){
//           for (char j=65;j<=i;j++){
//
//               System.out.print( i+" ");
//
//           }
//          System.out.println();
//      }
//        output of the above:- __________________________________________________________
//        Enter the size of the star matrix:-5
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//
//________________________________________________________________________________________________________________________________

        //  pattern:- 17
//
//        for(int i=0;i<=(s);i++){
//            for(int j=s;j>i;j--){
//                System.out.print(" ");
//            }
//            char m= 'A';
//            int breakpoint=(2*i+1)/2;
//            for(int c=1;c<2*i;c++){
//                System.out.print(m);
//                if(c<breakpoint){
//                    m++;
//                }
//                else{
//                    m--;
//                }
//            }
//            System.out.println();
//        }
//
//              output of the above:------------------------------
//                Enter the size of the patter:-4
//
//                          A
//                         ABA
//                        ABCBA
//                       ABCDCBA
//
////______________________________________________________________________________________________________________________
////
////  pattern:- 18
//
//         for(int i=0;i<=s;i++){
//             int a= 65+s;
//             for(int j=1;j<=i;j++){
//
//                 char b= (char) (a-j);
//                 System.out.print(b);
//
//             }
//
//
//             System.out.println();
//         }
//          output of the above
//                           Enter the size of the star matrix:-5
//
//                                         E
//                                         ED
//                                         EDC
//                                         EDCB
//                                         EDCBA
//
// _______________________________________________________________________________________________________________________
//
        
//    Pattern 19:*

//        for(int i=0;i<s;i++){
//            for (int j=s-i;j>0;j--){
//                System.out.print("*");
//            }
//                    for (int ss=2*i;ss>0;ss--){
//                        System.out.print(" ");
//                    }
//            for (int k=s-i;k>0;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int ii=0;ii<s;ii++){
//            for (int jj=0;jj<=ii;jj++){
//                System.out.print("*");
//            }
//            for (int sss=(s-ii-1)*2;sss>0;sss--){
//                System.out.print(" ");
//            }
//            for (int kk=0;kk<=ii;kk++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//        output of the above:- __________________________________________________________
//        Enter the size of the star matrix:-5
//                **********
//                ****  ****
//                ***    ***
//                **      **
//                *        *
//                *        *
//                **      **
//                ***    ***
//                ****  ****
//                **********

//______________________________________________________________________________________________________________________

// pattern 20
//
//        for(int ii=0;ii<s;ii++){
//            for (int jj=0;jj<=ii;jj++){
//                System.out.print("*");
//            }
//            for (int sss=(s-ii-1)*2;sss>0;sss--){
//                System.out.print(" ");
//            }
//            for (int kk=0;kk<=ii;kk++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//
//
//
//        for(int i=1;i<s;i++){
//            for (int j=s-i;j>0;j--){
//                System.out.print("*");
//            }
//            for (int ss=2*i;ss>0;ss--){
//                System.out.print(" ");
//            }
//            for (int k=s-i;k>0;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//                output of the above:--_________________________________________________________
//
//
//        Enter the size of the star matrix:
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
//
//_________________________________________________________________________________________________________________________
//
// pattern 21:

//
//        for (int i=1;i<=s;i++)
//        {
//            for(int j=1;j<=s;j++){
//            if (i==1||i==s||j==1||j==s){
//                    System.out.print("*");
//                }
//
//                else{
//                System.out.print(" ");
//            }
//            }
//
//
//
//
//            System.out.println();
//        }
//
//
//        output of the above:--- _____________________________________________________________________
//
//        Enter the size of the star matrix:-10
//**********
//*        *
//*        *
//*        *
//*        *
//*        *
//*        *
//*        *
//*        *
//**********
//
//________________________________________________________________________________________________________________________


    //   Pattern:- 22
//
//        for(int i=0;i<s*2-1;i++){
//
//
//                for(int j=0;j<s*2-1;j++){
//
//                    int top = i;
//                    int bottom =j;
//                    int right=(2*s-2)-j;
//                    int left=(2*s-2)- i ;
//
//                    System.out.print(s-Math.min(Math.min(top,bottom),Math.min(left,right)));
//            }
//            System.out.println();
//        }
//
//
//            output of the above:- _________________________________________________________________________
//
//        Enter the size of the star matrix:- 5
//        555555555
//        544444445
//        543333345
//        543222345
//        543212345
//        543222345
//        543333345
//        544444445
//        555555555
//
//
//_________________________________________________________________________________________________________________________________

    }

}