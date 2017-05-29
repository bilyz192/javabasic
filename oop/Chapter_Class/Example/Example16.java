/*
  khai báo lớp về loài chim (Example16) kế thừa từ lớp Example15.
  Lớp này cài đặt chi tiết hai phương thức đã được khai báo trong lớp Example15:
  phương thức getName() sẽ trả về tên loài là “Bird”;
  phương thức getFeet() trả về số chân của loài chim là 2.
*/

public class Example16 extends Example15{
  // tra ve ten loai chim
  public String getName() {
    return "Bird";
  }

  //tra ve so chan loai chim
  public int getFeet() {
    return 2;
  }
}
