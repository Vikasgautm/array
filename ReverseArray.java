public class ReverseArray {
    static void reverse(int n[]) {
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]);
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 8, 5 };
        reverse(n);
    }
}
