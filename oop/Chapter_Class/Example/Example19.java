/*
  Khai báo nhiều hàm add() để cộng hai số hoặc cộng hai xâu kí tự.
*/

public class Example19 {
  // cong 2 so nguyen
  public int add(int x, int y) {
    return x + y;
  }

  // cong 2 so thuc

  public double add(double x, double y) {
    return x + y;
  }

  public String add(String x, String y) {
    return x + y;
  }

  // ham main
  public static void main(String[] args) {
    Example19 myDaHinh = new Example19();
    System.out.println("The (5+19) is " + myDaHinh.add(5.0d, 100f));
    System.out.println("The (\"ab\" + \"cd\") is \""+ myDaHinh.add("ab", 5+"") + "\"");
  }
}
