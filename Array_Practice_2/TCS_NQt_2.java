/*
 * iven a string, check if it reads the same backward and forward.

Example:
Input → "madam"
Output → "Palindrome"
 */
import java.util.*;
public class TCS_NQt_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 =sc.nextLine();
    String rev = "";
    for(int i =str1.length()-1;i>=0;i--){
      rev +=str1.charAt(i);
    }
    if(str1.equals(rev)){
      System.out.println("Entered string\t"+str1+"\tAfter reverse is\t "+rev);
    }else{
      System.out.println("It is not a palandrom");
    }
  }
  
}
