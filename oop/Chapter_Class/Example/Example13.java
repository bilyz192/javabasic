/*
  Cài đặt một lớp Example13 cài đặt giao tiếp Example12 với các thuộc tính
  và phương thức đã được khai báo trong Example12.
*/
public class Example13 implements Example12 {
  // Cài đặt phương thức được khai báo trong giao tiếp
  public float getCost()
  {
    return 10f;
  }
  // Phương thức truy nhập nhãn hiệu sản phẩm
  public String getMark()
  {
    return MARK;
  }
  // Phương thức main
  public static void main(String args[])
  {
    Example13 myShoe = new Example13();
    System.out.println("This shoe is " + myShoe.getMark()
      + " having a cost of $" + myShoe.getCost());
  }
}
