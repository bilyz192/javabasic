public class Display{
  public void show() {
    Create hienthi = new Create();
    String[] arr = hienthi.nhapThongTin();
    String a = arr[0];
    String b = arr[1];
    String c = arr[2];
    System.out.println("Ten phuong tien: " + a);
    System.out.println("Mau: " + b);
    System.out.println("San Xuat tai: " + c);
  }
}




