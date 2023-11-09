import java.io.Serializable;

public class IfpowerOfTwo {
    public static void main(String[] args) {
        int n = 12;
        if (n >> (n - 1) == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}