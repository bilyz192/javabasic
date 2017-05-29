class Array{
  private int[] elements;

  /* Phương thức truy nhập các phần tử của mảng */
  public int[] get() {
    return elements;
  }

  public void set(int[] elements) {
    this.elements = elements;
  }

  /* Phương thức săp xếp */
  public void sort() {
    quick (0, elements.length-1);
  }

  /* Phương thức sắp xếp nhanh */
  private void quick(int lef, int right) {
    int i = lef, j = right;
    int pivot = (lef+right)/2, tmp;
    do {
      while (elements[i] < elements[pivot]) {

      }
    }
  }
}
