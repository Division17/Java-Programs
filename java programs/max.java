
import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int [] arr={9,8,7,5,4,2};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
    
}
