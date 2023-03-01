public class BuyAndStock {
    static void stock(int arr[]) {
        int n = arr.length;
        int finalprofit = 0, profit = 0;
        int prefixMin[] = new int[n];
        prefixMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
        }
        for (int i = 1; i < n; i++) {
            finalprofit = arr[i] - prefixMin[i];
            profit = Math.max(finalprofit, profit);
        }
        System.out.println(profit);

    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        stock(arr);
    }
}
