/*
  Dùng lớp Example04 mà chúng ta vừa định nghĩa trong chương trình.
  Chương trình này sẽ tạo ra một đối tượng myExample của lớp Example04 với các
  thuộc tính có giá trị khởi tạo: name = ”Minh” và age = ”21”.
  Sau đó, chương trình sử dụng phương thức show() của đối tượng myExample04
  để in ra dòng thông báo “Minh is 21 years old!”.
*/

class Example08 {
  public static void main(String[] args) {
    Example07 myExample07 = new Example07("Hung", 22, 300f);
    myExample07.show();
  }
}
