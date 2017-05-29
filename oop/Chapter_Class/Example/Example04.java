/*
  Phương thức khởi tạo của lớp
  bằng cách gán giá trị cho các thuộc tính tên và tuổi.
*/

class Example04 {
  public String name;
  public int age;

  //phuong thuc khoi dung
  public Example04(String name1, int age1) {
    name = name1;
    age = age1;
  }

  public void show() {
    System.out.println(name + " is " + age + " year old!");
  }
}


