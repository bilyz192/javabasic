import java.util.Scanner;

class MenuAdmin {
  public static void show() {
    while (true) {
      menu();
      int lc = luachon();

      if (lc == 5) {
        break;
      }

      function(lc);
    }
  }

  public static void menu() {
    System.out.println("|----------------Menu----------------|");
    System.out.println("|                                    |");
    System.out.println("|       1. Tao moi                   |");
    System.out.println("|       2. Sua                       |");
    System.out.println("|       3. Xoa                       |");
    System.out.println("|       4. Hien thi                  |");
    System.out.println("|       5. Dang Xuat                 |");
    System.out.println("|                                    |");
    System.out.println("|------------------------------------|");
  }

  public static int luachon() {
    Scanner input = new Scanner(System.in);
    int lc = input.nextInt();
    return lc;
  }

  public static void function(int lc) {
    switch (lc) {
      case 1: System.out.println("Tao moi");

      break;
      case 2: System.out.println("Sua");
      break;
      case 3: System.out.println("Xoa");
      break;
      case 4: System.out.println("HienThi");
      break;
      default:
        System.out.println("Lua Chon lai di!!");
    }
  }
}
