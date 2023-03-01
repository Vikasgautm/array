public class BarChart {
    static void bar(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i <= arr[j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 4, 5, 7, 6 };
        int n = arr.length;
        bar(arr, n);
    }
}
