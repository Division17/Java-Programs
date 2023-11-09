public class NewtonRaptonSqM {
    public static void main(String[] args) {
        System.out.println(squareroot(60));
    }

    private static double squareroot(int i) {
        double root;
        double x=i;
        while(true){

            root=0.5*(x+(i/x));
           if(Math.abs(root-x)<0.05){
               break;
           }
            x=root;
        }

        return root;

    }
}
