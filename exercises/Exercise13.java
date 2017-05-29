/*
  Tính x^n (Với n là số nguyên không âm)..
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise13 {
  public static void main(String[] agrs) {
    int[] arr = nhapHaiSoThuc();
    int x = arr[0];
    int n = arr[1];

    x = tinhLuyThua(x, n);
    System.out.println("x^n = " + x);
  }

  public static int[] nhapHaiSoThuc() {
    System.out.println("Nhap hai so thuc x va n :");
    Scanner input = new Scanner(System.in);

    System.out.print(" x = ");
    int x = input.nextInt();

    System.out.print(" n = ");
    int n = input.nextInt();

    return new int[]{x, n};
  }

  public static int tinhLuyThua(int x, int n) {
    int y = 1;
    for (int i = 1;i <= n; i++ ) {
      y *=x;
    }
    return y;

  }
}
