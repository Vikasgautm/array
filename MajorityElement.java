public class MajorityElement {
    static int majority(int arr[]) {
        int majority = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
            }
            if (majority == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 3 };
        // int count = 0, majority = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (count == 0) {
        // majority = arr[i];
        // }
        // if (majority == arr[i]) {
        // count++;
        // } else {
        // count--;
        // }
        // }
        // System.out.println(majority);
        int y = majority(arr);
        System.out.println(y);
    }
}