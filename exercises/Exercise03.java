/*
  Tính tam giác: Nụâp vào ba số a,b,c bất kì.
  Kiểm tra xem nó có thể là độ dài ba cạnh hay không,
  nếu không thì in ra màn hình ' Khong la ba canh cua mot tam giac'.
  Ngược lại, thì in diện tích, chu vi của tam giác ra màn hình.
*/
import java.util.Scanner;
import java.lang.Math;

public class Exercise03 {
  public static void main(String[] args) {
    System.out.println("Nhap 3 canh :");
    int[] array =  canhTamGiac();
    int a = array[0];
    int b = array[1];
    int c = array[2];

    boolean kt = kiemTra(a, b, c);
    if (kt == true){
          System.out.println("a,b,c la ba canh cua mot tam giac!");

          double s = tinhDienTichVaChuViHinhTamGiac(a, b, c);
          System.out.println("Dien tich hinh tam giac la: " + s);

          double p = tinhChuViHinhTamGiac(a, b, c);
          System.out.println("Chu vi hinh tam giac la: " + p);}
    else
      System.out.println("Khong la ba canh cua mot tam giac!");

  }
  public static int[] canhTamGiac() {


    Scanner input = new Scanner(System.in);

    System.out.print("Canh a = ");
    int a = input.nextInt();
    if (a<0) {
      System.out.println("Canh a khong hop le,(a>0)!");
      do {
        System.out.println("Ban nhap lai di!");
        System.out.print("Canh a = ");
        a = input.nextInt();
      } while (a<0);
    }

    System.out.print("Canh b = ");
    int b = input.nextInt();
    if (b<0) {
      System.out.println("Canh b khong hop le,(b>0)!");
      do {
        System.out.println("Ban nhap lai di!");
        System.out.print("Canh b = ");
        b = input.nextInt();
      } while (b<0);
    }

    System.out.print("Canh c = ");
    int c = input.nextInt();
    if (c<0) {
      System.out.println("Canh c khong hop le,(c>0)!");
      do {
        System.out.println("Ban nhap lai di!");
        System.out.print("Canh c = ");
        c = input.nextInt();
      } while (c<0);
    }

    return new int[]{a, b, c};
  }

  public static boolean kiemTra(int a, int b, int c) {
    if (a+b>c && b+c>a && a+c>b)
      return true;
    return false;
  }
  public static double tinhDienTichVaChuViHinhTamGiac(int a, int b, int c) {
    double p = (a + b +c)/2;
    double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));


    return s ;
  }
  public static double tinhChuViHinhTamGiac(int a, int b, int c) {
    return a + b + c;
  }

}
