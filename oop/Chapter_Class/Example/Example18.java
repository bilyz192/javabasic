/*
  sử dụng lại hai lớp Bird và Cat trong các chương trình Example16 và Example17.
  Chương trình này sẽ hiển thị hai dòng thông báo:
  The Bird has 2 feets
  The Cat has 4 feets
*/

public class Example18 {
  public static void main(String[] args) {
    Example16 myBrid = new Example16();
    System.out.println("The " + myBrid.getName() + " has " +
    myBrid.getFeet() + " feet");

    Example17 myCat = new Example17();
    System.out.println("The " + myCat.getName() + " has " +
    myCat.getFeet() + " feet");
  }
}
