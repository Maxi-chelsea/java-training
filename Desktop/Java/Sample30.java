import java.io.*;

public class Sample30 {
  public static void main(String[] args) throws IOException {
    System.out.println("いくつ*を出力しますか。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int num = Integer.parseInt(str);
    for (int i = 1; i <= num; i++) {
      System.out.println("*");
    }
  }
}