
public class SubtractionArray {
    public static void main(String[] args) {
        int first[] = { 7, 1, 5, 4, 3 };
        int second[] = { 8, 3, 7, 8 };
        int result[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length - 1;
        int sub = 0;
        int borrow = 10;
        if (i >= j) {
            while (k >= 0) {
                if (i >= 0 && j >= 0) {
                    if (first[i] >= second[j]) {
                        sub = first[i] - second[j];
                    } else {
                        sub = first[i] - second[j] + borrow;
                        first[i - 1] = first[i - 1] - 1;
                    }
                } else if (i >= 0 && j < 0) {
                    sub = first[i];
                }
                result[k] = sub;
                i--;
                j--;
                k--;

            }
            for (int e : result)
                System.out.print(e);
        } else if (i < j) {
            System.out.println("differencence not possible . ");
        }
    }
}
