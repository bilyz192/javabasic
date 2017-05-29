/*
  Nhập vào tâm và bán kính của một đường tròn.
  Sau đó nhập vào một điểm A(x,y) bất kì
  và kiểm tra xem nó có thuộc đường tròn hay không?
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise11 {
  public static void main(String[] args) {
    double[] arr = nhapTamBanKinhDiemDuongTron();
    double ox = arr[0];
    double oy = arr[1];
    double r = arr[2];
    double ax = arr[3];
    double ay = arr[4];

    double d = kiemTraDiemThuocDuongTron(ox,oy,r,ax,ay);
    if (d == r)
      System.out.println("Diem A nam tren duong tron");
    else if (d > r)
      System.out.println("Diem A nam ngoai duong tron");
    else
      System.out.println("Diem A nam trong duong tron");
  }

  public static double[] nhapTamBanKinhDiemDuongTron() {
    System.out.println("Nhap tam va ban kinh cua duong tron:");
    Scanner input = new Scanner(System.in);

    System.out.println("Tam Ox =");
    double ox = input.nextInt();

    System.out.println("Tam Oy =");
    double oy = input.nextInt();

    System.out.println("Ban kinh r =");
    double r = input.nextInt();

    System.out.println("Nhap diem A(x,y):");

    System.out.println("Tam Ax =");
    double ax = input.nextInt();

    System.out.println("Tam Ay =");
    double ay = input.nextInt();

    return new double[]{ox, oy, r, ax, ay};
  }

  public static double kiemTraDiemThuocDuongTron(double ax, double ay, double ox, double oy, double r) {
    double sqrx = Math.pow((ax-ox),2);
    double sqry = Math.pow((ay-oy),2);

    return Math.sqrt(sqrx+sqry);

  }


}
