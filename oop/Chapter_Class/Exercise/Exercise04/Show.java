public class Show {
  public static void main(String[] args) {
    // Sử dụng lớp HinhVuong
    HinhVuong showHinhVuong = new HinhVuong(25);
    showHinhVuong.tinhChuVi();
    showHinhVuong.tinhDienTich();

    // Sử dụng lớp HinhChuNhat

    HinhChuNhat showHinhChuNhat = new HinhChuNhat(10, 15);
    showHinhChuNhat.tinhDienTich();
    showHinhChuNhat.tinhChuVi();

    HinhTron showHinhTron = new HinhTron(10);
    showHinhTron.tinhDienTich();
    showHinhTron.tinhChuVi();
  }
}
