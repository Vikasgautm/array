import java.util.Scanner;

public class CheckPalindrome {
    // static boolean Palindrome(int n)
    int palindrome(int n) { // find reverse number
        int sum = 0, m = n;
        while (m != 0) {
            sum = sum * 10 + m % 10;
            m = m / 10;
        }
        // if (n == sum) {
        // return true;
        return sum;
        // } else
        // return false;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter your number ..... ");
        int n = in.nextInt();
        // boolean palm = Palindrome(n);
        // if (palm) {
        // System.out.println(" your number is palindrome " + n);
        // } else {
        // System.out.println("your number is not palindrome ..."+n);
        // }
        CheckPalindrome ob = new CheckPalindrome();// find reverse number
        System.out.println(" your reverse number is = " + ob.palindrome(n));
        in.close();
    }
}
