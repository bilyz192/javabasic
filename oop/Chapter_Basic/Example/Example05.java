/*
  Cấu trúc While
  Vi du 5: chương trình sau tính tổng của 5 số tự nhiên đầu tiên.
*/

package oop.Case_Study.Example;

class Example05 {
  public static void main(String[] args) {
    int i = 5;
    int sum = 0;
    while (i >= 1) {
      sum += i;
      i--;
    }
    System.out.println(sum);
  }
}
