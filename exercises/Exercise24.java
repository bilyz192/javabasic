/*
  Ve hinh
*/

import java.util.Scanner;

public class Exercise24 {
  public static void main(String[] args) {
    System.out.print("Nhap 1 so bat ki: ");
    int n = nhapN();

    System.out.println("Ve Hinh Tam giac");
    veHinhTamGiac(n);

    System.out.println("Ve Hinh Tam giac nguoc");
    veHinhTamGiacNguoc(n);

    System.out.println("Ve Hinh Tam giac can");
    veHinhTamGiacCan(n);


  }

  public static int nhapN(){
    Scanner intput = new Scanner(System.in);
    int n = intput.nextInt();
    return n;
  }

  public static void veHinhTamGiacCan(int n) {

    for (int i = 1; i <= n; i++) {
      for (int h = 1; h <= n - i; h++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*"+" ");
      }
      System.out.print("\n");
    }
  }

  public static void veHinhTamGiac(int n) {
    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  public static void veHinhTamGiacNguoc(int n) {
    for (int i = n; i >= 1; i--){
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
