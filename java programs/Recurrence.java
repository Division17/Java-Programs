public class Recurrence {
    public static void main(String[] args) {
        numbers(10);
    }

    static void numbers(int n){
        if(n==0){
           return;
        }

        System.out.println(n);
         numbers(n-1);
        System.out.println(n);
    }
}
