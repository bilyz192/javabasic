/*
  Cau lenh IF - Else
  Vi du 3: Đoạn chương trình sau kiểm tra xem các số có
  chia hết cho 5 hay không
*/

package oop.Case_Study.Example;

class Example03 {
  public static void main(String[] args) {
    int num = 10;
    if (num % 5 == 0) {
      System.out.println(num + " chia het cho 5!");
    } else {
      System.out.println(num + " khong chia het cho 5!")
    }
  }
}
