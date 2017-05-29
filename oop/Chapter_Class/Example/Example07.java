/*
  tạo một lớp Example07 được kế thừa từ lớp Example02
đã được xây dựng trong phần Example02
*/

class Example07 extends Example04 {
  public float salary;
  // phuong thuc khoi? dung
  public Example07(String name, int age, float salary) {
    super(name, age);
    this.salary = salary;
  }
}

