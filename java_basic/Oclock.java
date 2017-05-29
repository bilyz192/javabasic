/*
Nhập vào thời gian 1 công việc nào đó là x giây.
Hãy chuyển đổi và viết ra màn hình số thời gian
trên dưới dạng bằng bao nhiêu giờ, bao nhiêu phút, bao nhiêu giây
*/
import java.util.Scanner;

public class Oclock {
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

  public static void check(int n) {
    if (n >=3600) {
      int h = n % 3600;
      int h1 = n/3600;
      int p = h % 60;
      int p1 = h / 60;
      int s = p % 60;
      int s1 = p / 60;
      if (h == 0) {
        if (h1 != 0)
          System.out.println(n + "s1 = " + h1 + "h"  );
        }
      else {
        if (p == 0) {
          if (s == 0)
            System.out.println(n + "s2 = "+h1+" h - "+ p1 + "'");
        }
        else
          System.out.println(n + "s3 = "+h1+" h - "+ p1 + "' - " + s + "s"  );
      }
    } else {
      int s = n%60;
      int s1 = n/60;

      if (s1 == 0)
        System.out.println(n + "s = " + s + "s"  );
      else if (s != 0)
        System.out.println(n + "s = "+ s1 + "' - " + s + "s"  );
      else
        System.out.println(n + "s = " + s1 + "'"  );
    }
  }
}
