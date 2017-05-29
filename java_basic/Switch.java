import java.util.Scanner;

public  class Switch {
  public static void main (String[] arr) {
    Scanner input = new Scanner(System.in);
    int so;
    System.out.print("Nhap so: ");
    so = input.nextInt();

    switch (so) {
      case 2:
        System.out.println("Thu Hai");
        break;
      case 3:
        System.out.println("Thu Ba");
        break;
      case 4:
        System.out.println("Thu Bon");
        break;
      case 5:
        System.out.println("Thu Nam");
        break;
      case 6:
        System.out.println("Thu Sau");
        break;
      case 7:
        System.out.println("Thu Bay");
        break;
      case 8:
        System.out.println("Chu Nhat");
        break;
      default:
        System.out.println("Khong co thu");
    }
  }
}

