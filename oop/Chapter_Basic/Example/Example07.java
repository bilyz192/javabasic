/*
  Vòng lặp for.
  Vi du 7: chương trình sau tính tổng của 5 số tự nhiên đầu tiên.
*/

package oop.Case_Study.Example;

class Example07 {
  public static void main(String[] args) {
    int i = 1;
    int a = 5;
    int sum = 0;
    for(i = 0; i <= a; i++ ) {
      sum += i;
    }
    System.out.println(sum);
  }
}

