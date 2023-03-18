public class GasStation {
    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        int rem = 0, start = 0, loss = 0;
        for (int i = 0; i < gas.length; i++) {
            rem += gas[i] - cost[i];
            if (rem < 0) {
                start = i + 1;
                loss = rem;
                rem = 0;
            }

        }
        if ((loss + rem) >= 0) {
            System.out.println(start);
        }

    }
}
