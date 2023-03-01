//import java.util.Scanner;

public class max {
    static void Checkmax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 0, 9, 6 };
        int n = arr.length;
        Checkmax(arr, n);
        // Scanner in= new Scanner(System.in);
        // System.out.println("enter size if array .. ");
        // int n=in.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        // System.out.println("enter data ");
        // arr[i]=in.nextInt();
        // }

    }
}
