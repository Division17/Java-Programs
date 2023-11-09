import java.sql.SQLOutput;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(5));
    }

    private static int sum(int i) {

        if(i==0){
            return 0;
        }

        return (  i*i+sum(i-1));
    }

}
