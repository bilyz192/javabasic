/*
  Tìm giá trị lớn nhất trong 4 số a, b, c, d (a, b, c,d được nhập từ bàn phím).

*/
import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    System.out.println("Tìm giá trị lớn nhất: ");
    int[] array = nhapN();
    timMax(array);
  }

  public static int[] nhapN() {

    Scanner input = new Scanner(System.in);
    System.out.print(" a = ");
    int a = input.nextInt();

    System.out.print(" b = ");
    int b = input.nextInt();

    System.out.print(" c = ");
    int c = input.nextInt();

    System.out.print(" d = ");
    int d = input.nextInt();

    return new int[]{a, b, c, d};
  }

  public static void timMax(int[] array) {
    int max = array[0];

    for (int i = 0; i<array.length; i++)
      if (array[i]>max )
        max = array[i];

    System.out.println(max);
  }
}
