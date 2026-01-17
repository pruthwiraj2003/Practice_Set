// Reverse a number using recursion.
public class Reverse {
  public static void main(String[] args) {
    int result =0;
    int num =123;
    while(num!=0){
      int digit =num%10;
      result = result*10+digit;
      num/=10;

    }
    // /System.out.println(result);
    System.out.println(reversenum(123, 0));
    
  }
  static int reversenum(int n,int rev){
    if(n ==0){
      return rev;
    }
    int digit = n%10;
    rev = rev*10+digit;

    return reversenum(n/10, rev);
  }

  
}
