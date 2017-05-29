import java.util.Scanner;

public class For {
  public static void main(String arr[]) {
    System.out.print("Nhap 1 so bat ki : ");
    Scanner input = new Scanner(System.in);
    int so = input.nextInt();

    for (int i = 1; i <= so; i++) {
      System.out.println(i);
    }
  }
}
