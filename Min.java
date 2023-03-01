import java.util.Scanner;

public class Min {
    int checkmin(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array .. ");
        int n = in.nextInt();
        int a[] = new int[n];
        // int a[] = { 5, 2, 4, 9 };
        for (int i = 0; i < n; i++) {
            System.out.println("enter your data ");
            a[i] = in.nextInt();
        }
        Min ob = new Min();
        System.out.println("your minimum number . " + ob.checkmin(a, n));
        in.close();
    }
}
