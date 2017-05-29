import java.util.Scanner;

public class TinhGiaiThua {
  public static void main(String arr[]) {
    int n = nhapN();
    n = tinhGiaiThua(n);
    System.out.print("Tinh: "+ n);

  }

  public static int nhapN(){
    System.out.print("Nhap 1 so bat ki : ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    return n;
  }


  public static int tinhGiaiThua(int n){
      if (n ==1)
        return 1;
      else
        return n* tinhGiaiThua(n - 1);
  }
}
