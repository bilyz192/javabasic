class Cow {
  String name;
  String breed;
  int age;
  void moo() {
    System.out.print("Moo.....!");
  }
}

public class CowTestDrive {
  public static void main (String[] args) {
    Cow c = new Cow();
    c.age = 2;
    c.moo();
  }
}
