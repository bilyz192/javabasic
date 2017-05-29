/*
  Viết chương trình tìm bội số chung nhỏ nhất của m và n (m,n>0),
  m và n được nhập từ tham số dòng lệnh.
*/

class Exercise04 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    int a = UCLN(n,m);
    System.out.println("Boi chung nho nhat cua (" + n + " va " + m +") : " + (n*m)/a);

  }

  public static int UCLN(int n, int m) {
    if (n > 0 && m > 0) {
      while (n!=m) {
        if (n>m)
          n = n - m;
        else
          m = m -n;
      }
    }
    return n;
  }
}
