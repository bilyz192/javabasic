/*
  Khai báo nạp chồng phương thức show() của lớp Example09 mà không dùng
  lại phương thức show() của lớp Example04 nữa.
*/

class Example09 extends Example04 {
  public float salary;
  // phuong thuc khoi? dung
  public Example09(String name, int age, float salary) {
    super(name, age);
    this.salary = salary;
  }
  public void show() {
    System.out.println("Name: " + name + "\nage: " + age + "\nsalary : " + salary
      + " $/month " );
  }

}

