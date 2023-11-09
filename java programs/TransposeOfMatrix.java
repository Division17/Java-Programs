public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int x = 0; x < 3; x++) {
            for (int j = 0; j <3; j++) {
                System.out.print(mat[x][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                  int temp= mat[i][j];
                  mat[i][j]=mat[j][i];
                  mat[j][i]=temp;
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int j = 0; j <3; j++) {
                System.out.print(mat[x][j]+" ");
            }
            System.out.println();
        }


    }
}

