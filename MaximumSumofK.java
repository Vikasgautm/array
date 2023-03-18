public class MaximumSumofK {
    public static void main(String[] args) {
        int a[] = { 1, 40, 30, 10, 20, 5 };
        int k = 3;
        int max = Integer.MIN_VALUE;
        // ArrayList<Integer> list = new ArrayList<>();
        // int b[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            if (i <= a.length - k) {
                for (int j = i; j < k + i; j++) {
                    sum = sum + a[j];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);

    }
}
