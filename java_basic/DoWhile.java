import java.util.Scanner;

public class DoWhile {
  public static void main(String arr[]) {
    System.out.print("Nhap so nguyen bat ki : ");
    Scanner input = new Scanner(System.in);
    int i = input.nextInt();
    int count = 10;

    do {
      System.out.println(count);
      count--;
    } while (count >= i);

  }
}
