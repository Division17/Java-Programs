import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        int flag=0;
            int num = 10101010;

            while(num>0){
                int last = num&1;
                if(last == 0){
                    flag+=1;
                    if(flag == 2){
                        System.out.println("Yes");
                        break;
                    }
                }
                else{
                    flag=0;
                }
                num=num>>1;



        }
        if(flag<2){
            System.out.println("No");
        }
    }
}