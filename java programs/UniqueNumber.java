class UniqueNumber{
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,1,3,4,5};
        System.out.println(Unique_or_not(arr));
    }

    private static int Unique_or_not(int[] arr) {
        int n=0;
         for (int i : arr){
            n^=i;
         }
        return n;
    }
}
