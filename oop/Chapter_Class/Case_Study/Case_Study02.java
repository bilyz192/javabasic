public class Case_Study02 {
  public static void main(String[] args) {
    // Sử dụng lớp Person
    Person myPerson = new Person("Vinh", 25);
    myPerson.show();

    // Sử dụng lớp Employee
    Employee myEmployee = new Employee("Vinh", 25, 300f);
    myEmployee.show();

    // Tăng lương theo mặc định
    myEmployee.addSalary();
    myEmployee.show();

    // Tăng lương lên $50
    myEmployee.addSalary(50f);
    myEmployee.show();
  }
}
