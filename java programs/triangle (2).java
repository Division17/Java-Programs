import java.io.PrintStream;

 class Pattern {
    public static void main(String[] args) {
        int r=5;
        int c=0;
    print(r,c);
    }
    static void print(int r, int c) {
     if(r==0){
         return;
     }
        if(c<r){
            System.out.print("* ");
            print(r,c+1);
        }
        else{
            System.out.println();
            print(r-1,0);
        }
    }
}
