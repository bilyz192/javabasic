public class MyQueu{
  private Node[] values;

  /* Các phương thức khởi dựng */
  public MyQueu(){

  }
  public MyQueu(Node[] values) {
   this.values = values;
  }

  /* Phương thức lấy ra một node từ đầu queu */
  public Node remove() {
   Node result = null;
    if((values != null)&&(values.length > 0)){
      result = values[0];

    // Loại bỏ node đầu hàng đợi
      Node[] tmpNode = new Node[values.length - 1];
      for(int i=0; i<values.length – 1; i++)
        tmpNode[i] = values[i+1];
      this.values = tmpNode;
    }
    return result;
  }

  /* Phương thức thêm một node vào cuối queu */
  public void insert(Node node) {
    if(values == null) { // Hàng đợi đang rỗng
      values = new Node[1];
      values[0] = node;
    } else {
      // Hàng đợi đã có dữ liệu
      Node[] tmpNode = new Node[values.length + 1];
      for(int i=0; i<values.length; i++)
      85tmpNode[i] = values[i];
      tmpNode[values.length] = node;
      this.values = tmpNode;
    }
  }
}
