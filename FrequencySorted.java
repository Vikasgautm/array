public class FrequencySorted {
    static void frequency(int a[]) {
        int count = 0, curr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == curr) {
                count++;
            } else {
                System.out.println(curr + "  = " + count);
                curr = a[i];
                count = 1;
            }
            // System.out.println(curr + " = " + count);
        }
        System.out.println(curr + "  = " + count);
    }

    public static void main(String[] args) {
        int a[] = { 10, 10, 10, 20, 20, 50, 50, 60 };
        frequency(a);

    }
}
