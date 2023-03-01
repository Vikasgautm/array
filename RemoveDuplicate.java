public class RemoveDuplicate {
    static void duplicate(int n[]) {
        int a[] = new int[n.length];
        {
            int j = 0;
            for (int i = 0; i < n.length - 1; i++) {
                if (n[i] != n[i + 1]) {
                    a[j] = n[i];
                    j++;
                }
                a[j] = n[n.length - 1];
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                System.out.print("_");
            } else
                System.out.print(a[j]);
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 2, 3, 4, 4, 5, 6 };
        duplicate(n);
    }
}
