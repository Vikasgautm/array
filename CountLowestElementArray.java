import java.util.ArrayList;

public class CountLowestElementArray {
    public static void main(String[] args) {
        int a[] = { 8, 1, 4, 3, 5 };
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            List.add(a[i]);
        }
        System.out.println(List);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }

            }
            list.add(count);
            count = 0;
        }
        System.out.println(list);
    }
}
