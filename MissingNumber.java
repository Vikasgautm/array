public class MissingNumber {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5, 6 };
        int sum = 0, temp = 0;
        for (int i = 1; i <= a.length + 1; i++) {
            sum = sum + i;
        }
        for (int j = 0; j <= a.length - 1; j++) {
            temp = temp + a[j];
        }
        int MissingNumber = sum - temp;
        System.out.println(" your missing number is = " + MissingNumber);
    }
}
