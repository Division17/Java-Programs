public class countOccurenceRec {
    public static void main(String[] args) {
        int count=0;
        int n=100000;
        System.out.println(counter(n,count));
    }

     static int counter(int n, int count) {
      if(n==0){
          return count;
      }
        if(n%10==0){
            return counter(n/10,++count);
        }
        return counter(n/10,count);
    }
}
