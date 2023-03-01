public class SortZeroOne {
    public static void main(String[] args) {
        int n[] = { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1 };
        int i = 0;
        int j = n.length - 1;
        while (i < j) {
            int left = n[i];
            int right = n[j];
            if (left == 0) {
                i++;
            }
            if (right == 1) {
                j--;
            }
            if (left == 1 && right == 0) {
                n[i] = right;
                n[j] = left;
                i++;
                j--;
            }
        }
        for (int k = 0; k < n.length; k++) {
            System.out.print(n[k]);
        }

    }
}
