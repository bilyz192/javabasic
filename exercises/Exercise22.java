/*
  Trăm trâu trăm cỏ
  Trâu đứng ăn năm
  Trâu nằm ăn ba
  Trâu già ba con một bó.
  Hỏi có bao nhiêu con mỗi loại?
*/

import java.util.Scanner;

public class Exercise22 {
  public static void main(String[] args) {
    gaiBaiToan();
  }



  public static void gaiBaiToan() {
    for (float x = 1; x<=20; x++) {
      for (float y = 1; y<=33; y++) {
        float z = 100-x-y;
        if (5*x + 3*y + z/3 == 100) {
          System.out.println("So trau dung = "+ x);
          System.out.println("So trau nam = " + y);
          System.out.println("So trau gia = " + z);
          System.out.println();
        }

      }
    }


  }


}
