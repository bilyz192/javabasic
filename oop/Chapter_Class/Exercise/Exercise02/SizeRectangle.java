class SizeRectangle extends Rectangle{
  private int a;
  private int b;

  public SizeRectangle() {
    super();
    a = 0;
    b = 0;
  }

  // Phương thức khởi dựng có tham số
  public SizeRectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }



  public void show() {
    System.out.println( "Kich thuoc hinh chu nhat : ");
    System.out.println( "Chieu dai:" + a);
    System.out.println( "Chieu rong:" + b);
  }
}
