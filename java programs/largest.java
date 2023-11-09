public class largest {
    public static void main(String[] args) {
        int [] numbs={8,15,10,20,8};
        int k=2;
        int start=0;
        int end=0;

        for (int j : numbs) {
            start = Math.max(start, j);

            end += j;
        }

        while(start<=end) {
            int count = 1;
            int sum = 0;
            int mid = start + (end - start) / 2;
            for (int num : numbs) {
                if (sum + num > mid) {
                    sum = num;
                    count++;
                } else {
                    sum += num;
                }
            }
                if (count > k) {
                    start = mid;
                } else {
                    end = mid;


                }



        }
        System.out.println(end) ;

    }

}