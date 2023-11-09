public class FibonacciR {
    public static void main(String[] args){
    System.out.println(fibonacc(7));   
    }
   
  static int fibonacc(int a){
    if(a<2){ 
        return a;
    }
    
     return fibonacc(a-1)+fibonacc(a-2);
       }

}

