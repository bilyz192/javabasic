/*
Tính tổng Xich ma cua 1/i! chay tu i -> n, voi n >= 0;
*/

import java.util.Scanner;
import java.lang.*;

public class Exercise14 {
  public static void main(String[] args) {
    System.out.println("Tinh tong xich ma cua 1/i! chay tu i -> n (n >= 0)");
    float n = nhapN();
    float s = tinhTongXichMa(n);
    System.out.print("Tinh: "+ s);
  }

  public static float nhapN(){
    System.out.print("Nhap n : ");
    Scanner input = new Scanner(System.in);
    float n = input.nextInt();
    return n;
  }

  public static float tinhGiaiThua(float n){
    if (n <= 1)
      return 1;
    else
      return n* tinhGiaiThua(n - 1);
  }

  public static float tinhTongXichMa(float n) {
    float a =tinhGiaiThua(n);
    float s =0;

    for (float i = 0; i <= n ; i++ ) {
      s += (1/tinhGiaiThua(i));
    }
    return s;
  }
}
