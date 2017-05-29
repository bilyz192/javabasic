/*
  Nhập vào 2 cạnh của một hình chữ nhật.
  In ra màn hình diện tích và chu vi của nó.
*/
import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    int[] array =  nhapCanhHCN();
    int a = array[0];
    int b = array[1];

    int s = tinhDienTichHCN(a, b);
    int c = tinhChuViHCN(a, b);

    System.out.println("Dien tich hinh chu nhat la: " + s);
    System.out.println("Chu vi hinh chu nhat la: " + c);
  }

  public static int[] nhapCanhHCN() {
    System.out.println("Nhap gia tri 2 canh a va b :");
    Scanner input = new Scanner(System.in);

    System.out.print("Canh a = ");
    int a = input.nextInt();

    System.out.print("Canh b = ");
    int b = input.nextInt();

    return new int[]{a, b};
  }

  public static int tinhDienTichHCN(int a, int b) {
    return a * b;
  }

  public static int tinhChuViHCN(int a, int b) {
    return (a + b) / 2;
  }
}
