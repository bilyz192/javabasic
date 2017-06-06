import java.util.*;

public class Menu {
  public static ArrayList<Student> arrayStudent = new ArrayList();

  public static void main(String[] args) {
    while (true) {
      menu();
      int option = option();
      if (option == 6) {
        System.out.println("  Hẹn gặp lại lần sau!\n");
        break;
      }
      showFunction(option);
    }
  }

  public static void menu() {
    System.out.println("|----------Quản lý Sinh Viên----------|");
    System.out.println("|                                     |");
    System.out.println("|    1. Thêm Sinh Viên                |");
    System.out.println("|    2. Xóa Sinh Viên                 |");
    System.out.println("|    3. Tìm Kiếm Sinh Viên            |");
    System.out.println("|    4. Danh Sách Sinh Viên           |");
    System.out.println("|    5. Sắp Xếp Danh Sách Sinh Viên   |");
    System.out.println("|    6. Exit                          |");
    System.out.println("|-------------------------------------|");
  }

  public static void menuDelete() {
    System.out.println("|--------------------Delete--------------------|");
    System.out.println("|                                              |");
    System.out.println("|  Bạn muốn xóa Sinh Viên nào?                 |");
    System.out.println("|    1. Xóa Sinh Viên theo số thứ tự           |");
    System.out.println("|    2. Xóa Mã Sinh Viên hoặc Tên Sinh Viên    |");
    System.out.println("|    3. Quay trở về Menu chính                 |");
    System.out.println("|----------------------------------------------|");
  }

  public static void menuSort() {
    System.out.println("|---------------------Sort---------------------|");
    System.out.println("|                                              |");
    System.out.println("|  Bạn muốn Sắp Xếp Danh Sách Sinh Viên        |");
    System.out.println("|    1. Sắp Xếp Danh Sách theo Mã Sinh Viên    |");
    System.out.println("|    2. Sắp Xếp Danh Sách theo Tên Sinh Viên   |");
    System.out.println("|    3. Quay trở về Menu chính                 |");
    System.out.println("|----------------------------------------------|");
  }

  public static int option() {
    Scanner input = new Scanner(System.in);
    System.out.print("Lựa chọn Menu: ");
    int option = input.nextInt();
    System.out.println();
    return option;
  }

  public static int options() {
    Scanner input = new Scanner(System.in);
    System.out.print("Lựa chọn Menu: ");
    int options = input.nextInt();
    System.out.println();
    return options;
  }

  public static Function function = new Function();
  public static boolean checklist = function.checkList(arrayStudent);

  public static void showFunction(int option) {
    switch (option) {
      case 1: System.out.println("Thêm Sinh Viên\n");
        arrayStudent = function.addStudent();
        checklist = function.checkList(arrayStudent);
        break;
      case 2: System.out.println("Xóa Sinh Viên\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để xóa cả ^_~\n");
        } else {
          while (checklist == true) {
            menuDelete();
            int optionDelete = options();
            if (optionDelete == 3) {
              System.out.println(" Bạn đã quay trở về Menu!\n");
              break;
            }
            showOptionDelete(optionDelete);
          }
        }
        break;
      case 3: System.out.println("Tìm Kiếm Sinh Viên\n");
        if (checklist == false) {
          checklist = function.checkList(arrayStudent);
          System.out.println("Danh sách chưa có gì để tìm kiếm cả ^_~\n");
        } else {
          function.showList(arrayStudent);
          Scanner input = new Scanner(System.in);
          System.out.print("Search: ");
          String search = input.nextLine();
          function.search(arrayStudent, search);
        }
        break;
      case 4: System.out.println("Danh Sách Sinh Viên\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để xem cả ^_~\n");
        } else {
          function.showList(arrayStudent);
        }

        break;
      case 5: System.out.println("Sắp Xếp Danh Sách Sinh Viên\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để Sắp Xếp cả ^_~\n");
        } else {
          while (checklist == true) {
            menuSort();
            int optionSort = options();
            if (optionSort == 3) {
              System.out.println(" Bạn đã quay trở về Menu!\n");
              break;
            }
            showOptionSort(optionSort);
          }
        }
        break;
      default:
        System.out.println("Chọn lại đi!!\n");
    }
  }

  public static void showOptionDelete(int optionDelete) {
    switch(optionDelete) {
      case 1: System.out.println("Xóa Sinh Viên theo số thứ tự");
        function.showList(arrayStudent);
        function.removeLocation(arrayStudent);
        function.showList(arrayStudent);
        checklist = function.checkList(arrayStudent);
        System.out.print("Bạn có muốn tiếp tục thực hiện chức năng này nữa không (Y/n)");
        boolean checks = function.check();
        if (checklist == true) {
          if (checks == true) {
            function.removeLocation(arrayStudent);
            function.showList(arrayStudent);
          }
        } else
          System.out.println("Danh sách chưa có gì để xóa cả ^_~\n");


        break;
      case 2: System.out.println("Xóa Mã Sinh Viên hoặc Tên Sinh Viên ");
        function.showList(arrayStudent);
        function.removeStudent(arrayStudent);
        function.showList(arrayStudent);
        checklist = function.checkList(arrayStudent);
        System.out.print("Bạn có muốn tiếp tục thực hiện chức năng này nữa không (Y/n)");
        boolean check = function.check();
        if (checklist == true) {
          if (check == true) {
            function.removeStudent(arrayStudent);
            function.showList(arrayStudent);
          }
        } else
          System.out.println("Danh sách chưa có gì để xóa cả ^_~\n");


        break;

      default:
        System.out.println("Chọn lại đi!!\n");
    }
  }
  public static void showOptionSort(int optionSort) {
    switch(optionSort) {
      case 1: System.out.println("Sắp Xếp Danh Sách theo Mã Sinh Viên");
        function.sortID(arrayStudent);
        break;
      case 2: System.out.println("Sắp Xếp Danh Sách theo Tên Sinh Viên ");
        function.sortName(arrayStudent);
        break;
      default:
        System.out.println("Chọn lại đi!!\n");
    }
  }
}
