/*
  Viết chương trình tìm số Fibonaci thứ n (n>2), n nhập từ tham số dòng lệnh.
  Biết rằng số Fibonaci được tính theo công thức:
  F(n) = F(n-1) + F(n-2) với n>=2 và F(0) = F(1) = 1.
*/

class Exercise06 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int a = fibonaci(n);
    System.out.println(a);
  }

  public static int fibonaci(int n) {
    if (n<=2 && n!=0)
      return 1;
    else if (n == 0)
      return 0;
    return fibonaci(n-1) + fibonaci(n-2);
  }
}
