/*
  Tạo bảng số dạng sau:
  0  1  2  3  4  5  6  7  8  9
  10 11 12 13 14 15 16 17 18 19
.....................................
*/

import java.util.Scanner;

public class Exercise23 {
  public static void main(String[] args) {
    System.out.print("Nhap 1 so bat ki:");
    int n = nhapN();
    int[][] arr =  taoBang(n);
    hienThiArray(arr);

  }

  public static int nhapN() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    return n;
  }

  public static int[][] taoBang(int n) {

    int dong = n/10;
    int cot = n/dong;
    int[][] arr = new int[dong][cot];
    int i = 0;
    for (int d = 0; d < dong; d++) {
      for (int c = 0; c < cot; c++) {
        arr[d][c] = i;
        i++;
      }
    }
    return arr;
  }

  public static void hienThiArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++ ) {
      for (int j = 0; j < arr[i].length; j++ ) {
        System.out.print(arr[i][j]+ " ");
      }
      System.out.print("\n");
    }
  }
}
