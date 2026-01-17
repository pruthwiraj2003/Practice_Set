/*
 * Reverse a string using:

a) Loop

b) StringBuilder.reverse()
 */

public class reverseString{
  public static void main(String[] args){
    String str = "Mahapatra";
    System.out.println(str);
    String rev="";
    for(int i =str.length()-1;i>=0;i--){
      rev = rev+str.charAt(i);
    }
    System.out.println(rev);
    revstring("Anita Das");
  }
  static void revstring(String str2){
  StringBuilder sb = new StringBuilder(str2);
  str2 = sb.reverse().toString();
  System.out.println(str2);
  }
}