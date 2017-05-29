/*
  Viết chương trình giải phương trình bậc 2 (ax2 + bx + c =0)

*/
import java.util.Scanner;
import java.lang.Math;

public class Exercise06 {
  public static void main(String[] args) {
    System.out.println("Giải phương trình bậc 2 (ax2 + bx + c =0)");
    System.out.println("Nhap gia tri: ");

    double[] array = nhap();
    double a = array[0];
    double b = array[1];
    double c = array[2];

    giaiPTTT(a, b, c);
  }

  public static double[] nhap() {

    Scanner input = new Scanner(System.in);

    System.out.print(" a = ");
    double a = input.nextInt();

    System.out.print(" b = ");
    double b = input.nextInt();

    System.out.print(" c = ");
    double c = input.nextInt();

    return new double[]{a, b, c};
  }

  public static void giaiPTTT(double a, double b, double c) {
    double x = 0;
    double d = b*b-4*a*c;
    double sqrt = Math.sqrt(d);

    if (a==0){
      if (b==0)
        System.out.println("Phuong trinh nay vo nghiem.");
      else
        x = -c/b;
        System.out.println("Phuong trinh nay co mot nghiem." + x);
    } else if (d>0) {
      double x1 = (-b-sqrt)/(2*a);
      double x2 = (-b+sqrt)/(2*a);

      System.out.println("Phuong trinh nay co hai nghiem la :\n x1 = " +
        x1 + "\n x2 = " + x2);
    } else if (d==0) {
      x = -b/(2*a);
      System.out.println("Phuong trinh nay co nghiem kep la :\n x = " + x);}
    else
      System.out.println("Phuong trinh nay vo nghiem.");
  }
}
