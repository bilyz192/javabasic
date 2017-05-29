import java.util.Scanner;

public class ForExample {

  public static void main(String[] args) {

    float sum = 0;
    Scanner input = new Scanner(System.in);
    String arr[] = {"Toan", "Van", "Su", "Dia", "Hoa", "TA"};
    int i = 0;
    for (i =0 ; i < arr.length; i++ ) {
      System.out.print( "Nhap Diem mon " + arr[i] + ": ");
      float mark = input.nextFloat();
      if (mark <=10 && mark >= 0 )
      sum += mark;
      else {
        System.out.println("Diem k vuot qua 10 va khong dc nho? hon 0! ");
        break;
      }
    }

      if (i >= arr.length)
        System.out.print("Diem TB = "+ sum/arr.length);
      else
        System.out.print("Error");
  }

}
