/*
  Nhap thong tin tu nguoi dung
*/
import java.util.Scanner;

public class Create {
  public String[] nhapThongTin() {
    Scanner input = new Scanner(System.in);
    Media info = new Media();
    String a = info.name, b = info.color, c = info.produce;

    System.out.println("Nhap ten phuong tien");
    a = input.next();
    System.out.println("Nhap mau phuong tien");
    b = input.next();
    System.out.println("Nhap noi san xuat");
    c = input.next();


    return new String[]{a, b, c};
  }
}
