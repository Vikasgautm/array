
public class SecondMax {
    static void checkSecondmax(int arr[], int n) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        // int max1 = arr[0], max2 = arr[0];
        for (int i = 0; i < n; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }
        System.out.println(max1);
        for (int i = 0; i < n; i++) {
            if (max1 != arr[i]) {
                if (max2 < arr[i])
                    max2 = arr[i];
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 6, 9, 7, 4 };
        int n = arr.length;
        checkSecondmax(arr, n);
    }
}
