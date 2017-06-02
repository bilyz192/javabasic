public class ListBook {
  public static void main(String[] args) {

    // Call String.format with three integer codes.
    String result = String.format("One: %1$d Two: %2$d Three: %3$d",
            10, 20, 30);
    System.out.println(result);
  }
}
