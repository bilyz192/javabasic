class Employee extends Person {
  private float salary;
  // Phương thức khởi dựng không có tham số
  public Employee() {
    super();
    salary = 0f;
  }

  // Phương thức khởi dựng có tham số
  public Employee(String name, int age, float salary) {
    super(name, age);
    this.salary = salary;
  }

  /* Phương thức truy nhập thuộc tính salarry */
  public float getSalary() {
   return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  // Khai báo nạp chồng
  public void show() {
    System.out.println( getName() + " is " + getAge()
    + " years old having a salary of $ "
    + salary + "/month!");
  }

  /* Phương thức tăng lương */
  public void addSalary() {
    salary = salary*1.1f;
  }

  public void addSalary(float addition) {
    salary += addition;
  }
}
