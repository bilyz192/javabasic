import java.util.Scanner;

class Login  {
  public static boolean checkLogin() {
    String[] array =  account();
    String username = array[0];
    String password = array[1];
    boolean checklogin = login(username, password);
      return checklogin;
    /*if (check == true) {
      System.out.println("  Ban da dang nhap thanh cong ");

    } else {
      System.out.println("  Tai khoan sai roi ");
    }*/
  }

  public static String[] account() {
    Scanner input = new Scanner(System.in);
    System.out.println("----------Login----------");
    System.out.print("  UserName: ");
    String username = input.next();
    System.out.print("  Password: ");
    String password = input.next();
    System.out.println();

    return new String[]{username, password};
  }

  public static boolean login(String username, String password) {

    String user = "hungnv";
    String pass = "1";
    if (user.equals(username) && pass.equals(password)) {
      System.out.println("  Bạn đã đăng nhập thành công! \n");
      return true;
    } else
      System.out.println("  Tài khoản hoặc mật khẩu của bạn sai rồi :)) \n");

    return false;

  }
}
