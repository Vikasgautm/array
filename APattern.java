public class APattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i == j) {
                    System.out.print("*");
                }
                if (i == 3 && j == 2) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            for (int j = 2; j <= 5; j++) {
                if (i == j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
