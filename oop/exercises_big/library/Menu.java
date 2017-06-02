import java.util.*;

class Menu {
  public static boolean isLoggedIn = false;
  public static ArrayList<Book> a = new ArrayList();

  public static void main(String[] args) {
    while (true) {
      while (isLoggedIn == true) {
        menuAdmin();
        int option = option();
        if (option == 5) {
          System.out.println("  Bạn đăng xuất rồi đấy !\n");
          isLoggedIn = false;
          break;
        }
        showFunctionAdmin(option);
      }

      menu();
      int option = option();
      if (option == 5) {
        System.out.println("  Hẹn gặp lại lần sau!\n");
        break;
      }
      showFunction(option);
    }
  }

  public static void menu() {
    System.out.println("|----------Quản lý thư viện----------|");
    System.out.println("|                                    |");
    System.out.println("|       1. Danh sách                 |");
    System.out.println("|       2. Tìm kiếm Sách             |");
    System.out.println("|       3. Đăng nhập                 |");
    System.out.println("|       4. Đăng kí                   |");
    System.out.println("|       5. Thoát                     |");
    System.out.println("|------------------------------------|");
  }

  public static void menuAdmin() {
    System.out.println("|----------------Menu----------------|");
    System.out.println("|                                    |");
    System.out.println("|       1. Tạo mới                   |");
    System.out.println("|       2. Sửa thông tin             |");
    System.out.println("|       3. Xóa                       |");
    System.out.println("|       4. Hiển thị danh sách        |");
    System.out.println("|       5. Đăng Xuất                 |");
    System.out.println("|                                    |");
    System.out.println("|------------------------------------|");
  }

  public static int option() {
    Scanner input = new Scanner(System.in);
    System.out.print("Lựa chọn Menu: ");
    int option = input.nextInt();
    System.out.println();
    return option;
  }

  public static Admin add = new Admin();
  public static boolean checklist = add.checkList(a);

  public static void showFunction(int option) {
    switch (option) {
      case 1: System.out.println("Danh sách Book\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để xem cả ^_~\n");
        } else {
          add.showList(a);
        }
      break;
      case 2: System.out.println("Tim kiem sach\n");
        if (checklist == false) {
          checklist = add.checkList(a);
          System.out.println("Danh sách chưa có gì để tìm kiếm cả ^_~\n");
        } else {
          add.showList(a);
          Scanner input = new Scanner(System.in);
          System.out.print("Search Book: ");
          String search = input.nextLine();
          add.search(a, search);
        }
        /*if (checklist == true) {
          add.show(a);
          Scanner input = new Scanner(System.in);
          System.out.print("Search: ");
          String timkiem = input.nextLine();
          add.search(a, timkiem);
          boolean tim = add.search(a, timkiem);
          if (tim == false) {
            System.out.println("Khong tim thay!");
          }
        } else {
          checklist = add.checkList(a);
          System.out.println("Danh sach chua co gi de tim kiem ca");
        }*/

      break;
      case 3: System.out.println("Đăng nhập \n");
        Login logins = new Login();
        isLoggedIn = logins.checkLogin();
        break;
      case 4: System.out.println("Đăng kí ");
        break;
      default:
        System.out.println("Chọn lại đi!!\n");
    }
  }

  public static void showFunctionAdmin(int option) {
    switch (option) {
      case 1: System.out.println("Tạo mới\n");
        a = add.createBooks();
        checklist = add.checkList(a);
        break;

      case 2: System.out.println("Sửa thông tin Sách\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để sửa cả ^_~\n");
        } else {
          add.showList(a);
          add.editBooks(a);
        }
        break;

      case 3: System.out.println("Xóa thông tin Sách\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để xóa cả ^_~\n");
        } else {
          add.showList(a);
          add.deleteBooks(a);
          add.showList(a);
        }
        break;

      case 4: System.out.println("Hiển thị danh sách\n");
        if (checklist == false) {
          System.out.println("Danh sách chưa có gì để xem cả ^_~\n");
        } else {
          add.showList(a);
        }
        break;

      default:
        System.out.println("Chọn lại đi!!\n");
    }
  }
}
