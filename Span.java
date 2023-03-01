public class Span {
    static int spanAray(int arr[], int n) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, span;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        span = max - min;
        // System.out.println("span your array = " + span);
        return span;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 8, 3 };
        int n = arr.length;
        System.out.println("span value your aray " + spanAray(arr, n));

    }
}
