// Print 1 to n linearly 
// print from n to 1 
import java.util.Scanner;

public class LEC_2 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int i=sc.nextInt();
    int n = sc.nextInt();
    // number(i,n);
    revnumber(i,n);
    
  }
  static void number(int i,int n ){
    if(i>n){
      return ;
    }
    System.out.println(i);
    number(i+1,n);
  }
  static void revnumber(int i,int n ){
    if(i<n){
      return ;
    }
    System.out.println(i);
    revnumber(i-1,n);
  }
}
