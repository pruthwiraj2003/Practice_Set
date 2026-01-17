// Sum of first n number using recursion
import java.util.Scanner;
public class LEC_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sum(n));
    System.out.println(fact(n));
  }
  static int sum(int n){
    if(n==1){
      return 1;
    }
    return n+sum(n-1);

  }
  static int fact(int n){
    if(n==0){
      return 1;
    }
    return n*fact(n-1);

  }
}
