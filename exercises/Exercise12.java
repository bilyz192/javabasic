/*
  Tính x^y ( Với x, y là số thực).
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise12 {
  public static void main(String[] agrs) {
    double[] arr = nhapHaiSoThuc();
    double x = arr[0];
    double y = arr[1];

    x = tinhLuyThua(x, y);
    System.out.println("x^y = " + x);
  }

  public static double[] nhapHaiSoThuc() {
    System.out.println("Nhap hai so thuc x va y :");
    Scanner input = new Scanner(System.in);

    System.out.print(" X = ");
    double x = input.nextInt();

    System.out.print(" Y = ");
    double y = input.nextInt();

    return new double[]{x, y};
  }

  public static double tinhLuyThua(double x, double y) {
    x = Math.pow(x, y);
    return x;

  }
}
