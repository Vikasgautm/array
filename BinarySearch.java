public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 11, 13, 14 };
        int search = 11;
        int l = 0, mid = 0;
        int high = a.length;
        while (l < high) {
            mid = (l + high) / 2;
            if (a[mid] == search) {
                System.out.println(" your search element index= " + mid);
                break;
            } else if (search > a[mid]) {
                l = l + mid;
            } else if (search < a[mid]) {
                high = high - mid;
            }
        }
        while (l > high) {
            System.out.println("not found element");
        }
    }
}
