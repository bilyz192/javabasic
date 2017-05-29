class HinhChuNhat extends HinhPhang {
  private int canhA;
  private int canhB;


  //phuong thuc khoi dung k co tham so
  public HinhChuNhat() {
    super();
    canhA = 0;
    canhB = 0;
  }

  // phuong thuc khoi dung co tham so (truyen than so)
  public HinhChuNhat(int canhA, int canhB) {
    this.canhA = canhA;
    this.canhB = canhB;
  }

  //khai bao nap chong phuong thuc
  public void tinhDienTich() {
    int s = canhA * canhB;
    System.out.println("Dien tich hinh chu nhat la:" + s);
  }

  public void tinhChuVi() {
    int c =2*(canhA + canhB);
    System.out.println("Chu vi hinh chu nhat la: " + c);
  }
}
