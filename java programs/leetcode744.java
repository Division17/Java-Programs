public class leetcode744{
    public static void main(String[] args) {
        char[] ch1={'c','f','j'};
        char element1='j';
        System.out.println(ch1[check(ch1, element1)]);
     

    }
    static int check(char[] ch, char element){
        int start=0;
        int end=ch.length;
        while(end>=start){
              int mid=(start+end)/2;
             if( element>ch[mid]){
                 start=mid+1;
             }
               else{
                   end=mid-1;
               }

        }
       return start % ch.length;
       
    }
}