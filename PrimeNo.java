import java.util.ArrayList;

public class PrimeNo {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 13, 17, 17, 21, 23, 31 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j * j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
                else{
                    list.add(arr[i]);
                }
            }    
        }
        System.out.println(list);
    }
}
