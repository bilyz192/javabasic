/*
  Viết một lớp trừu tượng về các hình phẳng, trong đó khai báo các phương thức
  tính chu vi và diện tích của hình. Sau đó viết ba lớp kế thừa
  từ lớp trừu tượng đó là: lớp hình vuông, lớp hình chữ nhật và lớp hình tròn.
  Tự thiết lập các thuộc tính cục bộ cần thiết cho mỗi lớp con và
  khai báo nạp chồng hai phương thức ban đầu trong mỗi lớp con.
*/

abstract class HinhPhang {
  abstract void tinhChuVi();
  abstract void tinhDienTich();
}
