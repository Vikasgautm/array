class TwoAdd {
  public static void main(String[] args) {
    int n[] = { 4, 5, 7, 2, 15 };
    int i, j, target = 9;
    for (i = 0; i <= n.length; i++) {
      for (j = i + 1; j < n.length; j++) {
        if (target == n[i] + n[j])
          System.out.println("[" + i + "," + j + "]");
      }
    }
  }
}