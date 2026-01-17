// Check if a string is palindrome using recursion.

import java.util.Scanner;

public class String_Palindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(sp(str, 0, str.length()-1));
    System.out.println(Manually(str));
    
    
  }
  static boolean  sp(String str,int start,int  end){
    
    if(start>=end){
      return true;
    }

    if(str.charAt(start)!= str.charAt(end)){
      return false;
    }
    return sp(str, start+1, end-1);

  }
  static boolean  Manually(String str){
    StringBuilder sb = new StringBuilder(str);
    String rev = sb.reverse().toString();
    if(str.equals(rev)){
      return true;
    }
    return  false;

  }
}
