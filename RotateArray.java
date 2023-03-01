// rotate array by one 
public class RotateArray {
    public static void main(String[] args) {
        int a[] = { 3, 5, 1, 7, 5, 9 };
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        for (int j = 0; j < a.length - 1; j++) {
            System.out.print(a[j]);
        }
        a[a.length - 1] = temp;
        {
            System.out.print(a[a.length - 1]);
        }

    }
}
