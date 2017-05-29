class PhoneBookEntry {
  String name;
  String phone;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Phone: " + phone);
  }
}
public class PhoneBookTestDrive {
  public static void main (String[] args) {
    PhoneBookEntry tom = new PhoneBookEntry();
    tom.name = "Tom the Cat";
    tom.phone = "84208594";
    tom.display();

    PhoneBookEntry jerry = new PhoneBookEntry();
    jerry.name = "jerry the Mouse";
    jerry.phone = "98768065";
    jerry.display();
  }

}
