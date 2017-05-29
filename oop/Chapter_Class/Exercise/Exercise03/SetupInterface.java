/*
  Sau đó viết một lớp cài đặt giao tiếp đó (Math.java).
*/


public class SetupInterface implements SimpleMath {
  public int getSum(int x, int y) {
    return x + y;
  }

  public String getSum(String x, String y) {
    return x + y;
  }
  public String getSum(String x, int y) {
    return x + (y+"");
  }


  public static void main(String[] args) {
    SetupInterface myMath = new SetupInterface();
    System.out.println("The (5 + 10) is " + myMath.getSum(5, 10));
    System.out.println("The (\"ab\" + \"cd\") is \""+ myMath.getSum("ab", "cd") + "\"");
    System.out.println("The (\"ab\" + 123) is \""+ myMath.getSum("ab", 123) + "\"");
  }
}
