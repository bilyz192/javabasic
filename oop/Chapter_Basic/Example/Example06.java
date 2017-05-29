/*
  Cấu trúc Do - While
  Vi du 6: chương trình sau tính tổng của 5 số tự nhiên đầu tiên.
*/

package oop.Case_Study.Example;

class Example06 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    do {
      sum +=i;
      i++;
    }while (i <= 5);
    System.out.println(sum);
  }
}
