/*
  Tìm giá trị nhỏ nhất trong 4 số a, b, c, d (a, b, c, được nhập từ bàn phím)..

*/
import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    int[] array = nhapN();
    timMin(array);
  }

  public static int[] nhapN() {
    System.out.println("Tìm giá trị nhỏ lớn nhất: ");
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

  public static void timMin(int[] array) {
    int min = array[0];

    for (int i=0; i<array.length; i++) {
      if (array[i]<min )
        min = array[i];
    }

    System.out.println(min);
  }
}
