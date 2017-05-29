class Array {
  private int[] elements;

  /* Phương thức truy nhập các phần tử của mảng */
  public int[] get() {
    return elements;
  }

  public void set (int[] elements) {
    this.elements = elements;
  }

  /* Phương thức săp xếp */
  public void sort() {
    quick (0, elements.length - 1);
  }

  /* Phương thức sắp xếp nhanh */
  private void quick(int left, int right) {
    int i=left, j=right;
    int pivot=(left+right)/2, tmp;
    do {
      while(elements[i]<elements[pivot] && i<right)
        i++;// Quét xuôi
      while(elements[j]>elements[pivot] && j>left)
        j++;// Quét ngược
      if(i<=j){
        // Quét ngược
        // Đổi chỗ hai phần tử
        tmp = elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
      }
    } while (i<=j);
    if(left < j) quick(left, j); // Sắp xếp đoạn trước chốt
    if(i < right) quick(i, right); // Sắp xếp đoạn sau chốt
  }
}
