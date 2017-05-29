import java.util.Scanner;

public class SwitchCase  {
  public static void main(String [] arr) {
    Scanner input = new Scanner(System.in);

    System.out.println("Nhap ki tu bat ki: ");
    String userInput = input.next();
    char kitu =  userInput.charAt(0);

    switch (kitu) {
      case 'V' :
        System.out.println("Vaio");
        break;
      case 'D' :
        System.out.println("Dell");
        break;
      default:
        System.out.println("Khong tim thay!!");
    }
  }
}
