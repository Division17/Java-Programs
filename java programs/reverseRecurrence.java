public class reverseRecurrence {
    public static void main(String[] args) {
        int n=987654321;
        int counter=1;
        int m=1;
        int j= (int)(Math.log(n)/Math.log(10));
        while(j>0){
            m=m*10;
            j--;
        }

        System.out.println( reverse(n,counter,m));
    }
    static int reverse(int n,int counter,int m){
        if(n%10==n){
            return n;
        }

        int reset=m/counter;
        counter=counter*10;
        return n%10*reset+reverse(n/10,counter,m);
    }
}
