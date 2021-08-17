import java.io.*;

import jdk.internal.org.jline.utils.InputStreamReader;
public class lesson3_7_4 {
  public static void main(String[] args) throws IOException
  {
    System.out.println("円周率の値はいくつですか？");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    double num = Integer.parseInt(num);
    System.out.println("円周率の値は" + num + "です。");
  }
}
