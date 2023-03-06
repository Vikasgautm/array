public class RainTrapping {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 1, 2 };
        int n = arr.length;
        int pmax[] = new int[n];
        int smax[] = new int[n];
        pmax[0] = arr[0];
        smax[n - 1] = arr[n - 1];
        int total = 0;
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            smax[i] = Math.max(smax[i + 1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int left = pmax[i];
            int right = smax[i];
            int min = Math.min(left, right);
            if (min > current) {
                total += min - current;
            }
        }
        System.out.println(" total water trapping are ..  = " + total);

    }
}
