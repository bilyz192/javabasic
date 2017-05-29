/*
  Tìm tất cả các chữ số có ba chữ số abc sao cho tổng các lập phương
  của các chữ số thì bằng chính số đó ( abc = a3 + b3 + c3).
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise18 {
  public static void main(String[] args) {
    System.out.println("Tim ( abc = a3 + b3 + c3 )");
    int n = nhapSoCanKT();
    int sum = ketQua(n);
    if (sum == n)
      System.out.println("So can tim la : " + sum);
    else
      System.out.println("So nay "+ sum +" khong phai so can tim. " );

  }

  public static int nhapSoCanKT() {
    Scanner input = new Scanner(System.in);

    System.out.print("Nhap mot so bat ki co 3 chu so: ");

    int n = input.nextInt();

    return n;
  }



  public static int ketQua(int n) {
    int a = n / 100;
    int b = (n % 100)/10;
    int c = n % 10;
    int la = 1;
    int lb = 1;
    int lc = 1;
    for (int i = 1;i <= 3; i++ ) {
      la *=a;
      lb *=b;
      lc *=c;
    }

    int sum = la + lb + lc;
    return sum;
  }
}
