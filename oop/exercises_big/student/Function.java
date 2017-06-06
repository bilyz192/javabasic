import java.util.*;
import java.io.*;

public class Function extends Student {
  public static void main(String[] args) {
    ArrayList<Student> arrayStudent = addStudent();
    ArrayList<Student> arrayStudent2 = writeFile(arrayStudent);
    showList(arrayStudent);
    sortID(arrayStudent);
  }
  public static ArrayList<Student> arrayStudent = new ArrayList<Student>();
  public static Scanner input = new Scanner(System.in);
  public static ArrayList<Student> addStudent() {
    Student sv = new Student();

    System.out.print("Mã Sinh Viên :");
    String id = input.nextLine();
    boolean checkid = checkSearch(arrayStudent, id);
    while (checkid == true) {
      System.out.println("Mã Sinh Viên "+ id + " đã tồn tại!");
      System.out.println();
      System.out.print("Xin vui lòng bạn nhập lại\n Mã Sinh Viên :");
      id = input.nextLine();
      checkid = checkSearch(arrayStudent, id);
    }
    sv.setId(id);

    System.out.print("Họ Và Tên :");
    String name = input.nextLine();
    sv.setName(name);

    System.out.print("Ngày Sinh:");
    String birthday = input.nextLine();
    sv.setBirthday(birthday);

    System.out.print("Giới Tính :");
    String sex = input.nextLine();
    sv.setSex(sex);

    System.out.print("Tên Lớp :");
    String className = input.nextLine();
    sv.setClassName(className);

    System.out.print("Khóa :");
    String lock = input.nextLine();
    sv.setLock(lock);

    arrayStudent.add(sv);
    System.out.print("Bạn có muốn nhập nữa không? (Y/n): ");
    boolean check = check();
    if (check == true) {
      addStudent();
    }
    return arrayStudent;
  }

