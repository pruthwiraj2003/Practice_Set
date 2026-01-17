// Find the sum of digits of a number using recursion.
public class Sum_of_Digit {
  public static void main(String[] args) {
    System.out.println(SumofDigits(123));
    
  }
  static int SumofDigits(int n){
    
    if(n ==0 ){
      return 0;
    }
    return (n%10)+SumofDigits(n/10);
  }
}

