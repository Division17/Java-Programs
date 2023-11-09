public class NewEvenOdd {
    public static void main(String[] args) {
        int n=34;
        System.out.println(evenORodd(n));
    }

  public static boolean evenORodd(int n){
    return (n&1)==1;
  }
}