  public static ArrayList<Student> writeFile(ArrayList<Student> arrayStudent) {
    try {
      FileOutputStream fileStudent = new FileOutputStream("sinhvien.dat");
      ObjectOutputStream ofjectStudent = new ObjectOutputStream(fileStudent); // Sử dụng để ghi file theo từng Object
      ofjectStudent.writeObject(arrayStudent); // Ghi  Object là đối tượng x xuống file
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
      // Logger.getLogger("Fucking Logger").log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    //Đọc dữ liệu từ file, lấy các object ra rồi gán vào Student

    ArrayList<Student> arrayStudent2 = new ArrayList(); // Khai báo 1 đối tượng ArrayList thứ 2, các phần tử tạo ra từ lớp Student
    //Dùng để lưu dữ liệu riêng khi ta đọc file!
    try {
      FileInputStream fileStudent2 = new FileInputStream("sinhvien.dat");
      ObjectInputStream ofjectStudent2 = new ObjectInputStream(fileStudent2); // Sử dụng để đọc file theo từng Object
      arrayStudent2 = (ArrayList<Student>) ofjectStudent2.readObject(); //Ép kiểu đối tượng lấy từ file ra về dạng ArrayList<Student>
      ofjectStudent2.close();
      fileStudent2.close();
    } catch (IOException io) {
      System.out.println("Có lỗi xảy ra!");
    } catch (ClassNotFoundException ex) {
      System.out.println("Không tìm thấy class");
    }
    return arrayStudent2;
  }

  public static void search(ArrayList<Student> arrayStudent, String keyword) {
    boolean check = checkList(arrayStudent);
    if (check == true) {
      boolean search = checkSearch(arrayStudent, keyword);
      if (search == false) {
        System.out.println("Khong tim thay!");
      } else {
        System.out.println("|----------------------------------Danh Sách-----------------------------------|");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("| STT | Mã SV |    Tên Sinh Viên    |  Ngày Sinh  | Giới Tính | Tên Lớp | Khóa |");
        System.out.println("|------------------------------------------------------------------------------|");
        for (int i = 0; i < arrayStudent.size(); i++) {
          if (arrayStudent.get(i).getId().equals(keyword) || arrayStudent.get(i).getName().equals(keyword)) {
            System.out.println(String.format("| %-3.3s | %-5.5s | %-19.19s | %-12.12s | %-8.8s | %-7.7s | %-5.5s|" , i+1, arrayStudent.get(i).getId(), arrayStudent.get(i).getName(), arrayStudent.get(i).getBirthday(), arrayStudent.get(i).getSex(),arrayStudent.get(i).getClassName(),arrayStudent.get(i).getLock()));
          System.out.println("|------------------------------------------------------------------------------|");
          }

        }
      }
    }else
      System.out.println("Danh sách không có gì để hiển thị cả!");
  }

  public static void removeStudent(ArrayList<Student> arrayStudent) {
    Scanner input = new Scanner(System.in);
    System.out.print("Bạn muốn xóa Sinh Viên nào? \n - Search: ");
    String keyword =  input.nextLine();
    boolean search = checkSearch(arrayStudent, keyword);
    if (search == false) {
      System.out.println("Khong tim thay!");
    } else {
      for (int i = 0; i < arrayStudent.size(); i++) {
        if (arrayStudent.get(i).getId().equals(keyword) || arrayStudent.get(i).getName().equals(keyword)) {
          System.out.print("Bạn muốn xóa \"" + keyword + "\" chứ? (Y/n): ");
          String y = input.next();
          if (y.equals("y") || y.equals("Y")) {
            arrayStudent.remove(i);
            System.out.println("Bạn đã xóa \"" + keyword + "\" Thành công");
          } else {
            System.out.println("Hủy! Quay trở về Menu.");
          }
        }
      }
    }
  }

  public static void removeLocation(ArrayList<Student> arrayStudent) {
    Scanner input = new Scanner(System.in);
    System.out.print("Bạn muốn xóa Sinh Viên nào? \n - Nhập theo STT: ");
    int keyword =  input.nextInt();
    if (keyword < 0) {
      System.out.println("Bạn nhập số thứ tự không hợp lệ! \n");
    } else {
      for (int i = 0; i < arrayStudent.size(); i++) {
        if (i == keyword -1) {
          System.out.print("Bạn muốn xóa Sinh Viên thứ \"" + keyword + "\" chứ? (Y/n): ");
          String y = input.next();
          if (y.equals("y") || y.equals("Y")) {
            arrayStudent.remove(i);
            System.out.println("Bạn đã xóa Sinh Viên thứ \"" + keyword + "\" Thành công");
          } else {
            System.out.println("Hủy! Quay trở về Menu.");
          }
        }
      }

    }
  }

  public static void showList(ArrayList<Student> arrayStudent) {
    boolean check = checkList(arrayStudent);
    if (check == true) {
      System.out.println("|----------------------------------Danh Sach-----------------------------------|");
      System.out.println("|------------------------------------------------------------------------------|");
      System.out.println("| STT | Mã SV |    Tên Sinh Viên    |  Ngày Sinh  | Giới Tính | Tên Lớp | Khóa |");
      System.out.println("|------------------------------------------------------------------------------|");
      for (int i = 0; i < arrayStudent.size(); i++) {
        System.out.println(String.format("| %-3.3s | %-5.5s | %-19.19s | %-11.11s | %-9.9s | %-7.7s | %-5.5s|" , i+1, arrayStudent.get(i).getId(), arrayStudent.get(i).getName(), arrayStudent.get(i).getBirthday(), arrayStudent.get(i).getSex(),arrayStudent.get(i).getClassName(),arrayStudent.get(i).getLock()));
        System.out.println("|------------------------------------------------------------------------------|");
      }
    } else
      System.out.println("Danh sách không có gì để hiển thị cả!");
  }


  public static void sortName(ArrayList<Student> arrayStudent) {
    Collections.sort(arrayStudent, new StudentComparatorName());
    showList(arrayStudent);
  }

  public static void sortID(ArrayList<Student> arrayStudent) {
    Collections.sort(arrayStudent, new StudentComparatorID());
    showList(arrayStudent);
  }

  public static boolean checkList(ArrayList<Student> arr) {
    if (arrayStudent.size() != 0) {

      return true;
    }
    return false;
  }

  public static boolean checkSearch(ArrayList<Student> arr, String keyword) {
    for (int i = 0; i < arrayStudent.size(); i++) {

      if (arrayStudent.get(i).getId().equals(keyword) || arrayStudent.get(i).getName().equals(keyword)) {
        return true;
      }
    }
    return false;
  }

  public static boolean check() {

    Scanner input = new Scanner(System.in);
    String y = input.next();
    System.out.println();
    if (y.equals("y") || y.equals("Y")) {
      return true;
    }
    return false;
  }

}
