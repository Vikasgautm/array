public class FindLowestGretest {
    public static void main(String[] args) {
        int arr[] = { 12, 15, 20, 35, 55, 57, 58 };
        int search = 57, lowest = 0, higest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                lowest = i - 1;
                higest = i + 1;
                System.out.println(arr[lowest] + " " + arr[higest]);

            }
        }
    }
}
