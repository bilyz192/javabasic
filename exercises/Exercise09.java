/*
  Giải hệ phương trình tuyến tính:
  { ax + by = m
  {
  { cx + dy = n
*/
import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    System.out.println("Giải hệ phương trình tuyến tính:");
    System.out.println("Nhap cac gia tri lan luot (a,b,m,c,d,n):");

    float[] array = nhap();
    a = array[0];
    b = array[1];
    m = array[2];
    c = array[3];
    d = array[4];
    n = array[5];

    giaiHePTTT(a, b, c, d, m, n);
  }

  public static float[] nhap() {

    Scanner input = new Scanner(System.in);

    System.out.print(" a = ");
    float a = input.nextInt();

    System.out.print(" b = ");
    float b = input.nextInt();

    System.out.print(" m = ");
    float m = input.nextInt();

    System.out.print(" c = ");
    float c = input.nextInt();

    System.out.print(" d = ");
    float d = input.nextInt();

    System.out.print(" n = ");
    float n = input.nextInt();

    return new float[]{a, b, m, c, d, n};
  }

  public static void giaiHePTTT(float a, float b, float c, float, d, float m, float n) {

    float d0 = a*d - c*b;
    float d1 = m*d - n*b;
    float d2 = a*n - c*m;

    float x = d1/d0;
    float y = d2/d0;

    if(a == 0 && b==0 && c==0 && d==0)
      System.out.println("Phuong trinh vo so nghiem");
    else if (a==0 && b==0) {
      if (m!=0)
        System.out.println("Phuong trinh vo nghiem");
      else {
        if (c == 0 && d == 0) {
          if (n!=0)
            System.out.println("Phuong trinh vo nghiem");
        }
      }
    }
    else if (d!=0){
      System.out.println("Nghiem cua Pt :");
      System.out.println(" x = " + x);
      System.out.println(" y = " + y);
    } else if ((d==0 && d1!=0) || (d==0 && d2!=0))
      System.out.println("Phuong trinh vo nghiem");
    else if(d==0 && d1==0 && d2==0)
      System.out.println("Phuong trinh co vo so nghiem");
  }
}
