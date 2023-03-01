public class SortedArray {
    static boolean checksorted(int n[]) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++)
                if (n[i] > n[j])
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n[] = { 1, 3, 4, 5, 6, 7 };
        boolean sorted = checksorted(n);
        if (sorted) {
            System.out.println("array is sorted ");
        } else {
            System.out.println(" array is not sorted .. ");
        }

    }
}
