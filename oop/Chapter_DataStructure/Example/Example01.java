/*
  Thủ tục tính số Fibonacy thứ n:
*/

class Example01 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int f = Fib(n);
    System.out.println(f);

  }
  public static int Fib(int n) {
    if (n == 1 || n == 2)
      return 1;
    return (Fib(n-1) + Fib(n-2));
  }
}
