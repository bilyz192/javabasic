class Person extends Human {
  private String name;
  private int age;

  // Phương thức khởi dựng không có tham số
  public Person() {
    super();
    name = "";
    age = 0;
  }

  // Phương thức khởi dựng có tham số
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /* Phương thức truy nhập thuộc tính name */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /* Phương thức truy nhập thuộc tính age */
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Khai báo nạp chồng
  public void show() {
    System.out.println( name + " is " + age + " years old!");
  }
}
