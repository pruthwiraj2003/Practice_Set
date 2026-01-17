
import java.util.Arrays;

public class FibonacciNumbers {
  public static void main(String[] args) {
    int n =5;
    int arr[] = new int[5];
    for(int i =0;i<n;i++){
      arr[i] = fibo(i);
    }
    System.out.println(Arrays.toString(arr));
    

  }
  static int fibo(int n){
    if(n<=1) return n;
    return fibo(n-1)+fibo(n-2);
  }
}
