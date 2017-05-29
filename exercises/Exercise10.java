/*
Nhập vào thời gian 1 công việc nào đó là x giây.
Hãy chuyển đổi và viết ra màn hình số thời gian
trên dưới dạng bằng bao nhiêu giờ, bao nhiêu phút, bao nhiêu giây
*/
import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {
    int n = nhapGiay();
    oclock(n);
  }

  public static int nhapGiay() {
    System.out.println("Nhap gia tri bat ki :");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    return n;
  }

  public static void oclock(int n) {
    int hours = n / 3600;
    int minutes = (n% 3600)/60 ;
    int seconds = n % 60;

    String msg = "";
    if (seconds > 0) {
      msg = seconds + "s" + msg;
    }
    if (minutes > 0) {
      msg = minutes + "p" + msg;
    }

    if (hours > 0) {
      msg = hours + "h" + msg;
    }

    System.out.println(msg);


  }
}
