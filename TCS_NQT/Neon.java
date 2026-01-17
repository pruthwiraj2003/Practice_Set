import java.util.*;
public class Neon {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int sum =0;
    int sqare = n*n;
    while(sqare>0){
      int rem = sqare%10;
      sum+=rem;
      sqare/=10;
    }
    if(sum ==n){
      System.out.println("It is a NEON Number ");
    }else{
      System.out.println("It is Not a NEON Number ");
    }
  }
  
}
