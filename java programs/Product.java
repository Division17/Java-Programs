public class Product {
    public static void main(String[] args) {
        System.out.println(product(123469874));
    }
    static long product(long  n){
        if(n%10==n){
            return n;
        }
        return n%10* product(n/10);

    }
}
