// Revrese the sentenbce 
import java.util.*;
public class TCS_NQT_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String words [] = str.split(" ");
    String result ="";
    for(String word : words){
      String rev ="";
      for(int i =word.length()-1;i>=0;i--){
        rev+=word.charAt(i);
      }
      result+=rev+" ";
    }
    System.out.println(result.trim());
  }
  
}
