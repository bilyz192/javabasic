import java.util.Scanner;

public class Index {
  public static void main (String[] args) {
    int a = select();
    if (a==1) {
      Create inp = new Create();
      inp.nhapThongTin();
    } else if (a == 2) {
      Display op = new Display();
      op.show();
    } else
      System.out.println("Chon lai");
  }

  public static int select() {
    System.out.println("Chon 1 so tuong ung:");
    Scanner input = new Scanner(System.in);
    System.out.println("1.Tao moi:");
    System.out.println("2.Hien Thi:");
    int a = input.nextInt();
    return a;
  }



}
