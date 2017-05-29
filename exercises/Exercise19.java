/*
  Nhập vào một số nguyên không âm,
  kiểm tra xem nó có phải là số nguyên tố hay không?
*/

import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] agrs) {
    int n = nhapBienN();

    boolean giatri = kiemTraSoNguyenTo(n);
    if (n <=1)
      System.out.println(n + " Khong phai la so nguyen to");
    else {
      if (giatri == true)
        System.out.println(n + " La so nguyen to");
      else
        System.out.println(n + " Khong phai la so nguyen to");
    }
  }

  public static int nhapBienN() {
    Scanner input = new Scanner(System.in);

    System.out.print("Nhap N:");
    int n = input.nextInt();

    return n;
  }

  public static boolean  kiemTraSoNguyenTo(int n){
    for (int i = 2; i <= Math.sqrt(n); i++ ) {
      if (n%i ==0) {
        return false;
      }

    }
    return true;
  }
}
