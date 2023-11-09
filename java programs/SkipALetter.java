public class SkipALetter {
    public static void main(String[] args) {
        String s = "bcaadghaaab";
        skip("", s);
    }

    static void skip(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
       char ch = s.charAt(0);

        if(ch=='a'){
            skip(p,s.substring(1));
        } else{
            skip(p+ch,s.substring(1));
        }
    }

}
