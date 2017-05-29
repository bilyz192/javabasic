class HinhVuong extends HinhPhang {
  private int canh;

  // Phương thức khởi dựng không có tham số
  public HinhVuong() {
    super();
    canh = 0;
  }

  // Phương thức khởi dựng có tham số
  public HinhVuong(int canh) {
    this.canh = canh;
  }

  /* Phương thức truy nhập thuộc tính canh */
/*  public int getCanh() {
    return canh;
  }

  public void setCanh(int canh) {
    this.canh = canh;
  }*/

  // Khai báo nạp chồng
  public void tinhDienTich() {
    int s = canh * canh;
    System.out.println("Dien tich hinh vuong la: " + s);
  }

  public void tinhChuVi() {
    int c = 4*canh;
    System.out.println("Chu vi hinh vuong la: " + c);
  }
}
