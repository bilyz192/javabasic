/*
  Viết chương trình tính tổng các số chẵn nằm trong khoảng 1 đến 100.
*/



class Exercise01 {
  public static void main(String[] args) {
    int sum = tinhTongCacSoChan();
    System.out.println("Tong cac so chan la: " + sum);
  }

  public static int tinhTongCacSoChan() {
    int n = 10;
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}

