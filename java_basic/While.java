import java.util.Scanner;
public class While {
  public static void main (String[] array) {
    
    System.out.print("Nhap 1 so nguyen bat ki : ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int count = 1;
    while (count <= number) {
      System.out.println(count);
      count++;
    }
    System.out.print("ket thuc");
  }

}