public class MyStack {
  private Node[] values;

  /* Các phương thức khởi dựng */
  public MyStack() {
  }

  public MyStack(Node[] value) {
    this.values = values;
  }

  /* Phương thức lấy ra một node từ stack */
  public Node pop() {
    Node result = null;
    if ((values != null) && (values.length > 0)) {
      result = values[values.length - 1 ];
      //Loại bỏ node cuối cùng
      Node[] tmpNode = new Node[values.length -1];
      for (int i = 0; i < values.length - 1; i++)
        tmpNode[i] = values[i];
      tmpNode[values.length] = node;
      this.values = tmpNode;
    }
  }
}
