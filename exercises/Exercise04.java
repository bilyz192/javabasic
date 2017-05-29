/*
  Viết chương trình giải phương trình bậc 1 (ax + b = 0).
*/
import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    System.out.println("Giải phương trình bậc 1 (ax + b = 0)");
    System.out.println("Nhap 2 gia tri a va b :");
    float[] array = nhapGiaTri();
    float a = array[0];
    float b = array[1];

    float s = giaiPT(a, b);
    if (a == 0)
      System.out.println("Phuong trinh nay vo nghiem");
    else{

      System.out.println("Phuong trinh nay co nghiem la :\n x = "+ s);
    }
  }

  public static float[] nhapGiaTri() {

    Scanner input = new Scanner(System.in);

    System.out.print("\ta = ");
    float a = input.nextInt();

    System.out.print("\tb = ");
    float b = input.nextInt();

    return new float[]{a, b};
  }

  public static float giaiPT(float a, float b) {
    return -b / a;
  }
}
