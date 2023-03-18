public class FindFirstLastIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7 };
        int search = 5;

        int low = 0;
        int high = arr.length - 1;
        int f = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else {

                f = mid;
                high = mid - 1;
            }

        }
        if (f == -1) {
            System.out.println("not found 1st element");
        } else
            System.out.print(f + " ");
        int l = 0;
        int h = arr.length - 1;
        int s = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (search > arr[mid]) {
                l = mid + 1;
            } else if (search < arr[mid]) {
                h = mid - 1;
            } else {

                s = mid;
                l = mid + 1;
            }

        }
        if (s == -1) {
            System.out.println("not found");
        } else
            System.out.println(s);

    }
}
