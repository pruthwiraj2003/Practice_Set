import java.util.Scanner;
public class MaximumPices {
  static int MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of pecises ");
    int n=sc.nextInt();
    System.out.println(maxpic(n));
    
  }
  static long maxpic(int n){
    long N=n;
    long pieces =(n*(n+1)/2)+1;
    return pieces%MOD;
  }
  
}
