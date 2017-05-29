import java.util.Scanner;
public class Tb {
  public static void main(String[] args) {
    float sum = 0;
    int subjects = 6;
    Scanner input = new Scanner(System.in);
    System.out.print( "Enter the marks for "  + subjects + " subjects: ");
    for (int count = 0; count < subjects; count++) {
      float mark;
      mark = input.nextFloat();
      sum += mark; 
    }
    System.out.print("Average mark = " + sum/subjects);
  }
}