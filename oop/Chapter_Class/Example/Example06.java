/*
  Khai báo một lớp hoàn toàn giống với lớp được khai báo
  trong chương trình Example04, nhưng chỉ khác là có dùng biến this
  trong hàm khởi tạo của lớp.
*/

class Example06 {
  public String name;
  public int age;

  //phuong thuc khoi dung
  public Example06(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void show() {
    System.out.println(name + " is " + age + " year old!");
  }
}


