public class SortOneTwo {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 1, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                } else
                    break;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
