import java.util.Scanner;

public class CheckArmstrong {
    static boolean armstrong(int n, int count) {
        int m = n, rem, sum = 0;
        while (m != 0) {
            rem = m % 10;
            m = m / 10;
            sum += Math.pow(rem, count);
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your any number...");
        int n = in.nextInt();
        int m = n, count = 0;
        while (m != 0) {
            m = m / 10;
            count++;
        }
        boolean arm = armstrong(n, count);
        if (arm) {
            System.out.println("your number is armstrong ... " + n);
        } else
            System.out.println("your number is not atmstrong... " + n);
        in.close();
    }
}
