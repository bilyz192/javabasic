/*
  Viết chương trình tìm giai thừa của n (n>0), n nhập từ tham số dòng lệnh.
*/

class Exercise03 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int giaithua = tinhGiaiThua(n);
    System.out.println(giaithua);
  }

  public static int tinhGiaiThua(int n) {
    if (n ==0)
      return 1;
    int giaithua = n * tinhGiaiThua(n-1);
    return giaithua ;
  }

}
