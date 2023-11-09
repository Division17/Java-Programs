public class RaiseByPower {
    public static void main(String[] args) {
        int n=2;
        int power=6;
        int ans=0;
        while(n>0){
            int last=n>>1;
            n=n>>1;

            ans=ans+power;
            power=power*power;
        }
        System.out.println(ans);
    }
}
