/*
  Nhập vào bán kính của hình tròn.
  In ra màn hình diện tích và chu vi của nó
*/
import java.util.Scanner;
import java.lang.Math;

public class Exercise02 {
  public static void main(String[] args) {
    System.out.print("Nhap ban kinh cua hinh tron: ");
    double r = nhapBanKinh();
    System.out.println("r = " + r);

    double s = tinhDienTichHinhTron(r);
    System.out.println("Dien tich cua hinh tron voi r = "+ r +" la: "+ s);

    double c = tinhChuViHinhTron(r);
    System.out.println("Chu vi cua hinh tron voi r = " + r +" la: "+ c);
  }

  public static double nhapBanKinh() {
    Scanner input = new Scanner(System.in);
    double r = input.nextInt();
    return r;
  }

  public static double tinhDienTichHinhTron(double r) {
    double s = Math.pow(r, 2) * 3.14;
    return s;
  }

  public static double tinhChuViHinhTron(double r) {
    double c = (r * 2) * 3.14;
    return c;
  }
}
