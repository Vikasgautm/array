import java.util.Scanner;

public class CountDigit {
    int m;

    int count(int n) {
        while (n != 0) {
            n = n / 10;
            m++;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter you any number ... ");
        int n = in.nextInt();
        CountDigit ob = new CountDigit();
        System.out.println("your number is digit ..." + ob.count(n));
        in.close();
    }
}
