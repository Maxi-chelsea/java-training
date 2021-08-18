import java.io.*;

public class lesson4_5_5 {
  public static void main(String[] args) throws IOException {
    System.out.println("科目1~5の点数を入力してください。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();
    int sub1 = Integer.parseInt(str1);
    int sub2 = Integer.parseInt(str2);
    int sub3 = Integer.parseInt(str3);
    int sub4 = Integer.parseInt(str4);
    int sub5 = Integer.parseInt(str5);
    System.out.println("5科目の合計点は" + (sub1 + sub2 + sub3 + sub4 + sub5) + "です。");
    System.out.println("5科目の平均点は" + ((sub1 + sub2 + sub3 + sub4 + sub5) / (double) 5) + "です。");
  }
}
