/*
  Viết chương trình hiển thị tổng các bội số của 7 nằm giữa 1 và 100.
*/

class Exercise02 {
  public static void main(String[] args) {
    int n = 7;
    int sum = tinhTongBoiSo(n);
    System.out.print("Tổng các bội số của 7 nằm giữa 1 và 100: " + sum);
  }

  public static int tinhTongBoiSo(int n) {
    int boiso = 0;
    int sum = 0;
    for (int i = 1; i < 100; i++) {
      boiso = i*n;
      if (boiso < 100) {
        sum +=boiso;
      }
    }
    return sum;
  }
}
