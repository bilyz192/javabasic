import java.util.Scanner;

public class Array {
  public static void main (String args[]) {
    System.out.print("Nhập vào một dãy số nguyên có n phần tử : ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int [] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Phan tu " + i +" : ");
      int a= input.nextInt();
      arr[i] = a;
    }
    System.out.print(arr[0]);
  }

}