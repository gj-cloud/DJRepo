import java.util.Arrays;
import java.util.Scanner;

class strin{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Str1: ");
    String str1 = input.nextLine();
    System.out.print("Str2: ");
    String str2 = input.nextLine();
    if(str1.length() == str2.length()) {
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println( "str1 and str2 are anagram.");
      }
      else {
        System.out.println("str1 and str2 are not anagram.");
      }
    }
    else {
      System.out.println("str1 and str2 are not anagram.");
    }
  }
}