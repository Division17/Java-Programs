public class LEET779 {
    public static void main(String[] args) {
        int N=2;
        int K=3;
        System.out.println(kthGrammar(N,K));
    }

    private static int kthGrammar(int N, int K) {
        String s ="0";
        return( kthG(N,K,s));
    }

    public static int kthG(int N, int K, String s) {
        String ss="";
        for(int i = 0;i<s.length();i++){
             if(s.charAt(i) == '0'){
                 ss+="01";
             }
             else{
                 ss+="10";
             }
        }
        if(N==1){
            return   Integer.parseInt(Character.toString(s.charAt(K-1)));
        }

            return kthG(N-1,K,ss);
    }

}
