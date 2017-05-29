import java.util.Scanner;
import java.util.Arrays;

public class Array {

  public static void main(String args[]) {
    chao();
    int[] arr =  newArray();
  }

  public static int chao() {
    System.out.println("Cac thao tac ve Array : ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    do (n) {
        System.out.println("Nhap mang");
        int[] arr = newArray();
        System.out.println("Hien thi mang vua nhap");
        System.out.println("Sap Xep mang");
        System.out.println("Tinh trung binh cong cua mang");
        System.out.println("Ban nhap lai di ~~");
    }
    while (n == 6) {

    }

    return n;
  }

  public static int[] newArray() {
    int n;
    System.out.print("Nhập vào một dãy số nguyên có n phần tử : ");
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    int []arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Phan tu " + i +" : ");
      int a= input.nextInt();
      arr[i] = a;
    }

    return arr;
  }

  public static void tbcArray(int []arr) {
    float sum =0;
    for (int j =0; j < arr.length; j++) {
      sum =sum + arr[j];
    }

    System.out.print("Tb cong cua mang la : " + sum/arr.length);
  }

  public static void sortArray(int []arr) {
    Arrays.sort( arr );
    System.out.print("Mang duoc sap xep : [");
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j] +"," );
    }
    System.out.println("]");
  }

  public static void printArray(int []arr) {
    System.out.print("Mang vua nhap la : [");
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j] +"," );
    }

    System.out.println("]");
  }
}
