

public class Pattern{
        public static void main(String[] args){
            int n=5;
            for(int rows=1;rows<=n;rows++){
                for(int spaces=n-1;spaces>=0+rows;spaces--){
                        System.out.print(" ");
                }
                for(int colsp=1;colsp<=rows;colsp++){
                    System.out.print(colsp);
                }
            System.out.println();
            }
        } 
}