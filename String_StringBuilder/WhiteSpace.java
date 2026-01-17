/*
 * Remove all white spaces from a string.
Check if two strings are anagrams (same characters, different order).
// Find the first non-repeating character in a string.
Change case — convert uppercase → lowercase and vice versa.
Find the length of a string without using .length().
Compare two strings lexicographically without using .compareTo().
 */
import java.util.Scanner;
public class WhiteSpace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String str = sc.nextLine();
    str = str.toLowerCase();
    System.out.println(str);
    String result = " ";
    for(int i =0;i<str.length();i++){
      char ch =str.charAt(i);
      if(ch!=' '){
        result=result+ch;
      }
    }
    System.out.println(result);

  }
  
}
