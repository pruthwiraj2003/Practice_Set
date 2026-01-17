// Find nth Fibonacci number using recursion.
public class Fibonacci_Number {
  public static void main(String[] args) {
    System.out.println(fibo(5));
    
  }
  static int fibo(int n){
    if(n==0|| n ==1){
      return 1;
    }
    return fibo(n-1)+fibo(n-2);
  }
  
}
