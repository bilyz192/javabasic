class HinhTron extends HinhPhang {
  private double r;

  // phuong thuc khoi dung k co tham so
  public HinhTron() {
    super();
    r = 0;
  }

  public HinhTron(double r) {
    this.r = r;
  }

  public void tinhDienTich() {
    double s = r*r*3.14;
    System.out.println("Dien tinh hinh tron: " + s);
  }

  public void tinhChuVi() {
    double c =r*2*3.15;
    System.out.println("Chi vi hinh tron: " + c);
  }
}
