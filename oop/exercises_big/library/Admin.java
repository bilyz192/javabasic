import java.util.*;
import java.io.*;

class Admin extends Book {
  public static boolean ck = true;

  public static void editBooks(ArrayList<Book> arr) {
    Scanner input = new Scanner(System.in);
    System.out.print("Bạn muốn sửa thông tin Sách nào? \n - Search Book: ");
    System.out.print(" - Search Book: ");
    String a =  input.nextLine();
    for (int i = 0; i < arr.size(); i++) {

      if (arr.get(i).getIsbn().equals(a)) {

        System.out.print("Mã Sách :");
        String isbn = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setIsbn(arr.get(i).getIsbn());
        } else {
          arr.get(i).setIsbn(isbn);
        }

        System.out.print("Tên Sách :");
        String title = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setTitle(arr.get(i).getTitle());
        } else {
          arr.get(i).setTitle(title);
        }


        System.out.print("Chủ Đề :");
        String subject = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setSubject(arr.get(i).getSubject());
        } else {
          arr.get(i).setSubject(subject);
        }

        System.out.print("Tác Giả :");
        String author = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setAuthor(arr.get(i).getAuthor());
        } else {
          arr.get(i).setAuthor(author);
        }

        System.out.print("Nhà Xuất Bản :");
        String publisher = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setPublisher(arr.get(i).getPublisher());
        } else {
          arr.get(i).setPublisher(publisher);
        }

        System.out.print("Ngày Xuất Bản (dd-mm-yy):");
        String date = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setDate(arr.get(i).getDate());
        } else {
          arr.get(i).setDate(date);
        }

        System.out.print("Số Trang :");
        String pages = input.nextLine().trim();

        if (isbn.length() == 0 ) {
          arr.get(i).setPages(arr.get(i).getPages());
        } else {
          arr.get(i).setPages(Integer.parseInt(pages));
        }

        System.out.print("Số Bản Copy :");
        String copies = input.nextLine().trim();
        if (isbn.length() == 0 ) {
          arr.get(i).setCopies(arr.get(i).getCopies());
        } else {
          arr.get(i).setCopies(Integer.parseInt(copies));
        }
      }
    }
  }

  public static boolean checkList(ArrayList<Book> arr) {
    if (arr.size() != 0) {

      return true;
    }
    return false;
  }

/*  public static boolean checkSearch(ArrayList<Book> arr, String a) {
    if (arr.size() != 0) {
      for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).getIsbn().equals(a) || arr.get(i).getTitle().equals(a) || arr.get(i).getAuthor().equals(a)) {
          return true;
        }
      }
    }
    return false;
  }*/

  public static void search(ArrayList<Book> arr, String a) {
    if (arr.size() != 0) {
      System.out.println("|----------------------------------Danh Sach-----------------------------------|");
      System.out.println("|------------------------------------------------------------------------------|");
      System.out.println("| Mã Sách |  Tên Sách  |   Chủ Đề   |   Tác Giả  | Nhà Xuất Bản | Năm Xuất Bản |");
      System.out.println("|------------------------------------------------------------------------------|");

      for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).getIsbn().equals(a) || arr.get(i).getTitle().equals(a) || arr.get(i).getAuthor().equals(a)) {
          System.out.println(String.format("|%-8s |%-11s |%-11s |%-11s |%-13s |%-14s|" , arr.get(i).getIsbn(), arr.get(i).getTitle(), arr.get(i).getSubject(), arr.get(i).getAuthor(), arr.get(i).getPublisher(), arr.get(i).getDate()));
          System.out.println("|------------------------------------------------------------------------------|");
        }
      }
    }
  }

  public static void deleteBooks(ArrayList<Book> arr) {
    Scanner input = new Scanner(System.in);
    System.out.print("Bạn muốn xóa Sách nào? \n - Search Book: ");
    String a =  input.nextLine();
  /*  boolean search = checkSearch(arr, a);
    if (search == false) {
      System.out.println("Khong tim thay!");
    } else {
      for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).getIsbn().equals(a)) {
          System.out.print("Ban muon xoa Sach \"" + arr.get(i).getTitle() + "\" chu? (Y/n): ");
          String y = input.next();
          if (y.equals("y") || y.equals("Y")) {
            arr.remove(i);
            System.out.println("Ban da xoa Sach \"" + arr.get(i).getTitle() + "\" Thanh cong");
          } else {
            System.out.println("Huy? Quay tro? ve menu!");
          }
        }
      }
    }*/


  }

  public static void showList(ArrayList<Book> arr) {
    System.out.println("|----------------------------------Danh Sach-----------------------------------|");
    System.out.println("|------------------------------------------------------------------------------|");
    System.out.println("| Mã Sách |  Tên Sách  |   Chủ Đề   |   Tác Giả  | Nha Xuat Ban | Nam Xuat Ban |");
    System.out.println("|------------------------------------------------------------------------------|");
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(String.format("|%-8.8s |%-11.11s |%-11.11s |%-11.11s |%-13.13s |%-14.14s|" , arr.get(i).getIsbn(), arr.get(i).getTitle(), arr.get(i).getSubject(), arr.get(i).getAuthor(), arr.get(i).getPublisher(), arr.get(i).getDate()));
      System.out.println("|------------------------------------------------------------------------------|");
    }
  }

  public static ArrayList<Book> arr = new ArrayList<Book>();
  public static Scanner input = new Scanner(System.in);

  public static ArrayList<Book> createBooks() {
    Book a = new Book();

    System.out.print("Mã Sách :");
    String isbn = input.nextLine();
    a.setIsbn(isbn);

    System.out.print("Tên Sách :");
    String title = input.nextLine();
    a.setTitle(title);

    System.out.print("Chủ Đề :");
    String subject = input.nextLine();
    a.setSubject(subject);

    System.out.print("Tác Giả :");
    String author = input.nextLine();
    a.setAuthor(author);

    System.out.print("Nhà Xuất Bản :");
    String publisher = input.nextLine();
    a.setPublisher(publisher);

    System.out.print("Ngày Xuất Bản (dd-mm-yy):");
    String date = input.nextLine();
    a.setDate(date);

    System.out.print("Số Trang :");
    String pages = input.nextLine();
    a.setPages(Integer.parseInt(pages));

    System.out.print("Số Bản Copy :");
    String copies = input.nextLine();
    a.setCopies(Integer.parseInt(copies));
    System.out.println();

    arr.add(a);
    check();
    return arr;
  }

  public static void check() {
    System.out.print("Bạn có muốn nhập nữa không? (Y/n): ");
    Scanner input = new Scanner(System.in);
    String y = input.next();
    System.out.println();
    if (y.equals("y") || y.equals("Y")) {
      createBooks();
    }
  }

}

