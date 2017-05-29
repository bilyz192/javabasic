/*
  Viết một giao tiếp khai báo các phép toán cộng hai số, cộng hai xâu,
  cộng xâu và số. Sau đó viết một lớp cài đặt giao tiếp đó.
*/

public interface SimpleMath {
  public int getSum(int x, int y);

  public String getSum(String x, String y);

  public String getSum(String x, int y);

}
