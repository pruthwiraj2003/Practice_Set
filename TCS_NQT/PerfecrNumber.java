import java.util.Scanner;
public class PerfecrNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    for(int i =1;i<n;i++){
      if(n%i==0){
        sum = sum+i;
      }
    }
    if(sum ==n){
      System.out.println("It is a Perfect Number");

    }else{
      System.out.println("It is not a perfect number");
    }

  }
}