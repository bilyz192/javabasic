/*
  Vong lap Switch_case
  Vi du 4:Đoạn chương trình sau xác định giá trị trong một biến nguyên và hiển thị ngày
  trong tuần được thể hiện dưới dạng chuỗi. Để kiểm tra các giá trị nằm trong
  khoảng từ 0 đến 6, chương trình sẽ thông báo lỗi nếu nằm ngoài phạm vi trên.
*/

package oop.Case_Study.Example;

class Example04 {
  public static void main(String[] args) {
    int day = 6;
    switch (day) {
      case 0: System.out.println("Chu nhat");
      break;
      case 1: System.out.println("Thu hai");
      break;
      case 2: System.out.println("Thu ba");
      break;
      case 3: System.out.println("Thu tu");
      break;
      case 4: System.out.println("Thu sau");
      break;
      case 5: System.out.println("Thu bay");
      break;
      default:
        System.out.println("Khong tim thay");
    }
  }
}
