import java.util.ArrayList;

public class PrimeNo {
    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 13, 17, 17, 21, 23, 31 };
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isprime(arr[i])) {
                if (!prime.contains(arr[i]))
                    prime.add(arr[i]);

            }
        }
        System.out.println(prime);
    }
}

