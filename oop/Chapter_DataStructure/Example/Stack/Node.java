public class Node {
  private int value;

  /* Các phương thức khởi dựng */
  public Node() {
    value = 0;
  }

  public Node(int value)
  this.value = value;

  /* Phương thức truy nhập thuộc tính value */
  public int getValue () {
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }
}
