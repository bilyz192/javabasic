/*
Tính tổng Xich ma cua X^i! chay tu i -> n, voi n >= 1;
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise15{
  public static void main(String[] agrs){
    System.out.println("Tinh tong xich ma cua X^i! chay tu i -> n (n >= 1)");
    int[] arr = nhapXVaN();
    int x = arr[0];
    int n = arr[1];
    int s = tinhTongXichMa(x, n);
    System.out.print("S = " + s);

  }

  public static int[] nhapXVaN() {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap x = ");
    int x = input.nextInt();

    System.out.print("Nhap n = ");
    int n = input.nextInt();

    return new int[]{x, n};

  }

  public static int tinhTongXichMa(int x, int n){
    int s = 0;
    for (int i = 1; i <= n; i++ ){
      s +=(Math.pow(x,i));
    }
    return s;
  }
}
