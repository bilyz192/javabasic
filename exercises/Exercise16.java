/*
Tính tổng Xich ma cua x^i/i! chay tu i -> n, voi n >= 0;
tungvb.
80 - > 4
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise16 {
  public static void main(String[] args) {
    System.out.print("Tinh tong xich ma cua X^i/i! chay tu i -> n (n >= 0)");

    float[] arr = nhapXvaN();
    float x = arr[0];
    float n = arr[1];

    float s = tinhTongXichMa(x, n);
    System.out.println("S = " + s);
  }

  public static float[] nhapXvaN() {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap x = ");
    float x = input.nextInt();

    System.out.print("Nhap n = ");
    float n = input.nextInt();

    return new float[]{x, n};
  }

  public static float tinhGiaiThua(float n) {
    if (n <= 1)
      return 1;
    return n * tinhGiaiThua(n - 1);
  }

  public static float tinhTongXichMa(float n, float x) {
    float s = 0;
    for (int i = 0; i <= n; i++) {
      s += (Math.pow(x, i)/tinhGiaiThua(i));

    }
    return s;
  }
}
