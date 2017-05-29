/*
  khai báo lớp về loài mèo (Example17) kế thừa từ lớp Example15.
  Lớp này cài đặt chi tiết hai phương thức đã được khai báo trong lớp Example15:
  phương thức getName() sẽ trả về tên loài là “Cat”;;
  phương thức getFeet() trả về số chân của loài mèo là 4.
*/

public class Example17 extends Example15{
  // tra ve ten loai chim
  public String getName() {
    return "Cat";
  }

  //tra ve so chan loai chim
  public int getFeet() {
    return 4;
  }
}
