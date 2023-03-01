
import java.util.HashMap;

public class OddElement {
    static void odd(int a[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        odd(a);
    }
}
