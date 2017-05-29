import java.util.Scanner;

public class IfElse {

  public static void main(String []agrs) {
    Scanner input = new Scanner(System.in);
    double diem;
    System.out.print("Nhap diem: ");
    diem = input.nextDouble();

    if (diem < 4)
      System.out.println("Truot");
    else
      System.out.println("Tot");
  }
}
