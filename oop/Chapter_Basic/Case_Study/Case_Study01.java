/*
  Viết một chương trình tính chu vi và diện tích
  của một hình chữ nhật có kích thước x,y với yêu cầu:
    • Kích thước x, y nhập từ tham số dòng lệnh.
    • Phải kiểm tra x, y là các số nguyên dương hay không
     trước khi tính toán.
    • In kết quả tính toán ra màn hình
*/

package oop.Case_Study.Case_Study;

class Case_Study01 {
  public static void main(String[] args) {
    // khai bao bien luu tru kich thuoc cua hinh chu nhat
    int x = 10;
    int y = 5;

    /*Doc cac bien luu tru kich thuoc cua man hinh*/
    // can phai truyen du 2 tham so
    if (args.length >= 2) {
      //chuyen kieu String sang Integer
      x = Integer.parseInt(args[0]);
      y = Integer.parseInt(args[1]);
    }

    /*Tinh chu vi va dien tich hinh chu nhat*/
    // Neu ca 2 tham so deu duong thi moi tinh
    if (x > 0 && y > 0) {
      // Tinh chu vi
      int chuvi = 2* (x + y);
      System.out.println("Chu vi la: " + chuvi);

      int dientich = x * y;
      System.out.println("Dien tich la: " + dientich);

    } else
      System.out.println("Cac tham so khong dung");

  }
}
