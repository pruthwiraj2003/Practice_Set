import java.util.*;
public class Magic_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int sum=n;
    while(sum>9){
      int temp = sum;
      sum =0;
      while(temp>0){
        int rem =temp%10;
        sum+=rem;
        temp/=10;
      }
    }
    System.out.println(sum);
    if(sum ==1){
      System.out.println("It is a magic number");
    }else{
      System.out.println("It is not a magic number");
    }

  }
  
}
