public class Leader {
    static void findleader(int n[]) {
        for (int i = 0; i < n.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] <= n[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(n[i]);
            }
        }
    }

    public static void main(String[] args) {
        int n[] = { 5, 11, 8, 9, 7, 4 };
        findleader(n);
    }
}
