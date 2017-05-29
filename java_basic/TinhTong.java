public class  TinhTong {

  public static void main(String[] args) {
    float sum = thucHien(args);
    hienThiKetQua(sum);
  }

  public static float thucHien(String[] args) {
       System.out.println(args[0]);
      System.out.println(args[1]);

      float a = Float.parseFloat(args[0]);
      float b = Float.parseFloat(args[1]);

      float sum = tinhTong(a, b) ;

      return sum;
  }

  public static float tinhTong() {
    return 0;
  }

  public static float datTenNhuTheNay() {
    return 0;
  }

  public static float tinhTong(float a, float b) {
    float sum = a + b;
    return sum;
  }

  public static void hienThiKetQua(float kq) {
    System.out.println(kq);
  }
}