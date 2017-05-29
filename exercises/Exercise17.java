/*
  Nhập 1 số bất kì đưa ra đâu hàng hàng chục, hàng trăm, hàng đơn vị.
*/

import java.util.Scanner;

public class Exercise17 {
  public static void main(String[] args) {
    int a = nhapN();
    kq(a);
  }

  public static int nhapN() {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap a = ");
    int a = input.nextInt();

    return a;
  }

  public static void kq(int a) {
    int n = a/1000;
    int t = (a%1000)/100;
    int c = (a%100)/10;
    int d =  a % 10 ;
    String msg = "";
    if (d > 0) {
      msg = d + " don vi" + msg;
    }
    if (c > 0) {
      msg = c + " chuc " + msg;
    }

    if (t > 0) {
      msg = t + " tram " + msg;
    }

    if (n > 0) {
      msg = n + " nghin " + msg;
    }

    System.out.println(msg);


  }
}
