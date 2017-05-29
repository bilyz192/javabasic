/*
  For inputString = "aabaa", the output should be
  checkPalindrome(inputString) = true;
  For inputString = "abac", the output should be
  checkPalindrome(inputString) = false;
  For inputString = "a", the output should be
  checkPalindrome(inputString) = true.

*/

import java.util.Scanner;

public class Exercise21 {
  public static void main(String[] args) {
    String s = "aabaa";
    boolean ch = kt(s);
    System.out.print(ch);

  }

  public static boolean kt(String s) {
    int sLen = s.length();
    for (int i = 0;i < sLen/2 ; i++) {
      if (s.charAt(i) != s.charAt(sLen-i-1))
        return false;
    }
    return true;
  }
}
