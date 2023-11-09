
    import java.util.*;
import java.lang.*;


    // Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
 class Adjacent0 {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here

            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int i = 0; i<t; i++){
                int n = in.nextInt();
                String num = Integer.toString(n);
                int x =1;
                for(int j =0; j<num.length();j++){
                    if(num.charAt(j)=='0' && num.charAt(j+1)=='0'){
                        System.out.println("Yes");
                        break;
                    }
                    else{
                        x+=1;
                    }
                }
                if(x==num.length()){
                    System.out.println("No");
                }

            }
        }
    }

