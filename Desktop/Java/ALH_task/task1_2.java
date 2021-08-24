public class task1_2 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("2から100までの偶数のみを全て足すと" + sum + "です。");
  }
}
